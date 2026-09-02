package i1;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final w f1448a;

    /* renamed from: b, reason: collision with root package name */
    public final s f1449b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1450c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1451d;

    /* renamed from: e, reason: collision with root package name */
    public final k f1452e;

    /* renamed from: f, reason: collision with root package name */
    public final m f1453f;

    /* renamed from: g, reason: collision with root package name */
    public final z f1454g;

    /* renamed from: h, reason: collision with root package name */
    public final y f1455h;

    /* renamed from: i, reason: collision with root package name */
    public final y f1456i;

    /* renamed from: j, reason: collision with root package name */
    public final y f1457j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1458k;

    /* renamed from: l, reason: collision with root package name */
    public final long f1459l;

    public y(x xVar) {
        this.f1448a = xVar.f1436a;
        this.f1449b = xVar.f1437b;
        this.f1450c = xVar.f1438c;
        this.f1451d = xVar.f1439d;
        this.f1452e = xVar.f1440e;
        l lVar = xVar.f1441f;
        lVar.getClass();
        this.f1453f = new m(lVar);
        this.f1454g = xVar.f1442g;
        this.f1455h = xVar.f1443h;
        this.f1456i = xVar.f1444i;
        this.f1457j = xVar.f1445j;
        this.f1458k = xVar.f1446k;
        this.f1459l = xVar.f1447l;
    }

    public final String a(String str) {
        String a2 = this.f1453f.a(str);
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    public final x b() {
        x xVar = new x();
        xVar.f1436a = this.f1448a;
        xVar.f1437b = this.f1449b;
        xVar.f1438c = this.f1450c;
        xVar.f1439d = this.f1451d;
        xVar.f1440e = this.f1452e;
        xVar.f1441f = this.f1453f.c();
        xVar.f1442g = this.f1454g;
        xVar.f1443h = this.f1455h;
        xVar.f1444i = this.f1456i;
        xVar.f1445j = this.f1457j;
        xVar.f1446k = this.f1458k;
        xVar.f1447l = this.f1459l;
        return xVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f1454g;
        if (zVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        zVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f1449b + ", code=" + this.f1450c + ", message=" + this.f1451d + ", url=" + this.f1448a.f1430a + '}';
    }
}
