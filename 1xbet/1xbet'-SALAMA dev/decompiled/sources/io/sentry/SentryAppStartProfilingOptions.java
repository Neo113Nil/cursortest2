package io.sentry;

import io.sentry.util.SentryRandom;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryAppStartProfilingOptions implements JsonUnknown, JsonSerializable {
    boolean continuousProfileSampled;
    boolean isContinuousProfilingEnabled;
    boolean isEnableAppStartProfiling;
    boolean isProfilingEnabled;
    boolean isStartProfilerOnAppStart;
    ProfileLifecycle profileLifecycle;
    Double profileSampleRate;
    boolean profileSampled;
    String profilingTracesDirPath;
    int profilingTracesHz;
    Double traceSampleRate;
    boolean traceSampled;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<SentryAppStartProfilingOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryAppStartProfilingOptions deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            SentryAppStartProfilingOptions sentryAppStartProfilingOptions = new SentryAppStartProfilingOptions();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "is_enable_app_start_profiling":
                        Boolean boolNextBooleanOrNull = objectReader.nextBooleanOrNull();
                        if (boolNextBooleanOrNull != null) {
                            sentryAppStartProfilingOptions.isEnableAppStartProfiling = boolNextBooleanOrNull.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "trace_sampled":
                        Boolean boolNextBooleanOrNull2 = objectReader.nextBooleanOrNull();
                        if (boolNextBooleanOrNull2 != null) {
                            sentryAppStartProfilingOptions.traceSampled = boolNextBooleanOrNull2.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profiling_traces_dir_path":
                        String strNextStringOrNull = objectReader.nextStringOrNull();
                        if (strNextStringOrNull != null) {
                            sentryAppStartProfilingOptions.profilingTracesDirPath = strNextStringOrNull;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_continuous_profiling_enabled":
                        Boolean boolNextBooleanOrNull3 = objectReader.nextBooleanOrNull();
                        if (boolNextBooleanOrNull3 != null) {
                            sentryAppStartProfilingOptions.isContinuousProfilingEnabled = boolNextBooleanOrNull3.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_profiling_enabled":
                        Boolean boolNextBooleanOrNull4 = objectReader.nextBooleanOrNull();
                        if (boolNextBooleanOrNull4 != null) {
                            sentryAppStartProfilingOptions.isProfilingEnabled = boolNextBooleanOrNull4.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "is_start_profiler_on_app_start":
                        Boolean boolNextBooleanOrNull5 = objectReader.nextBooleanOrNull();
                        if (boolNextBooleanOrNull5 != null) {
                            sentryAppStartProfilingOptions.isStartProfilerOnAppStart = boolNextBooleanOrNull5.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_sampled":
                        Boolean boolNextBooleanOrNull6 = objectReader.nextBooleanOrNull();
                        if (boolNextBooleanOrNull6 != null) {
                            sentryAppStartProfilingOptions.profileSampled = boolNextBooleanOrNull6.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_lifecycle":
                        String strNextStringOrNull2 = objectReader.nextStringOrNull();
                        if (strNextStringOrNull2 != null) {
                            try {
                                sentryAppStartProfilingOptions.profileLifecycle = ProfileLifecycle.valueOf(strNextStringOrNull2);
                            } catch (IllegalArgumentException unused) {
                                iLogger.log(SentryLevel.ERROR, "Error when deserializing ProfileLifecycle: ".concat(strNextStringOrNull2), new Object[0]);
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "continuous_profile_sampled":
                        Boolean boolNextBooleanOrNull7 = objectReader.nextBooleanOrNull();
                        if (boolNextBooleanOrNull7 != null) {
                            sentryAppStartProfilingOptions.continuousProfileSampled = boolNextBooleanOrNull7.booleanValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profiling_traces_hz":
                        Integer numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        if (numNextIntegerOrNull != null) {
                            sentryAppStartProfilingOptions.profilingTracesHz = numNextIntegerOrNull.intValue();
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "trace_sample_rate":
                        Double dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        if (dNextDoubleOrNull != null) {
                            sentryAppStartProfilingOptions.traceSampleRate = dNextDoubleOrNull;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "profile_sample_rate":
                        Double dNextDoubleOrNull2 = objectReader.nextDoubleOrNull();
                        if (dNextDoubleOrNull2 != null) {
                            sentryAppStartProfilingOptions.profileSampleRate = dNextDoubleOrNull2;
                            break;
                        } else {
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            sentryAppStartProfilingOptions.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryAppStartProfilingOptions;
        }
    }

    public static final class JsonKeys {
        public static final String CONTINUOUS_PROFILE_SAMPLED = "continuous_profile_sampled";
        public static final String IS_CONTINUOUS_PROFILING_ENABLED = "is_continuous_profiling_enabled";
        public static final String IS_ENABLE_APP_START_PROFILING = "is_enable_app_start_profiling";
        public static final String IS_PROFILING_ENABLED = "is_profiling_enabled";
        public static final String IS_START_PROFILER_ON_APP_START = "is_start_profiler_on_app_start";
        public static final String PROFILE_LIFECYCLE = "profile_lifecycle";
        public static final String PROFILE_SAMPLED = "profile_sampled";
        public static final String PROFILE_SAMPLE_RATE = "profile_sample_rate";
        public static final String PROFILING_TRACES_DIR_PATH = "profiling_traces_dir_path";
        public static final String PROFILING_TRACES_HZ = "profiling_traces_hz";
        public static final String TRACE_SAMPLED = "trace_sampled";
        public static final String TRACE_SAMPLE_RATE = "trace_sample_rate";
    }

    public SentryAppStartProfilingOptions() {
        this.traceSampled = false;
        this.traceSampleRate = null;
        this.profileSampled = false;
        this.profileSampleRate = null;
        this.continuousProfileSampled = false;
        this.profilingTracesDirPath = null;
        this.isProfilingEnabled = false;
        this.isContinuousProfilingEnabled = false;
        this.profileLifecycle = ProfileLifecycle.MANUAL;
        this.profilingTracesHz = 0;
        this.isEnableAppStartProfiling = true;
        this.isStartProfilerOnAppStart = false;
    }

    public ProfileLifecycle getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSampleRate() {
        return this.profileSampleRate;
    }

    public String getProfilingTracesDirPath() {
        return this.profilingTracesDirPath;
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public Double getTraceSampleRate() {
        return this.traceSampleRate;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public boolean isContinuousProfileSampled() {
        return this.continuousProfileSampled;
    }

    public boolean isContinuousProfilingEnabled() {
        return this.isContinuousProfilingEnabled;
    }

    public boolean isEnableAppStartProfiling() {
        return this.isEnableAppStartProfiling;
    }

    public boolean isProfileSampled() {
        return this.profileSampled;
    }

    public boolean isProfilingEnabled() {
        return this.isProfilingEnabled;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.isStartProfilerOnAppStart;
    }

    public boolean isTraceSampled() {
        return this.traceSampled;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(JsonKeys.PROFILE_SAMPLED).value(iLogger, Boolean.valueOf(this.profileSampled));
        objectWriter.name(JsonKeys.PROFILE_SAMPLE_RATE).value(iLogger, this.profileSampleRate);
        objectWriter.name(JsonKeys.CONTINUOUS_PROFILE_SAMPLED).value(iLogger, Boolean.valueOf(this.continuousProfileSampled));
        objectWriter.name(JsonKeys.TRACE_SAMPLED).value(iLogger, Boolean.valueOf(this.traceSampled));
        objectWriter.name(JsonKeys.TRACE_SAMPLE_RATE).value(iLogger, this.traceSampleRate);
        objectWriter.name(JsonKeys.PROFILING_TRACES_DIR_PATH).value(iLogger, this.profilingTracesDirPath);
        objectWriter.name(JsonKeys.IS_PROFILING_ENABLED).value(iLogger, Boolean.valueOf(this.isProfilingEnabled));
        objectWriter.name(JsonKeys.IS_CONTINUOUS_PROFILING_ENABLED).value(iLogger, Boolean.valueOf(this.isContinuousProfilingEnabled));
        objectWriter.name(JsonKeys.PROFILE_LIFECYCLE).value(iLogger, this.profileLifecycle.name());
        objectWriter.name(JsonKeys.PROFILING_TRACES_HZ).value(iLogger, Integer.valueOf(this.profilingTracesHz));
        objectWriter.name(JsonKeys.IS_ENABLE_APP_START_PROFILING).value(iLogger, Boolean.valueOf(this.isEnableAppStartProfiling));
        objectWriter.name(JsonKeys.IS_START_PROFILER_ON_APP_START).value(iLogger, Boolean.valueOf(this.isStartProfilerOnAppStart));
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                p031e1.k.p(this.unknown, str, objectWriter, str, iLogger);
            }
        }
        objectWriter.endObject();
    }

    public void setContinuousProfileSampled(boolean z4) {
        this.continuousProfileSampled = z4;
    }

    public void setContinuousProfilingEnabled(boolean z4) {
        this.isContinuousProfilingEnabled = z4;
    }

    public void setEnableAppStartProfiling(boolean z4) {
        this.isEnableAppStartProfiling = z4;
    }

    public void setProfileLifecycle(ProfileLifecycle profileLifecycle) {
        this.profileLifecycle = profileLifecycle;
    }

    public void setProfileSampleRate(Double d7) {
        this.profileSampleRate = d7;
    }

    public void setProfileSampled(boolean z4) {
        this.profileSampled = z4;
    }

    public void setProfilingEnabled(boolean z4) {
        this.isProfilingEnabled = z4;
    }

    public void setProfilingTracesDirPath(String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i7) {
        this.profilingTracesHz = i7;
    }

    public void setStartProfilerOnAppStart(boolean z4) {
        this.isStartProfilerOnAppStart = z4;
    }

    public void setTraceSampleRate(Double d7) {
        this.traceSampleRate = d7;
    }

    public void setTraceSampled(boolean z4) {
        this.traceSampled = z4;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryAppStartProfilingOptions(SentryOptions sentryOptions, TracesSamplingDecision tracesSamplingDecision) {
        this.traceSampled = tracesSamplingDecision.getSampled().booleanValue();
        this.traceSampleRate = tracesSamplingDecision.getSampleRate();
        this.profileSampled = tracesSamplingDecision.getProfileSampled().booleanValue();
        this.profileSampleRate = tracesSamplingDecision.getProfileSampleRate();
        this.continuousProfileSampled = sentryOptions.getInternalTracesSampler().sampleSessionProfile(SentryRandom.current().nextDouble());
        this.profilingTracesDirPath = sentryOptions.getProfilingTracesDirPath();
        this.isProfilingEnabled = sentryOptions.isProfilingEnabled();
        this.isContinuousProfilingEnabled = sentryOptions.isContinuousProfilingEnabled();
        this.profileLifecycle = sentryOptions.getProfileLifecycle();
        this.profilingTracesHz = sentryOptions.getProfilingTracesHz();
        this.isEnableAppStartProfiling = sentryOptions.isEnableAppStartProfiling();
        this.isStartProfilerOnAppStart = sentryOptions.isStartProfilerOnAppStart();
    }
}
