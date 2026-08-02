package com.google.android.gms.internal.common;

/* loaded from: classes4.dex */
final class zzag extends com.google.android.gms.internal.common.zzah {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.common.zzah zzc;

    zzag(com.google.android.gms.internal.common.zzah zzahVar, int i, int i2) {
        java.util.Objects.requireNonNull(zzahVar);
        this.zzc = zzahVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.common.zzr.zzb(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzah
    /* renamed from: zzi */
    public final com.google.android.gms.internal.common.zzah subList(int i, int i2) {
        com.google.android.gms.internal.common.zzr.zzd(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.common.zzac
    final java.lang.Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }
}
