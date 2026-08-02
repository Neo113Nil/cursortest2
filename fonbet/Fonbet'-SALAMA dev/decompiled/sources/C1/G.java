package C1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class G extends w {

    /* renamed from: i, reason: collision with root package name */
    public static final int f1394i = Float.floatToIntBits(Float.NaN);

    @Override // C1.InterfaceC0106l
    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer j;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        int i8 = this.f1557b.f1500c;
        int i9 = f1394i;
        if (i8 == 536870912) {
            j = j((i7 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits == i9) {
                    floatToIntBits = Float.floatToIntBits(0.0f);
                }
                j.putInt(floatToIntBits);
                position += 3;
            }
        } else {
            if (i8 != 805306368) {
                throw new IllegalStateException();
            }
            j = j(i7);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i9) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                j.putInt(floatToIntBits2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j.flip();
    }

    @Override // C1.w
    public final C0104j f(C0104j c0104j) {
        int i7 = c0104j.f1500c;
        if (i7 == 536870912 || i7 == 805306368 || i7 == 4) {
            return i7 != 4 ? new C0104j(c0104j.f1498a, c0104j.f1499b, 4) : C0104j.f1497e;
        }
        throw new C0105k(c0104j);
    }
}
