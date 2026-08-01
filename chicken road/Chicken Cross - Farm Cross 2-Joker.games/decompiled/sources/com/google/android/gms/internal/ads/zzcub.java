package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcub {
    zzcas zza;
    zzcas zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzemm zze;
    private final zzdxl zzf;
    private final zzhdi zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    zzcub(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzemm zzemmVar, zzdxl zzdxlVar, zzhdi zzhdiVar, zzhdi zzhdiVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzemmVar;
        this.zzf = zzdxlVar;
        this.zzg = zzhdiVar;
        this.zzh = zzhdiVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlO));
    }

    private final ListenableFuture zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlO)) || this.zzd.zzx()) {
                return zzhcy.zza(str);
            }
            final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlP), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (zzhcq) zzhcy.zzh((zzhcq) zzhcy.zzj(zzhcq.zzw(this.zze.zza()), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzctv
                    @Override // com.google.android.gms.internal.ads.zzhcg
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzcub.this.zze(buildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzctw
                    @Override // com.google.android.gms.internal.ads.zzhcg
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return zzcub.this.zzf(buildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlQ), "11");
            return zzhcy.zza(buildUpon.toString());
        } catch (Exception e) {
            return zzhcy.zzc(e);
        }
    }

    public final void zza(String str, zzfte zzfteVar, Random random, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzhcy.zzr(zzhcy.zzi(zzk(str, this.zzf.zzb(), random), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlU)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzctu(this, zzfteVar, str, zzvVar), this.zzg);
    }

    public final ListenableFuture zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzhcy.zza(str) : zzhcy.zzh(zzk(str, this.zzf.zzb(), random), Throwable.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzcua
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzcub.this.zzd(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    final /* synthetic */ ListenableFuture zzd(String str, final Throwable th) {
        this.zzg.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcub.this.zzh(th);
            }
        });
        return zzhcy.zza(str);
    }

    final /* synthetic */ ListenableFuture zze(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlQ), "10");
            return zzhcy.zza(builder.toString());
        }
        Uri.Builder buildUpon = builder.build().buildUpon();
        buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlR), "1");
        buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlQ), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlS))) {
            buildUpon.authority((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlT));
        }
        return (zzhcq) zzhcy.zzj(zzhcq.zzw(this.zze.zzb(buildUpon.build(), inputEvent)), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzctx
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlQ);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzhcy.zza(builder2.toString());
            }
        }, this.zzh);
    }

    final /* synthetic */ ListenableFuture zzf(Uri.Builder builder, final Throwable th) {
        this.zzg.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcty
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcub.this.zzg(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlQ), "9");
        return zzhcy.zza(builder.toString());
    }

    final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlV)).booleanValue()) {
            zzcas zzc = zzcaq.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th, "AttributionReporting");
        } else {
            zzcas zza = zzcaq.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th, "AttributionReportingSampled");
        }
    }

    final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlV)).booleanValue()) {
            zzcas zzc = zzcaq.zzc(this.zzc);
            this.zzb = zzc;
            zzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzcas zza = zzcaq.zza(this.zzc);
            this.zza = zza;
            zza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    final /* synthetic */ zzhdi zzj() {
        return this.zzg;
    }
}
