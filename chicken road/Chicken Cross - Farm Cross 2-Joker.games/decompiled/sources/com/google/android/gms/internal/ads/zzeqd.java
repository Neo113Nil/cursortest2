package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeqd {
    private final zzfmp zza;
    private final zzdxx zzb;
    private final zzeaj zzc;

    public zzeqd(zzfmp zzfmpVar, zzdxx zzdxxVar, zzeaj zzeajVar) {
        this.zza = zzfmpVar;
        this.zzb = zzdxxVar;
        this.zzc = zzeajVar;
    }

    public final void zza(zzflg zzflgVar, zzfld zzfldVar, int i, @Nullable zzemu zzemuVar, long j) {
        zzdxw zzdxwVar;
        zzeai zza = this.zzc.zza();
        zza.zza(zzflgVar);
        zza.zzb(zzfldVar);
        zza.zzc("action", "adapter_status");
        zza.zzc("adapter_l", String.valueOf(j));
        zza.zzc("sc", Integer.toString(i));
        if (zzemuVar != null) {
            zza.zzc("arec", Integer.toString(zzemuVar.zzb().zza));
            String zza2 = this.zza.zza(zzemuVar.getMessage());
            if (zza2 != null) {
                zza.zzc("areec", zza2);
            }
        }
        zzdxx zzdxxVar = this.zzb;
        Iterator it = zzfldVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdxwVar = null;
                break;
            } else {
                zzdxwVar = zzdxxVar.zzc((String) it.next());
                if (zzdxwVar != null) {
                    break;
                }
            }
        }
        if (zzdxwVar != null) {
            zza.zzc("ancn", zzdxwVar.zza);
            zzbyi zzbyiVar = zzdxwVar.zzb;
            if (zzbyiVar != null) {
                zza.zzc("adapter_v", zzbyiVar.toString());
            }
            zzbyi zzbyiVar2 = zzdxwVar.zzc;
            if (zzbyiVar2 != null) {
                zza.zzc("adapter_sv", zzbyiVar2.toString());
            }
        }
        zza.zzd();
    }
}
