package k1;

import H0.b;
import i1.C0071b;
import i1.c;
import i1.l;
import i1.m;
import i1.p;
import i1.s;
import i1.w;
import i1.x;
import i1.y;
import i1.z;
import j1.d;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;
import l1.g;
import m1.e;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6070a;

    public /* synthetic */ a(int i2) {
        this.f6070a = i2;
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static y c(y yVar) {
        if (yVar == null || yVar.f1454g == null) {
            return yVar;
        }
        x b2 = yVar.b();
        b2.f1442g = null;
        return b2.a();
    }

    @Override // i1.p
    public final y a(e eVar) {
        b bVar;
        x xVar = null;
        switch (this.f6070a) {
            case 0:
                System.currentTimeMillis();
                w wVar = eVar.f6135f;
                Y.e eVar2 = new Y.e(wVar, null, 26, false);
                if (wVar != null) {
                    c cVar = wVar.f1435f;
                    if (cVar == null) {
                        cVar = c.a(wVar.f1432c);
                        wVar.f1435f = cVar;
                    }
                    if (cVar.f1303j) {
                        eVar2 = new Y.e(null, null, 26, false);
                    }
                }
                w wVar2 = (w) eVar2.f523b;
                y yVar = (y) eVar2.f524c;
                if (wVar2 == null && yVar == null) {
                    x xVar2 = new x();
                    xVar2.f1436a = eVar.f6135f;
                    xVar2.f1437b = s.HTTP_1_1;
                    xVar2.f1438c = 504;
                    xVar2.f1439d = "Unsatisfiable Request (only-if-cached)";
                    xVar2.f1442g = d.f6055c;
                    xVar2.f1446k = -1L;
                    xVar2.f1447l = System.currentTimeMillis();
                    return xVar2.a();
                }
                if (wVar2 == null) {
                    x b2 = yVar.b();
                    y c2 = c(yVar);
                    if (c2 != null) {
                        x.b("cacheResponse", c2);
                    }
                    b2.f1444i = c2;
                    return b2.a();
                }
                y a2 = eVar.a(wVar2);
                if (yVar != null) {
                    if (a2.f1450c == 304) {
                        x b3 = yVar.b();
                        ArrayList arrayList = new ArrayList(20);
                        m mVar = yVar.f1453f;
                        int d2 = mVar.d();
                        int i2 = 0;
                        while (true) {
                            m mVar2 = a2.f1453f;
                            if (i2 >= d2) {
                                int d3 = mVar2.d();
                                for (int i3 = 0; i3 < d3; i3++) {
                                    String b4 = mVar2.b(i3);
                                    if (!"Content-Length".equalsIgnoreCase(b4) && !"Content-Encoding".equalsIgnoreCase(b4) && !"Content-Type".equalsIgnoreCase(b4) && b(b4)) {
                                        C0071b c0071b = C0071b.f1293e;
                                        String e2 = mVar2.e(i3);
                                        c0071b.getClass();
                                        arrayList.add(b4);
                                        arrayList.add(e2.trim());
                                    }
                                }
                                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                                l lVar = new l(0);
                                Collections.addAll(lVar.f1365a, strArr);
                                b3.f1441f = lVar;
                                b3.f1446k = a2.f1458k;
                                b3.f1447l = a2.f1459l;
                                y c3 = c(yVar);
                                if (c3 != null) {
                                    x.b("cacheResponse", c3);
                                }
                                b3.f1444i = c3;
                                y c4 = c(a2);
                                if (c4 != null) {
                                    x.b("networkResponse", c4);
                                }
                                b3.f1443h = c4;
                                b3.a();
                                a2.f1454g.close();
                                throw null;
                            }
                            String b5 = mVar.b(i2);
                            String e3 = mVar.e(i2);
                            if ((!"Warning".equalsIgnoreCase(b5) || !e3.startsWith("1")) && ("Content-Length".equalsIgnoreCase(b5) || "Content-Encoding".equalsIgnoreCase(b5) || "Content-Type".equalsIgnoreCase(b5) || !b(b5) || mVar2.a(b5) == null)) {
                                C0071b.f1293e.getClass();
                                arrayList.add(b5);
                                arrayList.add(e3.trim());
                            }
                            i2++;
                        }
                    } else {
                        d.c(yVar.f1454g);
                    }
                }
                x b6 = a2.b();
                y c5 = c(yVar);
                if (c5 != null) {
                    x.b("cacheResponse", c5);
                }
                b6.f1444i = c5;
                y c6 = c(a2);
                if (c6 != null) {
                    x.b("networkResponse", c6);
                }
                b6.f1443h = c6;
                return b6.a();
            default:
                long currentTimeMillis = System.currentTimeMillis();
                eVar.f6137h.getClass();
                m1.b bVar2 = eVar.f6132c;
                w wVar3 = eVar.f6135f;
                bVar2.d(wVar3);
                boolean t2 = V.a.t(wVar3.f1431b);
                g gVar = eVar.f6131b;
                if (t2 && (bVar = wVar3.f1433d) != null) {
                    if ("100-continue".equalsIgnoreCase(wVar3.f1432c.a("Expect"))) {
                        bVar2.c();
                        xVar = bVar2.e(true);
                    }
                    if (xVar == null) {
                        int i4 = bVar.f180b;
                        m1.a aVar = new m1.a(bVar2.a(wVar3, i4));
                        Logger logger = s1.l.f6634a;
                        s1.m mVar3 = new s1.m(aVar);
                        byte[] bArr = (byte[]) bVar.f182d;
                        if (mVar3.f6637c) {
                            throw new IllegalStateException("closed");
                        }
                        mVar3.f6635a.s(i4, bArr);
                        mVar3.a();
                        mVar3.close();
                    } else if (eVar.f6133d.f6095h == null) {
                        gVar.e();
                    }
                }
                bVar2.b();
                if (xVar == null) {
                    xVar = bVar2.e(false);
                }
                xVar.f1436a = wVar3;
                xVar.f1440e = gVar.a().f6093f;
                xVar.f1446k = currentTimeMillis;
                xVar.f1447l = System.currentTimeMillis();
                y a3 = xVar.a();
                int i5 = a3.f1450c;
                if (i5 == 100) {
                    x e4 = bVar2.e(false);
                    e4.f1436a = wVar3;
                    e4.f1440e = gVar.a().f6093f;
                    e4.f1446k = currentTimeMillis;
                    e4.f1447l = System.currentTimeMillis();
                    a3 = e4.a();
                    i5 = a3.f1450c;
                }
                x b7 = a3.b();
                b7.f1442g = bVar2.f(a3);
                y a4 = b7.a();
                if ("close".equalsIgnoreCase(a4.f1448a.f1432c.a("Connection")) || "close".equalsIgnoreCase(a4.a("Connection"))) {
                    gVar.e();
                }
                if (i5 == 204 || i5 == 205) {
                    z zVar = a4.f1454g;
                    if (zVar.b() > 0) {
                        throw new ProtocolException("HTTP " + i5 + " had non-zero Content-Length: " + zVar.b());
                    }
                }
                return a4;
        }
    }
}
