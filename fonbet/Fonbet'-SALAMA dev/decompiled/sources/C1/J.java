package C1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class J extends w {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[ADDED_TO_REGION, LOOP:4: B:33:0x00ae->B:34:0x00b0, LOOP_START, PHI: r0
      0x00ae: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0036, B:34:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // C1.InterfaceC0106l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ByteBuffer byteBuffer) {
        int i7;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i8 = limit - position;
        int i9 = this.f1557b.f1500c;
        if (i9 != 3) {
            if (i9 != 4) {
                if (i9 != 268435456) {
                    if (i9 == 536870912) {
                        i8 /= 3;
                    } else if (i9 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer j = j(i8);
                i7 = this.f1557b.f1500c;
                if (i7 == 3) {
                    while (position < limit) {
                        j.put((byte) 0);
                        j.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i7 == 4) {
                    while (position < limit) {
                        short i10 = (short) (v2.t.i(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                        j.put((byte) (i10 & 255));
                        j.put((byte) ((i10 >> 8) & 255));
                        position += 4;
                    }
                } else if (i7 == 268435456) {
                    while (position < limit) {
                        j.put(byteBuffer.get(position + 1));
                        j.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i7 == 536870912) {
                    while (position < limit) {
                        j.put(byteBuffer.get(position + 1));
                        j.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else {
                    if (i7 != 805306368) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        j.put(byteBuffer.get(position + 2));
                        j.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                j.flip();
            }
            i8 /= 2;
            ByteBuffer j3 = j(i8);
            i7 = this.f1557b.f1500c;
            if (i7 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            j3.flip();
        }
        i8 *= 2;
        ByteBuffer j32 = j(i8);
        i7 = this.f1557b.f1500c;
        if (i7 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        j32.flip();
    }

    @Override // C1.w
    public final C0104j f(C0104j c0104j) {
        int i7 = c0104j.f1500c;
        if (i7 == 3 || i7 == 2 || i7 == 268435456 || i7 == 536870912 || i7 == 805306368 || i7 == 4) {
            return i7 != 2 ? new C0104j(c0104j.f1498a, c0104j.f1499b, 2) : C0104j.f1497e;
        }
        throw new C0105k(c0104j);
    }
}
