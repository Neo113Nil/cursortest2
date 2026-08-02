package W5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* renamed from: W5.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0544u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f7377a = Logger.getLogger(AbstractC0544u0.class.getName());

    public static Object a(Z4.a aVar) {
        String h6;
        String h7;
        String str;
        double d7;
        p3.f.q("unexpected end of JSON", aVar.hasNext());
        int e7 = t.e.e(aVar.j());
        boolean z4 = true;
        if (e7 == 0) {
            int i7 = aVar.f7864x;
            if (i7 == 0) {
                i7 = aVar.b();
            }
            if (i7 != 3) {
                throw new IllegalStateException("Expected BEGIN_ARRAY but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
            }
            aVar.k(1);
            aVar.f7857E[aVar.f7855C - 1] = 0;
            aVar.f7864x = 0;
            ArrayList arrayList = new ArrayList();
            while (aVar.hasNext()) {
                arrayList.add(a(aVar));
            }
            p3.f.q("Bad token: " + aVar.d(), aVar.j() == 2);
            int i8 = aVar.f7864x;
            if (i8 == 0) {
                i8 = aVar.b();
            }
            if (i8 != 4) {
                throw new IllegalStateException("Expected END_ARRAY but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
            }
            int i9 = aVar.f7855C;
            aVar.f7855C = i9 - 1;
            int[] iArr = aVar.f7857E;
            int i10 = i9 - 2;
            iArr[i10] = iArr[i10] + 1;
            aVar.f7864x = 0;
            return Collections.unmodifiableList(arrayList);
        }
        if (e7 == 2) {
            int i11 = aVar.f7864x;
            if (i11 == 0) {
                i11 = aVar.b();
            }
            if (i11 != 1) {
                throw new IllegalStateException("Expected BEGIN_OBJECT but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
            }
            aVar.k(3);
            aVar.f7864x = 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aVar.hasNext()) {
                int i12 = aVar.f7864x;
                if (i12 == 0) {
                    i12 = aVar.b();
                }
                if (i12 == 14) {
                    h7 = aVar.i();
                } else if (i12 == 12) {
                    h7 = aVar.h('\'');
                } else {
                    if (i12 != 13) {
                        throw new IllegalStateException("Expected a name but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
                    }
                    h6 = aVar.h('\"');
                    aVar.f7864x = 0;
                    aVar.f7856D[aVar.f7855C - 1] = h6;
                    linkedHashMap.put(h6, a(aVar));
                }
                h6 = h7;
                aVar.f7864x = 0;
                aVar.f7856D[aVar.f7855C - 1] = h6;
                linkedHashMap.put(h6, a(aVar));
            }
            p3.f.q("Bad token: " + aVar.d(), aVar.j() == 4);
            int i13 = aVar.f7864x;
            if (i13 == 0) {
                i13 = aVar.b();
            }
            if (i13 != 2) {
                throw new IllegalStateException("Expected END_OBJECT but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
            }
            int i14 = aVar.f7855C;
            int i15 = i14 - 1;
            aVar.f7855C = i15;
            aVar.f7856D[i15] = null;
            int[] iArr2 = aVar.f7857E;
            int i16 = i14 - 2;
            iArr2[i16] = iArr2[i16] + 1;
            aVar.f7864x = 0;
            return Collections.unmodifiableMap(linkedHashMap);
        }
        char[] cArr = aVar.f7859b;
        if (e7 == 5) {
            int i17 = aVar.f7864x;
            if (i17 == 0) {
                i17 = aVar.b();
            }
            if (i17 == 10) {
                str = aVar.i();
            } else if (i17 == 8) {
                str = aVar.h('\'');
            } else if (i17 == 9) {
                str = aVar.h('\"');
            } else if (i17 == 11) {
                str = aVar.f7853A;
                aVar.f7853A = null;
            } else if (i17 == 15) {
                str = Long.toString(aVar.f7865y);
            } else {
                if (i17 != 16) {
                    throw new IllegalStateException("Expected a string but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
                }
                str = new String(cArr, aVar.f7860c, aVar.f7866z);
                aVar.f7860c += aVar.f7866z;
            }
            aVar.f7864x = 0;
            int[] iArr3 = aVar.f7857E;
            int i18 = aVar.f7855C - 1;
            iArr3[i18] = iArr3[i18] + 1;
            return str;
        }
        if (e7 != 6) {
            if (e7 != 7) {
                if (e7 != 8) {
                    throw new IllegalStateException("Bad token: " + aVar.d());
                }
                int i19 = aVar.f7864x;
                if (i19 == 0) {
                    i19 = aVar.b();
                }
                if (i19 != 7) {
                    throw new IllegalStateException("Expected null but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
                }
                aVar.f7864x = 0;
                int[] iArr4 = aVar.f7857E;
                int i20 = aVar.f7855C - 1;
                iArr4[i20] = iArr4[i20] + 1;
                return null;
            }
            int i21 = aVar.f7864x;
            if (i21 == 0) {
                i21 = aVar.b();
            }
            if (i21 == 5) {
                aVar.f7864x = 0;
                int[] iArr5 = aVar.f7857E;
                int i22 = aVar.f7855C - 1;
                iArr5[i22] = iArr5[i22] + 1;
            } else {
                if (i21 != 6) {
                    throw new IllegalStateException("Expected a boolean but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
                }
                aVar.f7864x = 0;
                int[] iArr6 = aVar.f7857E;
                int i23 = aVar.f7855C - 1;
                iArr6[i23] = iArr6[i23] + 1;
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
        int i24 = aVar.f7864x;
        if (i24 == 0) {
            i24 = aVar.b();
        }
        if (i24 == 15) {
            aVar.f7864x = 0;
            int[] iArr7 = aVar.f7857E;
            int i25 = aVar.f7855C - 1;
            iArr7[i25] = iArr7[i25] + 1;
            d7 = aVar.f7865y;
        } else {
            if (i24 == 16) {
                aVar.f7853A = new String(cArr, aVar.f7860c, aVar.f7866z);
                aVar.f7860c += aVar.f7866z;
            } else if (i24 == 8 || i24 == 9) {
                aVar.f7853A = aVar.h(i24 == 8 ? '\'' : '\"');
            } else if (i24 == 10) {
                aVar.f7853A = aVar.i();
            } else if (i24 != 11) {
                throw new IllegalStateException("Expected a double but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
            }
            aVar.f7864x = 11;
            double parseDouble = Double.parseDouble(aVar.f7853A);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new Z4.b("JSON forbids NaN and infinities: " + parseDouble + aVar.f());
            }
            aVar.f7853A = null;
            aVar.f7864x = 0;
            int[] iArr8 = aVar.f7857E;
            int i26 = aVar.f7855C - 1;
            iArr8[i26] = iArr8[i26] + 1;
            d7 = parseDouble;
        }
        return Double.valueOf(d7);
    }
}
