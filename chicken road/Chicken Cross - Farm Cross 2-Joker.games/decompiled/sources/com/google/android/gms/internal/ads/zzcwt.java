package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcwt implements zzinw {
    private final zzcwk zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;

    private zzcwt(zzcwk zzcwkVar, zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zzcwkVar;
        this.zzb = zziofVar;
        this.zzc = zziofVar2;
        this.zzd = zziofVar3;
        this.zze = zziofVar4;
    }

    public static zzcwt zza(zzcwk zzcwkVar, zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzcwt(zzcwkVar, zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    public static zzdlo zzc(zzcwk zzcwkVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzfld zzfldVar, final zzflw zzflwVar) {
        return new zzdlo(new zzdfd() { // from class: com.google.android.gms.internal.ads.zzcwj
            @Override // com.google.android.gms.internal.ads.zzdfd
            public final /* synthetic */ void zzg() {
                zzflw zzflwVar2 = zzflwVar;
                JSONObject jSONObject = zzfldVar.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcel.afmaVersion, jSONObject.toString(), zzflwVar2.zzg);
            }
        }, zzcgj.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (Context) this.zzb.zzb(), ((zzcpa) this.zzc).zza(), ((zzczc) this.zzd).zza(), ((zzddg) this.zze).zza());
    }
}
