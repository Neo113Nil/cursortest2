package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeft implements zzebx {
    private final Context zza;
    private final Executor zzb;
    private final zzdmz zzc;

    public zzeft(Context context, Executor executor, zzdmz zzdmzVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, final zzebu zzebuVar) {
        zzdmv zzd = this.zzc.zzd(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzdmw(new zzdez() { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // com.google.android.gms.internal.ads.zzdez
            public final void zza(boolean z4, Context context, zzcvd zzcvdVar) {
                zzebu zzebuVar2 = zzebu.this;
                try {
                    ((zzfby) zzebuVar2.zzb).zzv(z4);
                    ((zzfby) zzebuVar2.zzb).zzz(context);
                } catch (zzfbh e7) {
                    throw new zzdey(e7.getCause());
                }
            }
        }));
        zzd.zzd().zzo(new zzcld((zzfby) zzebuVar.zzb), this.zzb);
        ((zzedi) zzebuVar.zzc).zzc(zzd.zzn());
        return zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        try {
            zzfba zzfbaVar = zzfarVar.zza.zza;
            if (zzfbaVar.zzo.zza == 3) {
                ((zzfby) zzebuVar.zzb).zzr(this.zza, zzfbaVar.zzd, zzfafVar.zzv.toString(), (zzbou) zzebuVar.zzc);
            } else {
                ((zzfby) zzebuVar.zzb).zzq(this.zza, zzfbaVar.zzd, zzfafVar.zzv.toString(), (zzbou) zzebuVar.zzc);
            }
        } catch (Exception e7) {
            String str = zzebuVar.zza;
            int i7 = J.f3546b;
            j.h("Fail to load ad from adapter ".concat(String.valueOf(str)), e7);
        }
    }
}
