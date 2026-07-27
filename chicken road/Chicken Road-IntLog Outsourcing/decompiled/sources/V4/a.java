package V4;

import B0.f;
import B0.l;
import B4.k;
import K1.b;
import L3.j;
import M0.e;
import T4.B;
import T4.C0153c;
import T4.E;
import T4.o;
import T4.r;
import T4.v;
import T4.y;
import T4.z;
import U4.c;
import Y4.i;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class a implements r {
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02cd, code lost:
    
        if (B4.r.O(r14, "1", false) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    @Override // T4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z a(i iVar) {
        l lVar;
        l lVar2;
        z zVar;
        o oVar;
        int i2;
        l lVar3;
        o oVar2;
        int i3;
        String str;
        int i6;
        System.currentTimeMillis();
        e eVar = iVar.f3716e;
        l lVar4 = new l(eVar, 7, null);
        C0153c c0153c = (C0153c) eVar.f1788h;
        if (c0153c == null) {
            int i7 = C0153c.f2830n;
            o headers = (o) eVar.f1785e;
            kotlin.jvm.internal.i.e(headers, "headers");
            int size = headers.size();
            String str2 = null;
            int i8 = 0;
            boolean z = true;
            boolean z5 = false;
            boolean z6 = false;
            int i9 = -1;
            int i10 = -1;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int i11 = -1;
            int i12 = -1;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            while (i8 < size) {
                String d6 = headers.d(i8);
                String f3 = headers.f(i8);
                if (d6.equalsIgnoreCase("Cache-Control")) {
                    if (str2 == null) {
                        str2 = f3;
                        i2 = 0;
                        while (i2 < f3.length()) {
                            int length = f3.length();
                            int i13 = i2;
                            while (true) {
                                if (i13 >= length) {
                                    lVar3 = lVar4;
                                    i13 = f3.length();
                                    break;
                                }
                                lVar3 = lVar4;
                                if (k.S("=,;", f3.charAt(i13))) {
                                    break;
                                }
                                i13++;
                                lVar4 = lVar3;
                            }
                            String substring = f3.substring(i2, i13);
                            kotlin.jvm.internal.i.d(substring, "substring(...)");
                            String obj = k.n0(substring).toString();
                            if (i13 == f3.length() || f3.charAt(i13) == ',' || f3.charAt(i13) == ';') {
                                oVar2 = headers;
                                i3 = i13 + 1;
                                str = null;
                            } else {
                                int i14 = i13 + 1;
                                byte[] bArr = c.f3176a;
                                int length2 = f3.length();
                                while (true) {
                                    if (i14 >= length2) {
                                        i6 = 1;
                                        i14 = f3.length();
                                        break;
                                    }
                                    char charAt = f3.charAt(i14);
                                    int i15 = length2;
                                    if (charAt != ' ' && charAt != '\t') {
                                        i6 = 1;
                                        break;
                                    }
                                    i14++;
                                    length2 = i15;
                                }
                                if (i14 < f3.length()) {
                                    oVar2 = headers;
                                    if (f3.charAt(i14) == '\"') {
                                        int i16 = i14 + i6;
                                        int W5 = k.W(f3, '\"', i16, false, 4);
                                        str = f3.substring(i16, W5);
                                        kotlin.jvm.internal.i.d(str, "substring(...)");
                                        i3 = W5 + 1;
                                    }
                                } else {
                                    oVar2 = headers;
                                }
                                int length3 = f3.length();
                                i3 = i14;
                                while (true) {
                                    if (i3 >= length3) {
                                        i3 = f3.length();
                                        break;
                                    }
                                    int i17 = length3;
                                    if (k.S(",;", f3.charAt(i3))) {
                                        break;
                                    }
                                    i3++;
                                    length3 = i17;
                                }
                                String substring2 = f3.substring(i14, i3);
                                kotlin.jvm.internal.i.d(substring2, "substring(...)");
                                str = k.n0(substring2).toString();
                            }
                            if ("no-cache".equalsIgnoreCase(obj)) {
                                i2 = i3;
                                lVar4 = lVar3;
                                headers = oVar2;
                                z5 = true;
                            } else if ("no-store".equalsIgnoreCase(obj)) {
                                i2 = i3;
                                lVar4 = lVar3;
                                headers = oVar2;
                                z6 = true;
                            } else {
                                if ("max-age".equalsIgnoreCase(obj)) {
                                    i9 = c.m(-1, str);
                                } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                    i10 = c.m(-1, str);
                                } else if ("private".equalsIgnoreCase(obj)) {
                                    i2 = i3;
                                    lVar4 = lVar3;
                                    headers = oVar2;
                                    z7 = true;
                                } else if (BuildConfig.SDK_BUILD_FLAVOR.equalsIgnoreCase(obj)) {
                                    i2 = i3;
                                    lVar4 = lVar3;
                                    headers = oVar2;
                                    z8 = true;
                                } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                    i2 = i3;
                                    lVar4 = lVar3;
                                    headers = oVar2;
                                    z9 = true;
                                } else if ("max-stale".equalsIgnoreCase(obj)) {
                                    i11 = c.m(Integer.MAX_VALUE, str);
                                } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                    i12 = c.m(-1, str);
                                } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                    i2 = i3;
                                    lVar4 = lVar3;
                                    headers = oVar2;
                                    z10 = true;
                                } else if ("no-transform".equalsIgnoreCase(obj)) {
                                    i2 = i3;
                                    lVar4 = lVar3;
                                    headers = oVar2;
                                    z11 = true;
                                } else {
                                    boolean equalsIgnoreCase = "immutable".equalsIgnoreCase(obj);
                                    i2 = i3;
                                    lVar4 = lVar3;
                                    headers = oVar2;
                                    if (equalsIgnoreCase) {
                                        z12 = true;
                                    }
                                }
                                i2 = i3;
                                lVar4 = lVar3;
                                headers = oVar2;
                            }
                        }
                        i8++;
                        lVar4 = lVar4;
                        headers = headers;
                    }
                } else if (!d6.equalsIgnoreCase("Pragma")) {
                    i8++;
                    lVar4 = lVar4;
                    headers = headers;
                }
                z = false;
                i2 = 0;
                while (i2 < f3.length()) {
                }
                i8++;
                lVar4 = lVar4;
                headers = headers;
            }
            lVar = lVar4;
            c0153c = new C0153c(z5, z6, i9, i10, z7, z8, z9, i11, i12, z10, z11, z12, !z ? null : str2);
            eVar.f1788h = c0153c;
        } else {
            lVar = lVar4;
        }
        if (c0153c.f2840j) {
            Object obj2 = null;
            lVar2 = new l(obj2, 7, obj2);
        } else {
            lVar2 = lVar;
        }
        X4.r call = iVar.f3712a;
        e eVar2 = (e) lVar2.f163b;
        z zVar2 = (z) lVar2.f164c;
        if (eVar2 == null && zVar2 == null) {
            z zVar3 = new z(eVar, v.f2987d, "Unsatisfiable Request (only-if-cached)", 504, null, new o((String[]) new ArrayList(20).toArray(new String[0])), B.f2804a, null, null, null, null, -1L, System.currentTimeMillis(), null, E.f2816a);
            kotlin.jvm.internal.i.e(call, "call");
            return zVar3;
        }
        if (eVar2 == null) {
            kotlin.jvm.internal.i.b(zVar2);
            y a6 = zVar2.a();
            z A5 = AbstractC1477a.A(zVar2);
            y.b("cacheResponse", A5);
            a6.f3009j = A5;
            z a7 = a6.a();
            kotlin.jvm.internal.i.e(call, "call");
            return a7;
        }
        if (zVar2 != null) {
            kotlin.jvm.internal.i.e(call, "call");
        }
        z b6 = iVar.b(eVar2);
        if (zVar2 == null) {
            zVar = null;
        } else {
            if (b6.f3018d == 304) {
                y a8 = zVar2.a();
                o oVar3 = b6.f3020f;
                j jVar = new j(3);
                o oVar4 = zVar2.f3020f;
                int size2 = oVar4.size();
                int i18 = 0;
                while (i18 < size2) {
                    String d7 = oVar4.d(i18);
                    String f6 = oVar4.f(i18);
                    if ("Warning".equalsIgnoreCase(d7)) {
                        oVar = oVar4;
                    } else {
                        oVar = oVar4;
                    }
                    if ("Content-Length".equalsIgnoreCase(d7) || "Content-Encoding".equalsIgnoreCase(d7) || "Content-Type".equalsIgnoreCase(d7) || !b.U(d7) || oVar3.c(d7) == null) {
                        f.i(jVar, d7, f6);
                    }
                    i18++;
                    oVar4 = oVar;
                }
                int size3 = oVar3.size();
                for (int i19 = 0; i19 < size3; i19++) {
                    String d8 = oVar3.d(i19);
                    if (!"Content-Length".equalsIgnoreCase(d8) && !"Content-Encoding".equalsIgnoreCase(d8) && !"Content-Type".equalsIgnoreCase(d8) && b.U(d8)) {
                        f.i(jVar, d8, oVar3.f(i19));
                    }
                }
                a8.f3005f = jVar.d().e();
                a8.f3011l = b6.f3026l;
                a8.f3012m = b6.f3027m;
                z A6 = AbstractC1477a.A(zVar2);
                y.b("cacheResponse", A6);
                a8.f3009j = A6;
                z A7 = AbstractC1477a.A(b6);
                y.b("networkResponse", A7);
                a8.f3008i = A7;
                a8.a();
                b6.f3021g.close();
                kotlin.jvm.internal.i.b(null);
                throw null;
            }
            zVar = null;
            c.b(zVar2.f3021g);
        }
        y a9 = b6.a();
        if (zVar2 != null) {
            zVar = AbstractC1477a.A(zVar2);
        }
        y.b("cacheResponse", zVar);
        a9.f3009j = zVar;
        z A8 = AbstractC1477a.A(b6);
        y.b("networkResponse", A8);
        a9.f3008i = A8;
        return a9.a();
    }
}
