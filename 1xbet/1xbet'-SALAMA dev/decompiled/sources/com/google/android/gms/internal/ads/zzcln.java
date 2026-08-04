package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.L;
import I2.M;
import J2.o;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.common.api.f;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzcln {
    zzbtn zza;
    zzbtn zzb;
    private final Context zzc;
    private final L zzd;
    private final zzebn zze;
    private final zzdnv zzf;
    private final zzgbn zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcln(Context context, L l7, zzebn zzebnVar, zzdnv zzdnvVar, zzgbn zzgbnVar, zzgbn zzgbnVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = l7;
        this.zze = zzebnVar;
        this.zzf = zzdnvVar;
        this.zzg = zzgbnVar;
        this.zzh = zzgbnVar2;
        this.zzi = scheduledExecutorService;
    }

    public static I3.b zzb(zzcln zzclnVar, final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) C0254t.f2723d.f2726c.zzb(zzbby.zzkj), "10");
            return zzgbc.zzh(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        zzbbp zzbbpVar = zzbby.zzkk;
        C0254t c0254t = C0254t.f2723d;
        builderBuildUpon.appendQueryParameter((String) c0254t.f2726c.zzb(zzbbpVar), "1");
        builderBuildUpon.appendQueryParameter((String) c0254t.f2726c.zzb(zzbby.zzkj), "12");
        if (str.contains((CharSequence) c0254t.f2726c.zzb(zzbby.zzkl))) {
            builderBuildUpon.authority((String) c0254t.f2726c.zzb(zzbby.zzkm));
        }
        return (zzgat) zzgbc.zzn(zzgat.zzu(zzclnVar.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzclj
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                String str2 = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzkj);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgbc.zzh(builder2.toString());
            }
        }, zzclnVar.zzh);
    }

    public static /* synthetic */ I3.b zzc(final zzcln zzclnVar, String str, final Throwable th) {
        zzclnVar.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclg
            @Override // java.lang.Runnable
            public final void run() {
                zzcln.zzg(this.zza, th);
            }
        });
        return zzgbc.zzh(str);
    }

    public static I3.b zzd(final zzcln zzclnVar, Uri.Builder builder, final Throwable th) {
        zzclnVar.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclf
            @Override // java.lang.Runnable
            public final void run() {
                zzcln.zzh(this.zza, th);
            }
        });
        builder.appendQueryParameter((String) C0254t.f2723d.f2726c.zzb(zzbby.zzkj), "9");
        return zzgbc.zzh(builder.toString());
    }

    public static void zzg(zzcln zzclnVar, Throwable th) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzko)).booleanValue()) {
            zzbtn zzbtnVarZzc = zzbtl.zzc(zzclnVar.zzc);
            zzclnVar.zzb = zzbtnVarZzc;
            zzbtnVarZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbtn zzbtnVarZza = zzbtl.zza(zzclnVar.zzc);
            zzclnVar.zza = zzbtnVarZza;
            zzbtnVarZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public static void zzh(zzcln zzclnVar, Throwable th) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzko)).booleanValue()) {
            zzbtn zzbtnVarZzc = zzbtl.zzc(zzclnVar.zzc);
            zzclnVar.zzb = zzbtnVarZzc;
            zzbtnVarZzc.zzh(th, "AttributionReporting");
        } else {
            zzbtn zzbtnVarZza = zzbtl.zza(zzclnVar.zzc);
            zzclnVar.zza = zzbtnVarZza;
            zzbtnVarZza.zzh(th, "AttributionReportingSampled");
        }
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) C0254t.f2723d.f2726c.zzb(zzbby.zzkh));
    }

    private final I3.b zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            zzbbp zzbbpVar = zzbby.zzkh;
            C0254t c0254t = C0254t.f2723d;
            if (!str.contains((CharSequence) c0254t.f2726c.zzb(zzbbpVar)) || ((M) this.zzd).k()) {
                return zzgbc.zzh(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) c0254t.f2726c.zzb(zzbby.zzki), String.valueOf(random.nextInt(f.API_PRIORITY_OTHER)));
            if (inputEvent != null) {
                return (zzgat) zzgbc.zzf((zzgat) zzgbc.zzn(zzgat.zzu(this.zze.zza()), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzclh
                    @Override // com.google.android.gms.internal.ads.zzgaj
                    public final I3.b zza(Object obj) {
                        return zzcln.zzb(this.zza, builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzcli
                    @Override // com.google.android.gms.internal.ads.zzgaj
                    public final I3.b zza(Object obj) {
                        return zzcln.zzd(this.zza, builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) c0254t.f2726c.zzb(zzbby.zzkj), "11");
            return zzgbc.zzh(builderBuildUpon.toString());
        } catch (Exception e7) {
            return zzgbc.zzg(e7);
        }
    }

    public final I3.b zze(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgbc.zzh(str) : zzgbc.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzcle
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzcln.zzc(this.zza, str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final void zzi(String str, zzfia zzfiaVar, Random random, o oVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgbc.zzr(zzgbc.zzo(zzk(str, this.zzf.zza(), random), ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzkn)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzclm(this, zzfiaVar, str, oVar), this.zzg);
    }
}
