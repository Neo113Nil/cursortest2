package H9;

import I9.e;
import I9.i;
import h9.EnumC6876a;
import h9.c;
import h9.d;
import h9.h;
import h9.m;
import h9.o;
import h9.q;
import h9.r;
import h9.s;
import java.util.EnumMap;
import java.util.List;
import o9.C8660b;
import o9.C8663e;
import o9.C8665g;

/* loaded from: classes9.dex */
public final class a implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final s[] f10701b = new s[0];

    /* renamed from: a, reason: collision with root package name */
    private final e f10702a = new e();

    @Override // h9.o
    public final q a(c cVar, EnumMap enumMap) throws m, d, h {
        s[] b11;
        C8663e c8663e;
        e eVar = this.f10702a;
        if (enumMap == null || !enumMap.containsKey(h9.e.PURE_BARCODE)) {
            C8665g b12 = new J9.c(cVar.a()).b(enumMap);
            C8663e b13 = eVar.b(b12.a(), enumMap);
            b11 = b12.b();
            c8663e = b13;
        } else {
            C8660b a11 = cVar.a();
            int[] i11 = a11.i();
            int[] e11 = a11.e();
            if (i11 == null || e11 == null) {
                throw m.a();
            }
            int g10 = a11.g();
            int j11 = a11.j();
            int i12 = i11[0];
            int i13 = i11[1];
            int i14 = 0;
            boolean z11 = true;
            while (i12 < j11 && i13 < g10) {
                if (z11 != a11.d(i12, i13)) {
                    i14++;
                    if (i14 == 5) {
                        break;
                    }
                    z11 = !z11;
                }
                i12++;
                i13++;
            }
            if (i12 == j11 || i13 == g10) {
                throw m.a();
            }
            int i15 = i11[0];
            float f7 = (i12 - i15) / 7.0f;
            int i16 = i11[1];
            int i17 = e11[1];
            int i18 = e11[0];
            if (i15 >= i18 || i16 >= i17) {
                throw m.a();
            }
            int i19 = i17 - i16;
            if (i19 != i18 - i15 && (i18 = i15 + i19) >= a11.j()) {
                throw m.a();
            }
            int round = Math.round(((i18 - i15) + 1) / f7);
            int round2 = Math.round((i19 + 1) / f7);
            if (round <= 0 || round2 <= 0) {
                throw m.a();
            }
            if (round2 != round) {
                throw m.a();
            }
            int i21 = (int) (f7 / 2.0f);
            int i22 = i16 + i21;
            int i23 = i15 + i21;
            int i24 = (((int) ((round - 1) * f7)) + i23) - i18;
            if (i24 > 0) {
                if (i24 > i21) {
                    throw m.a();
                }
                i23 -= i24;
            }
            int i25 = (((int) ((round2 - 1) * f7)) + i22) - i17;
            if (i25 > 0) {
                if (i25 > i21) {
                    throw m.a();
                }
                i22 -= i25;
            }
            C8660b c8660b = new C8660b(round, round2);
            for (int i26 = 0; i26 < round2; i26++) {
                int i27 = ((int) (i26 * f7)) + i22;
                for (int i28 = 0; i28 < round; i28++) {
                    if (a11.d(((int) (i28 * f7)) + i23, i27)) {
                        c8660b.l(i28, i26);
                    }
                }
            }
            c8663e = eVar.b(c8660b, enumMap);
            b11 = f10701b;
        }
        if (c8663e.c() instanceof i) {
            ((i) c8663e.c()).getClass();
            if (b11 != null && b11.length >= 3) {
                s sVar = b11[0];
                b11[0] = b11[2];
                b11[2] = sVar;
            }
        }
        q qVar = new q(c8663e.g(), c8663e.d(), b11, EnumC6876a.QR_CODE);
        List<byte[]> a12 = c8663e.a();
        if (a12 != null) {
            qVar.h(r.BYTE_SEGMENTS, a12);
        }
        String b14 = c8663e.b();
        if (b14 != null) {
            qVar.h(r.ERROR_CORRECTION_LEVEL, b14);
        }
        if (c8663e.h()) {
            qVar.h(r.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c8663e.f()));
            qVar.h(r.STRUCTURED_APPEND_PARITY, Integer.valueOf(c8663e.e()));
        }
        return qVar;
    }

    @Override // h9.o
    public final void reset() {
    }
}
