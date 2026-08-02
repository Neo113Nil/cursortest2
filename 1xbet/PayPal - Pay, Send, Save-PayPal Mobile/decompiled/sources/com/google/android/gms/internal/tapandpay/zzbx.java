package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzbx extends com.google.android.gms.internal.tapandpay.zzby {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.tapandpay.zzby zzc;

    zzbx(com.google.android.gms.internal.tapandpay.zzby zzbyVar, int i, int i2) {
        this.zzc = zzbyVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.tapandpay.zzbr.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzby, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzby
    /* renamed from: zzf */
    public final com.google.android.gms.internal.tapandpay.zzby subList(int i, int i2) {
        com.google.android.gms.internal.tapandpay.zzbr.zzc(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbv
    final java.lang.Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }
}
