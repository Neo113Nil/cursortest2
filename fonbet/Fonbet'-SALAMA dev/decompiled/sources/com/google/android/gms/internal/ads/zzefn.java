package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import e1.k;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzefn implements zzgaj {
    private final zzffe zza;
    private final zzcus zzb;
    private final zzfhv zzc;
    private final zzfia zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcpz zzg;
    private final zzefg zzh;
    private final zzebw zzi;
    private final Context zzj;
    private final zzffy zzk;
    private final zzeeq zzl;
    private final zzdqk zzm;

    public zzefn(Context context, zzffe zzffeVar, zzefg zzefgVar, zzcus zzcusVar, zzfhv zzfhvVar, zzfia zzfiaVar, zzcpz zzcpzVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzebw zzebwVar, zzffy zzffyVar, zzeeq zzeeqVar, zzdqk zzdqkVar) {
        this.zzj = context;
        this.zza = zzffeVar;
        this.zzh = zzefgVar;
        this.zzb = zzcusVar;
        this.zzc = zzfhvVar;
        this.zzd = zzfiaVar;
        this.zzg = zzcpzVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzebwVar;
        this.zzk = zzffyVar;
        this.zzl = zzeeqVar;
        this.zzm = zzdqkVar;
    }

    public static /* synthetic */ I3.b zzb(zzefn zzefnVar, zzfaf zzfafVar, zzfar zzfarVar, zzebr zzebrVar, Throwable th) {
        zzffn zza = zzffm.zza(zzefnVar.zzj, 12);
        zza.zzd(zzfafVar.zzE);
        zza.zzi();
        I3.b zzo = zzgbc.zzo(zzebrVar.zza(zzfarVar, zzfafVar), zzfafVar.zzR, TimeUnit.MILLISECONDS, zzefnVar.zzf);
        zzefnVar.zzh.zzf(zzfarVar, zzfafVar, zzo, zzefnVar.zzc);
        zzffx.zza(zzo, zzefnVar.zzk, zza);
        return zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (((java.lang.Boolean) r1.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzfA)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String zzc(zzfar zzfarVar) {
        zzbbp zzbbpVar = zzbby.zzfB;
        C0254t c0254t = C0254t.f2723d;
        String str = "No fill.";
        String str2 = true != ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() ? "No ad config." : "No fill.";
        int i7 = zzfarVar.zzb.zzb.zzf;
        if (i7 != 0) {
            if (i7 < 200 || i7 >= 300) {
                str = (i7 < 300 || i7 >= 400) ? k.d(i7, "Received error HTTP response code: ") : "No location header to follow redirect or too many redirects.";
            }
            zzfah zzfahVar = zzfarVar.zzb.zzb.zzj;
            return zzfahVar == null ? zzfahVar.zza() : str;
        }
        str = str2;
        zzfah zzfahVar2 = zzfarVar.zzb.zzb.zzj;
        if (zzfahVar2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    @Override // com.google.android.gms.internal.ads.zzgaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I3.b zza(Object obj) {
        int i7;
        zzbuo zzbuoVar;
        Bundle bundle;
        final zzfar zzfarVar = (zzfar) obj;
        zzbbp zzbbpVar = zzbby.zzco;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && (zzbuoVar = zzfarVar.zzb.zzd) != null && (bundle = zzbuoVar.zzm) != null) {
            this.zzm.zza().putAll(bundle);
        }
        zzbbp zzbbpVar2 = zzbby.zzcp;
        zzbbw zzbbwVar = c0254t.f2726c;
        if (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue()) {
            AbstractC1663a.n(o.f1952C.j, this.zzm.zza(), zzdpy.RENDERING_START.zza());
        }
        String zzc = zzc(zzfarVar);
        this.zzi.zzi(zzfarVar.zzb.zzb);
        if (((Boolean) zzbbwVar.zzb(zzbby.zzio)).booleanValue() && (i7 = zzfarVar.zzb.zzb.zzf) != 0 && (i7 < 200 || i7 >= 300)) {
            return zzgbc.zzg(new zzefk(3, zzc));
        }
        zzfai zzfaiVar = zzfarVar.zzb.zzb;
        if (((Boolean) zzbbwVar.zzb(zzbby.zzdM)).booleanValue()) {
            String str = zzfaiVar.zzq;
            if (!TextUtils.isEmpty(str)) {
                this.zzi.zzh(str, zzfarVar.zzb.zza);
                this.zzb.zzo(new zzclr(zzfarVar, this.zzd, this.zzc), this.zze);
                if (zzfarVar.zzb.zzb.zzr <= 1) {
                    return this.zzl.zzb(zzfarVar);
                }
                zzfek zza = zzfeo.zzc(zzgbc.zzg(new zzefk(3, zzc(zzfarVar))), zzfey.RENDER_CONFIG_INIT, this.zza).zza();
                this.zzh.zzl();
                int i8 = 0;
                for (final zzfaf zzfafVar : zzfarVar.zzb.zza) {
                    Iterator it = zzfafVar.zza.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str2 = (String) it.next();
                        final zzebr zza2 = this.zzg.zza(zzfafVar.zzb, str2);
                        if (zza2 != null && zza2.zzb(zzfarVar, zzfafVar)) {
                            zza = this.zza.zzb(zzfey.RENDER_CONFIG_WATERFALL, zza).zzh("render-config-" + i8 + "-" + str2).zzc(Throwable.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzefl
                                @Override // com.google.android.gms.internal.ads.zzgaj
                                public final I3.b zza(Object obj2) {
                                    return zzefn.zzb(zzefn.this, zzfafVar, zzfarVar, zza2, (Throwable) obj2);
                                }
                            }).zza();
                            break;
                        }
                    }
                    i8++;
                }
                final zzefg zzefgVar = this.zzh;
                Objects.requireNonNull(zzefgVar);
                zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzefg.this.zzj();
                    }
                }, this.zze);
                return zza;
            }
        }
        for (zzfaf zzfafVar2 : zzfarVar.zzb.zza) {
            this.zzi.zzd(zzfafVar2);
            Iterator it2 = zzfafVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    this.zzi.zzf(zzfafVar2, 0L, zzfcb.zzd(1, null, null));
                    break;
                }
                zzebr zza3 = this.zzg.zza(zzfafVar2.zzb, (String) it2.next());
                if (zza3 == null || !zza3.zzb(zzfarVar, zzfafVar2)) {
                }
            }
        }
        this.zzb.zzo(new zzclr(zzfarVar, this.zzd, this.zzc), this.zze);
        if (zzfarVar.zzb.zzb.zzr <= 1) {
        }
    }
}
