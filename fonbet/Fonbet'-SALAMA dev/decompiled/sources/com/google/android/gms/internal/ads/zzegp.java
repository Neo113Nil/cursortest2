package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzegp implements zzebx {
    private final Context zza;
    private final Executor zzb;
    private final zzdmz zzc;

    public zzegp(Context context, Executor executor, zzdmz zzdmzVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdmzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        try {
            ((zzfby) zzebuVar.zzb).zzk(zzfarVar.zza.zza.zzd, zzfafVar.zzv.toString());
        } catch (Exception e7) {
            String str = zzebuVar.zza;
            int i7 = J.f3546b;
            j.h("Fail to load ad from adapter ".concat(String.valueOf(str)), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, final zzebu zzebuVar) {
        zzdmv zzd = this.zzc.zzd(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzdmw(new zzdez() { // from class: com.google.android.gms.internal.ads.zzegl
            @Override // com.google.android.gms.internal.ads.zzdez
            public final void zza(boolean z4, Context context, zzcvd zzcvdVar) {
                zzebu zzebuVar2 = zzebu.this;
                try {
                    ((zzfby) zzebuVar2.zzb).zzv(z4);
                    ((zzfby) zzebuVar2.zzb).zzA();
                } catch (zzfbh e7) {
                    int i7 = J.f3546b;
                    j.h("Cannot show rewarded video.", e7);
                    throw new zzdey(e7.getCause());
                }
            }
        }));
        zzd.zzd().zzo(new zzcld((zzfby) zzebuVar.zzb), this.zzb);
        zzcvx zze = zzd.zze();
        zzcuo zzb = zzd.zzb();
        ((zzedj) zzebuVar.zzc).zzc(new zzego(this, zzd.zza(), zzb, zze, zzd.zzg()));
        return zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        if (((zzfby) zzebuVar.zzb).zzC()) {
            zze(zzfarVar, zzfafVar, zzebuVar);
            return;
        }
        ((zzedj) zzebuVar.zzc).zzd(new zzegn(this, zzfarVar, zzfafVar, zzebuVar));
        Object obj = zzebuVar.zzb;
        Context context = this.zza;
        zzfba zzfbaVar = zzfarVar.zza.zza;
        ((zzfby) obj).zzh(context, zzfbaVar.zzd, null, (zzbvl) zzebuVar.zzc, zzfafVar.zzv.toString());
    }
}
