package com.paypal.oslo.feature.identity.biometriclogin.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptFactory;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", com.sun.jna.Callback.METHOD_NAME, "Landroidx/biometric/BiometricPrompt;", "create", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/concurrent/Executor;Landroidx/biometric/BiometricPrompt$AuthenticationCallback;)Landroidx/biometric/BiometricPrompt;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BiometricPromptFactory {
    androidx.biometric.BiometricPrompt create(androidx.fragment.app.FragmentActivity activity, java.util.concurrent.Executor executor, androidx.biometric.BiometricPrompt.AuthenticationCallback callback);
}
