package com.google.android.gms.auth.api.identity;

/* loaded from: classes8.dex */
public final class Identity {
    public static com.google.android.gms.auth.api.identity.AuthorizationClient getAuthorizationClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p000authapi.zbad((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(activity), new com.google.android.gms.auth.api.identity.zba(null));
    }

    public static com.google.android.gms.auth.api.identity.CredentialSavingClient getCredentialSavingClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p000authapi.zbaj((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(activity), new com.google.android.gms.auth.api.identity.zbi());
    }

    public static com.google.android.gms.auth.api.identity.SignInClient getSignInClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p000authapi.zbat((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(activity), new com.google.android.gms.auth.api.identity.zbv());
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationClient getAuthorizationClient(android.content.Context context) {
        return new com.google.android.gms.internal.p000authapi.zbad((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context), new com.google.android.gms.auth.api.identity.zba(null));
    }

    public static com.google.android.gms.auth.api.identity.CredentialSavingClient getCredentialSavingClient(android.content.Context context) {
        return new com.google.android.gms.internal.p000authapi.zbaj((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context), new com.google.android.gms.auth.api.identity.zbi());
    }

    public static com.google.android.gms.auth.api.identity.SignInClient getSignInClient(android.content.Context context) {
        return new com.google.android.gms.internal.p000authapi.zbat((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context), new com.google.android.gms.auth.api.identity.zbv());
    }

    private Identity() {
    }
}
