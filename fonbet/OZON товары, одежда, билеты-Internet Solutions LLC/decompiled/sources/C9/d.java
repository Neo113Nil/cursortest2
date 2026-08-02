package C9;

import G9.e;
import h9.EnumC6876a;
import h9.g;
import h9.u;
import h9.v;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import o9.C8660b;

/* loaded from: classes9.dex */
public final class d implements u {
    private static C8660b b(byte[][] bArr, int i11) {
        int i12 = i11 * 2;
        C8660b c8660b = new C8660b(bArr[0].length + i12, bArr.length + i12);
        c8660b.a();
        int g10 = (c8660b.g() - i11) - 1;
        int i13 = 0;
        while (i13 < bArr.length) {
            byte[] bArr2 = bArr[i13];
            for (int i14 = 0; i14 < bArr[0].length; i14++) {
                if (bArr2[i14] == 1) {
                    c8660b.l(i14 + i11, g10);
                }
            }
            i13++;
            g10--;
        }
        return c8660b;
    }

    private static byte[][] c(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int length = (bArr.length - i11) - 1;
            for (int i12 = 0; i12 < bArr[0].length; i12++) {
                bArr2[i12][length] = bArr[i11][i12];
            }
        }
        return bArr2;
    }

    @Override // h9.u
    public final C8660b a(String str, EnumC6876a enumC6876a, int i11, int i12, Map<g, ?> map) throws v {
        boolean z11;
        if (enumC6876a != EnumC6876a.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(enumC6876a)));
        }
        e eVar = new e();
        if (map != null) {
            g gVar = g.PDF417_COMPACT;
            if (map.containsKey(gVar)) {
                eVar.d(Boolean.parseBoolean(map.get(gVar).toString()));
            }
            g gVar2 = g.PDF417_COMPACTION;
            if (map.containsKey(gVar2)) {
                eVar.e(G9.c.valueOf(map.get(gVar2).toString()));
            }
            g gVar3 = g.PDF417_DIMENSIONS;
            if (map.containsKey(gVar3)) {
                ((G9.d) map.get(gVar3)).getClass();
                eVar.f();
            }
            g gVar4 = g.MARGIN;
            r1 = map.containsKey(gVar4) ? Integer.parseInt(map.get(gVar4).toString()) : 30;
            g gVar5 = g.ERROR_CORRECTION;
            r0 = map.containsKey(gVar5) ? Integer.parseInt(map.get(gVar5).toString()) : 2;
            g gVar6 = g.CHARACTER_SET;
            if (map.containsKey(gVar6)) {
                eVar.g(Charset.forName(map.get(gVar6).toString()));
            }
        }
        eVar.b(r0, str);
        byte[][] b11 = eVar.c().b(1, 4);
        if ((i12 > i11) != (b11[0].length < b11.length)) {
            b11 = c(b11);
            z11 = true;
        } else {
            z11 = false;
        }
        int min = Math.min(i11 / b11[0].length, i12 / b11.length);
        if (min <= 1) {
            return b(b11, r1);
        }
        byte[][] b12 = eVar.c().b(min, min << 2);
        if (z11) {
            b12 = c(b12);
        }
        return b(b12, r1);
    }
}
