package w2;

import A1.C0045t0;
import C1.C0095a;
import java.util.Collections;
import java.util.List;
import v2.AbstractC1664a;

/* renamed from: w2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770e {

    /* renamed from: a, reason: collision with root package name */
    public final List f17974a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17975b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17976c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17977d;

    public C1770e(List list, int i7, float f7, String str) {
        this.f17974a = list;
        this.f17975b = i7;
        this.f17976c = f7;
        this.f17977d = str;
    }

    public static C1770e a(C0095a c0095a) {
        int i7;
        try {
            c0095a.E(21);
            int t7 = c0095a.t() & 3;
            int t8 = c0095a.t();
            int i8 = c0095a.f1463a;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < t8; i11++) {
                c0095a.E(1);
                int y4 = c0095a.y();
                for (int i12 = 0; i12 < y4; i12++) {
                    int y5 = c0095a.y();
                    i10 += y5 + 4;
                    c0095a.E(y5);
                }
            }
            c0095a.D(i8);
            byte[] bArr = new byte[i10];
            float f7 = 1.0f;
            String str = null;
            int i13 = 0;
            int i14 = 0;
            while (i13 < t8) {
                int t9 = c0095a.t() & 127;
                int y7 = c0095a.y();
                int i15 = i9;
                while (i15 < y7) {
                    int y8 = c0095a.y();
                    System.arraycopy(AbstractC1664a.f17086c, i9, bArr, i14, 4);
                    int i16 = i14 + 4;
                    System.arraycopy((byte[]) c0095a.f1465c, c0095a.f1463a, bArr, i16, y8);
                    if (t9 == 33 && i15 == 0) {
                        v2.j x4 = AbstractC1664a.x(bArr, i16, i16 + y8);
                        float f8 = x4.f17117g;
                        i7 = t8;
                        str = AbstractC1664a.d(x4.f17111a, x4.f17112b, x4.f17113c, x4.f17114d, x4.f17115e, x4.f17116f);
                        f7 = f8;
                    } else {
                        i7 = t8;
                    }
                    i14 = i16 + y8;
                    c0095a.E(y8);
                    i15++;
                    t8 = i7;
                    i9 = 0;
                }
                i13++;
                i9 = 0;
            }
            return new C1770e(i10 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), t7 + 1, f7, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw C0045t0.a(e7, "Error parsing HEVC config");
        }
    }
}
