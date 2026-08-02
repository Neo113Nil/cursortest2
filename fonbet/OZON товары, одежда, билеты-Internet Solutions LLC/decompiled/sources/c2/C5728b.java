package c2;

import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.H;
import D1.x0;
import D1.y0;
import D1.z0;
import I1.D;
import S0.AbstractC3984t;
import S0.InterfaceC3963i;
import Sc.s;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.r2;
import androidx.core.view.B;
import androidx.core.view.C;
import androidx.lifecycle.C0;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import c2.C5729c;
import java.util.List;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7845v;
import l1.InterfaceC7802U;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import w1.C10407b;
import x1.K;
import xe.C10727i;
import xe.M;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5728b extends ViewGroup implements B, InterfaceC3963i, y0 {

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private static final Function1<C5728b, Unit> f56322w = a.f56345b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10407b f56323a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final View f56324b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0 f56325c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f56326d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f56327e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f56328f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f56329g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.e f56330h;

    /* renamed from: i, reason: collision with root package name */
    private Function1<? super androidx.compose.ui.e, Unit> f56331i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private Z1.d f56332j;

    /* renamed from: k, reason: collision with root package name */
    private Function1<? super Z1.d, Unit> f56333k;

    /* renamed from: l, reason: collision with root package name */
    private J f56334l;

    /* renamed from: m, reason: collision with root package name */
    private M4.e f56335m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f56336n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f56337o;

    /* renamed from: p, reason: collision with root package name */
    private K f56338p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final int[] f56339q;

    /* renamed from: r, reason: collision with root package name */
    private int f56340r;

    /* renamed from: s, reason: collision with root package name */
    private int f56341s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final C f56342t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f56343u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final H f56344v;

    /* renamed from: c2.b$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<C5728b, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f56345b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C5728b c5728b) {
            C5728b c5728b2 = c5728b;
            c5728b2.getHandler().post(new RunnableC5727a(c5728b2.f56336n, 0));
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.b$b, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    static final class C0846b extends AbstractC7737t implements Function1<androidx.compose.ui.e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H f56346b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f56347c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0846b(H h11, androidx.compose.ui.e eVar) {
            super(1);
            this.f56346b = h11;
            this.f56347c = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(androidx.compose.ui.e eVar) {
            this.f56346b.d(eVar.l0(this.f56347c));
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.b$c */
    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function1<Z1.d, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H f56348b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(H h11) {
            super(1);
            this.f56348b = h11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Z1.d dVar) {
            this.f56348b.j(dVar);
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.b$d */
    /* loaded from: classes8.dex */
    static final class d extends AbstractC7737t implements Function1<x0, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H f56350c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(H h11) {
            super(1);
            this.f56350c = h11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(x0 x0Var) {
            x0 x0Var2 = x0Var;
            AndroidComposeView androidComposeView = x0Var2 instanceof AndroidComposeView ? (AndroidComposeView) x0Var2 : null;
            C5728b c5728b = C5728b.this;
            if (androidComposeView != null) {
                androidComposeView.T(c5728b, this.f56350c);
            }
            if (c5728b.n().getParent() != c5728b) {
                c5728b.addView(c5728b.n());
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.b$e */
    /* loaded from: classes8.dex */
    static final class e extends AbstractC7737t implements Function1<x0, Unit> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(x0 x0Var) {
            x0 x0Var2 = x0Var;
            AndroidComposeView androidComposeView = x0Var2 instanceof AndroidComposeView ? (AndroidComposeView) x0Var2 : null;
            C5728b c5728b = C5728b.this;
            if (androidComposeView != null) {
                androidComposeView.L0(c5728b);
            }
            c5728b.removeAllViewsInLayout();
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.b$f */
    /* loaded from: classes8.dex */
    public static final class f implements V {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H f56353b;

        /* renamed from: c2.b$f$a */
        static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f56354b = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                return Unit.f71690a;
            }
        }

        /* renamed from: c2.b$f$b, reason: collision with other inner class name */
        static final class C0847b extends AbstractC7737t implements Function1<m0.a, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5728b f56355b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ H f56356c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0847b(C5728b c5728b, H h11) {
                super(1);
                this.f56355b = c5728b;
                this.f56356c = h11;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(m0.a aVar) {
                C5729c.b(this.f56355b, this.f56356c);
                return Unit.f71690a;
            }
        }

        f(H h11) {
            this.f56353b = h11;
        }

        @Override // B1.V
        public final int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
            C5728b c5728b = C5728b.this;
            c5728b.measure(C5728b.i(c5728b, 0, i11, c5728b.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return c5728b.getMeasuredHeight();
        }

        @Override // B1.V
        public final int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            C5728b c5728b = C5728b.this;
            c5728b.measure(makeMeasureSpec, C5728b.i(c5728b, 0, i11, c5728b.getLayoutParams().height));
            return c5728b.getMeasuredWidth();
        }

        @Override // B1.V
        @NotNull
        /* renamed from: measure-3p2s80s */
        public final W mo2measure3p2s80s(@NotNull Y y11, @NotNull List<? extends U> list, long j11) {
            W z02;
            W z03;
            C5728b c5728b = C5728b.this;
            if (c5728b.getChildCount() == 0) {
                z03 = y11.z0(Z1.b.m(j11), Z1.b.l(j11), kotlin.collections.U.c(), a.f56354b);
                return z03;
            }
            if (Z1.b.m(j11) != 0) {
                c5728b.getChildAt(0).setMinimumWidth(Z1.b.m(j11));
            }
            if (Z1.b.l(j11) != 0) {
                c5728b.getChildAt(0).setMinimumHeight(Z1.b.l(j11));
            }
            c5728b.measure(C5728b.i(c5728b, Z1.b.m(j11), Z1.b.k(j11), c5728b.getLayoutParams().width), C5728b.i(c5728b, Z1.b.l(j11), Z1.b.j(j11), c5728b.getLayoutParams().height));
            z02 = y11.z0(c5728b.getMeasuredWidth(), c5728b.getMeasuredHeight(), kotlin.collections.U.c(), new C0847b(c5728b, this.f56353b));
            return z02;
        }

        @Override // B1.V
        public final int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
            C5728b c5728b = C5728b.this;
            c5728b.measure(C5728b.i(c5728b, 0, i11, c5728b.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return c5728b.getMeasuredHeight();
        }

        @Override // B1.V
        public final int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            C5728b c5728b = C5728b.this;
            c5728b.measure(makeMeasureSpec, C5728b.i(c5728b, 0, i11, c5728b.getLayoutParams().height));
            return c5728b.getMeasuredWidth();
        }
    }

    /* renamed from: c2.b$g */
    /* loaded from: classes8.dex */
    static final class g extends AbstractC7737t implements Function1<D, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f56357b = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(D d11) {
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.b$h */
    /* loaded from: classes8.dex */
    static final class h extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H f56359c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C5728b f56360d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(H h11, C5728b c5728b) {
            super(1);
            this.f56359c = h11;
            this.f56360d = c5728b;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InterfaceC8412e interfaceC8412e) {
            InterfaceC7802U a11 = interfaceC8412e.w0().a();
            C5728b c5728b = C5728b.this;
            if (c5728b.n().getVisibility() != 8) {
                c5728b.f56343u = true;
                x0 f02 = this.f56359c.f0();
                AndroidComposeView androidComposeView = f02 != null ? (AndroidComposeView) f02 : null;
                if (androidComposeView != null) {
                    Canvas b11 = C7845v.b(a11);
                    androidComposeView.d0();
                    this.f56360d.draw(b11);
                }
                c5728b.f56343u = false;
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.b$i */
    /* loaded from: classes8.dex */
    static final class i extends AbstractC7737t implements Function1<B1.B, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H f56362c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(H h11) {
            super(1);
            this.f56362c = h11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(B1.B b11) {
            H h11 = this.f56362c;
            C5728b c5728b = C5728b.this;
            C5729c.b(c5728b, h11);
            c5728b.f56325c.p();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {565, 570}, m = "invokeSuspend")
    /* renamed from: c2.b$j */
    /* loaded from: classes8.dex */
    static final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f56363d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f56364e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5728b f56365f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f56366g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z11, C5728b c5728b, long j11, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f56364e = z11;
            this.f56365f = c5728b;
            this.f56366g = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new j(this.f56364e, this.f56365f, this.f56366g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        
            if (r4.a(0, r10.f56366g, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        
            if (r1.a(r10.f56366g, 0, r10) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f56363d;
            if (i11 == 0) {
                s.b(obj);
                C5728b c5728b = this.f56365f;
                if (this.f56364e) {
                    C10407b c10407b = c5728b.f56323a;
                    this.f56363d = 2;
                } else {
                    C10407b c10407b2 = c5728b.f56323a;
                    this.f56363d = 1;
                }
            } else if (i11 == 1) {
                s.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {583}, m = "invokeSuspend")
    /* renamed from: c2.b$k */
    /* loaded from: classes8.dex */
    static final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f56367d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f56369f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(long j11, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f56369f = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return C5728b.this.new k(this.f56369f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f56367d;
            if (i11 == 0) {
                s.b(obj);
                C10407b c10407b = C5728b.this.f56323a;
                this.f56367d = 1;
                if (c10407b.c(this.f56369f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.b$l */
    /* loaded from: classes8.dex */
    static final class l extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f56370b = new l(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.b$m */
    /* loaded from: classes8.dex */
    static final class m extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f56371b = new m(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.b$n */
    /* loaded from: classes8.dex */
    static final class n extends AbstractC7737t implements Function0<Unit> {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C5728b.this.l().s0();
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.b$o */
    /* loaded from: classes8.dex */
    static final class o extends AbstractC7737t implements Function0<Unit> {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C5728b c5728b = C5728b.this;
            if (c5728b.f56327e && c5728b.isAttachedToWindow() && c5728b.n().getParent() == c5728b) {
                C5728b.h(c5728b).f(c5728b, C5728b.f56322w, c5728b.m());
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: c2.b$p */
    /* loaded from: classes8.dex */
    static final class p extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f56374b = new p(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.f71690a;
        }
    }

    public C5728b(@NotNull Context context, AbstractC3984t abstractC3984t, int i11, @NotNull C10407b c10407b, @NotNull View view, @NotNull x0 x0Var) {
        super(context);
        C5729c.a aVar;
        this.f56323a = c10407b;
        this.f56324b = view;
        this.f56325c = x0Var;
        if (abstractC3984t != null) {
            int i12 = r2.f41010b;
            setTag(R.id.androidx_compose_ui_view_composition_context, abstractC3984t);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.f56326d = p.f56374b;
        this.f56328f = m.f56371b;
        this.f56329g = l.f56370b;
        e.a aVar2 = androidx.compose.ui.e.f40358c0;
        this.f56330h = aVar2;
        this.f56332j = Z1.f.b();
        this.f56336n = new o();
        this.f56337o = new n();
        this.f56339q = new int[2];
        this.f56340r = LinearLayoutManager.INVALID_OFFSET;
        this.f56341s = LinearLayoutManager.INVALID_OFFSET;
        this.f56342t = new C();
        H h11 = new H(3);
        h11.k1(this);
        aVar = C5729c.f56375a;
        androidx.compose.ui.e a11 = androidx.compose.ui.layout.c.a(androidx.compose.ui.draw.c.b(x1.H.a(I1.o.c(androidx.compose.ui.input.nestedscroll.a.a(aVar2, aVar, c10407b), true, g.f56357b), this), new h(h11, this)), new i(h11));
        h11.d(this.f56330h.l0(a11));
        this.f56331i = new C0846b(h11, a11);
        h11.j(this.f56332j);
        this.f56333k = new c(h11);
        h11.o1(new d(h11));
        h11.p1(new e());
        h11.h(new f(h11));
        this.f56344v = h11;
    }

    public static final z0 h(C5728b c5728b) {
        if (c5728b.isAttachedToWindow()) {
            return c5728b.f56325c.getF40501C();
        }
        A1.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        throw null;
    }

    public static final int i(C5728b c5728b, int i11, int i12, int i13) {
        c5728b.getClass();
        return (i13 >= 0 || i11 == i12) ? View.MeasureSpec.makeMeasureSpec(kotlin.ranges.h.e(i13, i11, i12), 1073741824) : (i13 != -2 || i12 == Integer.MAX_VALUE) ? (i13 != -1 || i12 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(i12, LinearLayoutManager.INVALID_OFFSET);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // S0.InterfaceC3963i
    public final void a() {
        this.f56328f.invoke();
        removeAllViewsInLayout();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // S0.InterfaceC3963i
    public final void g() {
        View view = this.f56324b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f56328f.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f56339q;
        getLocationInWindow(iArr);
        int i11 = iArr[0];
        region.op(i11, iArr[1], getWidth() + i11, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.View
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f56324b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f56342t.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f56343u) {
            this.f56344v.s0();
            return null;
        }
        this.f56324b.postOnAnimation(new H30.j(this.f56337o, 1));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f56324b.isNestedScrollingEnabled();
    }

    public final View k() {
        return this.f56324b;
    }

    @NotNull
    public final H l() {
        return this.f56344v;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function0<Unit> m() {
        return this.f56326d;
    }

    @Override // D1.y0
    public final boolean m0() {
        return isAttachedToWindow();
    }

    @NotNull
    public final View n() {
        return this.f56324b;
    }

    public final void o() {
        int i11;
        int i12 = this.f56340r;
        if (i12 == Integer.MIN_VALUE || (i11 = this.f56341s) == Integer.MIN_VALUE) {
            return;
        }
        measure(i12, i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((o) this.f56336n).invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(@NotNull View view, @NotNull View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f56343u) {
            this.f56344v.s0();
        } else {
            this.f56324b.postOnAnimation(new H30.j(this.f56337o, 1));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isAttachedToWindow()) {
            this.f56325c.getF40501C().a(this);
        } else {
            A1.a.b("Expected AndroidViewHolder to be attached when observing reads.");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f56324b.layout(0, 0, i13 - i11, i14 - i12);
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        View view = this.f56324b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i11, i12);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f56340r = i11;
        this.f56341s = i12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NotNull View view, float f7, float f11, boolean z11) {
        if (!this.f56324b.isNestedScrollingEnabled()) {
            return false;
        }
        C10727i.c(this.f56323a.e(), null, null, new j(z11, this, Fl0.b.a(C5729c.d(f7), C5729c.d(f11)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NotNull View view, float f7, float f11) {
        if (!this.f56324b.isNestedScrollingEnabled()) {
            return false;
        }
        C10727i.c(this.f56323a.e(), null, null, new k(Fl0.b.a(C5729c.d(f7), C5729c.d(f11)), null), 3);
        return false;
    }

    @Override // androidx.core.view.A
    public final void onNestedPreScroll(@NotNull View view, int i11, int i12, @NotNull int[] iArr, int i13) {
        if (this.f56324b.isNestedScrollingEnabled()) {
            long a11 = P9.a.a(C5729c.c(i11), C5729c.c(i12));
            long d11 = this.f56323a.d(C5729c.e(i13), a11);
            iArr[0] = N9.o.a(C7459e.g(d11));
            iArr[1] = N9.o.a(C7459e.h(d11));
        }
    }

    @Override // androidx.core.view.A
    public final void onNestedScroll(@NotNull View view, int i11, int i12, int i13, int i14, int i15) {
        if (this.f56324b.isNestedScrollingEnabled()) {
            long a11 = P9.a.a(C5729c.c(i11), C5729c.c(i12));
            long a12 = P9.a.a(C5729c.c(i13), C5729c.c(i14));
            this.f56323a.b(C5729c.e(i15), a11, a12);
        }
    }

    @Override // androidx.core.view.A
    public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i11, int i12) {
        this.f56342t.c(i11, i12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // S0.InterfaceC3963i
    public final void onRelease() {
        this.f56329g.invoke();
    }

    @Override // androidx.core.view.A
    public final boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i11, int i12) {
        return ((i11 & 2) == 0 && (i11 & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.A
    public final void onStopNestedScroll(@NotNull View view, int i11) {
        this.f56342t.e(i11);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
    }

    public final void p(@NotNull Z1.d dVar) {
        if (dVar != this.f56332j) {
            this.f56332j = dVar;
            Function1<? super Z1.d, Unit> function1 = this.f56333k;
            if (function1 != null) {
                ((c) function1).invoke(dVar);
            }
        }
    }

    public final void q(J j11) {
        if (j11 != this.f56334l) {
            this.f56334l = j11;
            C0.b(this, j11);
        }
    }

    public final void r(@NotNull androidx.compose.ui.e eVar) {
        if (eVar != this.f56330h) {
            this.f56330h = eVar;
            Function1<? super androidx.compose.ui.e, Unit> function1 = this.f56331i;
            if (function1 != null) {
                ((C0846b) function1).invoke(eVar);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z11) {
        K k11 = this.f56338p;
        if (k11 != null) {
            k11.invoke(Boolean.valueOf(z11));
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public final void s(K k11) {
        this.f56338p = k11;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void t(@NotNull Function0<Unit> function0) {
        this.f56329g = (AbstractC7737t) function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void u(@NotNull Function0<Unit> function0) {
        this.f56328f = (AbstractC7737t) function0;
    }

    public final void v(M4.e eVar) {
        if (eVar != this.f56335m) {
            this.f56335m = eVar;
            M4.f.b(this, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void w(@NotNull Function0<Unit> function0) {
        this.f56326d = (AbstractC7737t) function0;
        this.f56327e = true;
        ((o) this.f56336n).invoke();
    }

    @Override // androidx.core.view.B
    public final void onNestedScroll(@NotNull View view, int i11, int i12, int i13, int i14, int i15, @NotNull int[] iArr) {
        if (this.f56324b.isNestedScrollingEnabled()) {
            long a11 = P9.a.a(C5729c.c(i11), C5729c.c(i12));
            long a12 = P9.a.a(C5729c.c(i13), C5729c.c(i14));
            long b11 = this.f56323a.b(C5729c.e(i15), a11, a12);
            iArr[0] = N9.o.a(C7459e.g(b11));
            iArr[1] = N9.o.a(C7459e.h(b11));
        }
    }
}
