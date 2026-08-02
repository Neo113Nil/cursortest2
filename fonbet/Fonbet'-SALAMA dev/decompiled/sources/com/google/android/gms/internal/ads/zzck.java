package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzck extends zzch {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e3->B:43:0x00e5, LOOP_START, PHI: r2
      0x00e3: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:13:0x003c, B:43:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(ByteBuffer byteBuffer) {
        int i7;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i8 = limit - position;
        int i9 = this.zzb.zzd;
        if (i9 != 3) {
            if (i9 != 4) {
                if (i9 != 21) {
                    if (i9 != 22) {
                        if (i9 != 268435456) {
                            if (i9 != 1342177280) {
                                if (i9 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                        ByteBuffer zzj = zzj(i8);
                        i7 = this.zzb.zzd;
                        if (i7 == 3) {
                            while (position < limit) {
                                zzj.put((byte) 0);
                                zzj.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i7 == 4) {
                            while (position < limit) {
                                float f7 = byteBuffer.getFloat(position);
                                int i10 = zzen.zza;
                                short max = (short) (Math.max(-1.0f, Math.min(f7, 1.0f)) * 32767.0f);
                                zzj.put((byte) (max & 255));
                                zzj.put((byte) ((max >> 8) & 255));
                                position += 4;
                            }
                        } else if (i7 == 21) {
                            while (position < limit) {
                                zzj.put(byteBuffer.get(position + 1));
                                zzj.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i7 == 22) {
                            while (position < limit) {
                                zzj.put(byteBuffer.get(position + 2));
                                zzj.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i7 == 268435456) {
                            while (position < limit) {
                                zzj.put(byteBuffer.get(position + 1));
                                zzj.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i7 == 1342177280) {
                            while (position < limit) {
                                zzj.put(byteBuffer.get(position + 1));
                                zzj.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else {
                            if (i7 != 1610612736) {
                                throw new IllegalStateException();
                            }
                            while (position < limit) {
                                zzj.put(byteBuffer.get(position + 1));
                                zzj.put(byteBuffer.get(position));
                                position += 4;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        zzj.flip();
                    }
                }
                i8 /= 3;
            }
            i8 /= 2;
            ByteBuffer zzj2 = zzj(i8);
            i7 = this.zzb.zzd;
            if (i7 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            zzj2.flip();
        }
        i8 += i8;
        ByteBuffer zzj22 = zzj(i8);
        i7 = this.zzb.zzd;
        if (i7 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        zzj22.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzce zzi(zzce zzceVar) {
        int i7 = zzceVar.zzd;
        if (i7 != 3) {
            if (i7 == 2) {
                return zzce.zza;
            }
            if (i7 != 268435456 && i7 != 21 && i7 != 1342177280 && i7 != 22 && i7 != 1610612736 && i7 != 4) {
                throw new zzcf("Unhandled input format:", zzceVar);
            }
        }
        return new zzce(zzceVar.zzb, zzceVar.zzc, 2);
    }
}
