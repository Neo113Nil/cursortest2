package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzcgw implements zzheg {
    private final zzcge zza;

    public zzcgw(zzcge zzcgeVar) {
        this.zza = zzcgeVar;
    }

    public static VersionInfoParcel zzc(zzcge zzcgeVar) {
        VersionInfoParcel versionInfoParcelZze = zzcgeVar.zze();
        zzheo.zzb(versionInfoParcelZze);
        return versionInfoParcelZze;
    }

    public final VersionInfoParcel zza() {
        return zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
