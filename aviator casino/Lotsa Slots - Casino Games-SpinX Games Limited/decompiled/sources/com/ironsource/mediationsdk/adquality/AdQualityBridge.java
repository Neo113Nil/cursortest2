package com.ironsource.mediationsdk.adquality;

/* loaded from: classes5.dex */
public final class AdQualityBridge {
    public static final com.ironsource.mediationsdk.adquality.AdQualityBridge.Companion Companion = new com.ironsource.mediationsdk.adquality.AdQualityBridge.Companion(null);
    private static java.lang.Boolean isGetVersionMethodExist;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        public final boolean isGetVersionMethodExist() {
            try {
                if (com.ironsource.mediationsdk.adquality.AdQualityBridge.isGetVersionMethodExist != null) {
                    return kotlin.jvm.internal.Intrinsics.areEqual(com.ironsource.mediationsdk.adquality.AdQualityBridge.isGetVersionMethodExist, java.lang.Boolean.TRUE);
                }
                boolean z = java.lang.Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality").getDeclaredMethods().length >= 10;
                com.ironsource.mediationsdk.adquality.AdQualityBridge.isGetVersionMethodExist = java.lang.Boolean.valueOf(z);
                return z;
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
                logEvent$default(this, com.ironsource.EnumC3378y5.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST, null, null, 6, null);
                return false;
            }
        }

        @kotlin.jvm.JvmStatic
        private static /* synthetic */ void isGetVersionMethodExist$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        public final void logEvent(com.ironsource.EnumC3378y5 enumC3378y5, java.lang.Integer num, java.lang.String str) {
            org.json.JSONObject b = com.ironsource.mediationsdk.utils.IronSourceUtils.b(false);
            if (num != null) {
                b.put("errorCode", num.intValue());
            }
            if (str != null) {
                b.put("reason", str);
            }
            b.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, com.ironsource.mediationsdk.adquality.a.f6396a.a().b());
            com.ironsource.Jb.u.d().q().a(new com.ironsource.C3360x5(enumC3378y5, b));
        }

        static /* synthetic */ void logEvent$default(com.ironsource.mediationsdk.adquality.AdQualityBridge.Companion companion, com.ironsource.EnumC3378y5 enumC3378y5, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            companion.logEvent(enumC3378y5, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        public final int versionCompare(java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
                return -1;
            }
            int i = 0;
            java.lang.String[] strArr = (java.lang.String[]) kotlin.text.StringsKt.split$default((java.lang.CharSequence) new kotlin.text.Regex("[^0-9.]").replace(str, ""), new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
            java.lang.String[] strArr2 = (java.lang.String[]) kotlin.text.StringsKt.split$default((java.lang.CharSequence) new kotlin.text.Regex("[^0-9.]").replace(str2, ""), new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null).toArray(new java.lang.String[0]);
            while (i < strArr.length && i < strArr2.length && kotlin.jvm.internal.Intrinsics.areEqual(strArr[i], strArr2[i])) {
                i++;
            }
            if (i >= strArr.length || i >= strArr2.length) {
                return java.lang.Integer.signum(strArr.length - strArr2.length);
            }
            int intValue = java.lang.Integer.valueOf(strArr[i]).intValue();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(strArr2[i]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(vals2[i])");
            return java.lang.Integer.signum(kotlin.jvm.internal.Intrinsics.compare(intValue, valueOf.intValue()));
        }

        @kotlin.jvm.JvmStatic
        public final boolean adQualityAvailable() {
            return versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0;
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getAdQualitySdkVersion() {
            if (!isGetVersionMethodExist()) {
                return new java.lang.String();
            }
            java.lang.String sDKVersion = com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getSDKVersion();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
            return sDKVersion;
        }

        private Companion() {
        }
    }

    public AdQualityBridge(android.content.Context context, java.lang.String appKey, java.lang.String str, com.ironsource.C3104j0 adQualityDataProvider, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adQualityDataProvider, "adQualityDataProvider");
        com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder deviceIdType = new com.ironsource.adqualitysdk.sdk.ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i)).setAdQualityInitListener(new com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(com.ironsource.adqualitysdk.sdk.ISAdQualityInitError isAdQualityInitError, java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isAdQualityInitError, "isAdQualityInitError");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                com.ironsource.EnumC3378y5 enumC3378y5 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT;
                if (isAdQualityInitError == com.ironsource.adqualitysdk.sdk.ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED) {
                    enumC3378y5 = com.ironsource.EnumC3378y5.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT;
                }
                com.ironsource.mediationsdk.adquality.AdQualityBridge.Companion.logEvent(enumC3378y5, java.lang.Integer.valueOf(isAdQualityInitError.getValue()), message);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: " + message, 3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() {
                com.ironsource.mediationsdk.adquality.AdQualityBridge.Companion.logEvent$default(com.ironsource.mediationsdk.adquality.AdQualityBridge.Companion, com.ironsource.EnumC3378y5.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!android.text.TextUtils.isEmpty(str)) {
            deviceIdType.setUserId(str);
        }
        com.ironsource.mediationsdk.adquality.AdQualityBridge.Companion companion = Companion;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            org.json.JSONObject a2 = adQualityDataProvider.a();
            if (a2.length() > 0) {
                deviceIdType.setMetaData(a2);
            }
        }
        com.ironsource.mediationsdk.adquality.AdQualityBridge.Companion.logEvent$default(companion, com.ironsource.EnumC3378y5.TROUBLESHOOTING_INITIALIZING_AD_QUALITY_SDK_EVENT, null, null, 6, null);
        com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getInstance().initialize(context, appKey, deviceIdType.build());
    }

    @kotlin.jvm.JvmStatic
    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    private final com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel convertToAdQualityLogLevel(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.INFO : com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.ERROR : com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.WARNING : com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.INFO : com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.VERBOSE;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getAdQualitySdkVersion() {
        return Companion.getAdQualitySdkVersion();
    }

    private final boolean getCoppaValue() {
        java.lang.String a2 = com.ironsource.J6.a().a("is_coppa");
        return a2 != null && java.lang.Boolean.parseBoolean(a2);
    }

    private final com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType getDeviceIdType() {
        return !android.text.TextUtils.isEmpty(com.ironsource.J6.a().a(com.ironsource.K6.N)) ? com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType.NONE : com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType.GAID;
    }

    @kotlin.jvm.JvmStatic
    private static final boolean isGetVersionMethodExist() {
        return Companion.isGetVersionMethodExist();
    }

    @kotlin.jvm.JvmStatic
    private static final void logEvent(com.ironsource.EnumC3378y5 enumC3378y5, java.lang.Integer num, java.lang.String str) {
        Companion.logEvent(enumC3378y5, num, str);
    }

    @kotlin.jvm.JvmStatic
    private static final int versionCompare(java.lang.String str, java.lang.String str2) {
        return Companion.versionCompare(str, str2);
    }

    public final void changeUserId(java.lang.String userId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "userId");
        com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getInstance().changeUserId(userId);
    }

    public final void setSegment(com.ironsource.C2953aa segment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
        com.ironsource.adqualitysdk.sdk.ISAdQualitySegment.Builder builder = new com.ironsource.adqualitysdk.sdk.ISAdQualitySegment.Builder();
        if (segment.g() != null) {
            builder.setSegmentName(segment.g());
        }
        if (segment.a() > -1) {
            builder.setAge(segment.a());
        }
        if (segment.b() != null) {
            builder.setGender(segment.b());
        }
        if (segment.e() > -1) {
            builder.setLevel(segment.e());
        }
        if (segment.d() != null) {
            builder.setIsPaying(segment.d().get());
        }
        if (segment.c() > -1.0d) {
            builder.setInAppPurchasesTotal(segment.c());
        }
        if (segment.h() > 0) {
            builder.setUserCreationDate(segment.h());
        }
        java.util.Iterator<android.util.Pair<java.lang.String, java.lang.String>> it = segment.f().iterator();
        while (it.hasNext()) {
            android.util.Pair<java.lang.String, java.lang.String> next = it.next();
            java.lang.String key = (java.lang.String) next.first;
            java.lang.String str = (java.lang.String) next.second;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
            if (kotlin.text.StringsKt.startsWith$default(key, "custom_", false, 2, (java.lang.Object) null)) {
                builder.setCustomData(kotlin.text.StringsKt.removePrefix(key, (java.lang.CharSequence) "custom_"), str);
            }
        }
        com.ironsource.adqualitysdk.sdk.IronSourceAdQuality.getInstance().setSegment(builder.build());
    }
}
