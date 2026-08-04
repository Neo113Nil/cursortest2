package C1;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class G extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f1394i = Float.floatToIntBits(Float.NaN);

    @Override // C1.InterfaceC0106l
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i7 = iLimit - iPosition;
        int i8 = this.f1557b.f1500c;
        int i9 = f1394i;
        if (i8 == 536870912) {
            byteBufferJ = j((i7 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i9) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferJ.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i8 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferJ = j(i7);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i9) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferJ.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // C1.w
    public final C0104j f(C0104j c0104j) throws C0105k {
        int i7 = c0104j.f1500c;
        if (i7 == 536870912 || i7 == 805306368 || i7 == 4) {
            return i7 != 4 ? new C0104j(c0104j.f1498a, c0104j.f1499b, 4) : C0104j.f1497e;
        }
        throw new C0105k(c0104j);
    }
}
