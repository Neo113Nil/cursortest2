package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
final class zbbh extends com.google.android.gms.internal.p000authapi.zbbf {
    private final com.google.android.gms.internal.p000authapi.zbbj zba;

    zbbh(com.google.android.gms.internal.p000authapi.zbbj zbbjVar, int i) {
        super(zbbjVar.size(), i);
        this.zba = zbbjVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    protected final java.lang.Object zba(int i) {
        return this.zba.get(i);
    }
}
