package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzidj extends zzicu {
    public static final zzidj zza = new zzidj();

    private zzidj() {
    }

    public final void zza(zzidn zzidnVar, zzico zzicoVar) throws IOException {
        if (zzicoVar == null || (zzicoVar instanceof zzicp)) {
            zzidnVar.zzj();
            return;
        }
        if (zzicoVar instanceof zzics) {
            zzics zzg = zzicoVar.zzg();
            if (zzg.zzc()) {
                zzidnVar.zzi(zzg.zzh());
                return;
            } else if (zzg.zza()) {
                zzidnVar.zzh(zzg.zzb());
                return;
            } else {
                zzidnVar.zzg(zzg.zzd());
                return;
            }
        }
        if (zzicoVar instanceof zzicn) {
            zzidnVar.zzb();
            Iterator it = zzicoVar.zzf().iterator();
            while (it.hasNext()) {
                zza(zzidnVar, (zzico) it.next());
            }
            zzidnVar.zzc();
            return;
        }
        if (!(zzicoVar instanceof zzicq)) {
            String valueOf = String.valueOf(zzicoVar.getClass());
            String.valueOf(valueOf);
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(valueOf)));
        }
        zzidnVar.zzd();
        for (Map.Entry entry : zzicoVar.zze().zzb()) {
            zzidnVar.zzf((String) entry.getKey());
            zza(zzidnVar, (zzico) entry.getValue());
        }
        zzidnVar.zze();
    }
}
