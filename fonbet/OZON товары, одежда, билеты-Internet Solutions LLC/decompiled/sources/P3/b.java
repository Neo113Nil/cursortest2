package P3;

import Bl0.D;
import N3.C3659j;
import N3.G;
import N3.H;
import N3.InterfaceC3665p;
import N3.M;
import N3.q;
import N3.r;
import com.google.common.collect.g0;
import j3.C7272n;
import j3.u;
import j3.v;
import java.io.IOException;
import java.util.ArrayList;
import k4.p;
import m3.C8050C;
import m3.s;

/* loaded from: classes.dex */
public final class b implements InterfaceC3665p {

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f21737a;

    /* renamed from: b, reason: collision with root package name */
    private final C0428b f21738b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21739c;

    /* renamed from: d, reason: collision with root package name */
    private final k4.e f21740d;

    /* renamed from: e, reason: collision with root package name */
    private int f21741e;

    /* renamed from: f, reason: collision with root package name */
    private r f21742f;

    /* renamed from: g, reason: collision with root package name */
    private c f21743g;

    /* renamed from: h, reason: collision with root package name */
    private long f21744h;

    /* renamed from: i, reason: collision with root package name */
    private e[] f21745i;

    /* renamed from: j, reason: collision with root package name */
    private long f21746j;

    /* renamed from: k, reason: collision with root package name */
    private e f21747k;

    /* renamed from: l, reason: collision with root package name */
    private int f21748l;

    /* renamed from: m, reason: collision with root package name */
    private long f21749m;

    /* renamed from: n, reason: collision with root package name */
    private long f21750n;

    /* renamed from: o, reason: collision with root package name */
    private int f21751o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21752p;

    /* loaded from: classes8.dex */
    private class a implements H {

        /* renamed from: a, reason: collision with root package name */
        private final long f21753a;

        public a(long j11) {
            this.f21753a = j11;
        }

        @Override // N3.H
        public final long getDurationUs() {
            return this.f21753a;
        }

        @Override // N3.H
        public final H.a getSeekPoints(long j11) {
            b bVar = b.this;
            H.a d11 = bVar.f21745i[0].d(j11);
            for (int i11 = 1; i11 < bVar.f21745i.length; i11++) {
                H.a d12 = bVar.f21745i[i11].d(j11);
                if (d12.f18502a.f18508b < d11.f18502a.f18508b) {
                    d11 = d12;
                }
            }
            return d11;
        }

        @Override // N3.H
        public final boolean isSeekable() {
            return true;
        }
    }

    /* renamed from: P3.b$b, reason: collision with other inner class name */
    private static class C0428b {

        /* renamed from: a, reason: collision with root package name */
        public int f21755a;

        /* renamed from: b, reason: collision with root package name */
        public int f21756b;

        /* renamed from: c, reason: collision with root package name */
        public int f21757c;
    }

    public b(int i11, k4.e eVar) {
        this.f21740d = eVar;
        this.f21739c = (i11 & 1) == 0;
        this.f21737a = new C8050C(12);
        this.f21738b = new C0428b();
        this.f21742f = new D();
        this.f21745i = new e[0];
        this.f21749m = -1L;
        this.f21750n = -1L;
        this.f21748l = -1;
        this.f21744h = -9223372036854775807L;
    }

    @Override // N3.InterfaceC3665p
    public final void a(long j11, long j12) {
        this.f21746j = -1L;
        this.f21747k = null;
        for (e eVar : this.f21745i) {
            eVar.h(j11);
        }
        if (j11 != 0) {
            this.f21741e = 6;
        } else if (this.f21745i.length == 0) {
            this.f21741e = 0;
        } else {
            this.f21741e = 3;
        }
    }

    @Override // N3.InterfaceC3665p
    public final void b(r rVar) {
        this.f21741e = 0;
        if (this.f21739c) {
            rVar = new p(rVar, this.f21740d);
        }
        this.f21742f = rVar;
        this.f21746j = -1L;
    }

    @Override // N3.InterfaceC3665p
    public final boolean d(q qVar) throws IOException {
        C8050C c8050c = this.f21737a;
        ((C3659j) qVar).d(c8050c.e(), 0, 12, false);
        c8050c.R(0);
        if (c8050c.s() == 1179011410) {
            c8050c.S(4);
            if (c8050c.s() == 541677121) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // N3.InterfaceC3665p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(q qVar, G g10) throws IOException {
        boolean z11;
        e eVar;
        e eVar2;
        if (this.f21746j != -1) {
            C3659j c3659j = (C3659j) qVar;
            long position = c3659j.getPosition();
            long j11 = this.f21746j;
            if (j11 < position || j11 > 262144 + position) {
                g10.f18501a = j11;
                z11 = true;
                this.f21746j = -1L;
                if (!z11) {
                    return 1;
                }
                int i11 = this.f21741e;
                e eVar3 = null;
                int i12 = 4;
                C0428b c0428b = this.f21738b;
                C8050C c8050c = this.f21737a;
                switch (i11) {
                    case 0:
                        if (!d(qVar)) {
                            throw v.a(null, "AVI Header List not found");
                        }
                        ((C3659j) qVar).m(12, false);
                        this.f21741e = 1;
                        return 0;
                    case 1:
                        ((C3659j) qVar).b(c8050c.e(), 0, 12, false);
                        c8050c.R(0);
                        c0428b.getClass();
                        c0428b.f21755a = c8050c.s();
                        c0428b.f21756b = c8050c.s();
                        c0428b.f21757c = 0;
                        if (c0428b.f21755a != 1414744396) {
                            throw v.a(null, "LIST expected, found: " + c0428b.f21755a);
                        }
                        int s11 = c8050c.s();
                        c0428b.f21757c = s11;
                        if (s11 == 1819436136) {
                            this.f21748l = c0428b.f21756b;
                            this.f21741e = 2;
                            return 0;
                        }
                        throw v.a(null, "hdrl expected, found: " + c0428b.f21757c);
                    case 2:
                        int i13 = this.f21748l - 4;
                        C8050C c8050c2 = new C8050C(i13);
                        ((C3659j) qVar).b(c8050c2.e(), 0, i13, false);
                        f b11 = f.b(1819436136, c8050c2);
                        if (b11.getType() != 1819436136) {
                            throw v.a(null, "Unexpected header list type " + b11.getType());
                        }
                        c cVar = (c) b11.a(c.class);
                        if (cVar == null) {
                            throw v.a(null, "AviHeader not found");
                        }
                        this.f21743g = cVar;
                        this.f21744h = cVar.f21760c * cVar.f21758a;
                        ArrayList arrayList = new ArrayList();
                        g0<P3.a> listIterator = b11.f21781a.listIterator(0);
                        int i14 = 0;
                        while (listIterator.hasNext()) {
                            P3.a next = listIterator.next();
                            if (next.getType() == 1819440243) {
                                f fVar = (f) next;
                                int i15 = i14 + 1;
                                d dVar = (d) fVar.a(d.class);
                                g gVar = (g) fVar.a(g.class);
                                if (dVar == null) {
                                    s.f("AviExtractor", "Missing Stream Header");
                                } else if (gVar == null) {
                                    s.f("AviExtractor", "Missing Stream Format");
                                } else {
                                    long a11 = dVar.a();
                                    C7272n c7272n = gVar.f21783a;
                                    C7272n.a a12 = c7272n.a();
                                    a12.i0(i14);
                                    int i16 = dVar.f21765e;
                                    if (i16 != 0) {
                                        a12.o0(i16);
                                    }
                                    h hVar = (h) fVar.a(h.class);
                                    if (hVar != null) {
                                        a12.l0(hVar.f21784a);
                                    }
                                    int h11 = u.h(c7272n.f69127o);
                                    if (h11 == 1 || h11 == 2) {
                                        M track = this.f21742f.track(i14, h11);
                                        track.a(a12.P());
                                        this.f21744h = Math.max(this.f21744h, a11);
                                        eVar = new e(i14, dVar, track);
                                        if (eVar != null) {
                                            arrayList.add(eVar);
                                        }
                                        i14 = i15;
                                    }
                                }
                                eVar = null;
                                if (eVar != null) {
                                }
                                i14 = i15;
                            }
                        }
                        this.f21745i = (e[]) arrayList.toArray(new e[0]);
                        this.f21742f.endTracks();
                        this.f21741e = 3;
                        return 0;
                    case 3:
                        if (this.f21749m != -1) {
                            long position2 = ((C3659j) qVar).getPosition();
                            long j12 = this.f21749m;
                            if (position2 != j12) {
                                this.f21746j = j12;
                                return 0;
                            }
                        }
                        ((C3659j) qVar).d(c8050c.e(), 0, 12, false);
                        C3659j c3659j2 = (C3659j) qVar;
                        c3659j2.e();
                        c8050c.R(0);
                        c0428b.getClass();
                        c0428b.f21755a = c8050c.s();
                        c0428b.f21756b = c8050c.s();
                        c0428b.f21757c = 0;
                        int s12 = c8050c.s();
                        int i17 = c0428b.f21755a;
                        if (i17 == 1179011410) {
                            c3659j2.m(12, false);
                            return 0;
                        }
                        if (i17 != 1414744396 || s12 != 1769369453) {
                            this.f21746j = c3659j2.getPosition() + c0428b.f21756b + 8;
                            return 0;
                        }
                        long position3 = c3659j2.getPosition();
                        this.f21749m = position3;
                        this.f21750n = position3 + c0428b.f21756b + 8;
                        if (!this.f21752p) {
                            c cVar2 = this.f21743g;
                            cVar2.getClass();
                            if (cVar2.a()) {
                                this.f21741e = 4;
                                this.f21746j = this.f21750n;
                                return 0;
                            }
                            this.f21742f.seekMap(new H.b(this.f21744h));
                            this.f21752p = true;
                        }
                        this.f21746j = c3659j2.getPosition() + 12;
                        this.f21741e = 6;
                        return 0;
                    case 4:
                        ((C3659j) qVar).b(c8050c.e(), 0, 8, false);
                        c8050c.R(0);
                        int s13 = c8050c.s();
                        int s14 = c8050c.s();
                        if (s13 != 829973609) {
                            this.f21746j = ((C3659j) qVar).getPosition() + s14;
                            return 0;
                        }
                        this.f21741e = 5;
                        this.f21751o = s14;
                        return 0;
                    case 5:
                        C8050C c8050c3 = new C8050C(this.f21751o);
                        ((C3659j) qVar).b(c8050c3.e(), 0, this.f21751o, false);
                        if (c8050c3.a() >= 16) {
                            int f7 = c8050c3.f();
                            c8050c3.S(8);
                            long s15 = c8050c3.s();
                            long j13 = this.f21749m;
                            r7 = s15 <= j13 ? j13 + 8 : 0L;
                            c8050c3.R(f7);
                        }
                        while (c8050c3.a() >= 16) {
                            int s16 = c8050c3.s();
                            int s17 = c8050c3.s();
                            long s18 = c8050c3.s() + r7;
                            c8050c3.S(i12);
                            e[] eVarArr = this.f21745i;
                            int length = eVarArr.length;
                            int i18 = 0;
                            while (true) {
                                if (i18 < length) {
                                    eVar2 = eVarArr[i18];
                                    if (!eVar2.e(s16)) {
                                        i18++;
                                    }
                                } else {
                                    eVar2 = null;
                                }
                            }
                            if (eVar2 != null) {
                                eVar2.a(s18, (s17 & 16) == 16);
                            }
                            i12 = 4;
                        }
                        for (e eVar4 : this.f21745i) {
                            eVar4.b();
                        }
                        this.f21752p = true;
                        if (this.f21745i.length == 0) {
                            this.f21742f.seekMap(new H.b(this.f21744h));
                        } else {
                            this.f21742f.seekMap(new a(this.f21744h));
                        }
                        this.f21741e = 6;
                        this.f21746j = this.f21749m;
                        return 0;
                    case 6:
                        C3659j c3659j3 = (C3659j) qVar;
                        if (c3659j3.getPosition() >= this.f21750n) {
                            return -1;
                        }
                        e eVar5 = this.f21747k;
                        if (eVar5 != null) {
                            if (eVar5.f(c3659j3)) {
                                this.f21747k = null;
                            }
                            return 0;
                        }
                        if ((c3659j3.getPosition() & 1) == 1) {
                            c3659j3.m(1, false);
                        }
                        c3659j3.d(c8050c.e(), 0, 12, false);
                        c8050c.R(0);
                        int s19 = c8050c.s();
                        if (s19 == 1414744396) {
                            c8050c.R(8);
                            c3659j3.m(c8050c.s() == 1769369453 ? 12 : 8, false);
                            c3659j3.e();
                            return 0;
                        }
                        int s21 = c8050c.s();
                        if (s19 == 1263424842) {
                            this.f21746j = c3659j3.getPosition() + s21 + 8;
                            return 0;
                        }
                        c3659j3.m(8, false);
                        c3659j3.e();
                        e[] eVarArr2 = this.f21745i;
                        int length2 = eVarArr2.length;
                        int i19 = 0;
                        while (true) {
                            if (i19 < length2) {
                                e eVar6 = eVarArr2[i19];
                                if (eVar6.e(s19)) {
                                    eVar3 = eVar6;
                                } else {
                                    i19++;
                                }
                            }
                        }
                        if (eVar3 == null) {
                            this.f21746j = c3659j3.getPosition() + s21;
                            return 0;
                        }
                        eVar3.g(s21);
                        this.f21747k = eVar3;
                        return 0;
                    default:
                        throw new AssertionError();
                }
            }
            c3659j.m((int) (j11 - position), false);
        }
        z11 = false;
        this.f21746j = -1L;
        if (!z11) {
        }
    }

    @Override // N3.InterfaceC3665p
    public final void release() {
    }
}
