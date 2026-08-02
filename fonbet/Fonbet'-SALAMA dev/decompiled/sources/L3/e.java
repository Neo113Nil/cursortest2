package L3;

import androidx.datastore.preferences.protobuf.C0683g;
import androidx.datastore.preferences.protobuf.C0700y;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import com.google.crypto.tink.shaded.protobuf.C0874j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public int f4334a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4335b;

    public static int d(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long e(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C0874j h(byte[] bArr, int i7, int i8, boolean z4) {
        C0874j c0874j = new C0874j(bArr, i7, i8, z4);
        try {
            c0874j.l(i8);
            return c0874j;
        } catch (C e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i7);

    public void G() {
        int C3;
        do {
            C3 = C();
            if (C3 == 0) {
                return;
            }
            int i7 = this.f4334a;
            if (i7 >= 100) {
                throw new C0700y("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f4334a = i7 + 1;
            this.f4334a--;
        } while (F(C3));
    }

    public ByteBuffer a(int i7, byte[] bArr) {
        int[] c3 = c(i7, a.c(bArr));
        int[] iArr = (int[]) c3.clone();
        a.b(iArr);
        for (int i8 = 0; i8 < c3.length; i8++) {
            c3[i8] = c3[i8] + iArr[i8];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c3, 0, 16);
        return order;
    }

    public abstract void b(int i7);

    public abstract int[] c(int i7, int[] iArr);

    public abstract int f();

    public abstract boolean g();

    public abstract int i();

    public abstract void j(int i7);

    public void k(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != i()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + i());
        }
        int remaining = byteBuffer2.remaining();
        int i7 = remaining / 64;
        int i8 = i7 + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            ByteBuffer a2 = a(this.f4334a + i9, bArr);
            if (i9 == i7) {
                P6.b.T(byteBuffer, byteBuffer2, a2, remaining % 64);
            } else {
                P6.b.T(byteBuffer, byteBuffer2, a2, 64);
            }
        }
    }

    public abstract int l(int i7);

    public abstract boolean m();

    public abstract C0683g n();

    public abstract C0872h o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
