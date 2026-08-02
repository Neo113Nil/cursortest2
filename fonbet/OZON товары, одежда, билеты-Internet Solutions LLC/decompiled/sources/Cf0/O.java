package Cf0;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import sf.C9681g;

/* loaded from: classes3.dex */
public final class O {
    public static final long a(float f7, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    public static final boolean b(C9681g c9681g) {
        C9681g c9681g2;
        int i11;
        try {
            c9681g2 = new C9681g();
            long size = c9681g.size();
            long j11 = 64;
            if (size <= 64) {
                j11 = size;
            }
            c9681g.k(c9681g2, 0L, j11);
        } catch (EOFException unused) {
        }
        for (i11 = 0; i11 < 16; i11++) {
            if (c9681g2.m()) {
                return true;
            }
            int L11 = c9681g2.L();
            if (Character.isISOControl(L11) && !Character.isWhitespace(L11)) {
                return false;
            }
        }
        return true;
    }

    public static final void c(Ne.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if ((cVar instanceof Pe.o ? (Pe.o) cVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + kotlin.jvm.internal.N.b(cVar.getClass()));
    }

    public static final int d(float f7) {
        return (int) Math.ceil(f7);
    }

    public void e(ByteBuffer byteBuffer) {
        throw null;
    }

    public void f() {
        throw null;
    }

    public int g(ByteBuffer byteBuffer, boolean z11) {
        throw null;
    }
}
