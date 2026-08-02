package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import o3.InterfaceC1506a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzbxw extends zzaxn implements zzbxy {
    public zzbxw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final InterfaceC1506a zze(InterfaceC1506a interfaceC1506a, InterfaceC1506a interfaceC1506a2, String str, InterfaceC1506a interfaceC1506a3) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzf(zza, interfaceC1506a2);
        zza.writeString(str);
        zzaxp.zzf(zza, interfaceC1506a3);
        return AbstractC1663a.h(zzcZ(11, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzf(InterfaceC1506a interfaceC1506a, zzbyc zzbycVar, zzbxv zzbxvVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzbycVar);
        zzaxp.zzf(zza, zzbxvVar);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzg(zzbtg zzbtgVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzh(List list, InterfaceC1506a interfaceC1506a, zzbtd zzbtdVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzi(List list, InterfaceC1506a interfaceC1506a, zzbtd zzbtdVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzj(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzk(InterfaceC1506a interfaceC1506a) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzl(List list, InterfaceC1506a interfaceC1506a, zzbtd zzbtdVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxy
    public final void zzm(List list, InterfaceC1506a interfaceC1506a, zzbtd zzbtdVar) {
        throw null;
    }
}
