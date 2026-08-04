package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
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
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzaqm(new zzcbr(byteBufferDuplicate), zzcbv.zzb).zzd().iterator();
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
            for (zzaqo zzaqoVar2 : zzaqqVar.zzd()) {
                if (zzaqoVar2 instanceof zzaqr) {
                    zzaqrVar = (zzaqr) zzaqoVar2;
                    break;
                }
            }
            long jZzc = (zzaqrVar.zzc() * 1000) / zzaqrVar.zzd();
            this.zza = jZzc;
            return jZzc;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
