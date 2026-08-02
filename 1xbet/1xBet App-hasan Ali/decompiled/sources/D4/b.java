package D4;

import A.v;
import C4.i;
import C4.k;
import F4.C0121a;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.l;
import r3.AbstractC2349a;
import t3.AbstractC2425d;
import y4.B;
import y4.m;
import y4.p;
import y4.x;
import y4.y;
import y4.z;

/* loaded from: classes.dex */
public final class b implements p {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a A[Catch: IOException -> 0x010a, TryCatch #5 {IOException -> 0x010a, blocks: (B:29:0x00fc, B:31:0x0105, B:39:0x010d, B:42:0x0131, B:44:0x013a, B:45:0x013d, B:46:0x0151, B:48:0x0172, B:57:0x018f, B:60:0x019c, B:62:0x01ad, B:63:0x01b7, B:64:0x01c1, B:68:0x017c), top: B:28:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0172 A[Catch: IOException -> 0x010a, TryCatch #5 {IOException -> 0x010a, blocks: (B:29:0x00fc, B:31:0x0105, B:39:0x010d, B:42:0x0131, B:44:0x013a, B:45:0x013d, B:46:0x0151, B:48:0x0172, B:57:0x018f, B:60:0x019c, B:62:0x01ad, B:63:0x01b7, B:64:0x01c1, B:68:0x017c), top: B:28:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f A[Catch: IOException -> 0x010a, TRY_ENTER, TryCatch #5 {IOException -> 0x010a, blocks: (B:29:0x00fc, B:31:0x0105, B:39:0x010d, B:42:0x0131, B:44:0x013a, B:45:0x013d, B:46:0x0151, B:48:0x0172, B:57:0x018f, B:60:0x019c, B:62:0x01ad, B:63:0x01b7, B:64:0x01c1, B:68:0x017c), top: B:28:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019c A[Catch: IOException -> 0x010a, TryCatch #5 {IOException -> 0x010a, blocks: (B:29:0x00fc, B:31:0x0105, B:39:0x010d, B:42:0x0131, B:44:0x013a, B:45:0x013d, B:46:0x0151, B:48:0x0172, B:57:0x018f, B:60:0x019c, B:62:0x01ad, B:63:0x01b7, B:64:0x01c1, B:68:0x017c), top: B:28:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb  */
    /* JADX WARN: Type inference failed for: r7v1, types: [D4.d] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // y4.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final z a(f fVar) {
        y yVar;
        d dVar;
        IOException iOException;
        y yVar2;
        int i;
        z a5;
        B b3;
        IOException iOException2;
        boolean z3;
        y yVar3;
        long a6;
        v vVar = fVar.f979d;
        l.c(vVar);
        i iVar = (i) vVar.f133b;
        ?? r7 = (d) vVar.f135d;
        k kVar = (k) vVar.f136e;
        C0.c cVar = fVar.f980e;
        x xVar = (x) cVar.f814e;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z5 = true;
        try {
            try {
                l.f("call", iVar);
                r7.e(cVar);
            } catch (IOException e3) {
                e = e3;
            }
            try {
                if (!AbstractC2349a.I((String) cVar.f812c) || xVar == null) {
                    dVar = r7;
                    iOException2 = null;
                    iVar.j(vVar, true, false, null);
                    yVar = null;
                } else {
                    try {
                        if ("100-continue".equalsIgnoreCase(((m) cVar.f813d).c("Expect"))) {
                            try {
                                try {
                                    r7.d();
                                    yVar = vVar.i(true);
                                    try {
                                        l.f("call", iVar);
                                        z3 = false;
                                    } catch (IOException e5) {
                                        e = e5;
                                        dVar = r7;
                                        if (e instanceof C0121a) {
                                        }
                                    }
                                } catch (IOException e6) {
                                    l.f("call", iVar);
                                    vVar.j(e6);
                                    throw e6;
                                }
                            } catch (IOException e7) {
                                e = e7;
                                dVar = r7;
                                yVar = null;
                                if (e instanceof C0121a) {
                                }
                            }
                        } else {
                            z3 = true;
                            yVar = null;
                        }
                        try {
                            if (yVar == null) {
                                try {
                                    x xVar2 = (x) cVar.f814e;
                                    l.c(xVar2);
                                    a6 = xVar2.a();
                                    l.f("call", iVar);
                                    yVar3 = yVar;
                                } catch (IOException e8) {
                                    e = e8;
                                    dVar = r7;
                                    yVar3 = yVar;
                                }
                                try {
                                    dVar = r7;
                                    L4.B j5 = N4.b.j(new C4.c(vVar, r7.b(cVar, a6), a6));
                                    xVar.c(j5);
                                    j5.close();
                                } catch (IOException e9) {
                                    e = e9;
                                    dVar = r7;
                                    z5 = z3;
                                    yVar = yVar3;
                                    if (e instanceof C0121a) {
                                    }
                                }
                            } else {
                                dVar = r7;
                                yVar3 = yVar;
                                iVar.j(vVar, true, false, null);
                                if (kVar.f896g == null) {
                                    z5 = false;
                                }
                                if (!z5) {
                                    dVar.h().l();
                                }
                            }
                            z5 = z3;
                            yVar = yVar3;
                            iOException2 = null;
                        } catch (IOException e10) {
                            e = e10;
                        }
                    } catch (IOException e11) {
                        e = e11;
                    }
                }
                try {
                    dVar.c();
                    yVar2 = yVar;
                    iOException = iOException2;
                } catch (IOException e12) {
                    try {
                        vVar.j(e12);
                        throw e12;
                    } catch (IOException e13) {
                        e = e13;
                        if (e instanceof C0121a) {
                            throw e;
                        }
                        if (!vVar.f132a) {
                            throw e;
                        }
                        y yVar4 = yVar;
                        iOException = e;
                        yVar2 = yVar4;
                        if (yVar2 == null) {
                        }
                        yVar2.f21437a = cVar;
                        yVar2.f21441e = kVar.f895e;
                        yVar2.f21445k = currentTimeMillis;
                        yVar2.f21446l = System.currentTimeMillis();
                        z a7 = yVar2.a();
                        i = a7.f21451n;
                        if (i != 100) {
                        }
                        y i5 = vVar.i(false);
                        l.c(i5);
                        if (z5) {
                        }
                        i5.f21437a = cVar;
                        i5.f21441e = kVar.f895e;
                        i5.f21445k = currentTimeMillis;
                        i5.f21446l = System.currentTimeMillis();
                        a7 = i5.a();
                        i = a7.f21451n;
                        l.f("call", iVar);
                        y f = a7.f();
                        f.f21442g = vVar.g(a7);
                        a5 = f.a();
                        if (!"close".equalsIgnoreCase(((m) a5.f21448k.f813d).c("Connection"))) {
                        }
                        dVar.h().l();
                        if (i != 204) {
                        }
                        b3 = a5.f21454q;
                        if ((b3 != null ? b3.b() : -1L) > 0) {
                        }
                        return a5;
                    }
                }
            } catch (IOException e14) {
                e = e14;
                dVar = r7;
                r7 = 0;
                yVar = r7;
                if (e instanceof C0121a) {
                }
            }
            if (yVar2 == null) {
                try {
                    yVar2 = vVar.i(false);
                    l.c(yVar2);
                    if (z5) {
                        l.f("call", iVar);
                        z5 = false;
                    }
                } catch (IOException e15) {
                    if (iOException == null) {
                        throw e15;
                    }
                    AbstractC2425d.j(iOException, e15);
                    throw iOException;
                }
            }
            yVar2.f21437a = cVar;
            yVar2.f21441e = kVar.f895e;
            yVar2.f21445k = currentTimeMillis;
            yVar2.f21446l = System.currentTimeMillis();
            z a72 = yVar2.a();
            i = a72.f21451n;
            if (i != 100) {
                if (102 <= i && i < 200) {
                }
                l.f("call", iVar);
                y f5 = a72.f();
                f5.f21442g = vVar.g(a72);
                a5 = f5.a();
                if (!"close".equalsIgnoreCase(((m) a5.f21448k.f813d).c("Connection")) || "close".equalsIgnoreCase(z.b("Connection", a5))) {
                    dVar.h().l();
                }
                if (i != 204 || i == 205) {
                    b3 = a5.f21454q;
                    if ((b3 != null ? b3.b() : -1L) > 0) {
                        StringBuilder sb = new StringBuilder("HTTP ");
                        sb.append(i);
                        sb.append(" had non-zero Content-Length: ");
                        sb.append(b3 != null ? Long.valueOf(b3.b()) : null);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return a5;
            }
            y i52 = vVar.i(false);
            l.c(i52);
            if (z5) {
                l.f("call", iVar);
            }
            i52.f21437a = cVar;
            i52.f21441e = kVar.f895e;
            i52.f21445k = currentTimeMillis;
            i52.f21446l = System.currentTimeMillis();
            a72 = i52.a();
            i = a72.f21451n;
            l.f("call", iVar);
            y f52 = a72.f();
            f52.f21442g = vVar.g(a72);
            a5 = f52.a();
            if (!"close".equalsIgnoreCase(((m) a5.f21448k.f813d).c("Connection"))) {
            }
            dVar.h().l();
            if (i != 204) {
            }
            b3 = a5.f21454q;
            if ((b3 != null ? b3.b() : -1L) > 0) {
            }
            return a5;
        } catch (IOException e16) {
            l.f("call", iVar);
            vVar.j(e16);
            throw e16;
        }
    }
}
