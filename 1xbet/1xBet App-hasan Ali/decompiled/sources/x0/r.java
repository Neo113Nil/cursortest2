package x0;

import P.AbstractC0329z;
import P.C0299j0;
import P.InterfaceC0289e0;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC1674uy;
import g1.C1968b;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import n1.AbstractC2181w;
import n1.C2163d;
import n1.InterfaceC2168i;
import r.C2316B;
import r.C2321G;
import r.C2322H;
import r.C2343v;

/* loaded from: classes.dex */
public final class r extends AbstractC1674uy implements Runnable, InterfaceC2168i, View.OnAttachStateChangeListener {

    /* renamed from: m, reason: collision with root package name */
    public boolean f21047m;

    /* renamed from: n, reason: collision with root package name */
    public int f21048n;

    /* renamed from: o, reason: collision with root package name */
    public n1.k0 f21049o;

    /* renamed from: p, reason: collision with root package name */
    public final C2321G f21050p;

    /* renamed from: q, reason: collision with root package name */
    public final C0299j0 f21051q;

    /* renamed from: r, reason: collision with root package name */
    public final C2316B f21052r;

    /* renamed from: s, reason: collision with root package name */
    public final Z.p f21053s;

    public r() {
        super(1);
        C2321G c2321g = new C2321G(9);
        n0.f21025a.getClass();
        c2321g.m(m0.f21017b, new p0("caption bar"));
        c2321g.m(m0.f21018c, new p0("display cutout"));
        c2321g.m(m0.f21019d, new p0("ime"));
        c2321g.m(m0.f21020e, new p0("mandatory system gestures"));
        c2321g.m(m0.f, new p0("navigation bars"));
        c2321g.m(m0.f21021g, new p0("status bars"));
        c2321g.m(m0.f21022h, new p0("system gestures"));
        c2321g.m(m0.i, new p0("tappable element"));
        c2321g.m(m0.f21023j, new p0("waterfall"));
        this.f21050p = c2321g;
        this.f21051q = new C0299j0(0);
        this.f21052r = new C2316B(4);
        this.f21053s = new Z.p();
    }

    public final void I(n1.k0 k0Var) {
        long j5;
        char c5;
        char c6;
        char c7;
        char c8;
        boolean z3;
        boolean z5;
        boolean z6;
        long j6;
        long g5;
        boolean z7;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        int i;
        C2343v c2343v = androidx.compose.ui.layout.b.f6938a;
        int[] iArr5 = c2343v.f19012b;
        Object[] objArr = c2343v.f19013c;
        long[] jArr5 = c2343v.f19011a;
        int length = jArr5.length - 2;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            z5 = false;
            j5 = 255;
            z6 = false;
            c5 = 7;
            c6 = 16;
            while (true) {
                long j7 = jArr5[i6];
                c7 = ' ';
                c8 = '0';
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j7 & 255) < 128) {
                            int i9 = (i6 << 3) + i8;
                            int i10 = iArr5[i9];
                            i = i5;
                            n0 n0Var = (n0) objArr[i9];
                            C1968b i11 = k0Var.f18442a.i(i10);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j8 = (i11.f17074b << 32) | (i11.f17073a << 48) | (i11.f17075c << 16) | i11.f17076d;
                            Object g6 = this.f21050p.g(n0Var);
                            kotlin.jvm.internal.l.c(g6);
                            p0 p0Var = (p0) g6;
                            if (!f0.g(j8, p0Var.f21039h)) {
                                p0Var.f21039h = j8;
                                z5 = true;
                                if (!f0.g(j8, 0L)) {
                                    z6 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            i = i5;
                        }
                        j7 >>= i;
                        i8++;
                        jArr5 = jArr4;
                        i5 = i;
                        iArr5 = iArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z3 = true;
                    if (i7 != i5) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z3 = true;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                jArr5 = jArr3;
                iArr5 = iArr3;
                i5 = 8;
            }
        } else {
            j5 = 255;
            c5 = 7;
            c6 = 16;
            c7 = ' ';
            c8 = '0';
            z3 = true;
            z5 = false;
            z6 = false;
        }
        C2343v c2343v2 = androidx.compose.ui.layout.b.f6940c;
        int[] iArr6 = c2343v2.f19012b;
        Object[] objArr2 = c2343v2.f19013c;
        long[] jArr6 = c2343v2.f19011a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i12 = 0;
            while (true) {
                long j9 = jArr6[i12];
                if ((((~j9) << c5) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j9 & j5) < 128) {
                            int i15 = (i12 << 3) + i14;
                            int i16 = iArr6[i15];
                            Object g7 = this.f21050p.g((n0) objArr2[i15]);
                            kotlin.jvm.internal.l.c(g7);
                            p0 p0Var2 = (p0) g7;
                            if (i16 != 8) {
                                C1968b j10 = k0Var.f18442a.j(i16);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j11 = (j10.f17073a << c8) | (j10.f17074b << c7) | (j10.f17075c << c6) | j10.f17076d;
                                if (!f0.g(p0Var2.i, j11)) {
                                    p0Var2.i = j11;
                                    z5 = z3;
                                    if (!f0.g(j11, 0L)) {
                                        z6 = z5;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            p0Var2.f21033a.setValue(Boolean.valueOf(k0Var.f18442a.u(i16)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j9 >>= 8;
                        i14++;
                        iArr6 = iArr2;
                        jArr6 = jArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i13 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i12 == length2) {
                    break;
                }
                i12++;
                iArr6 = iArr;
                jArr6 = jArr;
            }
        }
        C2163d h3 = k0Var.f18442a.h();
        if (h3 == null) {
            j6 = 0;
        } else {
            C1968b a5 = h3.a();
            j6 = (a5.f17073a << c8) | (a5.f17074b << c7) | (a5.f17075c << c6) | a5.f17076d;
        }
        C2321G c2321g = this.f21050p;
        n0.f21025a.getClass();
        Object g8 = c2321g.g(m0.f21023j);
        kotlin.jvm.internal.l.c(g8);
        p0 p0Var3 = (p0) g8;
        if (!f0.g(p0Var3.f21039h, j6)) {
            p0Var3.f21039h = j6;
            p0Var3.i = j6;
            z5 = z3;
            if (!f0.g(j6, 0L)) {
                z6 = z5;
            }
        }
        if (h3 == null) {
            g5 = 0;
        } else {
            int i17 = Build.VERSION.SDK_INT;
            g5 = (i17 >= 28 ? d1.i.g(h3.f18426a) : 0) | ((i17 >= 28 ? d1.i.j(h3.f18426a) : 0) << c7) | ((i17 >= 28 ? d1.i.h(h3.f18426a) : 0) << c8) | ((i17 >= 28 ? d1.i.i(h3.f18426a) : 0) << c6);
        }
        Object g9 = this.f21050p.g(m0.f21018c);
        kotlin.jvm.internal.l.c(g9);
        p0 p0Var4 = (p0) g9;
        if (!f0.g(g5, p0Var4.f21039h)) {
            p0Var4.f21039h = g5;
            p0Var4.i = g5;
            z5 = z3;
            if (!f0.g(g5, 0L)) {
                z6 = z5;
            }
        }
        if (h3 == null) {
            C2316B c2316b = this.f21052r;
            if (c2316b.f18905b > 0) {
                c2316b.c();
                this.f21053s.clear();
                z5 = z3;
            }
        } else {
            List c9 = Build.VERSION.SDK_INT >= 28 ? d1.i.c(h3.f18426a) : Collections.EMPTY_LIST;
            int size = c9.size();
            C2316B c2316b2 = this.f21052r;
            if (size < c2316b2.f18905b) {
                c2316b2.k(c9.size(), this.f21052r.f18905b);
                this.f21053s.g(c9.size(), this.f21053s.size());
                z5 = z3;
            } else {
                int size2 = c9.size() - this.f21052r.f18905b;
                int i18 = 0;
                while (i18 < size2) {
                    C2316B c2316b3 = this.f21052r;
                    c2316b3.a(AbstractC0329z.t(c9.get(c2316b3.f18905b)));
                    this.f21053s.add(new C2631q("display cutout rect " + this.f21052r.f18905b));
                    i18++;
                    z5 = z3;
                }
            }
            int size3 = c9.size();
            for (int i19 = 0; i19 < size3; i19++) {
                Rect rect = (Rect) c9.get(i19);
                InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) this.f21052r.e(i19);
                if (!kotlin.jvm.internal.l.a(interfaceC0289e0.getValue(), rect)) {
                    interfaceC0289e0.setValue(rect);
                    z5 = z3;
                }
            }
            if (!c9.isEmpty()) {
                z6 = z3;
            }
        }
        if ((z6 || this.f21051q.h() != 0) && z5) {
            C0299j0 c0299j0 = this.f21051q;
            c0299j0.i(c0299j0.h() + 1);
            synchronized (Z.l.f6208c) {
                C2322H c2322h = Z.l.f6213j.f6178h;
                if (c2322h != null) {
                    boolean z8 = z3;
                    z7 = c2322h.h() == z8 ? z8 : false;
                }
            }
            if (z7) {
                Z.l.a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final void a(n1.O o5) {
        boolean z3 = false;
        this.f21047m = false;
        int d5 = o5.f18387a.d();
        this.f21048n &= ~d5;
        this.f21049o = null;
        n0 n0Var = (n0) androidx.compose.ui.layout.b.f6940c.b(d5);
        if (n0Var != null) {
            Object g5 = this.f21050p.g(n0Var);
            kotlin.jvm.internal.l.c(g5);
            p0 p0Var = (p0) g5;
            p0Var.f21035c.i(0.0f);
            p0Var.f21037e.i(1.0f);
            p0Var.f21036d.h(0L);
            p0Var.f21035c.i(0.0f);
            p0Var.f21034b.setValue(Boolean.FALSE);
            p0Var.f21040j = -1L;
            p0Var.f21041k = -1L;
            C0299j0 c0299j0 = this.f21051q;
            c0299j0.i(c0299j0.h() + 1);
            synchronized (Z.l.f6208c) {
                C2322H c2322h = Z.l.f6213j.f6178h;
                if (c2322h != null) {
                    if (c2322h.h()) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Z.l.a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final void b(n1.O o5) {
        this.f21047m = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final n1.k0 c(n1.k0 k0Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            n1.O o5 = (n1.O) list.get(i);
            n0 n0Var = (n0) androidx.compose.ui.layout.b.f6940c.b(o5.f18387a.d());
            if (n0Var != null) {
                Object g5 = this.f21050p.g(n0Var);
                kotlin.jvm.internal.l.c(g5);
                p0 p0Var = (p0) g5;
                if (((Boolean) p0Var.f21034b.getValue()).booleanValue()) {
                    p0Var.f21035c.i(o5.f18387a.c());
                    n1.N n5 = o5.f18387a;
                    p0Var.f21037e.i(n5.a());
                    p0Var.f21036d.h(n5.b());
                }
            }
        }
        I(k0Var);
        return k0Var;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1674uy
    public final G.v d(n1.O o5, G.v vVar) {
        n1.k0 k0Var = this.f21049o;
        boolean z3 = false;
        this.f21047m = false;
        this.f21049o = null;
        if (o5.f18387a.b() > 0 && k0Var != null) {
            int d5 = o5.f18387a.d();
            this.f21048n |= d5;
            n0 n0Var = (n0) androidx.compose.ui.layout.b.f6940c.b(d5);
            if (n0Var != null) {
                Object g5 = this.f21050p.g(n0Var);
                kotlin.jvm.internal.l.c(g5);
                p0 p0Var = (p0) g5;
                C1968b i = k0Var.f18442a.i(d5);
                long j5 = (i.f17073a << 48) | (i.f17074b << 32) | (i.f17075c << 16) | i.f17076d;
                long j6 = p0Var.f21039h;
                if (!f0.g(j5, j6)) {
                    p0Var.f21040j = j6;
                    p0Var.f21041k = j5;
                    p0Var.f21034b.setValue(Boolean.TRUE);
                    p0Var.f21035c.i(o5.f18387a.c());
                    n1.N n5 = o5.f18387a;
                    p0Var.f21037e.i(n5.a());
                    p0Var.f21036d.h(n5.b());
                    C0299j0 c0299j0 = this.f21051q;
                    c0299j0.i(c0299j0.h() + 1);
                    synchronized (Z.l.f6208c) {
                        C2322H c2322h = Z.l.f6213j.f6178h;
                        if (c2322h != null) {
                            if (c2322h.h()) {
                                z3 = true;
                            }
                        }
                    }
                    if (z3) {
                        Z.l.a();
                        return vVar;
                    }
                }
            }
        }
        return vVar;
    }

    @Override // n1.InterfaceC2168i
    public final n1.k0 e(View view, n1.k0 k0Var) {
        if (this.f21047m) {
            this.f21049o = k0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return k0Var;
            }
        } else if (this.f21048n == 0) {
            I(k0Var);
        }
        return k0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = n1.C.f18360a;
        AbstractC2181w.c(view, this);
        n1.C.f(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = n1.C.f18360a;
        AbstractC2181w.c(view, null);
        n1.C.f(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21047m) {
            this.f21048n = 0;
            this.f21047m = false;
            n1.k0 k0Var = this.f21049o;
            if (k0Var != null) {
                I(k0Var);
                this.f21049o = null;
            }
        }
    }
}
