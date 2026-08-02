package com.paypal.oslo.app.contextheader;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/app/contextheader/AppContextHeadersProvider;", "Lcom/paypal/oslo/app/contextheader/ContextHeadersProvider;", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "appIdentity", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Landroid/content/Context;", "context", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;Lcom/paypal/oslo/core/userstore/UserStore;Landroid/content/Context;)V", "Ljava/util/Locale;", "Camera2StreamConfigurationMap", "()Ljava/util/Locale;", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "", "", "Lcom/paypal/oslo/app/contextheader/ContextHeader;", "getContextHeaders", "()Ljava/util/Map;", "contextHeaders"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppContextHeadersProvider implements com.paypal.oslo.app.contextheader.ContextHeadersProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.AppIdentity getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AppContextHeadersProvider(com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity, com.paypal.oslo.core.userstore.UserStore userStore, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appIdentity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = appIdentity;
        this.Camera2StreamConfigurationMap = userStore;
        this.getHighSpeedVideoFpsRanges = context;
    }

    private final java.util.Locale Camera2StreamConfigurationMap() {
        com.paypal.oslo.core.userstore.model.UserState value = this.Camera2StreamConfigurationMap.getUserState().getValue();
        if (value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            java.lang.String accountCountryCode = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getAccountCountryCode();
            java.lang.String language = this.getHighResolutionOutputSizeshNQ4ISI.getUserLocale().getLanguage();
            try {
                java.util.Locale build = new java.util.Locale.Builder().setLanguage(language).setRegion(accountCountryCode).build();
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "Using account locale for authenticated user", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("accountCountry", accountCountryCode), kotlin.TuplesKt.to("deviceLanguage", language), kotlin.TuplesKt.to("resultingLocale", build.toString())), null, 4, null);
                kotlin.jvm.internal.Intrinsics.checkNotNull(build);
                return build;
            } catch (java.util.IllformedLocaleException e) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.app.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = kotlin.TuplesKt.to("accountCountry", accountCountryCode);
                pairArr[1] = kotlin.TuplesKt.to("deviceLanguage", language);
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                pairArr[2] = kotlin.TuplesKt.to("error", message);
                com.paypal.android.logger.Logger.w$default(logger, "Invalid locale data from user profile, falling back to device locale", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                return this.getHighResolutionOutputSizeshNQ4ISI.getUserLocale();
            }
        }
        java.util.Locale userLocale = this.getHighResolutionOutputSizeshNQ4ISI.getUserLocale();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "Using device locale", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("userState", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName()), kotlin.TuplesKt.to("locale", userLocale.toString())), null, 4, null);
        return userLocale;
    }

    @Override // com.paypal.oslo.app.contextheader.ContextHeadersProvider
    public final java.util.Map<java.lang.String, com.paypal.oslo.app.contextheader.ContextHeader> getContextHeaders() {
        com.paypal.oslo.app.contextheader.ContextHeader appInfoHeader;
        kotlin.enums.EnumEntries<com.paypal.oslo.app.contextheader.ContextHeaderKey> entries = com.paypal.oslo.app.contextheader.ContextHeaderKey.getEntries();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (com.paypal.oslo.app.contextheader.ContextHeaderKey contextHeaderKey : entries) {
            int i = com.paypal.oslo.app.contextheader.AppContextHeadersProvider.WhenMappings.$EnumSwitchMapping$0[contextHeaderKey.ordinal()];
            if (i == 1) {
                java.lang.String appName = this.getHighResolutionOutputSizeshNQ4ISI.getAppName();
                java.lang.String appVersion = this.getHighResolutionOutputSizeshNQ4ISI.getAppVersion();
                java.lang.String appGUID = this.getHighResolutionOutputSizeshNQ4ISI.getAppGUID();
                appInfoHeader = new com.paypal.oslo.app.contextheader.AppInfoHeader(appName, appVersion, appGUID == null ? "" : appGUID, this.getHighResolutionOutputSizeshNQ4ISI.getBuildNumber(), null, 16, null);
            } else if (i == 2) {
                appInfoHeader = new com.paypal.oslo.app.contextheader.DeviceInfoHeader(this.getHighResolutionOutputSizeshNQ4ISI.getAndroidId(), (this.getHighSpeedVideoFpsRanges.getResources().getConfiguration().screenLayout & 15) >= 3 ? com.paypal.oslo.app.contextheader.DeviceType.TABLET : com.paypal.oslo.app.contextheader.DeviceType.PHONE, com.paypal.oslo.app.contextheader.DeviceOS.ANDROID, this.getHighResolutionOutputSizeshNQ4ISI.getOsVersion(), this.getHighResolutionOutputSizeshNQ4ISI.getDeviceManufacturer(), this.getHighResolutionOutputSizeshNQ4ISI.getDeviceModel(), java.lang.Boolean.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.isNFCSupported()));
            } else if (i == 3) {
                java.util.Locale Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                java.lang.String country = Camera2StreamConfigurationMap.getCountry();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(country, "");
                java.lang.String language = Camera2StreamConfigurationMap.getLanguage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "");
                appInfoHeader = new com.paypal.oslo.app.contextheader.LocaleHeader(country, language, this.getHighResolutionOutputSizeshNQ4ISI.getTimezone().getID());
            } else if (i != 4) {
                if (i != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                appInfoHeader = new com.paypal.oslo.app.contextheader.FPTIHeader(this.getHighResolutionOutputSizeshNQ4ISI.getAppGUID(), this.getHighResolutionOutputSizeshNQ4ISI.getSessionID());
            } else {
                appInfoHeader = new com.paypal.oslo.app.contextheader.SessionInfoHeader(this.getHighResolutionOutputSizeshNQ4ISI.getSessionID());
            }
            kotlin.Pair pair = kotlin.TuplesKt.to(contextHeaderKey.getValue(), appInfoHeader);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.app.contextheader.ContextHeaderKey.values().length];
            try {
                iArr[com.paypal.oslo.app.contextheader.ContextHeaderKey.APP_INFO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.app.contextheader.ContextHeaderKey.DEVICE_INFO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.app.contextheader.ContextHeaderKey.LOCALE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.app.contextheader.ContextHeaderKey.SESSION_INFO.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.app.contextheader.ContextHeaderKey.FPTI.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
