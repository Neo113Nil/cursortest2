package com.izettle.android.auth.tasks;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/izettle/android/auth/OAuthBrowserLoginSpec;", "Lcom/izettle/android/auth/OAuthUriType;", "getAuthUriType", "(Lcom/izettle/android/auth/OAuthBrowserLoginSpec;)Lcom/izettle/android/auth/OAuthUriType;", "authUriType"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthTasksKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final com.izettle.android.auth.OAuthUriType getAuthUriType(com.izettle.android.auth.OAuthBrowserLoginSpec oAuthBrowserLoginSpec) {
        boolean isSignUp = oAuthBrowserLoginSpec.getIsSignUp();
        if (isSignUp) {
            return com.izettle.android.auth.OAuthUriType.SIGNUP;
        }
        if (isSignUp) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.izettle.android.auth.OAuthUriType.LOGIN;
    }
}
