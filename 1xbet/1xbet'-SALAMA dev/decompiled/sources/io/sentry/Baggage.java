package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.SampleRateUtils;
import io.sentry.util.StringUtils;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class Baggage {
    static final String CHARSET = "UTF-8";
    static final String SENTRY_BAGGAGE_PREFIX = "sentry-";
    private final ConcurrentHashMap<String, String> keyValues;
    private final AutoClosableReentrantLock keyValuesLock;
    final ILogger logger;
    private boolean mutable;
    private Double sampleRand;
    private Double sampleRate;
    private final boolean shouldFreeze;
    private final String thirdPartyHeader;
    static final Integer MAX_BAGGAGE_STRING_LENGTH = 8192;
    static final Integer MAX_BAGGAGE_LIST_MEMBER_COUNT = 64;
    private static final DecimalFormatterThreadLocal decimalFormatter = new DecimalFormatterThreadLocal();

    public static final class DSCKeys {
        public static final String TRACE_ID = "sentry-trace_id";
        public static final String PUBLIC_KEY = "sentry-public_key";
        public static final String RELEASE = "sentry-release";
        public static final String USER_ID = "sentry-user_id";
        public static final String ENVIRONMENT = "sentry-environment";
        public static final String TRANSACTION = "sentry-transaction";
        public static final String SAMPLE_RATE = "sentry-sample_rate";
        public static final String SAMPLE_RAND = "sentry-sample_rand";
        public static final String SAMPLED = "sentry-sampled";
        public static final String REPLAY_ID = "sentry-replay_id";
        public static final List<String> ALL = Arrays.asList(TRACE_ID, PUBLIC_KEY, RELEASE, USER_ID, ENVIRONMENT, TRANSACTION, SAMPLE_RATE, SAMPLE_RAND, SAMPLED, REPLAY_ID);
    }

    public static class DecimalFormatterThreadLocal extends ThreadLocal<DecimalFormat> {
        private DecimalFormatterThreadLocal() {
        }

        @Override // java.lang.ThreadLocal
        public DecimalFormat initialValue() {
            return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
        }
    }

    public Baggage(ILogger iLogger) {
        this(new ConcurrentHashMap(), null, null, null, true, false, iLogger);
    }

    private static String decode(String str) {
        return URLDecoder.decode(str, CHARSET);
    }

    private String encode(String str) {
        return URLEncoder.encode(str, CHARSET).replaceAll("\\+", "%20");
    }

    public static Baggage fromEvent(SentryBaseEvent sentryBaseEvent, String str, SentryOptions sentryOptions) {
        Baggage baggage = new Baggage(sentryOptions.getLogger());
        SpanContext trace = sentryBaseEvent.getContexts().getTrace();
        baggage.setTraceId(trace != null ? trace.getTraceId().toString() : null);
        baggage.setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        baggage.setRelease(sentryBaseEvent.getRelease());
        baggage.setEnvironment(sentryBaseEvent.getEnvironment());
        baggage.setTransaction(str);
        baggage.setSampleRate(null);
        baggage.setSampled(null);
        baggage.setSampleRand(null);
        Object obj = sentryBaseEvent.getContexts().get("replay_id");
        if (obj != null && !obj.toString().equals(SentryId.EMPTY_ID.toString())) {
            baggage.setReplayId(obj.toString());
            sentryBaseEvent.getContexts().remove("replay_id");
        }
        baggage.freeze();
        return baggage;
    }

    public static Baggage fromHeader(String str) {
        return fromHeader(str, false, ScopesAdapter.getInstance().getOptions().getLogger());
    }

    private static boolean isHighQualityTransactionName(TransactionNameSource transactionNameSource) {
        return (transactionNameSource == null || TransactionNameSource.URL.equals(transactionNameSource)) ? false : true;
    }

    private static Double sampleRand(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampleRand();
    }

    private static Double sampleRate(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampleRate();
    }

    private static String sampleRateToString(Double d7) {
        if (SampleRateUtils.isValidTracesSampleRate(d7, false)) {
            return decimalFormatter.get().format(d7);
        }
        return null;
    }

    private static Boolean sampled(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampled();
    }

    private static Double toDouble(String str) {
        if (str != null) {
            try {
                double d7 = Double.parseDouble(str);
                if (SampleRateUtils.isValidTracesSampleRate(Double.valueOf(d7), false)) {
                    return Double.valueOf(d7);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public void forceSetSampleRate(Double d7) {
        this.sampleRate = d7;
    }

    public void freeze() {
        this.mutable = false;
    }

    public String get(String str) {
        if (str == null) {
            return null;
        }
        return this.keyValues.get(str);
    }

    public String getEnvironment() {
        return get(DSCKeys.ENVIRONMENT);
    }

    public String getPublicKey() {
        return get(DSCKeys.PUBLIC_KEY);
    }

    public String getRelease() {
        return get(DSCKeys.RELEASE);
    }

    public String getReplayId() {
        return get(DSCKeys.REPLAY_ID);
    }

    public Double getSampleRand() {
        return this.sampleRand;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public String getSampled() {
        return get(DSCKeys.SAMPLED);
    }

    public String getThirdPartyHeader() {
        return this.thirdPartyHeader;
    }

    public String getTraceId() {
        return get(DSCKeys.TRACE_ID);
    }

    public String getTransaction() {
        return get(DSCKeys.TRANSACTION);
    }

    public Map<String, Object> getUnknown() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.keyValuesLock.acquire();
        try {
            for (Map.Entry<String, String> entry : this.keyValues.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!DSCKeys.ALL.contains(key) && value != null) {
                    concurrentHashMap.put(key.replaceFirst(SENTRY_BAGGAGE_PREFIX, ""), value);
                }
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return concurrentHashMap;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String getUserId() {
        return get(DSCKeys.USER_ID);
    }

    public boolean isMutable() {
        return this.mutable;
    }

    public boolean isShouldFreeze() {
        return this.shouldFreeze;
    }

    public void set(String str, String str2) {
        if (this.mutable) {
            if (str2 == null) {
                this.keyValues.remove(str);
            } else {
                this.keyValues.put(str, str2);
            }
        }
    }

    public void setEnvironment(String str) {
        set(DSCKeys.ENVIRONMENT, str);
    }

    public void setPublicKey(String str) {
        set(DSCKeys.PUBLIC_KEY, str);
    }

    public void setRelease(String str) {
        set(DSCKeys.RELEASE, str);
    }

    public void setReplayId(String str) {
        set(DSCKeys.REPLAY_ID, str);
    }

    public void setSampleRand(Double d7) {
        if (isMutable()) {
            this.sampleRand = d7;
        }
    }

    public void setSampleRate(Double d7) {
        if (isMutable()) {
            this.sampleRate = d7;
        }
    }

    public void setSampled(String str) {
        set(DSCKeys.SAMPLED, str);
    }

    public void setTraceId(String str) {
        set(DSCKeys.TRACE_ID, str);
    }

    public void setTransaction(String str) {
        set(DSCKeys.TRANSACTION, str);
    }

    public void setUserId(String str) {
        set(DSCKeys.USER_ID, str);
    }

    public void setValuesFromSamplingDecision(TracesSamplingDecision tracesSamplingDecision) {
        if (tracesSamplingDecision == null) {
            return;
        }
        setSampled(StringUtils.toString(sampled(tracesSamplingDecision)));
        if (tracesSamplingDecision.getSampleRand() != null) {
            setSampleRand(sampleRand(tracesSamplingDecision));
        }
        if (tracesSamplingDecision.getSampleRate() != null) {
            forceSetSampleRate(sampleRate(tracesSamplingDecision));
        }
    }

    public void setValuesFromScope(IScope iScope, SentryOptions sentryOptions) {
        PropagationContext propagationContext = iScope.getPropagationContext();
        SentryId replayId = iScope.getReplayId();
        setTraceId(propagationContext.getTraceId().toString());
        setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        setRelease(sentryOptions.getRelease());
        setEnvironment(sentryOptions.getEnvironment());
        if (!SentryId.EMPTY_ID.equals(replayId)) {
            setReplayId(replayId.toString());
        }
        setTransaction(null);
        setSampleRate(null);
        setSampled(null);
    }

    public void setValuesFromTransaction(SentryId sentryId, SentryId sentryId2, SentryOptions sentryOptions, TracesSamplingDecision tracesSamplingDecision, String str, TransactionNameSource transactionNameSource) {
        setTraceId(sentryId.toString());
        setPublicKey(sentryOptions.retrieveParsedDsn().getPublicKey());
        setRelease(sentryOptions.getRelease());
        setEnvironment(sentryOptions.getEnvironment());
        if (!isHighQualityTransactionName(transactionNameSource)) {
            str = null;
        }
        setTransaction(str);
        if (sentryId2 != null && !SentryId.EMPTY_ID.equals(sentryId2)) {
            setReplayId(sentryId2.toString());
        }
        setSampleRate(sampleRate(tracesSamplingDecision));
        setSampled(StringUtils.toString(sampled(tracesSamplingDecision)));
        setSampleRand(sampleRand(tracesSamplingDecision));
    }

    public String toHeaderString(String str) {
        String str2;
        int iCountOf;
        StringBuilder sb = new StringBuilder();
        if (str == null || str.isEmpty()) {
            str2 = "";
            iCountOf = 0;
        } else {
            sb.append(str);
            iCountOf = StringUtils.countOf(str, ',') + 1;
            str2 = ",";
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.keyValuesLock.acquire();
        try {
            TreeSet<String> treeSet = new TreeSet(Collections.list(this.keyValues.keys()));
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            treeSet.add(DSCKeys.SAMPLE_RATE);
            treeSet.add(DSCKeys.SAMPLE_RAND);
            for (String str3 : treeSet) {
                String strSampleRateToString = DSCKeys.SAMPLE_RATE.equals(str3) ? sampleRateToString(this.sampleRate) : DSCKeys.SAMPLE_RAND.equals(str3) ? sampleRateToString(this.sampleRand) : this.keyValues.get(str3);
                if (strSampleRateToString != null) {
                    Integer num = MAX_BAGGAGE_LIST_MEMBER_COUNT;
                    if (iCountOf >= num.intValue()) {
                        this.logger.log(SentryLevel.ERROR, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", str3, num);
                    } else {
                        try {
                            String str4 = str2 + encode(str3) + "=" + encode(strSampleRateToString);
                            int length = sb.length() + str4.length();
                            Integer num2 = MAX_BAGGAGE_STRING_LENGTH;
                            if (length > num2.intValue()) {
                                this.logger.log(SentryLevel.ERROR, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", str3, num2);
                            } else {
                                iCountOf++;
                                sb.append(str4);
                                str2 = ",";
                            }
                        } catch (Throwable th) {
                            this.logger.log(SentryLevel.ERROR, th, "Unable to encode baggage key value pair (key=%s,value=%s).", str3, strSampleRateToString);
                        }
                    }
                }
            }
            return sb.toString();
        } catch (Throwable th2) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public TraceContext toTraceContext() {
        String traceId = getTraceId();
        String replayId = getReplayId();
        String publicKey = getPublicKey();
        if (traceId == null || publicKey == null) {
            return null;
        }
        TraceContext traceContext = new TraceContext(new SentryId(traceId), publicKey, getRelease(), getEnvironment(), getUserId(), getTransaction(), sampleRateToString(getSampleRate()), getSampled(), replayId == null ? null : new SentryId(replayId), sampleRateToString(getSampleRand()));
        traceContext.setUnknown(getUnknown());
        return traceContext;
    }

    public Baggage(Baggage baggage) {
        this(baggage.keyValues, baggage.sampleRate, baggage.sampleRand, baggage.thirdPartyHeader, baggage.mutable, baggage.shouldFreeze, baggage.logger);
    }

    public Baggage(ConcurrentHashMap<String, String> concurrentHashMap, Double d7, Double d8, String str, boolean z4, boolean z7, ILogger iLogger) {
        this.keyValuesLock = new AutoClosableReentrantLock();
        this.keyValues = concurrentHashMap;
        this.sampleRate = d7;
        this.sampleRand = d8;
        this.logger = iLogger;
        this.thirdPartyHeader = str;
        this.mutable = z4;
        this.shouldFreeze = z7;
    }

    public static Baggage fromHeader(List<String> list) {
        return fromHeader(list, false, ScopesAdapter.getInstance().getOptions().getLogger());
    }

    public static Baggage fromHeader(String str, ILogger iLogger) {
        return fromHeader(str, false, iLogger);
    }

    public static Baggage fromHeader(List<String> list, ILogger iLogger) {
        return fromHeader(list, false, iLogger);
    }

    public static Baggage fromHeader(List<String> list, boolean z4, ILogger iLogger) {
        if (list != null) {
            return fromHeader(StringUtils.join(",", list), z4, iLogger);
        }
        return fromHeader((String) null, z4, iLogger);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    public static Baggage fromHeader(String str, boolean z4, ILogger iLogger) {
        boolean z7;
        Double d7;
        Double d8;
        String strJoin;
        boolean z8;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        if (str != null) {
            try {
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                int i8 = 0;
                boolean z9 = false;
                d7 = null;
                d8 = null;
                while (i8 < length) {
                    try {
                        String str2 = strArrSplit[i8];
                        if (str2.trim().startsWith(SENTRY_BAGGAGE_PREFIX)) {
                            try {
                                int iIndexOf = str2.indexOf("=");
                                String strTrim = str2.substring(i7, iIndexOf).trim();
                                String strDecode = decode(strTrim);
                                String strDecode2 = decode(str2.substring(iIndexOf + 1).trim());
                                if (DSCKeys.SAMPLE_RATE.equals(strDecode)) {
                                    d7 = toDouble(strDecode2);
                                } else if (DSCKeys.SAMPLE_RAND.equals(strDecode)) {
                                    d8 = toDouble(strDecode2);
                                } else {
                                    concurrentHashMap.put(strDecode, strDecode2);
                                }
                                if (!DSCKeys.SAMPLE_RAND.equalsIgnoreCase(strTrim)) {
                                    z9 = true;
                                }
                            } catch (Throwable th) {
                                iLogger.log(SentryLevel.ERROR, th, "Unable to decode baggage key value pair %s", str2);
                            }
                        } else if (z4) {
                            arrayList.add(str2.trim());
                        }
                        i8++;
                        i7 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        z8 = z9;
                        iLogger.log(SentryLevel.ERROR, th, "Unable to decode baggage header %s", str);
                        z7 = z8;
                        if (arrayList.isEmpty()) {
                            strJoin = null;
                        } else {
                            strJoin = StringUtils.join(",", arrayList);
                        }
                        return new Baggage(concurrentHashMap, d7, d8, strJoin, true, z7, iLogger);
                    }
                }
                z7 = z9;
            } catch (Throwable th3) {
                th = th3;
                z8 = false;
                d7 = null;
                d8 = null;
            }
        } else {
            z7 = false;
            d7 = null;
            d8 = null;
        }
        if (arrayList.isEmpty()) {
            strJoin = null;
        } else {
            strJoin = StringUtils.join(",", arrayList);
        }
        return new Baggage(concurrentHashMap, d7, d8, strJoin, true, z7, iLogger);
    }
}
