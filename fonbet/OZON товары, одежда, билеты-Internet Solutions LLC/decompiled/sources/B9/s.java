package B9;

import androidx.recyclerview.widget.m;
import o9.C8659a;

/* loaded from: classes9.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final C8659a f3094a;

    /* renamed from: b, reason: collision with root package name */
    private final m f3095b = new m();

    /* renamed from: c, reason: collision with root package name */
    private final StringBuilder f3096c = new StringBuilder();

    s(C8659a c8659a) {
        this.f3094a = c8659a;
    }

    static int d(int i11, int i12, C8659a c8659a) {
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            if (c8659a.f(i11 + i14)) {
                i13 |= 1 << ((i12 - i14) - 1);
            }
        }
        return i13;
    }

    private boolean e(int i11) {
        int i12;
        int i13 = i11 + 1;
        C8659a c8659a = this.f3094a;
        if (i13 > c8659a.j()) {
            return false;
        }
        for (int i14 = 0; i14 < 5 && (i12 = i14 + i11) < c8659a.j(); i14++) {
            if (i14 == 2) {
                if (!c8659a.f(i11 + 2)) {
                    return false;
                }
            } else if (c8659a.f(i12)) {
                return false;
            }
        }
        return true;
    }

    final String a(int i11, StringBuilder sb2) throws h9.m, h9.h {
        String str = null;
        while (true) {
            o b11 = b(i11, str);
            String a11 = r.a(b11.b());
            if (a11 != null) {
                sb2.append(a11);
            }
            String valueOf = b11.d() ? String.valueOf(b11.c()) : null;
            if (i11 == b11.a()) {
                return sb2.toString();
            }
            i11 = b11.a();
            str = valueOf;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final o b(int i11, String str) throws h9.h {
        boolean f7;
        l lVar;
        boolean z11;
        l lVar2;
        boolean b11;
        p pVar;
        l lVar3;
        l lVar4;
        int d11;
        int d12;
        int d13;
        char c11;
        n nVar;
        n nVar2;
        int d14;
        int d15;
        char c12;
        n nVar3;
        n nVar4;
        StringBuilder sb2 = this.f3096c;
        sb2.setLength(0);
        if (str != null) {
            sb2.append(str);
        }
        m mVar = this.f3095b;
        mVar.h(i11);
        do {
            int a11 = mVar.a();
            boolean c13 = mVar.c();
            C8659a c8659a = this.f3094a;
            int i12 = 16;
            if (c13) {
                while (true) {
                    int a12 = mVar.a();
                    if (a12 + 5 <= c8659a.j() && (((d14 = d(a12, 5, c8659a)) >= 5 && d14 < 16) || (a12 + 6 <= c8659a.j() && (d15 = d(a12, 6, c8659a)) >= 16 && d15 < 63))) {
                        int a13 = mVar.a();
                        int d16 = d(a13, 5, c8659a);
                        if (d16 == 15) {
                            nVar4 = new n('$', a13 + 5);
                        } else {
                            if (d16 < 5 || d16 >= 15) {
                                int d17 = d(a13, 6, c8659a);
                                if (d17 < 32 || d17 >= 58) {
                                    switch (d17) {
                                        case 58:
                                            c12 = '*';
                                            break;
                                        case 59:
                                            c12 = ',';
                                            break;
                                        case 60:
                                            c12 = '-';
                                            break;
                                        case 61:
                                            c12 = '.';
                                            break;
                                        case 62:
                                            c12 = '/';
                                            break;
                                        default:
                                            throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(d17)));
                                    }
                                    nVar3 = new n(c12, a13 + 6);
                                } else {
                                    nVar3 = new n((char) (d17 + 33), a13 + 6);
                                }
                            } else {
                                nVar3 = new n((char) (d16 + 43), a13 + 5);
                            }
                            nVar4 = nVar3;
                        }
                        mVar.h(nVar4.a());
                        if (nVar4.c()) {
                            lVar4 = new l(new o(mVar.a(), sb2.toString()), true);
                        } else {
                            sb2.append(nVar4.b());
                        }
                    }
                }
                int a14 = mVar.a();
                int i13 = a14 + 3;
                if (i13 <= c8659a.j()) {
                    while (a14 < i13) {
                        if (!c8659a.f(a14)) {
                            a14++;
                        }
                    }
                    mVar.b(3);
                    mVar.g();
                    lVar4 = new l(null, false);
                    b11 = lVar4.b();
                }
                if (e(mVar.a())) {
                    if (mVar.a() + 5 < c8659a.j()) {
                        mVar.b(5);
                    } else {
                        mVar.h(c8659a.j());
                    }
                    mVar.f();
                }
                lVar4 = new l(null, false);
                b11 = lVar4.b();
            } else if (mVar.d()) {
                while (true) {
                    int a15 = mVar.a();
                    if (a15 + 5 <= c8659a.j() && (((d11 = d(a15, 5, c8659a)) >= 5 && d11 < i12) || (a15 + 7 <= c8659a.j() && (((d12 = d(a15, 7, c8659a)) >= 64 && d12 < 116) || (a15 + 8 <= c8659a.j() && (d13 = d(a15, 8, c8659a)) >= 232 && d13 < 253))))) {
                        int a16 = mVar.a();
                        int d18 = d(a16, 5, c8659a);
                        if (d18 == 15) {
                            nVar2 = new n('$', a16 + 5);
                        } else {
                            if (d18 < 5 || d18 >= 15) {
                                int d19 = d(a16, 7, c8659a);
                                if (d19 >= 64 && d19 < 90) {
                                    nVar = new n((char) (d19 + 1), a16 + 7);
                                } else if (d19 < 90 || d19 >= 116) {
                                    switch (d(a16, 8, c8659a)) {
                                        case 232:
                                            c11 = '!';
                                            break;
                                        case 233:
                                            c11 = '\"';
                                            break;
                                        case 234:
                                            c11 = '%';
                                            break;
                                        case 235:
                                            c11 = '&';
                                            break;
                                        case 236:
                                            c11 = '\'';
                                            break;
                                        case 237:
                                            c11 = '(';
                                            break;
                                        case 238:
                                            c11 = ')';
                                            break;
                                        case 239:
                                            c11 = '*';
                                            break;
                                        case 240:
                                            c11 = '+';
                                            break;
                                        case 241:
                                            c11 = ',';
                                            break;
                                        case 242:
                                            c11 = '-';
                                            break;
                                        case 243:
                                            c11 = '.';
                                            break;
                                        case 244:
                                            c11 = '/';
                                            break;
                                        case 245:
                                            c11 = ':';
                                            break;
                                        case 246:
                                            c11 = ';';
                                            break;
                                        case 247:
                                            c11 = '<';
                                            break;
                                        case 248:
                                            c11 = '=';
                                            break;
                                        case 249:
                                            c11 = '>';
                                            break;
                                        case m.e.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                            c11 = '?';
                                            break;
                                        case 251:
                                            c11 = '_';
                                            break;
                                        case 252:
                                            c11 = ' ';
                                            break;
                                        default:
                                            throw h9.h.a();
                                    }
                                    nVar = new n(c11, a16 + 8);
                                } else {
                                    nVar = new n((char) (d19 + 7), a16 + 7);
                                }
                            } else {
                                nVar = new n((char) (d18 + 43), a16 + 5);
                            }
                            nVar2 = nVar;
                        }
                        mVar.h(nVar2.a());
                        if (nVar2.c()) {
                            lVar4 = new l(new o(mVar.a(), sb2.toString()), true);
                        } else {
                            sb2.append(nVar2.b());
                            i12 = 16;
                        }
                    }
                }
                int a17 = mVar.a();
                int i14 = a17 + 3;
                if (i14 <= c8659a.j()) {
                    while (a17 < i14) {
                        if (!c8659a.f(a17)) {
                            a17++;
                        }
                    }
                    mVar.b(3);
                    mVar.g();
                    lVar4 = new l(null, false);
                    b11 = lVar4.b();
                }
                if (e(mVar.a())) {
                    if (mVar.a() + 5 < c8659a.j()) {
                        mVar.b(5);
                    } else {
                        mVar.h(c8659a.j());
                    }
                    mVar.e();
                }
                lVar4 = new l(null, false);
                b11 = lVar4.b();
            } else {
                while (true) {
                    int a18 = mVar.a();
                    if (a18 + 7 > c8659a.j()) {
                        if (a18 + 4 > c8659a.j()) {
                            f7 = false;
                            if (f7) {
                                int a19 = mVar.a();
                                int i15 = a19 + 7;
                                if (i15 > c8659a.j()) {
                                    int d21 = d(a19, 4, c8659a);
                                    pVar = d21 == 0 ? new p(c8659a.j(), 10, 10) : new p(c8659a.j(), d21 - 1, 10);
                                } else {
                                    int d22 = d(a19, 7, c8659a) - 8;
                                    pVar = new p(i15, d22 / 11, d22 % 11);
                                }
                                mVar.h(pVar.a());
                                if (pVar.d()) {
                                    lVar3 = new l(pVar.e() ? new o(mVar.a(), sb2.toString()) : new o(mVar.a(), sb2.toString(), pVar.c()), true);
                                } else {
                                    sb2.append(pVar.b());
                                    if (pVar.e()) {
                                        lVar3 = new l(new o(mVar.a(), sb2.toString()), true);
                                    } else {
                                        sb2.append(pVar.c());
                                    }
                                }
                            } else {
                                int a21 = mVar.a();
                                if (a21 + 1 <= c8659a.j()) {
                                    for (int i16 = 0; i16 < 4; i16++) {
                                        int i17 = i16 + a21;
                                        if (i17 >= c8659a.j()) {
                                            mVar.e();
                                            mVar.b(4);
                                        } else if (!c8659a.f(i17)) {
                                        }
                                    }
                                    mVar.e();
                                    mVar.b(4);
                                }
                                z11 = false;
                                lVar = new l(null, false);
                            }
                        }
                        f7 = true;
                        if (f7) {
                        }
                    } else {
                        int i18 = a18;
                        while (true) {
                            int i19 = a18 + 3;
                            if (i18 >= i19) {
                                f7 = c8659a.f(i19);
                            } else if (!c8659a.f(i18)) {
                                i18++;
                            }
                        }
                        f7 = true;
                        if (f7) {
                        }
                    }
                    if (a11 == mVar.a() && !b11) {
                    }
                    o a22 = lVar2.a();
                    return (a22 == null && a22.d()) ? new o(mVar.a(), sb2.toString(), a22.c()) : new o(mVar.a(), sb2.toString());
                }
                lVar = lVar3;
                z11 = false;
                lVar2 = lVar;
                b11 = lVar.b();
                if (a11 == mVar.a()) {
                    o a222 = lVar2.a();
                    if (a222 == null) {
                    }
                }
            }
            lVar2 = lVar4;
            z11 = false;
            if (a11 == mVar.a()) {
            }
        } while (!b11);
        o a2222 = lVar2.a();
        if (a2222 == null) {
        }
    }

    final int c(int i11, int i12) {
        return d(i11, i12, this.f3094a);
    }
}
