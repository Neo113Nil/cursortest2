package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzfwg extends zzfwh {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfwh zzc;

    public zzfwg(zzfwh zzfwhVar, int i7, int i8) {
        this.zzc = zzfwhVar;
        this.zza = i7;
        this.zzb = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzfth.zza(i7, this.zzb, "index");
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfwh, java.util.List
    /* JADX INFO: renamed from: zzh */
    public final zzfwh subList(int i7, int i8) {
        zzfth.zzk(i7, i8, this.zzb);
        int i9 = this.zza;
        return this.zzc.subList(i7 + i9, i8 + i9);
    }
}
