package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzacn {
    private final java.nio.ByteBuffer zza = java.nio.ByteBuffer.allocateDirect(500);
    private com.google.android.gms.internal.ads.zzgt zzb;

    private final void zzd(java.util.List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((com.google.android.gms.internal.ads.zzgs) list.get(i)).zza == 1) {
                this.zzb = com.google.android.gms.internal.ads.zzgt.zza((com.google.android.gms.internal.ads.zzgs) list.get(i));
            }
        }
    }

    private final void zze() {
        java.nio.ByteBuffer byteBuffer = this.zza;
        byteBuffer.position(byteBuffer.limit());
    }

    public final int zza(java.nio.ByteBuffer byteBuffer, boolean z) {
        java.nio.ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.hasRemaining()) {
            zzd(com.google.android.gms.internal.ads.zzgu.zza(byteBuffer2));
            zze();
        }
        java.util.List zza = com.google.android.gms.internal.ads.zzgu.zza(byteBuffer);
        zzd(zza);
        int size = zza.size() - 1;
        int i = 0;
        while (size >= 0) {
            com.google.android.gms.internal.ads.zzgs zzgsVar = (com.google.android.gms.internal.ads.zzgs) zza.get(size);
            int i2 = zzgsVar.zza;
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
                com.google.android.gms.internal.ads.zzgt zzgtVar = this.zzb;
                if (zzgtVar == null) {
                    break;
                }
                com.google.android.gms.internal.ads.zzgq zzb = com.google.android.gms.internal.ads.zzgq.zzb(zzgtVar, zzgsVar);
                if (zzb == null) {
                    break;
                }
                if (zzb.zza()) {
                    break;
                }
            }
            if (((com.google.android.gms.internal.ads.zzgs) zza.get(size)).zza == 6 || ((com.google.android.gms.internal.ads.zzgs) zza.get(size)).zza == 3) {
                i++;
            }
            size--;
        }
        return (i > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? ((com.google.android.gms.internal.ads.zzgs) zza.get(size)).zzb.limit() : byteBuffer.position();
    }

    public final void zzb(java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        byteBuffer.limit(java.lang.Math.min(limit, position + 500));
        java.nio.ByteBuffer byteBuffer2 = this.zza;
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
