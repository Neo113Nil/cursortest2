package com.google.android.gms.internal.ads;

import F2.C0254t;
import F2.I0;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class zzedc implements zzebx {
    private final Context zza;
    private final zzcot zzb;
    private View zzc;
    private zzbox zzd;

    public zzedc(Context context, zzcot zzcotVar) {
        this.zza = context;
        this.zzb = zzcotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final Object zza(zzfar zzfarVar, final zzfaf zzfafVar, final zzebu zzebuVar) throws zzfbh {
        final View view;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhQ)).booleanValue() && zzfafVar.zzag) {
            try {
                view = (View) p105o3.b.t0(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfbh(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzecz
                            @Override // com.google.android.gms.internal.ads.zzgaj
                            public final I3.b zza(Object obj) {
                                return zzgbc.zzh(zzcpi.zza(this.zza.zza, view, zzfafVar));
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
            view = this.zzc;
        }
        zzcnq zzcnqVarZza = this.zzb.zza(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzcnw(view, null, new zzcpu() { // from class: com.google.android.gms.internal.ads.zzecy
            @Override // com.google.android.gms.internal.ads.zzcpu
            public final I0 zza() throws zzfbh {
                try {
                    return ((zzbqn) zzebuVar.zzb).zze();
                } catch (RemoteException e9) {
                    throw new zzfbh(e9);
                }
            }
        }, (zzfag) zzfafVar.zzu.get(0)));
        zzcnqVarZza.zzh().zza(view);
        ((zzedi) zzebuVar.zzc).zzc(zzcnqVarZza.zzj());
        return zzcnqVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) throws zzfbh {
        try {
            ((zzbqn) zzebuVar.zzb).zzq(zzfafVar.zzZ);
            zzedb zzedbVar = null;
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhQ)).booleanValue() && zzfafVar.zzag) {
                ((zzbqn) zzebuVar.zzb).zzk(zzfafVar.zzU, zzfafVar.zzv.toString(), zzfarVar.zza.zza.zzd, new p105o3.b(this.zza), new zzeda(this, zzebuVar, zzedbVar), (zzbou) zzebuVar.zzc, zzfarVar.zza.zza.zze);
            } else {
                ((zzbqn) zzebuVar.zzb).zzj(zzfafVar.zzU, zzfafVar.zzv.toString(), zzfarVar.zza.zza.zzd, new p105o3.b(this.zza), new zzeda(this, zzebuVar, zzedbVar), (zzbou) zzebuVar.zzc, zzfarVar.zza.zza.zze);
            }
        } catch (RemoteException e7) {
            throw new zzfbh(e7);
        }
    }
}
