package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u001f\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0011\u0010\"\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010$\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b#\u0010\u0010R\u001b\u0010(\u001a\u00020\b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0010R\u001b\u0010+\u001a\u00020\b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010\u0010R\u001a\u0010,\u001a\u00020\b8\u0007X\u0087D¢\u0006\f\n\u0004\b,\u0010\u0013\u001a\u0004\b-\u0010\u0010R\u0011\u0010/\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b.\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b0\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101"}, d2 = {"Lcom/izettle/android/auth/ClientDataProvider;", "", "Landroid/content/Context;", "context", "Ljava/util/Locale;", "appLocale", "Lcom/izettle/android/auth/repository/SessionRepository;", "sessionRepository", "", "oAuthCallbackUrl", "appName", "Lcom/izettle/android/auth/BackendEnvironment;", "backendEnvironment", "<init>", "(Landroid/content/Context;Ljava/util/Locale;Lcom/izettle/android/auth/repository/SessionRepository;Ljava/lang/String;Ljava/lang/String;Lcom/izettle/android/auth/BackendEnvironment;)V", "getAppLanguage", "()Ljava/lang/String;", "appLanguage", "Ljava/util/Locale;", "Ljava/lang/String;", "getAppName", "appVersion", "getAppVersion", "Lcom/izettle/android/auth/BackendEnvironment;", "getBackendEnvironment", "()Lcom/izettle/android/auth/BackendEnvironment;", "getClientId", "clientId", "Lcom/izettle/android/auth/dto/ClientInfo;", "getClientInfo", "()Lcom/izettle/android/auth/dto/ClientInfo;", "clientInfo", "Landroid/content/Context;", "getDeviceId", "deviceId", "getDeviceIdiom", "deviceIdiom", "deviceModel$delegate", "Lkotlin/Lazy;", "getDeviceModel", "deviceModel", "deviceName$delegate", "getDeviceName", "deviceName", "devicePlatform", "getDevicePlatform", "getLocale", "locale", "getOAuthCallbackUrl", "Lcom/izettle/android/auth/repository/SessionRepository;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClientDataProvider {
    public static final java.lang.String ANDROID_PLATFORM_ID = "ANDROID";
    private final java.util.Locale appLocale;
    private final java.lang.String appName;
    private final java.lang.String appVersion;
    private final com.izettle.android.auth.BackendEnvironment backendEnvironment;
    private final android.content.Context context;

    /* renamed from: deviceModel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy deviceModel;

    /* renamed from: deviceName$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy deviceName;
    private final java.lang.String devicePlatform;
    private final java.lang.String oAuthCallbackUrl;
    private final com.izettle.android.auth.repository.SessionRepository sessionRepository;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x004a, code lost:
    
        if (r2 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClientDataProvider(android.content.Context context, java.util.Locale locale, com.izettle.android.auth.repository.SessionRepository sessionRepository, java.lang.String str, java.lang.String str2, com.izettle.android.auth.BackendEnvironment backendEnvironment) {
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backendEnvironment, "");
        this.context = context;
        this.appLocale = locale;
        this.sessionRepository = sessionRepository;
        this.oAuthCallbackUrl = str;
        this.appName = str2;
        this.backendEnvironment = backendEnvironment;
        this.deviceName = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.izettle.android.auth.ClientDataProvider$deviceName$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (android.os.Build.PRODUCT != null) {
                    sb.append(android.os.Build.PRODUCT);
                    sb.append(" ");
                }
                if (android.os.Build.DEVICE != null) {
                    sb.append(android.os.Build.DEVICE);
                }
                java.lang.String obj = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        });
        this.deviceModel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.izettle.android.auth.ClientDataProvider$deviceModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (android.os.Build.MODEL != null) {
                    sb.append(android.os.Build.MODEL);
                    sb.append(" ");
                }
                if (android.os.Build.BRAND != null) {
                    sb.append(android.os.Build.BRAND);
                }
                java.lang.String obj = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        });
        this.devicePlatform = "ANDROID";
        try {
            str3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (java.lang.Exception unused) {
        }
        str3 = androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN;
        this.appVersion = str3;
    }

    public final java.lang.String getOAuthCallbackUrl() {
        return this.oAuthCallbackUrl;
    }

    public final java.lang.String getAppName() {
        return this.appName;
    }

    public final com.izettle.android.auth.BackendEnvironment getBackendEnvironment() {
        return this.backendEnvironment;
    }

    public final java.lang.String getDeviceName() {
        return (java.lang.String) this.deviceName.getValue();
    }

    public final java.lang.String getDeviceModel() {
        return (java.lang.String) this.deviceModel.getValue();
    }

    public final java.lang.String getLocale() {
        java.lang.String obj = java.util.Locale.getDefault().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String getDevicePlatform() {
        return this.devicePlatform;
    }

    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    public final java.lang.String getAppLanguage() {
        java.lang.String obj = this.appLocale.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final java.lang.String getDeviceId() {
        return this.sessionRepository.getSessionId();
    }

    public final java.lang.String getDeviceIdiom() {
        if (this.context.getResources().getBoolean(com.izettle.android.auth.R.bool.auth_is_tablet)) {
            return "pad";
        }
        return "phone";
    }

    public final com.izettle.android.auth.dto.ClientInfo getClientInfo() {
        java.lang.String deviceName = getDeviceName();
        java.lang.String locale = getLocale();
        java.lang.String deviceModel = getDeviceModel();
        java.lang.String str = this.devicePlatform;
        java.lang.String deviceIdiom = getDeviceIdiom();
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.String appLanguage = getAppLanguage();
        return new com.izettle.android.auth.dto.ClientInfo(deviceName, deviceModel, str, locale, deviceIdiom, java.lang.String.valueOf(i), this.appVersion, appLanguage, getDeviceId());
    }

    public final java.lang.String getClientId() {
        return this.backendEnvironment.getClientId();
    }
}
