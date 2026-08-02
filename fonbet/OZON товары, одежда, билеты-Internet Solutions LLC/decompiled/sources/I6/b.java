package I6;

import java.nio.ByteOrder;

/* loaded from: classes8.dex */
public final class b extends L6.b {
    public b() {
        d(10240);
    }

    @Override // L6.b
    public final void d(int i11) {
        super.d(i11);
        this.f16576a.order(ByteOrder.BIG_ENDIAN);
    }

    public final void g(int i11) {
        b((byte) (i11 & 255));
        b((byte) ((i11 >> 8) & 255));
        b((byte) ((i11 >> 16) & 255));
        b((byte) ((i11 >> 24) & 255));
    }

    public final void h(int i11) {
        b((byte) ((i11 >> 24) & 255));
        b((byte) ((i11 >> 16) & 255));
        b((byte) ((i11 >> 8) & 255));
        b((byte) (i11 & 255));
    }
}
