package com.google.firebase.auth;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public abstract class OAuthCredential extends AuthCredential {
    @Nullable
    public abstract String getAccessToken();

    @Nullable
    public abstract String getIdToken();

    @Nullable
    public abstract String getSecret();
}
