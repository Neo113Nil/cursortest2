package Y3;

import j3.t;
import java.nio.ByteBuffer;
import java.util.Arrays;
import m3.C8050C;

/* loaded from: classes8.dex */
public final class b extends W3.b {
    public static a c(C8050C c8050c) {
        String z11 = c8050c.z();
        z11.getClass();
        String z12 = c8050c.z();
        z12.getClass();
        return new a(z11, z12, c8050c.y(), c8050c.y(), Arrays.copyOfRange(c8050c.e(), c8050c.f(), c8050c.i()));
    }

    @Override // W3.b
    protected final t b(W3.a aVar, ByteBuffer byteBuffer) {
        return new t(c(new C8050C(byteBuffer.limit(), byteBuffer.array())));
    }
}
