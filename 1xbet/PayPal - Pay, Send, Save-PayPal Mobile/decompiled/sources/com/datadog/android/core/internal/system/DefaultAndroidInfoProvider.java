package com.datadog.android.core.internal.system;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rR\u001b\u0010\u0012\u001a\u00020\u00068WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00068WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001b\u0010\u001b\u001a\u00020\u00068WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001c\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u001a\u0010\u001f\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0011R\u001b\u0010#\u001a\u00020\u00068WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0011R\u001b\u0010(\u001a\u00020$8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010'R\u001d\u0010+\u001a\u0004\u0018\u00010)8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000f\u001a\u0004\b+\u0010,R!\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060-8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u000f\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u000f\u001a\u0004\b4\u00105R\u001d\u0010:\u001a\u0004\u0018\u0001028WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u000f\u001a\u0004\b8\u00109R\u001b\u0010=\u001a\u00020\u00068WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u000f\u001a\u0004\b<\u0010\u0011R\u001a\u0010>\u001a\u00020\u00068\u0017X\u0097D¢\u0006\f\n\u0004\b>\u0010\u001d\u001a\u0004\b?\u0010\u0011R\u001a\u0010@\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b@\u0010\u001d\u001a\u0004\bA\u0010\u0011R\u001b\u0010D\u001a\u00020\u00068WX\u0097\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u000f\u001a\u0004\bC\u0010\u0011R\u001d\u0010G\u001a\u0004\u0018\u0001028WX\u0097\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\u000f\u001a\u0004\bF\u00109"}, d2 = {"Lcom/datadog/android/core/internal/system/DefaultAndroidInfoProvider;", "Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "", "rawDeviceBrand", "rawDeviceModel", "rawDeviceId", "rawOsVersion", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "architecture$delegate", "Lkotlin/Lazy;", "getArchitecture", "()Ljava/lang/String;", "architecture", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "getHighSpeedVideoFpsRanges", "currentLocale$delegate", "getCurrentLocale", "currentLocale", "deviceBrand$delegate", "getDeviceBrand", "deviceBrand", "deviceBuildId", "Ljava/lang/String;", "getDeviceBuildId", "deviceModel", "getDeviceModel", "deviceName$delegate", "getDeviceName", "deviceName", "Lcom/datadog/android/api/context/DeviceType;", "deviceType$delegate", "getDeviceType", "()Lcom/datadog/android/api/context/DeviceType;", "deviceType", "", "isLowRam$delegate", "isLowRam", "()Ljava/lang/Boolean;", "", "locales$delegate", "getLocales", "()Ljava/util/List;", "locales", "", "logicalCpuCount$delegate", "getLogicalCpuCount", "()I", "logicalCpuCount", "numberOfDisplays$delegate", "getNumberOfDisplays", "()Ljava/lang/Integer;", "numberOfDisplays", "osMajorVersion$delegate", "getOsMajorVersion", "osMajorVersion", "osName", "getOsName", "osVersion", "getOsVersion", "timeZone$delegate", "getTimeZone", "timeZone", "totalRam$delegate", "getTotalRam", "totalRam", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultAndroidInfoProvider implements com.datadog.android.core.internal.system.AndroidInfoProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.Companion INSTANCE = new com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.Companion(null);
    public static final java.lang.String FEATURE_GOOGLE_ANDROID_TV = "com.google.android.tv";
    public static final long MB_IN_BYTES = 1048576;
    public static final int MIN_TABLET_WIDTH_DP = 800;

    /* renamed from: architecture$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy architecture;

    /* renamed from: currentLocale$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy currentLocale;

    /* renamed from: deviceBrand$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy deviceBrand;
    private final java.lang.String deviceBuildId;
    private final java.lang.String deviceModel;

    /* renamed from: deviceName$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy deviceName;

    /* renamed from: deviceType$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy deviceType;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighSpeedVideoFpsRanges;

    /* renamed from: isLowRam$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy isLowRam;

    /* renamed from: locales$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy locales;

    /* renamed from: logicalCpuCount$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy logicalCpuCount;

    /* renamed from: numberOfDisplays$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy numberOfDisplays;

    /* renamed from: osMajorVersion$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy osMajorVersion;
    private final java.lang.String osName;
    private final java.lang.String osVersion;

    /* renamed from: timeZone$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy timeZone;

    /* renamed from: totalRam$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy totalRam;

    public DefaultAndroidInfoProvider(final android.content.Context context, final java.lang.String str, final java.lang.String str2, java.lang.String str3, java.lang.String str4, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.getHighSpeedVideoFpsRanges = buildSdkVersionProvider;
        this.deviceType = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.datadog.android.api.context.DeviceType>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceType$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.api.context.DeviceType invoke() {
                return com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.Companion.access$resolveDeviceType(com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.INSTANCE, str2, context);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.deviceName = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceName$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                if (kotlin.text.StringsKt.isBlank(com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.this.getDeviceBrand())) {
                    return com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.this.getDeviceModel();
                }
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.this.getDeviceModel(), (java.lang.CharSequence) com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.this.getDeviceBrand(), false, 2, (java.lang.Object) null)) {
                    return com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.this.getDeviceModel();
                }
                java.lang.String deviceBrand = com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.this.getDeviceBrand();
                java.lang.String deviceModel = com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.this.getDeviceModel();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(deviceBrand);
                sb.append(" ");
                sb.append(deviceModel);
                return sb.toString();
            }

            {
                super(0);
            }
        });
        this.locales = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.util.List<java.lang.String>>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$locales$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.util.List<java.lang.String> invoke() {
                com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider2;
                java.lang.String languageTag;
                java.lang.String languageTag2;
                android.content.res.Resources resources = context.getResources();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                buildSdkVersionProvider2 = this.getHighSpeedVideoFpsRanges;
                if (buildSdkVersionProvider2.getIsAtLeastN()) {
                    android.os.LocaleList locales = resources.getConfiguration().getLocales();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locales, "");
                    int size = locales.size();
                    for (int i = 0; i < size; i++) {
                        java.util.Locale locale = locales.get(i);
                        if (locale != null && (languageTag2 = locale.toLanguageTag()) != null) {
                            arrayList.add(languageTag2);
                        }
                    }
                } else {
                    java.util.Locale locale2 = resources.getConfiguration().locale;
                    if (locale2 != null && (languageTag = locale2.toLanguageTag()) != null) {
                        arrayList.add(languageTag);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.currentLocale = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$currentLocale$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider2;
                java.lang.String languageTag;
                android.content.res.Resources resources = context.getResources();
                buildSdkVersionProvider2 = this.getHighSpeedVideoFpsRanges;
                if (buildSdkVersionProvider2.getIsAtLeastN()) {
                    java.util.Locale locale = resources.getConfiguration().getLocales().get(0);
                    if (locale != null) {
                        languageTag = locale.toLanguageTag();
                    }
                    languageTag = null;
                } else {
                    java.util.Locale locale2 = resources.getConfiguration().locale;
                    if (locale2 != null) {
                        languageTag = locale2.toLanguageTag();
                    }
                    languageTag = null;
                }
                return languageTag == null ? java.util.Locale.getDefault().toLanguageTag() : languageTag;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.timeZone = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$timeZone$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return java.util.TimeZone.getDefault().getID();
            }
        });
        this.deviceBrand = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$deviceBrand$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String valueOf;
                java.lang.String str5 = str;
                if (str5.length() <= 0) {
                    return str5;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                char charAt = str5.charAt(0);
                if (java.lang.Character.isLowerCase(charAt)) {
                    java.util.Locale locale = java.util.Locale.US;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                    valueOf = kotlin.text.CharsKt.titlecase(charAt, locale);
                } else {
                    valueOf = java.lang.String.valueOf(charAt);
                }
                sb.append((java.lang.Object) valueOf);
                java.lang.String substring = str5.substring(1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                sb.append(substring);
                return sb.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.deviceModel = str2;
        this.deviceBuildId = str3;
        this.osName = "Android";
        this.osVersion = str4;
        this.osMajorVersion = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$osMajorVersion$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return (java.lang.String) kotlin.collections.CollectionsKt.first(kotlin.text.StringsKt.split$default((java.lang.CharSequence) com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.this.getOsVersion(), new char[]{com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR}, false, 0, 6, (java.lang.Object) null));
            }

            {
                super(0);
            }
        });
        this.architecture = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$architecture$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String property = java.lang.System.getProperty("os.arch");
                return property == null ? "unknown" : property;
            }
        });
        this.numberOfDisplays = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.Integer>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$numberOfDisplays$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.Integer invoke() {
                java.lang.Object systemService = context.getSystemService(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                android.hardware.display.DisplayManager displayManager = systemService instanceof android.hardware.display.DisplayManager ? (android.hardware.display.DisplayManager) systemService : null;
                if (displayManager == null) {
                    return null;
                }
                android.view.Display[] displays = displayManager.getDisplays();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displays, "");
                int i = 0;
                for (android.view.Display display : displays) {
                    if (!kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Integer[]{1, 0}).contains(java.lang.Integer.valueOf(display.getState()))) {
                        i++;
                    }
                }
                return java.lang.Integer.valueOf(i);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.logicalCpuCount = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.Integer>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$logicalCpuCount$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Integer invoke() {
                return java.lang.Integer.valueOf(java.lang.Runtime.getRuntime().availableProcessors());
            }
        });
        this.totalRam = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.Integer>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$totalRam$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.Integer invoke() {
                try {
                    android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(android.app.ActivityManager.class);
                    android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    return java.lang.Integer.valueOf((int) (memoryInfo.totalMem / com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES));
                } catch (java.lang.Exception unused) {
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.isLowRam = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: com.datadog.android.core.internal.system.DefaultAndroidInfoProvider$isLowRam$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                try {
                    return java.lang.Boolean.valueOf(((android.app.ActivityManager) context.getSystemService(android.app.ActivityManager.class)).isLowRamDevice());
                } catch (java.lang.Exception unused) {
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public /* synthetic */ DefaultAndroidInfoProvider(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, str3, str4, (i & 32) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DefaultAndroidInfoProvider(android.content.Context context) {
        this(context, r4, r5, r6, r1 == null ? "" : r1, null, 32, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String str = android.os.Build.BRAND;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = android.os.Build.MODEL;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = android.os.Build.ID;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = android.os.Build.VERSION.RELEASE;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final com.datadog.android.api.context.DeviceType getDeviceType() {
        return (com.datadog.android.api.context.DeviceType) this.deviceType.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getDeviceName() {
        return (java.lang.String) this.deviceName.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.util.List<java.lang.String> getLocales() {
        return (java.util.List) this.locales.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getCurrentLocale() {
        java.lang.Object value = this.currentLocale.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        return (java.lang.String) value;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getTimeZone() {
        java.lang.Object value = this.timeZone.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        return (java.lang.String) value;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getDeviceBrand() {
        return (java.lang.String) this.deviceBrand.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getDeviceBuildId() {
        return this.deviceBuildId;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getOsName() {
        return this.osName;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getOsMajorVersion() {
        return (java.lang.String) this.osMajorVersion.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.String getArchitecture() {
        return (java.lang.String) this.architecture.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.Integer getNumberOfDisplays() {
        return (java.lang.Integer) this.numberOfDisplays.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final int getLogicalCpuCount() {
        return ((java.lang.Number) this.logicalCpuCount.getValue()).intValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public final java.lang.Integer getTotalRam() {
        return (java.lang.Integer) this.totalRam.getValue();
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    /* renamed from: isLowRam */
    public final java.lang.Boolean getIsLowRam() {
        return (java.lang.Boolean) this.isLowRam.getValue();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/core/internal/system/DefaultAndroidInfoProvider$Companion;", "", "<init>", "()V", "", "FEATURE_GOOGLE_ANDROID_TV", "Ljava/lang/String;", "", "MB_IN_BYTES", "J", "", "MIN_TABLET_WIDTH_DP", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ com.datadog.android.api.context.DeviceType access$resolveDeviceType(com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.Companion companion, java.lang.String str, android.content.Context context) {
            java.lang.Object systemService = context.getSystemService("uimode");
            android.app.UiModeManager uiModeManager = systemService instanceof android.app.UiModeManager ? (android.app.UiModeManager) systemService : null;
            if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "");
                if (!packageManager.hasSystemFeature("android.software.leanback") && !packageManager.hasSystemFeature(com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.FEATURE_GOOGLE_ANDROID_TV)) {
                    java.util.Locale locale = java.util.Locale.US;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String lowerCase = str.toLowerCase(locale);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    java.lang.String str2 = lowerCase;
                    boolean z = false;
                    if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "tablet", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "sm-t", false, 2, (java.lang.Object) null) || context.getResources().getConfiguration().smallestScreenWidthDp >= 800) {
                        return com.datadog.android.api.context.DeviceType.TABLET;
                    }
                    java.util.Locale locale2 = java.util.Locale.US;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
                    java.lang.String lowerCase2 = str.toLowerCase(locale2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) "phone", false, 2, (java.lang.Object) null)) {
                        java.lang.Object systemService2 = context.getSystemService("phone");
                        android.telephony.TelephonyManager telephonyManager = systemService2 instanceof android.telephony.TelephonyManager ? (android.telephony.TelephonyManager) systemService2 : null;
                        if (telephonyManager != null && telephonyManager.getPhoneType() == 0) {
                            z = true;
                        }
                        if (!(true ^ z)) {
                            return com.datadog.android.api.context.DeviceType.OTHER;
                        }
                    }
                    return com.datadog.android.api.context.DeviceType.MOBILE;
                }
            }
            return com.datadog.android.api.context.DeviceType.TV;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
