package H9;

import I9.f;
import K9.c;
import h9.EnumC6876a;
import h9.g;
import h9.u;
import h9.v;
import java.util.Map;
import o9.C8660b;

/* loaded from: classes9.dex */
public final class b implements u {
    @Override // h9.u
    public final C8660b a(String str, EnumC6876a enumC6876a, int i11, int i12, Map<g, ?> map) throws v {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (enumC6876a != EnumC6876a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(enumC6876a)));
        }
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i11 + 'x' + i12);
        }
        f fVar = f.L;
        int i13 = 4;
        if (map != null) {
            g gVar = g.ERROR_CORRECTION;
            if (map.containsKey(gVar)) {
                fVar = f.valueOf(map.get(gVar).toString());
            }
            g gVar2 = g.MARGIN;
            if (map.containsKey(gVar2)) {
                i13 = Integer.parseInt(map.get(gVar2).toString());
            }
        }
        K9.b a11 = c.a(str, fVar, map).a();
        if (a11 == null) {
            throw new IllegalStateException();
        }
        int h11 = a11.h();
        int e11 = a11.e();
        int i14 = i13 << 1;
        int i15 = h11 + i14;
        int i16 = i14 + e11;
        int max = Math.max(i11, i15);
        int max2 = Math.max(i12, i16);
        int min = Math.min(max / i15, max2 / i16);
        int i17 = (max - (h11 * min)) / 2;
        int i18 = (max2 - (e11 * min)) / 2;
        C8660b c8660b = new C8660b(max, max2);
        int i19 = 0;
        while (i19 < e11) {
            int i21 = 0;
            int i22 = i17;
            while (i21 < h11) {
                if (a11.b(i21, i19) == 1) {
                    c8660b.m(i22, i18, min, min);
                }
                i21++;
                i22 += min;
            }
            i19++;
            i18 += min;
        }
        return c8660b;
    }
}
