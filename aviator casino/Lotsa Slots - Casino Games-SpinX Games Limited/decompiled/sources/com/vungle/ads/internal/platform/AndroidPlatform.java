package com.vungle.ads.internal.platform;

/* compiled from: AndroidPlatform.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u0018\u0000 ;2\u00020\u0001:\u0001;B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010(\u001a\u00020\fH\u0016J\b\u0010)\u001a\u00020\fH\u0002J\n\u0010*\u001a\u0004\u0018\u00010\u000eH\u0016J\u000f\u0010+\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u001eH\u0016J\n\u0010.\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010/\u001a\u00020\fH\u0002J\b\u00100\u001a\u00020\u001eH\u0016J\b\u00101\u001a\u00020\u001eH\u0016J\b\u00102\u001a\u00020\u001eH\u0016J\u0018\u00103\u001a\u0002042\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e06H\u0016J\b\u00107\u001a\u00020\u0017H\u0016J\u0010\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020%H\u0002J\b\u0010:\u001a\u000204H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u0017X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0004\u0018\u00010\u000e8VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006<²\u0006\n\u0010=\u001a\u00020>X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/platform/AndroidPlatform;", "Lcom/vungle/ads/internal/platform/Platform;", "context", "Landroid/content/Context;", "uaExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "powerManager", "Landroid/os/PowerManager;", "audioManager", "Landroid/media/AudioManager;", "(Landroid/content/Context;Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;Landroid/os/PowerManager;Landroid/media/AudioManager;)V", "advertisingInfo", "Lcom/vungle/ads/internal/model/AdvertisingInfo;", "appSetId", "", "appSetIdScope", "", "Ljava/lang/Integer;", "carrierName", "getCarrierName", "()Ljava/lang/String;", "gpVersion", "isBatterySaverEnabled", "", "()Z", "isSdCardPresent", "isSideLoaded", "isSilentModeEnabled", "isSoundEnabled", "sdkInstallationTime", "", "Ljava/lang/Long;", "userAgent", "getUserAgent", "setUserAgent", "(Ljava/lang/String;)V", "volumeLevel", "", "getVolumeLevel", "()F", "getAdvertisingInfo", "getAmazonAdvertisingInfo", "getAppSetId", "getAppSetIdScope", "()Ljava/lang/Integer;", "getBuildTime", "getGPVersion", "getGoogleAdvertisingInfo", "getLastBootTime", "getOSInstallationTime", "getSDKInstallationTime", "getUserAgentLazy", "", "consumer", "Landroidx/core/util/Consumer;", "isProblematicMaliDevice", "sanitizeVolume", "value", "updateAppSetID", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidPlatform implements com.vungle.ads.internal.platform.Platform {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.internal.platform.AndroidPlatform.Companion INSTANCE = new com.vungle.ads.internal.platform.AndroidPlatform.Companion(null);
    private static final java.lang.String PREF_KEY_SDK_INSTALL_TIME = "sit";
    private static final java.lang.String TAG = "AndroidPlatform";
    private com.vungle.ads.internal.model.AdvertisingInfo advertisingInfo;
    private java.lang.String appSetId;
    private java.lang.Integer appSetIdScope;
    private final android.media.AudioManager audioManager;
    private final android.content.Context context;
    private java.lang.String gpVersion;
    private final boolean isSideLoaded;
    private final android.os.PowerManager powerManager;
    private java.lang.Long sdkInstallationTime;
    private final com.vungle.ads.internal.executor.VungleThreadPoolExecutor uaExecutor;
    private java.lang.String userAgent;

    public AndroidPlatform(android.content.Context context, com.vungle.ads.internal.executor.VungleThreadPoolExecutor uaExecutor, android.os.PowerManager powerManager, android.media.AudioManager audioManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uaExecutor, "uaExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        this.context = context;
        this.uaExecutor = uaExecutor;
        this.powerManager = powerManager;
        this.audioManager = audioManager;
        updateAppSetID();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AndroidPlatform(android.content.Context context, com.vungle.ads.internal.executor.VungleThreadPoolExecutor vungleThreadPoolExecutor, android.os.PowerManager powerManager, android.media.AudioManager audioManager, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, vungleThreadPoolExecutor, powerManager, audioManager);
        if ((i & 4) != 0) {
            java.lang.Object systemService = context.getSystemService("power");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            powerManager = (android.os.PowerManager) systemService;
        }
        if ((i & 8) != 0) {
            java.lang.Object systemService2 = context.getSystemService("audio");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
            audioManager = (android.media.AudioManager) systemService2;
        }
    }

    /* compiled from: AndroidPlatform.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/platform/AndroidPlatform$Companion;", "", "()V", "PREF_KEY_SDK_INSTALL_TIME", "", "TAG", "getCarrierName", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "getCarrierName$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getCarrierName$vungle_ads_release(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            java.lang.Object systemService = context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return ((android.telephony.TelephonyManager) systemService).getNetworkOperatorName();
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isBatterySaverEnabled() {
        return this.powerManager.isPowerSaveMode();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    /* renamed from: isSideLoaded, reason: from getter */
    public boolean getIsSideLoaded() {
        return this.isSideLoaded;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public float getVolumeLevel() {
        try {
            return sanitizeVolume(this.audioManager.getStreamVolume(3) / this.audioManager.getStreamMaxVolume(3));
        } catch (java.lang.Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSoundEnabled() {
        try {
            return this.audioManager.getStreamVolume(3) > 0;
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public java.lang.String getCarrierName() {
        java.lang.String carrierName$vungle_ads_release = INSTANCE.getCarrierName$vungle_ads_release(this.context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(carrierName$vungle_ads_release, "getCarrierName(context)");
        return carrierName$vungle_ads_release;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSdCardPresent() {
        try {
            return kotlin.jvm.internal.Intrinsics.areEqual(android.os.Environment.getExternalStorageState(), "mounted");
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Acquiring external storage state failed", e);
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public void getUserAgentLazy(final androidx.core.util.Consumer<java.lang.String> consumer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.uaExecutor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.platform.AndroidPlatform$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.platform.AndroidPlatform.m10452getUserAgentLazy$lambda0(com.vungle.ads.internal.platform.AndroidPlatform.this, consumer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getUserAgentLazy$lambda-0, reason: not valid java name */
    public static final void m10452getUserAgentLazy$lambda0(com.vungle.ads.internal.platform.AndroidPlatform this$0, androidx.core.util.Consumer consumer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumer, "$consumer");
        com.vungle.ads.internal.platform.WebViewUtil.INSTANCE.getUserAgent(this$0.context, consumer);
    }

    private final float sanitizeVolume(float value) {
        if (java.lang.Float.isNaN(value) || java.lang.Float.isInfinite(value) || value < 0.0f) {
            return 0.0f;
        }
        if (value > 1.0f) {
            return 1.0f;
        }
        return value;
    }

    private final com.vungle.ads.internal.model.AdvertisingInfo getAmazonAdvertisingInfo() {
        com.vungle.ads.internal.model.AdvertisingInfo advertisingInfo = new com.vungle.ads.internal.model.AdvertisingInfo();
        try {
            android.content.ContentResolver contentResolver = this.context.getContentResolver();
            boolean z = true;
            if (android.provider.Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                z = false;
            }
            advertisingInfo.setLimitAdTracking(z);
            advertisingInfo.setAdvertisingId(android.provider.Settings.Secure.getString(contentResolver, "advertising_id"));
        } catch (android.provider.Settings.SettingNotFoundException e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error getting Amazon advertising info: Setting not found.", e);
        } catch (java.lang.Exception e2) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error getting Amazon advertising info", e2);
        }
        return advertisingInfo;
    }

    private final com.vungle.ads.internal.model.AdvertisingInfo getGoogleAdvertisingInfo() {
        com.vungle.ads.internal.model.AdvertisingInfo advertisingInfo = new com.vungle.ads.internal.model.AdvertisingInfo();
        try {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(this.context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(context)");
            advertisingInfo.setAdvertisingId(advertisingIdInfo.getId());
            advertisingInfo.setLimitAdTracking(advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Play services Not available: " + e.getLocalizedMessage());
        } catch (java.lang.Exception e2) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error getting Google advertising info: " + e2.getLocalizedMessage());
        } catch (java.lang.NoClassDefFoundError e3) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Play services Not available: " + e3.getLocalizedMessage());
            advertisingInfo.setAdvertisingId(android.provider.Settings.Secure.getString(this.context.getContentResolver(), "advertising_id"));
        }
        return advertisingInfo;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public com.vungle.ads.internal.model.AdvertisingInfo getAdvertisingInfo() {
        com.vungle.ads.internal.model.AdvertisingInfo googleAdvertisingInfo;
        java.lang.String advertisingId;
        com.vungle.ads.internal.model.AdvertisingInfo advertisingInfo = this.advertisingInfo;
        if (advertisingInfo != null && (advertisingId = advertisingInfo.getAdvertisingId()) != null && advertisingId.length() != 0) {
            return advertisingInfo;
        }
        if (kotlin.text.StringsKt.equals(android.os.Build.MANUFACTURER, "Amazon", true)) {
            googleAdvertisingInfo = getAmazonAdvertisingInfo();
        } else {
            googleAdvertisingInfo = getGoogleAdvertisingInfo();
        }
        this.advertisingInfo = googleAdvertisingInfo;
        return googleAdvertisingInfo;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public java.lang.String getAppSetId() {
        return this.appSetId;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public java.lang.Integer getAppSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getOSInstallationTime() {
        java.lang.Object m10798constructorimpl;
        android.content.pm.PackageInfo packageInfo;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.vungle.ads.internal.platform.AndroidPlatform androidPlatform = this;
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                packageInfo = this.context.getPackageManager().getPackageInfo("android", android.content.pm.PackageManager.PackageInfoFlags.of(0L));
            } else {
                packageInfo = this.context.getPackageManager().getPackageInfo("android", 0);
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(java.lang.Long.valueOf(packageInfo.firstInstallTime));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl != null) {
            if (m10801exceptionOrNullimpl instanceof android.content.pm.PackageManager.NameNotFoundException) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error getting OS installation time: " + ((android.content.pm.PackageManager.NameNotFoundException) m10801exceptionOrNullimpl).getLocalizedMessage());
            }
            m10798constructorimpl = -1L;
        }
        return ((java.lang.Number) m10798constructorimpl).longValue();
    }

    /* renamed from: getSDKInstallationTime$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.persistence.FilePreferences m10451getSDKInstallationTime$lambda4(kotlin.Lazy<com.vungle.ads.internal.persistence.FilePreferences> lazy) {
        return lazy.getValue();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getSDKInstallationTime() {
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context = this.context;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.persistence.FilePreferences>() { // from class: com.vungle.ads.internal.platform.AndroidPlatform$getSDKInstallationTime$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.persistence.FilePreferences invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.persistence.FilePreferences.class);
            }
        });
        java.lang.Long l = this.sdkInstallationTime;
        if (l != null) {
            return l.longValue();
        }
        long j = m10451getSDKInstallationTime$lambda4(lazy).getLong(PREF_KEY_SDK_INSTALL_TIME, 0L);
        if (j == 0) {
            j = java.lang.System.currentTimeMillis();
            m10451getSDKInstallationTime$lambda4(lazy).put(PREF_KEY_SDK_INSTALL_TIME, j).apply();
        }
        this.sdkInstallationTime = java.lang.Long.valueOf(j);
        return j;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getLastBootTime() {
        return java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getBuildTime() {
        return android.os.Build.TIME;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (kotlin.text.StringsKt.contains((java.lang.CharSequence) r1, (java.lang.CharSequence) com.adjust.sdk.Constants.REFERRER_API_SAMSUNG, true) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0 == null) goto L6;
     */
    @Override // com.vungle.ads.internal.platform.Platform
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isProblematicMaliDevice() {
        java.lang.String str;
        boolean z;
        java.lang.String str2 = android.os.Build.HARDWARE;
        if (str2 != null) {
            str = str2.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str = "";
        java.lang.String str3 = str;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, (java.lang.CharSequence) "exynos", false, 2, (java.lang.Object) null)) {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                java.lang.String SOC_MANUFACTURER = android.os.Build.SOC_MANUFACTURER;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(SOC_MANUFACTURER, "SOC_MANUFACTURER");
            }
            z = true;
            boolean z2 = !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, (java.lang.CharSequence) "mali", false, 2, (java.lang.Object) null) || z;
            int i = android.os.Build.VERSION.SDK_INT;
            return z2 && (29 > i && i < 34);
        }
        z = false;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, (java.lang.CharSequence) "mali", false, 2, (java.lang.Object) null)) {
        }
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (z2) {
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public java.lang.String getGPVersion() {
        android.content.pm.PackageInfo packageInfo;
        java.lang.String str = this.gpVersion;
        if (str != null) {
            return str;
        }
        try {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                packageInfo = this.context.getPackageManager().getPackageInfo("com.android.vending", android.content.pm.PackageManager.PackageInfoFlags.of(0L));
            } else {
                packageInfo = this.context.getPackageManager().getPackageInfo("com.android.vending", 0);
            }
            java.lang.String str2 = packageInfo.versionName;
            this.gpVersion = str2;
            return str2;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void updateAppSetID() {
        java.lang.String str = this.appSetId;
        if (str == null || str.length() == 0) {
            try {
                com.google.android.gms.appset.AppSetIdClient client = com.google.android.gms.appset.AppSet.getClient(this.context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(client, "getClient(context)");
                com.google.android.gms.tasks.Task<com.google.android.gms.appset.AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "client.appSetIdInfo");
                appSetIdInfo.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.vungle.ads.internal.platform.AndroidPlatform$$ExternalSyntheticLambda1
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(java.lang.Object obj) {
                        com.vungle.ads.internal.platform.AndroidPlatform.m10453updateAppSetID$lambda8(com.vungle.ads.internal.platform.AndroidPlatform.this, (com.google.android.gms.appset.AppSetIdInfo) obj);
                    }
                });
            } catch (java.lang.Exception e) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error getting AppSetID: " + e.getLocalizedMessage());
            } catch (java.lang.NoClassDefFoundError e2) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Required libs to get AppSetID Not available: " + e2.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateAppSetID$lambda-8, reason: not valid java name */
    public static final void m10453updateAppSetID$lambda8(com.vungle.ads.internal.platform.AndroidPlatform this$0, com.google.android.gms.appset.AppSetIdInfo appSetIdInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (appSetIdInfo != null) {
            this$0.appSetId = appSetIdInfo.getId();
            this$0.appSetIdScope = java.lang.Integer.valueOf(appSetIdInfo.getScope());
        }
    }

    public void setUserAgent(java.lang.String str) {
        this.userAgent = str;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public java.lang.String getUserAgent() {
        java.lang.String str = this.userAgent;
        return str == null ? java.lang.System.getProperty("http.agent") : str;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSilentModeEnabled() {
        try {
            if (this.audioManager.getRingerMode() != 0) {
                if (this.audioManager.getRingerMode() != 1) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
