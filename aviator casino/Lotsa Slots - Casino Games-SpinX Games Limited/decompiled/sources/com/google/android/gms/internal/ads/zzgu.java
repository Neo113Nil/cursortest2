package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgu {
    public static java.util.List zza(java.nio.ByteBuffer byteBuffer) {
        int remaining;
        java.nio.ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b = asReadOnlyBuffer.get();
                int i = b >> 3;
                if (((b >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b2 = asReadOnlyBuffer.get();
                        remaining |= (b2 & Byte.MAX_VALUE) << (i2 * 7);
                        if ((b2 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                int i3 = i & 15;
                java.nio.ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new com.google.android.gms.internal.ads.zzgs(i3, duplicate, null));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (java.nio.BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    static /* synthetic */ void zzb(boolean z) {
        if (z) {
            throw new com.google.android.gms.internal.ads.zzgr(null);
        }
    }
}
