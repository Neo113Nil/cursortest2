package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public interface Authenticator {
    java.lang.String getAuthToken() throws com.android.volley.AuthFailureError;

    void invalidateAuthToken(java.lang.String str);
}
