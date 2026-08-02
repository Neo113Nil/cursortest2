package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import o3.BinderC1507b;
import y2.EnumC1798b;

/* loaded from: classes.dex */
final class zzedr implements zzdez {
    private final zzfaf zza;
    private final zzbqn zzb;
    private final EnumC1798b zzc;
    private zzcvi zzd = null;

    public zzedr(zzfaf zzfafVar, zzbqn zzbqnVar, EnumC1798b enumC1798b) {
        this.zza = zzfafVar;
        this.zzb = zzbqnVar;
        this.zzc = enumC1798b;
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final void zza(boolean z4, Context context, zzcvd zzcvdVar) {
        boolean zzs;
        try {
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzs = this.zzb.zzs(new BinderC1507b(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        zzs = this.zzb.zzr(new BinderC1507b(context));
                    }
                    throw new zzdey("Adapter failed to show.");
                }
                zzs = this.zzb.zzt(new BinderC1507b(context));
            }
            if (zzs) {
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
