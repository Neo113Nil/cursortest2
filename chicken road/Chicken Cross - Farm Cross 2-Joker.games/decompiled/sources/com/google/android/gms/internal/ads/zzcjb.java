package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcjb {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzavg zzavgVar;
        zzavf zzavfVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzavb(new zzcja(duplicate), zzcjf.zzb).zzc().iterator();
            while (true) {
                zzavgVar = null;
                if (!it.hasNext()) {
                    zzavfVar = null;
                    break;
                }
                zzavd zzavdVar = (zzavd) it.next();
                if (zzavdVar instanceof zzavf) {
                    zzavfVar = (zzavf) zzavdVar;
                    break;
                }
            }
            Iterator it2 = zzavfVar.zzc().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzavd zzavdVar2 = (zzavd) it2.next();
                if (zzavdVar2 instanceof zzavg) {
                    zzavgVar = (zzavg) zzavdVar2;
                    break;
                }
            }
            long zzd = (zzavgVar.zzd() * 1000) / zzavgVar.zzc();
            this.zza = zzd;
            return zzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
