package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzidt implements zzihe {
    static {
        int i = zziew.zzb;
        int i2 = zzidv.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzihe
    public final /* synthetic */ Object zza(InputStream inputStream, zziew zziewVar) throws zzige {
        zzihz zzaU;
        zziem zzH = zziem.zzH(inputStream, 4096);
        zzigw zzigwVar = (zzigw) zzb(zzH, zziewVar);
        zzH.zzb(0);
        if (zzigwVar == null || zzigwVar.zzbi()) {
            return zzigwVar;
        }
        if (zzigwVar instanceof zzidr) {
            zzaU = ((zzidr) zzigwVar).zzaU();
        } else {
            if (zzigwVar instanceof zzids) {
                throw null;
            }
            zzaU = new zzihz(zzigwVar);
        }
        throw zzaU.zza();
    }
}
