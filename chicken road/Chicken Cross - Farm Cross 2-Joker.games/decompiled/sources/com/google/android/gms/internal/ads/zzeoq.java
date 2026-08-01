package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeoq implements zzemw {
    private final Context zza;
    private final zzdoe zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzeoq(Context context, VersionInfoParcel versionInfoParcel, zzdoe zzdoeVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdoeVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd {
        zzfmu zzfmuVar = (zzfmu) zzemtVar.zzb;
        zzflw zzflwVar = zzfloVar.zza.zza;
        String jSONObject = zzfldVar.zzv.toString();
        String zzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfldVar.zzs);
        zzfmuVar.zzh(this.zza, zzflwVar.zzd, jSONObject, zzm, (zzbwa) zzemtVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ Object zzb(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) throws zzfmd, zzeqf {
        zzdmy zzd = this.zzb.zzd(new zzczb(zzfloVar, zzfldVar, zzemtVar.zza), new zzdnb(new zzeop(this, zzemtVar, zzfldVar), null));
        zzd.zza().zzq(new zzctr((zzfmu) zzemtVar.zzb), this.zzd);
        ((zzeof) zzemtVar.zzc).zzb(zzd.zzf());
        return zzd.zzh();
    }

    final /* synthetic */ VersionInfoParcel zzc() {
        return this.zzc;
    }
}
