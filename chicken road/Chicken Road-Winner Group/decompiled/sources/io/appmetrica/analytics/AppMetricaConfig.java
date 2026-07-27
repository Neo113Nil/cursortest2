package io.appmetrica.analytics;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC0711no;
import io.appmetrica.analytics.impl.C0532h0;
import io.appmetrica.analytics.impl.C0873u5;
import io.appmetrica.analytics.impl.Gn;
import io.appmetrica.analytics.impl.K7;
import io.appmetrica.analytics.impl.O3;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppMetricaConfig {
    public final Map<String, Object> additionalConfig;
    public final Boolean advIdentifiersTracking;
    public final Boolean anrMonitoring;
    public final Integer anrMonitoringTimeout;
    public final String apiKey;
    public final Integer appBuildNumber;
    public final Map<String, String> appEnvironment;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final ICrashTransformer crashTransformer;
    public final List<String> customHosts;
    public final Boolean dataSendingEnabled;
    public final String deviceType;
    public final Integer dispatchPeriodSeconds;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: D, reason: collision with root package name */
        private static final Gn f5048D = new Gn(new C0532h0());

        /* renamed from: A, reason: collision with root package name */
        private Integer f5049A;

        /* renamed from: B, reason: collision with root package name */
        private List f5050B;

        /* renamed from: C, reason: collision with root package name */
        private final HashMap f5051C;

        /* renamed from: a, reason: collision with root package name */
        private final C0873u5 f5052a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5053b;

        /* renamed from: c, reason: collision with root package name */
        private String f5054c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f5055d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f5056e;
        private Boolean f;

        /* renamed from: g, reason: collision with root package name */
        private Location f5057g;

        /* renamed from: h, reason: collision with root package name */
        private Boolean f5058h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f5059i;

        /* renamed from: j, reason: collision with root package name */
        private Boolean f5060j;

        /* renamed from: k, reason: collision with root package name */
        private PreloadInfo f5061k;

        /* renamed from: l, reason: collision with root package name */
        private Boolean f5062l;

        /* renamed from: m, reason: collision with root package name */
        private Boolean f5063m;

        /* renamed from: n, reason: collision with root package name */
        private Integer f5064n;

        /* renamed from: o, reason: collision with root package name */
        private final LinkedHashMap f5065o;

        /* renamed from: p, reason: collision with root package name */
        private String f5066p;

        /* renamed from: q, reason: collision with root package name */
        private Boolean f5067q;

        /* renamed from: r, reason: collision with root package name */
        private Boolean f5068r;

        /* renamed from: s, reason: collision with root package name */
        private Boolean f5069s;

        /* renamed from: t, reason: collision with root package name */
        private String f5070t;

        /* renamed from: u, reason: collision with root package name */
        private Integer f5071u;

        /* renamed from: v, reason: collision with root package name */
        private Integer f5072v;

        /* renamed from: w, reason: collision with root package name */
        private Integer f5073w;

        /* renamed from: x, reason: collision with root package name */
        private final LinkedHashMap f5074x;
        private ICrashTransformer y;

        /* renamed from: z, reason: collision with root package name */
        private Boolean f5075z;

        public /* synthetic */ Builder(String str, int i3) {
            this(str);
        }

        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        public Builder handleFirstActivationAsUpdate(boolean z3) {
            this.f5062l = Boolean.valueOf(z3);
            return this;
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.f5051C.put(str, obj);
            return this;
        }

        public Builder withAdvIdentifiersTracking(boolean z3) {
            this.f5059i = Boolean.valueOf(z3);
            return this;
        }

        public Builder withAnrMonitoring(boolean z3) {
            this.f5075z = Boolean.valueOf(z3);
            return this;
        }

        public Builder withAnrMonitoringTimeout(int i3) {
            this.f5049A = Integer.valueOf(i3);
            return this;
        }

        public Builder withAppBuildNumber(int i3) {
            if (i3 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f5071u = Integer.valueOf(i3);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f5074x.put(str, str2);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z3) {
            this.f5069s = Boolean.valueOf(z3);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.f5054c = str;
            return this;
        }

        public Builder withCrashReporting(boolean z3) {
            this.f5056e = Boolean.valueOf(z3);
            return this;
        }

        public Builder withCrashTransformer(ICrashTransformer iCrashTransformer) {
            this.y = iCrashTransformer;
            return this;
        }

        public Builder withCustomHosts(List<String> list) {
            this.f5050B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z3) {
            this.f5063m = Boolean.valueOf(z3);
            return this;
        }

        public Builder withDeviceType(String str) {
            this.f5070t = str;
            if (!PredefinedDeviceTypes.ALL_VALUES.contains(str)) {
                PublicLogger.getAnonymousInstance().info("PredefinedDeviceTypes does not contain value for `deviceType = %s`. It may cause events to not appear in AppMetrica reports.", str);
            }
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i3) {
            this.f5072v = Integer.valueOf(i3);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.f5065o.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.f5057g = location;
            return this;
        }

        public Builder withLocationTracking(boolean z3) {
            this.f5058h = Boolean.valueOf(z3);
            return this;
        }

        public Builder withLogs() {
            this.f5060j = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i3) {
            this.f5073w = Integer.valueOf(i3);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i3) {
            this.f5064n = Integer.valueOf(this.f5052a.a(i3));
            return this;
        }

        public Builder withNativeCrashReporting(boolean z3) {
            this.f = Boolean.valueOf(z3);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f5061k = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z3) {
            this.f5067q = Boolean.valueOf(z3);
            return this;
        }

        public Builder withSessionTimeout(int i3) {
            this.f5055d = Integer.valueOf(i3);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z3) {
            this.f5068r = Boolean.valueOf(z3);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f5066p = str;
            return this;
        }

        private Builder(String str) {
            this.f5065o = new LinkedHashMap();
            this.f5074x = new LinkedHashMap();
            this.f5051C = new HashMap();
            f5048D.a(str);
            this.f5052a = new C0873u5(str);
            this.f5053b = str;
        }
    }

    public /* synthetic */ AppMetricaConfig(Builder builder, int i3) {
        this(builder);
    }

    public static AppMetricaConfig fromJson(String str) {
        Builder a3 = new O3().a(str);
        if (a3 == null) {
            return null;
        }
        return a3.build();
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fd A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0005, B:7:0x0058, B:10:0x0092, B:13:0x00e8, B:15:0x00fd, B:18:0x010b, B:19:0x0106, B:20:0x010e, B:24:0x00e3, B:25:0x008d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3 A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0005, B:7:0x0058, B:10:0x0092, B:13:0x00e8, B:15:0x00fd, B:18:0x010b, B:19:0x0106, B:20:0x010e, B:24:0x00e3, B:25:0x008d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[Catch: all -> 0x011d, TryCatch #1 {all -> 0x011d, blocks: (B:3:0x0005, B:7:0x0058, B:10:0x0092, B:13:0x00e8, B:15:0x00fd, B:18:0x010b, B:19:0x0106, B:20:0x010e, B:24:0x00e3, B:25:0x008d), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toJson() {
        String jSONObject;
        List<String> list;
        new K7();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apikey", this.apiKey);
            jSONObject2.put("app_version", this.appVersion);
            jSONObject2.put("session_timeout", this.sessionTimeout);
            jSONObject2.put("location", O3.a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONArray jSONArray = null;
            if (preloadInfo != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("trackid", preloadInfo.getTrackingId());
                    Map<String, String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject3.put("params", additionalParams == null ? null : new JSONObject(additionalParams));
                    jSONObject = jSONObject3.toString();
                } catch (Throwable unused) {
                }
                jSONObject2.put("preload_info", jSONObject);
                jSONObject2.put("logs", this.logs);
                jSONObject2.put("crash_enabled", this.crashReporting);
                jSONObject2.put("crash_native_enabled", this.nativeCrashReporting);
                jSONObject2.put("location_enabled", this.locationTracking);
                jSONObject2.put("adv_identifiers_tracking", this.advIdentifiersTracking);
                jSONObject2.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
                Map<String, String> map = this.errorEnvironment;
                jSONObject2.put("error_environment", map != null ? null : new JSONObject(map));
                jSONObject2.put("first_activation_as_update", this.firstActivationAsUpdate);
                jSONObject2.put("data_sending_enabled", this.dataSendingEnabled);
                jSONObject2.put("user_profile_id", this.userProfileID);
                jSONObject2.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
                jSONObject2.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
                jSONObject2.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
                jSONObject2.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
                jSONObject2.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
                jSONObject2.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
                jSONObject2.put("max_reports_count", this.maxReportsCount);
                Map<String, String> map2 = this.appEnvironment;
                jSONObject2.put("app_environment", map2 != null ? null : new JSONObject(map2));
                jSONObject2.put("anr_monitoring", this.anrMonitoring);
                jSONObject2.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
                list = this.customHosts;
                if (list != null) {
                    if (!AbstractC0711no.a((Collection) list)) {
                        jSONArray = new JSONArray((Collection) list);
                    }
                    jSONObject2.put("customHosts", jSONArray);
                }
                jSONObject2.put("additional_config", new JSONObject());
                return jSONObject2.toString();
            }
            jSONObject = null;
            jSONObject2.put("preload_info", jSONObject);
            jSONObject2.put("logs", this.logs);
            jSONObject2.put("crash_enabled", this.crashReporting);
            jSONObject2.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject2.put("location_enabled", this.locationTracking);
            jSONObject2.put("adv_identifiers_tracking", this.advIdentifiersTracking);
            jSONObject2.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            Map<String, String> map3 = this.errorEnvironment;
            jSONObject2.put("error_environment", map3 != null ? null : new JSONObject(map3));
            jSONObject2.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject2.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject2.put("user_profile_id", this.userProfileID);
            jSONObject2.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject2.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject2.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject2.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject2.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject2.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject2.put("max_reports_count", this.maxReportsCount);
            Map<String, String> map22 = this.appEnvironment;
            jSONObject2.put("app_environment", map22 != null ? null : new JSONObject(map22));
            jSONObject2.put("anr_monitoring", this.anrMonitoring);
            jSONObject2.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            list = this.customHosts;
            if (list != null) {
            }
            jSONObject2.put("additional_config", new JSONObject());
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f5053b;
        this.appVersion = builder.f5054c;
        this.sessionTimeout = builder.f5055d;
        this.crashReporting = builder.f5056e;
        this.nativeCrashReporting = builder.f;
        this.location = builder.f5057g;
        this.locationTracking = builder.f5058h;
        this.advIdentifiersTracking = builder.f5059i;
        this.logs = builder.f5060j;
        this.preloadInfo = builder.f5061k;
        this.firstActivationAsUpdate = builder.f5062l;
        this.dataSendingEnabled = builder.f5063m;
        this.maxReportsInDatabaseCount = builder.f5064n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5065o);
        this.userProfileID = builder.f5066p;
        this.revenueAutoTrackingEnabled = builder.f5067q;
        this.sessionsAutoTrackingEnabled = builder.f5068r;
        this.appOpenTrackingEnabled = builder.f5069s;
        this.deviceType = builder.f5070t;
        this.appBuildNumber = builder.f5071u;
        this.dispatchPeriodSeconds = builder.f5072v;
        this.maxReportsCount = builder.f5073w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5074x);
        this.crashTransformer = builder.y;
        this.anrMonitoring = builder.f5075z;
        this.anrMonitoringTimeout = builder.f5049A;
        this.customHosts = builder.f5050B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f5051C);
    }

    public AppMetricaConfig(AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.advIdentifiersTracking = appMetricaConfig.advIdentifiersTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
