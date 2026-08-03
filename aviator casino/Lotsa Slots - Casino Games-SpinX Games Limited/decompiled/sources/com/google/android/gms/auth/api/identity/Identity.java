package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes3.dex */
public final class Identity {
    private Identity() {
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationClient getAuthorizationClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p000authapi.zbaa((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(activity), new com.google.android.gms.auth.api.identity.zbb(null).zbb());
    }

    public static com.google.android.gms.auth.api.identity.CredentialSavingClient getCredentialSavingClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p000authapi.zbag((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(activity), new com.google.android.gms.auth.api.identity.zbh());
    }

    public static com.google.android.gms.auth.api.identity.SignInClient getSignInClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.p000authapi.zbaq((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(activity), new com.google.android.gms.auth.api.identity.zbu());
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationClient getAuthorizationClient(android.content.Context context) {
        return new com.google.android.gms.internal.p000authapi.zbaa((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context), new com.google.android.gms.auth.api.identity.zbb(null).zbb());
    }

    public static com.google.android.gms.auth.api.identity.CredentialSavingClient getCredentialSavingClient(android.content.Context context) {
        return new com.google.android.gms.internal.p000authapi.zbag((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context), new com.google.android.gms.auth.api.identity.zbh());
    }

    public static com.google.android.gms.auth.api.identity.SignInClient getSignInClient(android.content.Context context) {
        return new com.google.android.gms.internal.p000authapi.zbaq((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context), new com.google.android.gms.auth.api.identity.zbu());
    }
}
