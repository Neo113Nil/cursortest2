package com.facebook.login;

/* compiled from: DeviceLoginManager.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0012H\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/facebook/login/DeviceLoginManager;", "Lcom/facebook/login/LoginManager;", "()V", "deviceAuthTargetUserId", "", "getDeviceAuthTargetUserId", "()Ljava/lang/String;", "setDeviceAuthTargetUserId", "(Ljava/lang/String;)V", "deviceRedirectUri", "Landroid/net/Uri;", "getDeviceRedirectUri", "()Landroid/net/Uri;", "setDeviceRedirectUri", "(Landroid/net/Uri;)V", "createLoginRequest", "Lcom/facebook/login/LoginClient$Request;", "permissions", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceLoginManager extends com.facebook.login.LoginManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.login.DeviceLoginManager.Companion INSTANCE = new com.facebook.login.DeviceLoginManager.Companion(null);
    private static final kotlin.Lazy<com.facebook.login.DeviceLoginManager> instance$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.facebook.login.DeviceLoginManager>() { // from class: com.facebook.login.DeviceLoginManager$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final com.facebook.login.DeviceLoginManager invoke() {
            return new com.facebook.login.DeviceLoginManager();
        }
    });
    private java.lang.String deviceAuthTargetUserId;
    private android.net.Uri deviceRedirectUri;

    public static final /* synthetic */ kotlin.Lazy access$getInstance$delegate$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.login.DeviceLoginManager.class)) {
            return null;
        }
        try {
            return instance$delegate;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.login.DeviceLoginManager.class);
            return null;
        }
    }

    public final android.net.Uri getDeviceRedirectUri() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.deviceRedirectUri;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void setDeviceRedirectUri(android.net.Uri uri) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.deviceRedirectUri = uri;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final java.lang.String getDeviceAuthTargetUserId() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.deviceAuthTargetUserId;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void setDeviceAuthTargetUserId(java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.deviceAuthTargetUserId = str;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @Override // com.facebook.login.LoginManager
    protected com.facebook.login.LoginClient.Request createLoginRequest(java.util.Collection<java.lang.String> permissions) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            com.facebook.login.LoginClient.Request createLoginRequest = super.createLoginRequest(permissions);
            android.net.Uri uri = this.deviceRedirectUri;
            if (uri != null) {
                createLoginRequest.setDeviceRedirectUriString(uri.toString());
            }
            java.lang.String str = this.deviceAuthTargetUserId;
            if (str != null) {
                createLoginRequest.setDeviceAuthTargetUserId(str);
            }
            return createLoginRequest;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: DeviceLoginManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/facebook/login/DeviceLoginManager$Companion;", "", "()V", com.ironsource.C3232q2.p, "Lcom/facebook/login/DeviceLoginManager;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "()Lcom/facebook/login/DeviceLoginManager;", "instance$delegate", "Lkotlin/Lazy;", "facebook-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.facebook.login.DeviceLoginManager.Companion.class), com.ironsource.C3232q2.p, "getInstance()Lcom/facebook/login/DeviceLoginManager;"))};

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.facebook.login.DeviceLoginManager getInstance() {
            return (com.facebook.login.DeviceLoginManager) com.facebook.login.DeviceLoginManager.access$getInstance$delegate$cp().getValue();
        }
    }
}
