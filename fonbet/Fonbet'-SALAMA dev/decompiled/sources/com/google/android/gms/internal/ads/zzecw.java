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
import o3.BinderC1507b;

/* loaded from: classes.dex */
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
    public final Object zza(zzfar zzfarVar, final zzfaf zzfafVar, zzebu zzebuVar) {
        final View zza;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhQ)).booleanValue() && zzfafVar.zzag) {
            zzbox zzc = ((zzfby) zzebuVar.zzb).zzc();
            if (zzc == null) {
                int i7 = J.f3546b;
                j.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfbh(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) BinderC1507b.t0(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzfbh(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzecu
                            @Override // com.google.android.gms.internal.ads.zzgaj
                            public final I3.b zza(Object obj) {
                                I3.b zzh;
                                zzh = zzgbc.zzh(zzcpi.zza(zzecw.this.zza, zza, zzfafVar));
                                return zzh;
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
            zza = ((zzfby) zzebuVar.zzb).zza();
        }
        zzcot zzcotVar = this.zzb;
        zzcqm zzcqmVar = new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza);
        final zzfby zzfbyVar = (zzfby) zzebuVar.zzb;
        Objects.requireNonNull(zzfbyVar);
        zzcnq zza2 = zzcotVar.zza(zzcqmVar, new zzcnw(zza, null, new zzcpu() { // from class: com.google.android.gms.internal.ads.zzecv
            @Override // com.google.android.gms.internal.ads.zzcpu
            public final I0 zza() {
                return zzfby.this.zzb();
            }
        }, (zzfag) zzfafVar.zzu.get(0)));
        zza2.zzh().zza(zza);
        zza2.zzd().zzo(new zzcld((zzfby) zzebuVar.zzb), this.zzc);
        ((zzedi) zzebuVar.zzc).zzc(zza2.zzk());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        com.google.android.gms.ads.internal.client.zzr zza;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzfarVar.zza.zza.zze;
        boolean z4 = zzrVar.f10769E;
        int i7 = zzrVar.f10772b;
        int i8 = zzrVar.f10775e;
        if (z4) {
            Context context = this.zza;
            y2.j jVar = new y2.j(i8, i7);
            jVar.f18168e = true;
            jVar.f18169f = i7;
            zza = new com.google.android.gms.ads.internal.client.zzr(context, jVar);
        } else {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhQ)).booleanValue() && zzfafVar.zzag) {
                Context context2 = this.zza;
                y2.j jVar2 = new y2.j(i8, i7);
                jVar2.f18170g = true;
                jVar2.f18171h = i7;
                zza = new com.google.android.gms.ads.internal.client.zzr(context2, jVar2);
            } else {
                zza = zzfbg.zza(this.zza, zzfafVar.zzu);
            }
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zza;
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
