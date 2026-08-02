package androidx.biometric.auth;

/* loaded from: classes5.dex */
public abstract class AuthPromptCallback {
    public void onAuthenticationError(androidx.fragment.app.FragmentActivity fragmentActivity, int i, java.lang.CharSequence charSequence) {
    }

    public void onAuthenticationFailed(androidx.fragment.app.FragmentActivity fragmentActivity) {
    }

    public void onAuthenticationSucceeded(androidx.fragment.app.FragmentActivity fragmentActivity, androidx.biometric.BiometricPrompt.AuthenticationResult authenticationResult) {
    }
}
