package E2;

import X3.v;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.L;
import java.util.Arrays;
import n.C2138i;
import p4.AbstractC2277q;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1437a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1438b;

    /* renamed from: c, reason: collision with root package name */
    public final C2138i f1439c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap.Config f1440d;

    /* renamed from: e, reason: collision with root package name */
    public final F2.d f1441e;
    public final v f;

    /* renamed from: g, reason: collision with root package name */
    public final G2.e f1442g;

    /* renamed from: h, reason: collision with root package name */
    public final y4.m f1443h;
    public final p i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1444j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1445k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1446l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1447m;

    /* renamed from: n, reason: collision with root package name */
    public final b f1448n;

    /* renamed from: o, reason: collision with root package name */
    public final b f1449o;

    /* renamed from: p, reason: collision with root package name */
    public final b f1450p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC2277q f1451q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC2277q f1452r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC2277q f1453s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC2277q f1454t;

    /* renamed from: u, reason: collision with root package name */
    public final L f1455u;

    /* renamed from: v, reason: collision with root package name */
    public final F2.i f1456v;

    /* renamed from: w, reason: collision with root package name */
    public final F2.g f1457w;

    /* renamed from: x, reason: collision with root package name */
    public final n f1458x;

    /* renamed from: y, reason: collision with root package name */
    public final d f1459y;

    /* renamed from: z, reason: collision with root package name */
    public final c f1460z;

    public i(Context context, Object obj, C2138i c2138i, Bitmap.Config config, F2.d dVar, v vVar, G2.e eVar, y4.m mVar, p pVar, boolean z3, boolean z5, boolean z6, boolean z7, b bVar, b bVar2, b bVar3, AbstractC2277q abstractC2277q, AbstractC2277q abstractC2277q2, AbstractC2277q abstractC2277q3, AbstractC2277q abstractC2277q4, L l5, F2.i iVar, F2.g gVar, n nVar, d dVar2, c cVar) {
        this.f1437a = context;
        this.f1438b = obj;
        this.f1439c = c2138i;
        this.f1440d = config;
        this.f1441e = dVar;
        this.f = vVar;
        this.f1442g = eVar;
        this.f1443h = mVar;
        this.i = pVar;
        this.f1444j = z3;
        this.f1445k = z5;
        this.f1446l = z6;
        this.f1447m = z7;
        this.f1448n = bVar;
        this.f1449o = bVar2;
        this.f1450p = bVar3;
        this.f1451q = abstractC2277q;
        this.f1452r = abstractC2277q2;
        this.f1453s = abstractC2277q3;
        this.f1454t = abstractC2277q4;
        this.f1455u = l5;
        this.f1456v = iVar;
        this.f1457w = gVar;
        this.f1458x = nVar;
        this.f1459y = dVar2;
        this.f1460z = cVar;
    }

    public static h a(i iVar) {
        Context context = iVar.f1437a;
        iVar.getClass();
        return new h(iVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.l.a(this.f1437a, iVar.f1437a) && this.f1438b.equals(iVar.f1438b) && kotlin.jvm.internal.l.a(this.f1439c, iVar.f1439c) && this.f1440d == iVar.f1440d && this.f1441e == iVar.f1441e && kotlin.jvm.internal.l.a(this.f, iVar.f) && kotlin.jvm.internal.l.a(this.f1442g, iVar.f1442g) && kotlin.jvm.internal.l.a(this.f1443h, iVar.f1443h) && this.i.equals(iVar.i) && this.f1444j == iVar.f1444j && this.f1445k == iVar.f1445k && this.f1446l == iVar.f1446l && this.f1447m == iVar.f1447m && this.f1448n == iVar.f1448n && this.f1449o == iVar.f1449o && this.f1450p == iVar.f1450p && kotlin.jvm.internal.l.a(this.f1451q, iVar.f1451q) && kotlin.jvm.internal.l.a(this.f1452r, iVar.f1452r) && kotlin.jvm.internal.l.a(this.f1453s, iVar.f1453s) && kotlin.jvm.internal.l.a(this.f1454t, iVar.f1454t) && kotlin.jvm.internal.l.a(this.f1455u, iVar.f1455u) && this.f1456v.equals(iVar.f1456v) && this.f1457w == iVar.f1457w && this.f1458x.equals(iVar.f1458x) && this.f1459y.equals(iVar.f1459y) && kotlin.jvm.internal.l.a(this.f1460z, iVar.f1460z);
    }

    public final int hashCode() {
        int hashCode = (this.f1438b.hashCode() + (this.f1437a.hashCode() * 31)) * 31;
        C2138i c2138i = this.f1439c;
        int hashCode2 = (this.f1441e.hashCode() + ((this.f1440d.hashCode() + ((hashCode + (c2138i != null ? c2138i.hashCode() : 0)) * 923521)) * 961)) * 29791;
        this.f.getClass();
        return this.f1460z.hashCode() + ((this.f1459y.hashCode() + ((this.f1458x.f1476k.hashCode() + ((this.f1457w.hashCode() + ((this.f1456v.hashCode() + ((this.f1455u.hashCode() + ((this.f1454t.hashCode() + ((this.f1453s.hashCode() + ((this.f1452r.hashCode() + ((this.f1451q.hashCode() + ((this.f1450p.hashCode() + ((this.f1449o.hashCode() + ((this.f1448n.hashCode() + ((((((((((this.i.f1484a.hashCode() + ((((this.f1442g.hashCode() + ((1 + hashCode2) * 31)) * 31) + Arrays.hashCode(this.f1443h.f21360k)) * 31)) * 31) + (this.f1444j ? 1231 : 1237)) * 31) + (this.f1445k ? 1231 : 1237)) * 31) + (this.f1446l ? 1231 : 1237)) * 31) + (this.f1447m ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
