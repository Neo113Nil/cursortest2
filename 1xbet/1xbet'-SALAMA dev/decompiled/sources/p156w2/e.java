package p156w2;

import A1.C0045t0;
import C1.C0095a;
import java.util.Collections;
import java.util.List;
import p151v2.a;
import p151v2.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17983d;

    public e(List list, int i7, float f7, String str) {
        this.f17980a = list;
        this.f17981b = i7;
        this.f17982c = f7;
        this.f17983d = str;
    }

    public static e a(C0095a c0095a) throws C0045t0 {
        try {
            c0095a.E(21);
            int iT = c0095a.t() & 3;
            int iT2 = c0095a.t();
            int i7 = c0095a.f1463a;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < iT2; i10++) {
                c0095a.E(1);
                int iY = c0095a.y();
                for (int i11 = 0; i11 < iY; i11++) {
                    int iY2 = c0095a.y();
                    i9 += iY2 + 4;
                    c0095a.E(iY2);
                }
            }
            c0095a.D(i7);
            byte[] bArr = new byte[i9];
            float f7 = 1.0f;
            String strD = null;
            int i12 = 0;
            int i13 = 0;
            while (i12 < iT2) {
                int iT3 = c0095a.t() & 127;
                int iY3 = c0095a.y();
                int i14 = i8;
                while (i14 < iY3) {
                    int iY4 = c0095a.y();
                    System.arraycopy(a.f17092c, i8, bArr, i13, 4);
                    int i15 = i13 + 4;
                    System.arraycopy((byte[]) c0095a.f1465c, c0095a.f1463a, bArr, i15, iY4);
                    if (iT3 == 33 && i14 == 0) {
                        j jVarX = a.x(bArr, i15, i15 + iY4);
                        float f8 = jVarX.f17123g;
                        strD = a.d(jVarX.f17117a, jVarX.f17118b, jVarX.f17119c, jVarX.f17120d, jVarX.f17121e, jVarX.f17122f);
                        f7 = f8;
                    }
                    i13 = i15 + iY4;
                    c0095a.E(iY4);
                    i14++;
                    iT2 = iT2;
                    i8 = 0;
                }
                i12++;
                i8 = 0;
            }
            return new e(i9 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iT + 1, f7, strD);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw C0045t0.a(e7, "Error parsing HEVC config");
        }
    }
}
