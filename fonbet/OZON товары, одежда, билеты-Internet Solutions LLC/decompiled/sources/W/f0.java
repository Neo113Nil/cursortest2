package W;

import C.s0;
import N.F;
import N.l;
import W.Y;
import W.s0;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.InterfaceC5086c0;
import androidx.camera.core.impl.InterfaceC5100j0;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.InterfaceC5121u0;
import androidx.camera.core.impl.InterfaceC5129y0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.Y0;
import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.c1;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.concurrent.futures.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import e0.C6245b;
import f0.C6393d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p.InterfaceC8822a;

/* loaded from: classes8.dex */
public final class f0<T extends s0> extends androidx.camera.core.w {

    /* renamed from: D, reason: collision with root package name */
    private static final c f33035D = new c();

    /* renamed from: A, reason: collision with root package name */
    private d f33036A;

    /* renamed from: B, reason: collision with root package name */
    private O0.c f33037B;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC5129y0.a<Y> f33038C;

    /* renamed from: p, reason: collision with root package name */
    androidx.camera.core.impl.W f33039p;

    /* renamed from: q, reason: collision with root package name */
    private N.y f33040q;

    /* renamed from: r, reason: collision with root package name */
    Y f33041r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    O0.b f33042s;

    /* renamed from: t, reason: collision with root package name */
    com.google.common.util.concurrent.m<Void> f33043t;

    /* renamed from: u, reason: collision with root package name */
    private C.s0 f33044u;

    /* renamed from: v, reason: collision with root package name */
    s0.a f33045v;

    /* renamed from: w, reason: collision with root package name */
    private N.F f33046w;

    /* renamed from: x, reason: collision with root package name */
    private Rect f33047x;

    /* renamed from: y, reason: collision with root package name */
    private int f33048y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f33049z;

    final class a implements InterfaceC5129y0.a<Y> {
        a() {
        }

        @Override // androidx.camera.core.impl.InterfaceC5129y0.a
        public final void a(Y y11) {
            Y y12 = y11;
            if (y12 == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            }
            f0 f0Var = f0.this;
            if (f0Var.f33045v == s0.a.INACTIVE) {
                return;
            }
            C.S.a("VideoCapture", "Stream info update: old: " + f0Var.f33041r + " new: " + y12);
            Y y13 = f0Var.f33041r;
            f0Var.f33041r = y12;
            T0 d11 = f0Var.d();
            d11.getClass();
            int a11 = y13.a();
            int a12 = y12.a();
            Set<Integer> set = Y.f32994b;
            if ((!set.contains(Integer.valueOf(a11)) && !set.contains(Integer.valueOf(a12)) && a11 != a12) || f0Var.n0(y13, y12)) {
                f0Var.k0();
                return;
            }
            if ((y13.a() != -1 && y12.a() == -1) || (y13.a() == -1 && y12.a() != -1)) {
                f0Var.e0(f0Var.f33042s, y12, d11);
                Object[] objArr = {f0Var.f33042s.k()};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                f0Var.S(Collections.unmodifiableList(arrayList));
                f0Var.D();
                return;
            }
            if (y13.c() != y12.c()) {
                f0Var.e0(f0Var.f33042s, y12, d11);
                Object[] objArr2 = {f0Var.f33042s.k()};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                f0Var.S(Collections.unmodifiableList(arrayList2));
                f0Var.F();
            }
        }

        @Override // androidx.camera.core.impl.InterfaceC5129y0.a
        public final void onError(@NonNull Throwable th2) {
            C.S.l("VideoCapture", "Receive onError from StreamState observer", th2);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private static final X.a<?> f33052a;

        /* renamed from: b, reason: collision with root package name */
        static final Range<Integer> f33053b;

        /* renamed from: c, reason: collision with root package name */
        static final C.A f33054c;

        static {
            j0 j0Var = new j0();
            f33053b = new Range<>(30, 30);
            f33054c = C.A.f4076d;
            b bVar = new b(j0Var);
            bVar.f();
            bVar.g();
            bVar.e();
            f33052a = bVar.b();
        }

        @NonNull
        public static X.a a() {
            return f33052a;
        }
    }

    static class d implements InterfaceC5129y0.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        private androidx.camera.core.impl.E f33055a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f33056b = false;

        d(@NonNull androidx.camera.core.impl.E e11) {
            this.f33055a = e11;
        }

        @Override // androidx.camera.core.impl.InterfaceC5129y0.a
        public final void a(Boolean bool) {
            x2.i.f("SourceStreamRequirementObserver can be updated from main thread only", G.q.b());
            boolean equals = Boolean.TRUE.equals(bool);
            if (this.f33056b == equals) {
                return;
            }
            this.f33056b = equals;
            androidx.camera.core.impl.E e11 = this.f33055a;
            if (e11 == null) {
                C.S.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (equals) {
                e11.g();
            } else {
                e11.c();
            }
        }

        public final void b() {
            x2.i.f("SourceStreamRequirementObserver can be closed from main thread only", G.q.b());
            C.S.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.f33056b);
            androidx.camera.core.impl.E e11 = this.f33055a;
            if (e11 == null) {
                C.S.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
                return;
            }
            if (this.f33056b) {
                this.f33056b = false;
                if (e11 != null) {
                    e11.c();
                } else {
                    C.S.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
                }
            }
            this.f33055a = null;
        }

        @Override // androidx.camera.core.impl.InterfaceC5129y0.a
        public final void onError(@NonNull Throwable th2) {
            C.S.l("VideoCapture", "SourceStreamRequirementObserver#onError", th2);
        }
    }

    f0(@NonNull X.a<T> aVar) {
        super(aVar);
        this.f33041r = Y.f32993a;
        this.f33042s = new O0.b();
        this.f33043t = null;
        this.f33045v = s0.a.INACTIVE;
        this.f33049z = false;
        this.f33038C = new a();
    }

    public static /* synthetic */ void V(f0 f0Var, androidx.camera.core.impl.W w11) {
        if (w11 == f0Var.f33039p) {
            f0Var.f0();
        }
    }

    public static void X(f0 f0Var, N.y yVar, androidx.camera.core.impl.I i11, X.a aVar, Y0 y02) {
        if (i11 == f0Var.f()) {
            f0Var.f33044u = yVar.i(i11, true);
            s0 s0Var = (s0) aVar.a(X.a.f33906H);
            Objects.requireNonNull(s0Var);
            s0Var.f(f0Var.f33044u, y02);
            f0Var.m0();
        }
    }

    private static void c0(@NonNull HashSet hashSet, int i11, int i12, @NonNull Size size, @NonNull d0.Y y11) {
        if (i11 > size.getWidth() || i12 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i11, y11.d(i11).clamp(Integer.valueOf(i12)).intValue()));
        } catch (IllegalArgumentException e11) {
            C.S.l("VideoCapture", "No supportedHeights for width: " + i11, e11);
        }
        try {
            hashSet.add(new Size(y11.a(i12).clamp(Integer.valueOf(i11)).intValue(), i12));
        } catch (IllegalArgumentException e12) {
            C.S.l("VideoCapture", "No supportedWidths for height: " + i12, e12);
        }
    }

    private static int d0(boolean z11, int i11, int i12, @NonNull Range<Integer> range) {
        int i13 = i11 % i12;
        if (i13 != 0) {
            i11 = z11 ? i11 - i13 : i11 + (i12 - i13);
        }
        return range.clamp(Integer.valueOf(i11)).intValue();
    }

    private void f0() {
        G.q.a();
        O0.c cVar = this.f33037B;
        if (cVar != null) {
            cVar.b();
            this.f33037B = null;
        }
        androidx.camera.core.impl.W w11 = this.f33039p;
        if (w11 != null) {
            w11.d();
            this.f33039p = null;
        }
        N.F f7 = this.f33046w;
        if (f7 != null) {
            f7.e();
            this.f33046w = null;
        }
        N.y yVar = this.f33040q;
        if (yVar != null) {
            yVar.g();
            this.f33040q = null;
        }
        this.f33047x = null;
        this.f33044u = null;
        this.f33041r = Y.f32993a;
        this.f33048y = 0;
        this.f33049z = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @SuppressLint({"WrongConstant"})
    private O0.b g0(@NonNull final X.a<T> aVar, @NonNull T0 t02) {
        AbstractC4847s abstractC4847s;
        d0.Y y11;
        C.A a11;
        int i11;
        Rect rect;
        Size size;
        N.F f7;
        final Y0 y02;
        G.q.a();
        final androidx.camera.core.impl.I f11 = f();
        f11.getClass();
        Size e11 = t02.e();
        B90.j0 j0Var = new B90.j0(this, 1);
        Range<Integer> c11 = t02.c();
        if (Objects.equals(c11, T0.f38211a)) {
            c11 = c.f33053b;
        }
        Range<Integer> range = c11;
        com.google.common.util.concurrent.m<AbstractC4847s> b11 = i0().b().b();
        if (b11.isDone()) {
            try {
                abstractC4847s = b11.get();
            } catch (InterruptedException | ExecutionException e12) {
                throw new IllegalStateException(e12);
            }
        } else {
            abstractC4847s = null;
        }
        AbstractC4847s abstractC4847s2 = abstractC4847s;
        Objects.requireNonNull(abstractC4847s2);
        Z c12 = i0().c(f11.b());
        C.A b12 = t02.b();
        Y.f c13 = c12.c(e11, b12);
        InterfaceC8822a interfaceC8822a = (InterfaceC8822a) aVar.a(X.a.f33907I);
        Objects.requireNonNull(interfaceC8822a);
        d0.Y l02 = l0(interfaceC8822a, c13, abstractC4847s2, e11, b12, range);
        this.f33048y = h0(f11);
        final Rect x11 = x() != null ? x() : new Rect(0, 0, e11.getWidth(), e11.getHeight());
        if (l02 == null || l02.b(x11.width(), x11.height())) {
            y11 = l02;
            a11 = b12;
        } else {
            C.S.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", G.r.f(x11), Integer.valueOf(l02.j()), Integer.valueOf(l02.h()), l02.e(), l02.f()));
            d0.Y v11 = (!(l02.e().contains((Range<Integer>) Integer.valueOf(x11.width())) && l02.f().contains((Range<Integer>) Integer.valueOf(x11.height()))) && l02.g() && l02.f().contains((Range<Integer>) Integer.valueOf(x11.width())) && l02.e().contains((Range<Integer>) Integer.valueOf(x11.height()))) ? new d0.V(l02) : l02;
            int j11 = v11.j();
            int h11 = v11.h();
            Range<Integer> e13 = v11.e();
            Range<Integer> f12 = v11.f();
            y11 = l02;
            int d02 = d0(true, x11.width(), j11, e13);
            a11 = b12;
            int d03 = d0(false, x11.width(), j11, e13);
            int d04 = d0(true, x11.height(), h11, f12);
            int d05 = d0(false, x11.height(), h11, f12);
            HashSet hashSet = new HashSet();
            c0(hashSet, d02, d04, e11, v11);
            c0(hashSet, d02, d05, e11, v11);
            c0(hashSet, d03, d04, e11, v11);
            c0(hashSet, d03, d05, e11, v11);
            if (hashSet.isEmpty()) {
                C.S.k("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                C.S.a("VideoCapture", "candidatesList = " + arrayList);
                Collections.sort(arrayList, new Comparator() { // from class: W.e0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Size size2 = (Size) obj;
                        Size size3 = (Size) obj2;
                        int width = size2.getWidth();
                        Rect rect2 = x11;
                        return (Math.abs(size2.getHeight() - rect2.height()) + Math.abs(width - rect2.width())) - (Math.abs(size3.getHeight() - rect2.height()) + Math.abs(size3.getWidth() - rect2.width()));
                    }
                });
                C.S.a("VideoCapture", "sorted candidatesList = " + arrayList);
                Size size2 = (Size) arrayList.get(0);
                int width = size2.getWidth();
                int height = size2.getHeight();
                if (width == x11.width() && height == x11.height()) {
                    C.S.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    x2.i.f(null, width % 2 == 0 && height % 2 == 0 && width <= e11.getWidth() && height <= e11.getHeight());
                    Rect rect2 = new Rect(x11);
                    if (width != x11.width()) {
                        int max = Math.max(0, x11.centerX() - (width / 2));
                        rect2.left = max;
                        int i12 = max + width;
                        rect2.right = i12;
                        if (i12 > e11.getWidth()) {
                            int width2 = e11.getWidth();
                            rect2.right = width2;
                            rect2.left = width2 - width;
                        }
                    }
                    if (height != x11.height()) {
                        int max2 = Math.max(0, x11.centerY() - (height / 2));
                        rect2.top = max2;
                        int i13 = max2 + height;
                        rect2.bottom = i13;
                        if (i13 > e11.getHeight()) {
                            int height2 = e11.getHeight();
                            rect2.bottom = height2;
                            rect2.top = height2 - height;
                        }
                    }
                    C.S.a("VideoCapture", "Adjust cropRect from " + G.r.f(x11) + " to " + G.r.f(rect2));
                    x11 = rect2;
                }
            }
        }
        int i14 = this.f33048y;
        if (this.f33041r.b() != null) {
            s0.d b13 = this.f33041r.b();
            b13.getClass();
            Size g10 = G.r.g(G.r.e(b13.a()), i14);
            i11 = 0;
            rect = new Rect(0, 0, g10.getWidth(), g10.getHeight());
        } else {
            i11 = 0;
            rect = x11;
        }
        this.f33047x = rect;
        if (this.f33041r.b() == null || rect.equals(x11)) {
            size = e11;
        } else {
            float height3 = rect.height() / x11.height();
            size = new Size((int) Math.ceil(e11.getWidth() * height3), (int) Math.ceil(e11.getHeight() * height3));
        }
        if (this.f33041r.b() != null) {
            this.f33049z = true;
        }
        Rect rect3 = this.f33047x;
        int i15 = this.f33048y;
        boolean j02 = j0(f11, aVar, rect3, e11);
        if (((SizeCannotEncodeVideoQuirk) androidx.camera.video.internal.compat.quirk.a.b(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (!j02) {
                i15 = i11;
            }
            Size g11 = G.r.g(G.r.e(rect3), i15);
            if ((("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET).contains(g11)) {
                int h12 = y11 != null ? y11.h() / 2 : 8;
                Rect rect4 = new Rect(rect3);
                if (rect3.width() == g11.getHeight()) {
                    rect4.left += h12;
                    rect4.right -= h12;
                } else {
                    rect4.top += h12;
                    rect4.bottom -= h12;
                }
                rect3 = rect4;
            }
        }
        this.f33047x = rect3;
        if (j0(f11, aVar, rect3, e11)) {
            C.S.a("VideoCapture", "Surface processing is enabled.");
            androidx.camera.core.impl.I f13 = f();
            Objects.requireNonNull(f13);
            if (k() != null) {
                k().getClass();
                throw null;
            }
            f7 = new N.F(f13, l.a.a(a11));
        } else {
            f7 = null;
        }
        this.f33046w = f7;
        Y0 p11 = (f7 == null && f11.p()) ? Y0.UPTIME : f11.e().p();
        C.S.a("VideoCapture", "camera timebase = " + f11.e().p() + ", processing timebase = " + p11);
        T0.a g12 = t02.g();
        g12.e(size);
        g12.c(range);
        T0 a12 = g12.a();
        x2.i.f(null, this.f33040q == null ? 1 : i11);
        N.y yVar = new N.y(2, 34, a12, s(), f11.p(), this.f33047x, this.f33048y, c(), (f11.p() && z(f11)) ? 1 : i11);
        this.f33040q = yVar;
        yVar.d(j0Var);
        if (this.f33046w != null) {
            N.y yVar2 = this.f33040q;
            P.f h13 = P.f.h(yVar2.q(), yVar2.m(), yVar2.k(), G.r.g(G.r.e(yVar2.k()), yVar2.n()), yVar2.n(), yVar2.t());
            final N.y yVar3 = this.f33046w.f(F.b.c(this.f33040q, Collections.singletonList(h13))).get(h13);
            Objects.requireNonNull(yVar3);
            y02 = p11;
            yVar3.d(new Runnable() { // from class: W.b0
                @Override // java.lang.Runnable
                public final void run() {
                    f0.X(f0.this, yVar3, f11, aVar, y02);
                }
            });
            this.f33044u = yVar3.i(f11, true);
            androidx.camera.core.impl.W l11 = this.f33040q.l();
            this.f33039p = l11;
            l11.k().a(new L2.c(3, this, l11), H.c.e());
        } else {
            y02 = p11;
            C.s0 i16 = this.f33040q.i(f11, true);
            this.f33044u = i16;
            this.f33039p = i16.d();
        }
        s0 s0Var = (s0) aVar.a(X.a.f33906H);
        Objects.requireNonNull(s0Var);
        s0Var.f(this.f33044u, y02);
        m0();
        this.f33039p.p(MediaCodec.class);
        O0.b m11 = O0.b.m(aVar, t02.e());
        m11.q(t02.c());
        m11.w(aVar.o());
        O0.c cVar = this.f33037B;
        if (cVar != null) {
            cVar.b();
        }
        O0.c cVar2 = new O0.c(new O0.d() { // from class: W.c0
            @Override // androidx.camera.core.impl.O0.d
            public final void a(O0 o02, O0.g gVar) {
                f0.this.k0();
            }
        });
        this.f33037B = cVar2;
        m11.p(cVar2);
        if (t02.d() != null) {
            m11.e(t02.d());
        }
        return m11;
    }

    private int h0(@NonNull androidx.camera.core.impl.I i11) {
        boolean z11 = z(i11);
        int p11 = p(i11, z11);
        if (this.f33041r.b() == null) {
            return p11;
        }
        s0.d b11 = this.f33041r.b();
        Objects.requireNonNull(b11);
        int b12 = b11.b();
        if (z11 != b11.f()) {
            b12 = -b12;
        }
        return G.r.h(p11 - b12);
    }

    private boolean j0(@NonNull androidx.camera.core.impl.I i11, @NonNull X.a<?> aVar, @NonNull Rect rect, @NonNull Size size) {
        if (k() != null) {
            return true;
        }
        if (i11.p()) {
            Boolean bool = (Boolean) aVar.c(X.a.f33908J, Boolean.FALSE);
            Objects.requireNonNull(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        if (!(i11.p() && (SurfaceProcessingQuirk.d(androidx.camera.video.internal.compat.quirk.a.c()) || SurfaceProcessingQuirk.d(i11.e().l()))) && size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
            return (i11.p() && z(i11)) || this.f33041r.b() != null;
        }
        return true;
    }

    private static d0.Y l0(@NonNull InterfaceC8822a<d0.W, d0.Y> interfaceC8822a, Y.f fVar, @NonNull AbstractC4847s abstractC4847s, @NonNull Size size, @NonNull C.A a11, @NonNull Range<Integer> range) {
        c0.n b11 = c0.k.b(abstractC4847s, a11, fVar);
        Y0 y02 = Y0.UPTIME;
        u0 c11 = abstractC4847s.c();
        InterfaceC5086c0.c c12 = b11.c();
        d0.Y apply = interfaceC8822a.apply((d0.W) (c12 != null ? new c0.m(b11.a(), y02, c11, size, c12, a11, range) : new c0.l(b11.a(), y02, c11, size, a11, range)).get());
        if (apply != null) {
            return C6393d.k(apply, fVar != null ? new Size(fVar.g().k(), fVar.g().h()) : null);
        }
        C.S.k("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    private void m0() {
        androidx.camera.core.impl.I f7 = f();
        N.y yVar = this.f33040q;
        if (f7 == null || yVar == null) {
            return;
        }
        int h02 = h0(f7);
        this.f33048y = h02;
        G.q.c(new N.t(yVar, h02, c()));
    }

    @NonNull
    public static f0 o0(@NonNull K k11) {
        return new f0(new b(k11).b());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.camera.core.impl.b1, androidx.camera.core.impl.b1<?>] */
    @Override // androidx.camera.core.w
    @NonNull
    protected final b1<?> I(@NonNull androidx.camera.core.impl.H h11, @NonNull b1.a<?, ?, ?> aVar) {
        AbstractC4847s abstractC4847s;
        Y.f c11;
        C.A a11;
        d0.Y y11;
        Z z11;
        X.a aVar2;
        int i11;
        com.google.common.util.concurrent.m<AbstractC4847s> b11 = i0().b().b();
        if (b11.isDone()) {
            try {
                abstractC4847s = b11.get();
            } catch (InterruptedException | ExecutionException e11) {
                throw new IllegalStateException(e11);
            }
        } else {
            abstractC4847s = null;
        }
        AbstractC4847s abstractC4847s2 = abstractC4847s;
        x2.i.a("Unable to update target resolution by null MediaSpec.", abstractC4847s2 != null);
        C.A u11 = i().w() ? i().u() : c.f33054c;
        Z c12 = i0().c(h11);
        ArrayList b12 = c12.b(u11);
        if (b12.isEmpty()) {
            C.S.k("VideoCapture", "Can't find any supported quality on the device.");
        } else {
            u0 c13 = abstractC4847s2.c();
            A d11 = c13.d();
            ArrayList c14 = d11.c(b12);
            C.S.a("VideoCapture", "Found selectedQualities " + c14 + " by " + d11);
            if (c14.isEmpty()) {
                throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
            }
            int a12 = c13.a();
            HashMap hashMap = new HashMap();
            Iterator it = c12.b(u11).iterator();
            while (it.hasNext()) {
                C4852x c4852x = (C4852x) it.next();
                Y.f a13 = c12.a(c4852x, u11);
                Objects.requireNonNull(a13);
                InterfaceC5086c0.c g10 = a13.g();
                hashMap.put(c4852x, new Size(g10.k(), g10.h()));
            }
            C4854z c4854z = new C4854z(h11.m(l()), hashMap);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = c14.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(c4854z.a((C4852x) it2.next(), a12));
            }
            X.a aVar3 = (X.a) aVar.b();
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Size size = (Size) it3.next();
                    if (!hashMap.containsValue(size) && (c11 = c12.c(size, u11)) != null) {
                        InterfaceC8822a interfaceC8822a = (InterfaceC8822a) aVar3.a(X.a.f33907I);
                        Objects.requireNonNull(interfaceC8822a);
                        Range<Integer> I11 = aVar3.I(c.f33053b);
                        Objects.requireNonNull(I11);
                        if (u11.d()) {
                            y11 = l0(interfaceC8822a, c11, abstractC4847s2, size, u11, I11);
                            a11 = u11;
                        } else {
                            a11 = u11;
                            int i12 = LinearLayoutManager.INVALID_OFFSET;
                            d0.Y y12 = null;
                            for (InterfaceC5086c0.c cVar : c11.d()) {
                                if (C6245b.b(cVar, a11)) {
                                    int i13 = i12;
                                    int g11 = cVar.g();
                                    z11 = c12;
                                    HashMap hashMap2 = C6245b.f61730d;
                                    aVar2 = aVar3;
                                    x2.i.b(hashMap2.containsKey(Integer.valueOf(g11)));
                                    Integer num = (Integer) hashMap2.get(Integer.valueOf(g11));
                                    Objects.requireNonNull(num);
                                    int intValue = num.intValue();
                                    int b13 = cVar.b();
                                    HashMap hashMap3 = C6245b.f61729c;
                                    x2.i.b(hashMap3.containsKey(Integer.valueOf(b13)));
                                    Integer num2 = (Integer) hashMap3.get(Integer.valueOf(b13));
                                    Objects.requireNonNull(num2);
                                    C.A a14 = new C.A(intValue, num2.intValue());
                                    i11 = i13;
                                    d0.Y l02 = l0(interfaceC8822a, c11, abstractC4847s2, size, a14, I11);
                                    if (l02 == null) {
                                        aVar3 = aVar2;
                                        i12 = i11;
                                        c12 = z11;
                                    } else {
                                        int intValue2 = l02.e().getUpper().intValue();
                                        int intValue3 = l02.f().getUpper().intValue();
                                        Size size2 = M.c.f17199a;
                                        int i14 = intValue2 * intValue3;
                                        if (i14 > i11) {
                                            y12 = l02;
                                            i12 = i14;
                                            aVar3 = aVar2;
                                            c12 = z11;
                                        }
                                    }
                                } else {
                                    z11 = c12;
                                    aVar2 = aVar3;
                                    i11 = i12;
                                }
                                i12 = i11;
                                aVar3 = aVar2;
                                c12 = z11;
                            }
                            y11 = y12;
                        }
                        Z z12 = c12;
                        X.a aVar4 = aVar3;
                        if (y11 != null && !y11.b(size.getWidth(), size.getHeight())) {
                            it3.remove();
                        }
                        aVar3 = aVar4;
                        u11 = a11;
                        c12 = z12;
                    }
                }
            }
            C.S.a("VideoCapture", "Set custom ordered resolutions = " + arrayList);
            ((C5123v0) aVar.a()).U(InterfaceC5102k0.f38351u, arrayList);
        }
        return aVar.b();
    }

    @Override // androidx.camera.core.w
    public final void J() {
        C.S.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + h());
        if (d() == null || this.f33044u != null) {
            return;
        }
        T0 d11 = d();
        d11.getClass();
        InterfaceC5129y0<Y> d12 = i0().d();
        Y y11 = Y.f32993a;
        com.google.common.util.concurrent.m<Y> b11 = d12.b();
        if (b11.isDone()) {
            try {
                y11 = b11.get();
            } catch (InterruptedException | ExecutionException e11) {
                throw new IllegalStateException(e11);
            }
        }
        this.f33041r = y11;
        O0.b g02 = g0((X.a) i(), d11);
        this.f33042s = g02;
        e0(g02, this.f33041r, d11);
        Object[] objArr = {this.f33042s.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        S(Collections.unmodifiableList(arrayList));
        B();
        i0().d().c(H.c.e(), this.f33038C);
        d dVar = this.f33036A;
        if (dVar != null) {
            dVar.b();
        }
        this.f33036A = new d(g());
        i0().g().c(H.c.e(), this.f33036A);
        s0.a aVar = s0.a.ACTIVE_NON_STREAMING;
        if (aVar != this.f33045v) {
            this.f33045v = aVar;
            i0().e(aVar);
        }
    }

    @Override // androidx.camera.core.w
    public final void K() {
        C.S.a("VideoCapture", "VideoCapture#onStateDetached");
        x2.i.f("VideoCapture can only be detached on the main thread.", G.q.b());
        if (this.f33036A != null) {
            i0().g().d(this.f33036A);
            this.f33036A.b();
            this.f33036A = null;
        }
        s0.a aVar = s0.a.INACTIVE;
        if (aVar != this.f33045v) {
            this.f33045v = aVar;
            i0().e(aVar);
        }
        i0().d().d(this.f33038C);
        com.google.common.util.concurrent.m<Void> mVar = this.f33043t;
        if (mVar != null && mVar.cancel(false)) {
            C.S.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        f0();
    }

    @Override // androidx.camera.core.w
    @NonNull
    protected final T0 L(@NonNull androidx.camera.core.impl.T t2) {
        this.f33042s.e(t2);
        Object[] objArr = {this.f33042s.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        S(Collections.unmodifiableList(arrayList));
        T0 d11 = d();
        Objects.requireNonNull(d11);
        T0.a g10 = d11.g();
        g10.d(t2);
        return g10.a();
    }

    @Override // androidx.camera.core.w
    @NonNull
    protected final T0 M(@NonNull T0 t02, T0 t03) {
        C.S.a("VideoCapture", "onSuggestedStreamSpecUpdated: " + t02);
        ArrayList y11 = ((X.a) i()).y();
        if (y11 != null && !y11.contains(t02.e())) {
            C.S.k("VideoCapture", "suggested resolution " + t02.e() + " is not in custom ordered resolutions " + y11);
        }
        return t02;
    }

    @Override // androidx.camera.core.w
    public final void Q(@NonNull Rect rect) {
        super.Q(rect);
        m0();
    }

    final void e0(@NonNull final O0.b bVar, @NonNull Y y11, @NonNull T0 t02) {
        androidx.camera.core.impl.W w11;
        boolean z11 = y11.a() == -1;
        boolean z12 = y11.c() == Y.a.ACTIVE;
        if (z11 && z12) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        bVar.l();
        C.A b11 = t02.b();
        if (!z11 && (w11 = this.f33039p) != null) {
            if (z12) {
                bVar.i(w11, b11, -1);
            } else {
                bVar.f(w11, b11);
            }
        }
        com.google.common.util.concurrent.m<Void> mVar = this.f33043t;
        if (mVar != null && mVar.cancel(false)) {
            C.S.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        com.google.common.util.concurrent.m<Void> a11 = androidx.concurrent.futures.b.a(new b.c() { // from class: W.a0
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                f0.this.getClass();
                Integer valueOf = Integer.valueOf(aVar.hashCode());
                O0.b bVar2 = bVar;
                bVar2.j(valueOf, "androidx.camera.video.VideoCapture.streamUpdate");
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                h0 h0Var = new h0(atomicBoolean, aVar, bVar2);
                aVar.a(new d0(atomicBoolean, bVar2, h0Var, 0), H.c.b());
                bVar2.g(h0Var);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
            }
        });
        this.f33043t = a11;
        I.k.b(a11, new i0(this, a11, z12), H.c.e());
    }

    @NonNull
    public final T i0() {
        T t2 = (T) ((X.a) i()).a(X.a.f33906H);
        Objects.requireNonNull(t2);
        return t2;
    }

    @Override // androidx.camera.core.w
    public final b1<?> j(boolean z11, @NonNull c1 c1Var) {
        f33035D.getClass();
        androidx.camera.core.impl.T a11 = c1Var.a(c.a().N(), 1);
        if (z11) {
            a11 = androidx.camera.core.impl.T.O(a11, c.a());
        }
        if (a11 == null) {
            return null;
        }
        return b.c(a11).b();
    }

    final void k0() {
        if (f() == null) {
            return;
        }
        f0();
        X.a<T> aVar = (X.a) i();
        T0 d11 = d();
        d11.getClass();
        O0.b g02 = g0(aVar, d11);
        this.f33042s = g02;
        e0(g02, this.f33041r, d());
        Object[] objArr = {this.f33042s.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        S(Collections.unmodifiableList(arrayList));
        D();
    }

    final boolean n0(@NonNull Y y11, @NonNull Y y12) {
        return this.f33049z && y11.b() != null && y12.b() == null;
    }

    @NonNull
    public final String toString() {
        return "VideoCapture:".concat(n());
    }

    @Override // androidx.camera.core.w
    @NonNull
    public final Set<Integer> u() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // androidx.camera.core.w
    @NonNull
    public final b1.a<?, ?, ?> w(@NonNull androidx.camera.core.impl.T t2) {
        return b.c(t2);
    }

    public static final class b<T extends s0> implements b1.a<f0<T>, X.a<T>, b<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final C5123v0 f33051a;

        private b(@NonNull C5123v0 c5123v0) {
            Object obj;
            this.f33051a = c5123v0;
            if (!c5123v0.d(X.a.f33906H)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Object obj2 = null;
            try {
                obj = c5123v0.a(J.m.f12652c);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(f0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f33051a.U(b1.f38264D, c1.b.VIDEO_CAPTURE);
            T.a<Class<?>> aVar = J.m.f12652c;
            C5123v0 c5123v02 = this.f33051a;
            c5123v02.U(aVar, f0.class);
            try {
                obj2 = c5123v02.a(J.m.f12651b);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                c5123v02.U(J.m.f12651b, f0.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @NonNull
        static b<? extends s0> c(@NonNull androidx.camera.core.impl.T t2) {
            return new b<>(C5123v0.S(t2));
        }

        @Override // C.B
        @NonNull
        public final InterfaceC5121u0 a() {
            return this.f33051a;
        }

        @Override // androidx.camera.core.impl.b1.a
        @NonNull
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final X.a<T> b() {
            return new X.a<>(A0.Q(this.f33051a));
        }

        @NonNull
        public final void e() {
            C.A a11 = C.A.f4076d;
            this.f33051a.U(InterfaceC5100j0.f38331k, a11);
        }

        @NonNull
        public final void f() {
            this.f33051a.U(b1.f38271z, 5);
        }

        @NonNull
        final void g() {
            d0.Z z11 = d0.a0.f60873c;
            this.f33051a.U(X.a.f33907I, z11);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(@NonNull T t2) {
            this(r0);
            C5123v0 R11 = C5123v0.R();
            R11.U(X.a.f33906H, t2);
        }
    }
}
