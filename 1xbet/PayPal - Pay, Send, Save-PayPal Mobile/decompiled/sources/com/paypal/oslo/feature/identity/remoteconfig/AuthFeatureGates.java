package com.paypal.oslo.feature.identity.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u0018\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u001b\u0010\u001b\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001b\u0010\u001e\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u001b\u0010!\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001b\u0010$\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\bR\u001b\u0010'\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/remoteconfig/AuthFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "nativePasskeyLoginEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getNativePasskeyLoginEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "nativePasskeyLoginEnabled", "nativePasskeyCreationEnabled$delegate", "getNativePasskeyCreationEnabled", "nativePasskeyCreationEnabled", "nativePasskeyDeletionEnabled$delegate", "getNativePasskeyDeletionEnabled", "nativePasskeyDeletionEnabled", "nativeBiometricBindEnabled$delegate", "getNativeBiometricBindEnabled", "nativeBiometricBindEnabled", "nativeLlsBindEnabled$delegate", "getNativeLlsBindEnabled", "nativeLlsBindEnabled", "nativeBiometricLoginEnabled$delegate", "getNativeBiometricLoginEnabled", "nativeBiometricLoginEnabled", "nativeLlsLoginEnabled$delegate", "getNativeLlsLoginEnabled", "nativeLlsLoginEnabled", "nativeInContextLoginEnabled$delegate", "getNativeInContextLoginEnabled", "nativeInContextLoginEnabled", "checkEmailSupportEnabled$delegate", "getCheckEmailSupportEnabled", "checkEmailSupportEnabled", "googleSignUpEnabled$delegate", "getGoogleSignUpEnabled", "googleSignUpEnabled", "nativeSavePublicCredentialOnFailedLogin$delegate", "getNativeSavePublicCredentialOnFailedLogin", "nativeSavePublicCredentialOnFailedLogin"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuthFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.class, "nativePasskeyLoginEnabled", "getNativePasskeyLoginEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.class, "nativePasskeyCreationEnabled", "getNativePasskeyCreationEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.class, "nativePasskeyDeletionEnabled", "getNativePasskeyDeletionEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.class, "nativeBiometricBindEnabled", "getNativeBiometricBindEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.class, "nativeLlsBindEnabled", "getNativeLlsBindEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.class, "nativeBiometricLoginEnabled", "getNativeBiometricLoginEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.class, "nativeLlsLoginEnabled", "getNativeLlsLoginEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.class, "nativeInContextLoginEnabled", "getNativeInContextLoginEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.class, "checkEmailSupportEnabled", "getCheckEmailSupportEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.class, "googleSignUpEnabled", "getGoogleSignUpEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.class, "nativeSavePublicCredentialOnFailedLogin", "getNativeSavePublicCredentialOnFailedLogin()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
    public static final com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates INSTANCE;

    /* renamed from: checkEmailSupportEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty checkEmailSupportEnabled;

    /* renamed from: googleSignUpEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty googleSignUpEnabled;

    /* renamed from: nativeBiometricBindEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty nativeBiometricBindEnabled;

    /* renamed from: nativeBiometricLoginEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty nativeBiometricLoginEnabled;

    /* renamed from: nativeInContextLoginEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty nativeInContextLoginEnabled;

    /* renamed from: nativeLlsBindEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty nativeLlsBindEnabled;

    /* renamed from: nativeLlsLoginEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty nativeLlsLoginEnabled;

    /* renamed from: nativePasskeyCreationEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty nativePasskeyCreationEnabled;

    /* renamed from: nativePasskeyDeletionEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty nativePasskeyDeletionEnabled;

    /* renamed from: nativePasskeyLoginEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty nativePasskeyLoginEnabled;

    /* renamed from: nativeSavePublicCredentialOnFailedLogin$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty nativeSavePublicCredentialOnFailedLogin;

    private AuthFeatureGates() {
        super("identity");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getNativePasskeyLoginEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) nativePasskeyLoginEnabled.getValue(this, Camera2StreamConfigurationMap[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getNativePasskeyCreationEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) nativePasskeyCreationEnabled.getValue(this, Camera2StreamConfigurationMap[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getNativePasskeyDeletionEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) nativePasskeyDeletionEnabled.getValue(this, Camera2StreamConfigurationMap[2]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getNativeBiometricBindEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) nativeBiometricBindEnabled.getValue(this, Camera2StreamConfigurationMap[3]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getNativeLlsBindEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) nativeLlsBindEnabled.getValue(this, Camera2StreamConfigurationMap[4]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getNativeBiometricLoginEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) nativeBiometricLoginEnabled.getValue(this, Camera2StreamConfigurationMap[5]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getNativeLlsLoginEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) nativeLlsLoginEnabled.getValue(this, Camera2StreamConfigurationMap[6]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getNativeInContextLoginEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) nativeInContextLoginEnabled.getValue(this, Camera2StreamConfigurationMap[7]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getCheckEmailSupportEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) checkEmailSupportEnabled.getValue(this, Camera2StreamConfigurationMap[8]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getGoogleSignUpEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) googleSignUpEnabled.getValue(this, Camera2StreamConfigurationMap[9]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getNativeSavePublicCredentialOnFailedLogin() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) nativeSavePublicCredentialOnFailedLogin.getValue(this, Camera2StreamConfigurationMap[10]);
    }

    static {
        com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates authFeatureGates = new com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates();
        INSTANCE = authFeatureGates;
        nativePasskeyLoginEnabled = authFeatureGates.create("native_passkey_login_enabled");
        nativePasskeyCreationEnabled = authFeatureGates.create("native_passkey_creation_enabled");
        nativePasskeyDeletionEnabled = authFeatureGates.create("native_passkey_deletion_enabled");
        nativeBiometricBindEnabled = authFeatureGates.create("native_biometric_bind_enabled");
        nativeLlsBindEnabled = authFeatureGates.create("native_lls_bind_enabled");
        nativeBiometricLoginEnabled = authFeatureGates.create("native_biometric_login_enabled");
        nativeLlsLoginEnabled = authFeatureGates.create("native_lls_login_enabled");
        nativeInContextLoginEnabled = authFeatureGates.create("native_incontext_login_enabled");
        checkEmailSupportEnabled = authFeatureGates.create("native_check_email_support_enabled");
        googleSignUpEnabled = authFeatureGates.create("native_google_signup_enabled");
        nativeSavePublicCredentialOnFailedLogin = authFeatureGates.create("native_save_public_credential_on_failed_login");
        $stable = 8;
    }
}
