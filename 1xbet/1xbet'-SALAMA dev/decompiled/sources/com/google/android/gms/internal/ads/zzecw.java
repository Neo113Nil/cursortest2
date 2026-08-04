package com.google.android.gms.internal.ads;

import F2.C0254t;
import F2.I0;
import I2.J;
import J2.j;
import Y4.D;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzecw implements zzebx {
    private final Context zza;
    private final zzcot zzb;
    private final Executor zzc;

    public zzecw(Context context, zzcot zzcotVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcotVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final Object zza(zzfar zzfarVar, final zzfaf zzfafVar, zzebu zzebuVar) throws zzfbh {
        final View viewZza;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhQ)).booleanValue() && zzfafVar.zzag) {
            zzbox zzboxVarZzc = ((zzfby) zzebuVar.zzb).zzc();
            if (zzboxVarZzc == null) {
                int i7 = J.f3546b;
                j.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfbh(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) p105o3.b.t0(zzboxVarZzc.zze());
                boolean zZzf = zzboxVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfbh(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzecu
                            @Override // com.google.android.gms.internal.ads.zzgaj
                            public final I3.b zza(Object obj) {
                                return zzgbc.zzh(zzcpi.zza(this.zza.zza, viewZza, zzfafVar));
                            }
                        }, zzbza.zzf).get();
                    } catch (InterruptedException | ExecutionException e7) {
                        throw new zzfbh(e7);
                    }
                }
            } catch (RemoteException e8) {
                throw new zzfbh(e8);
            }
        } else {
            viewZza = ((zzfby) zzebuVar.zzb).zza();
        }
        zzcot zzcotVar = this.zzb;
        zzcqm zzcqmVar = new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza);
        final zzfby zzfbyVar = (zzfby) zzebuVar.zzb;
        Objects.requireNonNull(zzfbyVar);
        zzcnq zzcnqVarZza = zzcotVar.zza(zzcqmVar, new zzcnw(viewZza, null, new zzcpu() { // from class: com.google.android.gms.internal.ads.zzecv
            @Override // com.google.android.gms.internal.ads.zzcpu
            public final I0 zza() {
                return zzfbyVar.zzb();
            }
        }, (zzfag) zzfafVar.zzu.get(0)));
        zzcnqVarZza.zzh().zza(viewZza);
        zzcnqVarZza.zzd().zzo(new zzcld((zzfby) zzebuVar.zzb), this.zzc);
        ((zzedi) zzebuVar.zzc).zzc(zzcnqVarZza.zzk());
        return zzcnqVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) throws zzfbh {
        com.google.android.gms.ads.internal.client.zzr zzrVarZza;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzfarVar.zza.zza.zze;
        boolean z4 = zzrVar.f10769E;
        int i7 = zzrVar.f10772b;
        int i8 = zzrVar.f10775e;
        if (z4) {
            Context context = this.zza;
            p167y2.j jVar = new p167y2.j(i8, i7);
            jVar.f18174e = true;
            jVar.f18175f = i7;
            zzrVarZza = new com.google.android.gms.ads.internal.client.zzr(context, jVar);
        } else {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhQ)).booleanValue() && zzfafVar.zzag) {
                Context context2 = this.zza;
                p167y2.j jVar2 = new p167y2.j(i8, i7);
                jVar2.f18176g = true;
                jVar2.f18177h = i7;
                zzrVarZza = new com.google.android.gms.ads.internal.client.zzr(context2, jVar2);
            } else {
                zzrVarZza = zzfbg.zza(this.zza, zzfafVar.zzu);
            }
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzrVarZza;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhQ)).booleanValue() && zzfafVar.zzag) {
            Object obj = zzebuVar.zzb;
            Context context3 = this.zza;
            zzfba zzfbaVar = zzfarVar.zza.zza;
            ((zzfby) obj).zzn(context3, zzrVar2, zzfbaVar.zzd, zzfafVar.zzv.toString(), D.I0(zzfafVar.zzs), (zzbou) zzebuVar.zzc);
            return;
        }
        Object obj2 = zzebuVar.zzb;
        Context context4 = this.zza;
        zzfba zzfbaVar2 = zzfarVar.zza.zza;
        ((zzfby) obj2).zzm(context4, zzrVar2, zzfbaVar2.zzd, zzfafVar.zzv.toString(), D.I0(zzfafVar.zzs), (zzbou) zzebuVar.zzc);
    }
}
