package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzeoo implements zzdom {
    private final zzfld zza;
    private final zzbxt zzb;
    private final AdFormat zzc;
    private zzdeh zzd = null;

    zzeoo(zzfld zzfldVar, zzbxt zzbxtVar, AdFormat adFormat) {
        this.zza = zzfldVar;
        this.zzb = zzbxtVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final void zza(boolean z, Context context, zzdec zzdecVar) throws zzdol {
        boolean zzk;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzk = this.zzb.zzk(ObjectWrapper.wrap(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        zzk = this.zzb.zzt(ObjectWrapper.wrap(context));
                    }
                    throw new zzdol("Adapter failed to show.");
                }
                zzk = this.zzb.zzm(ObjectWrapper.wrap(context));
            }
            if (zzk) {
                zzdeh zzdehVar = this.zzd;
                if (zzdehVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcm)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzdehVar.zza();
                return;
            }
            throw new zzdol("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdol(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final zzfld zzb() {
        return this.zza;
    }

    public final void zzc(zzdeh zzdehVar) {
        this.zzd = zzdehVar;
    }
}
