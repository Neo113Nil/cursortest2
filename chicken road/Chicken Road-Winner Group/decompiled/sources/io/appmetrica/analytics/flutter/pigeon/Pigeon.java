package io.appmetrica.analytics.flutter.pigeon;

import P0.j;
import T1.f;
import T1.k;
import T1.r;
import a1.e;
import android.util.Log;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.impl.C0644l9;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Pigeon {

    public static final class AdRevenuePigeon {
        private String adNetwork;
        private String adPlacementId;
        private String adPlacementName;
        private String adRevenue;
        private AdTypePigeon adType;
        private String adUnitId;
        private String adUnitName;
        private String currency;
        private Map<String, String> payload;
        private String precision;

        public static final class Builder {
            private String adNetwork;
            private String adPlacementId;
            private String adPlacementName;
            private String adRevenue;
            private AdTypePigeon adType;
            private String adUnitId;
            private String adUnitName;
            private String currency;
            private Map<String, String> payload;
            private String precision;

            public AdRevenuePigeon build() {
                AdRevenuePigeon adRevenuePigeon = new AdRevenuePigeon();
                adRevenuePigeon.setAdRevenue(this.adRevenue);
                adRevenuePigeon.setCurrency(this.currency);
                adRevenuePigeon.setAdType(this.adType);
                adRevenuePigeon.setAdNetwork(this.adNetwork);
                adRevenuePigeon.setAdUnitId(this.adUnitId);
                adRevenuePigeon.setAdUnitName(this.adUnitName);
                adRevenuePigeon.setAdPlacementId(this.adPlacementId);
                adRevenuePigeon.setAdPlacementName(this.adPlacementName);
                adRevenuePigeon.setPrecision(this.precision);
                adRevenuePigeon.setPayload(this.payload);
                return adRevenuePigeon;
            }

            public Builder setAdNetwork(String str) {
                this.adNetwork = str;
                return this;
            }

            public Builder setAdPlacementId(String str) {
                this.adPlacementId = str;
                return this;
            }

            public Builder setAdPlacementName(String str) {
                this.adPlacementName = str;
                return this;
            }

            public Builder setAdRevenue(String str) {
                this.adRevenue = str;
                return this;
            }

            public Builder setAdType(AdTypePigeon adTypePigeon) {
                this.adType = adTypePigeon;
                return this;
            }

            public Builder setAdUnitId(String str) {
                this.adUnitId = str;
                return this;
            }

            public Builder setAdUnitName(String str) {
                this.adUnitName = str;
                return this;
            }

            public Builder setCurrency(String str) {
                this.currency = str;
                return this;
            }

            public Builder setPayload(Map<String, String> map) {
                this.payload = map;
                return this;
            }

            public Builder setPrecision(String str) {
                this.precision = str;
                return this;
            }
        }

        public static AdRevenuePigeon fromList(ArrayList<Object> arrayList) {
            AdRevenuePigeon adRevenuePigeon = new AdRevenuePigeon();
            adRevenuePigeon.setAdRevenue((String) arrayList.get(0));
            adRevenuePigeon.setCurrency((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            adRevenuePigeon.setAdType(obj == null ? null : AdTypePigeon.values()[((Integer) obj).intValue()]);
            adRevenuePigeon.setAdNetwork((String) arrayList.get(3));
            adRevenuePigeon.setAdUnitId((String) arrayList.get(4));
            adRevenuePigeon.setAdUnitName((String) arrayList.get(5));
            adRevenuePigeon.setAdPlacementId((String) arrayList.get(6));
            adRevenuePigeon.setAdPlacementName((String) arrayList.get(7));
            adRevenuePigeon.setPrecision((String) arrayList.get(8));
            adRevenuePigeon.setPayload((Map) arrayList.get(9));
            return adRevenuePigeon;
        }

        public String getAdNetwork() {
            return this.adNetwork;
        }

        public String getAdPlacementId() {
            return this.adPlacementId;
        }

        public String getAdPlacementName() {
            return this.adPlacementName;
        }

        public String getAdRevenue() {
            return this.adRevenue;
        }

        public AdTypePigeon getAdType() {
            return this.adType;
        }

        public String getAdUnitId() {
            return this.adUnitId;
        }

        public String getAdUnitName() {
            return this.adUnitName;
        }

        public String getCurrency() {
            return this.currency;
        }

        public Map<String, String> getPayload() {
            return this.payload;
        }

        public String getPrecision() {
            return this.precision;
        }

        public void setAdNetwork(String str) {
            this.adNetwork = str;
        }

        public void setAdPlacementId(String str) {
            this.adPlacementId = str;
        }

        public void setAdPlacementName(String str) {
            this.adPlacementName = str;
        }

        public void setAdRevenue(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"adRevenue\" is null.");
            }
            this.adRevenue = str;
        }

        public void setAdType(AdTypePigeon adTypePigeon) {
            this.adType = adTypePigeon;
        }

        public void setAdUnitId(String str) {
            this.adUnitId = str;
        }

        public void setAdUnitName(String str) {
            this.adUnitName = str;
        }

        public void setCurrency(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"currency\" is null.");
            }
            this.currency = str;
        }

        public void setPayload(Map<String, String> map) {
            this.payload = map;
        }

        public void setPrecision(String str) {
            this.precision = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(10);
            arrayList.add(this.adRevenue);
            arrayList.add(this.currency);
            AdTypePigeon adTypePigeon = this.adType;
            arrayList.add(adTypePigeon == null ? null : Integer.valueOf(adTypePigeon.index));
            arrayList.add(this.adNetwork);
            arrayList.add(this.adUnitId);
            arrayList.add(this.adUnitName);
            arrayList.add(this.adPlacementId);
            arrayList.add(this.adPlacementName);
            arrayList.add(this.precision);
            arrayList.add(this.payload);
            return arrayList;
        }
    }

    public enum AdTypePigeon {
        UNKNOWN(0),
        NATIVE(1),
        BANNER(2),
        REWARDED(3),
        INTERSTITIAL(4),
        MREC(5),
        APP_OPEN(6),
        OTHER(7);

        final int index;

        AdTypePigeon(int i3) {
            this.index = i3;
        }
    }

    public interface AppMetricaConfigConverterPigeon {
        static k getCodec() {
            return AppMetricaConfigConverterPigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(AppMetricaConfigConverterPigeon appMetricaConfigConverterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, appMetricaConfigConverterPigeon.toJson((AppMetricaConfigPigeon) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        static void setup(f fVar, AppMetricaConfigConverterPigeon appMetricaConfigConverterPigeon) {
            D0.a aVar = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaConfigConverterPigeon.toJson", getCodec(), (j) null);
            if (appMetricaConfigConverterPigeon != null) {
                aVar.g(new F1.b(22, appMetricaConfigConverterPigeon));
            } else {
                aVar.g(null);
            }
        }

        String toJson(AppMetricaConfigPigeon appMetricaConfigPigeon);
    }

    public static class AppMetricaConfigConverterPigeonCodec extends r {
        public static final AppMetricaConfigConverterPigeonCodec INSTANCE = new AppMetricaConfigConverterPigeonCodec();

        private AppMetricaConfigConverterPigeonCodec() {
        }

        @Override // T1.r
        public Object readValueOfType(byte b3, ByteBuffer byteBuffer) {
            switch (b3) {
                case Byte.MIN_VALUE:
                    return AppMetricaConfigPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return LocationPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PreloadInfoPigeon.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b3, byteBuffer);
            }
        }

        @Override // T1.r
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AppMetricaConfigPigeon) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AppMetricaConfigPigeon) obj).toList());
            } else if (obj instanceof LocationPigeon) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((LocationPigeon) obj).toList());
            } else if (!(obj instanceof PreloadInfoPigeon)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PreloadInfoPigeon) obj).toList());
            }
        }
    }

    public static final class AppMetricaConfigPigeon {
        private Boolean advIdentifiersTracking;
        private Boolean anrMonitoring;
        private Long anrMonitoringTimeout;
        private String apiKey;
        private Long appBuildNumber;
        private Map<String, String> appEnvironment;
        private Boolean appOpenTrackingEnabled;
        private String appVersion;
        private Boolean crashReporting;
        private List<String> customHosts;
        private Boolean dataSendingEnabled;
        private String deviceType;
        private Long dispatchPeriodSeconds;
        private Map<String, String> errorEnvironment;
        private Boolean firstActivationAsUpdate;
        private LocationPigeon location;
        private Boolean locationTracking;
        private Boolean logs;
        private Long maxReportsCount;
        private Long maxReportsInDatabaseCount;
        private Boolean nativeCrashReporting;
        private PreloadInfoPigeon preloadInfo;
        private Boolean revenueAutoTrackingEnabled;
        private Long sessionTimeout;
        private Boolean sessionsAutoTrackingEnabled;
        private String userProfileID;

        public static final class Builder {
            private Boolean advIdentifiersTracking;
            private Boolean anrMonitoring;
            private Long anrMonitoringTimeout;
            private String apiKey;
            private Long appBuildNumber;
            private Map<String, String> appEnvironment;
            private Boolean appOpenTrackingEnabled;
            private String appVersion;
            private Boolean crashReporting;
            private List<String> customHosts;
            private Boolean dataSendingEnabled;
            private String deviceType;
            private Long dispatchPeriodSeconds;
            private Map<String, String> errorEnvironment;
            private Boolean firstActivationAsUpdate;
            private LocationPigeon location;
            private Boolean locationTracking;
            private Boolean logs;
            private Long maxReportsCount;
            private Long maxReportsInDatabaseCount;
            private Boolean nativeCrashReporting;
            private PreloadInfoPigeon preloadInfo;
            private Boolean revenueAutoTrackingEnabled;
            private Long sessionTimeout;
            private Boolean sessionsAutoTrackingEnabled;
            private String userProfileID;

            public AppMetricaConfigPigeon build() {
                AppMetricaConfigPigeon appMetricaConfigPigeon = new AppMetricaConfigPigeon();
                appMetricaConfigPigeon.setApiKey(this.apiKey);
                appMetricaConfigPigeon.setAdvIdentifiersTracking(this.advIdentifiersTracking);
                appMetricaConfigPigeon.setAnrMonitoring(this.anrMonitoring);
                appMetricaConfigPigeon.setAnrMonitoringTimeout(this.anrMonitoringTimeout);
                appMetricaConfigPigeon.setAppBuildNumber(this.appBuildNumber);
                appMetricaConfigPigeon.setAppEnvironment(this.appEnvironment);
                appMetricaConfigPigeon.setAppOpenTrackingEnabled(this.appOpenTrackingEnabled);
                appMetricaConfigPigeon.setAppVersion(this.appVersion);
                appMetricaConfigPigeon.setCrashReporting(this.crashReporting);
                appMetricaConfigPigeon.setCustomHosts(this.customHosts);
                appMetricaConfigPigeon.setDataSendingEnabled(this.dataSendingEnabled);
                appMetricaConfigPigeon.setDeviceType(this.deviceType);
                appMetricaConfigPigeon.setDispatchPeriodSeconds(this.dispatchPeriodSeconds);
                appMetricaConfigPigeon.setErrorEnvironment(this.errorEnvironment);
                appMetricaConfigPigeon.setFirstActivationAsUpdate(this.firstActivationAsUpdate);
                appMetricaConfigPigeon.setLocation(this.location);
                appMetricaConfigPigeon.setLocationTracking(this.locationTracking);
                appMetricaConfigPigeon.setLogs(this.logs);
                appMetricaConfigPigeon.setMaxReportsCount(this.maxReportsCount);
                appMetricaConfigPigeon.setMaxReportsInDatabaseCount(this.maxReportsInDatabaseCount);
                appMetricaConfigPigeon.setNativeCrashReporting(this.nativeCrashReporting);
                appMetricaConfigPigeon.setPreloadInfo(this.preloadInfo);
                appMetricaConfigPigeon.setRevenueAutoTrackingEnabled(this.revenueAutoTrackingEnabled);
                appMetricaConfigPigeon.setSessionTimeout(this.sessionTimeout);
                appMetricaConfigPigeon.setSessionsAutoTrackingEnabled(this.sessionsAutoTrackingEnabled);
                appMetricaConfigPigeon.setUserProfileID(this.userProfileID);
                return appMetricaConfigPigeon;
            }

            public Builder setAdvIdentifiersTracking(Boolean bool) {
                this.advIdentifiersTracking = bool;
                return this;
            }

            public Builder setAnrMonitoring(Boolean bool) {
                this.anrMonitoring = bool;
                return this;
            }

            public Builder setAnrMonitoringTimeout(Long l3) {
                this.anrMonitoringTimeout = l3;
                return this;
            }

            public Builder setApiKey(String str) {
                this.apiKey = str;
                return this;
            }

            public Builder setAppBuildNumber(Long l3) {
                this.appBuildNumber = l3;
                return this;
            }

            public Builder setAppEnvironment(Map<String, String> map) {
                this.appEnvironment = map;
                return this;
            }

            public Builder setAppOpenTrackingEnabled(Boolean bool) {
                this.appOpenTrackingEnabled = bool;
                return this;
            }

            public Builder setAppVersion(String str) {
                this.appVersion = str;
                return this;
            }

            public Builder setCrashReporting(Boolean bool) {
                this.crashReporting = bool;
                return this;
            }

            public Builder setCustomHosts(List<String> list) {
                this.customHosts = list;
                return this;
            }

            public Builder setDataSendingEnabled(Boolean bool) {
                this.dataSendingEnabled = bool;
                return this;
            }

            public Builder setDeviceType(String str) {
                this.deviceType = str;
                return this;
            }

            public Builder setDispatchPeriodSeconds(Long l3) {
                this.dispatchPeriodSeconds = l3;
                return this;
            }

            public Builder setErrorEnvironment(Map<String, String> map) {
                this.errorEnvironment = map;
                return this;
            }

            public Builder setFirstActivationAsUpdate(Boolean bool) {
                this.firstActivationAsUpdate = bool;
                return this;
            }

            public Builder setLocation(LocationPigeon locationPigeon) {
                this.location = locationPigeon;
                return this;
            }

            public Builder setLocationTracking(Boolean bool) {
                this.locationTracking = bool;
                return this;
            }

            public Builder setLogs(Boolean bool) {
                this.logs = bool;
                return this;
            }

            public Builder setMaxReportsCount(Long l3) {
                this.maxReportsCount = l3;
                return this;
            }

            public Builder setMaxReportsInDatabaseCount(Long l3) {
                this.maxReportsInDatabaseCount = l3;
                return this;
            }

            public Builder setNativeCrashReporting(Boolean bool) {
                this.nativeCrashReporting = bool;
                return this;
            }

            public Builder setPreloadInfo(PreloadInfoPigeon preloadInfoPigeon) {
                this.preloadInfo = preloadInfoPigeon;
                return this;
            }

            public Builder setRevenueAutoTrackingEnabled(Boolean bool) {
                this.revenueAutoTrackingEnabled = bool;
                return this;
            }

            public Builder setSessionTimeout(Long l3) {
                this.sessionTimeout = l3;
                return this;
            }

            public Builder setSessionsAutoTrackingEnabled(Boolean bool) {
                this.sessionsAutoTrackingEnabled = bool;
                return this;
            }

            public Builder setUserProfileID(String str) {
                this.userProfileID = str;
                return this;
            }
        }

        public static AppMetricaConfigPigeon fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            Long valueOf2;
            Long valueOf3;
            Long valueOf4;
            Long valueOf5;
            AppMetricaConfigPigeon appMetricaConfigPigeon = new AppMetricaConfigPigeon();
            appMetricaConfigPigeon.setApiKey((String) arrayList.get(0));
            appMetricaConfigPigeon.setAdvIdentifiersTracking((Boolean) arrayList.get(1));
            appMetricaConfigPigeon.setAnrMonitoring((Boolean) arrayList.get(2));
            Object obj = arrayList.get(3);
            Long l3 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            appMetricaConfigPigeon.setAnrMonitoringTimeout(valueOf);
            Object obj2 = arrayList.get(4);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            appMetricaConfigPigeon.setAppBuildNumber(valueOf2);
            appMetricaConfigPigeon.setAppEnvironment((Map) arrayList.get(5));
            appMetricaConfigPigeon.setAppOpenTrackingEnabled((Boolean) arrayList.get(6));
            appMetricaConfigPigeon.setAppVersion((String) arrayList.get(7));
            appMetricaConfigPigeon.setCrashReporting((Boolean) arrayList.get(8));
            appMetricaConfigPigeon.setCustomHosts((List) arrayList.get(9));
            appMetricaConfigPigeon.setDataSendingEnabled((Boolean) arrayList.get(10));
            appMetricaConfigPigeon.setDeviceType((String) arrayList.get(11));
            Object obj3 = arrayList.get(12);
            if (obj3 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            appMetricaConfigPigeon.setDispatchPeriodSeconds(valueOf3);
            appMetricaConfigPigeon.setErrorEnvironment((Map) arrayList.get(13));
            appMetricaConfigPigeon.setFirstActivationAsUpdate((Boolean) arrayList.get(14));
            Object obj4 = arrayList.get(15);
            appMetricaConfigPigeon.setLocation(obj4 == null ? null : LocationPigeon.fromList((ArrayList) obj4));
            appMetricaConfigPigeon.setLocationTracking((Boolean) arrayList.get(16));
            appMetricaConfigPigeon.setLogs((Boolean) arrayList.get(17));
            Object obj5 = arrayList.get(18);
            if (obj5 == null) {
                valueOf4 = null;
            } else {
                valueOf4 = Long.valueOf(obj5 instanceof Integer ? ((Integer) obj5).intValue() : ((Long) obj5).longValue());
            }
            appMetricaConfigPigeon.setMaxReportsCount(valueOf4);
            Object obj6 = arrayList.get(19);
            if (obj6 == null) {
                valueOf5 = null;
            } else {
                valueOf5 = Long.valueOf(obj6 instanceof Integer ? ((Integer) obj6).intValue() : ((Long) obj6).longValue());
            }
            appMetricaConfigPigeon.setMaxReportsInDatabaseCount(valueOf5);
            appMetricaConfigPigeon.setNativeCrashReporting((Boolean) arrayList.get(20));
            Object obj7 = arrayList.get(21);
            appMetricaConfigPigeon.setPreloadInfo(obj7 == null ? null : PreloadInfoPigeon.fromList((ArrayList) obj7));
            appMetricaConfigPigeon.setRevenueAutoTrackingEnabled((Boolean) arrayList.get(22));
            Object obj8 = arrayList.get(23);
            if (obj8 != null) {
                l3 = Long.valueOf(obj8 instanceof Integer ? ((Integer) obj8).intValue() : ((Long) obj8).longValue());
            }
            appMetricaConfigPigeon.setSessionTimeout(l3);
            appMetricaConfigPigeon.setSessionsAutoTrackingEnabled((Boolean) arrayList.get(24));
            appMetricaConfigPigeon.setUserProfileID((String) arrayList.get(25));
            return appMetricaConfigPigeon;
        }

        public Boolean getAdvIdentifiersTracking() {
            return this.advIdentifiersTracking;
        }

        public Boolean getAnrMonitoring() {
            return this.anrMonitoring;
        }

        public Long getAnrMonitoringTimeout() {
            return this.anrMonitoringTimeout;
        }

        public String getApiKey() {
            return this.apiKey;
        }

        public Long getAppBuildNumber() {
            return this.appBuildNumber;
        }

        public Map<String, String> getAppEnvironment() {
            return this.appEnvironment;
        }

        public Boolean getAppOpenTrackingEnabled() {
            return this.appOpenTrackingEnabled;
        }

        public String getAppVersion() {
            return this.appVersion;
        }

        public Boolean getCrashReporting() {
            return this.crashReporting;
        }

        public List<String> getCustomHosts() {
            return this.customHosts;
        }

        public Boolean getDataSendingEnabled() {
            return this.dataSendingEnabled;
        }

        public String getDeviceType() {
            return this.deviceType;
        }

        public Long getDispatchPeriodSeconds() {
            return this.dispatchPeriodSeconds;
        }

        public Map<String, String> getErrorEnvironment() {
            return this.errorEnvironment;
        }

        public Boolean getFirstActivationAsUpdate() {
            return this.firstActivationAsUpdate;
        }

        public LocationPigeon getLocation() {
            return this.location;
        }

        public Boolean getLocationTracking() {
            return this.locationTracking;
        }

        public Boolean getLogs() {
            return this.logs;
        }

        public Long getMaxReportsCount() {
            return this.maxReportsCount;
        }

        public Long getMaxReportsInDatabaseCount() {
            return this.maxReportsInDatabaseCount;
        }

        public Boolean getNativeCrashReporting() {
            return this.nativeCrashReporting;
        }

        public PreloadInfoPigeon getPreloadInfo() {
            return this.preloadInfo;
        }

        public Boolean getRevenueAutoTrackingEnabled() {
            return this.revenueAutoTrackingEnabled;
        }

        public Long getSessionTimeout() {
            return this.sessionTimeout;
        }

        public Boolean getSessionsAutoTrackingEnabled() {
            return this.sessionsAutoTrackingEnabled;
        }

        public String getUserProfileID() {
            return this.userProfileID;
        }

        public void setAdvIdentifiersTracking(Boolean bool) {
            this.advIdentifiersTracking = bool;
        }

        public void setAnrMonitoring(Boolean bool) {
            this.anrMonitoring = bool;
        }

        public void setAnrMonitoringTimeout(Long l3) {
            this.anrMonitoringTimeout = l3;
        }

        public void setApiKey(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.apiKey = str;
        }

        public void setAppBuildNumber(Long l3) {
            this.appBuildNumber = l3;
        }

        public void setAppEnvironment(Map<String, String> map) {
            this.appEnvironment = map;
        }

        public void setAppOpenTrackingEnabled(Boolean bool) {
            this.appOpenTrackingEnabled = bool;
        }

        public void setAppVersion(String str) {
            this.appVersion = str;
        }

        public void setCrashReporting(Boolean bool) {
            this.crashReporting = bool;
        }

        public void setCustomHosts(List<String> list) {
            this.customHosts = list;
        }

        public void setDataSendingEnabled(Boolean bool) {
            this.dataSendingEnabled = bool;
        }

        public void setDeviceType(String str) {
            this.deviceType = str;
        }

        public void setDispatchPeriodSeconds(Long l3) {
            this.dispatchPeriodSeconds = l3;
        }

        public void setErrorEnvironment(Map<String, String> map) {
            this.errorEnvironment = map;
        }

        public void setFirstActivationAsUpdate(Boolean bool) {
            this.firstActivationAsUpdate = bool;
        }

        public void setLocation(LocationPigeon locationPigeon) {
            this.location = locationPigeon;
        }

        public void setLocationTracking(Boolean bool) {
            this.locationTracking = bool;
        }

        public void setLogs(Boolean bool) {
            this.logs = bool;
        }

        public void setMaxReportsCount(Long l3) {
            this.maxReportsCount = l3;
        }

        public void setMaxReportsInDatabaseCount(Long l3) {
            this.maxReportsInDatabaseCount = l3;
        }

        public void setNativeCrashReporting(Boolean bool) {
            this.nativeCrashReporting = bool;
        }

        public void setPreloadInfo(PreloadInfoPigeon preloadInfoPigeon) {
            this.preloadInfo = preloadInfoPigeon;
        }

        public void setRevenueAutoTrackingEnabled(Boolean bool) {
            this.revenueAutoTrackingEnabled = bool;
        }

        public void setSessionTimeout(Long l3) {
            this.sessionTimeout = l3;
        }

        public void setSessionsAutoTrackingEnabled(Boolean bool) {
            this.sessionsAutoTrackingEnabled = bool;
        }

        public void setUserProfileID(String str) {
            this.userProfileID = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(26);
            arrayList.add(this.apiKey);
            arrayList.add(this.advIdentifiersTracking);
            arrayList.add(this.anrMonitoring);
            arrayList.add(this.anrMonitoringTimeout);
            arrayList.add(this.appBuildNumber);
            arrayList.add(this.appEnvironment);
            arrayList.add(this.appOpenTrackingEnabled);
            arrayList.add(this.appVersion);
            arrayList.add(this.crashReporting);
            arrayList.add(this.customHosts);
            arrayList.add(this.dataSendingEnabled);
            arrayList.add(this.deviceType);
            arrayList.add(this.dispatchPeriodSeconds);
            arrayList.add(this.errorEnvironment);
            arrayList.add(this.firstActivationAsUpdate);
            LocationPigeon locationPigeon = this.location;
            arrayList.add(locationPigeon == null ? null : locationPigeon.toList());
            arrayList.add(this.locationTracking);
            arrayList.add(this.logs);
            arrayList.add(this.maxReportsCount);
            arrayList.add(this.maxReportsInDatabaseCount);
            arrayList.add(this.nativeCrashReporting);
            PreloadInfoPigeon preloadInfoPigeon = this.preloadInfo;
            arrayList.add(preloadInfoPigeon != null ? preloadInfoPigeon.toList() : null);
            arrayList.add(this.revenueAutoTrackingEnabled);
            arrayList.add(this.sessionTimeout);
            arrayList.add(this.sessionsAutoTrackingEnabled);
            arrayList.add(this.userProfileID);
            return arrayList;
        }
    }

    public static final class AppMetricaDeferredDeeplinkErrorPigeon {
        private String description;
        private String message;
        private AppMetricaDeferredDeeplinkReasonPigeon reason;

        public static final class Builder {
            private String description;
            private String message;
            private AppMetricaDeferredDeeplinkReasonPigeon reason;

            public AppMetricaDeferredDeeplinkErrorPigeon build() {
                AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon = new AppMetricaDeferredDeeplinkErrorPigeon();
                appMetricaDeferredDeeplinkErrorPigeon.setReason(this.reason);
                appMetricaDeferredDeeplinkErrorPigeon.setDescription(this.description);
                appMetricaDeferredDeeplinkErrorPigeon.setMessage(this.message);
                return appMetricaDeferredDeeplinkErrorPigeon;
            }

            public Builder setDescription(String str) {
                this.description = str;
                return this;
            }

            public Builder setMessage(String str) {
                this.message = str;
                return this;
            }

            public Builder setReason(AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon) {
                this.reason = appMetricaDeferredDeeplinkReasonPigeon;
                return this;
            }
        }

        public static AppMetricaDeferredDeeplinkErrorPigeon fromList(ArrayList<Object> arrayList) {
            AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon = new AppMetricaDeferredDeeplinkErrorPigeon();
            Object obj = arrayList.get(0);
            appMetricaDeferredDeeplinkErrorPigeon.setReason(obj == null ? null : AppMetricaDeferredDeeplinkReasonPigeon.values()[((Integer) obj).intValue()]);
            appMetricaDeferredDeeplinkErrorPigeon.setDescription((String) arrayList.get(1));
            appMetricaDeferredDeeplinkErrorPigeon.setMessage((String) arrayList.get(2));
            return appMetricaDeferredDeeplinkErrorPigeon;
        }

        public String getDescription() {
            return this.description;
        }

        public String getMessage() {
            return this.message;
        }

        public AppMetricaDeferredDeeplinkReasonPigeon getReason() {
            return this.reason;
        }

        public void setDescription(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"description\" is null.");
            }
            this.description = str;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public void setReason(AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon) {
            if (appMetricaDeferredDeeplinkReasonPigeon == null) {
                throw new IllegalStateException("Nonnull field \"reason\" is null.");
            }
            this.reason = appMetricaDeferredDeeplinkReasonPigeon;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon = this.reason;
            arrayList.add(appMetricaDeferredDeeplinkReasonPigeon == null ? null : Integer.valueOf(appMetricaDeferredDeeplinkReasonPigeon.index));
            arrayList.add(this.description);
            arrayList.add(this.message);
            return arrayList;
        }
    }

    public static final class AppMetricaDeferredDeeplinkParametersPigeon {
        private AppMetricaDeferredDeeplinkErrorPigeon error;
        private Map<String, String> parameters;

        public static final class Builder {
            private AppMetricaDeferredDeeplinkErrorPigeon error;
            private Map<String, String> parameters;

            public AppMetricaDeferredDeeplinkParametersPigeon build() {
                AppMetricaDeferredDeeplinkParametersPigeon appMetricaDeferredDeeplinkParametersPigeon = new AppMetricaDeferredDeeplinkParametersPigeon();
                appMetricaDeferredDeeplinkParametersPigeon.setParameters(this.parameters);
                appMetricaDeferredDeeplinkParametersPigeon.setError(this.error);
                return appMetricaDeferredDeeplinkParametersPigeon;
            }

            public Builder setError(AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon) {
                this.error = appMetricaDeferredDeeplinkErrorPigeon;
                return this;
            }

            public Builder setParameters(Map<String, String> map) {
                this.parameters = map;
                return this;
            }
        }

        public static AppMetricaDeferredDeeplinkParametersPigeon fromList(ArrayList<Object> arrayList) {
            AppMetricaDeferredDeeplinkParametersPigeon appMetricaDeferredDeeplinkParametersPigeon = new AppMetricaDeferredDeeplinkParametersPigeon();
            appMetricaDeferredDeeplinkParametersPigeon.setParameters((Map) arrayList.get(0));
            Object obj = arrayList.get(1);
            appMetricaDeferredDeeplinkParametersPigeon.setError(obj == null ? null : AppMetricaDeferredDeeplinkErrorPigeon.fromList((ArrayList) obj));
            return appMetricaDeferredDeeplinkParametersPigeon;
        }

        public AppMetricaDeferredDeeplinkErrorPigeon getError() {
            return this.error;
        }

        public Map<String, String> getParameters() {
            return this.parameters;
        }

        public void setError(AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon) {
            this.error = appMetricaDeferredDeeplinkErrorPigeon;
        }

        public void setParameters(Map<String, String> map) {
            this.parameters = map;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.parameters);
            AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon = this.error;
            arrayList.add(appMetricaDeferredDeeplinkErrorPigeon == null ? null : appMetricaDeferredDeeplinkErrorPigeon.toList());
            return arrayList;
        }
    }

    public static final class AppMetricaDeferredDeeplinkPigeon {
        private String deeplink;
        private AppMetricaDeferredDeeplinkErrorPigeon error;

        public static final class Builder {
            private String deeplink;
            private AppMetricaDeferredDeeplinkErrorPigeon error;

            public AppMetricaDeferredDeeplinkPigeon build() {
                AppMetricaDeferredDeeplinkPigeon appMetricaDeferredDeeplinkPigeon = new AppMetricaDeferredDeeplinkPigeon();
                appMetricaDeferredDeeplinkPigeon.setDeeplink(this.deeplink);
                appMetricaDeferredDeeplinkPigeon.setError(this.error);
                return appMetricaDeferredDeeplinkPigeon;
            }

            public Builder setDeeplink(String str) {
                this.deeplink = str;
                return this;
            }

            public Builder setError(AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon) {
                this.error = appMetricaDeferredDeeplinkErrorPigeon;
                return this;
            }
        }

        public static AppMetricaDeferredDeeplinkPigeon fromList(ArrayList<Object> arrayList) {
            AppMetricaDeferredDeeplinkPigeon appMetricaDeferredDeeplinkPigeon = new AppMetricaDeferredDeeplinkPigeon();
            appMetricaDeferredDeeplinkPigeon.setDeeplink((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            appMetricaDeferredDeeplinkPigeon.setError(obj == null ? null : AppMetricaDeferredDeeplinkErrorPigeon.fromList((ArrayList) obj));
            return appMetricaDeferredDeeplinkPigeon;
        }

        public String getDeeplink() {
            return this.deeplink;
        }

        public AppMetricaDeferredDeeplinkErrorPigeon getError() {
            return this.error;
        }

        public void setDeeplink(String str) {
            this.deeplink = str;
        }

        public void setError(AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon) {
            this.error = appMetricaDeferredDeeplinkErrorPigeon;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.deeplink);
            AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon = this.error;
            arrayList.add(appMetricaDeferredDeeplinkErrorPigeon == null ? null : appMetricaDeferredDeeplinkErrorPigeon.toList());
            return arrayList;
        }
    }

    public enum AppMetricaDeferredDeeplinkReasonPigeon {
        NOT_A_FIRST_LAUNCH(0),
        PARSE_ERROR(1),
        UNKNOWN(2),
        NO_REFERRER(3),
        NO_ERROR(4);

        final int index;

        AppMetricaDeferredDeeplinkReasonPigeon(int i3) {
            this.index = i3;
        }
    }

    public interface AppMetricaLibraryAdapterPigeon {
        static k getCodec() {
            return new r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(AppMetricaLibraryAdapterPigeon appMetricaLibraryAdapterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaLibraryAdapterPigeon.subscribeForAutoCollectedData((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        static void setup(f fVar, AppMetricaLibraryAdapterPigeon appMetricaLibraryAdapterPigeon) {
            D0.a aVar = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaLibraryAdapterPigeon.subscribeForAutoCollectedData", getCodec(), (j) null);
            if (appMetricaLibraryAdapterPigeon != null) {
                aVar.g(new F1.b(23, appMetricaLibraryAdapterPigeon));
            } else {
                aVar.g(null);
            }
        }

        void subscribeForAutoCollectedData(String str);
    }

    public interface AppMetricaPigeon {
        static k getCodec() {
            return AppMetricaPigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.activate((AppMetricaConfigPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.activateReporter((ReporterConfigPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$10(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                appMetricaPigeon.putErrorEnvironmentValue((String) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$11(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportAdRevenue((AdRevenuePigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$12(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportAppOpen((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$13(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportECommerce((ECommerceEventPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$14(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                appMetricaPigeon.reportError((ErrorDetailsPigeon) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$15(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                appMetricaPigeon.reportErrorWithGroup((String) arrayList2.get(0), (ErrorDetailsPigeon) arrayList2.get(1), (String) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$16(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportEvent((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$17(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                appMetricaPigeon.reportEventWithJson((String) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$18(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportExternalAttribution((ExternalAttributionPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$19(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportReferralUrl((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.clearAppEnvironment();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$20(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportRevenue((RevenuePigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$21(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportUnhandledException((ErrorDetailsPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$22(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.reportUserProfile((UserProfilePigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$23(AppMetricaPigeon appMetricaPigeon, Object obj, final T1.c cVar) {
            final ArrayList arrayList = new ArrayList();
            appMetricaPigeon.requestDeferredDeeplink(new Result<AppMetricaDeferredDeeplinkPigeon>() { // from class: io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.1
                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void error(Throwable th) {
                    cVar.l(Pigeon.wrapError(th));
                }

                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void success(AppMetricaDeferredDeeplinkPigeon appMetricaDeferredDeeplinkPigeon) {
                    arrayList.add(0, appMetricaDeferredDeeplinkPigeon);
                    cVar.l(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$24(AppMetricaPigeon appMetricaPigeon, Object obj, final T1.c cVar) {
            final ArrayList arrayList = new ArrayList();
            appMetricaPigeon.requestDeferredDeeplinkParameters(new Result<AppMetricaDeferredDeeplinkParametersPigeon>() { // from class: io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.2
                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void error(Throwable th) {
                    cVar.l(Pigeon.wrapError(th));
                }

                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void success(AppMetricaDeferredDeeplinkParametersPigeon appMetricaDeferredDeeplinkParametersPigeon) {
                    arrayList.add(0, appMetricaDeferredDeeplinkParametersPigeon);
                    cVar.l(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$25(AppMetricaPigeon appMetricaPigeon, Object obj, final T1.c cVar) {
            final ArrayList arrayList = new ArrayList();
            appMetricaPigeon.requestStartupParams((List) ((ArrayList) obj).get(0), new Result<StartupParamsPigeon>() { // from class: io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.3
                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void error(Throwable th) {
                    cVar.l(Pigeon.wrapError(th));
                }

                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void success(StartupParamsPigeon startupParamsPigeon) {
                    arrayList.add(0, startupParamsPigeon);
                    cVar.l(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$26(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.resumeSession();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$27(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.sendEventsBuffer();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$28(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.setAdvIdentifiersTracking((Boolean) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$29(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.setDataSendingEnabled((Boolean) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.enableActivityAutoTracking();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$30(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.setLocation((LocationPigeon) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$31(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.setLocationTracking((Boolean) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$32(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.setUserProfileID((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$33(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.handlePluginInitFinished();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$34(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.touchReporter((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, appMetricaPigeon.getDeviceId());
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, appMetricaPigeon.getLibraryApiLevel());
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, appMetricaPigeon.getLibraryVersion());
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, appMetricaPigeon.getUuid());
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                appMetricaPigeon.pauseSession();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$9(AppMetricaPigeon appMetricaPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                appMetricaPigeon.putAppEnvironmentValue((String) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        static void setup(f fVar, final AppMetricaPigeon appMetricaPigeon) {
            D0.a aVar = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.activate", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i3 = 0;
                aVar.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i3) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar.g(null);
            }
            D0.a aVar2 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.activateReporter", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i4 = 2;
                aVar2.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i4) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar2.g(null);
            }
            D0.a aVar3 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.clearAppEnvironment", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i5 = 14;
                aVar3.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i5) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar3.g(null);
            }
            D0.a aVar4 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.enableActivityAutoTracking", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i6 = 20;
                aVar4.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i6) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar4.g(null);
            }
            D0.a aVar5 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.getDeviceId", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i7 = 21;
                aVar5.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i7) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar5.g(null);
            }
            D0.a aVar6 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.getLibraryApiLevel", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i8 = 23;
                aVar6.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i8) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar6.g(null);
            }
            D0.a aVar7 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.getLibraryVersion", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i9 = 24;
                aVar7.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i9) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar7.g(null);
            }
            D0.a aVar8 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.getUuid", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i10 = 25;
                aVar8.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i10) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar8.g(null);
            }
            D0.a aVar9 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.pauseSession", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i11 = 26;
                aVar9.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i11) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar9.g(null);
            }
            D0.a aVar10 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.putAppEnvironmentValue", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i12 = 27;
                aVar10.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i12) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar10.g(null);
            }
            D0.a aVar11 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.putErrorEnvironmentValue", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i13 = 11;
                aVar11.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i13) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar11.g(null);
            }
            D0.a aVar12 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportAdRevenue", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i14 = 22;
                aVar12.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i14) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar12.g(null);
            }
            D0.a aVar13 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportAppOpen", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i15 = 28;
                aVar13.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i15) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar13.g(null);
            }
            D0.a aVar14 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportECommerce", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i16 = 29;
                aVar14.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i16) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar14.g(null);
            }
            D0.a aVar15 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportError", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i17 = 0;
                aVar15.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5524b;

                    {
                        this.f5524b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i17) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$14(this.f5524b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$15(this.f5524b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$16(this.f5524b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$17(this.f5524b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$18(this.f5524b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar15.g(null);
            }
            D0.a aVar16 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportErrorWithGroup", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i18 = 1;
                aVar16.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5524b;

                    {
                        this.f5524b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i18) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$14(this.f5524b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$15(this.f5524b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$16(this.f5524b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$17(this.f5524b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$18(this.f5524b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar16.g(null);
            }
            D0.a aVar17 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportEvent", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i19 = 2;
                aVar17.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5524b;

                    {
                        this.f5524b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i19) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$14(this.f5524b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$15(this.f5524b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$16(this.f5524b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$17(this.f5524b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$18(this.f5524b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar17.g(null);
            }
            D0.a aVar18 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportEventWithJson", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i20 = 3;
                aVar18.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5524b;

                    {
                        this.f5524b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i20) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$14(this.f5524b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$15(this.f5524b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$16(this.f5524b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$17(this.f5524b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$18(this.f5524b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar18.g(null);
            }
            D0.a aVar19 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportExternalAttribution", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i21 = 4;
                aVar19.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5524b;

                    {
                        this.f5524b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i21) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$14(this.f5524b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$15(this.f5524b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$16(this.f5524b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$17(this.f5524b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$18(this.f5524b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar19.g(null);
            }
            D0.a aVar20 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportReferralUrl", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i22 = 1;
                aVar20.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i22) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar20.g(null);
            }
            D0.a aVar21 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportRevenue", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i23 = 3;
                aVar21.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i23) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar21.g(null);
            }
            D0.a aVar22 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportUnhandledException", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i24 = 4;
                aVar22.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i24) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar22.g(null);
            }
            D0.a aVar23 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportUserProfile", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i25 = 5;
                aVar23.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i25) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar23.g(null);
            }
            D0.a aVar24 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.requestDeferredDeeplink", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i26 = 6;
                aVar24.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i26) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar24.g(null);
            }
            D0.a aVar25 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.requestDeferredDeeplinkParameters", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i27 = 7;
                aVar25.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i27) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar25.g(null);
            }
            D0.a aVar26 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.requestStartupParams", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i28 = 8;
                aVar26.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i28) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar26.g(null);
            }
            D0.a aVar27 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.resumeSession", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i29 = 9;
                aVar27.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i29) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar27.g(null);
            }
            D0.a aVar28 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.sendEventsBuffer", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i30 = 10;
                aVar28.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i30) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar28.g(null);
            }
            D0.a aVar29 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setAdvIdentifiersTracking", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i31 = 12;
                aVar29.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i31) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar29.g(null);
            }
            D0.a aVar30 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setDataSendingEnabled", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i32 = 13;
                aVar30.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i32) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar30.g(null);
            }
            D0.a aVar31 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setLocation", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i33 = 15;
                aVar31.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i33) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar31.g(null);
            }
            D0.a aVar32 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setLocationTracking", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i34 = 16;
                aVar32.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i34) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar32.g(null);
            }
            D0.a aVar33 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setUserProfileID", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i35 = 17;
                aVar33.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i35) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar33.g(null);
            }
            D0.a aVar34 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.handlePluginInitFinished", getCodec(), (j) null);
            if (appMetricaPigeon != null) {
                final int i36 = 18;
                aVar34.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i36) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar34.g(null);
            }
            D0.a aVar35 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.touchReporter", getCodec(), (j) null);
            if (appMetricaPigeon == null) {
                aVar35.g(null);
            } else {
                final int i37 = 19;
                aVar35.g(new T1.b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.AppMetricaPigeon f5522b;

                    {
                        this.f5522b = appMetricaPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i37) {
                            case 0:
                                Pigeon.AppMetricaPigeon.lambda$setup$0(this.f5522b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.AppMetricaPigeon.lambda$setup$19(this.f5522b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.AppMetricaPigeon.lambda$setup$1(this.f5522b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.AppMetricaPigeon.lambda$setup$20(this.f5522b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.AppMetricaPigeon.lambda$setup$21(this.f5522b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.AppMetricaPigeon.lambda$setup$22(this.f5522b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.AppMetricaPigeon.lambda$setup$23(this.f5522b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.AppMetricaPigeon.lambda$setup$24(this.f5522b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.AppMetricaPigeon.lambda$setup$25(this.f5522b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.AppMetricaPigeon.lambda$setup$26(this.f5522b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.AppMetricaPigeon.lambda$setup$27(this.f5522b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.AppMetricaPigeon.lambda$setup$10(this.f5522b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.AppMetricaPigeon.lambda$setup$28(this.f5522b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.AppMetricaPigeon.lambda$setup$29(this.f5522b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.AppMetricaPigeon.lambda$setup$2(this.f5522b, obj, eVar);
                                break;
                            case 15:
                                Pigeon.AppMetricaPigeon.lambda$setup$30(this.f5522b, obj, eVar);
                                break;
                            case 16:
                                Pigeon.AppMetricaPigeon.lambda$setup$31(this.f5522b, obj, eVar);
                                break;
                            case 17:
                                Pigeon.AppMetricaPigeon.lambda$setup$32(this.f5522b, obj, eVar);
                                break;
                            case 18:
                                Pigeon.AppMetricaPigeon.lambda$setup$33(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7759C /* 19 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$34(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7760D /* 20 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$3(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7761E /* 21 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$4(this.f5522b, obj, eVar);
                                break;
                            case 22:
                                Pigeon.AppMetricaPigeon.lambda$setup$11(this.f5522b, obj, eVar);
                                break;
                            case 23:
                                Pigeon.AppMetricaPigeon.lambda$setup$5(this.f5522b, obj, eVar);
                                break;
                            case 24:
                                Pigeon.AppMetricaPigeon.lambda$setup$6(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7762F /* 25 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$7(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7763G /* 26 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$8(this.f5522b, obj, eVar);
                                break;
                            case C0644l9.f7764H /* 27 */:
                                Pigeon.AppMetricaPigeon.lambda$setup$9(this.f5522b, obj, eVar);
                                break;
                            case 28:
                                Pigeon.AppMetricaPigeon.lambda$setup$12(this.f5522b, obj, eVar);
                                break;
                            default:
                                Pigeon.AppMetricaPigeon.lambda$setup$13(this.f5522b, obj, eVar);
                                break;
                        }
                    }
                });
            }
        }

        void activate(AppMetricaConfigPigeon appMetricaConfigPigeon);

        void activateReporter(ReporterConfigPigeon reporterConfigPigeon);

        void clearAppEnvironment();

        void enableActivityAutoTracking();

        String getDeviceId();

        Long getLibraryApiLevel();

        String getLibraryVersion();

        String getUuid();

        void handlePluginInitFinished();

        void pauseSession();

        void putAppEnvironmentValue(String str, String str2);

        void putErrorEnvironmentValue(String str, String str2);

        void reportAdRevenue(AdRevenuePigeon adRevenuePigeon);

        void reportAppOpen(String str);

        void reportECommerce(ECommerceEventPigeon eCommerceEventPigeon);

        void reportError(ErrorDetailsPigeon errorDetailsPigeon, String str);

        void reportErrorWithGroup(String str, ErrorDetailsPigeon errorDetailsPigeon, String str2);

        void reportEvent(String str);

        void reportEventWithJson(String str, String str2);

        void reportExternalAttribution(ExternalAttributionPigeon externalAttributionPigeon);

        void reportReferralUrl(String str);

        void reportRevenue(RevenuePigeon revenuePigeon);

        void reportUnhandledException(ErrorDetailsPigeon errorDetailsPigeon);

        void reportUserProfile(UserProfilePigeon userProfilePigeon);

        void requestDeferredDeeplink(Result<AppMetricaDeferredDeeplinkPigeon> result);

        void requestDeferredDeeplinkParameters(Result<AppMetricaDeferredDeeplinkParametersPigeon> result);

        void requestStartupParams(List<String> list, Result<StartupParamsPigeon> result);

        void resumeSession();

        void sendEventsBuffer();

        void setAdvIdentifiersTracking(Boolean bool);

        void setDataSendingEnabled(Boolean bool);

        void setLocation(LocationPigeon locationPigeon);

        void setLocationTracking(Boolean bool);

        void setUserProfileID(String str);

        void touchReporter(String str);
    }

    public static class AppMetricaPigeonCodec extends r {
        public static final AppMetricaPigeonCodec INSTANCE = new AppMetricaPigeonCodec();

        private AppMetricaPigeonCodec() {
        }

        @Override // T1.r
        public Object readValueOfType(byte b3, ByteBuffer byteBuffer) {
            switch (b3) {
                case Byte.MIN_VALUE:
                    return AdRevenuePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return AppMetricaConfigPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return AppMetricaDeferredDeeplinkErrorPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return AppMetricaDeferredDeeplinkParametersPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return AppMetricaDeferredDeeplinkPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return ECommerceAmountPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return ECommerceAmountPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -121:
                    return ECommerceCartItemPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -120:
                    return ECommerceEventPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return ECommerceOrderPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return ECommercePricePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return ECommercePricePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return ECommerceProductPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return ECommerceProductPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return ECommerceReferrerPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return ECommerceScreenPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return ErrorDetailsPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return ErrorDetailsPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -110:
                    return ExternalAttributionPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -109:
                    return LocationPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -108:
                    return PreloadInfoPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -107:
                    return ReceiptPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -106:
                    return ReporterConfigPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -105:
                    return RevenuePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -104:
                    return StackTraceElementPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -103:
                    return StartupParamsItemPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -102:
                    return StartupParamsPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -101:
                    return StartupParamsReasonPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -100:
                    return StartupParamsResultPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -99:
                    return UserProfileAttributePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -98:
                    return UserProfilePigeon.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b3, byteBuffer);
            }
        }

        @Override // T1.r
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AdRevenuePigeon) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AdRevenuePigeon) obj).toList());
                return;
            }
            if (obj instanceof AppMetricaConfigPigeon) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((AppMetricaConfigPigeon) obj).toList());
                return;
            }
            if (obj instanceof AppMetricaDeferredDeeplinkErrorPigeon) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((AppMetricaDeferredDeeplinkErrorPigeon) obj).toList());
                return;
            }
            if (obj instanceof AppMetricaDeferredDeeplinkParametersPigeon) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((AppMetricaDeferredDeeplinkParametersPigeon) obj).toList());
                return;
            }
            if (obj instanceof AppMetricaDeferredDeeplinkPigeon) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((AppMetricaDeferredDeeplinkPigeon) obj).toList());
                return;
            }
            boolean z3 = obj instanceof ECommerceAmountPigeon;
            if (z3) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((ECommerceAmountPigeon) obj).toList());
                return;
            }
            if (z3) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((ECommerceAmountPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceCartItemPigeon) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((ECommerceCartItemPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceEventPigeon) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, ((ECommerceEventPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceOrderPigeon) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((ECommerceOrderPigeon) obj).toList());
                return;
            }
            boolean z4 = obj instanceof ECommercePricePigeon;
            if (z4) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((ECommercePricePigeon) obj).toList());
                return;
            }
            if (z4) {
                byteArrayOutputStream.write(139);
                writeValue(byteArrayOutputStream, ((ECommercePricePigeon) obj).toList());
                return;
            }
            boolean z5 = obj instanceof ECommerceProductPigeon;
            if (z5) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((ECommerceProductPigeon) obj).toList());
                return;
            }
            if (z5) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((ECommerceProductPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceReferrerPigeon) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((ECommerceReferrerPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceScreenPigeon) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((ECommerceScreenPigeon) obj).toList());
                return;
            }
            boolean z6 = obj instanceof ErrorDetailsPigeon;
            if (z6) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((ErrorDetailsPigeon) obj).toList());
                return;
            }
            if (z6) {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((ErrorDetailsPigeon) obj).toList());
                return;
            }
            if (obj instanceof ExternalAttributionPigeon) {
                byteArrayOutputStream.write(146);
                writeValue(byteArrayOutputStream, ((ExternalAttributionPigeon) obj).toList());
                return;
            }
            if (obj instanceof LocationPigeon) {
                byteArrayOutputStream.write(147);
                writeValue(byteArrayOutputStream, ((LocationPigeon) obj).toList());
                return;
            }
            if (obj instanceof PreloadInfoPigeon) {
                byteArrayOutputStream.write(148);
                writeValue(byteArrayOutputStream, ((PreloadInfoPigeon) obj).toList());
                return;
            }
            if (obj instanceof ReceiptPigeon) {
                byteArrayOutputStream.write(149);
                writeValue(byteArrayOutputStream, ((ReceiptPigeon) obj).toList());
                return;
            }
            if (obj instanceof ReporterConfigPigeon) {
                byteArrayOutputStream.write(150);
                writeValue(byteArrayOutputStream, ((ReporterConfigPigeon) obj).toList());
                return;
            }
            if (obj instanceof RevenuePigeon) {
                byteArrayOutputStream.write(151);
                writeValue(byteArrayOutputStream, ((RevenuePigeon) obj).toList());
                return;
            }
            if (obj instanceof StackTraceElementPigeon) {
                byteArrayOutputStream.write(152);
                writeValue(byteArrayOutputStream, ((StackTraceElementPigeon) obj).toList());
                return;
            }
            if (obj instanceof StartupParamsItemPigeon) {
                byteArrayOutputStream.write(153);
                writeValue(byteArrayOutputStream, ((StartupParamsItemPigeon) obj).toList());
                return;
            }
            if (obj instanceof StartupParamsPigeon) {
                byteArrayOutputStream.write(154);
                writeValue(byteArrayOutputStream, ((StartupParamsPigeon) obj).toList());
                return;
            }
            if (obj instanceof StartupParamsReasonPigeon) {
                byteArrayOutputStream.write(155);
                writeValue(byteArrayOutputStream, ((StartupParamsReasonPigeon) obj).toList());
                return;
            }
            if (obj instanceof StartupParamsResultPigeon) {
                byteArrayOutputStream.write(156);
                writeValue(byteArrayOutputStream, ((StartupParamsResultPigeon) obj).toList());
            } else if (obj instanceof UserProfileAttributePigeon) {
                byteArrayOutputStream.write(157);
                writeValue(byteArrayOutputStream, ((UserProfileAttributePigeon) obj).toList());
            } else if (!(obj instanceof UserProfilePigeon)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(158);
                writeValue(byteArrayOutputStream, ((UserProfilePigeon) obj).toList());
            }
        }
    }

    public static final class ECommerceAmountPigeon {
        private String amount;
        private String currency;

        public static final class Builder {
            private String amount;
            private String currency;

            public ECommerceAmountPigeon build() {
                ECommerceAmountPigeon eCommerceAmountPigeon = new ECommerceAmountPigeon();
                eCommerceAmountPigeon.setAmount(this.amount);
                eCommerceAmountPigeon.setCurrency(this.currency);
                return eCommerceAmountPigeon;
            }

            public Builder setAmount(String str) {
                this.amount = str;
                return this;
            }

            public Builder setCurrency(String str) {
                this.currency = str;
                return this;
            }
        }

        public static ECommerceAmountPigeon fromList(ArrayList<Object> arrayList) {
            ECommerceAmountPigeon eCommerceAmountPigeon = new ECommerceAmountPigeon();
            eCommerceAmountPigeon.setAmount((String) arrayList.get(0));
            eCommerceAmountPigeon.setCurrency((String) arrayList.get(1));
            return eCommerceAmountPigeon;
        }

        public String getAmount() {
            return this.amount;
        }

        public String getCurrency() {
            return this.currency;
        }

        public void setAmount(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"amount\" is null.");
            }
            this.amount = str;
        }

        public void setCurrency(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"currency\" is null.");
            }
            this.currency = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.amount);
            arrayList.add(this.currency);
            return arrayList;
        }
    }

    public static final class ECommerceCartItemPigeon {
        private ECommerceProductPigeon product;
        private String quantity;
        private ECommerceReferrerPigeon referrer;
        private ECommercePricePigeon revenue;

        public static final class Builder {
            private ECommerceProductPigeon product;
            private String quantity;
            private ECommerceReferrerPigeon referrer;
            private ECommercePricePigeon revenue;

            public ECommerceCartItemPigeon build() {
                ECommerceCartItemPigeon eCommerceCartItemPigeon = new ECommerceCartItemPigeon();
                eCommerceCartItemPigeon.setProduct(this.product);
                eCommerceCartItemPigeon.setQuantity(this.quantity);
                eCommerceCartItemPigeon.setRevenue(this.revenue);
                eCommerceCartItemPigeon.setReferrer(this.referrer);
                return eCommerceCartItemPigeon;
            }

            public Builder setProduct(ECommerceProductPigeon eCommerceProductPigeon) {
                this.product = eCommerceProductPigeon;
                return this;
            }

            public Builder setQuantity(String str) {
                this.quantity = str;
                return this;
            }

            public Builder setReferrer(ECommerceReferrerPigeon eCommerceReferrerPigeon) {
                this.referrer = eCommerceReferrerPigeon;
                return this;
            }

            public Builder setRevenue(ECommercePricePigeon eCommercePricePigeon) {
                this.revenue = eCommercePricePigeon;
                return this;
            }
        }

        public static ECommerceCartItemPigeon fromList(ArrayList<Object> arrayList) {
            ECommerceCartItemPigeon eCommerceCartItemPigeon = new ECommerceCartItemPigeon();
            Object obj = arrayList.get(0);
            eCommerceCartItemPigeon.setProduct(obj == null ? null : ECommerceProductPigeon.fromList((ArrayList) obj));
            eCommerceCartItemPigeon.setQuantity((String) arrayList.get(1));
            Object obj2 = arrayList.get(2);
            eCommerceCartItemPigeon.setRevenue(obj2 == null ? null : ECommercePricePigeon.fromList((ArrayList) obj2));
            Object obj3 = arrayList.get(3);
            eCommerceCartItemPigeon.setReferrer(obj3 != null ? ECommerceReferrerPigeon.fromList((ArrayList) obj3) : null);
            return eCommerceCartItemPigeon;
        }

        public ECommerceProductPigeon getProduct() {
            return this.product;
        }

        public String getQuantity() {
            return this.quantity;
        }

        public ECommerceReferrerPigeon getReferrer() {
            return this.referrer;
        }

        public ECommercePricePigeon getRevenue() {
            return this.revenue;
        }

        public void setProduct(ECommerceProductPigeon eCommerceProductPigeon) {
            if (eCommerceProductPigeon == null) {
                throw new IllegalStateException("Nonnull field \"product\" is null.");
            }
            this.product = eCommerceProductPigeon;
        }

        public void setQuantity(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"quantity\" is null.");
            }
            this.quantity = str;
        }

        public void setReferrer(ECommerceReferrerPigeon eCommerceReferrerPigeon) {
            this.referrer = eCommerceReferrerPigeon;
        }

        public void setRevenue(ECommercePricePigeon eCommercePricePigeon) {
            if (eCommercePricePigeon == null) {
                throw new IllegalStateException("Nonnull field \"revenue\" is null.");
            }
            this.revenue = eCommercePricePigeon;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            ECommerceProductPigeon eCommerceProductPigeon = this.product;
            arrayList.add(eCommerceProductPigeon == null ? null : eCommerceProductPigeon.toList());
            arrayList.add(this.quantity);
            ECommercePricePigeon eCommercePricePigeon = this.revenue;
            arrayList.add(eCommercePricePigeon == null ? null : eCommercePricePigeon.toList());
            ECommerceReferrerPigeon eCommerceReferrerPigeon = this.referrer;
            arrayList.add(eCommerceReferrerPigeon != null ? eCommerceReferrerPigeon.toList() : null);
            return arrayList;
        }
    }

    public static final class ECommerceEventPigeon {
        private ECommerceCartItemPigeon cartItem;
        private String eventType;
        private ECommerceOrderPigeon order;
        private ECommerceProductPigeon product;
        private ECommerceReferrerPigeon referrer;
        private ECommerceScreenPigeon screen;

        public static final class Builder {
            private ECommerceCartItemPigeon cartItem;
            private String eventType;
            private ECommerceOrderPigeon order;
            private ECommerceProductPigeon product;
            private ECommerceReferrerPigeon referrer;
            private ECommerceScreenPigeon screen;

            public ECommerceEventPigeon build() {
                ECommerceEventPigeon eCommerceEventPigeon = new ECommerceEventPigeon();
                eCommerceEventPigeon.setEventType(this.eventType);
                eCommerceEventPigeon.setCartItem(this.cartItem);
                eCommerceEventPigeon.setOrder(this.order);
                eCommerceEventPigeon.setProduct(this.product);
                eCommerceEventPigeon.setReferrer(this.referrer);
                eCommerceEventPigeon.setScreen(this.screen);
                return eCommerceEventPigeon;
            }

            public Builder setCartItem(ECommerceCartItemPigeon eCommerceCartItemPigeon) {
                this.cartItem = eCommerceCartItemPigeon;
                return this;
            }

            public Builder setEventType(String str) {
                this.eventType = str;
                return this;
            }

            public Builder setOrder(ECommerceOrderPigeon eCommerceOrderPigeon) {
                this.order = eCommerceOrderPigeon;
                return this;
            }

            public Builder setProduct(ECommerceProductPigeon eCommerceProductPigeon) {
                this.product = eCommerceProductPigeon;
                return this;
            }

            public Builder setReferrer(ECommerceReferrerPigeon eCommerceReferrerPigeon) {
                this.referrer = eCommerceReferrerPigeon;
                return this;
            }

            public Builder setScreen(ECommerceScreenPigeon eCommerceScreenPigeon) {
                this.screen = eCommerceScreenPigeon;
                return this;
            }
        }

        public static ECommerceEventPigeon fromList(ArrayList<Object> arrayList) {
            ECommerceEventPigeon eCommerceEventPigeon = new ECommerceEventPigeon();
            eCommerceEventPigeon.setEventType((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            eCommerceEventPigeon.setCartItem(obj == null ? null : ECommerceCartItemPigeon.fromList((ArrayList) obj));
            Object obj2 = arrayList.get(2);
            eCommerceEventPigeon.setOrder(obj2 == null ? null : ECommerceOrderPigeon.fromList((ArrayList) obj2));
            Object obj3 = arrayList.get(3);
            eCommerceEventPigeon.setProduct(obj3 == null ? null : ECommerceProductPigeon.fromList((ArrayList) obj3));
            Object obj4 = arrayList.get(4);
            eCommerceEventPigeon.setReferrer(obj4 == null ? null : ECommerceReferrerPigeon.fromList((ArrayList) obj4));
            Object obj5 = arrayList.get(5);
            eCommerceEventPigeon.setScreen(obj5 != null ? ECommerceScreenPigeon.fromList((ArrayList) obj5) : null);
            return eCommerceEventPigeon;
        }

        public ECommerceCartItemPigeon getCartItem() {
            return this.cartItem;
        }

        public String getEventType() {
            return this.eventType;
        }

        public ECommerceOrderPigeon getOrder() {
            return this.order;
        }

        public ECommerceProductPigeon getProduct() {
            return this.product;
        }

        public ECommerceReferrerPigeon getReferrer() {
            return this.referrer;
        }

        public ECommerceScreenPigeon getScreen() {
            return this.screen;
        }

        public void setCartItem(ECommerceCartItemPigeon eCommerceCartItemPigeon) {
            this.cartItem = eCommerceCartItemPigeon;
        }

        public void setEventType(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"eventType\" is null.");
            }
            this.eventType = str;
        }

        public void setOrder(ECommerceOrderPigeon eCommerceOrderPigeon) {
            this.order = eCommerceOrderPigeon;
        }

        public void setProduct(ECommerceProductPigeon eCommerceProductPigeon) {
            this.product = eCommerceProductPigeon;
        }

        public void setReferrer(ECommerceReferrerPigeon eCommerceReferrerPigeon) {
            this.referrer = eCommerceReferrerPigeon;
        }

        public void setScreen(ECommerceScreenPigeon eCommerceScreenPigeon) {
            this.screen = eCommerceScreenPigeon;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.eventType);
            ECommerceCartItemPigeon eCommerceCartItemPigeon = this.cartItem;
            arrayList.add(eCommerceCartItemPigeon == null ? null : eCommerceCartItemPigeon.toList());
            ECommerceOrderPigeon eCommerceOrderPigeon = this.order;
            arrayList.add(eCommerceOrderPigeon == null ? null : eCommerceOrderPigeon.toList());
            ECommerceProductPigeon eCommerceProductPigeon = this.product;
            arrayList.add(eCommerceProductPigeon == null ? null : eCommerceProductPigeon.toList());
            ECommerceReferrerPigeon eCommerceReferrerPigeon = this.referrer;
            arrayList.add(eCommerceReferrerPigeon == null ? null : eCommerceReferrerPigeon.toList());
            ECommerceScreenPigeon eCommerceScreenPigeon = this.screen;
            arrayList.add(eCommerceScreenPigeon != null ? eCommerceScreenPigeon.toList() : null);
            return arrayList;
        }
    }

    public static final class ECommerceOrderPigeon {
        private String identifier;
        private List<ECommerceCartItemPigeon> items;
        private Map<String, String> payload;

        public static final class Builder {
            private String identifier;
            private List<ECommerceCartItemPigeon> items;
            private Map<String, String> payload;

            public ECommerceOrderPigeon build() {
                ECommerceOrderPigeon eCommerceOrderPigeon = new ECommerceOrderPigeon();
                eCommerceOrderPigeon.setIdentifier(this.identifier);
                eCommerceOrderPigeon.setItems(this.items);
                eCommerceOrderPigeon.setPayload(this.payload);
                return eCommerceOrderPigeon;
            }

            public Builder setIdentifier(String str) {
                this.identifier = str;
                return this;
            }

            public Builder setItems(List<ECommerceCartItemPigeon> list) {
                this.items = list;
                return this;
            }

            public Builder setPayload(Map<String, String> map) {
                this.payload = map;
                return this;
            }
        }

        public static ECommerceOrderPigeon fromList(ArrayList<Object> arrayList) {
            ECommerceOrderPigeon eCommerceOrderPigeon = new ECommerceOrderPigeon();
            eCommerceOrderPigeon.setIdentifier((String) arrayList.get(0));
            eCommerceOrderPigeon.setItems((List) arrayList.get(1));
            eCommerceOrderPigeon.setPayload((Map) arrayList.get(2));
            return eCommerceOrderPigeon;
        }

        public String getIdentifier() {
            return this.identifier;
        }

        public List<ECommerceCartItemPigeon> getItems() {
            return this.items;
        }

        public Map<String, String> getPayload() {
            return this.payload;
        }

        public void setIdentifier(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"identifier\" is null.");
            }
            this.identifier = str;
        }

        public void setItems(List<ECommerceCartItemPigeon> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"items\" is null.");
            }
            this.items = list;
        }

        public void setPayload(Map<String, String> map) {
            this.payload = map;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.identifier);
            arrayList.add(this.items);
            arrayList.add(this.payload);
            return arrayList;
        }
    }

    public static final class ECommercePricePigeon {
        private ECommerceAmountPigeon fiat;
        private List<ECommerceAmountPigeon> internalComponents;

        public static final class Builder {
            private ECommerceAmountPigeon fiat;
            private List<ECommerceAmountPigeon> internalComponents;

            public ECommercePricePigeon build() {
                ECommercePricePigeon eCommercePricePigeon = new ECommercePricePigeon();
                eCommercePricePigeon.setFiat(this.fiat);
                eCommercePricePigeon.setInternalComponents(this.internalComponents);
                return eCommercePricePigeon;
            }

            public Builder setFiat(ECommerceAmountPigeon eCommerceAmountPigeon) {
                this.fiat = eCommerceAmountPigeon;
                return this;
            }

            public Builder setInternalComponents(List<ECommerceAmountPigeon> list) {
                this.internalComponents = list;
                return this;
            }
        }

        public static ECommercePricePigeon fromList(ArrayList<Object> arrayList) {
            ECommercePricePigeon eCommercePricePigeon = new ECommercePricePigeon();
            Object obj = arrayList.get(0);
            eCommercePricePigeon.setFiat(obj == null ? null : ECommerceAmountPigeon.fromList((ArrayList) obj));
            eCommercePricePigeon.setInternalComponents((List) arrayList.get(1));
            return eCommercePricePigeon;
        }

        public ECommerceAmountPigeon getFiat() {
            return this.fiat;
        }

        public List<ECommerceAmountPigeon> getInternalComponents() {
            return this.internalComponents;
        }

        public void setFiat(ECommerceAmountPigeon eCommerceAmountPigeon) {
            if (eCommerceAmountPigeon == null) {
                throw new IllegalStateException("Nonnull field \"fiat\" is null.");
            }
            this.fiat = eCommerceAmountPigeon;
        }

        public void setInternalComponents(List<ECommerceAmountPigeon> list) {
            this.internalComponents = list;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            ECommerceAmountPigeon eCommerceAmountPigeon = this.fiat;
            arrayList.add(eCommerceAmountPigeon == null ? null : eCommerceAmountPigeon.toList());
            arrayList.add(this.internalComponents);
            return arrayList;
        }
    }

    public static final class ECommerceProductPigeon {
        private ECommercePricePigeon actualPrice;
        private List<String> categoriesPath;
        private String name;
        private ECommercePricePigeon originalPrice;
        private Map<String, String> payload;
        private List<String> promocodes;
        private String sku;

        public static final class Builder {
            private ECommercePricePigeon actualPrice;
            private List<String> categoriesPath;
            private String name;
            private ECommercePricePigeon originalPrice;
            private Map<String, String> payload;
            private List<String> promocodes;
            private String sku;

            public ECommerceProductPigeon build() {
                ECommerceProductPigeon eCommerceProductPigeon = new ECommerceProductPigeon();
                eCommerceProductPigeon.setSku(this.sku);
                eCommerceProductPigeon.setName(this.name);
                eCommerceProductPigeon.setCategoriesPath(this.categoriesPath);
                eCommerceProductPigeon.setPayload(this.payload);
                eCommerceProductPigeon.setActualPrice(this.actualPrice);
                eCommerceProductPigeon.setOriginalPrice(this.originalPrice);
                eCommerceProductPigeon.setPromocodes(this.promocodes);
                return eCommerceProductPigeon;
            }

            public Builder setActualPrice(ECommercePricePigeon eCommercePricePigeon) {
                this.actualPrice = eCommercePricePigeon;
                return this;
            }

            public Builder setCategoriesPath(List<String> list) {
                this.categoriesPath = list;
                return this;
            }

            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            public Builder setOriginalPrice(ECommercePricePigeon eCommercePricePigeon) {
                this.originalPrice = eCommercePricePigeon;
                return this;
            }

            public Builder setPayload(Map<String, String> map) {
                this.payload = map;
                return this;
            }

            public Builder setPromocodes(List<String> list) {
                this.promocodes = list;
                return this;
            }

            public Builder setSku(String str) {
                this.sku = str;
                return this;
            }
        }

        public static ECommerceProductPigeon fromList(ArrayList<Object> arrayList) {
            ECommerceProductPigeon eCommerceProductPigeon = new ECommerceProductPigeon();
            eCommerceProductPigeon.setSku((String) arrayList.get(0));
            eCommerceProductPigeon.setName((String) arrayList.get(1));
            eCommerceProductPigeon.setCategoriesPath((List) arrayList.get(2));
            eCommerceProductPigeon.setPayload((Map) arrayList.get(3));
            Object obj = arrayList.get(4);
            eCommerceProductPigeon.setActualPrice(obj == null ? null : ECommercePricePigeon.fromList((ArrayList) obj));
            Object obj2 = arrayList.get(5);
            eCommerceProductPigeon.setOriginalPrice(obj2 != null ? ECommercePricePigeon.fromList((ArrayList) obj2) : null);
            eCommerceProductPigeon.setPromocodes((List) arrayList.get(6));
            return eCommerceProductPigeon;
        }

        public ECommercePricePigeon getActualPrice() {
            return this.actualPrice;
        }

        public List<String> getCategoriesPath() {
            return this.categoriesPath;
        }

        public String getName() {
            return this.name;
        }

        public ECommercePricePigeon getOriginalPrice() {
            return this.originalPrice;
        }

        public Map<String, String> getPayload() {
            return this.payload;
        }

        public List<String> getPromocodes() {
            return this.promocodes;
        }

        public String getSku() {
            return this.sku;
        }

        public void setActualPrice(ECommercePricePigeon eCommercePricePigeon) {
            this.actualPrice = eCommercePricePigeon;
        }

        public void setCategoriesPath(List<String> list) {
            this.categoriesPath = list;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setOriginalPrice(ECommercePricePigeon eCommercePricePigeon) {
            this.originalPrice = eCommercePricePigeon;
        }

        public void setPayload(Map<String, String> map) {
            this.payload = map;
        }

        public void setPromocodes(List<String> list) {
            this.promocodes = list;
        }

        public void setSku(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"sku\" is null.");
            }
            this.sku = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.sku);
            arrayList.add(this.name);
            arrayList.add(this.categoriesPath);
            arrayList.add(this.payload);
            ECommercePricePigeon eCommercePricePigeon = this.actualPrice;
            arrayList.add(eCommercePricePigeon == null ? null : eCommercePricePigeon.toList());
            ECommercePricePigeon eCommercePricePigeon2 = this.originalPrice;
            arrayList.add(eCommercePricePigeon2 != null ? eCommercePricePigeon2.toList() : null);
            arrayList.add(this.promocodes);
            return arrayList;
        }
    }

    public static final class ECommerceReferrerPigeon {
        private String identifier;
        private ECommerceScreenPigeon screen;
        private String type;

        public static final class Builder {
            private String identifier;
            private ECommerceScreenPigeon screen;
            private String type;

            public ECommerceReferrerPigeon build() {
                ECommerceReferrerPigeon eCommerceReferrerPigeon = new ECommerceReferrerPigeon();
                eCommerceReferrerPigeon.setType(this.type);
                eCommerceReferrerPigeon.setIdentifier(this.identifier);
                eCommerceReferrerPigeon.setScreen(this.screen);
                return eCommerceReferrerPigeon;
            }

            public Builder setIdentifier(String str) {
                this.identifier = str;
                return this;
            }

            public Builder setScreen(ECommerceScreenPigeon eCommerceScreenPigeon) {
                this.screen = eCommerceScreenPigeon;
                return this;
            }

            public Builder setType(String str) {
                this.type = str;
                return this;
            }
        }

        public static ECommerceReferrerPigeon fromList(ArrayList<Object> arrayList) {
            ECommerceReferrerPigeon eCommerceReferrerPigeon = new ECommerceReferrerPigeon();
            eCommerceReferrerPigeon.setType((String) arrayList.get(0));
            eCommerceReferrerPigeon.setIdentifier((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            eCommerceReferrerPigeon.setScreen(obj == null ? null : ECommerceScreenPigeon.fromList((ArrayList) obj));
            return eCommerceReferrerPigeon;
        }

        public String getIdentifier() {
            return this.identifier;
        }

        public ECommerceScreenPigeon getScreen() {
            return this.screen;
        }

        public String getType() {
            return this.type;
        }

        public void setIdentifier(String str) {
            this.identifier = str;
        }

        public void setScreen(ECommerceScreenPigeon eCommerceScreenPigeon) {
            this.screen = eCommerceScreenPigeon;
        }

        public void setType(String str) {
            this.type = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.type);
            arrayList.add(this.identifier);
            ECommerceScreenPigeon eCommerceScreenPigeon = this.screen;
            arrayList.add(eCommerceScreenPigeon == null ? null : eCommerceScreenPigeon.toList());
            return arrayList;
        }
    }

    public static final class ECommerceScreenPigeon {
        private List<String> categoriesPath;
        private String name;
        private Map<String, String> payload;
        private String searchQuery;

        public static final class Builder {
            private List<String> categoriesPath;
            private String name;
            private Map<String, String> payload;
            private String searchQuery;

            public ECommerceScreenPigeon build() {
                ECommerceScreenPigeon eCommerceScreenPigeon = new ECommerceScreenPigeon();
                eCommerceScreenPigeon.setName(this.name);
                eCommerceScreenPigeon.setCategoriesPath(this.categoriesPath);
                eCommerceScreenPigeon.setSearchQuery(this.searchQuery);
                eCommerceScreenPigeon.setPayload(this.payload);
                return eCommerceScreenPigeon;
            }

            public Builder setCategoriesPath(List<String> list) {
                this.categoriesPath = list;
                return this;
            }

            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            public Builder setPayload(Map<String, String> map) {
                this.payload = map;
                return this;
            }

            public Builder setSearchQuery(String str) {
                this.searchQuery = str;
                return this;
            }
        }

        public static ECommerceScreenPigeon fromList(ArrayList<Object> arrayList) {
            ECommerceScreenPigeon eCommerceScreenPigeon = new ECommerceScreenPigeon();
            eCommerceScreenPigeon.setName((String) arrayList.get(0));
            eCommerceScreenPigeon.setCategoriesPath((List) arrayList.get(1));
            eCommerceScreenPigeon.setSearchQuery((String) arrayList.get(2));
            eCommerceScreenPigeon.setPayload((Map) arrayList.get(3));
            return eCommerceScreenPigeon;
        }

        public List<String> getCategoriesPath() {
            return this.categoriesPath;
        }

        public String getName() {
            return this.name;
        }

        public Map<String, String> getPayload() {
            return this.payload;
        }

        public String getSearchQuery() {
            return this.searchQuery;
        }

        public void setCategoriesPath(List<String> list) {
            this.categoriesPath = list;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPayload(Map<String, String> map) {
            this.payload = map;
        }

        public void setSearchQuery(String str) {
            this.searchQuery = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.name);
            arrayList.add(this.categoriesPath);
            arrayList.add(this.searchQuery);
            arrayList.add(this.payload);
            return arrayList;
        }
    }

    public static final class ErrorDetailsPigeon {
        private List<StackTraceElementPigeon> backtrace;
        private String dartVersion;
        private String exceptionClass;
        private String message;

        public static final class Builder {
            private List<StackTraceElementPigeon> backtrace;
            private String dartVersion;
            private String exceptionClass;
            private String message;

            public ErrorDetailsPigeon build() {
                ErrorDetailsPigeon errorDetailsPigeon = new ErrorDetailsPigeon();
                errorDetailsPigeon.setExceptionClass(this.exceptionClass);
                errorDetailsPigeon.setMessage(this.message);
                errorDetailsPigeon.setDartVersion(this.dartVersion);
                errorDetailsPigeon.setBacktrace(this.backtrace);
                return errorDetailsPigeon;
            }

            public Builder setBacktrace(List<StackTraceElementPigeon> list) {
                this.backtrace = list;
                return this;
            }

            public Builder setDartVersion(String str) {
                this.dartVersion = str;
                return this;
            }

            public Builder setExceptionClass(String str) {
                this.exceptionClass = str;
                return this;
            }

            public Builder setMessage(String str) {
                this.message = str;
                return this;
            }
        }

        public static ErrorDetailsPigeon fromList(ArrayList<Object> arrayList) {
            ErrorDetailsPigeon errorDetailsPigeon = new ErrorDetailsPigeon();
            errorDetailsPigeon.setExceptionClass((String) arrayList.get(0));
            errorDetailsPigeon.setMessage((String) arrayList.get(1));
            errorDetailsPigeon.setDartVersion((String) arrayList.get(2));
            errorDetailsPigeon.setBacktrace((List) arrayList.get(3));
            return errorDetailsPigeon;
        }

        public List<StackTraceElementPigeon> getBacktrace() {
            return this.backtrace;
        }

        public String getDartVersion() {
            return this.dartVersion;
        }

        public String getExceptionClass() {
            return this.exceptionClass;
        }

        public String getMessage() {
            return this.message;
        }

        public void setBacktrace(List<StackTraceElementPigeon> list) {
            this.backtrace = list;
        }

        public void setDartVersion(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"dartVersion\" is null.");
            }
            this.dartVersion = str;
        }

        public void setExceptionClass(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"exceptionClass\" is null.");
            }
            this.exceptionClass = str;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.exceptionClass);
            arrayList.add(this.message);
            arrayList.add(this.dartVersion);
            arrayList.add(this.backtrace);
            return arrayList;
        }
    }

    public static final class ExternalAttributionPigeon {
        private Map<String, Object> data;
        private String source;

        public static final class Builder {
            private Map<String, Object> data;
            private String source;

            public ExternalAttributionPigeon build() {
                ExternalAttributionPigeon externalAttributionPigeon = new ExternalAttributionPigeon();
                externalAttributionPigeon.setSource(this.source);
                externalAttributionPigeon.setData(this.data);
                return externalAttributionPigeon;
            }

            public Builder setData(Map<String, Object> map) {
                this.data = map;
                return this;
            }

            public Builder setSource(String str) {
                this.source = str;
                return this;
            }
        }

        public static ExternalAttributionPigeon fromList(ArrayList<Object> arrayList) {
            ExternalAttributionPigeon externalAttributionPigeon = new ExternalAttributionPigeon();
            externalAttributionPigeon.setSource((String) arrayList.get(0));
            externalAttributionPigeon.setData((Map) arrayList.get(1));
            return externalAttributionPigeon;
        }

        public Map<String, Object> getData() {
            return this.data;
        }

        public String getSource() {
            return this.source;
        }

        public void setData(Map<String, Object> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"data\" is null.");
            }
            this.data = map;
        }

        public void setSource(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"source\" is null.");
            }
            this.source = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.source);
            arrayList.add(this.data);
            return arrayList;
        }
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public enum GenderPigeon {
        MALE(0),
        FEMALE(1),
        OTHER(2),
        UNDEFINED(3);

        final int index;

        GenderPigeon(int i3) {
            this.index = i3;
        }
    }

    public interface InitialDeepLinkHolderPigeon {
        static k getCodec() {
            return new r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(InitialDeepLinkHolderPigeon initialDeepLinkHolderPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, initialDeepLinkHolderPigeon.getInitialDeeplink());
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        static void setup(f fVar, InitialDeepLinkHolderPigeon initialDeepLinkHolderPigeon) {
            D0.a aVar = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.InitialDeepLinkHolderPigeon.getInitialDeeplink", getCodec(), (j) null);
            if (initialDeepLinkHolderPigeon != null) {
                aVar.g(new F1.b(24, initialDeepLinkHolderPigeon));
            } else {
                aVar.g(null);
            }
        }

        String getInitialDeeplink();
    }

    public static final class LocationPigeon {
        private Double accuracy;
        private Double altitude;
        private Double course;
        private Double latitude;
        private Double longitude;
        private String provider;
        private Double speed;
        private Long timestamp;

        public static final class Builder {
            private Double accuracy;
            private Double altitude;
            private Double course;
            private Double latitude;
            private Double longitude;
            private String provider;
            private Double speed;
            private Long timestamp;

            public LocationPigeon build() {
                LocationPigeon locationPigeon = new LocationPigeon();
                locationPigeon.setLatitude(this.latitude);
                locationPigeon.setLongitude(this.longitude);
                locationPigeon.setProvider(this.provider);
                locationPigeon.setAltitude(this.altitude);
                locationPigeon.setAccuracy(this.accuracy);
                locationPigeon.setCourse(this.course);
                locationPigeon.setSpeed(this.speed);
                locationPigeon.setTimestamp(this.timestamp);
                return locationPigeon;
            }

            public Builder setAccuracy(Double d3) {
                this.accuracy = d3;
                return this;
            }

            public Builder setAltitude(Double d3) {
                this.altitude = d3;
                return this;
            }

            public Builder setCourse(Double d3) {
                this.course = d3;
                return this;
            }

            public Builder setLatitude(Double d3) {
                this.latitude = d3;
                return this;
            }

            public Builder setLongitude(Double d3) {
                this.longitude = d3;
                return this;
            }

            public Builder setProvider(String str) {
                this.provider = str;
                return this;
            }

            public Builder setSpeed(Double d3) {
                this.speed = d3;
                return this;
            }

            public Builder setTimestamp(Long l3) {
                this.timestamp = l3;
                return this;
            }
        }

        public static LocationPigeon fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            LocationPigeon locationPigeon = new LocationPigeon();
            locationPigeon.setLatitude((Double) arrayList.get(0));
            locationPigeon.setLongitude((Double) arrayList.get(1));
            locationPigeon.setProvider((String) arrayList.get(2));
            locationPigeon.setAltitude((Double) arrayList.get(3));
            locationPigeon.setAccuracy((Double) arrayList.get(4));
            locationPigeon.setCourse((Double) arrayList.get(5));
            locationPigeon.setSpeed((Double) arrayList.get(6));
            Object obj = arrayList.get(7);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            locationPigeon.setTimestamp(valueOf);
            return locationPigeon;
        }

        public Double getAccuracy() {
            return this.accuracy;
        }

        public Double getAltitude() {
            return this.altitude;
        }

        public Double getCourse() {
            return this.course;
        }

        public Double getLatitude() {
            return this.latitude;
        }

        public Double getLongitude() {
            return this.longitude;
        }

        public String getProvider() {
            return this.provider;
        }

        public Double getSpeed() {
            return this.speed;
        }

        public Long getTimestamp() {
            return this.timestamp;
        }

        public void setAccuracy(Double d3) {
            this.accuracy = d3;
        }

        public void setAltitude(Double d3) {
            this.altitude = d3;
        }

        public void setCourse(Double d3) {
            this.course = d3;
        }

        public void setLatitude(Double d3) {
            if (d3 == null) {
                throw new IllegalStateException("Nonnull field \"latitude\" is null.");
            }
            this.latitude = d3;
        }

        public void setLongitude(Double d3) {
            if (d3 == null) {
                throw new IllegalStateException("Nonnull field \"longitude\" is null.");
            }
            this.longitude = d3;
        }

        public void setProvider(String str) {
            this.provider = str;
        }

        public void setSpeed(Double d3) {
            this.speed = d3;
        }

        public void setTimestamp(Long l3) {
            this.timestamp = l3;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(8);
            arrayList.add(this.latitude);
            arrayList.add(this.longitude);
            arrayList.add(this.provider);
            arrayList.add(this.altitude);
            arrayList.add(this.accuracy);
            arrayList.add(this.course);
            arrayList.add(this.speed);
            arrayList.add(this.timestamp);
            return arrayList;
        }
    }

    public static final class PreloadInfoPigeon {
        private Map<String, String> additionalInfo;
        private String trackingId;

        public static final class Builder {
            private Map<String, String> additionalInfo;
            private String trackingId;

            public PreloadInfoPigeon build() {
                PreloadInfoPigeon preloadInfoPigeon = new PreloadInfoPigeon();
                preloadInfoPigeon.setTrackingId(this.trackingId);
                preloadInfoPigeon.setAdditionalInfo(this.additionalInfo);
                return preloadInfoPigeon;
            }

            public Builder setAdditionalInfo(Map<String, String> map) {
                this.additionalInfo = map;
                return this;
            }

            public Builder setTrackingId(String str) {
                this.trackingId = str;
                return this;
            }
        }

        public static PreloadInfoPigeon fromList(ArrayList<Object> arrayList) {
            PreloadInfoPigeon preloadInfoPigeon = new PreloadInfoPigeon();
            preloadInfoPigeon.setTrackingId((String) arrayList.get(0));
            preloadInfoPigeon.setAdditionalInfo((Map) arrayList.get(1));
            return preloadInfoPigeon;
        }

        public Map<String, String> getAdditionalInfo() {
            return this.additionalInfo;
        }

        public String getTrackingId() {
            return this.trackingId;
        }

        public void setAdditionalInfo(Map<String, String> map) {
            this.additionalInfo = map;
        }

        public void setTrackingId(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"trackingId\" is null.");
            }
            this.trackingId = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.trackingId);
            arrayList.add(this.additionalInfo);
            return arrayList;
        }
    }

    public static final class ReceiptPigeon {
        private String data;
        private String signature;

        public static final class Builder {
            private String data;
            private String signature;

            public ReceiptPigeon build() {
                ReceiptPigeon receiptPigeon = new ReceiptPigeon();
                receiptPigeon.setData(this.data);
                receiptPigeon.setSignature(this.signature);
                return receiptPigeon;
            }

            public Builder setData(String str) {
                this.data = str;
                return this;
            }

            public Builder setSignature(String str) {
                this.signature = str;
                return this;
            }
        }

        public static ReceiptPigeon fromList(ArrayList<Object> arrayList) {
            ReceiptPigeon receiptPigeon = new ReceiptPigeon();
            receiptPigeon.setData((String) arrayList.get(0));
            receiptPigeon.setSignature((String) arrayList.get(1));
            return receiptPigeon;
        }

        public String getData() {
            return this.data;
        }

        public String getSignature() {
            return this.signature;
        }

        public void setData(String str) {
            this.data = str;
        }

        public void setSignature(String str) {
            this.signature = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.data);
            arrayList.add(this.signature);
            return arrayList;
        }
    }

    public static final class ReporterConfigPigeon {
        private String apiKey;
        private Map<String, String> appEnvironment;
        private Boolean dataSendingEnabled;
        private Long dispatchPeriodSeconds;
        private Boolean logs;
        private Long maxReportsCount;
        private Long maxReportsInDatabaseCount;
        private Long sessionTimeout;
        private String userProfileID;

        public static final class Builder {
            private String apiKey;
            private Map<String, String> appEnvironment;
            private Boolean dataSendingEnabled;
            private Long dispatchPeriodSeconds;
            private Boolean logs;
            private Long maxReportsCount;
            private Long maxReportsInDatabaseCount;
            private Long sessionTimeout;
            private String userProfileID;

            public ReporterConfigPigeon build() {
                ReporterConfigPigeon reporterConfigPigeon = new ReporterConfigPigeon();
                reporterConfigPigeon.setApiKey(this.apiKey);
                reporterConfigPigeon.setAppEnvironment(this.appEnvironment);
                reporterConfigPigeon.setDataSendingEnabled(this.dataSendingEnabled);
                reporterConfigPigeon.setDispatchPeriodSeconds(this.dispatchPeriodSeconds);
                reporterConfigPigeon.setLogs(this.logs);
                reporterConfigPigeon.setMaxReportsCount(this.maxReportsCount);
                reporterConfigPigeon.setMaxReportsInDatabaseCount(this.maxReportsInDatabaseCount);
                reporterConfigPigeon.setSessionTimeout(this.sessionTimeout);
                reporterConfigPigeon.setUserProfileID(this.userProfileID);
                return reporterConfigPigeon;
            }

            public Builder setApiKey(String str) {
                this.apiKey = str;
                return this;
            }

            public Builder setAppEnvironment(Map<String, String> map) {
                this.appEnvironment = map;
                return this;
            }

            public Builder setDataSendingEnabled(Boolean bool) {
                this.dataSendingEnabled = bool;
                return this;
            }

            public Builder setDispatchPeriodSeconds(Long l3) {
                this.dispatchPeriodSeconds = l3;
                return this;
            }

            public Builder setLogs(Boolean bool) {
                this.logs = bool;
                return this;
            }

            public Builder setMaxReportsCount(Long l3) {
                this.maxReportsCount = l3;
                return this;
            }

            public Builder setMaxReportsInDatabaseCount(Long l3) {
                this.maxReportsInDatabaseCount = l3;
                return this;
            }

            public Builder setSessionTimeout(Long l3) {
                this.sessionTimeout = l3;
                return this;
            }

            public Builder setUserProfileID(String str) {
                this.userProfileID = str;
                return this;
            }
        }

        public static ReporterConfigPigeon fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            Long valueOf2;
            Long valueOf3;
            ReporterConfigPigeon reporterConfigPigeon = new ReporterConfigPigeon();
            reporterConfigPigeon.setApiKey((String) arrayList.get(0));
            reporterConfigPigeon.setAppEnvironment((Map) arrayList.get(1));
            reporterConfigPigeon.setDataSendingEnabled((Boolean) arrayList.get(2));
            Object obj = arrayList.get(3);
            Long l3 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            reporterConfigPigeon.setDispatchPeriodSeconds(valueOf);
            reporterConfigPigeon.setLogs((Boolean) arrayList.get(4));
            Object obj2 = arrayList.get(5);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            reporterConfigPigeon.setMaxReportsCount(valueOf2);
            Object obj3 = arrayList.get(6);
            if (obj3 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            reporterConfigPigeon.setMaxReportsInDatabaseCount(valueOf3);
            Object obj4 = arrayList.get(7);
            if (obj4 != null) {
                l3 = Long.valueOf(obj4 instanceof Integer ? ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            reporterConfigPigeon.setSessionTimeout(l3);
            reporterConfigPigeon.setUserProfileID((String) arrayList.get(8));
            return reporterConfigPigeon;
        }

        public String getApiKey() {
            return this.apiKey;
        }

        public Map<String, String> getAppEnvironment() {
            return this.appEnvironment;
        }

        public Boolean getDataSendingEnabled() {
            return this.dataSendingEnabled;
        }

        public Long getDispatchPeriodSeconds() {
            return this.dispatchPeriodSeconds;
        }

        public Boolean getLogs() {
            return this.logs;
        }

        public Long getMaxReportsCount() {
            return this.maxReportsCount;
        }

        public Long getMaxReportsInDatabaseCount() {
            return this.maxReportsInDatabaseCount;
        }

        public Long getSessionTimeout() {
            return this.sessionTimeout;
        }

        public String getUserProfileID() {
            return this.userProfileID;
        }

        public void setApiKey(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.apiKey = str;
        }

        public void setAppEnvironment(Map<String, String> map) {
            this.appEnvironment = map;
        }

        public void setDataSendingEnabled(Boolean bool) {
            this.dataSendingEnabled = bool;
        }

        public void setDispatchPeriodSeconds(Long l3) {
            this.dispatchPeriodSeconds = l3;
        }

        public void setLogs(Boolean bool) {
            this.logs = bool;
        }

        public void setMaxReportsCount(Long l3) {
            this.maxReportsCount = l3;
        }

        public void setMaxReportsInDatabaseCount(Long l3) {
            this.maxReportsInDatabaseCount = l3;
        }

        public void setSessionTimeout(Long l3) {
            this.sessionTimeout = l3;
        }

        public void setUserProfileID(String str) {
            this.userProfileID = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(9);
            arrayList.add(this.apiKey);
            arrayList.add(this.appEnvironment);
            arrayList.add(this.dataSendingEnabled);
            arrayList.add(this.dispatchPeriodSeconds);
            arrayList.add(this.logs);
            arrayList.add(this.maxReportsCount);
            arrayList.add(this.maxReportsInDatabaseCount);
            arrayList.add(this.sessionTimeout);
            arrayList.add(this.userProfileID);
            return arrayList;
        }
    }

    public interface ReporterPigeon {
        static k getCodec() {
            return ReporterPigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                reporterPigeon.clearAppEnvironment((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                reporterPigeon.pauseSession((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$10(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportUnhandledException((String) arrayList2.get(0), (ErrorDetailsPigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$11(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportUserProfile((String) arrayList2.get(0), (UserProfilePigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$12(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                reporterPigeon.resumeSession((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$13(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                reporterPigeon.sendEventsBuffer((String) ((ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$14(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.setDataSendingEnabled((String) arrayList2.get(0), (Boolean) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$15(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.setUserProfileID((String) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.putAppEnvironmentValue((String) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportAdRevenue((String) arrayList2.get(0), (AdRevenuePigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportECommerce((String) arrayList2.get(0), (ECommerceEventPigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportError((String) arrayList2.get(0), (ErrorDetailsPigeon) arrayList2.get(1), (String) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportErrorWithGroup((String) arrayList2.get(0), (String) arrayList2.get(1), (ErrorDetailsPigeon) arrayList2.get(2), (String) arrayList2.get(3));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportEvent((String) arrayList2.get(0), (String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportEventWithJson((String) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$9(ReporterPigeon reporterPigeon, Object obj, T1.c cVar) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                reporterPigeon.reportRevenue((String) arrayList2.get(0), (RevenuePigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Pigeon.wrapError(th);
            }
            cVar.l(arrayList);
        }

        static void setup(f fVar, final ReporterPigeon reporterPigeon) {
            D0.a aVar = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.clearAppEnvironment", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i3 = 0;
                aVar.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i3) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar.g(null);
            }
            D0.a aVar2 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.pauseSession", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i4 = 13;
                aVar2.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i4) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar2.g(null);
            }
            D0.a aVar3 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.putAppEnvironmentValue", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i5 = 14;
                aVar3.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i5) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar3.g(null);
            }
            D0.a aVar4 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportAdRevenue", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i6 = 15;
                aVar4.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i6) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar4.g(null);
            }
            D0.a aVar5 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportECommerce", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i7 = 1;
                aVar5.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i7) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar5.g(null);
            }
            D0.a aVar6 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportError", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i8 = 2;
                aVar6.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i8) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar6.g(null);
            }
            D0.a aVar7 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportErrorWithGroup", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i9 = 3;
                aVar7.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i9) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar7.g(null);
            }
            D0.a aVar8 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportEvent", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i10 = 4;
                aVar8.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i10) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar8.g(null);
            }
            D0.a aVar9 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportEventWithJson", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i11 = 5;
                aVar9.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i11) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar9.g(null);
            }
            D0.a aVar10 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportRevenue", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i12 = 6;
                aVar10.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i12) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar10.g(null);
            }
            D0.a aVar11 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportUnhandledException", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i13 = 7;
                aVar11.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i13) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar11.g(null);
            }
            D0.a aVar12 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportUserProfile", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i14 = 8;
                aVar12.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i14) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar12.g(null);
            }
            D0.a aVar13 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.resumeSession", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i15 = 9;
                aVar13.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i15) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar13.g(null);
            }
            D0.a aVar14 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.sendEventsBuffer", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i16 = 10;
                aVar14.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i16) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar14.g(null);
            }
            D0.a aVar15 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.setDataSendingEnabled", getCodec(), (j) null);
            if (reporterPigeon != null) {
                final int i17 = 11;
                aVar15.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i17) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                aVar15.g(null);
            }
            D0.a aVar16 = new D0.a(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.setUserProfileID", getCodec(), (j) null);
            if (reporterPigeon == null) {
                aVar16.g(null);
            } else {
                final int i18 = 12;
                aVar16.g(new T1.b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Pigeon.ReporterPigeon f5526b;

                    {
                        this.f5526b = reporterPigeon;
                    }

                    @Override // T1.b
                    public final void e(Object obj, e eVar) {
                        switch (i18) {
                            case 0:
                                Pigeon.ReporterPigeon.lambda$setup$0(this.f5526b, obj, eVar);
                                break;
                            case 1:
                                Pigeon.ReporterPigeon.lambda$setup$4(this.f5526b, obj, eVar);
                                break;
                            case 2:
                                Pigeon.ReporterPigeon.lambda$setup$5(this.f5526b, obj, eVar);
                                break;
                            case 3:
                                Pigeon.ReporterPigeon.lambda$setup$6(this.f5526b, obj, eVar);
                                break;
                            case 4:
                                Pigeon.ReporterPigeon.lambda$setup$7(this.f5526b, obj, eVar);
                                break;
                            case 5:
                                Pigeon.ReporterPigeon.lambda$setup$8(this.f5526b, obj, eVar);
                                break;
                            case 6:
                                Pigeon.ReporterPigeon.lambda$setup$9(this.f5526b, obj, eVar);
                                break;
                            case 7:
                                Pigeon.ReporterPigeon.lambda$setup$10(this.f5526b, obj, eVar);
                                break;
                            case 8:
                                Pigeon.ReporterPigeon.lambda$setup$11(this.f5526b, obj, eVar);
                                break;
                            case 9:
                                Pigeon.ReporterPigeon.lambda$setup$12(this.f5526b, obj, eVar);
                                break;
                            case 10:
                                Pigeon.ReporterPigeon.lambda$setup$13(this.f5526b, obj, eVar);
                                break;
                            case 11:
                                Pigeon.ReporterPigeon.lambda$setup$14(this.f5526b, obj, eVar);
                                break;
                            case 12:
                                Pigeon.ReporterPigeon.lambda$setup$15(this.f5526b, obj, eVar);
                                break;
                            case 13:
                                Pigeon.ReporterPigeon.lambda$setup$1(this.f5526b, obj, eVar);
                                break;
                            case 14:
                                Pigeon.ReporterPigeon.lambda$setup$2(this.f5526b, obj, eVar);
                                break;
                            default:
                                Pigeon.ReporterPigeon.lambda$setup$3(this.f5526b, obj, eVar);
                                break;
                        }
                    }
                });
            }
        }

        void clearAppEnvironment(String str);

        void pauseSession(String str);

        void putAppEnvironmentValue(String str, String str2, String str3);

        void reportAdRevenue(String str, AdRevenuePigeon adRevenuePigeon);

        void reportECommerce(String str, ECommerceEventPigeon eCommerceEventPigeon);

        void reportError(String str, ErrorDetailsPigeon errorDetailsPigeon, String str2);

        void reportErrorWithGroup(String str, String str2, ErrorDetailsPigeon errorDetailsPigeon, String str3);

        void reportEvent(String str, String str2);

        void reportEventWithJson(String str, String str2, String str3);

        void reportRevenue(String str, RevenuePigeon revenuePigeon);

        void reportUnhandledException(String str, ErrorDetailsPigeon errorDetailsPigeon);

        void reportUserProfile(String str, UserProfilePigeon userProfilePigeon);

        void resumeSession(String str);

        void sendEventsBuffer(String str);

        void setDataSendingEnabled(String str, Boolean bool);

        void setUserProfileID(String str, String str2);
    }

    public static class ReporterPigeonCodec extends r {
        public static final ReporterPigeonCodec INSTANCE = new ReporterPigeonCodec();

        private ReporterPigeonCodec() {
        }

        @Override // T1.r
        public Object readValueOfType(byte b3, ByteBuffer byteBuffer) {
            switch (b3) {
                case Byte.MIN_VALUE:
                    return AdRevenuePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return ECommerceAmountPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return ECommerceAmountPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return ECommerceCartItemPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return ECommerceEventPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return ECommerceOrderPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return ECommercePricePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -121:
                    return ECommercePricePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -120:
                    return ECommerceProductPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return ECommerceProductPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return ECommerceReferrerPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return ECommerceScreenPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return ErrorDetailsPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return ErrorDetailsPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return ReceiptPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return RevenuePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return StackTraceElementPigeon.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return UserProfileAttributePigeon.fromList((ArrayList) readValue(byteBuffer));
                case -110:
                    return UserProfilePigeon.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b3, byteBuffer);
            }
        }

        @Override // T1.r
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AdRevenuePigeon) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AdRevenuePigeon) obj).toList());
                return;
            }
            boolean z3 = obj instanceof ECommerceAmountPigeon;
            if (z3) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((ECommerceAmountPigeon) obj).toList());
                return;
            }
            if (z3) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((ECommerceAmountPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceCartItemPigeon) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((ECommerceCartItemPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceEventPigeon) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((ECommerceEventPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceOrderPigeon) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((ECommerceOrderPigeon) obj).toList());
                return;
            }
            boolean z4 = obj instanceof ECommercePricePigeon;
            if (z4) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((ECommercePricePigeon) obj).toList());
                return;
            }
            if (z4) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((ECommercePricePigeon) obj).toList());
                return;
            }
            boolean z5 = obj instanceof ECommerceProductPigeon;
            if (z5) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, ((ECommerceProductPigeon) obj).toList());
                return;
            }
            if (z5) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((ECommerceProductPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceReferrerPigeon) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((ECommerceReferrerPigeon) obj).toList());
                return;
            }
            if (obj instanceof ECommerceScreenPigeon) {
                byteArrayOutputStream.write(139);
                writeValue(byteArrayOutputStream, ((ECommerceScreenPigeon) obj).toList());
                return;
            }
            boolean z6 = obj instanceof ErrorDetailsPigeon;
            if (z6) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((ErrorDetailsPigeon) obj).toList());
                return;
            }
            if (z6) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((ErrorDetailsPigeon) obj).toList());
                return;
            }
            if (obj instanceof ReceiptPigeon) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((ReceiptPigeon) obj).toList());
                return;
            }
            if (obj instanceof RevenuePigeon) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((RevenuePigeon) obj).toList());
                return;
            }
            if (obj instanceof StackTraceElementPigeon) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((StackTraceElementPigeon) obj).toList());
            } else if (obj instanceof UserProfileAttributePigeon) {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((UserProfileAttributePigeon) obj).toList());
            } else if (!(obj instanceof UserProfilePigeon)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(146);
                writeValue(byteArrayOutputStream, ((UserProfilePigeon) obj).toList());
            }
        }
    }

    public interface Result<T> {
        void error(Throwable th);

        void success(T t3);
    }

    public static final class RevenuePigeon {
        private String currency;
        private String payload;
        private String price;
        private String productId;
        private Long quantity;
        private ReceiptPigeon receipt;
        private String transactionId;

        public static final class Builder {
            private String currency;
            private String payload;
            private String price;
            private String productId;
            private Long quantity;
            private ReceiptPigeon receipt;
            private String transactionId;

            public RevenuePigeon build() {
                RevenuePigeon revenuePigeon = new RevenuePigeon();
                revenuePigeon.setPrice(this.price);
                revenuePigeon.setCurrency(this.currency);
                revenuePigeon.setQuantity(this.quantity);
                revenuePigeon.setProductId(this.productId);
                revenuePigeon.setPayload(this.payload);
                revenuePigeon.setReceipt(this.receipt);
                revenuePigeon.setTransactionId(this.transactionId);
                return revenuePigeon;
            }

            public Builder setCurrency(String str) {
                this.currency = str;
                return this;
            }

            public Builder setPayload(String str) {
                this.payload = str;
                return this;
            }

            public Builder setPrice(String str) {
                this.price = str;
                return this;
            }

            public Builder setProductId(String str) {
                this.productId = str;
                return this;
            }

            public Builder setQuantity(Long l3) {
                this.quantity = l3;
                return this;
            }

            public Builder setReceipt(ReceiptPigeon receiptPigeon) {
                this.receipt = receiptPigeon;
                return this;
            }

            public Builder setTransactionId(String str) {
                this.transactionId = str;
                return this;
            }
        }

        public static RevenuePigeon fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            RevenuePigeon revenuePigeon = new RevenuePigeon();
            revenuePigeon.setPrice((String) arrayList.get(0));
            revenuePigeon.setCurrency((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            revenuePigeon.setQuantity(valueOf);
            revenuePigeon.setProductId((String) arrayList.get(3));
            revenuePigeon.setPayload((String) arrayList.get(4));
            Object obj2 = arrayList.get(5);
            revenuePigeon.setReceipt(obj2 != null ? ReceiptPigeon.fromList((ArrayList) obj2) : null);
            revenuePigeon.setTransactionId((String) arrayList.get(6));
            return revenuePigeon;
        }

        public String getCurrency() {
            return this.currency;
        }

        public String getPayload() {
            return this.payload;
        }

        public String getPrice() {
            return this.price;
        }

        public String getProductId() {
            return this.productId;
        }

        public Long getQuantity() {
            return this.quantity;
        }

        public ReceiptPigeon getReceipt() {
            return this.receipt;
        }

        public String getTransactionId() {
            return this.transactionId;
        }

        public void setCurrency(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"currency\" is null.");
            }
            this.currency = str;
        }

        public void setPayload(String str) {
            this.payload = str;
        }

        public void setPrice(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"price\" is null.");
            }
            this.price = str;
        }

        public void setProductId(String str) {
            this.productId = str;
        }

        public void setQuantity(Long l3) {
            this.quantity = l3;
        }

        public void setReceipt(ReceiptPigeon receiptPigeon) {
            this.receipt = receiptPigeon;
        }

        public void setTransactionId(String str) {
            this.transactionId = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.price);
            arrayList.add(this.currency);
            arrayList.add(this.quantity);
            arrayList.add(this.productId);
            arrayList.add(this.payload);
            ReceiptPigeon receiptPigeon = this.receipt;
            arrayList.add(receiptPigeon == null ? null : receiptPigeon.toList());
            arrayList.add(this.transactionId);
            return arrayList;
        }
    }

    public static final class StackTraceElementPigeon {
        private String className;
        private Long column;
        private String fileName;
        private Long line;
        private String methodName;

        public static final class Builder {
            private String className;
            private Long column;
            private String fileName;
            private Long line;
            private String methodName;

            public StackTraceElementPigeon build() {
                StackTraceElementPigeon stackTraceElementPigeon = new StackTraceElementPigeon();
                stackTraceElementPigeon.setClassName(this.className);
                stackTraceElementPigeon.setFileName(this.fileName);
                stackTraceElementPigeon.setLine(this.line);
                stackTraceElementPigeon.setColumn(this.column);
                stackTraceElementPigeon.setMethodName(this.methodName);
                return stackTraceElementPigeon;
            }

            public Builder setClassName(String str) {
                this.className = str;
                return this;
            }

            public Builder setColumn(Long l3) {
                this.column = l3;
                return this;
            }

            public Builder setFileName(String str) {
                this.fileName = str;
                return this;
            }

            public Builder setLine(Long l3) {
                this.line = l3;
                return this;
            }

            public Builder setMethodName(String str) {
                this.methodName = str;
                return this;
            }
        }

        public static StackTraceElementPigeon fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            StackTraceElementPigeon stackTraceElementPigeon = new StackTraceElementPigeon();
            stackTraceElementPigeon.setClassName((String) arrayList.get(0));
            stackTraceElementPigeon.setFileName((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            Long l3 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            stackTraceElementPigeon.setLine(valueOf);
            Object obj2 = arrayList.get(3);
            if (obj2 != null) {
                l3 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            stackTraceElementPigeon.setColumn(l3);
            stackTraceElementPigeon.setMethodName((String) arrayList.get(4));
            return stackTraceElementPigeon;
        }

        public String getClassName() {
            return this.className;
        }

        public Long getColumn() {
            return this.column;
        }

        public String getFileName() {
            return this.fileName;
        }

        public Long getLine() {
            return this.line;
        }

        public String getMethodName() {
            return this.methodName;
        }

        public void setClassName(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"className\" is null.");
            }
            this.className = str;
        }

        public void setColumn(Long l3) {
            if (l3 == null) {
                throw new IllegalStateException("Nonnull field \"column\" is null.");
            }
            this.column = l3;
        }

        public void setFileName(String str) {
            this.fileName = str;
        }

        public void setLine(Long l3) {
            if (l3 == null) {
                throw new IllegalStateException("Nonnull field \"line\" is null.");
            }
            this.line = l3;
        }

        public void setMethodName(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"methodName\" is null.");
            }
            this.methodName = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.className);
            arrayList.add(this.fileName);
            arrayList.add(this.line);
            arrayList.add(this.column);
            arrayList.add(this.methodName);
            return arrayList;
        }
    }

    public static final class StartupParamsItemPigeon {
        private String errorDetails;
        private String id;
        private StartupParamsItemStatusPigeon status;

        public static final class Builder {
            private String errorDetails;
            private String id;
            private StartupParamsItemStatusPigeon status;

            public StartupParamsItemPigeon build() {
                StartupParamsItemPigeon startupParamsItemPigeon = new StartupParamsItemPigeon();
                startupParamsItemPigeon.setId(this.id);
                startupParamsItemPigeon.setStatus(this.status);
                startupParamsItemPigeon.setErrorDetails(this.errorDetails);
                return startupParamsItemPigeon;
            }

            public Builder setErrorDetails(String str) {
                this.errorDetails = str;
                return this;
            }

            public Builder setId(String str) {
                this.id = str;
                return this;
            }

            public Builder setStatus(StartupParamsItemStatusPigeon startupParamsItemStatusPigeon) {
                this.status = startupParamsItemStatusPigeon;
                return this;
            }
        }

        public static StartupParamsItemPigeon fromList(ArrayList<Object> arrayList) {
            StartupParamsItemPigeon startupParamsItemPigeon = new StartupParamsItemPigeon();
            startupParamsItemPigeon.setId((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            startupParamsItemPigeon.setStatus(obj == null ? null : StartupParamsItemStatusPigeon.values()[((Integer) obj).intValue()]);
            startupParamsItemPigeon.setErrorDetails((String) arrayList.get(2));
            return startupParamsItemPigeon;
        }

        public String getErrorDetails() {
            return this.errorDetails;
        }

        public String getId() {
            return this.id;
        }

        public StartupParamsItemStatusPigeon getStatus() {
            return this.status;
        }

        public void setErrorDetails(String str) {
            this.errorDetails = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setStatus(StartupParamsItemStatusPigeon startupParamsItemStatusPigeon) {
            if (startupParamsItemStatusPigeon == null) {
                throw new IllegalStateException("Nonnull field \"status\" is null.");
            }
            this.status = startupParamsItemStatusPigeon;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.id);
            StartupParamsItemStatusPigeon startupParamsItemStatusPigeon = this.status;
            arrayList.add(startupParamsItemStatusPigeon == null ? null : Integer.valueOf(startupParamsItemStatusPigeon.index));
            arrayList.add(this.errorDetails);
            return arrayList;
        }
    }

    public enum StartupParamsItemStatusPigeon {
        FEATURE_DISABLED(0),
        INVALID_VALUE_FROM_PROVIDER(1),
        NETWORK_ERROR(2),
        OK(3),
        PROVIDER_UNAVAILABLE(4),
        UNKNOWN_ERROR(5);

        final int index;

        StartupParamsItemStatusPigeon(int i3) {
            this.index = i3;
        }
    }

    public static final class StartupParamsPigeon {
        private StartupParamsReasonPigeon reason;
        private StartupParamsResultPigeon result;

        public static final class Builder {
            private StartupParamsReasonPigeon reason;
            private StartupParamsResultPigeon result;

            public StartupParamsPigeon build() {
                StartupParamsPigeon startupParamsPigeon = new StartupParamsPigeon();
                startupParamsPigeon.setResult(this.result);
                startupParamsPigeon.setReason(this.reason);
                return startupParamsPigeon;
            }

            public Builder setReason(StartupParamsReasonPigeon startupParamsReasonPigeon) {
                this.reason = startupParamsReasonPigeon;
                return this;
            }

            public Builder setResult(StartupParamsResultPigeon startupParamsResultPigeon) {
                this.result = startupParamsResultPigeon;
                return this;
            }
        }

        public static StartupParamsPigeon fromList(ArrayList<Object> arrayList) {
            StartupParamsPigeon startupParamsPigeon = new StartupParamsPigeon();
            Object obj = arrayList.get(0);
            startupParamsPigeon.setResult(obj == null ? null : StartupParamsResultPigeon.fromList((ArrayList) obj));
            Object obj2 = arrayList.get(1);
            startupParamsPigeon.setReason(obj2 != null ? StartupParamsReasonPigeon.fromList((ArrayList) obj2) : null);
            return startupParamsPigeon;
        }

        public StartupParamsReasonPigeon getReason() {
            return this.reason;
        }

        public StartupParamsResultPigeon getResult() {
            return this.result;
        }

        public void setReason(StartupParamsReasonPigeon startupParamsReasonPigeon) {
            this.reason = startupParamsReasonPigeon;
        }

        public void setResult(StartupParamsResultPigeon startupParamsResultPigeon) {
            this.result = startupParamsResultPigeon;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            StartupParamsResultPigeon startupParamsResultPigeon = this.result;
            arrayList.add(startupParamsResultPigeon == null ? null : startupParamsResultPigeon.toList());
            StartupParamsReasonPigeon startupParamsReasonPigeon = this.reason;
            arrayList.add(startupParamsReasonPigeon != null ? startupParamsReasonPigeon.toList() : null);
            return arrayList;
        }
    }

    public static final class StartupParamsReasonPigeon {
        private String value;

        public static final class Builder {
            private String value;

            public StartupParamsReasonPigeon build() {
                StartupParamsReasonPigeon startupParamsReasonPigeon = new StartupParamsReasonPigeon();
                startupParamsReasonPigeon.setValue(this.value);
                return startupParamsReasonPigeon;
            }

            public Builder setValue(String str) {
                this.value = str;
                return this;
            }
        }

        public static StartupParamsReasonPigeon fromList(ArrayList<Object> arrayList) {
            StartupParamsReasonPigeon startupParamsReasonPigeon = new StartupParamsReasonPigeon();
            startupParamsReasonPigeon.setValue((String) arrayList.get(0));
            return startupParamsReasonPigeon;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"value\" is null.");
            }
            this.value = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.value);
            return arrayList;
        }
    }

    public static final class StartupParamsResultPigeon {
        private String deviceId;
        private String deviceIdHash;
        private Map<String, StartupParamsItemPigeon> parameters;
        private String uuid;

        public static final class Builder {
            private String deviceId;
            private String deviceIdHash;
            private Map<String, StartupParamsItemPigeon> parameters;
            private String uuid;

            public StartupParamsResultPigeon build() {
                StartupParamsResultPigeon startupParamsResultPigeon = new StartupParamsResultPigeon();
                startupParamsResultPigeon.setDeviceId(this.deviceId);
                startupParamsResultPigeon.setDeviceIdHash(this.deviceIdHash);
                startupParamsResultPigeon.setParameters(this.parameters);
                startupParamsResultPigeon.setUuid(this.uuid);
                return startupParamsResultPigeon;
            }

            public Builder setDeviceId(String str) {
                this.deviceId = str;
                return this;
            }

            public Builder setDeviceIdHash(String str) {
                this.deviceIdHash = str;
                return this;
            }

            public Builder setParameters(Map<String, StartupParamsItemPigeon> map) {
                this.parameters = map;
                return this;
            }

            public Builder setUuid(String str) {
                this.uuid = str;
                return this;
            }
        }

        public static StartupParamsResultPigeon fromList(ArrayList<Object> arrayList) {
            StartupParamsResultPigeon startupParamsResultPigeon = new StartupParamsResultPigeon();
            startupParamsResultPigeon.setDeviceId((String) arrayList.get(0));
            startupParamsResultPigeon.setDeviceIdHash((String) arrayList.get(1));
            startupParamsResultPigeon.setParameters((Map) arrayList.get(2));
            startupParamsResultPigeon.setUuid((String) arrayList.get(3));
            return startupParamsResultPigeon;
        }

        public String getDeviceId() {
            return this.deviceId;
        }

        public String getDeviceIdHash() {
            return this.deviceIdHash;
        }

        public Map<String, StartupParamsItemPigeon> getParameters() {
            return this.parameters;
        }

        public String getUuid() {
            return this.uuid;
        }

        public void setDeviceId(String str) {
            this.deviceId = str;
        }

        public void setDeviceIdHash(String str) {
            this.deviceIdHash = str;
        }

        public void setParameters(Map<String, StartupParamsItemPigeon> map) {
            this.parameters = map;
        }

        public void setUuid(String str) {
            this.uuid = str;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.deviceId);
            arrayList.add(this.deviceIdHash);
            arrayList.add(this.parameters);
            arrayList.add(this.uuid);
            return arrayList;
        }
    }

    public static final class UserProfileAttributePigeon {
        private Long age;
        private Boolean boolValue;
        private Long day;
        private Double doubleValue;
        private GenderPigeon genderValue;
        private Boolean ifUndefined;
        private String key;
        private Long month;
        private Boolean reset;
        private String stringValue;
        private UserProfileAttributeType type;
        private Long year;

        public static final class Builder {
            private Long age;
            private Boolean boolValue;
            private Long day;
            private Double doubleValue;
            private GenderPigeon genderValue;
            private Boolean ifUndefined;
            private String key;
            private Long month;
            private Boolean reset;
            private String stringValue;
            private UserProfileAttributeType type;
            private Long year;

            public UserProfileAttributePigeon build() {
                UserProfileAttributePigeon userProfileAttributePigeon = new UserProfileAttributePigeon();
                userProfileAttributePigeon.setKey(this.key);
                userProfileAttributePigeon.setDoubleValue(this.doubleValue);
                userProfileAttributePigeon.setStringValue(this.stringValue);
                userProfileAttributePigeon.setBoolValue(this.boolValue);
                userProfileAttributePigeon.setYear(this.year);
                userProfileAttributePigeon.setMonth(this.month);
                userProfileAttributePigeon.setDay(this.day);
                userProfileAttributePigeon.setAge(this.age);
                userProfileAttributePigeon.setGenderValue(this.genderValue);
                userProfileAttributePigeon.setIfUndefined(this.ifUndefined);
                userProfileAttributePigeon.setReset(this.reset);
                userProfileAttributePigeon.setType(this.type);
                return userProfileAttributePigeon;
            }

            public Builder setAge(Long l3) {
                this.age = l3;
                return this;
            }

            public Builder setBoolValue(Boolean bool) {
                this.boolValue = bool;
                return this;
            }

            public Builder setDay(Long l3) {
                this.day = l3;
                return this;
            }

            public Builder setDoubleValue(Double d3) {
                this.doubleValue = d3;
                return this;
            }

            public Builder setGenderValue(GenderPigeon genderPigeon) {
                this.genderValue = genderPigeon;
                return this;
            }

            public Builder setIfUndefined(Boolean bool) {
                this.ifUndefined = bool;
                return this;
            }

            public Builder setKey(String str) {
                this.key = str;
                return this;
            }

            public Builder setMonth(Long l3) {
                this.month = l3;
                return this;
            }

            public Builder setReset(Boolean bool) {
                this.reset = bool;
                return this;
            }

            public Builder setStringValue(String str) {
                this.stringValue = str;
                return this;
            }

            public Builder setType(UserProfileAttributeType userProfileAttributeType) {
                this.type = userProfileAttributeType;
                return this;
            }

            public Builder setYear(Long l3) {
                this.year = l3;
                return this;
            }
        }

        public static UserProfileAttributePigeon fromList(ArrayList<Object> arrayList) {
            Long valueOf;
            Long valueOf2;
            Long valueOf3;
            Long valueOf4;
            UserProfileAttributePigeon userProfileAttributePigeon = new UserProfileAttributePigeon();
            userProfileAttributePigeon.setKey((String) arrayList.get(0));
            userProfileAttributePigeon.setDoubleValue((Double) arrayList.get(1));
            userProfileAttributePigeon.setStringValue((String) arrayList.get(2));
            userProfileAttributePigeon.setBoolValue((Boolean) arrayList.get(3));
            Object obj = arrayList.get(4);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            userProfileAttributePigeon.setYear(valueOf);
            Object obj2 = arrayList.get(5);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(obj2 instanceof Integer ? ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            userProfileAttributePigeon.setMonth(valueOf2);
            Object obj3 = arrayList.get(6);
            if (obj3 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = Long.valueOf(obj3 instanceof Integer ? ((Integer) obj3).intValue() : ((Long) obj3).longValue());
            }
            userProfileAttributePigeon.setDay(valueOf3);
            Object obj4 = arrayList.get(7);
            if (obj4 == null) {
                valueOf4 = null;
            } else {
                valueOf4 = Long.valueOf(obj4 instanceof Integer ? ((Integer) obj4).intValue() : ((Long) obj4).longValue());
            }
            userProfileAttributePigeon.setAge(valueOf4);
            Object obj5 = arrayList.get(8);
            userProfileAttributePigeon.setGenderValue(obj5 == null ? null : GenderPigeon.values()[((Integer) obj5).intValue()]);
            userProfileAttributePigeon.setIfUndefined((Boolean) arrayList.get(9));
            userProfileAttributePigeon.setReset((Boolean) arrayList.get(10));
            Object obj6 = arrayList.get(11);
            userProfileAttributePigeon.setType(obj6 != null ? UserProfileAttributeType.values()[((Integer) obj6).intValue()] : null);
            return userProfileAttributePigeon;
        }

        public Long getAge() {
            return this.age;
        }

        public Boolean getBoolValue() {
            return this.boolValue;
        }

        public Long getDay() {
            return this.day;
        }

        public Double getDoubleValue() {
            return this.doubleValue;
        }

        public GenderPigeon getGenderValue() {
            return this.genderValue;
        }

        public Boolean getIfUndefined() {
            return this.ifUndefined;
        }

        public String getKey() {
            return this.key;
        }

        public Long getMonth() {
            return this.month;
        }

        public Boolean getReset() {
            return this.reset;
        }

        public String getStringValue() {
            return this.stringValue;
        }

        public UserProfileAttributeType getType() {
            return this.type;
        }

        public Long getYear() {
            return this.year;
        }

        public void setAge(Long l3) {
            this.age = l3;
        }

        public void setBoolValue(Boolean bool) {
            this.boolValue = bool;
        }

        public void setDay(Long l3) {
            this.day = l3;
        }

        public void setDoubleValue(Double d3) {
            this.doubleValue = d3;
        }

        public void setGenderValue(GenderPigeon genderPigeon) {
            this.genderValue = genderPigeon;
        }

        public void setIfUndefined(Boolean bool) {
            this.ifUndefined = bool;
        }

        public void setKey(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"key\" is null.");
            }
            this.key = str;
        }

        public void setMonth(Long l3) {
            this.month = l3;
        }

        public void setReset(Boolean bool) {
            this.reset = bool;
        }

        public void setStringValue(String str) {
            this.stringValue = str;
        }

        public void setType(UserProfileAttributeType userProfileAttributeType) {
            this.type = userProfileAttributeType;
        }

        public void setYear(Long l3) {
            this.year = l3;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(12);
            arrayList.add(this.key);
            arrayList.add(this.doubleValue);
            arrayList.add(this.stringValue);
            arrayList.add(this.boolValue);
            arrayList.add(this.year);
            arrayList.add(this.month);
            arrayList.add(this.day);
            arrayList.add(this.age);
            GenderPigeon genderPigeon = this.genderValue;
            arrayList.add(genderPigeon == null ? null : Integer.valueOf(genderPigeon.index));
            arrayList.add(this.ifUndefined);
            arrayList.add(this.reset);
            UserProfileAttributeType userProfileAttributeType = this.type;
            arrayList.add(userProfileAttributeType != null ? Integer.valueOf(userProfileAttributeType.index) : null);
            return arrayList;
        }
    }

    public enum UserProfileAttributeType {
        BIRTH_DATE(0),
        BOOLEAN(1),
        COUNTER(2),
        GENDER(3),
        NAME(4),
        NOTIFICATION_ENABLED(5),
        NUMBER(6),
        STRING(7);

        final int index;

        UserProfileAttributeType(int i3) {
            this.index = i3;
        }
    }

    public static final class UserProfilePigeon {
        private List<UserProfileAttributePigeon> attributes;

        public static final class Builder {
            private List<UserProfileAttributePigeon> attributes;

            public UserProfilePigeon build() {
                UserProfilePigeon userProfilePigeon = new UserProfilePigeon();
                userProfilePigeon.setAttributes(this.attributes);
                return userProfilePigeon;
            }

            public Builder setAttributes(List<UserProfileAttributePigeon> list) {
                this.attributes = list;
                return this;
            }
        }

        public static UserProfilePigeon fromList(ArrayList<Object> arrayList) {
            UserProfilePigeon userProfilePigeon = new UserProfilePigeon();
            userProfilePigeon.setAttributes((List) arrayList.get(0));
            return userProfilePigeon;
        }

        public List<UserProfileAttributePigeon> getAttributes() {
            return this.attributes;
        }

        public void setAttributes(List<UserProfileAttributePigeon> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"attributes\" is null.");
            }
            this.attributes = list;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.attributes);
            return arrayList;
        }
    }

    public static ArrayList<Object> wrapError(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
