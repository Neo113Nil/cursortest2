package com.paypal.oslo.feature.identity.biometriclogin.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptFactoryImpl;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptFactory;", "<init>", "()V", "Landroidx/fragment/app/FragmentActivity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", com.sun.jna.Callback.METHOD_NAME, "Landroidx/biometric/BiometricPrompt;", "create", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/concurrent/Executor;Landroidx/biometric/BiometricPrompt$AuthenticationCallback;)Landroidx/biometric/BiometricPrompt;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BiometricPromptFactoryImpl implements com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactory {
    public static final int $stable = 0;

    @javax.inject.Inject
    public BiometricPromptFactoryImpl() {
    }

    @Override // com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptFactory
    public final androidx.biometric.BiometricPrompt create(androidx.fragment.app.FragmentActivity activity, java.util.concurrent.Executor executor, androidx.biometric.BiometricPrompt.AuthenticationCallback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        return new androidx.biometric.BiometricPrompt(activity, executor, callback);
    }
}
