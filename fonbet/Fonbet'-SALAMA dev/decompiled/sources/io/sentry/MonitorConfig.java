package io.sentry;

import io.sentry.MonitorSchedule;
import io.sentry.SentryOptions;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MonitorConfig implements JsonUnknown, JsonSerializable {
    private Long checkinMargin;
    private Long failureIssueThreshold;
    private Long maxRuntime;
    private Long recoveryThreshold;
    private MonitorSchedule schedule;
    private String timezone;
    private Map<String, Object> unknown;

    public static final class Deserializer implements JsonDeserializer<MonitorConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public MonitorConfig deserialize(ObjectReader objectReader, ILogger iLogger) {
            String nextName;
            objectReader.beginObject();
            MonitorSchedule monitorSchedule = null;
            Long l7 = null;
            Long l8 = null;
            String str = null;
            Long l9 = null;
            Long l10 = null;
            HashMap hashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                nextName = objectReader.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "timezone":
                        str = objectReader.nextStringOrNull();
                        break;
                    case "checkin_margin":
                        l7 = objectReader.nextLongOrNull();
                        break;
                    case "schedule":
                        monitorSchedule = new MonitorSchedule.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "recovery_threshold":
                        l10 = objectReader.nextLongOrNull();
                        break;
                    case "max_runtime":
                        l8 = objectReader.nextLongOrNull();
                        break;
                    case "failure_issue_threshold":
                        l9 = objectReader.nextLongOrNull();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, hashMap, nextName);
                        break;
                }
            }
            objectReader.endObject();
            if (monitorSchedule == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"schedule\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"schedule\"", illegalStateException);
                throw illegalStateException;
            }
            MonitorConfig monitorConfig = new MonitorConfig(monitorSchedule);
            monitorConfig.setCheckinMargin(l7);
            monitorConfig.setMaxRuntime(l8);
            monitorConfig.setTimezone(str);
            monitorConfig.setFailureIssueThreshold(l9);
            monitorConfig.setRecoveryThreshold(l10);
            monitorConfig.setUnknown(hashMap);
            return monitorConfig;
        }
    }

    public static final class JsonKeys {
        public static final String CHECKIN_MARGIN = "checkin_margin";
        public static final String FAILURE_ISSUE_THRESHOLD = "failure_issue_threshold";
        public static final String MAX_RUNTIME = "max_runtime";
        public static final String RECOVERY_THRESHOLD = "recovery_threshold";
        public static final String SCHEDULE = "schedule";
        public static final String TIMEZONE = "timezone";
    }

    public MonitorConfig(MonitorSchedule monitorSchedule) {
        this.schedule = monitorSchedule;
        SentryOptions.Cron cron = ScopesAdapter.getInstance().getOptions().getCron();
        if (cron != null) {
            this.checkinMargin = cron.getDefaultCheckinMargin();
            this.maxRuntime = cron.getDefaultMaxRuntime();
            this.timezone = cron.getDefaultTimezone();
            this.failureIssueThreshold = cron.getDefaultFailureIssueThreshold();
            this.recoveryThreshold = cron.getDefaultRecoveryThreshold();
        }
    }

    public Long getCheckinMargin() {
        return this.checkinMargin;
    }

    public Long getFailureIssueThreshold() {
        return this.failureIssueThreshold;
    }

    public Long getMaxRuntime() {
        return this.maxRuntime;
    }

    public Long getRecoveryThreshold() {
        return this.recoveryThreshold;
    }

    public MonitorSchedule getSchedule() {
        return this.schedule;
    }

    public String getTimezone() {
        return this.timezone;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(JsonKeys.SCHEDULE);
        this.schedule.serialize(objectWriter, iLogger);
        if (this.checkinMargin != null) {
            objectWriter.name(JsonKeys.CHECKIN_MARGIN).value(this.checkinMargin);
        }
        if (this.maxRuntime != null) {
            objectWriter.name(JsonKeys.MAX_RUNTIME).value(this.maxRuntime);
        }
        if (this.timezone != null) {
            objectWriter.name("timezone").value(this.timezone);
        }
        if (this.failureIssueThreshold != null) {
            objectWriter.name(JsonKeys.FAILURE_ISSUE_THRESHOLD).value(this.failureIssueThreshold);
        }
        if (this.recoveryThreshold != null) {
            objectWriter.name(JsonKeys.RECOVERY_THRESHOLD).value(this.recoveryThreshold);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setCheckinMargin(Long l7) {
        this.checkinMargin = l7;
    }

    public void setFailureIssueThreshold(Long l7) {
        this.failureIssueThreshold = l7;
    }

    public void setMaxRuntime(Long l7) {
        this.maxRuntime = l7;
    }

    public void setRecoveryThreshold(Long l7) {
        this.recoveryThreshold = l7;
    }

    public void setSchedule(MonitorSchedule monitorSchedule) {
        this.schedule = monitorSchedule;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }
}
