package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
final class zbbi extends com.google.android.gms.internal.p000authapi.zbbj {
    final transient int zba;
    final transient int zbb;
    final /* synthetic */ com.google.android.gms.internal.p000authapi.zbbj zbc;

    zbbi(com.google.android.gms.internal.p000authapi.zbbj zbbjVar, int i, int i2) {
        java.util.Objects.requireNonNull(zbbjVar);
        this.zbc = zbbjVar;
        this.zba = i;
        this.zbb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.p000authapi.zbbd.zba(i, this.zbb, "index");
        return this.zbc.get(i + this.zba);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbj, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    final boolean zbf() {
        return true;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbj
    /* renamed from: zbh */
    public final com.google.android.gms.internal.p000authapi.zbbj subList(int i, int i2) {
        com.google.android.gms.internal.p000authapi.zbbd.zbc(i, i2, this.zbb);
        int i3 = this.zba;
        return this.zbc.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    final int zbd() {
        return this.zbc.zbc() + this.zba + this.zbb;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    final int zbc() {
        return this.zbc.zbc() + this.zba;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbg
    final java.lang.Object[] zbb() {
        return this.zbc.zbb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }
}
