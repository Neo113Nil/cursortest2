package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcv extends com.google.android.gms.internal.ads.zzcp {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b A[ADDED_TO_REGION, LOOP:7: B:48:0x011b->B:49:0x011d, LOOP_START, PHI: r0
      0x011b: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:15:0x0044, B:49:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(java.nio.ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.zzb.zzd;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 21) {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    if (i3 != 1879048192) {
                                        throw new java.lang.IllegalStateException();
                                    }
                                    i2 /= 4;
                                }
                            }
                        }
                        java.nio.ByteBuffer zzk = zzk(i2);
                        i = this.zzb.zzd;
                        if (i == 3) {
                            while (position < limit) {
                                zzk.put((byte) 0);
                                zzk.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i == 4) {
                            while (position < limit) {
                                float f = byteBuffer.getFloat(position);
                                java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                                short max = (short) (java.lang.Math.max(-1.0f, java.lang.Math.min(f, 1.0f)) * 32767.0f);
                                zzk.put((byte) (max & 255));
                                zzk.put((byte) ((max >> 8) & 255));
                                position += 4;
                            }
                        } else if (i == 21) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i == 22) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 2));
                                zzk.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i == 268435456) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i == 1342177280) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else if (i == 1610612736) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 4;
                            }
                        } else {
                            if (i != 1879048192) {
                                throw new java.lang.IllegalStateException();
                            }
                            while (position < limit) {
                                short zzm = (short) (com.google.android.gms.internal.ads.zzfl.zzm(byteBuffer.getDouble(position), -1.0d, 1.0d) * 32767.0d);
                                zzk.put((byte) (zzm & 255));
                                zzk.put((byte) ((zzm >> 8) & 255));
                                position += 8;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        zzk.flip();
                    }
                }
                i2 /= 3;
            }
            i2 /= 2;
            java.nio.ByteBuffer zzk2 = zzk(i2);
            i = this.zzb.zzd;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            zzk2.flip();
        }
        i2 += i2;
        java.nio.ByteBuffer zzk22 = zzk(i2);
        i = this.zzb.zzd;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        zzk22.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final com.google.android.gms.internal.ads.zzcl zzm(com.google.android.gms.internal.ads.zzcl zzclVar) throws com.google.android.gms.internal.ads.zzcn {
        int i = zzclVar.zzd;
        if (com.google.android.gms.internal.ads.zzfl.zzD(i)) {
            return i != 2 ? new com.google.android.gms.internal.ads.zzcl(zzclVar.zzb, zzclVar.zzc, 2) : com.google.android.gms.internal.ads.zzcl.zza;
        }
        throw new com.google.android.gms.internal.ads.zzcn("Unhandled input format:", zzclVar);
    }
}
