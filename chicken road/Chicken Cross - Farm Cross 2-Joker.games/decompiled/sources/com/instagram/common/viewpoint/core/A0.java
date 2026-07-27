package com.instagram.common.viewpoint.core;

import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;

/* loaded from: assets/audience_network/classes2.dex */
public final class A0 extends AbstractC3375oQ {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    public static void A00(int i, ByteBuffer byteBuffer) {
        float pcm32BitFloat = (float) (i * 4.656612875245797E-10d);
        int floatBits = Float.floatToIntBits(pcm32BitFloat);
        if (floatBits == A00) {
            floatBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatBits);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3375oQ
    public final C16983i A09(C16983i c16983i) throws C16993j {
        int i = c16983i.A02;
        if (C5C.A14(i)) {
            if (i != 4) {
                return new C16983i(c16983i.A03, c16983i.A01, 4);
            }
            return C16983i.A05;
        }
        throw new C16993j(c16983i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC17003k
    public final void AHH(ByteBuffer byteBuffer) {
        ByteBuffer A002;
        int i = byteBuffer.position();
        int limit = byteBuffer.limit();
        int limit2 = limit - i;
        int position = this.A05.A02;
        switch (position) {
            case 536870912:
                int position2 = limit2 / 3;
                A002 = A00(position2 * 4);
                while (i < limit) {
                    int position3 = byteBuffer.get(i);
                    int limit3 = (position3 & 255) << 8;
                    int position4 = i + 1;
                    int limit4 = limit3 | ((byteBuffer.get(position4) & 255) << 16);
                    int position5 = i + 2;
                    A00(limit4 | ((byteBuffer.get(position5) & 255) << 24), A002);
                    i += 3;
                }
                break;
            case C.ENCODING_PCM_32BIT /* 805306368 */:
                A002 = A00(limit2);
                while (i < limit) {
                    int position6 = byteBuffer.get(i);
                    int limit5 = position6 & 255;
                    int position7 = i + 1;
                    int limit6 = limit5 | ((byteBuffer.get(position7) & 255) << 8);
                    int position8 = i + 2;
                    int limit7 = limit6 | ((byteBuffer.get(position8) & 255) << 16);
                    int position9 = i + 3;
                    A00(limit7 | ((byteBuffer.get(position9) & 255) << 24), A002);
                    i += 4;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        int position10 = byteBuffer.limit();
        byteBuffer.position(position10);
        A002.flip();
    }
}
