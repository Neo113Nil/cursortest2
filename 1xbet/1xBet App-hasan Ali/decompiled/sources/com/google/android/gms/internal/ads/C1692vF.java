package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.vF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1692vF extends AbstractC1835yf {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void n(int i5, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i5 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1431pf
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer h3;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i5 = limit - position;
        int i6 = this.f16441b.f11557c;
        if (i6 == 21) {
            h3 = h((i5 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), h3);
                position += 3;
            }
        } else if (i6 == 22) {
            h3 = h(i5);
            while (position < limit) {
                int i7 = byteBuffer.get(position) & 255;
                int i8 = (byteBuffer.get(position + 1) & 255) << 8;
                n(i7 | i8 | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), h3);
                position += 4;
            }
        } else if (i6 == 1342177280) {
            h3 = h((i5 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), h3);
                position += 3;
            }
        } else {
            if (i6 != 1610612736) {
                throw new IllegalStateException();
            }
            h3 = h(i5);
            while (position < limit) {
                int i9 = byteBuffer.get(position + 3) & 255;
                int i10 = (byteBuffer.get(position + 2) & 255) << 8;
                n(i9 | i10 | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), h3);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        h3.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835yf
    public final C0684Se e(C0684Se c0684Se) {
        int i5 = AbstractC1260lo.f14419a;
        int i6 = c0684Se.f11557c;
        if (i6 == 21 || i6 == 1342177280 || i6 == 22 || i6 == 1610612736) {
            return new C0684Se(c0684Se.f11555a, c0684Se.f11556b, 4);
        }
        if (i6 == 4) {
            return C0684Se.f11554e;
        }
        throw new C0938ef(c0684Se);
    }
}
