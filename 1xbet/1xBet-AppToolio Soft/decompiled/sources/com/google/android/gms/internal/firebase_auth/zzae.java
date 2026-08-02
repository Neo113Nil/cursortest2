package com.google.android.gms.internal.firebase_auth;

/* loaded from: classes.dex */
public enum zzae {
    REFRESH_TOKEN("refresh_token"),
    AUTHORIZATION_CODE("authorization_code");

    private final String value;

    zzae(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
