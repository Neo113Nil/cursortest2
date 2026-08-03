package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzuc extends com.google.android.gms.internal.ads.zzcp {
    private static void zzq(int i, java.nio.ByteBuffer byteBuffer) {
        float f = (float) (i * 4.656612875245797E-10d);
        byteBuffer.putInt(java.lang.Float.isNaN(f) ? 0 : java.lang.Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer zzk;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.zzb.zzd;
        if (i2 == 2) {
            zzk = zzk(i + i);
            while (position < limit) {
                zzq(byteBuffer.getShort(position) << 16, zzk);
                position += 2;
            }
        } else if (i2 == 3) {
            zzk = zzk(i * 4);
            while (position < limit) {
                zzq(((byteBuffer.get(position) & 255) - 128) << 24, zzk);
                position++;
            }
        } else if (i2 == 21) {
            zzk = zzk((i / 3) * 4);
            while (position < limit) {
                zzq(com.google.android.gms.internal.ads.zzhah.zze(byteBuffer.get(position + 2), byteBuffer.get(position + 1), byteBuffer.get(position), (byte) 0), zzk);
                position += 3;
            }
        } else if (i2 == 22) {
            zzk = zzk(i);
            while (position < limit) {
                zzq(byteBuffer.getInt(position), zzk);
                position += 4;
            }
        } else if (i2 == 268435456) {
            zzk = zzk(i + i);
            while (position < limit) {
                zzq(java.lang.Short.reverseBytes(byteBuffer.getShort(position)) << 16, zzk);
                position += 2;
            }
        } else if (i2 == 1342177280) {
            zzk = zzk((i / 3) * 4);
            while (position < limit) {
                zzq(com.google.android.gms.internal.ads.zzhah.zze(byteBuffer.get(position), byteBuffer.get(position + 1), byteBuffer.get(position + 2), (byte) 0), zzk);
                position += 3;
            }
        } else if (i2 == 1610612736) {
            zzk = zzk(i);
            while (position < limit) {
                zzq(java.lang.Integer.reverseBytes(byteBuffer.getInt(position)), zzk);
                position += 4;
            }
        } else {
            if (i2 != 1879048192) {
                throw new java.lang.IllegalStateException();
            }
            zzk = zzk(i / 2);
            while (position < limit) {
                zzk.putFloat((float) byteBuffer.getDouble(position));
                position += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        zzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final com.google.android.gms.internal.ads.zzcl zzm(com.google.android.gms.internal.ads.zzcl zzclVar) throws com.google.android.gms.internal.ads.zzcn {
        int i = zzclVar.zzd;
        if (com.google.android.gms.internal.ads.zzfl.zzD(i)) {
            return i != 4 ? new com.google.android.gms.internal.ads.zzcl(zzclVar.zzb, zzclVar.zzc, 4) : com.google.android.gms.internal.ads.zzcl.zza;
        }
        throw new com.google.android.gms.internal.ads.zzcn("Unhandled input format:", zzclVar);
    }
}
