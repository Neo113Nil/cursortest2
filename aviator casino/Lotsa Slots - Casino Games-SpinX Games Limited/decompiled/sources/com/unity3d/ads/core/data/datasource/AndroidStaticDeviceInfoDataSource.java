package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 n2\u00020\u0001:\u0001nB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001f\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\u0006\u0010\u001e\u001a\u00020\u0010J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0010H\u0016J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0010H\u0002J\u0013\u0010%\u001a\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\u0010J\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010)\u001a\u00020\u0010J\b\u0010*\u001a\u0004\u0018\u00010\u0010J\b\u0010+\u001a\u0004\u0018\u00010\u0010J\b\u0010,\u001a\u00020#H\u0002J\b\u0010-\u001a\u00020\u0010H\u0002J\b\u0010.\u001a\u00020\u0010H\u0003J\u0006\u0010/\u001a\u00020\u0010J\u0006\u00100\u001a\u00020\u0010J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020 H\u0002J\u0012\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\u0010H\u0002J\u0013\u00109\u001a\u0004\u0018\u00010\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010&J\b\u0010:\u001a\u00020\u0010H\u0002J\u0006\u0010;\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020\u0010J\u0011\u0010=\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\b\u0010>\u001a\u00020\u0010H\u0003J\b\u0010?\u001a\u00020\u0010H\u0016J\u0010\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020\u0010H\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100EH\u0003J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019H\u0002J\b\u0010G\u001a\u00020\u0010H\u0002J\b\u0010H\u001a\u00020\u0010H\u0016J\b\u0010I\u001a\u00020 H\u0002J\b\u0010J\u001a\u00020\u0010H\u0002J\u0006\u0010K\u001a\u00020\u0010J\b\u0010L\u001a\u00020 H\u0002J\b\u0010M\u001a\u00020 H\u0002J\b\u0010N\u001a\u00020 H\u0002J\b\u0010O\u001a\u00020 H\u0002J\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0019J\b\u0010R\u001a\u00020\u0010H\u0002J\u001e\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019H\u0002J\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019J\b\u0010U\u001a\u00020#H\u0016J\u0006\u0010V\u001a\u00020#J\u0010\u0010W\u001a\u00020#2\b\u0010X\u001a\u0004\u0018\u000105J\u0013\u0010Y\u001a\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\b\u0010Z\u001a\u00020 H\u0002J\b\u0010[\u001a\u00020\u0010H\u0002J\b\u0010\\\u001a\u00020\u0010H\u0002J\u0006\u0010]\u001a\u00020^J\u0006\u0010_\u001a\u00020^J\b\u0010`\u001a\u00020^H\u0002J\u001a\u0010a\u001a\u00020^2\u0006\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010e\u001a\u00020^2\u0006\u0010b\u001a\u00020cH\u0003J\u0006\u0010f\u001a\u00020^J\b\u0010g\u001a\u00020^H\u0002J\u001a\u0010h\u001a\u00020^2\u0006\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010i\u001a\u00020^2\u0006\u0010b\u001a\u00020cH\u0003J\b\u0010j\u001a\u00020^H\u0002J\u0010\u0010k\u001a\u00020^2\u0006\u0010l\u001a\u00020\u0010H\u0002J\u0018\u0010m\u001a\b\u0012\u0004\u0012\u00020c0\u00192\b\u0010d\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006o"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidStaticDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "context", "Landroid/content/Context;", "glInfoStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "analyticsDataSource", "Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;", "storeDataSource", "Lcom/unity3d/ads/core/data/datasource/StoreDataSource;", "unityBootConfigDataSource", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;Lcom/unity3d/ads/core/data/datasource/StoreDataSource;Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;)V", "DEBUG_CERT", "Ljavax/security/auth/x500/X500Principal;", "analyticsUserId", "", "getAnalyticsUserId", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "staticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", com.google.firebase.remoteconfig.RemoteConfigComponent.FETCH_FILE_NAME, "additionalStores", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndroidStaticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "fetchCached", "getAdvertisingTrackingId", "getApiLevel", "", "getAppName", "getAppStartTime", "", "getAppVersion", "getAuid", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBoard", "getBootloader", "getBrand", "getBuildId", "getBuildVersionIncremental", "getCPUCount", "getCPUModel", "getCertificateFingerprint", "getDevice", "getDisplay", "getDisplayMetricDensity", "", "getExtensionVersion", "getFileForStorageType", "Ljava/io/File;", "storageType", "Lcom/unity3d/ads/core/data/model/StorageType;", "getFingerprint", "getGPUModel", "getGameId", "getHardware", "getHost", "getIdfi", "getInstallerPackageName", "getManufacturer", "getMemoryInfo", "infoType", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "getModel", "getNewAbiList", "Ljava/util/ArrayList;", "getOldAbiList", "getOpenAdvertisingTrackingId", "getOsVersion", "getPhoneType", "getPlatform", "getProduct", "getScreenDensity", "getScreenHeight", "getScreenLayout", "getScreenWidth", "getSensorList", "Landroid/hardware/Sensor;", "getSimOperator", "getStores", "getSupportedAbis", "getSystemBootTime", "getTotalMemory", "getTotalSpace", "file", "getUnityBuildGuid", "getVersionCode", "getVersionName", "getWebViewUserAgent", "hasX264Decoder", "", "hasX265Decoder", "isAppDebuggable", "isHardwareAccelerated", "codecInfo", "Landroid/media/MediaCodecInfo;", "mimeType", "isHardwareAcceleratedV29", "isLimitOpenAdTrackingEnabled", "isRooted", "isSoftwareOnly", "isSoftwareOnlyV29", "isTestMode", "searchPathForBinary", "binary", "selectAllDecodeCodecs", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidStaticDeviceInfoDataSource implements com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource {
    public static final java.lang.String ALGORITHM_SHA1 = "SHA-1";
    public static final java.lang.String APP_VERSION_FAKE = "FakeVersionName";
    public static final java.lang.String BINARY_SU = "su";
    public static final java.lang.String CERTIFICATE_TYPE_X509 = "X.509";
    public static final java.lang.String ENVIRONMENT_VARIABLE_PATH = "PATH";
    public static final java.lang.String PLATFORM_ANDROID = "android";
    public static final java.lang.String STORE_GOOGLE = "google";
    private final javax.security.auth.x500.X500Principal DEBUG_CERT;
    private final com.unity3d.ads.core.data.datasource.AnalyticsDataSource analyticsDataSource;
    private final android.content.Context context;
    private final com.unity3d.ads.core.data.datasource.ByteStringDataSource glInfoStore;
    private gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;
    private final com.unity3d.ads.core.data.datasource.StoreDataSource storeDataSource;
    private final com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource unityBootConfigDataSource;

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.unity3d.services.core.device.Device.MemoryInfoType.values().length];
            try {
                iArr[com.unity3d.services.core.device.Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.services.core.device.Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.unity3d.ads.core.data.model.StorageType.values().length];
            try {
                iArr2[com.unity3d.ads.core.data.model.StorageType.INTERNAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.unity3d.ads.core.data.model.StorageType.EXTERNAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final int getVersionCode() {
        return 41605;
    }

    public AndroidStaticDeviceInfoDataSource(android.content.Context context, com.unity3d.ads.core.data.datasource.ByteStringDataSource glInfoStore, com.unity3d.ads.core.data.datasource.AnalyticsDataSource analyticsDataSource, com.unity3d.ads.core.data.datasource.StoreDataSource storeDataSource, com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource unityBootConfigDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(glInfoStore, "glInfoStore");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsDataSource, "analyticsDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeDataSource, "storeDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unityBootConfigDataSource, "unityBootConfigDataSource");
        this.context = context;
        this.glInfoStore = glInfoStore;
        this.analyticsDataSource = analyticsDataSource;
        this.storeDataSource = storeDataSource;
        this.unityBootConfigDataSource = unityBootConfigDataSource;
        this.DEBUG_CERT = new javax.security.auth.x500.X500Principal("CN=Android Debug,O=Android,C=US");
        gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion companion = gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder = gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setBundleId(getAppName());
        _create.setBundleVersion(getAppVersion());
        _create.setAppDebuggable(isAppDebuggable());
        _create.setRooted(isRooted());
        _create.setOsVersion(getOsVersion());
        _create.setDeviceMake(getManufacturer());
        _create.setDeviceModel(getModel());
        _create.setWebviewUa(getWebViewUserAgent());
        _create.setScreenDensity(getScreenDensity());
        _create.setScreenWidth(getScreenWidth());
        _create.setScreenHeight(getScreenHeight());
        _create.setScreenSize(getScreenLayout());
        _create.addAllStores(_create.getStores(), getStores$default(this, null, 1, null));
        _create.setTotalDiskSpace(getTotalSpace(getFileForStorageType(com.unity3d.ads.core.data.model.StorageType.EXTERNAL)));
        _create.setTotalRamMemory(getTotalMemory());
        _create.setCpuModel(getCPUModel());
        _create.setCpuCount(getCPUCount());
        _create.setAndroid(fetchAndroidStaticDeviceInfo());
        _create.setMadeWithUnity(com.unity3d.services.core.properties.MadeWithUnityDetector.isMadeWithUnity());
        this.staticDeviceInfo = _create._build();
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object fetch(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo> continuation) {
        com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 androidStaticDeviceInfoDataSource$fetch$1;
        int i;
        com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource;
        java.lang.String str;
        if (continuation instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1) {
            androidStaticDeviceInfoDataSource$fetch$1 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1) continuation;
            if ((androidStaticDeviceInfoDataSource$fetch$1.label & Integer.MIN_VALUE) != 0) {
                androidStaticDeviceInfoDataSource$fetch$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidStaticDeviceInfoDataSource$fetch$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidStaticDeviceInfoDataSource$fetch$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String gpuModel = this.staticDeviceInfo.getGpuModel();
                    if (gpuModel != null && gpuModel.length() != 0) {
                        return this.staticDeviceInfo;
                    }
                    androidStaticDeviceInfoDataSource$fetch$1.L$0 = this;
                    androidStaticDeviceInfoDataSource$fetch$1.L$1 = list;
                    androidStaticDeviceInfoDataSource$fetch$1.label = 1;
                    obj = getGPUModel(androidStaticDeviceInfoDataSource$fetch$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidStaticDeviceInfoDataSource = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (java.util.List) androidStaticDeviceInfoDataSource$fetch$1.L$1;
                    androidStaticDeviceInfoDataSource = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource) androidStaticDeviceInfoDataSource$fetch$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str2 = (java.lang.String) obj;
                str = str2;
                if (str != null || str.length() == 0) {
                    return androidStaticDeviceInfoDataSource.staticDeviceInfo;
                }
                gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = androidStaticDeviceInfoDataSource.staticDeviceInfo;
                gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion companion = gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.INSTANCE;
                gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder = staticDeviceInfo.toBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
                gatewayprotocol.v1.StaticDeviceInfoKt.Dsl _create = companion._create(builder);
                _create.setGpuModel(str2);
                _create.clearStores(_create.getStores());
                _create.addAllStores(_create.getStores(), androidStaticDeviceInfoDataSource.getStores(list));
                gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo _build = _create._build();
                androidStaticDeviceInfoDataSource.staticDeviceInfo = _build;
                return _build;
            }
        }
        androidStaticDeviceInfoDataSource$fetch$1 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1(this, continuation);
        java.lang.Object obj2 = androidStaticDeviceInfoDataSource$fetch$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidStaticDeviceInfoDataSource$fetch$1.label;
        if (i != 0) {
        }
        java.lang.String str22 = (java.lang.String) obj2;
        str = str22;
        if (str != null) {
        }
        return androidStaticDeviceInfoDataSource.staticDeviceInfo;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    /* renamed from: fetchCached, reason: from getter */
    public gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
        return this.staticDeviceInfo;
    }

    private final gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android fetchAndroidStaticDeviceInfo() {
        gatewayprotocol.v1.StaticDeviceInfoKt staticDeviceInfoKt = gatewayprotocol.v1.StaticDeviceInfoKt.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder newBuilder = gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.StaticDeviceInfoKt.AndroidKt.Dsl _create = companion._create(newBuilder);
        _create.setApiLevel(getApiLevel());
        _create.setVersionCode(getVersionCode());
        _create.setAndroidFingerprint(getFingerprint());
        _create.setAppInstaller(getInstallerPackageName());
        _create.setApkDeveloperSigningCertificateHash(getCertificateFingerprint());
        _create.setBuildBoard(getBoard());
        _create.setBuildBrand(getBrand());
        _create.setBuildDevice(getDevice());
        _create.setBuildDisplay(getDisplay());
        _create.setBuildFingerprint(getFingerprint());
        _create.setBuildHardware(getHardware());
        _create.setBuildHost(getHost());
        _create.setBuildBootloader(getBootloader());
        _create.setBuildProduct(getProduct());
        _create.setExtensionVersion(getExtensionVersion());
        java.lang.String buildId = getBuildId();
        if (buildId != null) {
            _create.setBuildId(buildId);
        }
        _create.setPhoneType(getPhoneType());
        _create.setSimOperator(getSimOperator());
        return _create._build();
    }

    private final int getApiLevel() {
        return android.os.Build.VERSION.SDK_INT;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.String getOsVersion() {
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.String getManufacturer() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.String getModel() {
        java.lang.String str = android.os.Build.MODEL;
        return str == null ? "" : str;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    public final java.lang.String getAdvertisingTrackingId() {
        java.lang.String advertisingTrackingId = com.unity3d.services.core.device.AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    private final java.lang.String getOpenAdvertisingTrackingId() {
        java.lang.String openAdvertisingTrackingId = com.unity3d.services.core.device.OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return com.unity3d.services.core.device.OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.Object getIdfi(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        java.lang.String string = com.unity3d.services.core.preferences.AndroidPreferences.getString("unityads-installinfo", com.unity3d.services.UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = null;
        }
        if (string != null) {
            return string;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        com.unity3d.services.core.preferences.AndroidPreferences.setString("unityads-installinfo", com.unity3d.services.UnityAdsConstants.Preferences.PREF_KEY_IDFI, uuid);
        return uuid;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getSystemBootTime() {
        return (java.lang.System.currentTimeMillis() - android.os.SystemClock.elapsedRealtime()) / 1000;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.Object getAuid(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        java.lang.String string = com.unity3d.services.core.preferences.AndroidPreferences.getString("supersonic_shared_preferen", "auid");
        if (string == null) {
            return null;
        }
        return string;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.Object getUnityBuildGuid(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return this.unityBootConfigDataSource.getValue("build-guid");
    }

    private final float getDisplayMetricDensity() {
        android.util.DisplayMetrics displayMetrics;
        android.content.res.Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0.0f;
        }
        return displayMetrics.density;
    }

    private final int getScreenDensity() {
        android.util.DisplayMetrics displayMetrics;
        android.content.res.Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.densityDpi;
    }

    private final int getScreenWidth() {
        android.util.DisplayMetrics displayMetrics;
        android.content.res.Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final int getScreenHeight() {
        android.util.DisplayMetrics displayMetrics;
        android.content.res.Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final boolean isRooted() {
        try {
            return searchPathForBinary("su");
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Rooted check failed", e);
            return false;
        }
    }

    private final boolean searchPathForBinary(java.lang.String binary) {
        java.util.List emptyList;
        java.lang.String[] strArr;
        java.io.File[] listFiles;
        java.lang.String str = java.lang.System.getenv(ENVIRONMENT_VARIABLE_PATH);
        if (str != null) {
            java.util.List<java.lang.String> split = new kotlin.text.Regex(":").split(str, 0);
            if (split != null) {
                if (!split.isEmpty()) {
                    java.util.ListIterator<java.lang.String> listIterator = split.listIterator(split.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            emptyList = kotlin.collections.CollectionsKt.take(split, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                emptyList = kotlin.collections.CollectionsKt.emptyList();
                if (emptyList != null && (strArr = (java.lang.String[]) emptyList.toArray(new java.lang.String[0])) != null) {
                    for (java.lang.String str2 : strArr) {
                        java.io.File file = new java.io.File(str2);
                        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                            for (java.io.File file2 : listFiles) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(file2.getName(), binary)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @kotlin.Deprecated(message = "This constant was deprecated in API level 28. Use GET_SIGNING_CERTIFICATES instead")
    private final java.lang.String getCertificateFingerprint() {
        try {
            android.content.pm.Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr == null) {
                return "";
            }
            if (!(signatureArr.length == 0)) {
                java.security.cert.Certificate generateCertificate = java.security.cert.CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new java.io.ByteArrayInputStream(signatureArr[0].toByteArray()));
                kotlin.jvm.internal.Intrinsics.checkNotNull(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                java.lang.String hexString = com.unity3d.services.core.misc.Utilities.toHexString(java.security.MessageDigest.getInstance(ALGORITHM_SHA1).digest(((java.security.cert.X509Certificate) generateCertificate).getEncoded()));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(publicKey)");
                return hexString;
            }
            return "";
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Exception when signing certificate fingerprint", e);
            return "";
        }
    }

    public final java.lang.String getBoard() {
        java.lang.String str = android.os.Build.BOARD;
        return str == null ? "" : str;
    }

    public final java.lang.String getBootloader() {
        java.lang.String str = android.os.Build.BOOTLOADER;
        return str == null ? "" : str;
    }

    public final java.lang.String getBrand() {
        java.lang.String str = android.os.Build.BRAND;
        return str == null ? "" : str;
    }

    public final java.lang.String getDisplay() {
        java.lang.String str = android.os.Build.DISPLAY;
        return str == null ? "" : str;
    }

    public final java.lang.String getDevice() {
        java.lang.String str = android.os.Build.DEVICE;
        return str == null ? "" : str;
    }

    public final java.lang.String getHardware() {
        java.lang.String str = android.os.Build.HARDWARE;
        return str == null ? "" : str;
    }

    public final java.lang.String getHost() {
        java.lang.String str = android.os.Build.HOST;
        return str == null ? "" : str;
    }

    public final java.lang.String getProduct() {
        java.lang.String str = android.os.Build.PRODUCT;
        return str == null ? "" : str;
    }

    private final java.lang.String getFingerprint() {
        java.lang.String str = android.os.Build.FINGERPRINT;
        return str == null ? "" : str;
    }

    @kotlin.Deprecated(message = "This method was deprecated in API level 30. use getInstallSourceInfo")
    private final java.lang.String getInstallerPackageName() {
        java.lang.String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public final java.util.List<java.lang.String> getSupportedAbis() {
        if (getApiLevel() < 21) {
            return getOldAbiList();
        }
        return getNewAbiList();
    }

    public final java.util.List<android.hardware.Sensor> getSensorList() {
        java.lang.Object systemService = this.context.getSystemService("sensor");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        java.util.List<android.hardware.Sensor> sensorList = ((android.hardware.SensorManager) systemService).getSensorList(-1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sensorList, "sensorManager.getSensorList(Sensor.TYPE_ALL)");
        return sensorList;
    }

    private final java.lang.String getCPUModel() {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            java.lang.String str = android.os.Build.SOC_MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "{\n            Build.SOC_MODEL\n        }");
            return str;
        }
        try {
            return (java.lang.String) kotlin.collections.CollectionsKt.last(kotlin.io.FilesKt.readLines$default(new java.io.File("/proc/cpuinfo"), null, 1, null));
        } catch (java.io.FileNotFoundException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error reading CPU model", e);
            return "";
        }
    }

    private final long getCPUCount() {
        return java.lang.Runtime.getRuntime().availableProcessors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getGPUModel(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 androidStaticDeviceInfoDataSource$getGPUModel$1;
        int i;
        if (continuation instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1) {
            androidStaticDeviceInfoDataSource$getGPUModel$1 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1) continuation;
            if ((androidStaticDeviceInfoDataSource$getGPUModel$1.label & Integer.MIN_VALUE) != 0) {
                androidStaticDeviceInfoDataSource$getGPUModel$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidStaticDeviceInfoDataSource$getGPUModel$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidStaticDeviceInfoDataSource$getGPUModel$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.ads.core.data.datasource.ByteStringDataSource byteStringDataSource = this.glInfoStore;
                    androidStaticDeviceInfoDataSource$getGPUModel$1.label = 1;
                    obj = byteStringDataSource.get(androidStaticDeviceInfoDataSource$getGPUModel$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj).getData().toString(kotlin.text.Charsets.UTF_8);
            }
        }
        androidStaticDeviceInfoDataSource$getGPUModel$1 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1(this, continuation);
        java.lang.Object obj2 = androidStaticDeviceInfoDataSource$getGPUModel$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidStaticDeviceInfoDataSource$getGPUModel$1.label;
        if (i != 0) {
        }
        return ((com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) obj2).getData().toString(kotlin.text.Charsets.UTF_8);
    }

    public final java.lang.String getBuildId() {
        return android.os.Build.ID;
    }

    public final java.lang.String getBuildVersionIncremental() {
        return android.os.Build.VERSION.INCREMENTAL;
    }

    private final java.util.List<java.lang.String> getOldAbiList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String CPU_ABI = android.os.Build.CPU_ABI;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(CPU_ABI, "CPU_ABI");
        arrayList.add(CPU_ABI);
        java.lang.String CPU_ABI2 = android.os.Build.CPU_ABI2;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(CPU_ABI2, "CPU_ABI2");
        arrayList.add(CPU_ABI2);
        return arrayList;
    }

    private final java.util.ArrayList<java.lang.String> getNewAbiList() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.lang.String[] SUPPORTED_ABIS = android.os.Build.SUPPORTED_ABIS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        arrayList.addAll(kotlin.collections.CollectionsKt.listOf(java.util.Arrays.copyOf(SUPPORTED_ABIS, SUPPORTED_ABIS.length)));
        return arrayList;
    }

    private final java.lang.String getWebViewUserAgent() {
        try {
            java.lang.String defaultUserAgent = android.webkit.WebSettings.getDefaultUserAgent(this.context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultUserAgent, "{\n        WebSettings.ge…tUserAgent(context)\n    }");
            return defaultUserAgent;
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("Exception getting webview user agent", e);
            return "";
        }
    }

    private final java.util.List<java.lang.String> getStores(java.util.List<java.lang.String> additionalStores) {
        return this.storeDataSource.fetchStores(additionalStores);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.util.List getStores$default(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return androidStaticDeviceInfoDataSource.getStores(list);
    }

    private final long getAppStartTime() {
        return com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch();
    }

    private final java.lang.String getVersionName() {
        return "4.16.5";
    }

    private final boolean isTestMode() {
        return com.unity3d.services.core.properties.SdkProperties.isTestMode();
    }

    private final java.lang.String getPlatform() {
        return "android";
    }

    private final java.lang.String getGameId() {
        java.lang.String gameId = com.unity3d.services.core.properties.ClientProperties.getGameId();
        return gameId == null ? "" : gameId;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType.TOTAL_MEMORY);
    }

    private final long getMemoryInfo(com.unity3d.services.core.device.Device.MemoryInfoType infoType) {
        java.lang.String str;
        java.io.FileNotFoundException e;
        java.io.RandomAccessFile randomAccessFile;
        java.lang.Throwable th;
        int i = com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        try {
            try {
                randomAccessFile = new java.io.RandomAccessFile(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            } catch (java.io.FileNotFoundException e2) {
                e = e2;
                com.unity3d.services.core.log.DeviceLog.exception("Error reading memory info", e);
                return com.unity3d.ads.core.utils.GetMemoryValueFromStringKt.getMemoryValueFromString(str);
            }
        } catch (java.io.FileNotFoundException e3) {
            str = null;
            e = e3;
            com.unity3d.services.core.log.DeviceLog.exception("Error reading memory info", e);
            return com.unity3d.ads.core.utils.GetMemoryValueFromStringKt.getMemoryValueFromString(str);
        }
        try {
            java.io.RandomAccessFile randomAccessFile2 = randomAccessFile;
            str = null;
            for (int i3 = 0; i3 < i2; i3++) {
                try {
                    str = randomAccessFile2.readLine();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th3) {
                        kotlin.io.CloseableKt.closeFinally(randomAccessFile, th);
                        throw th3;
                    }
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(randomAccessFile, null);
            return com.unity3d.ads.core.utils.GetMemoryValueFromStringKt.getMemoryValueFromString(str);
        } catch (java.lang.Throwable th4) {
            str = null;
            th = th4;
        }
    }

    public final long getTotalSpace(java.io.File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return kotlin.math.MathKt.roundToInt(file.getTotalSpace() / 1024);
    }

    private final java.io.File getFileForStorageType(com.unity3d.ads.core.data.model.StorageType storageType) {
        int i = com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.WhenMappings.$EnumSwitchMapping$1[storageType.ordinal()];
        if (i == 1) {
            return this.context.getCacheDir();
        }
        if (i == 2) {
            return this.context.getExternalCacheDir();
        }
        com.unity3d.services.core.log.DeviceLog.error("Unhandled storagetype: " + storageType);
        return null;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public java.lang.String getAppName() {
        java.lang.String packageName = this.context.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return packageName;
    }

    private final java.lang.String getAppVersion() {
        java.lang.String str;
        java.lang.String packageName = this.context.getPackageName();
        android.content.pm.PackageManager packageManager = this.context.getPackageManager();
        try {
            if (packageManager.getPackageInfo(packageName, 0).versionName == null) {
                str = APP_VERSION_FAKE;
            } else {
                str = packageManager.getPackageInfo(packageName, 0).versionName;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "{\n            if (pm.get…e\n            }\n        }");
            return str;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error getting package info", e);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean isAppDebuggable() {
        boolean z;
        android.content.pm.ApplicationInfo applicationInfo;
        android.content.pm.PackageManager packageManager = this.context.getPackageManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        java.lang.String packageName = this.context.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        boolean z2 = true;
        try {
            applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(pkgName, 0)");
            applicationInfo.flags &= 2;
            z2 = false;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Could not find name", e);
        }
        if (applicationInfo.flags != 0) {
            z = true;
            if (z2) {
                try {
                    android.content.pm.Signature[] signatures = packageManager.getPackageInfo(packageName, 64).signatures;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
                    for (android.content.pm.Signature signature : signatures) {
                        java.security.cert.Certificate generateCertificate = java.security.cert.CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new java.io.ByteArrayInputStream(signature.toByteArray()));
                        kotlin.jvm.internal.Intrinsics.checkNotNull(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        z = kotlin.jvm.internal.Intrinsics.areEqual(((java.security.cert.X509Certificate) generateCertificate).getSubjectX500Principal(), this.DEBUG_CERT);
                        if (z) {
                            break;
                        }
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                    com.unity3d.services.core.log.DeviceLog.exception("Could not find name", e2);
                } catch (java.security.cert.CertificateException e3) {
                    com.unity3d.services.core.log.DeviceLog.exception("Certificate exception", e3);
                }
            }
            return z;
        }
        z = false;
        if (z2) {
        }
        return z;
    }

    private final int getExtensionVersion() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return android.os.ext.SdkExtensions.getExtensionVersion(30);
        }
        return -1;
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs("video/avc").isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs("video/hevc").isEmpty();
    }

    private final java.util.List<android.media.MediaCodecInfo> selectAllDecodeCodecs(java.lang.String mimeType) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            android.media.MediaCodecInfo codecInfo = android.media.MediaCodecList.getCodecInfoAt(i);
            if (!codecInfo.isEncoder()) {
                for (java.lang.String str : codecInfo.getSupportedTypes()) {
                    if (kotlin.text.StringsKt.equals(str, mimeType, true)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(codecInfo, "codecInfo");
                        if (isHardwareAccelerated(codecInfo, mimeType)) {
                            arrayList.add(codecInfo);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final boolean isHardwareAccelerated(android.media.MediaCodecInfo codecInfo, java.lang.String mimeType) {
        if (getApiLevel() >= 29) {
            return isHardwareAcceleratedV29(codecInfo);
        }
        return !isSoftwareOnly(codecInfo, mimeType);
    }

    private final boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo codecInfo) {
        return codecInfo.isHardwareAccelerated();
    }

    private final boolean isSoftwareOnly(android.media.MediaCodecInfo codecInfo, java.lang.String mimeType) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(codecInfo);
        }
        java.lang.String name = codecInfo.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "codecInfo.name");
        java.util.Locale ROOT = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        java.lang.String lowerCase = name.toLowerCase(ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (kotlin.text.StringsKt.startsWith$default(lowerCase, "arc.", false, 2, (java.lang.Object) null)) {
            return false;
        }
        return kotlin.text.StringsKt.startsWith$default(lowerCase, "omx.google.", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(lowerCase, "omx.ffmpeg.", false, 2, (java.lang.Object) null) || (kotlin.text.StringsKt.startsWith$default(lowerCase, "omx.sec.", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase, (java.lang.CharSequence) ".sw.", false, 2, (java.lang.Object) null)) || kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "omx.qcom.video.decoder.hevcswvdec") || kotlin.text.StringsKt.startsWith$default(lowerCase, "c2.android.", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(lowerCase, "c2.google.", false, 2, (java.lang.Object) null) || !(kotlin.text.StringsKt.startsWith$default(lowerCase, "omx.", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(lowerCase, "c2.", false, 2, (java.lang.Object) null));
    }

    private final boolean isSoftwareOnlyV29(android.media.MediaCodecInfo codecInfo) {
        return codecInfo.isSoftwareOnly();
    }

    private final int getPhoneType() {
        java.lang.Object systemService = this.context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((android.telephony.TelephonyManager) systemService).getPhoneType();
    }

    private final java.lang.String getSimOperator() {
        java.lang.Object systemService = this.context.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        java.lang.String simOperator = ((android.telephony.TelephonyManager) systemService).getSimOperator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simOperator, "telephonyManager.simOperator");
        return simOperator;
    }
}
