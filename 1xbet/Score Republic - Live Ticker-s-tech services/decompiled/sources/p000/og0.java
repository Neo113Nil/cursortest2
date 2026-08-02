package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class og0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f5723a = Logger.getLogger(og0.class.getName());

    /* JADX INFO: renamed from: a */
    public static Object m3691a(pg0 pg0Var) throws IOException {
        String strM3913q;
        String str;
        double d;
        boolean zM3909l = pg0Var.m3909l();
        char[] cArr = pg0Var.f6135k;
        a90.m132p("unexpected end of JSON", zM3909l);
        int iM292o = AbstractC0024an.m292o(pg0Var.m3915s());
        boolean z = false;
        if (iM292o == 0) {
            int iM3906e = pg0Var.f6140p;
            if (iM3906e == 0) {
                iM3906e = pg0Var.m3906e();
            }
            if (iM3906e != 3) {
                dd0.m1161f(AbstractC0024an.m296s(pg0Var.m3915s()), pg0Var.m3911o(), "Expected BEGIN_ARRAY but was ");
                return null;
            }
            pg0Var.m3916t(1);
            pg0Var.f6147w[pg0Var.f6145u - 1] = 0;
            pg0Var.f6140p = 0;
            ArrayList arrayList = new ArrayList();
            while (pg0Var.m3909l()) {
                arrayList.add(m3691a(pg0Var));
            }
            a90.m132p("Bad token: ".concat(pg0Var.m3908j()), pg0Var.m3915s() == 2);
            int iM3906e2 = pg0Var.f6140p;
            if (iM3906e2 == 0) {
                iM3906e2 = pg0Var.m3906e();
            }
            if (iM3906e2 != 4) {
                dd0.m1161f(AbstractC0024an.m296s(pg0Var.m3915s()), pg0Var.m3911o(), "Expected END_ARRAY but was ");
                return null;
            }
            int i = pg0Var.f6145u;
            pg0Var.f6145u = i - 1;
            int[] iArr = pg0Var.f6147w;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            pg0Var.f6140p = 0;
            return Collections.unmodifiableList(arrayList);
        }
        if (iM292o == 2) {
            int iM3906e3 = pg0Var.f6140p;
            if (iM3906e3 == 0) {
                iM3906e3 = pg0Var.m3906e();
            }
            if (iM3906e3 != 1) {
                dd0.m1161f(AbstractC0024an.m296s(pg0Var.m3915s()), pg0Var.m3911o(), "Expected BEGIN_OBJECT but was ");
                return null;
            }
            pg0Var.m3916t(3);
            pg0Var.f6140p = 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (pg0Var.m3909l()) {
                int iM3906e4 = pg0Var.f6140p;
                if (iM3906e4 == 0) {
                    iM3906e4 = pg0Var.m3906e();
                }
                if (iM3906e4 == 14) {
                    strM3913q = pg0Var.m3914r();
                } else if (iM3906e4 == 12) {
                    strM3913q = pg0Var.m3913q('\'');
                } else {
                    if (iM3906e4 != 13) {
                        dd0.m1161f(AbstractC0024an.m296s(pg0Var.m3915s()), pg0Var.m3911o(), "Expected a name but was ");
                        return null;
                    }
                    strM3913q = pg0Var.m3913q('\"');
                }
                pg0Var.f6140p = 0;
                pg0Var.f6146v[pg0Var.f6145u - 1] = strM3913q;
                linkedHashMap.put(strM3913q, m3691a(pg0Var));
            }
            a90.m132p("Bad token: ".concat(pg0Var.m3908j()), pg0Var.m3915s() == 4);
            int iM3906e5 = pg0Var.f6140p;
            if (iM3906e5 == 0) {
                iM3906e5 = pg0Var.m3906e();
            }
            if (iM3906e5 != 2) {
                dd0.m1161f(AbstractC0024an.m296s(pg0Var.m3915s()), pg0Var.m3911o(), "Expected END_OBJECT but was ");
                return null;
            }
            int i3 = pg0Var.f6145u;
            int i4 = i3 - 1;
            pg0Var.f6145u = i4;
            pg0Var.f6146v[i4] = null;
            int[] iArr2 = pg0Var.f6147w;
            int i5 = i3 - 2;
            iArr2[i5] = iArr2[i5] + 1;
            pg0Var.f6140p = 0;
            return Collections.unmodifiableMap(linkedHashMap);
        }
        if (iM292o == 5) {
            int iM3906e6 = pg0Var.f6140p;
            if (iM3906e6 == 0) {
                iM3906e6 = pg0Var.m3906e();
            }
            if (iM3906e6 == 10) {
                str = pg0Var.m3914r();
            } else if (iM3906e6 == 8) {
                str = pg0Var.m3913q('\'');
            } else if (iM3906e6 == 9) {
                str = pg0Var.m3913q('\"');
            } else if (iM3906e6 == 11) {
                str = pg0Var.f6143s;
                pg0Var.f6143s = null;
            } else if (iM3906e6 == 15) {
                str = Long.toString(pg0Var.f6141q);
            } else {
                if (iM3906e6 != 16) {
                    dd0.m1161f(AbstractC0024an.m296s(pg0Var.m3915s()), pg0Var.m3911o(), "Expected a string but was ");
                    return null;
                }
                str = new String(cArr, pg0Var.f6136l, pg0Var.f6142r);
                pg0Var.f6136l += pg0Var.f6142r;
            }
            pg0Var.f6140p = 0;
            int[] iArr3 = pg0Var.f6147w;
            int i6 = pg0Var.f6145u - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return str;
        }
        if (iM292o != 6) {
            if (iM292o != 7) {
                if (iM292o != 8) {
                    C0270h1.m2191g("Bad token: ".concat(pg0Var.m3908j()));
                    return null;
                }
                int iM3906e7 = pg0Var.f6140p;
                if (iM3906e7 == 0) {
                    iM3906e7 = pg0Var.m3906e();
                }
                if (iM3906e7 != 7) {
                    dd0.m1161f(AbstractC0024an.m296s(pg0Var.m3915s()), pg0Var.m3911o(), "Expected null but was ");
                    return null;
                }
                pg0Var.f6140p = 0;
                int[] iArr4 = pg0Var.f6147w;
                int i7 = pg0Var.f6145u - 1;
                iArr4[i7] = iArr4[i7] + 1;
                return null;
            }
            int iM3906e8 = pg0Var.f6140p;
            if (iM3906e8 == 0) {
                iM3906e8 = pg0Var.m3906e();
            }
            if (iM3906e8 == 5) {
                pg0Var.f6140p = 0;
                int[] iArr5 = pg0Var.f6147w;
                int i8 = pg0Var.f6145u - 1;
                iArr5[i8] = iArr5[i8] + 1;
                z = true;
            } else {
                if (iM3906e8 != 6) {
                    dd0.m1161f(AbstractC0024an.m296s(pg0Var.m3915s()), pg0Var.m3911o(), "Expected a boolean but was ");
                    return null;
                }
                pg0Var.f6140p = 0;
                int[] iArr6 = pg0Var.f6147w;
                int i9 = pg0Var.f6145u - 1;
                iArr6[i9] = iArr6[i9] + 1;
            }
            return Boolean.valueOf(z);
        }
        int iM3906e9 = pg0Var.f6140p;
        if (iM3906e9 == 0) {
            iM3906e9 = pg0Var.m3906e();
        }
        if (iM3906e9 == 15) {
            pg0Var.f6140p = 0;
            int[] iArr7 = pg0Var.f6147w;
            int i10 = pg0Var.f6145u - 1;
            iArr7[i10] = iArr7[i10] + 1;
            d = pg0Var.f6141q;
        } else {
            if (iM3906e9 == 16) {
                pg0Var.f6143s = new String(cArr, pg0Var.f6136l, pg0Var.f6142r);
                pg0Var.f6136l += pg0Var.f6142r;
            } else if (iM3906e9 == 8 || iM3906e9 == 9) {
                pg0Var.f6143s = pg0Var.m3913q(iM3906e9 == 8 ? '\'' : '\"');
            } else if (iM3906e9 == 10) {
                pg0Var.f6143s = pg0Var.m3914r();
            } else if (iM3906e9 != 11) {
                dd0.m1161f(AbstractC0024an.m296s(pg0Var.m3915s()), pg0Var.m3911o(), "Expected a double but was ");
                return null;
            }
            pg0Var.f6140p = 11;
            double d2 = Double.parseDouble(pg0Var.f6143s);
            if (Double.isNaN(d2) || Double.isInfinite(d2)) {
                throw new C0287hi("JSON forbids NaN and infinities: " + d2 + pg0Var.m3911o());
            }
            pg0Var.f6143s = null;
            pg0Var.f6140p = 0;
            int[] iArr8 = pg0Var.f6147w;
            int i11 = pg0Var.f6145u - 1;
            iArr8[i11] = iArr8[i11] + 1;
            d = d2;
        }
        return Double.valueOf(d);
    }
}
