package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import w1.C1718l0;

/* loaded from: classes.dex */
final class zzedo implements zzdez {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final I3.b zzc;
    private final zzfaf zzd;
    private final zzceb zze;
    private final zzfba zzf;
    private final zzbjc zzg;
    private final boolean zzh;
    private final zzeaq zzi;
    private final zzdqq zzj;

    public zzedo(Context context, VersionInfoParcel versionInfoParcel, I3.b bVar, zzfaf zzfafVar, zzceb zzcebVar, zzfba zzfbaVar, boolean z4, zzbjc zzbjcVar, zzeaq zzeaqVar, zzdqq zzdqqVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = bVar;
        this.zzd = zzfafVar;
        this.zze = zzcebVar;
        this.zzf = zzfbaVar;
        this.zzg = zzbjcVar;
        this.zzh = z4;
        this.zzi = zzeaqVar;
        this.zzj = zzdqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final void zza(boolean z4, Context context, zzcvd zzcvdVar) {
        zzddo zzddoVar = (zzddo) zzgbc.zzq(this.zzc);
        this.zze.zzaq(true);
        boolean zze = this.zzh ? this.zzg.zze(false) : false;
        P p5 = o.f1952C.f1957c;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zze, P.h(this.zza), this.zzh ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, z4, this.zzd.zzO, false);
        if (zzcvdVar != null) {
            zzcvdVar.zzf();
        }
        zzdeo zzh = zzddoVar.zzh();
        zzceb zzcebVar = this.zze;
        zzfaf zzfafVar = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzb;
        int i7 = zzfafVar.zzQ;
        String str = zzfafVar.zzB;
        zzfak zzfakVar = zzfafVar.zzs;
        C1718l0.o(context, new AdOverlayInfoParcel(zzh, zzcebVar, i7, versionInfoParcel, str, zzlVar, zzfakVar.zzb, zzfakVar.zza, this.zzf.zzf, zzcvdVar, zzfafVar.zzb() ? this.zzi : null, this.zze.zzr()), true, this.zzj);
    }
}
