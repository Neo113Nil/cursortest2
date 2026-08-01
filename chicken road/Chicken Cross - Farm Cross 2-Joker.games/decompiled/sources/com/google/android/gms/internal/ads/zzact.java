package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzact {
    private final ByteBuffer zza = ByteBuffer.allocateDirect(500);
    private zzgw zzb;

    private final void zzd(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((zzgv) list.get(i)).zza == 1) {
                this.zzb = zzgw.zza((zzgv) list.get(i));
            }
        }
    }

    private final void zze() {
        ByteBuffer byteBuffer = this.zza;
        byteBuffer.position(byteBuffer.limit());
    }

    public final int zza(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.hasRemaining()) {
            zzd(zzgx.zza(byteBuffer2));
            zze();
        }
        List zza = zzgx.zza(byteBuffer);
        zzd(zza);
        int size = zza.size() - 1;
        int i = 0;
        while (size >= 0) {
            zzgv zzgvVar = (zzgv) zza.get(size);
            int i2 = zzgvVar.zza;
            if (i2 != 2 && i2 != 15) {
                if (i2 == 3) {
                    if (!z) {
                        break;
                    }
                    i2 = 3;
                }
                if (i2 != 6) {
                    if (i2 != 3) {
                        break;
                    }
                }
                zzgw zzgwVar = this.zzb;
                if (zzgwVar == null) {
                    break;
                }
                zzgs zzb = zzgs.zzb(zzgwVar, zzgvVar);
                if (zzb == null) {
                    break;
                }
                if (zzb.zza()) {
                    break;
                }
            }
            if (((zzgv) zza.get(size)).zza == 6 || ((zzgv) zza.get(size)).zza == 3) {
                i++;
            }
            size--;
        }
        return (i > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? ((zzgv) zza.get(size)).zzb.limit() : byteBuffer.position();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, position + 500));
        ByteBuffer byteBuffer2 = this.zza;
        byteBuffer2.clear();
        byteBuffer2.put(byteBuffer);
        byteBuffer2.flip();
        byteBuffer.position(position);
        byteBuffer.limit(limit);
    }

    public final void zzc() {
        this.zzb = null;
        zze();
    }
}
