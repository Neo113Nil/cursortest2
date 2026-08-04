package C1;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class J extends w {
    @Override // C1.InterfaceC0106l
    public final void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i7 = iLimit - iPosition;
        int i8 = this.f1557b.f1500c;
        if (i8 == 3) {
            i7 *= 2;
        } else if (i8 == 4) {
            i7 /= 2;
        } else if (i8 != 268435456) {
            if (i8 != 536870912) {
                if (i8 != 805306368) {
                    throw new IllegalStateException();
                }
                i7 /= 2;
            } else {
                i7 /= 3;
                i7 *= 2;
            }
        }
        ByteBuffer byteBufferJ = j(i7);
        int i9 = this.f1557b.f1500c;
        if (i9 == 3) {
            while (iPosition < iLimit) {
                byteBufferJ.put((byte) 0);
                byteBufferJ.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i9 == 4) {
            while (iPosition < iLimit) {
                short sI = (short) (p151v2.t.i(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferJ.put((byte) (sI & 255));
                byteBufferJ.put((byte) ((sI >> 8) & 255));
                iPosition += 4;
            }
        } else if (i9 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i9 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 1));
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i9 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferJ.put(byteBuffer.get(iPosition + 2));
                byteBufferJ.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // C1.w
    public final C0104j f(C0104j c0104j) throws C0105k {
        int i7 = c0104j.f1500c;
        if (i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 536870912 || i7 == 805306368 || i7 == 4) {
            return i7 != 2 ? new C0104j(c0104j.f1498a, c0104j.f1499b, 2) : C0104j.f1497e;
        }
        throw new C0105k(c0104j);
    }
}
