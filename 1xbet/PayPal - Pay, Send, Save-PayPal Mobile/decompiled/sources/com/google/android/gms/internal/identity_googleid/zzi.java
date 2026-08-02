package com.google.android.gms.internal.identity_googleid;

/* loaded from: classes8.dex */
final class zzi extends com.google.android.gms.internal.identity_googleid.zzj {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.identity_googleid.zzj zzc;

    zzi(com.google.android.gms.internal.identity_googleid.zzj zzjVar, int i, int i2) {
        java.util.Objects.requireNonNull(zzjVar);
        this.zzc = zzjVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.identity_googleid.zza.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzj, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzj
    /* renamed from: zzf */
    public final com.google.android.gms.internal.identity_googleid.zzj subList(int i, int i2) {
        com.google.android.gms.internal.identity_googleid.zza.zzc(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    final java.lang.Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.identity_googleid.zzf
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }
}
