package com.google.android.gms.internal.ads;

import I2.C0309q;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class zzdwl extends zzbuf {
    final /* synthetic */ zzdwn zza;

    public zzdwl(zzdwn zzdwnVar) {
        this.zza = zzdwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        zzbzf zzbzfVar = this.zza.zza;
        zzbbVar.getClass();
        zzbzfVar.zzd(new C0309q(zzbbVar.f10839a, zzbbVar.f10840b));
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdwn zzdwnVar = this.zza;
        zzdwnVar.zza.zzc(new zzdxd(autoCloseInputStream, zzdwnVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbuo zzbuoVar) {
        this.zza.zza.zzc(new zzdxd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbuoVar));
    }
}
