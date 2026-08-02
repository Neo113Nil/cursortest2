package I9;

import java.util.EnumMap;
import o9.C8660b;
import o9.C8663e;
import q9.C8999a;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final q9.c f12010a = new q9.c(C8999a.f81745l);

    private C8663e a(a aVar, EnumMap enumMap) throws h9.h, h9.d {
        j e11 = aVar.e();
        f d11 = aVar.d().d();
        b[] b11 = b.b(aVar.c(), e11, d11);
        int i11 = 0;
        for (b bVar : b11) {
            i11 += bVar.c();
        }
        byte[] bArr = new byte[i11];
        int i12 = 0;
        for (b bVar2 : b11) {
            byte[] a11 = bVar2.a();
            int c11 = bVar2.c();
            int length = a11.length;
            int[] iArr = new int[length];
            for (int i13 = 0; i13 < length; i13++) {
                iArr[i13] = a11[i13] & 255;
            }
            try {
                this.f12010a.a(iArr, a11.length - c11);
                for (int i14 = 0; i14 < c11; i14++) {
                    a11[i14] = (byte) iArr[i14];
                }
                int i15 = 0;
                while (i15 < c11) {
                    bArr[i12] = a11[i15];
                    i15++;
                    i12++;
                }
            } catch (q9.e unused) {
                throw h9.d.a();
            }
        }
        return d.a(bArr, e11, d11, enumMap);
    }

    public final C8663e b(C8660b c8660b, EnumMap enumMap) throws h9.h, h9.d {
        h9.d e11;
        a aVar = new a(c8660b);
        h9.h hVar = null;
        try {
            return a(aVar, enumMap);
        } catch (h9.d e12) {
            e11 = e12;
            try {
                aVar.f();
                aVar.g();
                aVar.e();
                aVar.d();
                aVar.b();
                C8663e a11 = a(aVar, enumMap);
                a11.i(new i());
                return a11;
            } catch (h9.d | h9.h unused) {
                if (hVar != null) {
                    throw hVar;
                }
                throw e11;
            }
        } catch (h9.h e13) {
            e11 = null;
            hVar = e13;
            aVar.f();
            aVar.g();
            aVar.e();
            aVar.d();
            aVar.b();
            C8663e a112 = a(aVar, enumMap);
            a112.i(new i());
            return a112;
        }
    }
}
