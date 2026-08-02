package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final class zzew extends com.google.android.gms.internal.identity.zzex {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.identity.zzex zzc;

    zzew(com.google.android.gms.internal.identity.zzex zzexVar, int i, int i2) {
        this.zzc = zzexVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.identity.zzer.zzc(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // com.google.android.gms.internal.identity.zzex, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.identity.zzex
    /* renamed from: zzh */
    public final com.google.android.gms.internal.identity.zzex subList(int i, int i2) {
        com.google.android.gms.internal.identity.zzer.zze(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.identity.zzeu
    @javax.annotation.CheckForNull
    final java.lang.Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }
}
