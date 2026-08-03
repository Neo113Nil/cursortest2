package io.appmetrica.analytics.flutter.pigeon;

/* loaded from: classes.dex */
public class Pigeon {

    public static final class AdRevenuePigeon {
        private java.lang.String adNetwork;
        private java.lang.String adPlacementId;
        private java.lang.String adPlacementName;
        private java.lang.String adRevenue;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon adType;
        private java.lang.String adUnitId;
        private java.lang.String adUnitName;
        private java.lang.String currency;
        private java.util.Map<java.lang.String, java.lang.String> payload;
        private java.lang.String precision;

        public static final class Builder {
            private java.lang.String adNetwork;
            private java.lang.String adPlacementId;
            private java.lang.String adPlacementName;
            private java.lang.String adRevenue;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon adType;
            private java.lang.String adUnitId;
            private java.lang.String adUnitName;
            private java.lang.String currency;
            private java.util.Map<java.lang.String, java.lang.String> payload;
            private java.lang.String precision;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon adRevenuePigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon();
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

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon.Builder setAdNetwork(java.lang.String str) {
                this.adNetwork = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon.Builder setAdPlacementId(java.lang.String str) {
                this.adPlacementId = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon.Builder setAdPlacementName(java.lang.String str) {
                this.adPlacementName = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon.Builder setAdRevenue(java.lang.String str) {
                this.adRevenue = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon.Builder setAdType(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon adTypePigeon) {
                this.adType = adTypePigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon.Builder setAdUnitId(java.lang.String str) {
                this.adUnitId = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon.Builder setAdUnitName(java.lang.String str) {
                this.adUnitName = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon.Builder setCurrency(java.lang.String str) {
                this.currency = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon.Builder setPayload(java.util.Map<java.lang.String, java.lang.String> map) {
                this.payload = map;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon.Builder setPrecision(java.lang.String str) {
                this.precision = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon adRevenuePigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon();
            adRevenuePigeon.setAdRevenue((java.lang.String) arrayList.get(0));
            adRevenuePigeon.setCurrency((java.lang.String) arrayList.get(1));
            java.lang.Object obj = arrayList.get(2);
            adRevenuePigeon.setAdType(obj == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon.values()[((java.lang.Integer) obj).intValue()]);
            adRevenuePigeon.setAdNetwork((java.lang.String) arrayList.get(3));
            adRevenuePigeon.setAdUnitId((java.lang.String) arrayList.get(4));
            adRevenuePigeon.setAdUnitName((java.lang.String) arrayList.get(5));
            adRevenuePigeon.setAdPlacementId((java.lang.String) arrayList.get(6));
            adRevenuePigeon.setAdPlacementName((java.lang.String) arrayList.get(7));
            adRevenuePigeon.setPrecision((java.lang.String) arrayList.get(8));
            adRevenuePigeon.setPayload((java.util.Map) arrayList.get(9));
            return adRevenuePigeon;
        }

        public java.lang.String getAdNetwork() {
            return this.adNetwork;
        }

        public java.lang.String getAdPlacementId() {
            return this.adPlacementId;
        }

        public java.lang.String getAdPlacementName() {
            return this.adPlacementName;
        }

        public java.lang.String getAdRevenue() {
            return this.adRevenue;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon getAdType() {
            return this.adType;
        }

        public java.lang.String getAdUnitId() {
            return this.adUnitId;
        }

        public java.lang.String getAdUnitName() {
            return this.adUnitName;
        }

        public java.lang.String getCurrency() {
            return this.currency;
        }

        public java.util.Map<java.lang.String, java.lang.String> getPayload() {
            return this.payload;
        }

        public java.lang.String getPrecision() {
            return this.precision;
        }

        public void setAdNetwork(java.lang.String str) {
            this.adNetwork = str;
        }

        public void setAdPlacementId(java.lang.String str) {
            this.adPlacementId = str;
        }

        public void setAdPlacementName(java.lang.String str) {
            this.adPlacementName = str;
        }

        public void setAdRevenue(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"adRevenue\" is null.");
            }
            this.adRevenue = str;
        }

        public void setAdType(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon adTypePigeon) {
            this.adType = adTypePigeon;
        }

        public void setAdUnitId(java.lang.String str) {
            this.adUnitId = str;
        }

        public void setAdUnitName(java.lang.String str) {
            this.adUnitName = str;
        }

        public void setCurrency(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"currency\" is null.");
            }
            this.currency = str;
        }

        public void setPayload(java.util.Map<java.lang.String, java.lang.String> map) {
            this.payload = map;
        }

        public void setPrecision(java.lang.String str) {
            this.precision = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(10);
            arrayList.add(this.adRevenue);
            arrayList.add(this.currency);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.AdTypePigeon adTypePigeon = this.adType;
            arrayList.add(adTypePigeon == null ? null : java.lang.Integer.valueOf(adTypePigeon.index));
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

        AdTypePigeon(int i2) {
            this.index = i2;
        }
    }

    public interface AppMetricaConfigConverterPigeon {
        static a1.j getCodec() {
            return io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigConverterPigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigConverterPigeon appMetricaConfigConverterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, appMetricaConfigConverterPigeon.toJson((io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon) ((java.util.ArrayList) obj).get(0)));
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        static void setup(a1.f fVar, io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigConverterPigeon appMetricaConfigConverterPigeon) {
            F.C0014n c0014n = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaConfigConverterPigeon.toJson", getCodec(), null);
            if (appMetricaConfigConverterPigeon != null) {
                c0014n.h(new E0.a(5, appMetricaConfigConverterPigeon));
            } else {
                c0014n.h(null);
            }
        }

        java.lang.String toJson(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon appMetricaConfigPigeon);
    }

    public static class AppMetricaConfigConverterPigeonCodec extends a1.n {
        public static final io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigConverterPigeonCodec INSTANCE = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigConverterPigeonCodec();

        private AppMetricaConfigConverterPigeonCodec() {
        }

        @Override // a1.n
        public java.lang.Object readValueOfType(byte b2, java.nio.ByteBuffer byteBuffer) {
            switch (b2) {
                case Byte.MIN_VALUE:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -127:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -126:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b2, byteBuffer);
            }
        }

        @Override // a1.n
        public void writeValue(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon) obj).toList());
            } else if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon) obj).toList());
            } else if (!(obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon) obj).toList());
            }
        }
    }

    public static final class AppMetricaConfigPigeon {
        private java.lang.Boolean advIdentifiersTracking;
        private java.lang.Boolean anrMonitoring;
        private java.lang.Long anrMonitoringTimeout;
        private java.lang.String apiKey;
        private java.lang.Long appBuildNumber;
        private java.util.Map<java.lang.String, java.lang.String> appEnvironment;
        private java.lang.Boolean appOpenTrackingEnabled;
        private java.lang.String appVersion;
        private java.lang.Boolean crashReporting;
        private java.util.List<java.lang.String> customHosts;
        private java.lang.Boolean dataSendingEnabled;
        private java.lang.String deviceType;
        private java.lang.Long dispatchPeriodSeconds;
        private java.util.Map<java.lang.String, java.lang.String> errorEnvironment;
        private java.lang.Boolean firstActivationAsUpdate;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon location;
        private java.lang.Boolean locationTracking;
        private java.lang.Boolean logs;
        private java.lang.Long maxReportsCount;
        private java.lang.Long maxReportsInDatabaseCount;
        private java.lang.Boolean nativeCrashReporting;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon preloadInfo;
        private java.lang.Boolean revenueAutoTrackingEnabled;
        private java.lang.Long sessionTimeout;
        private java.lang.Boolean sessionsAutoTrackingEnabled;
        private java.lang.String userProfileID;

        public static final class Builder {
            private java.lang.Boolean advIdentifiersTracking;
            private java.lang.Boolean anrMonitoring;
            private java.lang.Long anrMonitoringTimeout;
            private java.lang.String apiKey;
            private java.lang.Long appBuildNumber;
            private java.util.Map<java.lang.String, java.lang.String> appEnvironment;
            private java.lang.Boolean appOpenTrackingEnabled;
            private java.lang.String appVersion;
            private java.lang.Boolean crashReporting;
            private java.util.List<java.lang.String> customHosts;
            private java.lang.Boolean dataSendingEnabled;
            private java.lang.String deviceType;
            private java.lang.Long dispatchPeriodSeconds;
            private java.util.Map<java.lang.String, java.lang.String> errorEnvironment;
            private java.lang.Boolean firstActivationAsUpdate;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon location;
            private java.lang.Boolean locationTracking;
            private java.lang.Boolean logs;
            private java.lang.Long maxReportsCount;
            private java.lang.Long maxReportsInDatabaseCount;
            private java.lang.Boolean nativeCrashReporting;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon preloadInfo;
            private java.lang.Boolean revenueAutoTrackingEnabled;
            private java.lang.Long sessionTimeout;
            private java.lang.Boolean sessionsAutoTrackingEnabled;
            private java.lang.String userProfileID;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon appMetricaConfigPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon();
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

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setAdvIdentifiersTracking(java.lang.Boolean bool) {
                this.advIdentifiersTracking = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setAnrMonitoring(java.lang.Boolean bool) {
                this.anrMonitoring = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setAnrMonitoringTimeout(java.lang.Long l2) {
                this.anrMonitoringTimeout = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setApiKey(java.lang.String str) {
                this.apiKey = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setAppBuildNumber(java.lang.Long l2) {
                this.appBuildNumber = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setAppEnvironment(java.util.Map<java.lang.String, java.lang.String> map) {
                this.appEnvironment = map;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setAppOpenTrackingEnabled(java.lang.Boolean bool) {
                this.appOpenTrackingEnabled = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setAppVersion(java.lang.String str) {
                this.appVersion = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setCrashReporting(java.lang.Boolean bool) {
                this.crashReporting = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setCustomHosts(java.util.List<java.lang.String> list) {
                this.customHosts = list;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setDataSendingEnabled(java.lang.Boolean bool) {
                this.dataSendingEnabled = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setDeviceType(java.lang.String str) {
                this.deviceType = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setDispatchPeriodSeconds(java.lang.Long l2) {
                this.dispatchPeriodSeconds = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setErrorEnvironment(java.util.Map<java.lang.String, java.lang.String> map) {
                this.errorEnvironment = map;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setFirstActivationAsUpdate(java.lang.Boolean bool) {
                this.firstActivationAsUpdate = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setLocation(io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon locationPigeon) {
                this.location = locationPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setLocationTracking(java.lang.Boolean bool) {
                this.locationTracking = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setLogs(java.lang.Boolean bool) {
                this.logs = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setMaxReportsCount(java.lang.Long l2) {
                this.maxReportsCount = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setMaxReportsInDatabaseCount(java.lang.Long l2) {
                this.maxReportsInDatabaseCount = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setNativeCrashReporting(java.lang.Boolean bool) {
                this.nativeCrashReporting = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setPreloadInfo(io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon preloadInfoPigeon) {
                this.preloadInfo = preloadInfoPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setRevenueAutoTrackingEnabled(java.lang.Boolean bool) {
                this.revenueAutoTrackingEnabled = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setSessionTimeout(java.lang.Long l2) {
                this.sessionTimeout = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setSessionsAutoTrackingEnabled(java.lang.Boolean bool) {
                this.sessionsAutoTrackingEnabled = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.Builder setUserProfileID(java.lang.String str) {
                this.userProfileID = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            java.lang.Long valueOf;
            java.lang.Long valueOf2;
            java.lang.Long valueOf3;
            java.lang.Long valueOf4;
            java.lang.Long valueOf5;
            io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon appMetricaConfigPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon();
            appMetricaConfigPigeon.setApiKey((java.lang.String) arrayList.get(0));
            appMetricaConfigPigeon.setAdvIdentifiersTracking((java.lang.Boolean) arrayList.get(1));
            appMetricaConfigPigeon.setAnrMonitoring((java.lang.Boolean) arrayList.get(2));
            java.lang.Object obj = arrayList.get(3);
            java.lang.Long l2 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            appMetricaConfigPigeon.setAnrMonitoringTimeout(valueOf);
            java.lang.Object obj2 = arrayList.get(4);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = java.lang.Long.valueOf(obj2 instanceof java.lang.Integer ? ((java.lang.Integer) obj2).intValue() : ((java.lang.Long) obj2).longValue());
            }
            appMetricaConfigPigeon.setAppBuildNumber(valueOf2);
            appMetricaConfigPigeon.setAppEnvironment((java.util.Map) arrayList.get(5));
            appMetricaConfigPigeon.setAppOpenTrackingEnabled((java.lang.Boolean) arrayList.get(6));
            appMetricaConfigPigeon.setAppVersion((java.lang.String) arrayList.get(7));
            appMetricaConfigPigeon.setCrashReporting((java.lang.Boolean) arrayList.get(8));
            appMetricaConfigPigeon.setCustomHosts((java.util.List) arrayList.get(9));
            appMetricaConfigPigeon.setDataSendingEnabled((java.lang.Boolean) arrayList.get(10));
            appMetricaConfigPigeon.setDeviceType((java.lang.String) arrayList.get(11));
            java.lang.Object obj3 = arrayList.get(12);
            if (obj3 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = java.lang.Long.valueOf(obj3 instanceof java.lang.Integer ? ((java.lang.Integer) obj3).intValue() : ((java.lang.Long) obj3).longValue());
            }
            appMetricaConfigPigeon.setDispatchPeriodSeconds(valueOf3);
            appMetricaConfigPigeon.setErrorEnvironment((java.util.Map) arrayList.get(13));
            appMetricaConfigPigeon.setFirstActivationAsUpdate((java.lang.Boolean) arrayList.get(14));
            java.lang.Object obj4 = arrayList.get(15);
            appMetricaConfigPigeon.setLocation(obj4 == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon.fromList((java.util.ArrayList) obj4));
            appMetricaConfigPigeon.setLocationTracking((java.lang.Boolean) arrayList.get(16));
            appMetricaConfigPigeon.setLogs((java.lang.Boolean) arrayList.get(17));
            java.lang.Object obj5 = arrayList.get(18);
            if (obj5 == null) {
                valueOf4 = null;
            } else {
                valueOf4 = java.lang.Long.valueOf(obj5 instanceof java.lang.Integer ? ((java.lang.Integer) obj5).intValue() : ((java.lang.Long) obj5).longValue());
            }
            appMetricaConfigPigeon.setMaxReportsCount(valueOf4);
            java.lang.Object obj6 = arrayList.get(19);
            if (obj6 == null) {
                valueOf5 = null;
            } else {
                valueOf5 = java.lang.Long.valueOf(obj6 instanceof java.lang.Integer ? ((java.lang.Integer) obj6).intValue() : ((java.lang.Long) obj6).longValue());
            }
            appMetricaConfigPigeon.setMaxReportsInDatabaseCount(valueOf5);
            appMetricaConfigPigeon.setNativeCrashReporting((java.lang.Boolean) arrayList.get(20));
            java.lang.Object obj7 = arrayList.get(21);
            appMetricaConfigPigeon.setPreloadInfo(obj7 == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon.fromList((java.util.ArrayList) obj7));
            appMetricaConfigPigeon.setRevenueAutoTrackingEnabled((java.lang.Boolean) arrayList.get(22));
            java.lang.Object obj8 = arrayList.get(23);
            if (obj8 != null) {
                l2 = java.lang.Long.valueOf(obj8 instanceof java.lang.Integer ? ((java.lang.Integer) obj8).intValue() : ((java.lang.Long) obj8).longValue());
            }
            appMetricaConfigPigeon.setSessionTimeout(l2);
            appMetricaConfigPigeon.setSessionsAutoTrackingEnabled((java.lang.Boolean) arrayList.get(24));
            appMetricaConfigPigeon.setUserProfileID((java.lang.String) arrayList.get(25));
            return appMetricaConfigPigeon;
        }

        public java.lang.Boolean getAdvIdentifiersTracking() {
            return this.advIdentifiersTracking;
        }

        public java.lang.Boolean getAnrMonitoring() {
            return this.anrMonitoring;
        }

        public java.lang.Long getAnrMonitoringTimeout() {
            return this.anrMonitoringTimeout;
        }

        public java.lang.String getApiKey() {
            return this.apiKey;
        }

        public java.lang.Long getAppBuildNumber() {
            return this.appBuildNumber;
        }

        public java.util.Map<java.lang.String, java.lang.String> getAppEnvironment() {
            return this.appEnvironment;
        }

        public java.lang.Boolean getAppOpenTrackingEnabled() {
            return this.appOpenTrackingEnabled;
        }

        public java.lang.String getAppVersion() {
            return this.appVersion;
        }

        public java.lang.Boolean getCrashReporting() {
            return this.crashReporting;
        }

        public java.util.List<java.lang.String> getCustomHosts() {
            return this.customHosts;
        }

        public java.lang.Boolean getDataSendingEnabled() {
            return this.dataSendingEnabled;
        }

        public java.lang.String getDeviceType() {
            return this.deviceType;
        }

        public java.lang.Long getDispatchPeriodSeconds() {
            return this.dispatchPeriodSeconds;
        }

        public java.util.Map<java.lang.String, java.lang.String> getErrorEnvironment() {
            return this.errorEnvironment;
        }

        public java.lang.Boolean getFirstActivationAsUpdate() {
            return this.firstActivationAsUpdate;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon getLocation() {
            return this.location;
        }

        public java.lang.Boolean getLocationTracking() {
            return this.locationTracking;
        }

        public java.lang.Boolean getLogs() {
            return this.logs;
        }

        public java.lang.Long getMaxReportsCount() {
            return this.maxReportsCount;
        }

        public java.lang.Long getMaxReportsInDatabaseCount() {
            return this.maxReportsInDatabaseCount;
        }

        public java.lang.Boolean getNativeCrashReporting() {
            return this.nativeCrashReporting;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon getPreloadInfo() {
            return this.preloadInfo;
        }

        public java.lang.Boolean getRevenueAutoTrackingEnabled() {
            return this.revenueAutoTrackingEnabled;
        }

        public java.lang.Long getSessionTimeout() {
            return this.sessionTimeout;
        }

        public java.lang.Boolean getSessionsAutoTrackingEnabled() {
            return this.sessionsAutoTrackingEnabled;
        }

        public java.lang.String getUserProfileID() {
            return this.userProfileID;
        }

        public void setAdvIdentifiersTracking(java.lang.Boolean bool) {
            this.advIdentifiersTracking = bool;
        }

        public void setAnrMonitoring(java.lang.Boolean bool) {
            this.anrMonitoring = bool;
        }

        public void setAnrMonitoringTimeout(java.lang.Long l2) {
            this.anrMonitoringTimeout = l2;
        }

        public void setApiKey(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.apiKey = str;
        }

        public void setAppBuildNumber(java.lang.Long l2) {
            this.appBuildNumber = l2;
        }

        public void setAppEnvironment(java.util.Map<java.lang.String, java.lang.String> map) {
            this.appEnvironment = map;
        }

        public void setAppOpenTrackingEnabled(java.lang.Boolean bool) {
            this.appOpenTrackingEnabled = bool;
        }

        public void setAppVersion(java.lang.String str) {
            this.appVersion = str;
        }

        public void setCrashReporting(java.lang.Boolean bool) {
            this.crashReporting = bool;
        }

        public void setCustomHosts(java.util.List<java.lang.String> list) {
            this.customHosts = list;
        }

        public void setDataSendingEnabled(java.lang.Boolean bool) {
            this.dataSendingEnabled = bool;
        }

        public void setDeviceType(java.lang.String str) {
            this.deviceType = str;
        }

        public void setDispatchPeriodSeconds(java.lang.Long l2) {
            this.dispatchPeriodSeconds = l2;
        }

        public void setErrorEnvironment(java.util.Map<java.lang.String, java.lang.String> map) {
            this.errorEnvironment = map;
        }

        public void setFirstActivationAsUpdate(java.lang.Boolean bool) {
            this.firstActivationAsUpdate = bool;
        }

        public void setLocation(io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon locationPigeon) {
            this.location = locationPigeon;
        }

        public void setLocationTracking(java.lang.Boolean bool) {
            this.locationTracking = bool;
        }

        public void setLogs(java.lang.Boolean bool) {
            this.logs = bool;
        }

        public void setMaxReportsCount(java.lang.Long l2) {
            this.maxReportsCount = l2;
        }

        public void setMaxReportsInDatabaseCount(java.lang.Long l2) {
            this.maxReportsInDatabaseCount = l2;
        }

        public void setNativeCrashReporting(java.lang.Boolean bool) {
            this.nativeCrashReporting = bool;
        }

        public void setPreloadInfo(io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon preloadInfoPigeon) {
            this.preloadInfo = preloadInfoPigeon;
        }

        public void setRevenueAutoTrackingEnabled(java.lang.Boolean bool) {
            this.revenueAutoTrackingEnabled = bool;
        }

        public void setSessionTimeout(java.lang.Long l2) {
            this.sessionTimeout = l2;
        }

        public void setSessionsAutoTrackingEnabled(java.lang.Boolean bool) {
            this.sessionsAutoTrackingEnabled = bool;
        }

        public void setUserProfileID(java.lang.String str) {
            this.userProfileID = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(26);
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
            io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon locationPigeon = this.location;
            arrayList.add(locationPigeon == null ? null : locationPigeon.toList());
            arrayList.add(this.locationTracking);
            arrayList.add(this.logs);
            arrayList.add(this.maxReportsCount);
            arrayList.add(this.maxReportsInDatabaseCount);
            arrayList.add(this.nativeCrashReporting);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon preloadInfoPigeon = this.preloadInfo;
            arrayList.add(preloadInfoPigeon != null ? preloadInfoPigeon.toList() : null);
            arrayList.add(this.revenueAutoTrackingEnabled);
            arrayList.add(this.sessionTimeout);
            arrayList.add(this.sessionsAutoTrackingEnabled);
            arrayList.add(this.userProfileID);
            return arrayList;
        }
    }

    public static final class AppMetricaDeferredDeeplinkErrorPigeon {
        private java.lang.String errorDescription;
        private java.lang.String message;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon reason;

        public static final class Builder {
            private java.lang.String errorDescription;
            private java.lang.String message;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon reason;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon();
                appMetricaDeferredDeeplinkErrorPigeon.setReason(this.reason);
                appMetricaDeferredDeeplinkErrorPigeon.setErrorDescription(this.errorDescription);
                appMetricaDeferredDeeplinkErrorPigeon.setMessage(this.message);
                return appMetricaDeferredDeeplinkErrorPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon.Builder setErrorDescription(java.lang.String str) {
                this.errorDescription = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon.Builder setMessage(java.lang.String str) {
                this.message = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon.Builder setReason(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon) {
                this.reason = appMetricaDeferredDeeplinkReasonPigeon;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon();
            java.lang.Object obj = arrayList.get(0);
            appMetricaDeferredDeeplinkErrorPigeon.setReason(obj == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon.values()[((java.lang.Integer) obj).intValue()]);
            appMetricaDeferredDeeplinkErrorPigeon.setErrorDescription((java.lang.String) arrayList.get(1));
            appMetricaDeferredDeeplinkErrorPigeon.setMessage((java.lang.String) arrayList.get(2));
            return appMetricaDeferredDeeplinkErrorPigeon;
        }

        public java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        public java.lang.String getMessage() {
            return this.message;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon getReason() {
            return this.reason;
        }

        public void setErrorDescription(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"errorDescription\" is null.");
            }
            this.errorDescription = str;
        }

        public void setMessage(java.lang.String str) {
            this.message = str;
        }

        public void setReason(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon) {
            if (appMetricaDeferredDeeplinkReasonPigeon == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"reason\" is null.");
            }
            this.reason = appMetricaDeferredDeeplinkReasonPigeon;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(3);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkReasonPigeon appMetricaDeferredDeeplinkReasonPigeon = this.reason;
            arrayList.add(appMetricaDeferredDeeplinkReasonPigeon == null ? null : java.lang.Integer.valueOf(appMetricaDeferredDeeplinkReasonPigeon.index));
            arrayList.add(this.errorDescription);
            arrayList.add(this.message);
            return arrayList;
        }
    }

    public static final class AppMetricaDeferredDeeplinkParametersPigeon {
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon error;
        private java.util.Map<java.lang.String, java.lang.String> parameters;

        public static final class Builder {
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon error;
            private java.util.Map<java.lang.String, java.lang.String> parameters;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon appMetricaDeferredDeeplinkParametersPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon();
                appMetricaDeferredDeeplinkParametersPigeon.setParameters(this.parameters);
                appMetricaDeferredDeeplinkParametersPigeon.setError(this.error);
                return appMetricaDeferredDeeplinkParametersPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon.Builder setError(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon) {
                this.error = appMetricaDeferredDeeplinkErrorPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon.Builder setParameters(java.util.Map<java.lang.String, java.lang.String> map) {
                this.parameters = map;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon appMetricaDeferredDeeplinkParametersPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon();
            appMetricaDeferredDeeplinkParametersPigeon.setParameters((java.util.Map) arrayList.get(0));
            java.lang.Object obj = arrayList.get(1);
            appMetricaDeferredDeeplinkParametersPigeon.setError(obj == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon.fromList((java.util.ArrayList) obj));
            return appMetricaDeferredDeeplinkParametersPigeon;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon getError() {
            return this.error;
        }

        public java.util.Map<java.lang.String, java.lang.String> getParameters() {
            return this.parameters;
        }

        public void setError(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon) {
            this.error = appMetricaDeferredDeeplinkErrorPigeon;
        }

        public void setParameters(java.util.Map<java.lang.String, java.lang.String> map) {
            this.parameters = map;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(2);
            arrayList.add(this.parameters);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon = this.error;
            arrayList.add(appMetricaDeferredDeeplinkErrorPigeon == null ? null : appMetricaDeferredDeeplinkErrorPigeon.toList());
            return arrayList;
        }
    }

    public static final class AppMetricaDeferredDeeplinkPigeon {
        private java.lang.String deeplink;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon error;

        public static final class Builder {
            private java.lang.String deeplink;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon error;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon appMetricaDeferredDeeplinkPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon();
                appMetricaDeferredDeeplinkPigeon.setDeeplink(this.deeplink);
                appMetricaDeferredDeeplinkPigeon.setError(this.error);
                return appMetricaDeferredDeeplinkPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon.Builder setDeeplink(java.lang.String str) {
                this.deeplink = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon.Builder setError(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon) {
                this.error = appMetricaDeferredDeeplinkErrorPigeon;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon appMetricaDeferredDeeplinkPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon();
            appMetricaDeferredDeeplinkPigeon.setDeeplink((java.lang.String) arrayList.get(0));
            java.lang.Object obj = arrayList.get(1);
            appMetricaDeferredDeeplinkPigeon.setError(obj == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon.fromList((java.util.ArrayList) obj));
            return appMetricaDeferredDeeplinkPigeon;
        }

        public java.lang.String getDeeplink() {
            return this.deeplink;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon getError() {
            return this.error;
        }

        public void setDeeplink(java.lang.String str) {
            this.deeplink = str;
        }

        public void setError(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon) {
            this.error = appMetricaDeferredDeeplinkErrorPigeon;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(2);
            arrayList.add(this.deeplink);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon appMetricaDeferredDeeplinkErrorPigeon = this.error;
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

        AppMetricaDeferredDeeplinkReasonPigeon(int i2) {
            this.index = i2;
        }
    }

    public static final class AppMetricaLibraryAdapterConfigPigeon {
        private java.lang.Boolean advIdentifiersTracking;

        public static final class Builder {
            private java.lang.Boolean advIdentifiersTracking;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon appMetricaLibraryAdapterConfigPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon();
                appMetricaLibraryAdapterConfigPigeon.setAdvIdentifiersTracking(this.advIdentifiersTracking);
                return appMetricaLibraryAdapterConfigPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon.Builder setAdvIdentifiersTracking(java.lang.Boolean bool) {
                this.advIdentifiersTracking = bool;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon appMetricaLibraryAdapterConfigPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon();
            appMetricaLibraryAdapterConfigPigeon.setAdvIdentifiersTracking((java.lang.Boolean) arrayList.get(0));
            return appMetricaLibraryAdapterConfigPigeon;
        }

        public java.lang.Boolean getAdvIdentifiersTracking() {
            return this.advIdentifiersTracking;
        }

        public void setAdvIdentifiersTracking(java.lang.Boolean bool) {
            this.advIdentifiersTracking = bool;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(1);
            arrayList.add(this.advIdentifiersTracking);
            return arrayList;
        }
    }

    public interface AppMetricaLibraryAdapterPigeon {
        static a1.j getCodec() {
            return io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon appMetricaLibraryAdapterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaLibraryAdapterPigeon.activate((io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon appMetricaLibraryAdapterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaLibraryAdapterPigeon.subscribeForAutoCollectedData((java.lang.String) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon appMetricaLibraryAdapterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaLibraryAdapterPigeon.setAdvIdentifiersTracking((java.lang.Boolean) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        static void setup(a1.f fVar, final io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon appMetricaLibraryAdapterPigeon) {
            F.C0014n c0014n = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaLibraryAdapterPigeon.activate", getCodec(), null);
            if (appMetricaLibraryAdapterPigeon != null) {
                final int i2 = 0;
                c0014n.h(new a1.InterfaceC0062b(appMetricaLibraryAdapterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon f3840b;

                    {
                        this.f3840b = appMetricaLibraryAdapterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i2) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$0(this.f3840b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$1(this.f3840b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$2(this.f3840b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n.h(null);
            }
            F.C0014n c0014n2 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaLibraryAdapterPigeon.subscribeForAutoCollectedData", getCodec(), null);
            if (appMetricaLibraryAdapterPigeon != null) {
                final int i3 = 1;
                c0014n2.h(new a1.InterfaceC0062b(appMetricaLibraryAdapterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon f3840b;

                    {
                        this.f3840b = appMetricaLibraryAdapterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i3) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$0(this.f3840b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$1(this.f3840b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$2(this.f3840b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n2.h(null);
            }
            F.C0014n c0014n3 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaLibraryAdapterPigeon.setAdvIdentifiersTracking", getCodec(), null);
            if (appMetricaLibraryAdapterPigeon == null) {
                c0014n3.h(null);
            } else {
                final int i4 = 2;
                c0014n3.h(new a1.InterfaceC0062b(appMetricaLibraryAdapterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon f3840b;

                    {
                        this.f3840b = appMetricaLibraryAdapterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i4) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$0(this.f3840b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$1(this.f3840b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$2(this.f3840b, obj, eVar);
                                break;
                        }
                    }
                });
            }
        }

        void activate(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon appMetricaLibraryAdapterConfigPigeon);

        void setAdvIdentifiersTracking(java.lang.Boolean bool);

        void subscribeForAutoCollectedData(java.lang.String str);
    }

    public static class AppMetricaLibraryAdapterPigeonCodec extends a1.n {
        public static final io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeonCodec INSTANCE = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterPigeonCodec();

        private AppMetricaLibraryAdapterPigeonCodec() {
        }

        @Override // a1.n
        public java.lang.Object readValueOfType(byte b2, java.nio.ByteBuffer byteBuffer) {
            return b2 != Byte.MIN_VALUE ? super.readValueOfType(b2, byteBuffer) : io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
        }

        @Override // a1.n
        public void writeValue(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
            if (!(obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaLibraryAdapterConfigPigeon) obj).toList());
            }
        }
    }

    public interface AppMetricaPigeon {
        static a1.j getCodec() {
            return io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.activate((io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.activateReporter((io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$10(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                appMetricaPigeon.putErrorEnvironmentValue((java.lang.String) arrayList2.get(0), (java.lang.String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$11(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.reportAdRevenue((io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$12(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.reportAppOpen((java.lang.String) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$13(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.reportECommerce((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$14(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                appMetricaPigeon.reportError((io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon) arrayList2.get(0), (java.lang.String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$15(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                appMetricaPigeon.reportErrorWithGroup((java.lang.String) arrayList2.get(0), (io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon) arrayList2.get(1), (java.lang.String) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$16(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.reportEvent((java.lang.String) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$17(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                appMetricaPigeon.reportEventWithJson((java.lang.String) arrayList2.get(0), (java.lang.String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$18(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.reportExternalAttribution((io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$19(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.reportRevenue((io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.clearAppEnvironment();
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$20(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.reportUnhandledException((io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$21(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.reportUserProfile((io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$22(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, final a1.InterfaceC0063c interfaceC0063c) {
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            appMetricaPigeon.requestDeferredDeeplink(new io.appmetrica.analytics.flutter.pigeon.Pigeon.Result<io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon>() { // from class: io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.1
                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void error(java.lang.Throwable th) {
                    interfaceC0063c.f(io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th));
                }

                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void success(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon appMetricaDeferredDeeplinkPigeon) {
                    arrayList.add(0, appMetricaDeferredDeeplinkPigeon);
                    interfaceC0063c.f(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$23(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, final a1.InterfaceC0063c interfaceC0063c) {
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            appMetricaPigeon.requestDeferredDeeplinkParameters(new io.appmetrica.analytics.flutter.pigeon.Pigeon.Result<io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon>() { // from class: io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.2
                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void error(java.lang.Throwable th) {
                    interfaceC0063c.f(io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th));
                }

                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void success(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon appMetricaDeferredDeeplinkParametersPigeon) {
                    arrayList.add(0, appMetricaDeferredDeeplinkParametersPigeon);
                    interfaceC0063c.f(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$24(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, final a1.InterfaceC0063c interfaceC0063c) {
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            appMetricaPigeon.requestStartupParams((java.util.List) ((java.util.ArrayList) obj).get(0), new io.appmetrica.analytics.flutter.pigeon.Pigeon.Result<io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon>() { // from class: io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.3
                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void error(java.lang.Throwable th) {
                    interfaceC0063c.f(io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th));
                }

                @Override // io.appmetrica.analytics.flutter.pigeon.Pigeon.Result
                public void success(io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon startupParamsPigeon) {
                    arrayList.add(0, startupParamsPigeon);
                    interfaceC0063c.f(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$25(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.resumeSession();
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$26(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.sendEventsBuffer();
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$27(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.setAdvIdentifiersTracking((java.lang.Boolean) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$28(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.setDataSendingEnabled((java.lang.Boolean) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$29(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.setLocation((io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.enableActivityAutoTracking();
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$30(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.setLocationTracking((java.lang.Boolean) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$31(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.setUserProfileID((java.lang.String) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$32(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.handlePluginInitFinished();
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$33(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.touchReporter((java.lang.String) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, appMetricaPigeon.getDeviceId());
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, appMetricaPigeon.getLibraryApiLevel());
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, appMetricaPigeon.getLibraryVersion());
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, appMetricaPigeon.getUuid());
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                appMetricaPigeon.pauseSession();
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$9(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                appMetricaPigeon.putAppEnvironmentValue((java.lang.String) arrayList2.get(0), (java.lang.String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        static void setup(a1.f fVar, final io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon appMetricaPigeon) {
            F.C0014n c0014n = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.activate", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i2 = 0;
                c0014n.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i2) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n.h(null);
            }
            F.C0014n c0014n2 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.activateReporter", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i3 = 2;
                c0014n2.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i3) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n2.h(null);
            }
            F.C0014n c0014n3 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.clearAppEnvironment", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i4 = 14;
                c0014n3.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i4) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n3.h(null);
            }
            F.C0014n c0014n4 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.enableActivityAutoTracking", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i5 = 19;
                c0014n4.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i5) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n4.h(null);
            }
            F.C0014n c0014n5 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.getDeviceId", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i6 = 20;
                c0014n5.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i6) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n5.h(null);
            }
            F.C0014n c0014n6 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.getLibraryApiLevel", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i7 = 21;
                c0014n6.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i7) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n6.h(null);
            }
            F.C0014n c0014n7 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.getLibraryVersion", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i8 = 23;
                c0014n7.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i8) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n7.h(null);
            }
            F.C0014n c0014n8 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.getUuid", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i9 = 24;
                c0014n8.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i9) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n8.h(null);
            }
            F.C0014n c0014n9 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.pauseSession", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i10 = 25;
                c0014n9.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i10) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n9.h(null);
            }
            F.C0014n c0014n10 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.putAppEnvironmentValue", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i11 = 26;
                c0014n10.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i11) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n10.h(null);
            }
            F.C0014n c0014n11 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.putErrorEnvironmentValue", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i12 = 11;
                c0014n11.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i12) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n11.h(null);
            }
            F.C0014n c0014n12 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportAdRevenue", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i13 = 22;
                c0014n12.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i13) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n12.h(null);
            }
            F.C0014n c0014n13 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportAppOpen", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i14 = 27;
                c0014n13.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i14) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n13.h(null);
            }
            F.C0014n c0014n14 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportECommerce", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i15 = 28;
                c0014n14.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i15) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n14.h(null);
            }
            F.C0014n c0014n15 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportError", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i16 = 29;
                c0014n15.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i16) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n15.h(null);
            }
            F.C0014n c0014n16 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportErrorWithGroup", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i17 = 0;
                c0014n16.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3844b;

                    {
                        this.f3844b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i17) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$15(this.f3844b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$16(this.f3844b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$17(this.f3844b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$18(this.f3844b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n16.h(null);
            }
            F.C0014n c0014n17 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportEvent", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i18 = 1;
                c0014n17.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3844b;

                    {
                        this.f3844b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i18) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$15(this.f3844b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$16(this.f3844b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$17(this.f3844b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$18(this.f3844b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n17.h(null);
            }
            F.C0014n c0014n18 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportEventWithJson", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i19 = 2;
                c0014n18.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3844b;

                    {
                        this.f3844b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i19) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$15(this.f3844b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$16(this.f3844b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$17(this.f3844b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$18(this.f3844b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n18.h(null);
            }
            F.C0014n c0014n19 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportExternalAttribution", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i20 = 3;
                c0014n19.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3844b;

                    {
                        this.f3844b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i20) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$15(this.f3844b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$16(this.f3844b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$17(this.f3844b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$18(this.f3844b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n19.h(null);
            }
            F.C0014n c0014n20 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportRevenue", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i21 = 1;
                c0014n20.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i21) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n20.h(null);
            }
            F.C0014n c0014n21 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportUnhandledException", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i22 = 3;
                c0014n21.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i22) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n21.h(null);
            }
            F.C0014n c0014n22 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.reportUserProfile", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i23 = 4;
                c0014n22.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i23) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n22.h(null);
            }
            F.C0014n c0014n23 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.requestDeferredDeeplink", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i24 = 5;
                c0014n23.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i24) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n23.h(null);
            }
            F.C0014n c0014n24 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.requestDeferredDeeplinkParameters", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i25 = 6;
                c0014n24.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i25) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n24.h(null);
            }
            F.C0014n c0014n25 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.requestStartupParams", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i26 = 7;
                c0014n25.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i26) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n25.h(null);
            }
            F.C0014n c0014n26 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.resumeSession", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i27 = 8;
                c0014n26.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i27) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n26.h(null);
            }
            F.C0014n c0014n27 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.sendEventsBuffer", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i28 = 9;
                c0014n27.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i28) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n27.h(null);
            }
            F.C0014n c0014n28 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setAdvIdentifiersTracking", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i29 = 10;
                c0014n28.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i29) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n28.h(null);
            }
            F.C0014n c0014n29 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setDataSendingEnabled", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i30 = 12;
                c0014n29.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i30) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n29.h(null);
            }
            F.C0014n c0014n30 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setLocation", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i31 = 13;
                c0014n30.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i31) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n30.h(null);
            }
            F.C0014n c0014n31 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setLocationTracking", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i32 = 15;
                c0014n31.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i32) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n31.h(null);
            }
            F.C0014n c0014n32 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.setUserProfileID", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i33 = 16;
                c0014n32.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i33) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n32.h(null);
            }
            F.C0014n c0014n33 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.handlePluginInitFinished", getCodec(), null);
            if (appMetricaPigeon != null) {
                final int i34 = 17;
                c0014n33.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i34) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n33.h(null);
            }
            F.C0014n c0014n34 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.AppMetricaPigeon.touchReporter", getCodec(), null);
            if (appMetricaPigeon == null) {
                c0014n34.h(null);
            } else {
                final int i35 = 18;
                c0014n34.h(new a1.InterfaceC0062b(appMetricaPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.b

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon f3842b;

                    {
                        this.f3842b = appMetricaPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i35) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$0(this.f3842b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$19(this.f3842b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$1(this.f3842b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$20(this.f3842b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$21(this.f3842b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$22(this.f3842b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$23(this.f3842b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$24(this.f3842b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$25(this.f3842b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$26(this.f3842b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$27(this.f3842b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$10(this.f3842b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$28(this.f3842b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$29(this.f3842b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$2(this.f3842b, obj, eVar);
                                break;
                            case 15:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$30(this.f3842b, obj, eVar);
                                break;
                            case 16:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$31(this.f3842b, obj, eVar);
                                break;
                            case 17:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$32(this.f3842b, obj, eVar);
                                break;
                            case 18:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$33(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5791C /* 19 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$3(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$4(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5793E /* 21 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$5(this.f3842b, obj, eVar);
                                break;
                            case 22:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$11(this.f3842b, obj, eVar);
                                break;
                            case 23:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$6(this.f3842b, obj, eVar);
                                break;
                            case 24:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$7(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5794F /* 25 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$8(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.G /* 26 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$9(this.f3842b, obj, eVar);
                                break;
                            case io.appmetrica.analytics.impl.C0326e9.f5795H /* 27 */:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$12(this.f3842b, obj, eVar);
                                break;
                            case 28:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$13(this.f3842b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeon.lambda$setup$14(this.f3842b, obj, eVar);
                                break;
                        }
                    }
                });
            }
        }

        void activate(io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon appMetricaConfigPigeon);

        void activateReporter(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon reporterConfigPigeon);

        void clearAppEnvironment();

        void enableActivityAutoTracking();

        java.lang.String getDeviceId();

        java.lang.Long getLibraryApiLevel();

        java.lang.String getLibraryVersion();

        java.lang.String getUuid();

        void handlePluginInitFinished();

        void pauseSession();

        void putAppEnvironmentValue(java.lang.String str, java.lang.String str2);

        void putErrorEnvironmentValue(java.lang.String str, java.lang.String str2);

        void reportAdRevenue(io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon adRevenuePigeon);

        void reportAppOpen(java.lang.String str);

        void reportECommerce(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon eCommerceEventPigeon);

        void reportError(io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon, java.lang.String str);

        void reportErrorWithGroup(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon, java.lang.String str2);

        void reportEvent(java.lang.String str);

        void reportEventWithJson(java.lang.String str, java.lang.String str2);

        void reportExternalAttribution(io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon externalAttributionPigeon);

        void reportRevenue(io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon revenuePigeon);

        void reportUnhandledException(io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon);

        void reportUserProfile(io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon userProfilePigeon);

        void requestDeferredDeeplink(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result<io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon> result);

        void requestDeferredDeeplinkParameters(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result<io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon> result);

        void requestStartupParams(java.util.List<java.lang.String> list, io.appmetrica.analytics.flutter.pigeon.Pigeon.Result<io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon> result);

        void resumeSession();

        void sendEventsBuffer();

        void setAdvIdentifiersTracking(java.lang.Boolean bool);

        void setDataSendingEnabled(java.lang.Boolean bool);

        void setLocation(io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon locationPigeon);

        void setLocationTracking(java.lang.Boolean bool);

        void setUserProfileID(java.lang.String str);

        void touchReporter(java.lang.String str);
    }

    public static class AppMetricaPigeonCodec extends a1.n {
        public static final io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeonCodec INSTANCE = new io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaPigeonCodec();

        private AppMetricaPigeonCodec() {
        }

        @Override // a1.n
        public java.lang.Object readValueOfType(byte b2, java.nio.ByteBuffer byteBuffer) {
            switch (b2) {
                case Byte.MIN_VALUE:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -127:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -126:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -125:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -124:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -123:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -122:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -121:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -120:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -119:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -118:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -117:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -116:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -115:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -114:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -113:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -112:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -111:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -110:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -109:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -108:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -107:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -106:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -105:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -104:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -103:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -102:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -101:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -100:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -99:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -98:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b2, byteBuffer);
            }
        }

        @Override // a1.n
        public void writeValue(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaConfigPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkErrorPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkParametersPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.AppMetricaDeferredDeeplinkPigeon) obj).toList());
                return;
            }
            boolean z2 = obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon;
            if (z2) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon) obj).toList());
                return;
            }
            if (z2) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon) obj).toList());
                return;
            }
            boolean z3 = obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon;
            if (z3) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon) obj).toList());
                return;
            }
            if (z3) {
                byteArrayOutputStream.write(139);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon) obj).toList());
                return;
            }
            boolean z4 = obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon;
            if (z4) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon) obj).toList());
                return;
            }
            if (z4) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon) obj).toList());
                return;
            }
            boolean z5 = obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon;
            if (z5) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon) obj).toList());
                return;
            }
            if (z5) {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon) {
                byteArrayOutputStream.write(146);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon) {
                byteArrayOutputStream.write(147);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon) {
                byteArrayOutputStream.write(148);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon) {
                byteArrayOutputStream.write(149);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon) {
                byteArrayOutputStream.write(150);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon) {
                byteArrayOutputStream.write(151);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon) {
                byteArrayOutputStream.write(152);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon) {
                byteArrayOutputStream.write(153);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon) {
                byteArrayOutputStream.write(154);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon) {
                byteArrayOutputStream.write(155);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon) {
                byteArrayOutputStream.write(156);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon) obj).toList());
            } else if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon) {
                byteArrayOutputStream.write(157);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon) obj).toList());
            } else if (!(obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(158);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon) obj).toList());
            }
        }
    }

    public static final class ECommerceAmountPigeon {
        private java.lang.String amount;
        private java.lang.String currency;

        public static final class Builder {
            private java.lang.String amount;
            private java.lang.String currency;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon eCommerceAmountPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon();
                eCommerceAmountPigeon.setAmount(this.amount);
                eCommerceAmountPigeon.setCurrency(this.currency);
                return eCommerceAmountPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon.Builder setAmount(java.lang.String str) {
                this.amount = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon.Builder setCurrency(java.lang.String str) {
                this.currency = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon eCommerceAmountPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon();
            eCommerceAmountPigeon.setAmount((java.lang.String) arrayList.get(0));
            eCommerceAmountPigeon.setCurrency((java.lang.String) arrayList.get(1));
            return eCommerceAmountPigeon;
        }

        public java.lang.String getAmount() {
            return this.amount;
        }

        public java.lang.String getCurrency() {
            return this.currency;
        }

        public void setAmount(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"amount\" is null.");
            }
            this.amount = str;
        }

        public void setCurrency(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"currency\" is null.");
            }
            this.currency = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(2);
            arrayList.add(this.amount);
            arrayList.add(this.currency);
            return arrayList;
        }
    }

    public static final class ECommerceCartItemPigeon {
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon product;
        private java.lang.String quantity;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon referrer;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon revenue;

        public static final class Builder {
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon product;
            private java.lang.String quantity;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon referrer;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon revenue;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon eCommerceCartItemPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon();
                eCommerceCartItemPigeon.setProduct(this.product);
                eCommerceCartItemPigeon.setQuantity(this.quantity);
                eCommerceCartItemPigeon.setRevenue(this.revenue);
                eCommerceCartItemPigeon.setReferrer(this.referrer);
                return eCommerceCartItemPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon.Builder setProduct(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon eCommerceProductPigeon) {
                this.product = eCommerceProductPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon.Builder setQuantity(java.lang.String str) {
                this.quantity = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon.Builder setReferrer(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon eCommerceReferrerPigeon) {
                this.referrer = eCommerceReferrerPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon.Builder setRevenue(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon eCommercePricePigeon) {
                this.revenue = eCommercePricePigeon;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon eCommerceCartItemPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon();
            java.lang.Object obj = arrayList.get(0);
            eCommerceCartItemPigeon.setProduct(obj == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.fromList((java.util.ArrayList) obj));
            eCommerceCartItemPigeon.setQuantity((java.lang.String) arrayList.get(1));
            java.lang.Object obj2 = arrayList.get(2);
            eCommerceCartItemPigeon.setRevenue(obj2 == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon.fromList((java.util.ArrayList) obj2));
            java.lang.Object obj3 = arrayList.get(3);
            eCommerceCartItemPigeon.setReferrer(obj3 != null ? io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon.fromList((java.util.ArrayList) obj3) : null);
            return eCommerceCartItemPigeon;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon getProduct() {
            return this.product;
        }

        public java.lang.String getQuantity() {
            return this.quantity;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon getReferrer() {
            return this.referrer;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon getRevenue() {
            return this.revenue;
        }

        public void setProduct(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon eCommerceProductPigeon) {
            if (eCommerceProductPigeon == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"product\" is null.");
            }
            this.product = eCommerceProductPigeon;
        }

        public void setQuantity(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"quantity\" is null.");
            }
            this.quantity = str;
        }

        public void setReferrer(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon eCommerceReferrerPigeon) {
            this.referrer = eCommerceReferrerPigeon;
        }

        public void setRevenue(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon eCommercePricePigeon) {
            if (eCommercePricePigeon == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"revenue\" is null.");
            }
            this.revenue = eCommercePricePigeon;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(4);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon eCommerceProductPigeon = this.product;
            arrayList.add(eCommerceProductPigeon == null ? null : eCommerceProductPigeon.toList());
            arrayList.add(this.quantity);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon eCommercePricePigeon = this.revenue;
            arrayList.add(eCommercePricePigeon == null ? null : eCommercePricePigeon.toList());
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon eCommerceReferrerPigeon = this.referrer;
            arrayList.add(eCommerceReferrerPigeon != null ? eCommerceReferrerPigeon.toList() : null);
            return arrayList;
        }
    }

    public static final class ECommerceEventPigeon {
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon cartItem;
        private java.lang.String eventType;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon order;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon product;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon referrer;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon screen;

        public static final class Builder {
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon cartItem;
            private java.lang.String eventType;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon order;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon product;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon referrer;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon screen;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon eCommerceEventPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon();
                eCommerceEventPigeon.setEventType(this.eventType);
                eCommerceEventPigeon.setCartItem(this.cartItem);
                eCommerceEventPigeon.setOrder(this.order);
                eCommerceEventPigeon.setProduct(this.product);
                eCommerceEventPigeon.setReferrer(this.referrer);
                eCommerceEventPigeon.setScreen(this.screen);
                return eCommerceEventPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon.Builder setCartItem(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon eCommerceCartItemPigeon) {
                this.cartItem = eCommerceCartItemPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon.Builder setEventType(java.lang.String str) {
                this.eventType = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon.Builder setOrder(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon eCommerceOrderPigeon) {
                this.order = eCommerceOrderPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon.Builder setProduct(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon eCommerceProductPigeon) {
                this.product = eCommerceProductPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon.Builder setReferrer(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon eCommerceReferrerPigeon) {
                this.referrer = eCommerceReferrerPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon.Builder setScreen(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon eCommerceScreenPigeon) {
                this.screen = eCommerceScreenPigeon;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon eCommerceEventPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon();
            eCommerceEventPigeon.setEventType((java.lang.String) arrayList.get(0));
            java.lang.Object obj = arrayList.get(1);
            eCommerceEventPigeon.setCartItem(obj == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon.fromList((java.util.ArrayList) obj));
            java.lang.Object obj2 = arrayList.get(2);
            eCommerceEventPigeon.setOrder(obj2 == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon.fromList((java.util.ArrayList) obj2));
            java.lang.Object obj3 = arrayList.get(3);
            eCommerceEventPigeon.setProduct(obj3 == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.fromList((java.util.ArrayList) obj3));
            java.lang.Object obj4 = arrayList.get(4);
            eCommerceEventPigeon.setReferrer(obj4 == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon.fromList((java.util.ArrayList) obj4));
            java.lang.Object obj5 = arrayList.get(5);
            eCommerceEventPigeon.setScreen(obj5 != null ? io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon.fromList((java.util.ArrayList) obj5) : null);
            return eCommerceEventPigeon;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon getCartItem() {
            return this.cartItem;
        }

        public java.lang.String getEventType() {
            return this.eventType;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon getOrder() {
            return this.order;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon getProduct() {
            return this.product;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon getReferrer() {
            return this.referrer;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon getScreen() {
            return this.screen;
        }

        public void setCartItem(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon eCommerceCartItemPigeon) {
            this.cartItem = eCommerceCartItemPigeon;
        }

        public void setEventType(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"eventType\" is null.");
            }
            this.eventType = str;
        }

        public void setOrder(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon eCommerceOrderPigeon) {
            this.order = eCommerceOrderPigeon;
        }

        public void setProduct(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon eCommerceProductPigeon) {
            this.product = eCommerceProductPigeon;
        }

        public void setReferrer(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon eCommerceReferrerPigeon) {
            this.referrer = eCommerceReferrerPigeon;
        }

        public void setScreen(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon eCommerceScreenPigeon) {
            this.screen = eCommerceScreenPigeon;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(6);
            arrayList.add(this.eventType);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon eCommerceCartItemPigeon = this.cartItem;
            arrayList.add(eCommerceCartItemPigeon == null ? null : eCommerceCartItemPigeon.toList());
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon eCommerceOrderPigeon = this.order;
            arrayList.add(eCommerceOrderPigeon == null ? null : eCommerceOrderPigeon.toList());
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon eCommerceProductPigeon = this.product;
            arrayList.add(eCommerceProductPigeon == null ? null : eCommerceProductPigeon.toList());
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon eCommerceReferrerPigeon = this.referrer;
            arrayList.add(eCommerceReferrerPigeon == null ? null : eCommerceReferrerPigeon.toList());
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon eCommerceScreenPigeon = this.screen;
            arrayList.add(eCommerceScreenPigeon != null ? eCommerceScreenPigeon.toList() : null);
            return arrayList;
        }
    }

    public static final class ECommerceOrderPigeon {
        private java.lang.String identifier;
        private java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon> items;
        private java.util.Map<java.lang.String, java.lang.String> payload;

        public static final class Builder {
            private java.lang.String identifier;
            private java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon> items;
            private java.util.Map<java.lang.String, java.lang.String> payload;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon eCommerceOrderPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon();
                eCommerceOrderPigeon.setIdentifier(this.identifier);
                eCommerceOrderPigeon.setItems(this.items);
                eCommerceOrderPigeon.setPayload(this.payload);
                return eCommerceOrderPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon.Builder setIdentifier(java.lang.String str) {
                this.identifier = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon.Builder setItems(java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon> list) {
                this.items = list;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon.Builder setPayload(java.util.Map<java.lang.String, java.lang.String> map) {
                this.payload = map;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon eCommerceOrderPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon();
            eCommerceOrderPigeon.setIdentifier((java.lang.String) arrayList.get(0));
            eCommerceOrderPigeon.setItems((java.util.List) arrayList.get(1));
            eCommerceOrderPigeon.setPayload((java.util.Map) arrayList.get(2));
            return eCommerceOrderPigeon;
        }

        public java.lang.String getIdentifier() {
            return this.identifier;
        }

        public java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon> getItems() {
            return this.items;
        }

        public java.util.Map<java.lang.String, java.lang.String> getPayload() {
            return this.payload;
        }

        public void setIdentifier(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"identifier\" is null.");
            }
            this.identifier = str;
        }

        public void setItems(java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon> list) {
            if (list == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"items\" is null.");
            }
            this.items = list;
        }

        public void setPayload(java.util.Map<java.lang.String, java.lang.String> map) {
            this.payload = map;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(3);
            arrayList.add(this.identifier);
            arrayList.add(this.items);
            arrayList.add(this.payload);
            return arrayList;
        }
    }

    public static final class ECommercePricePigeon {
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon fiat;
        private java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon> internalComponents;

        public static final class Builder {
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon fiat;
            private java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon> internalComponents;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon eCommercePricePigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon();
                eCommercePricePigeon.setFiat(this.fiat);
                eCommercePricePigeon.setInternalComponents(this.internalComponents);
                return eCommercePricePigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon.Builder setFiat(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon eCommerceAmountPigeon) {
                this.fiat = eCommerceAmountPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon.Builder setInternalComponents(java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon> list) {
                this.internalComponents = list;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon eCommercePricePigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon();
            java.lang.Object obj = arrayList.get(0);
            eCommercePricePigeon.setFiat(obj == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon.fromList((java.util.ArrayList) obj));
            eCommercePricePigeon.setInternalComponents((java.util.List) arrayList.get(1));
            return eCommercePricePigeon;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon getFiat() {
            return this.fiat;
        }

        public java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon> getInternalComponents() {
            return this.internalComponents;
        }

        public void setFiat(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon eCommerceAmountPigeon) {
            if (eCommerceAmountPigeon == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"fiat\" is null.");
            }
            this.fiat = eCommerceAmountPigeon;
        }

        public void setInternalComponents(java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon> list) {
            this.internalComponents = list;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(2);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon eCommerceAmountPigeon = this.fiat;
            arrayList.add(eCommerceAmountPigeon == null ? null : eCommerceAmountPigeon.toList());
            arrayList.add(this.internalComponents);
            return arrayList;
        }
    }

    public static final class ECommerceProductPigeon {
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon actualPrice;
        private java.util.List<java.lang.String> categoriesPath;
        private java.lang.String name;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon originalPrice;
        private java.util.Map<java.lang.String, java.lang.String> payload;
        private java.util.List<java.lang.String> promocodes;
        private java.lang.String sku;

        public static final class Builder {
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon actualPrice;
            private java.util.List<java.lang.String> categoriesPath;
            private java.lang.String name;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon originalPrice;
            private java.util.Map<java.lang.String, java.lang.String> payload;
            private java.util.List<java.lang.String> promocodes;
            private java.lang.String sku;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon eCommerceProductPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon();
                eCommerceProductPigeon.setSku(this.sku);
                eCommerceProductPigeon.setName(this.name);
                eCommerceProductPigeon.setCategoriesPath(this.categoriesPath);
                eCommerceProductPigeon.setPayload(this.payload);
                eCommerceProductPigeon.setActualPrice(this.actualPrice);
                eCommerceProductPigeon.setOriginalPrice(this.originalPrice);
                eCommerceProductPigeon.setPromocodes(this.promocodes);
                return eCommerceProductPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.Builder setActualPrice(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon eCommercePricePigeon) {
                this.actualPrice = eCommercePricePigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.Builder setCategoriesPath(java.util.List<java.lang.String> list) {
                this.categoriesPath = list;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.Builder setName(java.lang.String str) {
                this.name = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.Builder setOriginalPrice(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon eCommercePricePigeon) {
                this.originalPrice = eCommercePricePigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.Builder setPayload(java.util.Map<java.lang.String, java.lang.String> map) {
                this.payload = map;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.Builder setPromocodes(java.util.List<java.lang.String> list) {
                this.promocodes = list;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.Builder setSku(java.lang.String str) {
                this.sku = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon eCommerceProductPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon();
            eCommerceProductPigeon.setSku((java.lang.String) arrayList.get(0));
            eCommerceProductPigeon.setName((java.lang.String) arrayList.get(1));
            eCommerceProductPigeon.setCategoriesPath((java.util.List) arrayList.get(2));
            eCommerceProductPigeon.setPayload((java.util.Map) arrayList.get(3));
            java.lang.Object obj = arrayList.get(4);
            eCommerceProductPigeon.setActualPrice(obj == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon.fromList((java.util.ArrayList) obj));
            java.lang.Object obj2 = arrayList.get(5);
            eCommerceProductPigeon.setOriginalPrice(obj2 != null ? io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon.fromList((java.util.ArrayList) obj2) : null);
            eCommerceProductPigeon.setPromocodes((java.util.List) arrayList.get(6));
            return eCommerceProductPigeon;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon getActualPrice() {
            return this.actualPrice;
        }

        public java.util.List<java.lang.String> getCategoriesPath() {
            return this.categoriesPath;
        }

        public java.lang.String getName() {
            return this.name;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon getOriginalPrice() {
            return this.originalPrice;
        }

        public java.util.Map<java.lang.String, java.lang.String> getPayload() {
            return this.payload;
        }

        public java.util.List<java.lang.String> getPromocodes() {
            return this.promocodes;
        }

        public java.lang.String getSku() {
            return this.sku;
        }

        public void setActualPrice(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon eCommercePricePigeon) {
            this.actualPrice = eCommercePricePigeon;
        }

        public void setCategoriesPath(java.util.List<java.lang.String> list) {
            this.categoriesPath = list;
        }

        public void setName(java.lang.String str) {
            this.name = str;
        }

        public void setOriginalPrice(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon eCommercePricePigeon) {
            this.originalPrice = eCommercePricePigeon;
        }

        public void setPayload(java.util.Map<java.lang.String, java.lang.String> map) {
            this.payload = map;
        }

        public void setPromocodes(java.util.List<java.lang.String> list) {
            this.promocodes = list;
        }

        public void setSku(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"sku\" is null.");
            }
            this.sku = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(7);
            arrayList.add(this.sku);
            arrayList.add(this.name);
            arrayList.add(this.categoriesPath);
            arrayList.add(this.payload);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon eCommercePricePigeon = this.actualPrice;
            arrayList.add(eCommercePricePigeon == null ? null : eCommercePricePigeon.toList());
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon eCommercePricePigeon2 = this.originalPrice;
            arrayList.add(eCommercePricePigeon2 != null ? eCommercePricePigeon2.toList() : null);
            arrayList.add(this.promocodes);
            return arrayList;
        }
    }

    public static final class ECommerceReferrerPigeon {
        private java.lang.String identifier;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon screen;
        private java.lang.String type;

        public static final class Builder {
            private java.lang.String identifier;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon screen;
            private java.lang.String type;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon eCommerceReferrerPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon();
                eCommerceReferrerPigeon.setType(this.type);
                eCommerceReferrerPigeon.setIdentifier(this.identifier);
                eCommerceReferrerPigeon.setScreen(this.screen);
                return eCommerceReferrerPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon.Builder setIdentifier(java.lang.String str) {
                this.identifier = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon.Builder setScreen(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon eCommerceScreenPigeon) {
                this.screen = eCommerceScreenPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon.Builder setType(java.lang.String str) {
                this.type = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon eCommerceReferrerPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon();
            eCommerceReferrerPigeon.setType((java.lang.String) arrayList.get(0));
            eCommerceReferrerPigeon.setIdentifier((java.lang.String) arrayList.get(1));
            java.lang.Object obj = arrayList.get(2);
            eCommerceReferrerPigeon.setScreen(obj == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon.fromList((java.util.ArrayList) obj));
            return eCommerceReferrerPigeon;
        }

        public java.lang.String getIdentifier() {
            return this.identifier;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon getScreen() {
            return this.screen;
        }

        public java.lang.String getType() {
            return this.type;
        }

        public void setIdentifier(java.lang.String str) {
            this.identifier = str;
        }

        public void setScreen(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon eCommerceScreenPigeon) {
            this.screen = eCommerceScreenPigeon;
        }

        public void setType(java.lang.String str) {
            this.type = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(3);
            arrayList.add(this.type);
            arrayList.add(this.identifier);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon eCommerceScreenPigeon = this.screen;
            arrayList.add(eCommerceScreenPigeon == null ? null : eCommerceScreenPigeon.toList());
            return arrayList;
        }
    }

    public static final class ECommerceScreenPigeon {
        private java.util.List<java.lang.String> categoriesPath;
        private java.lang.String name;
        private java.util.Map<java.lang.String, java.lang.String> payload;
        private java.lang.String searchQuery;

        public static final class Builder {
            private java.util.List<java.lang.String> categoriesPath;
            private java.lang.String name;
            private java.util.Map<java.lang.String, java.lang.String> payload;
            private java.lang.String searchQuery;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon eCommerceScreenPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon();
                eCommerceScreenPigeon.setName(this.name);
                eCommerceScreenPigeon.setCategoriesPath(this.categoriesPath);
                eCommerceScreenPigeon.setSearchQuery(this.searchQuery);
                eCommerceScreenPigeon.setPayload(this.payload);
                return eCommerceScreenPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon.Builder setCategoriesPath(java.util.List<java.lang.String> list) {
                this.categoriesPath = list;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon.Builder setName(java.lang.String str) {
                this.name = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon.Builder setPayload(java.util.Map<java.lang.String, java.lang.String> map) {
                this.payload = map;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon.Builder setSearchQuery(java.lang.String str) {
                this.searchQuery = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon eCommerceScreenPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon();
            eCommerceScreenPigeon.setName((java.lang.String) arrayList.get(0));
            eCommerceScreenPigeon.setCategoriesPath((java.util.List) arrayList.get(1));
            eCommerceScreenPigeon.setSearchQuery((java.lang.String) arrayList.get(2));
            eCommerceScreenPigeon.setPayload((java.util.Map) arrayList.get(3));
            return eCommerceScreenPigeon;
        }

        public java.util.List<java.lang.String> getCategoriesPath() {
            return this.categoriesPath;
        }

        public java.lang.String getName() {
            return this.name;
        }

        public java.util.Map<java.lang.String, java.lang.String> getPayload() {
            return this.payload;
        }

        public java.lang.String getSearchQuery() {
            return this.searchQuery;
        }

        public void setCategoriesPath(java.util.List<java.lang.String> list) {
            this.categoriesPath = list;
        }

        public void setName(java.lang.String str) {
            this.name = str;
        }

        public void setPayload(java.util.Map<java.lang.String, java.lang.String> map) {
            this.payload = map;
        }

        public void setSearchQuery(java.lang.String str) {
            this.searchQuery = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(4);
            arrayList.add(this.name);
            arrayList.add(this.categoriesPath);
            arrayList.add(this.searchQuery);
            arrayList.add(this.payload);
            return arrayList;
        }
    }

    public static final class ErrorDetailsPigeon {
        private java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon> backtrace;
        private java.lang.String dartVersion;
        private java.lang.String exceptionClass;
        private java.lang.String message;

        public static final class Builder {
            private java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon> backtrace;
            private java.lang.String dartVersion;
            private java.lang.String exceptionClass;
            private java.lang.String message;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon();
                errorDetailsPigeon.setExceptionClass(this.exceptionClass);
                errorDetailsPigeon.setMessage(this.message);
                errorDetailsPigeon.setDartVersion(this.dartVersion);
                errorDetailsPigeon.setBacktrace(this.backtrace);
                return errorDetailsPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon.Builder setBacktrace(java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon> list) {
                this.backtrace = list;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon.Builder setDartVersion(java.lang.String str) {
                this.dartVersion = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon.Builder setExceptionClass(java.lang.String str) {
                this.exceptionClass = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon.Builder setMessage(java.lang.String str) {
                this.message = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon();
            errorDetailsPigeon.setExceptionClass((java.lang.String) arrayList.get(0));
            errorDetailsPigeon.setMessage((java.lang.String) arrayList.get(1));
            errorDetailsPigeon.setDartVersion((java.lang.String) arrayList.get(2));
            errorDetailsPigeon.setBacktrace((java.util.List) arrayList.get(3));
            return errorDetailsPigeon;
        }

        public java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon> getBacktrace() {
            return this.backtrace;
        }

        public java.lang.String getDartVersion() {
            return this.dartVersion;
        }

        public java.lang.String getExceptionClass() {
            return this.exceptionClass;
        }

        public java.lang.String getMessage() {
            return this.message;
        }

        public void setBacktrace(java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon> list) {
            this.backtrace = list;
        }

        public void setDartVersion(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"dartVersion\" is null.");
            }
            this.dartVersion = str;
        }

        public void setExceptionClass(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"exceptionClass\" is null.");
            }
            this.exceptionClass = str;
        }

        public void setMessage(java.lang.String str) {
            this.message = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(4);
            arrayList.add(this.exceptionClass);
            arrayList.add(this.message);
            arrayList.add(this.dartVersion);
            arrayList.add(this.backtrace);
            return arrayList;
        }
    }

    public static final class ExternalAttributionPigeon {
        private java.util.Map<java.lang.String, java.lang.Object> data;
        private java.lang.String source;

        public static final class Builder {
            private java.util.Map<java.lang.String, java.lang.Object> data;
            private java.lang.String source;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon externalAttributionPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon();
                externalAttributionPigeon.setSource(this.source);
                externalAttributionPigeon.setData(this.data);
                return externalAttributionPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon.Builder setData(java.util.Map<java.lang.String, java.lang.Object> map) {
                this.data = map;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon.Builder setSource(java.lang.String str) {
                this.source = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon externalAttributionPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ExternalAttributionPigeon();
            externalAttributionPigeon.setSource((java.lang.String) arrayList.get(0));
            externalAttributionPigeon.setData((java.util.Map) arrayList.get(1));
            return externalAttributionPigeon;
        }

        public java.util.Map<java.lang.String, java.lang.Object> getData() {
            return this.data;
        }

        public java.lang.String getSource() {
            return this.source;
        }

        public void setData(java.util.Map<java.lang.String, java.lang.Object> map) {
            if (map == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"data\" is null.");
            }
            this.data = map;
        }

        public void setSource(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"source\" is null.");
            }
            this.source = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(2);
            arrayList.add(this.source);
            arrayList.add(this.data);
            return arrayList;
        }
    }

    public static class FlutterError extends java.lang.RuntimeException {
        public final java.lang.String code;
        public final java.lang.Object details;

        public FlutterError(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
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

        GenderPigeon(int i2) {
            this.index = i2;
        }
    }

    public interface InitialDeepLinkHolderPigeon {
        static a1.j getCodec() {
            return new a1.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.appmetrica.analytics.flutter.pigeon.Pigeon.InitialDeepLinkHolderPigeon initialDeepLinkHolderPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, initialDeepLinkHolderPigeon.getInitialDeeplink());
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        static void setup(a1.f fVar, io.appmetrica.analytics.flutter.pigeon.Pigeon.InitialDeepLinkHolderPigeon initialDeepLinkHolderPigeon) {
            F.C0014n c0014n = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.InitialDeepLinkHolderPigeon.getInitialDeeplink", getCodec(), null);
            if (initialDeepLinkHolderPigeon != null) {
                c0014n.h(new E0.a(6, initialDeepLinkHolderPigeon));
            } else {
                c0014n.h(null);
            }
        }

        java.lang.String getInitialDeeplink();
    }

    public static final class LocationPigeon {
        private java.lang.Double accuracy;
        private java.lang.Double altitude;
        private java.lang.Double course;
        private java.lang.Double latitude;
        private java.lang.Double longitude;
        private java.lang.String provider;
        private java.lang.Double speed;
        private java.lang.Long timestamp;

        public static final class Builder {
            private java.lang.Double accuracy;
            private java.lang.Double altitude;
            private java.lang.Double course;
            private java.lang.Double latitude;
            private java.lang.Double longitude;
            private java.lang.String provider;
            private java.lang.Double speed;
            private java.lang.Long timestamp;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon locationPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon();
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

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon.Builder setAccuracy(java.lang.Double d2) {
                this.accuracy = d2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon.Builder setAltitude(java.lang.Double d2) {
                this.altitude = d2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon.Builder setCourse(java.lang.Double d2) {
                this.course = d2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon.Builder setLatitude(java.lang.Double d2) {
                this.latitude = d2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon.Builder setLongitude(java.lang.Double d2) {
                this.longitude = d2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon.Builder setProvider(java.lang.String str) {
                this.provider = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon.Builder setSpeed(java.lang.Double d2) {
                this.speed = d2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon.Builder setTimestamp(java.lang.Long l2) {
                this.timestamp = l2;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            java.lang.Long valueOf;
            io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon locationPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.LocationPigeon();
            locationPigeon.setLatitude((java.lang.Double) arrayList.get(0));
            locationPigeon.setLongitude((java.lang.Double) arrayList.get(1));
            locationPigeon.setProvider((java.lang.String) arrayList.get(2));
            locationPigeon.setAltitude((java.lang.Double) arrayList.get(3));
            locationPigeon.setAccuracy((java.lang.Double) arrayList.get(4));
            locationPigeon.setCourse((java.lang.Double) arrayList.get(5));
            locationPigeon.setSpeed((java.lang.Double) arrayList.get(6));
            java.lang.Object obj = arrayList.get(7);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            locationPigeon.setTimestamp(valueOf);
            return locationPigeon;
        }

        public java.lang.Double getAccuracy() {
            return this.accuracy;
        }

        public java.lang.Double getAltitude() {
            return this.altitude;
        }

        public java.lang.Double getCourse() {
            return this.course;
        }

        public java.lang.Double getLatitude() {
            return this.latitude;
        }

        public java.lang.Double getLongitude() {
            return this.longitude;
        }

        public java.lang.String getProvider() {
            return this.provider;
        }

        public java.lang.Double getSpeed() {
            return this.speed;
        }

        public java.lang.Long getTimestamp() {
            return this.timestamp;
        }

        public void setAccuracy(java.lang.Double d2) {
            this.accuracy = d2;
        }

        public void setAltitude(java.lang.Double d2) {
            this.altitude = d2;
        }

        public void setCourse(java.lang.Double d2) {
            this.course = d2;
        }

        public void setLatitude(java.lang.Double d2) {
            if (d2 == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"latitude\" is null.");
            }
            this.latitude = d2;
        }

        public void setLongitude(java.lang.Double d2) {
            if (d2 == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"longitude\" is null.");
            }
            this.longitude = d2;
        }

        public void setProvider(java.lang.String str) {
            this.provider = str;
        }

        public void setSpeed(java.lang.Double d2) {
            this.speed = d2;
        }

        public void setTimestamp(java.lang.Long l2) {
            this.timestamp = l2;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(8);
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
        private java.util.Map<java.lang.String, java.lang.String> additionalInfo;
        private java.lang.String trackingId;

        public static final class Builder {
            private java.util.Map<java.lang.String, java.lang.String> additionalInfo;
            private java.lang.String trackingId;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon preloadInfoPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon();
                preloadInfoPigeon.setTrackingId(this.trackingId);
                preloadInfoPigeon.setAdditionalInfo(this.additionalInfo);
                return preloadInfoPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon.Builder setAdditionalInfo(java.util.Map<java.lang.String, java.lang.String> map) {
                this.additionalInfo = map;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon.Builder setTrackingId(java.lang.String str) {
                this.trackingId = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon preloadInfoPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.PreloadInfoPigeon();
            preloadInfoPigeon.setTrackingId((java.lang.String) arrayList.get(0));
            preloadInfoPigeon.setAdditionalInfo((java.util.Map) arrayList.get(1));
            return preloadInfoPigeon;
        }

        public java.util.Map<java.lang.String, java.lang.String> getAdditionalInfo() {
            return this.additionalInfo;
        }

        public java.lang.String getTrackingId() {
            return this.trackingId;
        }

        public void setAdditionalInfo(java.util.Map<java.lang.String, java.lang.String> map) {
            this.additionalInfo = map;
        }

        public void setTrackingId(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"trackingId\" is null.");
            }
            this.trackingId = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(2);
            arrayList.add(this.trackingId);
            arrayList.add(this.additionalInfo);
            return arrayList;
        }
    }

    public static final class ReceiptPigeon {
        private java.lang.String data;
        private java.lang.String signature;

        public static final class Builder {
            private java.lang.String data;
            private java.lang.String signature;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon receiptPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon();
                receiptPigeon.setData(this.data);
                receiptPigeon.setSignature(this.signature);
                return receiptPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon.Builder setData(java.lang.String str) {
                this.data = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon.Builder setSignature(java.lang.String str) {
                this.signature = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon receiptPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon();
            receiptPigeon.setData((java.lang.String) arrayList.get(0));
            receiptPigeon.setSignature((java.lang.String) arrayList.get(1));
            return receiptPigeon;
        }

        public java.lang.String getData() {
            return this.data;
        }

        public java.lang.String getSignature() {
            return this.signature;
        }

        public void setData(java.lang.String str) {
            this.data = str;
        }

        public void setSignature(java.lang.String str) {
            this.signature = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(2);
            arrayList.add(this.data);
            arrayList.add(this.signature);
            return arrayList;
        }
    }

    public static final class ReporterConfigPigeon {
        private java.lang.String apiKey;
        private java.util.Map<java.lang.String, java.lang.String> appEnvironment;
        private java.lang.Boolean dataSendingEnabled;
        private java.lang.Long dispatchPeriodSeconds;
        private java.lang.Boolean logs;
        private java.lang.Long maxReportsCount;
        private java.lang.Long maxReportsInDatabaseCount;
        private java.lang.Long sessionTimeout;
        private java.lang.String userProfileID;

        public static final class Builder {
            private java.lang.String apiKey;
            private java.util.Map<java.lang.String, java.lang.String> appEnvironment;
            private java.lang.Boolean dataSendingEnabled;
            private java.lang.Long dispatchPeriodSeconds;
            private java.lang.Boolean logs;
            private java.lang.Long maxReportsCount;
            private java.lang.Long maxReportsInDatabaseCount;
            private java.lang.Long sessionTimeout;
            private java.lang.String userProfileID;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon reporterConfigPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon();
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

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon.Builder setApiKey(java.lang.String str) {
                this.apiKey = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon.Builder setAppEnvironment(java.util.Map<java.lang.String, java.lang.String> map) {
                this.appEnvironment = map;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon.Builder setDataSendingEnabled(java.lang.Boolean bool) {
                this.dataSendingEnabled = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon.Builder setDispatchPeriodSeconds(java.lang.Long l2) {
                this.dispatchPeriodSeconds = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon.Builder setLogs(java.lang.Boolean bool) {
                this.logs = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon.Builder setMaxReportsCount(java.lang.Long l2) {
                this.maxReportsCount = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon.Builder setMaxReportsInDatabaseCount(java.lang.Long l2) {
                this.maxReportsInDatabaseCount = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon.Builder setSessionTimeout(java.lang.Long l2) {
                this.sessionTimeout = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon.Builder setUserProfileID(java.lang.String str) {
                this.userProfileID = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            java.lang.Long valueOf;
            java.lang.Long valueOf2;
            java.lang.Long valueOf3;
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon reporterConfigPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterConfigPigeon();
            reporterConfigPigeon.setApiKey((java.lang.String) arrayList.get(0));
            reporterConfigPigeon.setAppEnvironment((java.util.Map) arrayList.get(1));
            reporterConfigPigeon.setDataSendingEnabled((java.lang.Boolean) arrayList.get(2));
            java.lang.Object obj = arrayList.get(3);
            java.lang.Long l2 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            reporterConfigPigeon.setDispatchPeriodSeconds(valueOf);
            reporterConfigPigeon.setLogs((java.lang.Boolean) arrayList.get(4));
            java.lang.Object obj2 = arrayList.get(5);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = java.lang.Long.valueOf(obj2 instanceof java.lang.Integer ? ((java.lang.Integer) obj2).intValue() : ((java.lang.Long) obj2).longValue());
            }
            reporterConfigPigeon.setMaxReportsCount(valueOf2);
            java.lang.Object obj3 = arrayList.get(6);
            if (obj3 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = java.lang.Long.valueOf(obj3 instanceof java.lang.Integer ? ((java.lang.Integer) obj3).intValue() : ((java.lang.Long) obj3).longValue());
            }
            reporterConfigPigeon.setMaxReportsInDatabaseCount(valueOf3);
            java.lang.Object obj4 = arrayList.get(7);
            if (obj4 != null) {
                l2 = java.lang.Long.valueOf(obj4 instanceof java.lang.Integer ? ((java.lang.Integer) obj4).intValue() : ((java.lang.Long) obj4).longValue());
            }
            reporterConfigPigeon.setSessionTimeout(l2);
            reporterConfigPigeon.setUserProfileID((java.lang.String) arrayList.get(8));
            return reporterConfigPigeon;
        }

        public java.lang.String getApiKey() {
            return this.apiKey;
        }

        public java.util.Map<java.lang.String, java.lang.String> getAppEnvironment() {
            return this.appEnvironment;
        }

        public java.lang.Boolean getDataSendingEnabled() {
            return this.dataSendingEnabled;
        }

        public java.lang.Long getDispatchPeriodSeconds() {
            return this.dispatchPeriodSeconds;
        }

        public java.lang.Boolean getLogs() {
            return this.logs;
        }

        public java.lang.Long getMaxReportsCount() {
            return this.maxReportsCount;
        }

        public java.lang.Long getMaxReportsInDatabaseCount() {
            return this.maxReportsInDatabaseCount;
        }

        public java.lang.Long getSessionTimeout() {
            return this.sessionTimeout;
        }

        public java.lang.String getUserProfileID() {
            return this.userProfileID;
        }

        public void setApiKey(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.apiKey = str;
        }

        public void setAppEnvironment(java.util.Map<java.lang.String, java.lang.String> map) {
            this.appEnvironment = map;
        }

        public void setDataSendingEnabled(java.lang.Boolean bool) {
            this.dataSendingEnabled = bool;
        }

        public void setDispatchPeriodSeconds(java.lang.Long l2) {
            this.dispatchPeriodSeconds = l2;
        }

        public void setLogs(java.lang.Boolean bool) {
            this.logs = bool;
        }

        public void setMaxReportsCount(java.lang.Long l2) {
            this.maxReportsCount = l2;
        }

        public void setMaxReportsInDatabaseCount(java.lang.Long l2) {
            this.maxReportsInDatabaseCount = l2;
        }

        public void setSessionTimeout(java.lang.Long l2) {
            this.sessionTimeout = l2;
        }

        public void setUserProfileID(java.lang.String str) {
            this.userProfileID = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(9);
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
        static a1.j getCodec() {
            return io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                reporterPigeon.clearAppEnvironment((java.lang.String) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                reporterPigeon.pauseSession((java.lang.String) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$10(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                reporterPigeon.reportUnhandledException((java.lang.String) arrayList2.get(0), (io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$11(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                reporterPigeon.reportUserProfile((java.lang.String) arrayList2.get(0), (io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$12(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                reporterPigeon.resumeSession((java.lang.String) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$13(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                reporterPigeon.sendEventsBuffer((java.lang.String) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$14(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                reporterPigeon.setDataSendingEnabled((java.lang.String) arrayList2.get(0), (java.lang.Boolean) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$15(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                reporterPigeon.setUserProfileID((java.lang.String) arrayList2.get(0), (java.lang.String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                reporterPigeon.putAppEnvironmentValue((java.lang.String) arrayList2.get(0), (java.lang.String) arrayList2.get(1), (java.lang.String) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                reporterPigeon.reportAdRevenue((java.lang.String) arrayList2.get(0), (io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                reporterPigeon.reportECommerce((java.lang.String) arrayList2.get(0), (io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                reporterPigeon.reportError((java.lang.String) arrayList2.get(0), (io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon) arrayList2.get(1), (java.lang.String) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                reporterPigeon.reportErrorWithGroup((java.lang.String) arrayList2.get(0), (java.lang.String) arrayList2.get(1), (io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon) arrayList2.get(2), (java.lang.String) arrayList2.get(3));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                reporterPigeon.reportEvent((java.lang.String) arrayList2.get(0), (java.lang.String) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                reporterPigeon.reportEventWithJson((java.lang.String) arrayList2.get(0), (java.lang.String) arrayList2.get(1), (java.lang.String) arrayList2.get(2));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$9(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon, java.lang.Object obj, a1.InterfaceC0063c interfaceC0063c) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                reporterPigeon.reportRevenue((java.lang.String) arrayList2.get(0), (io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon) arrayList2.get(1));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th) {
                arrayList = io.appmetrica.analytics.flutter.pigeon.Pigeon.wrapError(th);
            }
            interfaceC0063c.f(arrayList);
        }

        static void setup(a1.f fVar, final io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon reporterPigeon) {
            F.C0014n c0014n = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.clearAppEnvironment", getCodec(), null);
            if (reporterPigeon != null) {
                final int i2 = 0;
                c0014n.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i2) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n.h(null);
            }
            F.C0014n c0014n2 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.pauseSession", getCodec(), null);
            if (reporterPigeon != null) {
                final int i3 = 13;
                c0014n2.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i3) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n2.h(null);
            }
            F.C0014n c0014n3 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.putAppEnvironmentValue", getCodec(), null);
            if (reporterPigeon != null) {
                final int i4 = 14;
                c0014n3.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i4) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n3.h(null);
            }
            F.C0014n c0014n4 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportAdRevenue", getCodec(), null);
            if (reporterPigeon != null) {
                final int i5 = 15;
                c0014n4.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i5) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n4.h(null);
            }
            F.C0014n c0014n5 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportECommerce", getCodec(), null);
            if (reporterPigeon != null) {
                final int i6 = 1;
                c0014n5.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i6) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n5.h(null);
            }
            F.C0014n c0014n6 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportError", getCodec(), null);
            if (reporterPigeon != null) {
                final int i7 = 2;
                c0014n6.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i7) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n6.h(null);
            }
            F.C0014n c0014n7 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportErrorWithGroup", getCodec(), null);
            if (reporterPigeon != null) {
                final int i8 = 3;
                c0014n7.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i8) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n7.h(null);
            }
            F.C0014n c0014n8 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportEvent", getCodec(), null);
            if (reporterPigeon != null) {
                final int i9 = 4;
                c0014n8.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i9) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n8.h(null);
            }
            F.C0014n c0014n9 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportEventWithJson", getCodec(), null);
            if (reporterPigeon != null) {
                final int i10 = 5;
                c0014n9.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i10) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n9.h(null);
            }
            F.C0014n c0014n10 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportRevenue", getCodec(), null);
            if (reporterPigeon != null) {
                final int i11 = 6;
                c0014n10.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i11) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n10.h(null);
            }
            F.C0014n c0014n11 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportUnhandledException", getCodec(), null);
            if (reporterPigeon != null) {
                final int i12 = 7;
                c0014n11.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i12) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n11.h(null);
            }
            F.C0014n c0014n12 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.reportUserProfile", getCodec(), null);
            if (reporterPigeon != null) {
                final int i13 = 8;
                c0014n12.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i13) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n12.h(null);
            }
            F.C0014n c0014n13 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.resumeSession", getCodec(), null);
            if (reporterPigeon != null) {
                final int i14 = 9;
                c0014n13.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i14) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n13.h(null);
            }
            F.C0014n c0014n14 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.sendEventsBuffer", getCodec(), null);
            if (reporterPigeon != null) {
                final int i15 = 10;
                c0014n14.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i15) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n14.h(null);
            }
            F.C0014n c0014n15 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.setDataSendingEnabled", getCodec(), null);
            if (reporterPigeon != null) {
                final int i16 = 11;
                c0014n15.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i16) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            } else {
                c0014n15.h(null);
            }
            F.C0014n c0014n16 = new F.C0014n(fVar, "dev.flutter.pigeon.appmetrica_plugin.ReporterPigeon.setUserProfileID", getCodec(), null);
            if (reporterPigeon == null) {
                c0014n16.h(null);
            } else {
                final int i17 = 12;
                c0014n16.h(new a1.InterfaceC0062b(reporterPigeon) { // from class: io.appmetrica.analytics.flutter.pigeon.d

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon f3846b;

                    {
                        this.f3846b = reporterPigeon;
                    }

                    @Override // a1.InterfaceC0062b
                    public final void g(java.lang.Object obj, x0.e eVar) {
                        switch (i17) {
                            case 0:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$0(this.f3846b, obj, eVar);
                                break;
                            case 1:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$4(this.f3846b, obj, eVar);
                                break;
                            case 2:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$5(this.f3846b, obj, eVar);
                                break;
                            case 3:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$6(this.f3846b, obj, eVar);
                                break;
                            case 4:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$7(this.f3846b, obj, eVar);
                                break;
                            case 5:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$8(this.f3846b, obj, eVar);
                                break;
                            case 6:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$9(this.f3846b, obj, eVar);
                                break;
                            case 7:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$10(this.f3846b, obj, eVar);
                                break;
                            case 8:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$11(this.f3846b, obj, eVar);
                                break;
                            case 9:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$12(this.f3846b, obj, eVar);
                                break;
                            case 10:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$13(this.f3846b, obj, eVar);
                                break;
                            case 11:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$14(this.f3846b, obj, eVar);
                                break;
                            case 12:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$15(this.f3846b, obj, eVar);
                                break;
                            case 13:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$1(this.f3846b, obj, eVar);
                                break;
                            case 14:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$2(this.f3846b, obj, eVar);
                                break;
                            default:
                                io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeon.lambda$setup$3(this.f3846b, obj, eVar);
                                break;
                        }
                    }
                });
            }
        }

        void clearAppEnvironment(java.lang.String str);

        void pauseSession(java.lang.String str);

        void putAppEnvironmentValue(java.lang.String str, java.lang.String str2, java.lang.String str3);

        void reportAdRevenue(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon adRevenuePigeon);

        void reportECommerce(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon eCommerceEventPigeon);

        void reportError(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon, java.lang.String str2);

        void reportErrorWithGroup(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon, java.lang.String str3);

        void reportEvent(java.lang.String str, java.lang.String str2);

        void reportEventWithJson(java.lang.String str, java.lang.String str2, java.lang.String str3);

        void reportRevenue(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon revenuePigeon);

        void reportUnhandledException(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon errorDetailsPigeon);

        void reportUserProfile(java.lang.String str, io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon userProfilePigeon);

        void resumeSession(java.lang.String str);

        void sendEventsBuffer(java.lang.String str);

        void setDataSendingEnabled(java.lang.String str, java.lang.Boolean bool);

        void setUserProfileID(java.lang.String str, java.lang.String str2);
    }

    public static class ReporterPigeonCodec extends a1.n {
        public static final io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeonCodec INSTANCE = new io.appmetrica.analytics.flutter.pigeon.Pigeon.ReporterPigeonCodec();

        private ReporterPigeonCodec() {
        }

        @Override // a1.n
        public java.lang.Object readValueOfType(byte b2, java.nio.ByteBuffer byteBuffer) {
            switch (b2) {
                case Byte.MIN_VALUE:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -127:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -126:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -125:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -124:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -123:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -122:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -121:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -120:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -119:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -118:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -117:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -116:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -115:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -114:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -113:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -112:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -111:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                case -110:
                    return io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon.fromList((java.util.ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b2, byteBuffer);
            }
        }

        @Override // a1.n
        public void writeValue(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.AdRevenuePigeon) obj).toList());
                return;
            }
            boolean z2 = obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon;
            if (z2) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon) obj).toList());
                return;
            }
            if (z2) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon) obj).toList());
                return;
            }
            boolean z3 = obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon;
            if (z3) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon) obj).toList());
                return;
            }
            if (z3) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon) obj).toList());
                return;
            }
            boolean z4 = obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon;
            if (z4) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon) obj).toList());
                return;
            }
            if (z4) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon) {
                byteArrayOutputStream.write(139);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon) obj).toList());
                return;
            }
            boolean z5 = obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon;
            if (z5) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon) obj).toList());
                return;
            }
            if (z5) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ErrorDetailsPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon) obj).toList());
                return;
            }
            if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon) obj).toList());
            } else if (obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon) {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon) obj).toList());
            } else if (!(obj instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(146);
                writeValue(byteArrayOutputStream, ((io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon) obj).toList());
            }
        }
    }

    public interface Result<T> {
        void error(java.lang.Throwable th);

        void success(T t);
    }

    public static final class RevenuePigeon {
        private java.lang.String currency;
        private java.lang.String payload;
        private java.lang.String price;
        private java.lang.String productId;
        private java.lang.Long quantity;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon receipt;
        private java.lang.String transactionId;

        public static final class Builder {
            private java.lang.String currency;
            private java.lang.String payload;
            private java.lang.String price;
            private java.lang.String productId;
            private java.lang.Long quantity;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon receipt;
            private java.lang.String transactionId;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon revenuePigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon();
                revenuePigeon.setPrice(this.price);
                revenuePigeon.setCurrency(this.currency);
                revenuePigeon.setQuantity(this.quantity);
                revenuePigeon.setProductId(this.productId);
                revenuePigeon.setPayload(this.payload);
                revenuePigeon.setReceipt(this.receipt);
                revenuePigeon.setTransactionId(this.transactionId);
                return revenuePigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon.Builder setCurrency(java.lang.String str) {
                this.currency = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon.Builder setPayload(java.lang.String str) {
                this.payload = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon.Builder setPrice(java.lang.String str) {
                this.price = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon.Builder setProductId(java.lang.String str) {
                this.productId = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon.Builder setQuantity(java.lang.Long l2) {
                this.quantity = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon.Builder setReceipt(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon receiptPigeon) {
                this.receipt = receiptPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon.Builder setTransactionId(java.lang.String str) {
                this.transactionId = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            java.lang.Long valueOf;
            io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon revenuePigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.RevenuePigeon();
            revenuePigeon.setPrice((java.lang.String) arrayList.get(0));
            revenuePigeon.setCurrency((java.lang.String) arrayList.get(1));
            java.lang.Object obj = arrayList.get(2);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            revenuePigeon.setQuantity(valueOf);
            revenuePigeon.setProductId((java.lang.String) arrayList.get(3));
            revenuePigeon.setPayload((java.lang.String) arrayList.get(4));
            java.lang.Object obj2 = arrayList.get(5);
            revenuePigeon.setReceipt(obj2 != null ? io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon.fromList((java.util.ArrayList) obj2) : null);
            revenuePigeon.setTransactionId((java.lang.String) arrayList.get(6));
            return revenuePigeon;
        }

        public java.lang.String getCurrency() {
            return this.currency;
        }

        public java.lang.String getPayload() {
            return this.payload;
        }

        public java.lang.String getPrice() {
            return this.price;
        }

        public java.lang.String getProductId() {
            return this.productId;
        }

        public java.lang.Long getQuantity() {
            return this.quantity;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon getReceipt() {
            return this.receipt;
        }

        public java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public void setCurrency(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"currency\" is null.");
            }
            this.currency = str;
        }

        public void setPayload(java.lang.String str) {
            this.payload = str;
        }

        public void setPrice(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"price\" is null.");
            }
            this.price = str;
        }

        public void setProductId(java.lang.String str) {
            this.productId = str;
        }

        public void setQuantity(java.lang.Long l2) {
            this.quantity = l2;
        }

        public void setReceipt(io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon receiptPigeon) {
            this.receipt = receiptPigeon;
        }

        public void setTransactionId(java.lang.String str) {
            this.transactionId = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(7);
            arrayList.add(this.price);
            arrayList.add(this.currency);
            arrayList.add(this.quantity);
            arrayList.add(this.productId);
            arrayList.add(this.payload);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.ReceiptPigeon receiptPigeon = this.receipt;
            arrayList.add(receiptPigeon == null ? null : receiptPigeon.toList());
            arrayList.add(this.transactionId);
            return arrayList;
        }
    }

    public static final class StackTraceElementPigeon {
        private java.lang.String className;
        private java.lang.Long column;
        private java.lang.String fileName;
        private java.lang.Long line;
        private java.lang.String methodName;

        public static final class Builder {
            private java.lang.String className;
            private java.lang.Long column;
            private java.lang.String fileName;
            private java.lang.Long line;
            private java.lang.String methodName;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon stackTraceElementPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon();
                stackTraceElementPigeon.setClassName(this.className);
                stackTraceElementPigeon.setFileName(this.fileName);
                stackTraceElementPigeon.setLine(this.line);
                stackTraceElementPigeon.setColumn(this.column);
                stackTraceElementPigeon.setMethodName(this.methodName);
                return stackTraceElementPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon.Builder setClassName(java.lang.String str) {
                this.className = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon.Builder setColumn(java.lang.Long l2) {
                this.column = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon.Builder setFileName(java.lang.String str) {
                this.fileName = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon.Builder setLine(java.lang.Long l2) {
                this.line = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon.Builder setMethodName(java.lang.String str) {
                this.methodName = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            java.lang.Long valueOf;
            io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon stackTraceElementPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.StackTraceElementPigeon();
            stackTraceElementPigeon.setClassName((java.lang.String) arrayList.get(0));
            stackTraceElementPigeon.setFileName((java.lang.String) arrayList.get(1));
            java.lang.Object obj = arrayList.get(2);
            java.lang.Long l2 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            stackTraceElementPigeon.setLine(valueOf);
            java.lang.Object obj2 = arrayList.get(3);
            if (obj2 != null) {
                l2 = java.lang.Long.valueOf(obj2 instanceof java.lang.Integer ? ((java.lang.Integer) obj2).intValue() : ((java.lang.Long) obj2).longValue());
            }
            stackTraceElementPigeon.setColumn(l2);
            stackTraceElementPigeon.setMethodName((java.lang.String) arrayList.get(4));
            return stackTraceElementPigeon;
        }

        public java.lang.String getClassName() {
            return this.className;
        }

        public java.lang.Long getColumn() {
            return this.column;
        }

        public java.lang.String getFileName() {
            return this.fileName;
        }

        public java.lang.Long getLine() {
            return this.line;
        }

        public java.lang.String getMethodName() {
            return this.methodName;
        }

        public void setClassName(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"className\" is null.");
            }
            this.className = str;
        }

        public void setColumn(java.lang.Long l2) {
            if (l2 == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"column\" is null.");
            }
            this.column = l2;
        }

        public void setFileName(java.lang.String str) {
            this.fileName = str;
        }

        public void setLine(java.lang.Long l2) {
            if (l2 == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"line\" is null.");
            }
            this.line = l2;
        }

        public void setMethodName(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"methodName\" is null.");
            }
            this.methodName = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(5);
            arrayList.add(this.className);
            arrayList.add(this.fileName);
            arrayList.add(this.line);
            arrayList.add(this.column);
            arrayList.add(this.methodName);
            return arrayList;
        }
    }

    public static final class StartupParamsItemPigeon {
        private java.lang.String errorDetails;
        private java.lang.String id;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon status;

        public static final class Builder {
            private java.lang.String errorDetails;
            private java.lang.String id;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon status;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon startupParamsItemPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon();
                startupParamsItemPigeon.setId(this.id);
                startupParamsItemPigeon.setStatus(this.status);
                startupParamsItemPigeon.setErrorDetails(this.errorDetails);
                return startupParamsItemPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon.Builder setErrorDetails(java.lang.String str) {
                this.errorDetails = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon.Builder setId(java.lang.String str) {
                this.id = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon.Builder setStatus(io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon startupParamsItemStatusPigeon) {
                this.status = startupParamsItemStatusPigeon;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon startupParamsItemPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon();
            startupParamsItemPigeon.setId((java.lang.String) arrayList.get(0));
            java.lang.Object obj = arrayList.get(1);
            startupParamsItemPigeon.setStatus(obj == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon.values()[((java.lang.Integer) obj).intValue()]);
            startupParamsItemPigeon.setErrorDetails((java.lang.String) arrayList.get(2));
            return startupParamsItemPigeon;
        }

        public java.lang.String getErrorDetails() {
            return this.errorDetails;
        }

        public java.lang.String getId() {
            return this.id;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon getStatus() {
            return this.status;
        }

        public void setErrorDetails(java.lang.String str) {
            this.errorDetails = str;
        }

        public void setId(java.lang.String str) {
            this.id = str;
        }

        public void setStatus(io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon startupParamsItemStatusPigeon) {
            if (startupParamsItemStatusPigeon == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"status\" is null.");
            }
            this.status = startupParamsItemStatusPigeon;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(3);
            arrayList.add(this.id);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemStatusPigeon startupParamsItemStatusPigeon = this.status;
            arrayList.add(startupParamsItemStatusPigeon == null ? null : java.lang.Integer.valueOf(startupParamsItemStatusPigeon.index));
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

        StartupParamsItemStatusPigeon(int i2) {
            this.index = i2;
        }
    }

    public static final class StartupParamsPigeon {
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon reason;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon result;

        public static final class Builder {
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon reason;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon result;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon startupParamsPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon();
                startupParamsPigeon.setResult(this.result);
                startupParamsPigeon.setReason(this.reason);
                return startupParamsPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon.Builder setReason(io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon startupParamsReasonPigeon) {
                this.reason = startupParamsReasonPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon.Builder setResult(io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon startupParamsResultPigeon) {
                this.result = startupParamsResultPigeon;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon startupParamsPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsPigeon();
            java.lang.Object obj = arrayList.get(0);
            startupParamsPigeon.setResult(obj == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon.fromList((java.util.ArrayList) obj));
            java.lang.Object obj2 = arrayList.get(1);
            startupParamsPigeon.setReason(obj2 != null ? io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon.fromList((java.util.ArrayList) obj2) : null);
            return startupParamsPigeon;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon getReason() {
            return this.reason;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon getResult() {
            return this.result;
        }

        public void setReason(io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon startupParamsReasonPigeon) {
            this.reason = startupParamsReasonPigeon;
        }

        public void setResult(io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon startupParamsResultPigeon) {
            this.result = startupParamsResultPigeon;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(2);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon startupParamsResultPigeon = this.result;
            arrayList.add(startupParamsResultPigeon == null ? null : startupParamsResultPigeon.toList());
            io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon startupParamsReasonPigeon = this.reason;
            arrayList.add(startupParamsReasonPigeon != null ? startupParamsReasonPigeon.toList() : null);
            return arrayList;
        }
    }

    public static final class StartupParamsReasonPigeon {
        private java.lang.String value;

        public static final class Builder {
            private java.lang.String value;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon startupParamsReasonPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon();
                startupParamsReasonPigeon.setValue(this.value);
                return startupParamsReasonPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon.Builder setValue(java.lang.String str) {
                this.value = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon startupParamsReasonPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsReasonPigeon();
            startupParamsReasonPigeon.setValue((java.lang.String) arrayList.get(0));
            return startupParamsReasonPigeon;
        }

        public java.lang.String getValue() {
            return this.value;
        }

        public void setValue(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"value\" is null.");
            }
            this.value = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(1);
            arrayList.add(this.value);
            return arrayList;
        }
    }

    public static final class StartupParamsResultPigeon {
        private java.lang.String deviceId;
        private java.lang.String deviceIdHash;
        private java.util.Map<java.lang.String, io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon> parameters;
        private java.lang.String uuid;

        public static final class Builder {
            private java.lang.String deviceId;
            private java.lang.String deviceIdHash;
            private java.util.Map<java.lang.String, io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon> parameters;
            private java.lang.String uuid;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon startupParamsResultPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon();
                startupParamsResultPigeon.setDeviceId(this.deviceId);
                startupParamsResultPigeon.setDeviceIdHash(this.deviceIdHash);
                startupParamsResultPigeon.setParameters(this.parameters);
                startupParamsResultPigeon.setUuid(this.uuid);
                return startupParamsResultPigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon.Builder setDeviceId(java.lang.String str) {
                this.deviceId = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon.Builder setDeviceIdHash(java.lang.String str) {
                this.deviceIdHash = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon.Builder setParameters(java.util.Map<java.lang.String, io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon> map) {
                this.parameters = map;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon.Builder setUuid(java.lang.String str) {
                this.uuid = str;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon startupParamsResultPigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsResultPigeon();
            startupParamsResultPigeon.setDeviceId((java.lang.String) arrayList.get(0));
            startupParamsResultPigeon.setDeviceIdHash((java.lang.String) arrayList.get(1));
            startupParamsResultPigeon.setParameters((java.util.Map) arrayList.get(2));
            startupParamsResultPigeon.setUuid((java.lang.String) arrayList.get(3));
            return startupParamsResultPigeon;
        }

        public java.lang.String getDeviceId() {
            return this.deviceId;
        }

        public java.lang.String getDeviceIdHash() {
            return this.deviceIdHash;
        }

        public java.util.Map<java.lang.String, io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon> getParameters() {
            return this.parameters;
        }

        public java.lang.String getUuid() {
            return this.uuid;
        }

        public void setDeviceId(java.lang.String str) {
            this.deviceId = str;
        }

        public void setDeviceIdHash(java.lang.String str) {
            this.deviceIdHash = str;
        }

        public void setParameters(java.util.Map<java.lang.String, io.appmetrica.analytics.flutter.pigeon.Pigeon.StartupParamsItemPigeon> map) {
            this.parameters = map;
        }

        public void setUuid(java.lang.String str) {
            this.uuid = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(4);
            arrayList.add(this.deviceId);
            arrayList.add(this.deviceIdHash);
            arrayList.add(this.parameters);
            arrayList.add(this.uuid);
            return arrayList;
        }
    }

    public static final class UserProfileAttributePigeon {
        private java.lang.Long age;
        private java.lang.Boolean boolValue;
        private java.lang.Long day;
        private java.lang.Double doubleValue;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.GenderPigeon genderValue;
        private java.lang.Boolean ifUndefined;
        private java.lang.String key;
        private java.lang.Long month;
        private java.lang.Boolean reset;
        private java.lang.String stringValue;
        private java.util.List<java.lang.String> stringValues;
        private io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType type;
        private java.lang.Long year;

        public static final class Builder {
            private java.lang.Long age;
            private java.lang.Boolean boolValue;
            private java.lang.Long day;
            private java.lang.Double doubleValue;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.GenderPigeon genderValue;
            private java.lang.Boolean ifUndefined;
            private java.lang.String key;
            private java.lang.Long month;
            private java.lang.Boolean reset;
            private java.lang.String stringValue;
            private java.util.List<java.lang.String> stringValues;
            private io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType type;
            private java.lang.Long year;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon userProfileAttributePigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon();
                userProfileAttributePigeon.setKey(this.key);
                userProfileAttributePigeon.setDoubleValue(this.doubleValue);
                userProfileAttributePigeon.setStringValue(this.stringValue);
                userProfileAttributePigeon.setBoolValue(this.boolValue);
                userProfileAttributePigeon.setYear(this.year);
                userProfileAttributePigeon.setMonth(this.month);
                userProfileAttributePigeon.setDay(this.day);
                userProfileAttributePigeon.setAge(this.age);
                userProfileAttributePigeon.setGenderValue(this.genderValue);
                userProfileAttributePigeon.setStringValues(this.stringValues);
                userProfileAttributePigeon.setIfUndefined(this.ifUndefined);
                userProfileAttributePigeon.setReset(this.reset);
                userProfileAttributePigeon.setType(this.type);
                return userProfileAttributePigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setAge(java.lang.Long l2) {
                this.age = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setBoolValue(java.lang.Boolean bool) {
                this.boolValue = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setDay(java.lang.Long l2) {
                this.day = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setDoubleValue(java.lang.Double d2) {
                this.doubleValue = d2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setGenderValue(io.appmetrica.analytics.flutter.pigeon.Pigeon.GenderPigeon genderPigeon) {
                this.genderValue = genderPigeon;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setIfUndefined(java.lang.Boolean bool) {
                this.ifUndefined = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setKey(java.lang.String str) {
                this.key = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setMonth(java.lang.Long l2) {
                this.month = l2;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setReset(java.lang.Boolean bool) {
                this.reset = bool;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setStringValue(java.lang.String str) {
                this.stringValue = str;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setStringValues(java.util.List<java.lang.String> list) {
                this.stringValues = list;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setType(io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType userProfileAttributeType) {
                this.type = userProfileAttributeType;
                return this;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon.Builder setYear(java.lang.Long l2) {
                this.year = l2;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            java.lang.Long valueOf;
            java.lang.Long valueOf2;
            java.lang.Long valueOf3;
            java.lang.Long valueOf4;
            io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon userProfileAttributePigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon();
            userProfileAttributePigeon.setKey((java.lang.String) arrayList.get(0));
            userProfileAttributePigeon.setDoubleValue((java.lang.Double) arrayList.get(1));
            userProfileAttributePigeon.setStringValue((java.lang.String) arrayList.get(2));
            userProfileAttributePigeon.setBoolValue((java.lang.Boolean) arrayList.get(3));
            java.lang.Object obj = arrayList.get(4);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            userProfileAttributePigeon.setYear(valueOf);
            java.lang.Object obj2 = arrayList.get(5);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = java.lang.Long.valueOf(obj2 instanceof java.lang.Integer ? ((java.lang.Integer) obj2).intValue() : ((java.lang.Long) obj2).longValue());
            }
            userProfileAttributePigeon.setMonth(valueOf2);
            java.lang.Object obj3 = arrayList.get(6);
            if (obj3 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = java.lang.Long.valueOf(obj3 instanceof java.lang.Integer ? ((java.lang.Integer) obj3).intValue() : ((java.lang.Long) obj3).longValue());
            }
            userProfileAttributePigeon.setDay(valueOf3);
            java.lang.Object obj4 = arrayList.get(7);
            if (obj4 == null) {
                valueOf4 = null;
            } else {
                valueOf4 = java.lang.Long.valueOf(obj4 instanceof java.lang.Integer ? ((java.lang.Integer) obj4).intValue() : ((java.lang.Long) obj4).longValue());
            }
            userProfileAttributePigeon.setAge(valueOf4);
            java.lang.Object obj5 = arrayList.get(8);
            userProfileAttributePigeon.setGenderValue(obj5 == null ? null : io.appmetrica.analytics.flutter.pigeon.Pigeon.GenderPigeon.values()[((java.lang.Integer) obj5).intValue()]);
            userProfileAttributePigeon.setStringValues((java.util.List) arrayList.get(9));
            userProfileAttributePigeon.setIfUndefined((java.lang.Boolean) arrayList.get(10));
            userProfileAttributePigeon.setReset((java.lang.Boolean) arrayList.get(11));
            java.lang.Object obj6 = arrayList.get(12);
            userProfileAttributePigeon.setType(obj6 != null ? io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType.values()[((java.lang.Integer) obj6).intValue()] : null);
            return userProfileAttributePigeon;
        }

        public java.lang.Long getAge() {
            return this.age;
        }

        public java.lang.Boolean getBoolValue() {
            return this.boolValue;
        }

        public java.lang.Long getDay() {
            return this.day;
        }

        public java.lang.Double getDoubleValue() {
            return this.doubleValue;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.GenderPigeon getGenderValue() {
            return this.genderValue;
        }

        public java.lang.Boolean getIfUndefined() {
            return this.ifUndefined;
        }

        public java.lang.String getKey() {
            return this.key;
        }

        public java.lang.Long getMonth() {
            return this.month;
        }

        public java.lang.Boolean getReset() {
            return this.reset;
        }

        public java.lang.String getStringValue() {
            return this.stringValue;
        }

        public java.util.List<java.lang.String> getStringValues() {
            return this.stringValues;
        }

        public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType getType() {
            return this.type;
        }

        public java.lang.Long getYear() {
            return this.year;
        }

        public void setAge(java.lang.Long l2) {
            this.age = l2;
        }

        public void setBoolValue(java.lang.Boolean bool) {
            this.boolValue = bool;
        }

        public void setDay(java.lang.Long l2) {
            this.day = l2;
        }

        public void setDoubleValue(java.lang.Double d2) {
            this.doubleValue = d2;
        }

        public void setGenderValue(io.appmetrica.analytics.flutter.pigeon.Pigeon.GenderPigeon genderPigeon) {
            this.genderValue = genderPigeon;
        }

        public void setIfUndefined(java.lang.Boolean bool) {
            this.ifUndefined = bool;
        }

        public void setKey(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"key\" is null.");
            }
            this.key = str;
        }

        public void setMonth(java.lang.Long l2) {
            this.month = l2;
        }

        public void setReset(java.lang.Boolean bool) {
            this.reset = bool;
        }

        public void setStringValue(java.lang.String str) {
            this.stringValue = str;
        }

        public void setStringValues(java.util.List<java.lang.String> list) {
            this.stringValues = list;
        }

        public void setType(io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType userProfileAttributeType) {
            this.type = userProfileAttributeType;
        }

        public void setYear(java.lang.Long l2) {
            this.year = l2;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(13);
            arrayList.add(this.key);
            arrayList.add(this.doubleValue);
            arrayList.add(this.stringValue);
            arrayList.add(this.boolValue);
            arrayList.add(this.year);
            arrayList.add(this.month);
            arrayList.add(this.day);
            arrayList.add(this.age);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.GenderPigeon genderPigeon = this.genderValue;
            arrayList.add(genderPigeon == null ? null : java.lang.Integer.valueOf(genderPigeon.index));
            arrayList.add(this.stringValues);
            arrayList.add(this.ifUndefined);
            arrayList.add(this.reset);
            io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributeType userProfileAttributeType = this.type;
            arrayList.add(userProfileAttributeType != null ? java.lang.Integer.valueOf(userProfileAttributeType.index) : null);
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
        STRING(7),
        PHONE_HASH(8),
        EMAIL_HASH(9),
        TELEGRAM_LOGIN_HASH(10);

        final int index;

        UserProfileAttributeType(int i2) {
            this.index = i2;
        }
    }

    public static final class UserProfilePigeon {
        private java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon> attributes;

        public static final class Builder {
            private java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon> attributes;

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon build() {
                io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon userProfilePigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon();
                userProfilePigeon.setAttributes(this.attributes);
                return userProfilePigeon;
            }

            public io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon.Builder setAttributes(java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon> list) {
                this.attributes = list;
                return this;
            }
        }

        public static io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon userProfilePigeon = new io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfilePigeon();
            userProfilePigeon.setAttributes((java.util.List) arrayList.get(0));
            return userProfilePigeon;
        }

        public java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon> getAttributes() {
            return this.attributes;
        }

        public void setAttributes(java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.UserProfileAttributePigeon> list) {
            if (list == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"attributes\" is null.");
            }
            this.attributes = list;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(1);
            arrayList.add(this.attributes);
            return arrayList;
        }
    }

    public static java.util.ArrayList<java.lang.Object> wrapError(java.lang.Throwable th) {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(3);
        if (th instanceof io.appmetrica.analytics.flutter.pigeon.Pigeon.FlutterError) {
            io.appmetrica.analytics.flutter.pigeon.Pigeon.FlutterError flutterError = (io.appmetrica.analytics.flutter.pigeon.Pigeon.FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
