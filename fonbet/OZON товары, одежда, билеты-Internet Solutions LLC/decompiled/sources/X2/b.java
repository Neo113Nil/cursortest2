package X2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes8.dex */
public final class b extends c {
    public static b c(ByteBuffer byteBuffer) {
        b bVar = new b();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        bVar.b(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
        return bVar;
    }

    public final void d(a aVar, int i11) {
        int a11 = a(6);
        if (a11 != 0) {
            int i12 = a11 + this.f34007a;
            int i13 = (i11 * 4) + this.f34008b.getInt(i12) + i12 + 4;
            aVar.b(this.f34008b.getInt(i13) + i13, this.f34008b);
        }
    }

    public final int e() {
        int a11 = a(6);
        if (a11 == 0) {
            return 0;
        }
        int i11 = a11 + this.f34007a;
        return this.f34008b.getInt(this.f34008b.getInt(i11) + i11);
    }

    public final int f() {
        int a11 = a(4);
        if (a11 != 0) {
            return this.f34008b.getInt(a11 + this.f34007a);
        }
        return 0;
    }
}
