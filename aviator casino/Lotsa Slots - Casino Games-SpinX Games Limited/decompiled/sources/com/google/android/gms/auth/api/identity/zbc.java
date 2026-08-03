package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes3.dex */
public final class zbc implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    private final java.lang.String zba;

    public zbc(java.lang.String str) {
        this.zba = str;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj instanceof com.google.android.gms.auth.api.identity.zbc;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(com.google.android.gms.auth.api.identity.zbc.class);
    }

    public final android.os.Bundle zba() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("session_id", this.zba);
        return bundle;
    }

    public final java.lang.String zbb() {
        return this.zba;
    }
}
