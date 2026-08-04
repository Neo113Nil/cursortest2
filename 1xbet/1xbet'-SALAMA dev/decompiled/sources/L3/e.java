package L3;

import androidx.datastore.preferences.protobuf.C0662g;
import androidx.datastore.preferences.protobuf.C0679y;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C0828h;
import com.google.crypto.tink.shaded.protobuf.C0830j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4335b;

    public static int d(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long e(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C0830j h(byte[] bArr, int i7, int i8, boolean z4) {
        C0830j c0830j = new C0830j(bArr, i7, i8, z4);
        try {
            c0830j.l(i8);
            return c0830j;
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
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            int i7 = this.f4334a;
            if (i7 >= 100) {
                throw new C0679y("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f4334a = i7 + 1;
            zF = F(iC);
            this.f4334a--;
        } while (zF);
    }

    public ByteBuffer a(int i7, byte[] bArr) {
        int[] iArrC = c(i7, a.c(bArr));
        int[] iArr = (int[]) iArrC.clone();
        a.b(iArr);
        for (int i8 = 0; i8 < iArrC.length; i8++) {
            iArrC[i8] = iArrC[i8] + iArr[i8];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrC, 0, 16);
        return byteBufferOrder;
    }

    public abstract void b(int i7);

    public abstract int[] c(int i7, int[] iArr);

    public abstract int f();

    public abstract boolean g();

    public abstract int i();

    public abstract void j(int i7);

    public void k(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != i()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + i());
        }
        int iRemaining = byteBuffer2.remaining();
        int i7 = iRemaining / 64;
        int i8 = i7 + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            ByteBuffer byteBufferA = a(this.f4334a + i9, bArr);
            if (i9 == i7) {
                P6.b.T(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                P6.b.T(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int l(int i7);

    public abstract boolean m();

    public abstract C0662g n();

    public abstract C0828h o();

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
