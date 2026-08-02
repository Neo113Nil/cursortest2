package com.izettle.android.auth.tasks;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\"&\u0010\u0003\u001a\u00020\u0002\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0000*\u00028\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/izettle/android/auth/tasks/AbstractAuthTask;", "T", "", "isLoginTask", "(Lcom/izettle/android/auth/tasks/AbstractAuthTask;)Z"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthTaskKt {
    public static final <T extends com.izettle.android.auth.tasks.AbstractAuthTask<?>> boolean isLoginTask(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        return (t instanceof com.izettle.android.auth.tasks.OAuthLoginTask) || (t instanceof com.izettle.android.auth.tasks.TokenLoginTask) || (t instanceof com.izettle.android.auth.tasks.CredentialsLoginTask);
    }
}
