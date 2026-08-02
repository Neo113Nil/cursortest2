package X3;

import j3.t;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import m3.C8049B;

/* loaded from: classes8.dex */
public final class b extends W3.b {
    @Override // W3.b
    protected final t b(W3.a aVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            C8049B c8049b = new C8049B(byteBuffer.limit(), byteBuffer.array());
            c8049b.p(12);
            int d11 = (c8049b.d() + c8049b.h(12)) - 4;
            c8049b.p(44);
            c8049b.q(c8049b.h(12));
            c8049b.p(16);
            ArrayList arrayList = new ArrayList();
            while (c8049b.d() < d11) {
                c8049b.p(48);
                int h11 = c8049b.h(8);
                c8049b.p(4);
                int d12 = c8049b.d() + c8049b.h(12);
                String str = null;
                String str2 = null;
                while (c8049b.d() < d12) {
                    int h12 = c8049b.h(8);
                    int h13 = c8049b.h(8);
                    int d13 = c8049b.d() + h13;
                    if (h12 == 2) {
                        int h14 = c8049b.h(16);
                        c8049b.p(8);
                        if (h14 == 3) {
                            while (c8049b.d() < d13) {
                                int h15 = c8049b.h(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[h15];
                                c8049b.k(h15, bArr);
                                str = new String(bArr, charset);
                                int h16 = c8049b.h(8);
                                for (int i11 = 0; i11 < h16; i11++) {
                                    c8049b.q(c8049b.h(8));
                                }
                            }
                        }
                    } else if (h12 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[h13];
                        c8049b.k(h13, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    c8049b.n(d13 * 8);
                }
                c8049b.n(d12 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new a(h11, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new t(arrayList);
            }
        }
        return null;
    }
}
