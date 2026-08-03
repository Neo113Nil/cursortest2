package com.google.android.gms.auth.api;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public final class zbc {
    protected java.lang.Boolean zba;
    protected java.lang.String zbb;

    public zbc() {
        this.zba = false;
    }

    public final com.google.android.gms.auth.api.zbc zba(java.lang.String str) {
        this.zbb = str;
        return this;
    }

    public zbc(com.google.android.gms.auth.api.zbd zbdVar) {
        boolean z;
        java.lang.String str;
        this.zba = false;
        com.google.android.gms.auth.api.zbd.zbb(zbdVar);
        z = zbdVar.zbc;
        this.zba = java.lang.Boolean.valueOf(z);
        str = zbdVar.zbd;
        this.zbb = str;
    }
}
