package p054h2;

import A1.X;
import A1.x0;
import B1.p;
import E3.AbstractC0167z;
import E3.C0165x;
import E3.L;
import Q0.a;
import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p018c2.C0756b;
import p018c2.e0;
import p032e2.k;
import p033e3.h;
import p061i2.e;
import p061i2.g;
import p061i2.j;
import p145u1.c;
import p146u2.C0958q;
import p146u2.InterfaceC0953l;
import p146u2.InterfaceC0954m;
import p146u2.U;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f13380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0954m f13381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0954m f13382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f13383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f13384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X[] f13385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p061i2.c f13386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f13387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f13388i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f13389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13390l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0756b f13392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Uri f13393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p139t2.c f13395q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13397s;
    public final h j = new h(16);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f13391m = t.f17164f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f13396r = -9223372036854775807L;

    public i(c cVar, p061i2.c cVar2, Uri[] uriArr, X[] xArr, x0 x0Var, U u4, c cVar3, List list, p pVar) {
        this.f13380a = cVar;
        this.f13386g = cVar2;
        this.f13384e = uriArr;
        this.f13385f = xArr;
        this.f13383d = cVar3;
        this.f13388i = list;
        this.f13389k = pVar;
        InterfaceC0954m interfaceC0954mA = ((InterfaceC0953l) x0Var.f613b).a();
        this.f13381b = interfaceC0954mA;
        if (u4 != null) {
            interfaceC0954mA.x(u4);
        }
        this.f13382c = ((InterfaceC0953l) x0Var.f613b).a();
        this.f13387h = new e0("", xArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < uriArr.length; i7++) {
            if ((xArr[i7].f308e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        e0 e0Var = this.f13387h;
        int[] iArrZ = a.Z(arrayList);
        g gVar = new g(e0Var, iArrZ);
        gVar.f13375g = gVar.i(e0Var.f10344d[iArrZ[0]]);
        this.f13395q = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    public final k[] a(k kVar, long j) {
        int i7;
        List listUnmodifiableList;
        int iA = kVar == null ? -1 : this.f13387h.a(kVar.f12602d);
        int length = this.f13395q.f16304c.length;
        k[] kVarArr = new k[length];
        boolean z4 = false;
        int i8 = 0;
        while (i8 < length) {
            int i9 = this.f13395q.f16304c[i8];
            Uri uri = this.f13384e[i9];
            p061i2.c cVar = this.f13386g;
            if (cVar.c(uri)) {
                j jVarA = cVar.a(z4, uri);
                jVarA.getClass();
                long j3 = jVarA.f13897h - cVar.f13860E;
                i7 = i8;
                Pair pairC = c(kVar, i9 != iA ? true : z4, jVarA, j3, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                int i10 = (int) (jLongValue - jVarA.f13899k);
                if (i10 >= 0) {
                    AbstractC0167z abstractC0167z = jVarA.f13906r;
                    if (abstractC0167z.size() < i10) {
                        C0165x c0165x = AbstractC0167z.f2083b;
                        listUnmodifiableList = L.f2000e;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        if (i10 < abstractC0167z.size()) {
                            if (iIntValue != -1) {
                                g gVar = (g) abstractC0167z.get(i10);
                                if (iIntValue == 0) {
                                    arrayList.add(gVar);
                                } else if (iIntValue < gVar.f13876D.size()) {
                                    AbstractC0167z abstractC0167z2 = gVar.f13876D;
                                    arrayList.addAll(abstractC0167z2.subList(iIntValue, abstractC0167z2.size()));
                                }
                                i10++;
                            }
                            arrayList.addAll(abstractC0167z.subList(i10, abstractC0167z.size()));
                            iIntValue = 0;
                        }
                        if (jVarA.f13902n != -9223372036854775807L) {
                            if (iIntValue == -1) {
                                iIntValue = 0;
                            }
                            AbstractC0167z abstractC0167z3 = jVarA.f13907s;
                            if (iIntValue < abstractC0167z3.size()) {
                                arrayList.addAll(abstractC0167z3.subList(iIntValue, abstractC0167z3.size()));
                            }
                        }
                        listUnmodifiableList = Collections.unmodifiableList(arrayList);
                    }
                } else {
                    C0165x c0165x2 = AbstractC0167z.f2083b;
                    listUnmodifiableList = L.f2000e;
                }
                kVarArr[i7] = new f(j3, listUnmodifiableList);
            } else {
                kVarArr[i8] = k.f12646s;
                i7 = i8;
            }
            i8 = i7 + 1;
            z4 = false;
        }
        return kVarArr;
    }

    public final int b(k kVar) {
        if (kVar.f13403F == -1) {
            return 1;
        }
        j jVarA = this.f13386g.a(false, this.f13384e[this.f13387h.a(kVar.f12602d)]);
        jVarA.getClass();
        int i7 = (int) (kVar.f12645A - jVarA.f13899k);
        if (i7 < 0) {
            return 1;
        }
        AbstractC0167z abstractC0167z = jVarA.f13906r;
        AbstractC0167z abstractC0167z2 = i7 < abstractC0167z.size() ? ((g) abstractC0167z.get(i7)).f13876D : jVarA.f13907s;
        int size = abstractC0167z2.size();
        int i8 = kVar.f13403F;
        if (i8 >= size) {
            return 2;
        }
        e eVar = (e) abstractC0167z2.get(i8);
        if (eVar.f13871D) {
            return 0;
        }
        return t.a(Uri.parse(p151v2.a.C(jVarA.f13930a, eVar.f13879a)), kVar.f12600b.f16814a) ? 1 : 2;
    }

    public final Pair c(k kVar, boolean z4, j jVar, long j, long j3) {
        boolean z7 = true;
        int i7 = -1;
        if (kVar != null && !z4) {
            boolean z8 = kVar.f13422Y;
            long jA = kVar.f12645A;
            int i8 = kVar.f13403F;
            if (!z8) {
                return new Pair(Long.valueOf(jA), Integer.valueOf(i8));
            }
            if (i8 == -1) {
                jA = kVar.a();
            }
            return new Pair(Long.valueOf(jA), Integer.valueOf(i8 != -1 ? i8 + 1 : -1));
        }
        long j7 = jVar.f13909u + j;
        if (kVar != null && !this.f13394p) {
            j3 = kVar.f12605x;
        }
        boolean z9 = jVar.f13903o;
        long j8 = jVar.f13899k;
        AbstractC0167z abstractC0167z = jVar.f13906r;
        if (!z9 && j3 >= j7) {
            return new Pair(Long.valueOf(j8 + ((long) abstractC0167z.size())), -1);
        }
        long j9 = j3 - j;
        Long lValueOf = Long.valueOf(j9);
        if (this.f13386g.f13859D && kVar != null) {
            z7 = false;
        }
        int iD = t.d(abstractC0167z, lValueOf, z7);
        long j10 = ((long) iD) + j8;
        if (iD >= 0) {
            g gVar = (g) abstractC0167z.get(iD);
            long j11 = gVar.f13883e + gVar.f13881c;
            AbstractC0167z abstractC0167z2 = jVar.f13907s;
            AbstractC0167z abstractC0167z3 = j9 < j11 ? gVar.f13876D : abstractC0167z2;
            for (int i9 = 0; i9 < abstractC0167z3.size(); i9++) {
                e eVar = (e) abstractC0167z3.get(i9);
                if (j9 < eVar.f13883e + eVar.f13881c) {
                    if (!eVar.f13870C) {
                        break;
                    }
                    j10 += abstractC0167z3 == abstractC0167z2 ? 1L : 0L;
                    i7 = i9;
                    break;
                }
            }
        }
        return new Pair(Long.valueOf(j10), Integer.valueOf(i7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e d(Uri uri, int i7) {
        if (uri == null) {
            return null;
        }
        h hVar = this.j;
        byte[] bArr = (byte[]) ((d) hVar.f12673a).remove(uri);
        if (bArr != null) {
            return null;
        }
        C0958q c0958q = new C0958q(uri, 1, null, Collections.emptyMap(), 0L, -1L, null, 1);
        X x4 = this.f13385f[i7];
        int iG = this.f13395q.g();
        Object objF = this.f13395q.f();
        byte[] bArr2 = this.f13391m;
        e eVar = new e(this.f13382c, c0958q, 3, x4, iG, objF, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = t.f17164f;
        }
        eVar.f13370A = bArr2;
        return eVar;
    }
}
