package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
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
        zzffn zzffnVarZza = zzffm.zza(zzefnVar.zzj, 12);
        zzffnVarZza.zzd(zzfafVar.zzE);
        zzffnVarZza.zzi();
        I3.b bVarZzo = zzgbc.zzo(zzebrVar.zza(zzfarVar, zzfafVar), zzfafVar.zzR, TimeUnit.MILLISECONDS, zzefnVar.zzf);
        zzefnVar.zzh.zzf(zzfarVar, zzfafVar, bVarZzo, zzefnVar.zzc);
        zzffx.zza(bVarZzo, zzefnVar.zzk, zzffnVarZza);
        return bVarZzo;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    public static String zzc(zzfar zzfarVar) {
        zzbbp zzbbpVar = zzbby.zzfB;
        C0254t c0254t = C0254t.f2723d;
        String strD = "No fill.";
        String str = true != ((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() ? "No ad config." : "No fill.";
        int i7 = zzfarVar.zzb.zzb.zzf;
        if (i7 == 0) {
            strD = str;
        } else if (i7 < 200 || i7 >= 300) {
            strD = (i7 < 300 || i7 >= 400) ? k.d(i7, "Received error HTTP response code: ") : "No location header to follow redirect or too many redirects.";
        } else {
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzfA)).booleanValue()) {
                strD = str;
            }
        }
        zzfah zzfahVar = zzfarVar.zzb.zzb.zzj;
        return zzfahVar != null ? zzfahVar.zza() : strD;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgaj
    public final I3.b zza(Object obj) {
        Iterator it;
        zzebr zzebrVarZza;
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
            p150v0.a.n(o.f1952C.j, this.zzm.zza(), zzdpy.RENDERING_START.zza());
        }
        String strZzc = zzc(zzfarVar);
        this.zzi.zzi(zzfarVar.zzb.zzb);
        if (((Boolean) zzbbwVar.zzb(zzbby.zzio)).booleanValue() && (i7 = zzfarVar.zzb.zzb.zzf) != 0 && (i7 < 200 || i7 >= 300)) {
            return zzgbc.zzg(new zzefk(3, strZzc));
        }
        zzfai zzfaiVar = zzfarVar.zzb.zzb;
        if (!((Boolean) zzbbwVar.zzb(zzbby.zzdM)).booleanValue()) {
            for (zzfaf zzfafVar : zzfarVar.zzb.zza) {
                this.zzi.zzd(zzfafVar);
                it = zzfafVar.zza.iterator();
                while (true) {
                    if (it.hasNext()) {
                        this.zzi.zzf(zzfafVar, 0L, zzfcb.zzd(1, null, null));
                        break;
                        break;
                    }
                    zzebrVarZza = this.zzg.zza(zzfafVar.zzb, (String) it.next());
                    if (zzebrVarZza == null) {
                    }
                }
            }
        } else {
            String str = zzfaiVar.zzq;
            if (TextUtils.isEmpty(str)) {
                while (r0.hasNext()) {
                    this.zzi.zzd(zzfafVar);
                    it = zzfafVar.zza.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            this.zzi.zzf(zzfafVar, 0L, zzfcb.zzd(1, null, null));
                            break;
                        }
                        zzebrVarZza = this.zzg.zza(zzfafVar.zzb, (String) it.next());
                        if (zzebrVarZza == null && zzebrVarZza.zzb(zzfarVar, zzfafVar)) {
                            break;
                        }
                    }
                }
            } else {
                this.zzi.zzh(str, zzfarVar.zzb.zza);
            }
        }
        this.zzb.zzo(new zzclr(zzfarVar, this.zzd, this.zzc), this.zze);
        if (zzfarVar.zzb.zzb.zzr > 1) {
            return this.zzl.zzb(zzfarVar);
        }
        zzfek zzfekVarZza = zzfeo.zzc(zzgbc.zzg(new zzefk(3, zzc(zzfarVar))), zzfey.RENDER_CONFIG_INIT, this.zza).zza();
        this.zzh.zzl();
        int i8 = 0;
        for (final zzfaf zzfafVar2 : zzfarVar.zzb.zza) {
            for (String str2 : zzfafVar2.zza) {
                final zzebr zzebrVarZza2 = this.zzg.zza(zzfafVar2.zzb, str2);
                if (zzebrVarZza2 != null && zzebrVarZza2.zzb(zzfarVar, zzfafVar2)) {
                    zzfekVarZza = this.zza.zzb(zzfey.RENDER_CONFIG_WATERFALL, zzfekVarZza).zzh("render-config-" + i8 + "-" + str2).zzc(Throwable.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzefl
                        @Override // com.google.android.gms.internal.ads.zzgaj
                        public final I3.b zza(Object obj2) {
                            return zzefn.zzb(this.zza, zzfafVar2, zzfarVar, zzebrVarZza2, (Throwable) obj2);
                        }
                    }).zza();
                    break;
                }
            }
            i8++;
        }
        final zzefg zzefgVar = this.zzh;
        Objects.requireNonNull(zzefgVar);
        zzfekVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // java.lang.Runnable
            public final void run() {
                zzefgVar.zzj();
            }
        }, this.zze);
        return zzfekVarZza;
    }
}
