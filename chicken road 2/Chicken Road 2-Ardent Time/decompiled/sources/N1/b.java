package N1;

/* loaded from: classes.dex */
public final class b implements I1.p {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141 A[Catch: IOException -> 0x0159, TryCatch #0 {IOException -> 0x0159, blocks: (B:33:0x011d, B:36:0x0138, B:38:0x0141, B:39:0x0144, B:40:0x015b, B:42:0x017a, B:55:0x01a4, B:58:0x01bf, B:59:0x01c9, B:61:0x01b7, B:62:0x019a, B:63:0x0184), top: B:32:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017a A[Catch: IOException -> 0x0159, TryCatch #0 {IOException -> 0x0159, blocks: (B:33:0x011d, B:36:0x0138, B:38:0x0141, B:39:0x0144, B:40:0x015b, B:42:0x017a, B:55:0x01a4, B:58:0x01bf, B:59:0x01c9, B:61:0x01b7, B:62:0x019a, B:63:0x0184), top: B:32:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a4 A[Catch: IOException -> 0x0159, TryCatch #0 {IOException -> 0x0159, blocks: (B:33:0x011d, B:36:0x0138, B:38:0x0141, B:39:0x0144, B:40:0x015b, B:42:0x017a, B:55:0x01a4, B:58:0x01bf, B:59:0x01c9, B:61:0x01b7, B:62:0x019a, B:63:0x0184), top: B:32:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a A[Catch: IOException -> 0x0159, TRY_ENTER, TryCatch #0 {IOException -> 0x0159, blocks: (B:33:0x011d, B:36:0x0138, B:38:0x0141, B:39:0x0144, B:40:0x015b, B:42:0x017a, B:55:0x01a4, B:58:0x01bf, B:59:0x01c9, B:61:0x01b7, B:62:0x019a, B:63:0x0184), top: B:32:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d4  */
    @Override // I1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I1.y a(N1.g gVar) {
        I1.x xVar;
        java.io.IOException iOException;
        I1.x xVar2;
        java.io.IOException iOException2;
        int i2;
        I1.y a2;
        I1.z zVar;
        java.io.IOException iOException3;
        I1.x c2;
        boolean z2;
        long j2;
        boolean z3;
        M1.e eVar = gVar.f1153d;
        kotlin.jvm.internal.i.b(eVar);
        M1.i call = (M1.i) eVar.f1038b;
        N1.e eVar2 = (N1.e) eVar.f1040d;
        M1.k kVar = (M1.k) eVar.f1041e;
        I1.v vVar = gVar.f1154e;
        I1.w wVar = vVar.f837d;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z4 = true;
        try {
            try {
                kotlin.jvm.internal.i.e(call, "call");
                eVar2.h(vVar);
                try {
                    if (!Q1.l.r(vVar.f835b) || wVar == null) {
                        iOException3 = null;
                        call.f(eVar, true, false, null);
                        xVar = null;
                    } else {
                        try {
                            if ("100-continue".equalsIgnoreCase(vVar.f836c.a("Expect"))) {
                                try {
                                    eVar2.d();
                                    c2 = eVar.c(true);
                                    try {
                                        kotlin.jvm.internal.i.e(call, "call");
                                        z2 = false;
                                    } catch (java.io.IOException e2) {
                                        e = e2;
                                        xVar = c2;
                                        if (!(e instanceof P1.C0053a)) {
                                            throw e;
                                        }
                                        if (!eVar.f1037a) {
                                            throw e;
                                        }
                                        iOException = e;
                                        if (xVar == null) {
                                        }
                                        xVar2 = xVar;
                                        xVar2.f844a = vVar;
                                        xVar2.f848e = kVar.f1072e;
                                        xVar2.f854k = currentTimeMillis;
                                        iOException2 = iOException;
                                        xVar2.f855l = java.lang.System.currentTimeMillis();
                                        I1.y a3 = xVar2.a();
                                        i2 = a3.f860d;
                                        if (i2 != 100) {
                                        }
                                        I1.x c3 = eVar.c(false);
                                        kotlin.jvm.internal.i.b(c3);
                                        if (z4) {
                                        }
                                        c3.f844a = vVar;
                                        c3.f848e = kVar.f1072e;
                                        c3.f854k = currentTimeMillis;
                                        c3.f855l = java.lang.System.currentTimeMillis();
                                        a3 = c3.a();
                                        i2 = a3.f860d;
                                        kotlin.jvm.internal.i.e(call, "call");
                                        I1.x b2 = a3.b();
                                        b2.f850g = eVar.b(a3);
                                        a2 = b2.a();
                                        if (!"close".equalsIgnoreCase(a2.f857a.f836c.a("Connection"))) {
                                        }
                                        eVar2.g().k();
                                        if (i2 != 204) {
                                        }
                                        zVar = a2.f863g;
                                        if ((zVar != null ? -1L : zVar.b()) > 0) {
                                        }
                                        return a2;
                                    }
                                } catch (java.io.IOException e3) {
                                    kotlin.jvm.internal.i.e(call, "call");
                                    eVar.d(e3);
                                    throw e3;
                                }
                            } else {
                                z2 = true;
                                c2 = null;
                            }
                            try {
                                if (c2 == null) {
                                    try {
                                        I1.w wVar2 = vVar.f837d;
                                        kotlin.jvm.internal.i.b(wVar2);
                                        j2 = wVar2.f841b;
                                        kotlin.jvm.internal.i.e(call, "call");
                                        xVar = c2;
                                    } catch (java.io.IOException e4) {
                                        e = e4;
                                        xVar = c2;
                                    }
                                    try {
                                        z3 = z2;
                                        V1.p pVar = new V1.p(new M1.c(eVar, eVar2.a(vVar, j2), j2));
                                        byte[] bArr = wVar.f842c;
                                        if (pVar.f1783c) {
                                            throw new java.lang.IllegalStateException("closed");
                                        }
                                        pVar.f1782b.s(bArr, wVar.f843d, wVar.f841b);
                                        pVar.a();
                                        pVar.close();
                                    } catch (java.io.IOException e5) {
                                        e = e5;
                                        boolean z5 = z2;
                                        z4 = z5;
                                        if (!(e instanceof P1.C0053a)) {
                                        }
                                    }
                                } else {
                                    xVar = c2;
                                    z3 = z2;
                                    call.f(eVar, true, false, null);
                                    if (kVar.f1074g == null) {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        eVar2.g().k();
                                    }
                                }
                                z4 = z3;
                                iOException3 = null;
                            } catch (java.io.IOException e6) {
                                e = e6;
                            }
                        } catch (java.io.IOException e7) {
                            e = e7;
                            xVar = null;
                        }
                    }
                    try {
                        eVar2.c();
                        iOException = iOException3;
                    } catch (java.io.IOException e8) {
                        try {
                            eVar.d(e8);
                            throw e8;
                        } catch (java.io.IOException e9) {
                            e = e9;
                            if (!(e instanceof P1.C0053a)) {
                            }
                        }
                    }
                } catch (java.io.IOException e10) {
                    e = e10;
                    xVar = null;
                    if (!(e instanceof P1.C0053a)) {
                    }
                }
            } catch (java.io.IOException e11) {
                kotlin.jvm.internal.i.e(call, "call");
                eVar.d(e11);
                throw e11;
            }
        } catch (java.io.IOException e12) {
            e = e12;
        }
        try {
            if (xVar == null) {
                try {
                    xVar = eVar.c(false);
                    kotlin.jvm.internal.i.b(xVar);
                    if (z4) {
                        kotlin.jvm.internal.i.e(call, "call");
                        xVar2 = xVar;
                        z4 = false;
                        xVar2.f844a = vVar;
                        xVar2.f848e = kVar.f1072e;
                        xVar2.f854k = currentTimeMillis;
                        iOException2 = iOException;
                        xVar2.f855l = java.lang.System.currentTimeMillis();
                        I1.y a32 = xVar2.a();
                        i2 = a32.f860d;
                        if (i2 != 100) {
                            if (102 <= i2 && i2 < 200) {
                            }
                            kotlin.jvm.internal.i.e(call, "call");
                            I1.x b22 = a32.b();
                            b22.f850g = eVar.b(a32);
                            a2 = b22.a();
                            if (!"close".equalsIgnoreCase(a2.f857a.f836c.a("Connection")) || "close".equalsIgnoreCase(I1.y.a(a2, "Connection"))) {
                                eVar2.g().k();
                            }
                            if (i2 != 204 || i2 == 205) {
                                zVar = a2.f863g;
                                if ((zVar != null ? -1L : zVar.b()) > 0) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP ");
                                    sb.append(i2);
                                    sb.append(" had non-zero Content-Length: ");
                                    sb.append(zVar == null ? null : java.lang.Long.valueOf(zVar.b()));
                                    throw new java.net.ProtocolException(sb.toString());
                                }
                            }
                            return a2;
                        }
                        I1.x c32 = eVar.c(false);
                        kotlin.jvm.internal.i.b(c32);
                        if (z4) {
                            kotlin.jvm.internal.i.e(call, "call");
                        }
                        c32.f844a = vVar;
                        c32.f848e = kVar.f1072e;
                        c32.f854k = currentTimeMillis;
                        c32.f855l = java.lang.System.currentTimeMillis();
                        a32 = c32.a();
                        i2 = a32.f860d;
                        kotlin.jvm.internal.i.e(call, "call");
                        I1.x b222 = a32.b();
                        b222.f850g = eVar.b(a32);
                        a2 = b222.a();
                        if (!"close".equalsIgnoreCase(a2.f857a.f836c.a("Connection"))) {
                        }
                        eVar2.g().k();
                        if (i2 != 204) {
                        }
                        zVar = a2.f863g;
                        if ((zVar != null ? -1L : zVar.b()) > 0) {
                        }
                        return a2;
                    }
                } catch (java.io.IOException e13) {
                    e = e13;
                    iOException2 = iOException;
                    if (iOException2 != null) {
                    }
                }
            }
            xVar2.f855l = java.lang.System.currentTimeMillis();
            I1.y a322 = xVar2.a();
            i2 = a322.f860d;
            if (i2 != 100) {
            }
            I1.x c322 = eVar.c(false);
            kotlin.jvm.internal.i.b(c322);
            if (z4) {
            }
            c322.f844a = vVar;
            c322.f848e = kVar.f1072e;
            c322.f854k = currentTimeMillis;
            c322.f855l = java.lang.System.currentTimeMillis();
            a322 = c322.a();
            i2 = a322.f860d;
            kotlin.jvm.internal.i.e(call, "call");
            I1.x b2222 = a322.b();
            b2222.f850g = eVar.b(a322);
            a2 = b2222.a();
            if (!"close".equalsIgnoreCase(a2.f857a.f836c.a("Connection"))) {
            }
            eVar2.g().k();
            if (i2 != 204) {
            }
            zVar = a2.f863g;
            if ((zVar != null ? -1L : zVar.b()) > 0) {
            }
            return a2;
        } catch (java.io.IOException e14) {
            e = e14;
            if (iOException2 != null) {
                throw e;
            }
            java.io.IOException iOException4 = iOException2;
            Q1.d.b(iOException4, e);
            throw iOException4;
        }
        xVar2 = xVar;
        xVar2.f844a = vVar;
        xVar2.f848e = kVar.f1072e;
        xVar2.f854k = currentTimeMillis;
        iOException2 = iOException;
    }
}
