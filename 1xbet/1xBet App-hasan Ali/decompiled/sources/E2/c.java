package E2;

import android.graphics.Bitmap;
import p4.AbstractC2277q;
import p4.D;
import q4.C2313c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2277q f1405a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC2277q f1406b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2277q f1407c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2277q f1408d;

    /* renamed from: e, reason: collision with root package name */
    public final G2.c f1409e;
    public final F2.d f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f1410g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1411h;
    public final b i;

    /* renamed from: j, reason: collision with root package name */
    public final b f1412j;

    /* renamed from: k, reason: collision with root package name */
    public final b f1413k;

    public c() {
        w4.e eVar = D.f18743a;
        C2313c c2313c = u4.m.f20109a.f18897p;
        w4.d dVar = w4.d.f20559m;
        G2.c cVar = G2.e.f1983a;
        F2.d dVar2 = F2.d.f1530m;
        Bitmap.Config config = H2.e.f2284a;
        b bVar = b.ENABLED;
        this.f1405a = c2313c;
        this.f1406b = dVar;
        this.f1407c = dVar;
        this.f1408d = dVar;
        this.f1409e = cVar;
        this.f = dVar2;
        this.f1410g = config;
        this.f1411h = true;
        this.i = bVar;
        this.f1412j = bVar;
        this.f1413k = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.l.a(this.f1405a, cVar.f1405a) && kotlin.jvm.internal.l.a(this.f1406b, cVar.f1406b) && kotlin.jvm.internal.l.a(this.f1407c, cVar.f1407c) && kotlin.jvm.internal.l.a(this.f1408d, cVar.f1408d) && kotlin.jvm.internal.l.a(this.f1409e, cVar.f1409e) && this.f == cVar.f && this.f1410g == cVar.f1410g && this.f1411h == cVar.f1411h && this.i == cVar.i && this.f1412j == cVar.f1412j && this.f1413k == cVar.f1413k;
    }

    public final int hashCode() {
        int hashCode = (this.f1408d.hashCode() + ((this.f1407c.hashCode() + ((this.f1406b.hashCode() + (this.f1405a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f1409e.getClass();
        return this.f1413k.hashCode() + ((this.f1412j.hashCode() + ((this.i.hashCode() + ((((((this.f1410g.hashCode() + ((this.f.hashCode() + ((G2.c.class.hashCode() + hashCode) * 31)) * 31)) * 31) + (this.f1411h ? 1231 : 1237)) * 31) + 1237) * 923521)) * 31)) * 31);
    }
}
