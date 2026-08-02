package io.sentry;

import W5.AbstractC0486a1;
import io.sentry.protocol.User;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.StringUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class Session implements JsonUnknown, JsonSerializable {
    private String abnormalMechanism;
    private final String distinctId;
    private Double duration;
    private final String environment;
    private final AtomicInteger errorCount;
    private Boolean init;
    private final String ipAddress;
    private final String release;
    private Long sequence;
    private final String sessionId;
    private final AutoClosableReentrantLock sessionLock;
    private final Date started;
    private State status;
    private Date timestamp;
    private Map<String, Object> unknown;
    private String userAgent;

    public static final class Deserializer implements JsonDeserializer<Session> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String h6 = AbstractC0486a1.h("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(h6);
            iLogger.log(SentryLevel.ERROR, h6, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public Session deserialize(ObjectReader objectReader, ILogger iLogger) {
            char c3;
            char c4;
            objectReader.beginObject();
            Integer num = null;
            State state = null;
            Date date = null;
            ConcurrentHashMap concurrentHashMap = null;
            Date date2 = null;
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Long l7 = null;
            Double d7 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String nextName = objectReader.nextName();
                nextName.getClass();
                switch (nextName.hashCode()) {
                    case -1992012396:
                        if (nextName.equals("duration")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1897185151:
                        if (nextName.equals(JsonKeys.STARTED)) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1294635157:
                        if (nextName.equals(JsonKeys.ERRORS)) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -892481550:
                        if (nextName.equals("status")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 99455:
                        if (nextName.equals(JsonKeys.DID)) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 113759:
                        if (nextName.equals(JsonKeys.SEQ)) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 113870:
                        if (nextName.equals(JsonKeys.SID)) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3237136:
                        if (nextName.equals(JsonKeys.INIT)) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 55126294:
                        if (nextName.equals("timestamp")) {
                            c3 = '\b';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 93152418:
                        if (nextName.equals(JsonKeys.ATTRS)) {
                            c3 = '\t';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 213717026:
                        if (nextName.equals(JsonKeys.ABNORMAL_MECHANISM)) {
                            c3 = '\n';
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        d7 = objectReader.nextDoubleOrNull();
                        break;
                    case 1:
                        date = objectReader.nextDateOrNull(iLogger);
                        break;
                    case 2:
                        num = objectReader.nextIntegerOrNull();
                        break;
                    case 3:
                        String capitalize = StringUtils.capitalize(objectReader.nextStringOrNull());
                        if (capitalize == null) {
                            break;
                        } else {
                            state = State.valueOf(capitalize);
                            break;
                        }
                    case 4:
                        str = objectReader.nextStringOrNull();
                        break;
                    case 5:
                        l7 = objectReader.nextLongOrNull();
                        break;
                    case 6:
                        String nextStringOrNull = objectReader.nextStringOrNull();
                        if (nextStringOrNull != null && (nextStringOrNull.length() == 36 || nextStringOrNull.length() == 32)) {
                            str2 = nextStringOrNull;
                            break;
                        } else {
                            iLogger.log(SentryLevel.ERROR, "%s sid is not valid.", nextStringOrNull);
                            break;
                        }
                    case 7:
                        bool = objectReader.nextBooleanOrNull();
                        break;
                    case '\b':
                        date2 = objectReader.nextDateOrNull(iLogger);
                        break;
                    case '\t':
                        objectReader.beginObject();
                        while (objectReader.peek() == JsonToken.NAME) {
                            String nextName2 = objectReader.nextName();
                            nextName2.getClass();
                            switch (nextName2.hashCode()) {
                                case -85904877:
                                    if (nextName2.equals("environment")) {
                                        c4 = 0;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1090594823:
                                    if (nextName2.equals("release")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1480014044:
                                    if (nextName2.equals("ip_address")) {
                                        c4 = 2;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case 1917799825:
                                    if (nextName2.equals(JsonKeys.USER_AGENT)) {
                                        c4 = 3;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            switch (c4) {
                                case 0:
                                    str5 = objectReader.nextStringOrNull();
                                    break;
                                case 1:
                                    str6 = objectReader.nextStringOrNull();
                                    break;
                                case 2:
                                    str3 = objectReader.nextStringOrNull();
                                    break;
                                case 3:
                                    str4 = objectReader.nextStringOrNull();
                                    break;
                                default:
                                    objectReader.skipValue();
                                    break;
                            }
                        }
                        objectReader.endObject();
                        break;
                    case '\n':
                        str7 = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            if (state == null) {
                throw missingRequiredFieldException("status", iLogger);
            }
            if (date == null) {
                throw missingRequiredFieldException(JsonKeys.STARTED, iLogger);
            }
            if (num == null) {
                throw missingRequiredFieldException(JsonKeys.ERRORS, iLogger);
            }
            if (str6 == null) {
                throw missingRequiredFieldException("release", iLogger);
            }
            Session session = new Session(state, date, date2, num.intValue(), str, str2, bool, l7, d7, str3, str4, str5, str6, str7);
            session.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return session;
        }
    }

    public static final class JsonKeys {
        public static final String ABNORMAL_MECHANISM = "abnormal_mechanism";
        public static final String ATTRS = "attrs";
        public static final String DID = "did";
        public static final String DURATION = "duration";
        public static final String ENVIRONMENT = "environment";
        public static final String ERRORS = "errors";
        public static final String INIT = "init";
        public static final String IP_ADDRESS = "ip_address";
        public static final String RELEASE = "release";
        public static final String SEQ = "seq";
        public static final String SID = "sid";
        public static final String STARTED = "started";
        public static final String STATUS = "status";
        public static final String TIMESTAMP = "timestamp";
        public static final String USER_AGENT = "user_agent";
    }

    public enum State {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public Session(State state, Date date, Date date2, int i7, String str, String str2, Boolean bool, Long l7, Double d7, String str3, String str4, String str5, String str6, String str7) {
        this.sessionLock = new AutoClosableReentrantLock();
        this.status = state;
        this.started = date;
        this.timestamp = date2;
        this.errorCount = new AtomicInteger(i7);
        this.distinctId = str;
        this.sessionId = str2;
        this.init = bool;
        this.sequence = l7;
        this.duration = d7;
        this.ipAddress = str3;
        this.userAgent = str4;
        this.environment = str5;
        this.release = str6;
        this.abnormalMechanism = str7;
    }

    private double calculateDurationTime(Date date) {
        return Math.abs(date.getTime() - this.started.getTime()) / 1000.0d;
    }

    private long getSequenceTimestamp(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    public void end() {
        end(DateUtils.getCurrentDateTime());
    }

    public int errorCount() {
        return this.errorCount.get();
    }

    public String getAbnormalMechanism() {
        return this.abnormalMechanism;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public Double getDuration() {
        return this.duration;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public Boolean getInit() {
        return this.init;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }

    public String getRelease() {
        return this.release;
    }

    public Long getSequence() {
        return this.sequence;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public Date getStarted() {
        Date date = this.started;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public State getStatus() {
        return this.status;
    }

    public Date getTimestamp() {
        Date date = this.timestamp;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public boolean isTerminated() {
        return this.status != State.Ok;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.sessionId != null) {
            objectWriter.name(JsonKeys.SID).value(this.sessionId);
        }
        if (this.distinctId != null) {
            objectWriter.name(JsonKeys.DID).value(this.distinctId);
        }
        if (this.init != null) {
            objectWriter.name(JsonKeys.INIT).value(this.init);
        }
        objectWriter.name(JsonKeys.STARTED).value(iLogger, this.started);
        objectWriter.name("status").value(iLogger, this.status.name().toLowerCase(Locale.ROOT));
        if (this.sequence != null) {
            objectWriter.name(JsonKeys.SEQ).value(this.sequence);
        }
        objectWriter.name(JsonKeys.ERRORS).value(this.errorCount.intValue());
        if (this.duration != null) {
            objectWriter.name("duration").value(this.duration);
        }
        if (this.timestamp != null) {
            objectWriter.name("timestamp").value(iLogger, this.timestamp);
        }
        if (this.abnormalMechanism != null) {
            objectWriter.name(JsonKeys.ABNORMAL_MECHANISM).value(iLogger, this.abnormalMechanism);
        }
        objectWriter.name(JsonKeys.ATTRS);
        objectWriter.beginObject();
        objectWriter.name("release").value(iLogger, this.release);
        if (this.environment != null) {
            objectWriter.name("environment").value(iLogger, this.environment);
        }
        if (this.ipAddress != null) {
            objectWriter.name("ip_address").value(iLogger, this.ipAddress);
        }
        if (this.userAgent != null) {
            objectWriter.name(JsonKeys.USER_AGENT).value(iLogger, this.userAgent);
        }
        objectWriter.endObject();
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                e1.k.p(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setInitAsTrue() {
        this.init = Boolean.TRUE;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public boolean update(State state, String str, boolean z4) {
        return update(state, str, z4, null);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Session m14clone() {
        return new Session(this.status, this.started, this.timestamp, this.errorCount.get(), this.distinctId, this.sessionId, this.init, this.sequence, this.duration, this.ipAddress, this.userAgent, this.environment, this.release, this.abnormalMechanism);
    }

    public void end(Date date) {
        ISentryLifecycleToken acquire = this.sessionLock.acquire();
        try {
            this.init = null;
            if (this.status == State.Ok) {
                this.status = State.Exited;
            }
            if (date != null) {
                this.timestamp = date;
            } else {
                this.timestamp = DateUtils.getCurrentDateTime();
            }
            Date date2 = this.timestamp;
            if (date2 != null) {
                this.duration = Double.valueOf(calculateDurationTime(date2));
                this.sequence = Long.valueOf(getSequenceTimestamp(this.timestamp));
            }
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean update(State state, String str, boolean z4, String str2) {
        boolean z7;
        ISentryLifecycleToken acquire = this.sessionLock.acquire();
        boolean z8 = true;
        if (state != null) {
            try {
                this.status = state;
                z7 = true;
            } catch (Throwable th) {
                if (acquire != null) {
                    try {
                        acquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } else {
            z7 = false;
        }
        if (str != null) {
            this.userAgent = str;
            z7 = true;
        }
        if (z4) {
            this.errorCount.addAndGet(1);
            z7 = true;
        }
        if (str2 != null) {
            this.abnormalMechanism = str2;
        } else {
            z8 = z7;
        }
        if (z8) {
            this.init = null;
            Date currentDateTime = DateUtils.getCurrentDateTime();
            this.timestamp = currentDateTime;
            if (currentDateTime != null) {
                this.sequence = Long.valueOf(getSequenceTimestamp(currentDateTime));
            }
        }
        if (acquire != null) {
            acquire.close();
        }
        return z8;
    }

    public Session(String str, User user, String str2, String str3) {
        this(State.Ok, DateUtils.getCurrentDateTime(), DateUtils.getCurrentDateTime(), 0, str, SentryUUID.generateSentryId(), Boolean.TRUE, null, null, user != null ? user.getIpAddress() : null, null, str2, str3, null);
    }
}
