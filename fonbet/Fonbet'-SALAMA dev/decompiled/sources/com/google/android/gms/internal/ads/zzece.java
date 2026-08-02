package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import J2.j;
import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import w1.C1718l0;

/* loaded from: classes.dex */
final class zzece implements zzdez {
    private final VersionInfoParcel zza;
    private final I3.b zzb;
    private final zzfaf zzc;
    private final zzceb zzd;
    private final zzfba zze;
    private final zzbjc zzf;
    private final boolean zzg;
    private final zzeaq zzh;
    private final zzdqq zzi;

    public zzece(VersionInfoParcel versionInfoParcel, I3.b bVar, zzfaf zzfafVar, zzceb zzcebVar, zzfba zzfbaVar, boolean z4, zzbjc zzbjcVar, zzeaq zzeaqVar, zzdqq zzdqqVar) {
        this.zza = versionInfoParcel;
        this.zzb = bVar;
        this.zzc = zzfafVar;
        this.zzd = zzcebVar;
        this.zze = zzfbaVar;
        this.zzg = z4;
        this.zzf = zzbjcVar;
        this.zzh = zzeaqVar;
        this.zzi = zzdqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final void zza(boolean z4, Context context, zzcvd zzcvdVar) {
        zzcna zzcnaVar = (zzcna) zzgbc.zzq(this.zzb);
        this.zzd.zzaq(true);
        boolean zze = this.zzg ? this.zzf.zze(true) : true;
        boolean z7 = this.zzg;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zze, true, z7 ? this.zzf.zzd() : false, z7 ? this.zzf.zza() : 0.0f, z4, this.zzc.zzO, false);
        if (zzcvdVar != null) {
            zzcvdVar.zzf();
        }
        C1718l0 c1718l0 = o.f1952C.f1956b;
        zzdeo zzg = zzcnaVar.zzg();
        zzceb zzcebVar = this.zzd;
        int i7 = this.zzc.zzQ;
        if (i7 == -1) {
            com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzj;
            if (zzxVar != null) {
                int i8 = zzxVar.f10792a;
                if (i8 == 1) {
                    i7 = 7;
                } else if (i8 == 2) {
                    i7 = 6;
                }
            }
            int i9 = J.f3546b;
            j.b("Error setting app open orientation; no targeting orientation available.");
            i7 = this.zzc.zzQ;
        }
        int i10 = i7;
        VersionInfoParcel versionInfoParcel = this.zza;
        zzfaf zzfafVar = this.zzc;
        String str = zzfafVar.zzB;
        zzfak zzfakVar = zzfafVar.zzs;
        C1718l0.o(context, new AdOverlayInfoParcel(zzg, zzcebVar, i10, versionInfoParcel, str, zzlVar, zzfakVar.zzb, zzfakVar.zza, this.zze.zzf, zzcvdVar, zzfafVar.zzb() ? this.zzh : null, this.zzd.zzr()), true, this.zzi);
    }
}
