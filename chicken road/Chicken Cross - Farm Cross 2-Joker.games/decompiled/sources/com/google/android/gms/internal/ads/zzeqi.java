package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeqi implements zzhcg {
    private final zzfqi zza;
    private final zzddr zzb;
    private final zzfta zzc;
    private final zzfte zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcyo zzg;
    private final zzeqb zzh;
    private final zzemv zzi;
    private final Context zzj;
    private final zzfrg zzk;
    private final zzepl zzl;
    private final zzeae zzm;

    zzeqi(Context context, zzfqi zzfqiVar, zzeqb zzeqbVar, zzddr zzddrVar, zzfta zzftaVar, zzfte zzfteVar, zzcyo zzcyoVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzemv zzemvVar, zzfrg zzfrgVar, zzepl zzeplVar, zzeae zzeaeVar) {
        this.zzj = context;
        this.zza = zzfqiVar;
        this.zzh = zzeqbVar;
        this.zzb = zzddrVar;
        this.zzc = zzftaVar;
        this.zzd = zzfteVar;
        this.zzg = zzcyoVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzemvVar;
        this.zzk = zzfrgVar;
        this.zzl = zzeplVar;
        this.zzm = zzeaeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbjg.zzgG)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String zzb(zzflo zzfloVar) {
        String str = "No fill.";
        String str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgH)).booleanValue() ? "No ad config." : "No fill.";
        zzflg zzflgVar = zzfloVar.zzb.zzb;
        int i = zzflgVar.zzf;
        if (i != 0) {
            if (i < 200 || i >= 300) {
                if (i < 300 || i >= 400) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35);
                    sb.append("Received error HTTP response code: ");
                    sb.append(i);
                    str = sb.toString();
                } else {
                    str = "No location header to follow redirect or too many redirects.";
                }
            }
            zzflf zzflfVar = zzflgVar.zzj;
            return zzflfVar == null ? zzflfVar.zza() : str;
        }
        str = str2;
        zzflf zzflfVar2 = zzflgVar.zzj;
        if (zzflfVar2 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        int i;
        Bundle bundle;
        final zzflo zzfloVar = (zzflo) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue() && (bundle = zzfloVar.zzb.zzd) != null) {
            this.zzm.zzg(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcT)).booleanValue()) {
            this.zzm.zzf(zzdzs.RENDERING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String zzb = zzb(zzfloVar);
        zzemv zzemvVar = this.zzi;
        zzfln zzflnVar = zzfloVar.zzb;
        zzflg zzflgVar = zzflnVar.zzb;
        zzemvVar.zza(zzflgVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjI)).booleanValue() && (i = zzflgVar.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzhcy.zzc(new zzeqf(3, zzb));
        }
        String str = zzflgVar.zzq;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeE)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfld zzfldVar : zzflnVar.zza) {
                zzemvVar.zzb(zzfldVar);
                Iterator it = zzfldVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzemvVar.zze(zzfldVar, 0L, zzfmy.zzd(1, null, null));
                        break;
                    }
                    zzemq zza = this.zzg.zza(zzfldVar.zzb, (String) it.next());
                    if (zza == null || !zza.zza(zzfloVar, zzfldVar)) {
                    }
                }
            }
        } else {
            zzemvVar.zzc(str, zzflnVar.zza);
        }
        zzddr zzddrVar = this.zzb;
        zzcuf zzcufVar = new zzcuf(zzfloVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzddrVar.zzq(zzcufVar, executor);
        if (zzflgVar.zzr > 1) {
            return this.zzl.zza(zzfloVar);
        }
        String zzb2 = zzb(zzfloVar);
        zzfqi zzfqiVar = this.zza;
        zzfqc zzfqcVar = zzfqc.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfqiVar);
        zzfpp zzi = zzfpt.zza(zzhcy.zzc(new zzeqf(3, zzb2)), zzfqcVar, zzfqiVar).zzi();
        final zzeqb zzeqbVar = this.zzh;
        zzeqbVar.zza();
        int i2 = 0;
        for (final zzfld zzfldVar2 : zzflnVar.zza) {
            Iterator it2 = zzfldVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzemq zza2 = this.zzg.zza(zzfldVar2.zzb, str2);
                if (zza2 != null && zza2.zza(zzfloVar, zzfldVar2)) {
                    zzfpz zza3 = zzfqiVar.zza(zzfqc.RENDER_CONFIG_WATERFALL, zzi);
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str2);
                    zzi = zza3.zza(sb.toString()).zzg(Throwable.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzeqh
                        @Override // com.google.android.gms.internal.ads.zzhcg
                        public final /* synthetic */ ListenableFuture zza(Object obj2) {
                            return zzeqi.this.zzc(zzfldVar2, zzfloVar, zza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i2++;
        }
        Objects.requireNonNull(zzeqbVar);
        zzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeqb.this.zzb();
            }
        }, executor);
        return zzi;
    }

    final /* synthetic */ ListenableFuture zzc(zzfld zzfldVar, zzflo zzfloVar, zzemq zzemqVar, Throwable th) {
        zzfqw zzn = zzfqw.zzn(this.zzj, 12);
        zzn.zzi(zzfldVar.zzE);
        zzn.zza();
        ListenableFuture zzi = zzhcy.zzi(zzemqVar.zzb(zzfloVar, zzfldVar), zzfldVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfloVar, zzfldVar, zzi, this.zzc);
        zzfrf.zzd(zzi, this.zzk, zzn);
        return zzi;
    }
}
