package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zztg extends com.google.android.gms.internal.ads.zzcp {
    private com.google.android.gms.internal.ads.zzhaf zzd;
    private com.google.android.gms.internal.ads.zzhaf zze;

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(java.nio.ByteBuffer byteBuffer) {
        com.google.android.gms.internal.ads.zzhaf zzhafVar = this.zze;
        zzhafVar.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        java.nio.ByteBuffer zzk = zzk(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i = 0; i < zzhafVar.zzh(); i++) {
                int zzG = (com.google.android.gms.internal.ads.zzfl.zzG(this.zzb.zzd) * zzhafVar.zzi(i)) + position;
                int i2 = this.zzb.zzd;
                if (i2 != 2) {
                    if (i2 == 3) {
                        zzk.put(byteBuffer.get(zzG));
                    } else if (i2 != 4) {
                        if (i2 != 21) {
                            if (i2 != 22) {
                                if (i2 != 268435456) {
                                    if (i2 != 1342177280) {
                                        if (i2 != 1610612736) {
                                            if (i2 != 1879048192) {
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 21);
                                                sb.append("Unexpected encoding: ");
                                                sb.append(i2);
                                                throw new java.lang.IllegalStateException(sb.toString());
                                            }
                                            zzk.putDouble(byteBuffer.getDouble(zzG));
                                        }
                                    }
                                }
                            }
                            zzk.putInt(byteBuffer.getInt(zzG));
                        }
                        byte b = byteBuffer.get(byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN ? zzG : zzG + 2);
                        byte b2 = byteBuffer.get(zzG + 1);
                        if (byteBuffer.order() == java.nio.ByteOrder.BIG_ENDIAN) {
                            zzG += 2;
                        }
                        int i3 = ((b << com.google.common.base.Ascii.CAN) & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) | ((b2 << com.google.common.base.Ascii.DLE) & 16711680) | ((byteBuffer.get(zzG) << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK);
                        int i4 = i3 >> 8;
                        com.google.android.gms.internal.ads.zzgtj.zzf((i4 & androidx.core.view.ViewCompat.MEASURED_STATE_MASK) == 0 || (i4 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", java.lang.Integer.toHexString(i4));
                        com.google.android.gms.internal.ads.zzgtj.zza(zzk.remaining() >= 3);
                        zzk.put((byte) (zzk.order() == java.nio.ByteOrder.BIG_ENDIAN ? (i3 >> 24) & 255 : i4 & 255)).put((byte) ((i3 >> 16) & 255)).put((byte) (zzk.order() == java.nio.ByteOrder.BIG_ENDIAN ? i4 & 255 : (i3 >> 24) & 255));
                    } else {
                        zzk.putFloat(byteBuffer.getFloat(zzG));
                    }
                }
                zzk.putShort(byteBuffer.getShort(zzG));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final com.google.android.gms.internal.ads.zzcl zzm(com.google.android.gms.internal.ads.zzcl zzclVar) throws com.google.android.gms.internal.ads.zzcn {
        com.google.android.gms.internal.ads.zzhaf zzhafVar = this.zzd;
        if (zzhafVar == null) {
            return com.google.android.gms.internal.ads.zzcl.zza;
        }
        int i = zzclVar.zzd;
        if (!com.google.android.gms.internal.ads.zzfl.zzD(i)) {
            throw new com.google.android.gms.internal.ads.zzcn("Unhandled input format:", zzclVar);
        }
        int zzh = zzhafVar.zzh();
        int i2 = zzclVar.zzc;
        boolean z = i2 != zzh;
        int i3 = 0;
        while (i3 < zzh) {
            int zzi = zzhafVar.zzi(i3);
            if (zzi >= i2) {
                java.lang.String obj = zzhafVar.toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 59);
                sb.append("Channel map (");
                sb.append(obj);
                sb.append(") trying to access non-existent input channel.");
                throw new com.google.android.gms.internal.ads.zzcn(sb.toString(), zzclVar);
            }
            z |= zzi != i3;
            i3++;
        }
        return z ? new com.google.android.gms.internal.ads.zzcl(zzclVar.zzb, zzh, i) : com.google.android.gms.internal.ads.zzcl.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzo(com.google.android.gms.internal.ads.zzcm zzcmVar) {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(com.google.android.gms.internal.ads.zzhaf zzhafVar) {
        this.zzd = zzhafVar;
    }
}
