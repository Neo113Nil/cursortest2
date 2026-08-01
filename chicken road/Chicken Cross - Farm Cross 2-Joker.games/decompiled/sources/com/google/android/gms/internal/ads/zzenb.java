package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzenb implements zzemq {
    private final zzcvr zza;
    private final zzdxg zzb;
    private final zzflw zzc;
    private final Executor zzd;
    private final VersionInfoParcel zze;
    private final zzbqk zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzku)).booleanValue();
    private final zzelp zzh;
    private final zzeae zzi;
    private final zzeaj zzj;

    public zzenb(zzcvr zzcvrVar, Context context, Executor executor, zzdxg zzdxgVar, zzflw zzflwVar, VersionInfoParcel versionInfoParcel, zzbqk zzbqkVar, zzelp zzelpVar, zzeae zzeaeVar, zzeaj zzeajVar) {
        this.zza = zzcvrVar;
        this.zzd = executor;
        this.zzb = zzdxgVar;
        this.zzc = zzflwVar;
        this.zze = versionInfoParcel;
        this.zzf = zzbqkVar;
        this.zzh = zzelpVar;
        this.zzi = zzeaeVar;
        this.zzj = zzeajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar = zzfldVar.zzs;
        return (zzfliVar == null || zzfliVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(final zzflo zzfloVar, final zzfld zzfldVar) {
        final zzdxk zzdxkVar = new zzdxk();
        ListenableFuture zza = zzhcy.zza(null);
        zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.internal.ads.zzemz
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzenb.this.zzc(zzfldVar, zzfloVar, zzdxkVar, obj);
            }
        };
        Executor executor = this.zzd;
        ListenableFuture zzj = zzhcy.zzj(zza, zzhcgVar, executor);
        Objects.requireNonNull(zzdxkVar);
        zzj.addListener(new Runnable(zzdxkVar) { // from class: com.google.android.gms.internal.ads.zzena
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return zzj;
    }

    final /* synthetic */ ListenableFuture zzc(final zzfld zzfldVar, zzflo zzfloVar, zzdxk zzdxkVar, Object obj) {
        final zzenb zzenbVar;
        zzbix zzbixVar = zzbjg.zzcV;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            this.zzi.zzf(zzdzs.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdxg zzdxgVar = this.zzb;
        zzflw zzflwVar = this.zzc;
        final zzclm zza = zzdxgVar.zza(zzflwVar.zzf, zzfldVar, zzfloVar.zzb.zzb);
        zza.zzaw(zzfldVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            this.zzi.zzf(zzdzs.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcgo zzcgoVar = new zzcgo();
        zzcvr zzcvrVar = this.zza;
        zzczb zzczbVar = new zzczb(zzfloVar, zzfldVar, null);
        VersionInfoParcel versionInfoParcel = this.zze;
        boolean z = this.zzg;
        zzbqk zzbqkVar = this.zzf;
        final zzcvo zzf = zzcvrVar.zzf(zzczbVar, new zzdnb(new zzend(versionInfoParcel, zzcgoVar, zzfldVar, zza, zzflwVar, z, zzbqkVar, this.zzh, this.zzj), zza), new zzcvp(zzfldVar.zzaa));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            zzenbVar = this;
            zzenbVar.zzi.zzf(zzdzs.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } else {
            zzenbVar = this;
        }
        zzdxf zzi = zzf.zzi();
        zzbqk zzbqkVar2 = true != z ? null : zzbqkVar;
        zzeae zzeaeVar = zzenbVar.zzi;
        zzi.zzi(zza, false, zzbqkVar2, zzeaeVar);
        zzcgoVar.zzc(zzf);
        zzf.zzd().zzq(new zzdej() { // from class: com.google.android.gms.internal.ads.zzemx
            @Override // com.google.android.gms.internal.ads.zzdej
            public final /* synthetic */ void zzdr() {
                zzclm zzclmVar = zzclm.this;
                if (zzclmVar.zzP() != null) {
                    zzclmVar.zzP().zzq();
                }
            }
        }, zzcgj.zzh);
        zzfli zzfliVar = zzfldVar.zzs;
        String str = zzfliVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgt)).booleanValue() && zzf.zzk().zza(true)) {
            str = zzcnd.zza(str, zzcnd.zzb(zzfldVar));
        }
        zzf.zzi();
        return zzhcy.zzk(zzdxf.zzj(zza, zzfliVar.zzb, str, zzeaeVar, zzcvrVar.zzd()), new zzgub(zzenbVar) { // from class: com.google.android.gms.internal.ads.zzemy
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj2) {
                zzclm zzclmVar = zza;
                if (zzfldVar.zzM) {
                    zzclmVar.zzav();
                }
                zzcvo zzcvoVar = zzf;
                zzclmVar.zzJ();
                zzclmVar.onPause();
                return zzcvoVar.zzh();
            }
        }, zzenbVar.zzd);
    }
}
