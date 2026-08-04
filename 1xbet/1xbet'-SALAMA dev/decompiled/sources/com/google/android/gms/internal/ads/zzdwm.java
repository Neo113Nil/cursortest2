package com.google.android.gms.internal.ads;

import I2.C0309q;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class zzdwm extends zzbuf {
    private final zzbzf zza;
    private final zzbuo zzb;

    public zzdwm(zzbzf zzbzfVar, zzbuo zzbuoVar) {
        this.zza = zzbzfVar;
        this.zzb = zzbuoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        zzbzf zzbzfVar = this.zza;
        zzbbVar.getClass();
        zzbzfVar.zzd(new C0309q(zzbbVar.f10839a, zzbbVar.f10840b));
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzdxd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbuo zzbuoVar) {
        this.zza.zzc(new zzdxd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbuoVar));
    }
}
