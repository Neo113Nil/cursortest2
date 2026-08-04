package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbxw extends zzaxn implements zzbxy {
    public zzbxw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final p105o3.a zze(p105o3.a aVar, p105o3.a aVar2, String str, p105o3.a aVar3) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzf(parcelZza, aVar2);
        parcelZza.writeString(str);
        zzaxp.zzf(parcelZza, aVar3);
        return p150v0.a.h(zzcZ(11, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzf(p105o3.a aVar, zzbyc zzbycVar, zzbxv zzbxvVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzaxp.zzd(parcelZza, zzbycVar);
        zzaxp.zzf(parcelZza, zzbxvVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzg(zzbtg zzbtgVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzh(List list, p105o3.a aVar, zzbtd zzbtdVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzi(List list, p105o3.a aVar, zzbtd zzbtdVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzj(p105o3.a aVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, aVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzk(p105o3.a aVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzl(List list, p105o3.a aVar, zzbtd zzbtdVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzm(List list, p105o3.a aVar, zzbtd zzbtdVar) {
        throw null;
    }
}
