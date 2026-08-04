package W5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: W5.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0544u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f7377a = Logger.getLogger(AbstractC0544u0.class.getName());

    public static Object a(Z4.a aVar) throws IOException {
        String strH;
        String strH2;
        String str;
        double d7;
        p113p3.f.q("unexpected end of JSON", aVar.hasNext());
        int iE = p136t.e.e(aVar.j());
        boolean z4 = true;
        if (iE == 0) {
            int iB = aVar.f7864x;
            if (iB == 0) {
                iB = aVar.b();
            }
            if (iB != 3) {
                throw new IllegalStateException("Expected BEGIN_ARRAY but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
            }
            aVar.k(1);
            aVar.f7857E[aVar.f7855C - 1] = 0;
            aVar.f7864x = 0;
            ArrayList arrayList = new ArrayList();
            while (aVar.hasNext()) {
                arrayList.add(a(aVar));
            }
            p113p3.f.q("Bad token: " + aVar.d(), aVar.j() == 2);
            int iB2 = aVar.f7864x;
            if (iB2 == 0) {
                iB2 = aVar.b();
            }
            if (iB2 != 4) {
                throw new IllegalStateException("Expected END_ARRAY but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
            }
            int i7 = aVar.f7855C;
            aVar.f7855C = i7 - 1;
            int[] iArr = aVar.f7857E;
            int i8 = i7 - 2;
            iArr[i8] = iArr[i8] + 1;
            aVar.f7864x = 0;
            return Collections.unmodifiableList(arrayList);
        }
        if (iE == 2) {
            int iB3 = aVar.f7864x;
            if (iB3 == 0) {
                iB3 = aVar.b();
            }
            if (iB3 != 1) {
                throw new IllegalStateException("Expected BEGIN_OBJECT but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
            }
            aVar.k(3);
            aVar.f7864x = 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aVar.hasNext()) {
                int iB4 = aVar.f7864x;
                if (iB4 == 0) {
                    iB4 = aVar.b();
                }
                if (iB4 == 14) {
                    strH2 = aVar.i();
                } else {
                    if (iB4 == 12) {
                        strH2 = aVar.h('\'');
                    } else {
                        if (iB4 != 13) {
                            throw new IllegalStateException("Expected a name but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
                        }
                        strH = aVar.h('\"');
                    }
                    aVar.f7864x = 0;
                    aVar.f7856D[aVar.f7855C - 1] = strH;
                    linkedHashMap.put(strH, a(aVar));
                }
                strH = strH2;
                aVar.f7864x = 0;
                aVar.f7856D[aVar.f7855C - 1] = strH;
                linkedHashMap.put(strH, a(aVar));
            }
            p113p3.f.q("Bad token: " + aVar.d(), aVar.j() == 4);
            int iB5 = aVar.f7864x;
            if (iB5 == 0) {
                iB5 = aVar.b();
            }
            if (iB5 != 2) {
                throw new IllegalStateException("Expected END_OBJECT but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
            }
            int i9 = aVar.f7855C;
            int i10 = i9 - 1;
            aVar.f7855C = i10;
            aVar.f7856D[i10] = null;
            int[] iArr2 = aVar.f7857E;
            int i11 = i9 - 2;
            iArr2[i11] = iArr2[i11] + 1;
            aVar.f7864x = 0;
            return Collections.unmodifiableMap(linkedHashMap);
        }
        char[] cArr = aVar.f7859b;
        if (iE == 5) {
            int iB6 = aVar.f7864x;
            if (iB6 == 0) {
                iB6 = aVar.b();
            }
            if (iB6 == 10) {
                str = aVar.i();
            } else if (iB6 == 8) {
                str = aVar.h('\'');
            } else if (iB6 == 9) {
                str = aVar.h('\"');
            } else if (iB6 == 11) {
                str = aVar.f7853A;
                aVar.f7853A = null;
            } else if (iB6 == 15) {
                str = Long.toString(aVar.f7865y);
            } else {
                if (iB6 != 16) {
                    throw new IllegalStateException("Expected a string but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
                }
                str = new String(cArr, aVar.f7860c, aVar.f7866z);
                aVar.f7860c += aVar.f7866z;
            }
            aVar.f7864x = 0;
            int[] iArr3 = aVar.f7857E;
            int i12 = aVar.f7855C - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return str;
        }
        if (iE != 6) {
            if (iE != 7) {
                if (iE != 8) {
                    throw new IllegalStateException("Bad token: " + aVar.d());
                }
                int iB7 = aVar.f7864x;
                if (iB7 == 0) {
                    iB7 = aVar.b();
                }
                if (iB7 != 7) {
                    throw new IllegalStateException("Expected null but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
                }
                aVar.f7864x = 0;
                int[] iArr4 = aVar.f7857E;
                int i13 = aVar.f7855C - 1;
                iArr4[i13] = iArr4[i13] + 1;
                return null;
            }
            int iB8 = aVar.f7864x;
            if (iB8 == 0) {
                iB8 = aVar.b();
            }
            if (iB8 == 5) {
                aVar.f7864x = 0;
                int[] iArr5 = aVar.f7857E;
                int i14 = aVar.f7855C - 1;
                iArr5[i14] = iArr5[i14] + 1;
            } else {
                if (iB8 != 6) {
                    throw new IllegalStateException("Expected a boolean but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
                }
                aVar.f7864x = 0;
                int[] iArr6 = aVar.f7857E;
                int i15 = aVar.f7855C - 1;
                iArr6[i15] = iArr6[i15] + 1;
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
        int iB9 = aVar.f7864x;
        if (iB9 == 0) {
            iB9 = aVar.b();
        }
        if (iB9 == 15) {
            aVar.f7864x = 0;
            int[] iArr7 = aVar.f7857E;
            int i16 = aVar.f7855C - 1;
            iArr7[i16] = iArr7[i16] + 1;
            d7 = aVar.f7865y;
        } else {
            if (iB9 == 16) {
                aVar.f7853A = new String(cArr, aVar.f7860c, aVar.f7866z);
                aVar.f7860c += aVar.f7866z;
            } else if (iB9 == 8 || iB9 == 9) {
                aVar.f7853A = aVar.h(iB9 == 8 ? '\'' : '\"');
            } else if (iB9 == 10) {
                aVar.f7853A = aVar.i();
            } else if (iB9 != 11) {
                throw new IllegalStateException("Expected a double but was " + AbstractC0486a1.x(aVar.j()) + aVar.f());
            }
            aVar.f7864x = 11;
            double d8 = Double.parseDouble(aVar.f7853A);
            if (Double.isNaN(d8) || Double.isInfinite(d8)) {
                throw new Z4.b("JSON forbids NaN and infinities: " + d8 + aVar.f());
            }
            aVar.f7853A = null;
            aVar.f7864x = 0;
            int[] iArr8 = aVar.f7857E;
            int i17 = aVar.f7855C - 1;
            iArr8[i17] = iArr8[i17] + 1;
            d7 = d8;
        }
        return Double.valueOf(d7);
    }
}
