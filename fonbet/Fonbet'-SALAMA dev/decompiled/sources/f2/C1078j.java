package f2;

import A1.X;
import c2.C0796b;
import e2.C1007d;
import java.util.ArrayList;
import java.util.List;
import u2.InterfaceC1636m;
import u2.L;

/* renamed from: f2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078j {

    /* renamed from: a, reason: collision with root package name */
    public final L f12864a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.g f12865b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f12866c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12867d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1636m f12868e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12869f;

    /* renamed from: g, reason: collision with root package name */
    public final C1081m f12870g;

    /* renamed from: h, reason: collision with root package name */
    public final C1076h[] f12871h;

    /* renamed from: i, reason: collision with root package name */
    public t2.c f12872i;
    public g2.c j;

    /* renamed from: k, reason: collision with root package name */
    public int f12873k;

    /* renamed from: l, reason: collision with root package name */
    public C0796b f12874l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12875m;

    public C1078j(L l7, g2.c cVar, k1.g gVar, int i7, int[] iArr, t2.c cVar2, int i8, InterfaceC1636m interfaceC1636m, long j, boolean z4, ArrayList arrayList, C1081m c1081m) {
        F1.k jVar;
        this.f12864a = l7;
        this.j = cVar;
        this.f12865b = gVar;
        this.f12866c = iArr;
        this.f12872i = cVar2;
        this.f12867d = i8;
        this.f12868e = interfaceC1636m;
        this.f12873k = i7;
        this.f12869f = j;
        this.f12870g = c1081m;
        long d7 = cVar.d(i7);
        ArrayList a2 = a();
        this.f12871h = new C1076h[cVar2.f16298c.length];
        int i9 = 0;
        while (i9 < this.f12871h.length) {
            g2.m mVar = (g2.m) a2.get(cVar2.f16298c[i9]);
            g2.b P7 = gVar.P(mVar.f13159b);
            C1076h[] c1076hArr = this.f12871h;
            g2.b bVar = P7 == null ? (g2.b) mVar.f13159b.get(0) : P7;
            X x4 = mVar.f13158a;
            String str = x4.f282B;
            C1007d c1007d = null;
            if (!v2.i.i(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    jVar = new L1.d(1);
                } else {
                    jVar = new N1.j(z4 ? 4 : 0, null, arrayList, c1081m);
                }
                c1007d = new C1007d(jVar, i8, x4);
            }
            int i10 = i9;
            c1076hArr[i10] = new C1076h(d7, mVar, bVar, c1007d, 0L, mVar.c());
            i9 = i10 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.f12873k).f13144c;
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.f12866c) {
            arrayList.addAll(((g2.a) list.get(i7)).f13101c);
        }
        return arrayList;
    }

    public final C1076h b(int i7) {
        C1076h[] c1076hArr = this.f12871h;
        C1076h c1076h = c1076hArr[i7];
        g2.b P7 = this.f12865b.P(c1076h.f12858b.f13159b);
        if (P7 == null || P7.equals(c1076h.f12859c)) {
            return c1076h;
        }
        C1076h c1076h2 = new C1076h(c1076h.f12861e, c1076h.f12858b, P7, c1076h.f12857a, c1076h.f12862f, c1076h.f12860d);
        c1076hArr[i7] = c1076h2;
        return c1076h2;
    }
}
