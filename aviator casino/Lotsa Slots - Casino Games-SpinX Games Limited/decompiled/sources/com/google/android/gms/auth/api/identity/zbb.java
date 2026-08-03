package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes3.dex */
public final class zbb {
    private java.lang.String zba;

    private zbb() {
    }

    /* synthetic */ zbb(com.google.android.gms.auth.api.identity.zba zbaVar) {
    }

    public static final com.google.android.gms.auth.api.identity.zbb zbc(com.google.android.gms.auth.api.identity.zbc zbcVar) {
        java.lang.String zbb = zbcVar.zbb();
        com.google.android.gms.auth.api.identity.zbb zbbVar = new com.google.android.gms.auth.api.identity.zbb();
        if (zbb != null) {
            zbbVar.zba = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zbb);
        }
        return zbbVar;
    }

    public final com.google.android.gms.auth.api.identity.zbb zba(java.lang.String str) {
        this.zba = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        return this;
    }

    public final com.google.android.gms.auth.api.identity.zbc zbb() {
        return new com.google.android.gms.auth.api.identity.zbc(this.zba);
    }
}
