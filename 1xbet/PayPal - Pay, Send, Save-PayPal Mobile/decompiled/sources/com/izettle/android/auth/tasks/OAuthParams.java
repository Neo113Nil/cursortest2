package com.izettle.android.auth.tasks;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/izettle/android/auth/tasks/OAuthParams;", "", "", "code", "Lcom/izettle/android/auth/tasks/OAuthState;", "state", "<init>", "(Ljava/lang/String;Lcom/izettle/android/auth/tasks/OAuthState;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Lcom/izettle/android/auth/tasks/OAuthState;", "getState", "()Lcom/izettle/android/auth/tasks/OAuthState;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthParams {
    private final java.lang.String code;
    private final com.izettle.android.auth.tasks.OAuthState state;

    public OAuthParams(java.lang.String str, com.izettle.android.auth.tasks.OAuthState oAuthState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthState, "");
        this.code = str;
        this.state = oAuthState;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final com.izettle.android.auth.tasks.OAuthState getState() {
        return this.state;
    }
}
