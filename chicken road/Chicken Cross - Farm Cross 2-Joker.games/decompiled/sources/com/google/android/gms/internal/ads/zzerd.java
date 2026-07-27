package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzerd implements zzemq {
    private final Context zza;
    private final zzdxg zzb;
    private final zzdwp zzc;
    private final zzflw zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbqk zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzku)).booleanValue();
    private final zzelp zzi;
    private final zzeae zzj;
    private final zzeaj zzk;

    public zzerd(Context context, VersionInfoParcel versionInfoParcel, zzflw zzflwVar, Executor executor, zzdwp zzdwpVar, zzdxg zzdxgVar, zzbqk zzbqkVar, zzelp zzelpVar, zzeae zzeaeVar, zzeaj zzeajVar) {
        this.zza = context;
        this.zzd = zzflwVar;
        this.zzc = zzdwpVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdxgVar;
        this.zzg = zzbqkVar;
        this.zzi = zzelpVar;
        this.zzj = zzeaeVar;
        this.zzk = zzeajVar;
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
        zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.internal.ads.zzerc
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzerd.this.zzc(zzfldVar, zzfloVar, zzdxkVar, obj);
            }
        };
        Executor executor = this.zze;
        ListenableFuture zzj = zzhcy.zzj(zza, zzhcgVar, executor);
        Objects.requireNonNull(zzdxkVar);
        zzj.addListener(new Runnable(zzdxkVar) { // from class: com.google.android.gms.internal.ads.zzeqw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return zzj;
    }

    final /* synthetic */ ListenableFuture zzc(final zzfld zzfldVar, zzflo zzfloVar, zzdxk zzdxkVar, Object obj) {
        zzeae zzeaeVar;
        zzbix zzbixVar = zzbjg.zzcV;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            this.zzj.zzf(zzdzs.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzdxg zzdxgVar = this.zzb;
        zzflw zzflwVar = this.zzd;
        final zzclm zza = zzdxgVar.zza(zzflwVar.zzf, zzfldVar, zzfloVar.zzb.zzb);
        zza.zzaw(zzfldVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            this.zzj.zzf(zzdzs.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcgo zzcgoVar = new zzcgo();
        zzdwp zzdwpVar = this.zzc;
        zzczb zzczbVar = new zzczb(zzfloVar, zzfldVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzbqk zzbqkVar = this.zzg;
        boolean z = this.zzh;
        zzelp zzelpVar = this.zzi;
        zzeae zzeaeVar2 = this.zzj;
        final zzdwl zzf = zzdwpVar.zzf(zzczbVar, new zzdwm(new zzeqz(context, zzdxgVar, zzflwVar, versionInfoParcel, zzfldVar, zzcgoVar, zza, zzbqkVar, z, zzelpVar, zzeaeVar2, this.zzk), zza));
        zzcgoVar.zzc(zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            zzeaeVar = zzeaeVar2;
            zzeaeVar.zzf(zzdzs.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } else {
            zzeaeVar = zzeaeVar2;
        }
        zzbrb.zzb(zza, zzf.zzk());
        zzf.zzd().zzq(new zzdej() { // from class: com.google.android.gms.internal.ads.zzera
            @Override // com.google.android.gms.internal.ads.zzdej
            public final /* synthetic */ void zzdr() {
                zzclm zzclmVar = zzclm.this;
                if (zzclmVar.zzP() != null) {
                    zzclmVar.zzP().zzq();
                }
            }
        }, zzcgj.zzh);
        zzf.zzl().zzi(zza, true, true != z ? null : zzbqkVar, zzeaeVar);
        zzfli zzfliVar = zzfldVar.zzs;
        String str = zzfliVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgt)).booleanValue() && zzf.zzo().zza(true)) {
            str = zzcnd.zza(str, zzcnd.zzb(zzfldVar));
        }
        zzf.zzl();
        return zzhcy.zzk(zzdxf.zzj(zza, zzfliVar.zzb, str, zzeaeVar, zzdwpVar.zzd()), new zzgub(this) { // from class: com.google.android.gms.internal.ads.zzerb
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj2) {
                zzclm zzclmVar = zza;
                if (zzfldVar.zzM) {
                    zzclmVar.zzav();
                }
                zzdwl zzdwlVar = zzf;
                zzclmVar.zzJ();
                zzclmVar.onPause();
                return zzdwlVar.zzh();
            }
        }, this.zze);
    }
}
