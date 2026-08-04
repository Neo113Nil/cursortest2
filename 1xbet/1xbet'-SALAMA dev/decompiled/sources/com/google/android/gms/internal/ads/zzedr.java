package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import p167y2.EnumC1058b;

/* JADX INFO: loaded from: classes.dex */
final class zzedr implements zzdez {
    private final zzfaf zza;
    private final zzbqn zzb;
    private final EnumC1058b zzc;
    private zzcvi zzd = null;

    public zzedr(zzfaf zzfafVar, zzbqn zzbqnVar, EnumC1058b enumC1058b) {
        this.zza = zzfafVar;
        this.zzb = zzbqnVar;
        this.zzc = enumC1058b;
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final void zza(boolean z4, Context context, zzcvd zzcvdVar) throws zzdey {
        boolean zZzs;
        try {
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzs = this.zzb.zzs(new p105o3.b(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzs = this.zzb.zzr(new p105o3.b(context));
                    }
                    throw new zzdey("Adapter failed to show.");
                }
                zZzs = this.zzb.zzt(new p105o3.b(context));
            }
            if (zZzs) {
                zzcvi zzcviVar = this.zzd;
                if (zzcviVar == null) {
                    return;
                }
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbH)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzcviVar.zza();
                return;
            }
            throw new zzdey("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdey(th);
        }
    }

    public final void zzb(zzcvi zzcviVar) {
        this.zzd = zzcviVar;
    }
}
