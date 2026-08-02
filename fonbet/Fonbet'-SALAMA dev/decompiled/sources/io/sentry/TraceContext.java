package io.sentry;

import W5.AbstractC0486a1;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class TraceContext implements JsonUnknown, JsonSerializable {
    private final String environment;
    private final String publicKey;
    private final String release;
    private final SentryId replayId;
    private final String sampleRand;
    private final String sampleRate;
    private final String sampled;
    private final SentryId traceId;
    private final String transaction;
    private Map<String, Object> unknown;
    private final String userId;

    public static final class Deserializer implements JsonDeserializer<TraceContext> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String h6 = AbstractC0486a1.h("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(h6);
            iLogger.log(SentryLevel.ERROR, h6, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public TraceContext deserialize(ObjectReader objectReader, ILogger iLogger) {
            char c3;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            SentryId sentryId = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            SentryId sentryId2 = null;
            String str8 = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String nextName = objectReader.nextName();
                nextName.getClass();
                switch (nextName.hashCode()) {
                    case -454767501:
                        if (nextName.equals("replay_id")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -147132913:
                        if (nextName.equals(JsonKeys.USER_ID)) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -85904877:
                        if (nextName.equals("environment")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 153192858:
                        if (nextName.equals(JsonKeys.SAMPLE_RAND)) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 153193045:
                        if (nextName.equals(JsonKeys.SAMPLE_RATE)) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1090594823:
                        if (nextName.equals("release")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1270300245:
                        if (nextName.equals("trace_id")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1864843258:
                        if (nextName.equals(JsonKeys.SAMPLED)) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1904812937:
                        if (nextName.equals(JsonKeys.PUBLIC_KEY)) {
                            c3 = '\b';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 2141246174:
                        if (nextName.equals("transaction")) {
                            c3 = '\t';
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
                        sentryId2 = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case 1:
                        str4 = objectReader.nextStringOrNull();
                        break;
                    case 2:
                        str3 = objectReader.nextStringOrNull();
                        break;
                    case 3:
                        str8 = objectReader.nextStringOrNull();
                        break;
                    case 4:
                        str6 = objectReader.nextStringOrNull();
                        break;
                    case 5:
                        str2 = objectReader.nextStringOrNull();
                        break;
                    case 6:
                        sentryId = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case 7:
                        str7 = objectReader.nextStringOrNull();
                        break;
                    case '\b':
                        str = objectReader.nextString();
                        break;
                    case '\t':
                        str5 = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            if (sentryId == null) {
                throw missingRequiredFieldException("trace_id", iLogger);
            }
            if (str == null) {
                throw missingRequiredFieldException(JsonKeys.PUBLIC_KEY, iLogger);
            }
            TraceContext traceContext = new TraceContext(sentryId, str, str2, str3, str4, str5, str6, str7, sentryId2, str8);
            traceContext.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return traceContext;
        }
    }

    public static final class JsonKeys {
        public static final String ENVIRONMENT = "environment";
        public static final String PUBLIC_KEY = "public_key";
        public static final String RELEASE = "release";
        public static final String REPLAY_ID = "replay_id";
        public static final String SAMPLED = "sampled";
        public static final String SAMPLE_RAND = "sample_rand";
        public static final String SAMPLE_RATE = "sample_rate";
        public static final String TRACE_ID = "trace_id";
        public static final String TRANSACTION = "transaction";
        public static final String USER_ID = "user_id";
    }

    public TraceContext(SentryId sentryId, String str) {
        this(sentryId, str, null, null, null, null, null, null, null);
    }

    private static String getUserId(SentryOptions sentryOptions, User user) {
        if (!sentryOptions.isSendDefaultPii() || user == null) {
            return null;
        }
        return user.getId();
    }

    public String getEnvironment() {
        return this.environment;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public String getRelease() {
        return this.release;
    }

    public SentryId getReplayId() {
        return this.replayId;
    }

    public String getSampleRand() {
        return this.sampleRand;
    }

    public String getSampleRate() {
        return this.sampleRate;
    }

    public String getSampled() {
        return this.sampled;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public String getTransaction() {
        return this.transaction;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        objectWriter.name(JsonKeys.PUBLIC_KEY).value(this.publicKey);
        if (this.release != null) {
            objectWriter.name("release").value(this.release);
        }
        if (this.environment != null) {
            objectWriter.name("environment").value(this.environment);
        }
        if (this.userId != null) {
            objectWriter.name(JsonKeys.USER_ID).value(this.userId);
        }
        if (this.transaction != null) {
            objectWriter.name("transaction").value(this.transaction);
        }
        if (this.sampleRate != null) {
            objectWriter.name(JsonKeys.SAMPLE_RATE).value(this.sampleRate);
        }
        if (this.sampleRand != null) {
            objectWriter.name(JsonKeys.SAMPLE_RAND).value(this.sampleRand);
        }
        if (this.sampled != null) {
            objectWriter.name(JsonKeys.SAMPLED).value(this.sampled);
        }
        if (this.replayId != null) {
            objectWriter.name("replay_id").value(iLogger, this.replayId);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                e1.k.p(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    @Deprecated
    public TraceContext(SentryId sentryId, String str, String str2, String str3, String str4, String str5, String str6, String str7, SentryId sentryId2) {
        this(sentryId, str, str2, str3, str4, str5, str6, str7, sentryId2, null);
    }

    public TraceContext(SentryId sentryId, String str, String str2, String str3, String str4, String str5, String str6, String str7, SentryId sentryId2, String str8) {
        this.traceId = sentryId;
        this.publicKey = str;
        this.release = str2;
        this.environment = str3;
        this.userId = str4;
        this.transaction = str5;
        this.sampleRate = str6;
        this.sampled = str7;
        this.replayId = sentryId2;
        this.sampleRand = str8;
    }

    public String getUserId() {
        return this.userId;
    }
}
