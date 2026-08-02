package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzcb extends com.google.android.gms.internal.fido.zzcc {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.fido.zzcc zzc;

    zzcb(com.google.android.gms.internal.fido.zzcc zzccVar, int i, int i2) {
        this.zzc = zzccVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.fido.zzbm.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzcc
    /* renamed from: zzg */
    public final com.google.android.gms.internal.fido.zzcc subList(int i, int i2) {
        com.google.android.gms.internal.fido.zzbm.zze(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.fido.zzby
    @javax.annotation.CheckForNull
    final java.lang.Object[] zze() {
        return this.zzc.zze();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }
}
