package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.Tf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692Tf extends AbstractC1835yf {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e7->B:43:0x00e9, LOOP_START, PHI: r0
      0x00e7: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003d, B:43:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i5 = limit - position;
        int i6 = this.f16441b.f11557c;
        if (i6 != 3) {
            if (i6 != 4) {
                if (i6 != 21) {
                    if (i6 != 22) {
                        if (i6 != 268435456) {
                            if (i6 != 1342177280) {
                                if (i6 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                        ByteBuffer h3 = h(i5);
                        i = this.f16441b.f11557c;
                        if (i == 3) {
                            while (position < limit) {
                                h3.put((byte) 0);
                                h3.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i == 4) {
                            while (position < limit) {
                                short max = (short) (Math.max(-1.0f, Math.min(byteBuffer.getFloat(position), 1.0f)) * 32767.0f);
                                h3.put((byte) (max & 255));
                                h3.put((byte) ((max >> 8) & 255));
                                position += 4;
                            }
                        } else if (i == 21) {
                            while (position < limit) {
                                h3.put(byteBuffer.get(position + 1));
                                h3.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i == 22) {
                            while (position < limit) {
                                h3.put(byteBuffer.get(position + 2));
                                h3.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i == 268435456) {
                            while (position < limit) {
                                h3.put(byteBuffer.get(position + 1));
                                h3.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i == 1342177280) {
                            while (position < limit) {
                                h3.put(byteBuffer.get(position + 1));
                                h3.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else {
                            if (i != 1610612736) {
                                throw new IllegalStateException();
                            }
                            while (position < limit) {
                                h3.put(byteBuffer.get(position + 1));
                                h3.put(byteBuffer.get(position));
                                position += 4;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        h3.flip();
                    }
                }
                i5 /= 3;
            }
            i5 /= 2;
            ByteBuffer h32 = h(i5);
            i = this.f16441b.f11557c;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            h32.flip();
        }
        i5 += i5;
        ByteBuffer h322 = h(i5);
        i = this.f16441b.f11557c;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        h322.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final C0684Se e(C0684Se c0684Se) {
        int i = c0684Se.f11557c;
        if (i != 3) {
            if (i == 2) {
                return C0684Se.f11554e;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                throw new C0938ef(c0684Se);
            }
        }
        return new C0684Se(c0684Se.f11555a, c0684Se.f11556b, 2);
    }
}
