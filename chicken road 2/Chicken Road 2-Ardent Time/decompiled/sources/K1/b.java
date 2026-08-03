package K1;

/* loaded from: classes.dex */
public final class b implements I1.p {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    @Override // I1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I1.y a(N1.g gVar) {
        x0.e eVar;
        x0.e eVar2;
        I1.m mVar;
        int i2;
        int i3;
        x0.e eVar3;
        int i4;
        java.lang.String str;
        java.lang.System.currentTimeMillis();
        I1.v request = gVar.f1154e;
        kotlin.jvm.internal.i.e(request, "request");
        x0.e eVar4 = new x0.e(5, request, (java.lang.Object) null);
        I1.c cVar = request.f839f;
        if (cVar == null) {
            int i5 = I1.c.f683n;
            I1.m mVar2 = request.f836c;
            int size = mVar2.size();
            java.lang.String str2 = null;
            boolean z2 = true;
            boolean z3 = false;
            boolean z4 = false;
            int i6 = -1;
            int i7 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i8 = -1;
            int i9 = -1;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (i2 < size) {
                int i10 = i2 + 1;
                java.lang.String b2 = mVar2.b(i2);
                java.lang.String d2 = mVar2.d(i2);
                if (!y1.o.G(b2, "Cache-Control")) {
                    i2 = y1.o.G(b2, "Pragma") ? 0 : i10;
                } else if (str2 == null) {
                    str2 = d2;
                    i3 = 0;
                    while (i3 < d2.length()) {
                        int length = d2.length();
                        int i11 = i3;
                        while (true) {
                            if (i11 >= length) {
                                i11 = d2.length();
                                break;
                            }
                            int i12 = i11 + 1;
                            if (y1.g.L("=,;", d2.charAt(i11))) {
                                break;
                            }
                            i11 = i12;
                        }
                        java.lang.String substring = d2.substring(i3, i11);
                        kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        java.lang.String obj = y1.g.c0(substring).toString();
                        if (i11 == d2.length() || d2.charAt(i11) == ',' || d2.charAt(i11) == ';') {
                            eVar3 = eVar4;
                            i4 = i11 + 1;
                            str = null;
                        } else {
                            int i13 = i11 + 1;
                            byte[] bArr = J1.b.f932a;
                            int length2 = d2.length();
                            while (true) {
                                if (i13 >= length2) {
                                    i13 = d2.length();
                                    break;
                                }
                                int i14 = i13 + 1;
                                char charAt = d2.charAt(i13);
                                int i15 = length2;
                                if (charAt != ' ' && charAt != '\t') {
                                    break;
                                }
                                i13 = i14;
                                length2 = i15;
                            }
                            if (i13 >= d2.length() || d2.charAt(i13) != '\"') {
                                eVar3 = eVar4;
                                int length3 = d2.length();
                                int i16 = i13;
                                while (true) {
                                    if (i16 >= length3) {
                                        i16 = d2.length();
                                        break;
                                    }
                                    int i17 = i16 + 1;
                                    int i18 = length3;
                                    if (y1.g.L(",;", d2.charAt(i16))) {
                                        break;
                                    }
                                    i16 = i17;
                                    length3 = i18;
                                }
                                java.lang.String substring2 = d2.substring(i13, i16);
                                kotlin.jvm.internal.i.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                str = y1.g.c0(substring2).toString();
                                i4 = i16;
                            } else {
                                int i19 = i13 + 1;
                                eVar3 = eVar4;
                                int Q2 = y1.g.Q(d2, '\"', i19, false, 4);
                                java.lang.String substring3 = d2.substring(i19, Q2);
                                kotlin.jvm.internal.i.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                i4 = Q2 + 1;
                                str = substring3;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            i3 = i4;
                            eVar4 = eVar3;
                            z3 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            i3 = i4;
                            eVar4 = eVar3;
                            z4 = true;
                        } else {
                            if ("max-age".equalsIgnoreCase(obj)) {
                                i6 = J1.b.x(-1, str);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i7 = J1.b.x(-1, str);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                i3 = i4;
                                eVar4 = eVar3;
                                z5 = true;
                            } else if (io.appmetrica.analytics.BuildConfig.SDK_BUILD_FLAVOR.equalsIgnoreCase(obj)) {
                                i3 = i4;
                                eVar4 = eVar3;
                                z6 = true;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                i3 = i4;
                                eVar4 = eVar3;
                                z7 = true;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i8 = J1.b.x(Integer.MAX_VALUE, str);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i9 = J1.b.x(-1, str);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                i3 = i4;
                                eVar4 = eVar3;
                                z8 = true;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                i3 = i4;
                                eVar4 = eVar3;
                                z9 = true;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                i3 = i4;
                                eVar4 = eVar3;
                                z10 = true;
                            }
                            i3 = i4;
                            eVar4 = eVar3;
                        }
                    }
                }
                z2 = false;
                i3 = 0;
                while (i3 < d2.length()) {
                }
            }
            eVar = eVar4;
            cVar = new I1.c(z3, z4, i6, i7, z5, z6, z7, i8, i9, z8, z9, z10, !z2 ? null : str2);
            request.f839f = cVar;
        } else {
            eVar = eVar4;
        }
        if (cVar.f693j) {
            java.lang.Object obj2 = null;
            eVar2 = new x0.e(5, obj2, obj2);
        } else {
            eVar2 = eVar;
        }
        M1.i call = gVar.f1150a;
        I1.v vVar = (I1.v) eVar2.f8409b;
        I1.y yVar = (I1.y) eVar2.f8410c;
        if (vVar == null && yVar == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(20);
            I1.t tVar = I1.t.HTTP_1_1;
            I1.z zVar = J1.b.f934c;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
            if (array == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            I1.y yVar2 = new I1.y(request, tVar, "Unsatisfiable Request (only-if-cached)", 504, null, new I1.m((java.lang.String[]) array), zVar, null, null, null, -1L, currentTimeMillis, null);
            kotlin.jvm.internal.i.e(call, "call");
            return yVar2;
        }
        if (vVar == null) {
            kotlin.jvm.internal.i.b(yVar);
            I1.x b3 = yVar.b();
            I1.y a2 = K1.a.a(yVar);
            I1.x.b(a2, "cacheResponse");
            b3.f852i = a2;
            I1.y a3 = b3.a();
            kotlin.jvm.internal.i.e(call, "call");
            return a3;
        }
        if (yVar != null) {
            kotlin.jvm.internal.i.e(call, "call");
        }
        I1.y b4 = gVar.b(vVar);
        if (yVar != null) {
            if (b4.f860d == 304) {
                I1.x b5 = yVar.b();
                I1.m mVar3 = b4.f862f;
                I1.l lVar = new I1.l(0);
                I1.m mVar4 = yVar.f862f;
                int size2 = mVar4.size();
                int i20 = 0;
                while (i20 < size2) {
                    int i21 = i20 + 1;
                    java.lang.String b6 = mVar4.b(i20);
                    java.lang.String d3 = mVar4.d(i20);
                    if ("Warning".equalsIgnoreCase(b6)) {
                        mVar = mVar4;
                        if (y1.o.K(d3, "1", false)) {
                            i20 = i21;
                            mVar4 = mVar;
                        }
                    } else {
                        mVar = mVar4;
                    }
                    if ("Content-Length".equalsIgnoreCase(b6) || "Content-Encoding".equalsIgnoreCase(b6) || "Content-Type".equalsIgnoreCase(b6) || !K1.a.b(b6) || mVar3.a(b6) == null) {
                        lVar.a(b6, d3);
                    }
                    i20 = i21;
                    mVar4 = mVar;
                }
                int i22 = 0;
                int size3 = mVar3.size();
                while (i22 < size3) {
                    int i23 = i22 + 1;
                    java.lang.String b7 = mVar3.b(i22);
                    if (!"Content-Length".equalsIgnoreCase(b7) && !"Content-Encoding".equalsIgnoreCase(b7) && !"Content-Type".equalsIgnoreCase(b7) && K1.a.b(b7)) {
                        lVar.a(b7, mVar3.d(i22));
                    }
                    i22 = i23;
                }
                b5.f849f = lVar.b().c();
                b5.f854k = b4.f867k;
                b5.f855l = b4.f868l;
                I1.y a4 = K1.a.a(yVar);
                I1.x.b(a4, "cacheResponse");
                b5.f852i = a4;
                I1.y a5 = K1.a.a(b4);
                I1.x.b(a5, "networkResponse");
                b5.f851h = a5;
                b5.a();
                I1.z zVar2 = b4.f863g;
                kotlin.jvm.internal.i.b(zVar2);
                zVar2.close();
                kotlin.jvm.internal.i.b(null);
                throw null;
            }
            I1.z zVar3 = yVar.f863g;
            if (zVar3 != null) {
                J1.b.d(zVar3);
            }
        }
        I1.x b8 = b4.b();
        I1.y a6 = K1.a.a(yVar);
        I1.x.b(a6, "cacheResponse");
        b8.f852i = a6;
        I1.y a7 = K1.a.a(b4);
        I1.x.b(a7, "networkResponse");
        b8.f851h = a7;
        return b8.a();
    }
}
