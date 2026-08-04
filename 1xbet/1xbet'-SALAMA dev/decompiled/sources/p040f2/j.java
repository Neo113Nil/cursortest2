package p040f2;

import A1.X;
import F1.k;
import g2.a;
import g2.b;
import g2.m;
import java.util.ArrayList;
import java.util.List;
import p018c2.C0756b;
import p032e2.d;
import p072k1.g;
import p139t2.c;
import p146u2.InterfaceC0954m;
import p146u2.L;
import p151v2.i;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f12870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f12871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f12872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0954m f12874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f12876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h[] f12877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f12878i;
    public g2.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0756b f12880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12881m;

    public j(L l7, g2.c cVar, g gVar, int i7, int[] iArr, c cVar2, int i8, InterfaceC0954m interfaceC0954m, long j, boolean z4, ArrayList arrayList, m mVar) {
        k jVar;
        this.f12870a = l7;
        this.j = cVar;
        this.f12871b = gVar;
        this.f12872c = iArr;
        this.f12878i = cVar2;
        this.f12873d = i8;
        this.f12874e = interfaceC0954m;
        this.f12879k = i7;
        this.f12875f = j;
        this.f12876g = mVar;
        long jD = cVar.d(i7);
        ArrayList arrayListA = a();
        this.f12877h = new h[cVar2.f16304c.length];
        int i9 = 0;
        while (i9 < this.f12877h.length) {
            m mVar2 = (m) arrayListA.get(cVar2.f16304c[i9]);
            b bVarP = gVar.P(mVar2.f13165b);
            h[] hVarArr = this.f12877h;
            b bVar = bVarP == null ? (b) mVar2.f13165b.get(0) : bVarP;
            X x4 = mVar2.f13164a;
            String str = x4.f282B;
            d dVar = null;
            if (!i.i(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    jVar = new L1.d(1);
                } else {
                    jVar = new N1.j(z4 ? 4 : 0, null, arrayList, mVar);
                }
                dVar = new d(jVar, i8, x4);
            }
            int i10 = i9;
            hVarArr[i10] = new h(jD, mVar2, bVar, dVar, 0L, mVar2.c());
            i9 = i10 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.f12879k).f13150c;
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.f12872c) {
            arrayList.addAll(((a) list.get(i7)).f13107c);
        }
        return arrayList;
    }

    public final h b(int i7) {
        h[] hVarArr = this.f12877h;
        h hVar = hVarArr[i7];
        b bVarP = this.f12871b.P(hVar.f12864b.f13165b);
        if (bVarP == null || bVarP.equals(hVar.f12865c)) {
            return hVar;
        }
        h hVar2 = new h(hVar.f12867e, hVar.f12864b, bVarP, hVar.f12863a, hVar.f12868f, hVar.f12866d);
        hVarArr[i7] = hVar2;
        return hVar2;
    }
}
