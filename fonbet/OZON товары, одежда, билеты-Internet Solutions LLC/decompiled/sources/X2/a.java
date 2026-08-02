package X2;

import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class a extends c {
    public final int c(int i11) {
        int a11 = a(16);
        if (a11 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = this.f34008b;
        int i12 = a11 + this.f34007a;
        return byteBuffer.getInt((i11 * 4) + byteBuffer.getInt(i12) + i12 + 4);
    }

    public final int d() {
        int a11 = a(16);
        if (a11 == 0) {
            return 0;
        }
        int i11 = a11 + this.f34007a;
        return this.f34008b.getInt(this.f34008b.getInt(i11) + i11);
    }

    public final boolean e() {
        int a11 = a(6);
        return (a11 == 0 || this.f34008b.get(a11 + this.f34007a) == 0) ? false : true;
    }

    public final short f() {
        int a11 = a(14);
        if (a11 != 0) {
            return this.f34008b.getShort(a11 + this.f34007a);
        }
        return (short) 0;
    }

    public final int g() {
        int a11 = a(4);
        if (a11 != 0) {
            return this.f34008b.getInt(a11 + this.f34007a);
        }
        return 0;
    }

    public final short h() {
        int a11 = a(8);
        if (a11 != 0) {
            return this.f34008b.getShort(a11 + this.f34007a);
        }
        return (short) 0;
    }

    public final short i() {
        int a11 = a(12);
        if (a11 != 0) {
            return this.f34008b.getShort(a11 + this.f34007a);
        }
        return (short) 0;
    }
}
