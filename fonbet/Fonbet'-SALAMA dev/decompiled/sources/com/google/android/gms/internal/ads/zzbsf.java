package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzbsf extends zzaxn implements zzbsh {
    public zzbsf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zze(Intent intent) {
        Parcel zza = zza();
        zzaxp.zzd(zza, intent);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzf(String[] strArr, int[] iArr, InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzg(InterfaceC1506a interfaceC1506a) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzh() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzi(InterfaceC1506a interfaceC1506a, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsh
    public final void zzj(InterfaceC1506a interfaceC1506a, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, interfaceC1506a);
        zzaxp.zzd(zza, zzaVar);
        zzda(6, zza);
    }
}
