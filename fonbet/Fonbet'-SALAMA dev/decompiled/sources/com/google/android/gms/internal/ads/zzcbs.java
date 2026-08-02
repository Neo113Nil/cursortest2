package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzcbs {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzaqr zzaqrVar;
        zzaqq zzaqqVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzaqm(new zzcbr(duplicate), zzcbv.zzb).zzd().iterator();
            while (true) {
                zzaqrVar = null;
                if (!it.hasNext()) {
                    zzaqqVar = null;
                    break;
                }
                zzaqo zzaqoVar = (zzaqo) it.next();
                if (zzaqoVar instanceof zzaqq) {
                    zzaqqVar = (zzaqq) zzaqoVar;
                    break;
                }
            }
            Iterator it2 = zzaqqVar.zzd().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzaqo zzaqoVar2 = (zzaqo) it2.next();
                if (zzaqoVar2 instanceof zzaqr) {
                    zzaqrVar = (zzaqr) zzaqoVar2;
                    break;
                }
            }
            long zzc = (zzaqrVar.zzc() * 1000) / zzaqrVar.zzd();
            this.zza = zzc;
            return zzc;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
