package com.google.android.gms.auth.api;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class zbc {
    protected java.lang.Boolean zba;
    protected java.lang.String zbb;

    public zbc() {
        this.zba = false;
    }

    public zbc(com.google.android.gms.auth.api.zbd zbdVar) {
        this.zba = false;
        this.zba = java.lang.Boolean.valueOf(zbdVar.zbb());
        this.zbb = zbdVar.zbc();
    }

    public final com.google.android.gms.auth.api.zbc zba(java.lang.String str) {
        this.zbb = str;
        return this;
    }
}
