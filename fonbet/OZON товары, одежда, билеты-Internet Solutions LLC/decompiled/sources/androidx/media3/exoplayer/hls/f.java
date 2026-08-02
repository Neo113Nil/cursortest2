package androidx.media3.exoplayer.hls;

import F3.C2997b;
import I3.AbstractC3228c;
import I3.y;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.M;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.B;
import j3.C7253I;
import j3.C7272n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import m3.C8057J;
import m3.N;
import p3.InterfaceC8846f;
import p3.i;
import p3.z;
import t3.I;
import u3.P;
import x3.C10652a;
import z3.C10978b;
import z3.e;

/* loaded from: classes8.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.media3.exoplayer.hls.c f43909a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8846f f43910b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8846f f43911c;

    /* renamed from: d, reason: collision with root package name */
    private final x3.f f43912d;

    /* renamed from: e, reason: collision with root package name */
    private final Uri[] f43913e;

    /* renamed from: f, reason: collision with root package name */
    private final C7272n[] f43914f;

    /* renamed from: g, reason: collision with root package name */
    private final C10978b f43915g;

    /* renamed from: h, reason: collision with root package name */
    private final C7253I f43916h;

    /* renamed from: i, reason: collision with root package name */
    private final List<C7272n> f43917i;

    /* renamed from: k, reason: collision with root package name */
    private final P f43919k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f43920l;

    /* renamed from: n, reason: collision with root package name */
    private C2997b f43922n;

    /* renamed from: o, reason: collision with root package name */
    private Uri f43923o;

    /* renamed from: p, reason: collision with root package name */
    private Uri f43924p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f43925q;

    /* renamed from: r, reason: collision with root package name */
    private y f43926r;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.hls.e f43918j = new androidx.media3.exoplayer.hls.e();

    /* renamed from: m, reason: collision with root package name */
    private byte[] f43921m = N.f74291c;

    /* renamed from: s, reason: collision with root package name */
    private long f43927s = -9223372036854775807L;

    private static final class a extends G3.c {

        /* renamed from: l, reason: collision with root package name */
        private byte[] f43928l;

        @Override // G3.c
        protected final void d(int i11, byte[] bArr) {
            this.f43928l = Arrays.copyOf(bArr, i11);
        }

        public final byte[] f() {
            return this.f43928l;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public G3.b f43929a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f43930b;

        /* renamed from: c, reason: collision with root package name */
        public Uri f43931c;
    }

    static final class c extends G3.a {

        /* renamed from: d, reason: collision with root package name */
        private final List<e.f> f43932d;

        /* renamed from: e, reason: collision with root package name */
        private final long f43933e;

        public c(long j11, List list) {
            super(list.size() - 1);
            this.f43933e = j11;
            this.f43932d = list;
        }

        @Override // G3.e
        public final long a() {
            c();
            e.f fVar = this.f43932d.get((int) d());
            return this.f43933e + fVar.f107091e + fVar.f107089c;
        }

        @Override // G3.e
        public final long b() {
            c();
            return this.f43933e + this.f43932d.get((int) d()).f107091e;
        }
    }

    private static final class d extends AbstractC3228c {

        /* renamed from: g, reason: collision with root package name */
        private int f43934g;

        public d(C7253I c7253i, int[] iArr) {
            super(c7253i, iArr);
            this.f43934g = s(c7253i.a(iArr[0]));
        }

        @Override // I3.y
        public final int getSelectedIndex() {
            return this.f43934g;
        }

        @Override // I3.y
        public final void n(long j11, long j12, long j13, List<? extends G3.d> list, G3.e[] eVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (b(this.f43934g, elapsedRealtime)) {
                for (int i11 = this.f11846b - 1; i11 >= 0; i11--) {
                    if (!b(i11, elapsedRealtime)) {
                        this.f43934g = i11;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // I3.y
        public final Object p() {
            return null;
        }

        @Override // I3.y
        public final int r() {
            return 0;
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final e.f f43935a;

        /* renamed from: b, reason: collision with root package name */
        public final long f43936b;

        /* renamed from: c, reason: collision with root package name */
        public final int f43937c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f43938d;

        public e(e.f fVar, long j11, int i11) {
            this.f43935a = fVar;
            this.f43936b = j11;
            this.f43937c = i11;
            this.f43938d = (fVar instanceof e.c) && ((e.c) fVar).f107081m;
        }
    }

    public f(androidx.media3.exoplayer.hls.c cVar, C10978b c10978b, Uri[] uriArr, C7272n[] c7272nArr, C10652a c10652a, z zVar, x3.f fVar, List list, P p11) {
        this.f43909a = cVar;
        this.f43915g = c10978b;
        this.f43913e = uriArr;
        this.f43914f = c7272nArr;
        this.f43912d = fVar;
        this.f43917i = list;
        this.f43919k = p11;
        InterfaceC8846f a11 = c10652a.a();
        this.f43910b = a11;
        if (zVar != null) {
            a11.addTransferListener(zVar);
        }
        this.f43911c = c10652a.a();
        this.f43916h = new C7253I("", c7272nArr);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < uriArr.length; i11++) {
            if ((c7272nArr[i11].f69118f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        this.f43926r = new d(this.f43916h, com.google.common.primitives.b.f(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Pair<Long, Integer> e(g gVar, boolean z11, z3.e eVar, long j11, long j12) {
        boolean z12 = true;
        if (gVar != null && !z11) {
            boolean l11 = gVar.l();
            long j13 = gVar.f9681j;
            int i11 = gVar.f43956o;
            if (!l11) {
                return new Pair<>(Long.valueOf(j13), Integer.valueOf(i11));
            }
            if (i11 == -1) {
                j13 = j13 != -1 ? j13 + 1 : -1L;
            }
            return new Pair<>(Long.valueOf(j13), Integer.valueOf(i11 != -1 ? i11 + 1 : -1));
        }
        long j14 = j11 + eVar.f107039u;
        long j15 = (gVar == null || this.f43925q) ? j12 : gVar.f9676g;
        boolean z13 = eVar.f107033o;
        long j16 = eVar.f107029k;
        AbstractC5880y abstractC5880y = eVar.f107036r;
        if (!z13 && j15 >= j14) {
            return new Pair<>(Long.valueOf(j16 + abstractC5880y.size()), -1);
        }
        long j17 = j15 - j11;
        Long valueOf = Long.valueOf(j17);
        int i12 = 0;
        if (this.f43915g.v() && gVar != null) {
            z12 = false;
        }
        int b11 = N.b(abstractC5880y, valueOf, z12);
        long j18 = b11 + j16;
        if (b11 >= 0) {
            e.C2323e c2323e = (e.C2323e) abstractC5880y.get(b11);
            long j19 = c2323e.f107091e + c2323e.f107089c;
            AbstractC5880y abstractC5880y2 = eVar.f107037s;
            AbstractC5880y abstractC5880y3 = j17 < j19 ? c2323e.f107086m : abstractC5880y2;
            while (true) {
                if (i12 >= abstractC5880y3.size()) {
                    break;
                }
                e.c cVar = (e.c) abstractC5880y3.get(i12);
                if (j17 >= cVar.f107091e + cVar.f107089c) {
                    i12++;
                } else if (cVar.f107080l) {
                    j18 += abstractC5880y3 != abstractC5880y2 ? 0L : 1L;
                    r6 = i12;
                }
            }
        }
        return new Pair<>(Long.valueOf(j18), Integer.valueOf(r6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static e f(z3.e eVar, long j11, int i11) {
        int i12 = (int) (j11 - eVar.f107029k);
        AbstractC5880y abstractC5880y = eVar.f107036r;
        int size = abstractC5880y.size();
        AbstractC5880y abstractC5880y2 = eVar.f107037s;
        if (i12 == size) {
            if (i11 == -1) {
                i11 = 0;
            }
            if (i11 < abstractC5880y2.size()) {
                return new e((e.f) abstractC5880y2.get(i11), j11, i11);
            }
            return null;
        }
        e.C2323e c2323e = (e.C2323e) abstractC5880y.get(i12);
        if (i11 == -1) {
            return new e(c2323e, j11, -1);
        }
        if (i11 < c2323e.f107086m.size()) {
            return new e((e.f) c2323e.f107086m.get(i11), j11, i11);
        }
        int i13 = i12 + 1;
        if (i13 < abstractC5880y.size()) {
            return new e((e.f) abstractC5880y.get(i13), j11 + 1, -1);
        }
        if (abstractC5880y2.isEmpty()) {
            return null;
        }
        return new e((e.f) abstractC5880y2.get(0), j11 + 1, 0);
    }

    private G3.b l(Uri uri, int i11, boolean z11) {
        if (uri == null) {
            return null;
        }
        androidx.media3.exoplayer.hls.e eVar = this.f43918j;
        byte[] c11 = eVar.c(uri);
        if (c11 != null) {
            eVar.b(uri, c11);
            return null;
        }
        i.a aVar = new i.a();
        aVar.i(uri);
        aVar.b(1);
        return new a(this.f43911c, aVar.a(), this.f43914f[i11], this.f43926r.r(), this.f43926r.p(), this.f43921m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final G3.e[] a(g gVar, long j11) {
        List v11;
        f fVar = this;
        g gVar2 = gVar;
        int b11 = gVar2 == null ? -1 : fVar.f43916h.b(gVar2.f9673d);
        int length = fVar.f43926r.length();
        G3.e[] eVarArr = new G3.e[length];
        int i11 = 0;
        while (i11 < length) {
            int c11 = fVar.f43926r.c(i11);
            Uri uri = fVar.f43913e[c11];
            C10978b c10978b = fVar.f43915g;
            if (c10978b.w(uri)) {
                z3.e t2 = c10978b.t(uri, false);
                t2.getClass();
                long r11 = t2.f107026h - c10978b.r();
                Pair<Long, Integer> e11 = fVar.e(gVar2, c11 != b11, t2, r11, j11);
                long longValue = ((Long) e11.first).longValue();
                int intValue = ((Integer) e11.second).intValue();
                int i12 = (int) (longValue - t2.f107029k);
                if (i12 >= 0) {
                    AbstractC5880y abstractC5880y = t2.f107036r;
                    if (abstractC5880y.size() >= i12) {
                        ArrayList arrayList = new ArrayList();
                        if (i12 < abstractC5880y.size()) {
                            if (intValue != -1) {
                                e.C2323e c2323e = (e.C2323e) abstractC5880y.get(i12);
                                if (intValue == 0) {
                                    arrayList.add(c2323e);
                                } else if (intValue < c2323e.f107086m.size()) {
                                    AbstractC5880y abstractC5880y2 = c2323e.f107086m;
                                    arrayList.addAll(abstractC5880y2.subList(intValue, abstractC5880y2.size()));
                                }
                                i12++;
                            }
                            arrayList.addAll(abstractC5880y.subList(i12, abstractC5880y.size()));
                            intValue = 0;
                        }
                        if (t2.f107032n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            AbstractC5880y abstractC5880y3 = t2.f107037s;
                            if (intValue < abstractC5880y3.size()) {
                                arrayList.addAll(abstractC5880y3.subList(intValue, abstractC5880y3.size()));
                            }
                        }
                        v11 = Collections.unmodifiableList(arrayList);
                        eVarArr[i11] = new c(r11, v11);
                    }
                }
                v11 = AbstractC5880y.v();
                eVarArr[i11] = new c(r11, v11);
            } else {
                eVarArr[i11] = G3.e.f9682a;
            }
            i11++;
            fVar = this;
            gVar2 = gVar;
        }
        return eVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b(long j11, I i11) {
        int selectedIndex = this.f43926r.getSelectedIndex();
        Uri[] uriArr = this.f43913e;
        int length = uriArr.length;
        C10978b c10978b = this.f43915g;
        z3.e t2 = (selectedIndex >= length || selectedIndex == -1) ? null : c10978b.t(uriArr[this.f43926r.i()], true);
        if (t2 != null) {
            AbstractC5880y abstractC5880y = t2.f107036r;
            if (!abstractC5880y.isEmpty()) {
                long r11 = t2.f107026h - c10978b.r();
                long j12 = j11 - r11;
                int b11 = N.b(abstractC5880y, Long.valueOf(j12), true);
                long j13 = ((e.C2323e) abstractC5880y.get(b11)).f107091e;
                return i11.a(j12, j13, (!t2.f107125c || b11 == abstractC5880y.size() - 1) ? j13 : ((e.C2323e) abstractC5880y.get(b11 + 1)).f107091e) + r11;
            }
        }
        return j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int c(g gVar) {
        if (gVar.f43956o == -1) {
            return 1;
        }
        z3.e t2 = this.f43915g.t(this.f43913e[this.f43916h.b(gVar.f9673d)], false);
        t2.getClass();
        int i11 = (int) (gVar.f9681j - t2.f107029k);
        if (i11 < 0) {
            return 1;
        }
        AbstractC5880y abstractC5880y = t2.f107036r;
        AbstractC5880y abstractC5880y2 = i11 < abstractC5880y.size() ? ((e.C2323e) abstractC5880y.get(i11)).f107086m : t2.f107037s;
        int size = abstractC5880y2.size();
        int i12 = gVar.f43956o;
        if (i12 >= size) {
            return 2;
        }
        e.c cVar = (e.c) abstractC5880y2.get(i12);
        if (cVar.f107081m) {
            return 0;
        }
        return Objects.equals(Uri.parse(C8057J.c(t2.f107123a, cVar.f107087a)), gVar.f9671b.f80066a) ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(M m11, long j11, long j12, List<g> list, boolean z11, b bVar) {
        long j13;
        long j14;
        Uri uri;
        C10978b c10978b;
        f fVar;
        z3.e eVar;
        long j15;
        int i11;
        long j16;
        int i12;
        e f7;
        e eVar2;
        g gVar;
        Uri uri2;
        boolean z12;
        String str;
        g gVar2 = list.isEmpty() ? null : (g) B.b(list);
        int b11 = gVar2 == null ? -1 : this.f43916h.b(gVar2.f9673d);
        long j17 = m11.f43657a;
        long j18 = j11 - j17;
        long j19 = this.f43927s;
        long j21 = j19 != -9223372036854775807L ? j19 - j17 : -9223372036854775807L;
        if (gVar2 != null && !this.f43925q) {
            long j22 = gVar2.f9677h - gVar2.f9676g;
            j14 = j21;
            j18 = Math.max(0L, j18 - j22);
            if (j14 == -9223372036854775807L) {
                j13 = j18;
                this.f43926r.n(j17, j13, j14, list, a(gVar2, j11));
                int i13 = this.f43926r.i();
                boolean z13 = b11 == i13;
                Uri[] uriArr = this.f43913e;
                uri = uriArr[i13];
                c10978b = this.f43915g;
                if (c10978b.w(uri)) {
                    bVar.f43931c = uri;
                    this.f43924p = uri;
                    return;
                }
                z3.e t2 = c10978b.t(uri, true);
                t2.getClass();
                this.f43925q = t2.f107125c;
                boolean z14 = t2.f107033o;
                int i14 = b11;
                long j23 = t2.f107026h;
                this.f43927s = z14 ? -9223372036854775807L : (t2.f107039u + j23) - c10978b.r();
                long r11 = j23 - c10978b.r();
                Pair<Long, Integer> e11 = e(gVar2, z13, t2, r11, j11);
                long longValue = ((Long) e11.first).longValue();
                int intValue = ((Integer) e11.second).intValue();
                if (z13 && gVar2 != null && (longValue < t2.f107029k || ((f7 = f(t2, longValue, intValue)) != null && f7.f43935a.f107091e + r11 < j12))) {
                    uri = uriArr[i14];
                    z3.e t11 = c10978b.t(uri, true);
                    t11.getClass();
                    long r12 = t11.f107026h - c10978b.r();
                    Pair<Long, Integer> e12 = e(gVar2, false, t11, r12, j11);
                    fVar = this;
                    long longValue2 = ((Long) e12.first).longValue();
                    intValue = ((Integer) e12.second).intValue();
                    eVar = t11;
                    j15 = longValue2;
                    i11 = i14;
                    j16 = r12;
                    i12 = i11;
                } else {
                    fVar = this;
                    i11 = i13;
                    eVar = t2;
                    j15 = longValue;
                    j16 = r11;
                    i12 = i14;
                }
                if (i11 != i12 && i12 != -1) {
                    c10978b.p(uriArr[i12]);
                }
                long j24 = eVar.f107029k;
                if (j15 < j24) {
                    fVar.f43922n = new C2997b();
                    return;
                }
                e f11 = f(eVar, j15, intValue);
                if (f11 == null) {
                    if (!eVar.f107033o) {
                        bVar.f43931c = uri;
                        fVar.f43924p = uri;
                        return;
                    }
                    if (!z11) {
                        AbstractC5880y abstractC5880y = eVar.f107036r;
                        if (!abstractC5880y.isEmpty()) {
                            eVar2 = new e((e.f) B.b(abstractC5880y), (j24 + abstractC5880y.size()) - 1, -1);
                        }
                    }
                    bVar.f43930b = true;
                    return;
                }
                eVar2 = f11;
                fVar.f43924p = null;
                SystemClock.elapsedRealtime();
                e.f fVar2 = eVar2.f43935a;
                e.C2323e c2323e = fVar2.f107088b;
                String str2 = eVar.f107123a;
                Uri d11 = (c2323e == null || (str = c2323e.f107093g) == null) ? null : C8057J.d(str2, str);
                G3.b l11 = fVar.l(d11, i11, true);
                bVar.f43929a = l11;
                if (l11 != null) {
                    return;
                }
                String str3 = fVar2.f107093g;
                Uri d12 = str3 != null ? C8057J.d(str2, str3) : null;
                G3.b l12 = fVar.l(d12, i11, false);
                bVar.f43929a = l12;
                if (l12 != null) {
                    return;
                }
                boolean z15 = fVar2 instanceof e.c;
                boolean z16 = eVar.f107125c;
                if (z15) {
                    if (((e.c) fVar2).f107080l || (eVar2.f43937c == 0 && z16)) {
                        gVar = gVar2;
                        z12 = true;
                    } else {
                        z12 = false;
                        gVar = gVar2;
                    }
                    uri2 = uri;
                } else {
                    gVar = gVar2;
                    uri2 = uri;
                    z12 = z16;
                }
                boolean q11 = g.q(gVar, j11, uri2, z12, eVar2, j16);
                g gVar3 = gVar;
                Uri uri3 = uri2;
                boolean z17 = z12;
                if (q11 && eVar2.f43938d) {
                    return;
                }
                C7272n c7272n = fVar.f43914f[i11];
                int r13 = fVar.f43926r.r();
                Object p11 = fVar.f43926r.p();
                boolean z18 = fVar.f43920l;
                androidx.media3.exoplayer.hls.e eVar3 = fVar.f43918j;
                bVar.f43929a = g.e(fVar.f43909a, fVar.f43910b, c7272n, j16, eVar, eVar2, uri3, fVar.f43917i, r13, p11, z18, fVar.f43912d, gVar3, eVar3.a(d12), eVar3.a(d11), q11, z17, fVar.f43919k);
                return;
            }
            j21 = Math.max(0L, j14 - j22);
        }
        j13 = j18;
        j14 = j21;
        this.f43926r.n(j17, j13, j14, list, a(gVar2, j11));
        int i132 = this.f43926r.i();
        if (b11 == i132) {
        }
        Uri[] uriArr2 = this.f43913e;
        uri = uriArr2[i132];
        c10978b = this.f43915g;
        if (c10978b.w(uri)) {
        }
    }

    public final int g(long j11, List<? extends G3.d> list) {
        return (this.f43922n != null || this.f43926r.length() < 2) ? list.size() : this.f43926r.h(j11, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long h(g gVar) {
        int i11 = gVar.f43956o;
        G10.a.h(i11 != -1);
        z3.e t2 = this.f43915g.t(this.f43913e[this.f43916h.b(gVar.f9673d)], false);
        t2.getClass();
        int i12 = (int) (gVar.f9681j - t2.f107029k);
        if (i12 < 0) {
            return 0L;
        }
        AbstractC5880y abstractC5880y = t2.f107036r;
        return ((e.c) (i12 < abstractC5880y.size() ? ((e.C2323e) abstractC5880y.get(i12)).f107086m : t2.f107037s).get(i11)).f107089c;
    }

    public final C7253I i() {
        return this.f43916h;
    }

    public final y j() {
        return this.f43926r;
    }

    public final boolean k() {
        return this.f43925q;
    }

    public final boolean m(G3.b bVar, long j11) {
        y yVar = this.f43926r;
        return yVar.d(yVar.f(this.f43916h.b(bVar.f9673d)), j11);
    }

    public final void n() throws IOException {
        C2997b c2997b = this.f43922n;
        if (c2997b != null) {
            throw c2997b;
        }
        Uri uri = this.f43923o;
        if (uri == null || !uri.equals(this.f43924p)) {
            return;
        }
        this.f43915g.x(this.f43923o);
    }

    public final boolean o(Uri uri) {
        return N.l(this.f43913e, uri);
    }

    public final void p(G3.b bVar) {
        if (bVar instanceof a) {
            a aVar = (a) bVar;
            this.f43921m = aVar.e();
            Uri uri = aVar.f9671b.f80066a;
            byte[] f7 = aVar.f();
            f7.getClass();
            this.f43918j.b(uri, f7);
        }
    }

    public final boolean q(Uri uri, long j11) {
        int f7;
        int i11 = 0;
        while (true) {
            Uri[] uriArr = this.f43913e;
            if (i11 >= uriArr.length) {
                i11 = -1;
                break;
            }
            if (uriArr[i11].equals(uri)) {
                break;
            }
            i11++;
        }
        if (i11 == -1 || (f7 = this.f43926r.f(i11)) == -1) {
            return true;
        }
        this.f43923o = uri;
        return j11 != -9223372036854775807L && this.f43926r.d(f7, j11) && this.f43915g.q(uri, j11);
    }

    public final void r() {
        this.f43915g.p(this.f43913e[this.f43926r.i()]);
        this.f43922n = null;
    }

    public final void s(boolean z11) {
        this.f43920l = z11;
    }

    public final void t(y yVar) {
        this.f43915g.p(this.f43913e[this.f43926r.i()]);
        this.f43926r = yVar;
    }

    public final boolean u(long j11, G3.b bVar, List<? extends G3.d> list) {
        if (this.f43922n != null) {
            return false;
        }
        return this.f43926r.l(j11, bVar, list);
    }
}
