package F0;

import B0.C2489l1;
import B0.EnumC2526y0;
import B0.InterfaceC2477h1;
import E0.C2939o0;
import E0.C2948t0;
import E0.EnumC2911a0;
import E0.Z0;
import E0.a1;
import E0.c1;
import E0.g1;
import I0.C3176c0;
import I0.C3202p0;
import I0.F;
import I0.InterfaceC3198n0;
import I0.l1;
import K1.C3422b;
import K1.Q;
import K1.S;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.compose.foundation.gestures.C5177u;
import androidx.compose.ui.platform.G0;
import androidx.compose.ui.platform.I0;
import androidx.compose.ui.platform.S1;
import androidx.compose.ui.platform.U1;
import androidx.recyclerview.widget.LinearLayoutManager;
import c1.AbstractC5715f;
import fd.InterfaceC6511n;
import k1.C7459e;
import k1.C7460f;
import k1.C7461g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import p0.AbstractC8823a;
import r0.C9115P;
import r0.InterfaceC9143w;
import t0.s;
import t1.InterfaceC9723a;
import xe.B0;
import xe.C10727i;

/* renamed from: F0.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2990k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c1 f8251a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Z0 f8252b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Z1.d f8253c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8254d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8255e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9723a f8256f;

    /* renamed from: g, reason: collision with root package name */
    private S1 f8257g;

    /* renamed from: h, reason: collision with root package name */
    private I0 f8258h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C3991w0 f8259i;

    /* renamed from: j, reason: collision with root package name */
    private Function0<? extends AbstractC8823a> f8260j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C3991w0 f8261k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C3991w0 f8262l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C3991w0 f8263m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C3991w0 f8264n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C3991w0 f8265o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C3991w0 f8266p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC3198n0 f8267q;

    /* renamed from: r, reason: collision with root package name */
    private int f8268r;

    /* renamed from: s, reason: collision with root package name */
    private s.b f8269s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: F0.k$a */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a Mouse;
        public static final a None;
        public static final a Touch;

        static {
            a aVar = new a("None", 0);
            None = aVar;
            a aVar2 = new a("Touch", 1);
            Touch = aVar2;
            a aVar3 = new a("Mouse", 2);
            Mouse = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: F0.k$b */
    private final class b implements I0.r {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function0<Unit> f8270a;

        /* renamed from: b, reason: collision with root package name */
        private int f8271b = -1;

        /* renamed from: c, reason: collision with root package name */
        private long f8272c = 9205357640488583168L;

        /* renamed from: F0.k$b$a */
        static final class a extends AbstractC7737t implements Function0<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f8274b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j11) {
                super(0);
                this.f8274b = j11;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Mouse.onDrag " + ((Object) C7459e.m(this.f8274b));
            }
        }

        public b(@NotNull Function0<Unit> function0) {
            this.f8270a = function0;
        }

        private final long d(long j11, I0.F f7, boolean z11) {
            int i11 = this.f8271b;
            Integer valueOf = Integer.valueOf(i11);
            if (i11 < 0) {
                valueOf = null;
            }
            C2990k c2990k = C2990k.this;
            long v11 = C2990k.v(c2990k, c2990k.f8251a.j(), valueOf != null ? valueOf.intValue() : c2990k.f8252b.h(this.f8272c, false), c2990k.f8252b.h(j11, false), f7, z11);
            if (this.f8271b == -1 && !Q.e(v11)) {
                this.f8271b = (int) (v11 >> 32);
            }
            if (Q.i(v11)) {
                v11 = S.a((int) (4294967295L & v11), (int) (v11 >> 32));
            }
            c2990k.f8251a.t(v11);
            c2990k.i0(P.Selection);
            return v11;
        }

        @Override // I0.r
        public final boolean a(long j11, @NotNull I0.F f7) {
            C2990k c2990k = C2990k.this;
            if (!c2990k.f8254d || c2990k.f8251a.j().length() == 0) {
                return false;
            }
            c2990k.Z(a.Mouse);
            this.f8270a.invoke();
            c2990k.f8268r = -1;
            this.f8271b = -1;
            this.f8272c = j11;
            this.f8271b = (int) (d(j11, f7, true) >> 32);
            return true;
        }

        @Override // I0.r
        public final void b() {
            C2990k.this.Z(a.None);
        }

        @Override // I0.r
        public final boolean c(long j11, @NotNull I0.F f7) {
            C2990k c2990k = C2990k.this;
            if (!c2990k.f8254d || c2990k.f8251a.j().length() == 0) {
                return false;
            }
            new a(j11);
            d(j11, f7, false);
            return true;
        }
    }

    /* renamed from: F0.k$c */
    private final class c implements InterfaceC2477h1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function0<Unit> f8275a;

        /* renamed from: b, reason: collision with root package name */
        private int f8276b = -1;

        /* renamed from: c, reason: collision with root package name */
        private long f8277c = 9205357640488583168L;

        /* renamed from: d, reason: collision with root package name */
        private long f8278d = 0;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private EnumC2526y0 f8279e = EnumC2526y0.SelectionEnd;

        /* renamed from: F0.k$c$a */
        static final class a extends AbstractC7737t implements Function0<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f8281b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j11) {
                super(0);
                this.f8281b = j11;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Touch.onDrag at " + ((Object) C7459e.m(this.f8281b));
            }
        }

        /* renamed from: F0.k$c$b */
        static final class b extends AbstractC7737t implements Function0<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f8282b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j11) {
                super(0);
                this.f8282b = j11;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Touch.onDragStart after longPress at " + ((Object) C7459e.m(this.f8282b));
            }
        }

        public c(@NotNull Function0<Unit> function0) {
            this.f8275a = function0;
        }

        private final void e() {
            if (P9.a.d(this.f8277c)) {
                C2990k c2990k = C2990k.this;
                c2990k.A();
                this.f8276b = -1;
                this.f8277c = 9205357640488583168L;
                this.f8278d = 0L;
                c2990k.f8268r = -1;
                c2990k.Z(a.None);
                this.f8275a.invoke();
            }
        }

        @Override // B0.InterfaceC2477h1
        public final void a() {
        }

        @Override // B0.InterfaceC2477h1
        public final void b(long j11) {
            int intValue;
            I0.F f7;
            int i11;
            C2990k c2990k = C2990k.this;
            if (!c2990k.f8254d || c2990k.f8251a.j().length() == 0) {
                return;
            }
            long k11 = C7459e.k(this.f8278d, j11);
            this.f8278d = k11;
            long k12 = C7459e.k(this.f8277c, k11);
            new a(k12);
            if (this.f8276b >= 0 || c2990k.f8252b.j(k12)) {
                int i12 = this.f8276b;
                Integer valueOf = Integer.valueOf(i12);
                if (i12 < 0) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : c2990k.f8252b.h(this.f8277c, false);
                int h11 = c2990k.f8252b.h(k12, false);
                if (this.f8276b < 0 && intValue == h11) {
                    return;
                }
                I0.F f11 = F.a.f();
                c2990k.i0(P.Selection);
                f7 = f11;
                i11 = h11;
            } else {
                int h12 = c2990k.f8252b.h(this.f8277c, true);
                int h13 = c2990k.f8252b.h(k12, true);
                f7 = h12 == h13 ? F.a.d() : F.a.f();
                i11 = h13;
                intValue = h12;
            }
            long d11 = c2990k.f8251a.j().d();
            long h02 = C2990k.h0(c2990k, c2990k.f8251a.j(), intValue, i11, false, f7, 64);
            if (this.f8276b == -1 && !Q.e(h02)) {
                this.f8276b = (int) (h02 >> 32);
            }
            if (Q.i(h02)) {
                h02 = S.a((int) (h02 & 4294967295L), (int) (h02 >> 32));
            }
            if (!Q.d(h02, d11)) {
                int i13 = (int) (h02 >> 32);
                int i14 = (int) (d11 >> 32);
                this.f8279e = (i13 == i14 || ((int) (h02 & 4294967295L)) != ((int) (d11 & 4294967295L))) ? (i13 != i14 || ((int) (h02 & 4294967295L)) == ((int) (d11 & 4294967295L))) ? ((float) (i13 + ((int) (h02 & 4294967295L)))) / 2.0f > ((float) (i14 + ((int) (4294967295L & d11)))) / 2.0f ? EnumC2526y0.SelectionEnd : EnumC2526y0.SelectionStart : EnumC2526y0.SelectionEnd : EnumC2526y0.SelectionStart;
            }
            if (Q.e(d11) || !Q.e(h02)) {
                c2990k.f8251a.t(h02);
            }
            c2990k.f0(this.f8279e, k12);
        }

        @Override // B0.InterfaceC2477h1
        public final void c(long j11) {
            long j12;
            C2990k c2990k = C2990k.this;
            if (c2990k.f8254d) {
                new b(j11);
                c2990k.f0(this.f8279e, j11);
                C2990k.s(c2990k, false);
                c2990k.Z(a.Touch);
                this.f8277c = j11;
                this.f8278d = 0L;
                c2990k.f8268r = -1;
                if (c2990k.f8252b.j(j11)) {
                    if (c2990k.f8251a.j().length() == 0) {
                        return;
                    }
                    int h11 = c2990k.f8252b.h(j11, true);
                    D0.a j13 = c2990k.f8251a.j();
                    j12 = Q.f15009b;
                    long h02 = C2990k.h0(c2990k, new D0.a(j13, j12, (Q) null, 12), h11, h11, false, F.a.f(), 96);
                    c2990k.f8251a.t(h02);
                    c2990k.i0(P.Selection);
                    this.f8276b = (int) (h02 >> 32);
                    return;
                }
                int h12 = c2990k.f8252b.h(j11, true);
                InterfaceC9723a interfaceC9723a = c2990k.f8256f;
                if (interfaceC9723a != null) {
                    interfaceC9723a.a(9);
                }
                c1 c1Var = c2990k.f8251a;
                c1Var.getClass();
                c1Var.t(S.a(h12, h12));
                C2990k.s(c2990k, true);
                c2990k.i0(P.Cursor);
            }
        }

        @Override // B0.InterfaceC2477h1
        public final void d() {
        }

        @Override // B0.InterfaceC2477h1
        public final void onCancel() {
            e();
        }

        @Override // B0.InterfaceC2477h1
        public final void onStop() {
            e();
        }
    }

    /* renamed from: F0.k$d */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8283a;

        static {
            int[] iArr = new int[EnumC2911a0.values().length];
            try {
                iArr[EnumC2911a0.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2911a0.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2911a0.Insertion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2911a0.Replacement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8283a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", f = "TextFieldSelectionState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: F0.k$e */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super B0>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f8284d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ x1.F f8286f;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", f = "TextFieldSelectionState.kt", l = {368}, m = "invokeSuspend")
        /* renamed from: F0.k$e$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f8287d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C2990k f8288e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ x1.F f8289f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2990k c2990k, kotlin.coroutines.d dVar, x1.F f7) {
                super(2, dVar);
                this.f8288e = c2990k;
                this.f8289f = f7;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f8288e, dVar, this.f8289f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f8287d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f8287d = 1;
                    if (this.f8288e.I(this.f8289f, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", f = "TextFieldSelectionState.kt", l = {371}, m = "invokeSuspend")
        /* renamed from: F0.k$e$b */
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f8290d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C2990k f8291e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ x1.F f8292f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C2990k c2990k, kotlin.coroutines.d dVar, x1.F f7) {
                super(2, dVar);
                this.f8291e = c2990k;
                this.f8292f = f7;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new b(this.f8291e, dVar, this.f8292f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f8290d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f8290d = 1;
                    if (C2990k.a(this.f8291e, this.f8292f, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", f = "TextFieldSelectionState.kt", l = {374}, m = "invokeSuspend")
        /* renamed from: F0.k$e$c */
        static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f8293d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ x1.F f8294e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C2990k f8295f;

            /* renamed from: F0.k$e$c$a */
            static final class a extends AbstractC7737t implements Function1<C7459e, Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C2990k f8296b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C2990k c2990k) {
                    super(1);
                    this.f8296b = c2990k;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(C7459e c7459e) {
                    c7459e.getClass();
                    C2990k c2990k = this.f8296b;
                    P m11 = C2990k.m(c2990k);
                    P p11 = P.Cursor;
                    if (m11 == p11) {
                        p11 = P.None;
                    }
                    C2990k.t(c2990k, p11);
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C2990k c2990k, kotlin.coroutines.d dVar, x1.F f7) {
                super(2, dVar);
                this.f8294e = f7;
                this.f8295f = c2990k;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new c(this.f8295f, dVar, this.f8294e);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Object f7;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f8293d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    a aVar2 = new a(this.f8295f);
                    this.f8293d = 1;
                    f7 = C9115P.f(C9115P.f82441a, this, null, (r12 & 2) != 0 ? null : null, (r12 & 8) != 0 ? null : aVar2, this.f8294e);
                    if (f7 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(kotlin.coroutines.d dVar, x1.F f7) {
            super(2, dVar);
            this.f8286f = f7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            e eVar = C2990k.this.new e(dVar, this.f8286f);
            eVar.f8284d = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super B0> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            xe.M m11 = (xe.M) this.f8284d;
            xe.O o11 = xe.O.UNDISPATCHED;
            C2990k c2990k = C2990k.this;
            x1.F f7 = this.f8286f;
            C10727i.c(m11, null, o11, new a(c2990k, null, f7), 1);
            C10727i.c(m11, null, o11, new b(c2990k, null, f7), 1);
            return C10727i.c(m11, null, o11, new c(c2990k, null, f7), 1);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2", f = "TextFieldSelectionState.kt", l = {491}, m = "invokeSuspend")
    /* renamed from: F0.k$f */
    static final class f extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC9143w, C7459e, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f8297d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC9143w f8298e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ long f8299f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ t0.q f8300g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C2990k f8301h;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1", f = "TextFieldSelectionState.kt", l = {504, 511}, m = "invokeSuspend")
        /* renamed from: F0.k$f$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f8302d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f8303e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC9143w f8304f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C2990k f8305g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ long f8306h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ t0.q f8307i;

            @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1$1$1", f = "TextFieldSelectionState.kt", l = {496, 501}, m = "invokeSuspend")
            /* renamed from: F0.k$f$a$a, reason: collision with other inner class name */
            static final class C0182a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                Object f8308d;

                /* renamed from: e, reason: collision with root package name */
                int f8309e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C2990k f8310f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ long f8311g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ t0.q f8312h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0182a(C2990k c2990k, long j11, t0.q qVar, kotlin.coroutines.d<? super C0182a> dVar) {
                    super(2, dVar);
                    this.f8310f = c2990k;
                    this.f8311g = j11;
                    this.f8312h = qVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                    return new C0182a(this.f8310f, this.f8311g, this.f8312h, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0182a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(@NotNull Object obj) {
                    C2990k c2990k;
                    s.b bVar;
                    s.b bVar2;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f8309e;
                    t0.q qVar = this.f8312h;
                    C2990k c2990k2 = this.f8310f;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        s.b bVar3 = c2990k2.f8269s;
                        if (bVar3 != null) {
                            s.a aVar2 = new s.a(bVar3);
                            this.f8308d = c2990k2;
                            this.f8309e = 1;
                            if (qVar.emit(aVar2, this) != aVar) {
                                c2990k = c2990k2;
                            }
                            return aVar;
                        }
                        bVar = new s.b(this.f8311g);
                        this.f8308d = bVar;
                        this.f8309e = 2;
                        if (qVar.emit(bVar, this) != aVar) {
                            bVar2 = bVar;
                            c2990k2.f8269s = bVar2;
                            return Unit.f71690a;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (s.b) this.f8308d;
                        Sc.s.b(obj);
                        c2990k2.f8269s = bVar2;
                        return Unit.f71690a;
                    }
                    c2990k = (C2990k) this.f8308d;
                    Sc.s.b(obj);
                    c2990k.f8269s = null;
                    bVar = new s.b(this.f8311g);
                    this.f8308d = bVar;
                    this.f8309e = 2;
                    if (qVar.emit(bVar, this) != aVar) {
                    }
                    return aVar;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC9143w interfaceC9143w, C2990k c2990k, long j11, t0.q qVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f8304f = interfaceC9143w;
                this.f8305g = c2990k;
                this.f8306h = j11;
                this.f8307i = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f8304f, this.f8305g, this.f8306h, this.f8307i, dVar);
                aVar.f8303e = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
            
                if (r12.f8307i.emit(r13, r12) == r0) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
            
                if (r13 == r0) goto L20;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f8302d;
                C2990k c2990k = this.f8305g;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C10727i.c((xe.M) this.f8303e, null, null, new C0182a(this.f8305g, this.f8306h, this.f8307i, null), 3);
                    this.f8302d = 1;
                    obj = this.f8304f.M0(this);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        c2990k.f8269s = null;
                        return Unit.f71690a;
                    }
                    Sc.s.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                s.b bVar = c2990k.f8269s;
                if (bVar != null) {
                    t0.n cVar = booleanValue ? new s.c(bVar) : new s.a(bVar);
                    this.f8302d = 2;
                }
                c2990k.f8269s = null;
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(t0.q qVar, C2990k c2990k, kotlin.coroutines.d<? super f> dVar) {
            super(3, dVar);
            this.f8300g = qVar;
            this.f8301h = c2990k;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC9143w interfaceC9143w, C7459e c7459e, kotlin.coroutines.d<? super Unit> dVar) {
            long n11 = c7459e.n();
            f fVar = new f(this.f8300g, this.f8301h, dVar);
            fVar.f8298e = interfaceC9143w;
            fVar.f8299f = n11;
            return fVar.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f8297d;
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC9143w interfaceC9143w = this.f8298e;
                long j11 = this.f8299f;
                t0.q qVar = this.f8300g;
                if (qVar != null) {
                    a aVar2 = new a(interfaceC9143w, this.f8301h, j11, qVar, null);
                    this.f8297d = 1;
                    if (xe.N.d(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: F0.k$g */
    static final class g extends AbstractC7737t implements Function1<C7459e, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f8313b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2990k f8314c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f8315d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function0<Unit> function0, C2990k c2990k, Function0<Unit> function02) {
            super(1);
            this.f8313b = function0;
            this.f8314c = c2990k;
            this.f8315d = function02;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7459e c7459e) {
            long n11 = c7459e.n();
            this.f8313b.invoke();
            C2990k c2990k = this.f8314c;
            if (c2990k.f8254d && c2990k.T()) {
                this.f8315d.invoke();
                if (c2990k.f8251a.j().length() > 0) {
                    C2990k.s(c2990k, true);
                }
                c2990k.i0(P.None);
                C2990k.p(c2990k, a1.b(c2990k.f8252b, c2990k.f8252b.b(n11)));
            }
            return Unit.f71690a;
        }
    }

    public C2990k(@NotNull c1 c1Var, @NotNull Z0 z02, @NotNull Z1.d dVar, boolean z11, boolean z12) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        C3991w0 f13;
        C3991w0 f14;
        C3991w0 f15;
        C3991w0 f16;
        this.f8251a = c1Var;
        this.f8252b = z02;
        this.f8253c = dVar;
        this.f8254d = z11;
        this.f8255e = z12;
        f7 = n1.f(Boolean.TRUE, D1.f25195a);
        this.f8259i = f7;
        f11 = n1.f(C7459e.a(9205357640488583168L), D1.f25195a);
        this.f8261k = f11;
        f12 = n1.f(C7459e.a(9205357640488583168L), D1.f25195a);
        this.f8262l = f12;
        f13 = n1.f(null, D1.f25195a);
        this.f8263m = f13;
        f14 = n1.f(a.None, D1.f25195a);
        this.f8264n = f14;
        f15 = n1.f(Boolean.FALSE, D1.f25195a);
        this.f8265o = f15;
        f16 = n1.f(P.None, D1.f25195a);
        this.f8266p = f16;
        this.f8268r = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(C2990k c2990k, kotlin.jvm.internal.L l11, kotlin.jvm.internal.L l12) {
        if (P9.a.d(l11.f71786a)) {
            l11.f71786a = 9205357640488583168L;
            l12.f71786a = 9205357640488583168L;
            c2990k.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(C2990k c2990k, kotlin.jvm.internal.L l11, kotlin.jvm.internal.L l12) {
        if (P9.a.d(l11.f71786a)) {
            c2990k.A();
            l11.f71786a = 9205357640488583168L;
            l12.f71786a = 0L;
            c2990k.f8268r = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long P(boolean z11) {
        long j11;
        K1.K f7 = this.f8252b.f();
        if (f7 == null) {
            return 0L;
        }
        long d11 = this.f8251a.j().d();
        if (z11) {
            int i11 = Q.f15010c;
            j11 = d11 >> 32;
        } else {
            int i12 = Q.f15010c;
            j11 = 4294967295L & d11;
        }
        return l1.a(f7, (int) j11, z11, Q.i(d11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B1.B R() {
        B1.B i11 = this.f8252b.i();
        if (i11 == null || !i11.I()) {
            return null;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        S1 s12;
        S1 s13 = this.f8257g;
        if ((s13 != null ? s13.getStatus() : null) != U1.Shown || (s12 = this.f8257g) == null) {
            return;
        }
        s12.hide();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C2990k c2990k, x1.F f7, kotlin.coroutines.jvm.internal.c cVar) {
        C2991l c2991l;
        int i11;
        Throwable th2;
        kotlin.jvm.internal.L l11;
        C2990k c2990k2;
        kotlin.jvm.internal.L l12;
        c2990k.getClass();
        if (cVar instanceof C2991l) {
            c2991l = (C2991l) cVar;
            int i12 = c2991l.f8321i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c2991l.f8321i = i12 - LinearLayoutManager.INVALID_OFFSET;
                C2991l c2991l2 = c2991l;
                Object obj = c2991l2.f8319g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c2991l2.f8321i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.L l13 = new kotlin.jvm.internal.L();
                    l13.f71786a = 9205357640488583168L;
                    kotlin.jvm.internal.L l14 = new kotlin.jvm.internal.L();
                    l14.f71786a = 9205357640488583168L;
                    try {
                        C2992m c2992m = new C2992m(c2990k, l13, l14);
                        C2993n c2993n = new C2993n(c2990k, l13, l14);
                        C2994o c2994o = new C2994o(c2990k, l13, l14);
                        C2995p c2995p = new C2995p(c2990k, l14, l13);
                        c2991l2.f8316d = c2990k;
                        c2991l2.f8317e = l13;
                        c2991l2.f8318f = l14;
                        c2991l2.f8321i = 1;
                        if (C5177u.f(f7, c2992m, c2993n, c2994o, c2995p, c2991l2) == aVar) {
                            return aVar;
                        }
                        c2990k2 = c2990k;
                        l11 = l13;
                        l12 = l14;
                    } catch (Throwable th3) {
                        th2 = th3;
                        l11 = l13;
                        c2990k2 = c2990k;
                        l12 = l14;
                        F(c2990k2, l11, l12);
                        throw th2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l12 = c2991l2.f8318f;
                    l11 = c2991l2.f8317e;
                    c2990k2 = c2991l2.f8316d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        F(c2990k2, l11, l12);
                        throw th2;
                    }
                }
                F(c2990k2, l11, l12);
                return Unit.f71690a;
            }
        }
        c2991l = new C2991l(c2990k, cVar);
        C2991l c2991l22 = c2991l;
        Object obj2 = c2991l22.f8319g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c2991l22.f8321i;
        if (i11 != 0) {
        }
        F(c2990k2, l11, l12);
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C2990k c2990k, x1.F f7, boolean z11, kotlin.coroutines.jvm.internal.c cVar) {
        q qVar;
        int i11;
        EnumC2526y0 enumC2526y0;
        kotlin.jvm.internal.L l11;
        kotlin.jvm.internal.L l12;
        c2990k.getClass();
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i12 = qVar.f8340j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                qVar.f8340j = i12 - LinearLayoutManager.INVALID_OFFSET;
                q qVar2 = qVar;
                Object obj = qVar2.f8338h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = qVar2.f8340j;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.L l13 = new kotlin.jvm.internal.L();
                    l13.f71786a = 9205357640488583168L;
                    kotlin.jvm.internal.L l14 = new kotlin.jvm.internal.L();
                    l14.f71786a = 0L;
                    enumC2526y0 = z11 ? EnumC2526y0.SelectionStart : EnumC2526y0.SelectionEnd;
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        r rVar = new r(enumC2526y0, c2990k, l13, l14, z11);
                        l13 = l13;
                        l14 = l14;
                        s sVar = new s(c2990k, l13, l14);
                        t tVar = new t(c2990k, l13, l14);
                        u uVar = new u(enumC2526y0, c2990k, l14, l13, z11);
                        qVar2.f8334d = c2990k;
                        qVar2.f8335e = l13;
                        qVar2.f8336f = l14;
                        qVar2.f8337g = enumC2526y0;
                        qVar2.f8340j = 1;
                        if (C5177u.f(f7, rVar, sVar, tVar, uVar, qVar2) == aVar) {
                            return aVar;
                        }
                        l11 = l14;
                        l12 = l13;
                    } catch (Throwable th3) {
                        th = th3;
                        l13 = l13;
                        l14 = l14;
                        l11 = l14;
                        l12 = l13;
                        new v(c2990k, enumC2526y0);
                        if (c2990k.N() == enumC2526y0) {
                            G(c2990k, l12, l11);
                        }
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    EnumC2526y0 enumC2526y02 = qVar2.f8337g;
                    l11 = qVar2.f8336f;
                    l12 = qVar2.f8335e;
                    C2990k c2990k2 = qVar2.f8334d;
                    try {
                        Sc.s.b(obj);
                        enumC2526y0 = enumC2526y02;
                        c2990k = c2990k2;
                    } catch (Throwable th4) {
                        th = th4;
                        enumC2526y0 = enumC2526y02;
                        c2990k = c2990k2;
                        new v(c2990k, enumC2526y0);
                        if (c2990k.N() == enumC2526y0) {
                        }
                        throw th;
                    }
                }
                new v(c2990k, enumC2526y0);
                if (c2990k.N() == enumC2526y0) {
                    G(c2990k, l12, l11);
                }
                return Unit.f71690a;
            }
        }
        qVar = new q(c2990k, cVar);
        q qVar22 = qVar;
        Object obj2 = qVar22.f8338h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = qVar22.f8340j;
        if (i11 != 0) {
        }
        new v(c2990k, enumC2526y0);
        if (c2990k.N() == enumC2526y0) {
        }
        return Unit.f71690a;
    }

    public static final C7460f e(C2990k c2990k) {
        float f7;
        D0.a j11 = c2990k.f8251a.j();
        if (Q.e(j11.d())) {
            C7460f L11 = c2990k.L();
            B1.B R11 = c2990k.R();
            return C7461g.a(R11 != null ? R11.y(L11.s()) : 0L, L11.p());
        }
        B1.B R12 = c2990k.R();
        long y11 = R12 != null ? R12.y(c2990k.P(true)) : 0L;
        B1.B R13 = c2990k.R();
        long y12 = R13 != null ? R13.y(c2990k.P(false)) : 0L;
        B1.B R14 = c2990k.R();
        Z0 z02 = c2990k.f8252b;
        float f11 = 0.0f;
        if (R14 != null) {
            K1.K f12 = z02.f();
            f7 = C7459e.h(R14.y(P9.a.a(0.0f, f12 != null ? f12.e((int) (j11.d() >> 32)).q() : 0.0f)));
        } else {
            f7 = 0.0f;
        }
        B1.B R15 = c2990k.R();
        if (R15 != null) {
            K1.K f13 = z02.f();
            f11 = C7459e.h(R15.y(P9.a.a(0.0f, f13 != null ? f13.e((int) (j11.d() & 4294967295L)).q() : 0.0f)));
        }
        return new C7460f(Math.min(C7459e.g(y11), C7459e.g(y12)), Math.min(f7, f11), Math.max(C7459e.g(y11), C7459e.g(y12)), Math.max(C7459e.h(y11), C7459e.h(y12)));
    }

    private final long g0(D0.a aVar, int i11, int i12, boolean z11, I0.F f7, boolean z12, boolean z13) {
        long j11;
        InterfaceC9723a interfaceC9723a;
        Q b11 = Q.b(aVar.d());
        long k11 = b11.k();
        if (z13 || (!z12 && Q.e(k11))) {
            b11 = null;
        }
        K1.K f11 = this.f8252b.f();
        boolean z14 = false;
        if (f11 == null) {
            j11 = Q.f15009b;
        } else if (b11 == null && f7.equals(F.a.b())) {
            j11 = S.a(i11, i12);
        } else {
            InterfaceC3198n0 c11 = C3202p0.c(f11, i11, i12, this.f8268r, b11 != null ? b11.k() : Q.f15009b, b11 == null, z11);
            if (b11 == null || c11.d(this.f8267q)) {
                long f12 = f7.a(c11).f();
                this.f8267q = c11;
                if (!z11) {
                    i11 = i12;
                }
                this.f8268r = i11;
                j11 = f12;
            } else {
                j11 = b11.k();
            }
        }
        if (!Q.d(j11, aVar.d())) {
            if (Q.i(j11) != Q.i(aVar.d()) && Q.d(S.a((int) (4294967295L & j11), (int) (j11 >> 32)), aVar.d())) {
                z14 = true;
            }
            if (U() && !z14 && (interfaceC9723a = this.f8256f) != null) {
                interfaceC9723a.a(9);
            }
        }
        return j11;
    }

    static /* synthetic */ long h0(C2990k c2990k, D0.a aVar, int i11, int i12, boolean z11, I0.F f7, int i13) {
        return c2990k.g0(aVar, i11, i12, z11, f7, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final P m(C2990k c2990k) {
        return (P) c2990k.f8266p.getValue();
    }

    public static final void o(C2990k c2990k) {
        B1.B R11 = c2990k.R();
        c2990k.f8261k.setValue(C7459e.a(R11 != null ? R11.u(0L) : 9205357640488583168L));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean p(C2990k c2990k, long j11) {
        int w11;
        boolean z11;
        char c11;
        long j12;
        long a11;
        K1.K f7 = c2990k.f8252b.f();
        if (f7 == null || (w11 = f7.w(j11)) == -1) {
            return false;
        }
        c1 c1Var = c2990k.f8251a;
        long l11 = c1Var.l(w11);
        long n11 = c1Var.n(l11);
        int i11 = d.f8283a[((Q.e(l11) && Q.e(n11)) ? EnumC2911a0.Untransformed : (Q.e(l11) || Q.e(n11)) ? (!Q.e(l11) || Q.e(n11)) ? EnumC2911a0.Deletion : EnumC2911a0.Insertion : EnumC2911a0.Replacement).ordinal()];
        C2948t0 c2948t0 = null;
        if (i11 == 1 || i11 == 2) {
            z11 = true;
            c11 = ' ';
        } else if (i11 == 3) {
            z11 = true;
            c11 = ' ';
            c2948t0 = C2939o0.b(j11, f7.e((int) (n11 >> 32)), f7.e((int) (n11 & 4294967295L))) < 0 ? new C2948t0(g1.Start) : new C2948t0(g1.End);
        } else {
            if (i11 != 4) {
                throw new Sc.o();
            }
            z11 = true;
            c11 = ' ';
            if (C2939o0.b(j11, f7.e((int) (n11 >> 32)), f7.e((int) (n11 & 4294967295L))) >= 0) {
                j12 = l11 & 4294967295L;
                int i12 = (int) j12;
                a11 = S.a(i12, i12);
                if (!Q.d(a11, c1Var.i().d()) && (c2948t0 == null || c2948t0.equals(c1Var.h()))) {
                    return false;
                }
                c1Var.u(a11);
                if (c2948t0 != null) {
                    c1Var.v(c2948t0);
                }
                return z11;
            }
        }
        j12 = l11 >> c11;
        int i122 = (int) j12;
        a11 = S.a(i122, i122);
        if (!Q.d(a11, c1Var.i().d())) {
        }
        c1Var.u(a11);
        if (c2948t0 != null) {
        }
        return z11;
    }

    public static final void s(C2990k c2990k, boolean z11) {
        c2990k.f8265o.setValue(Boolean.valueOf(z11));
    }

    public static final void t(C2990k c2990k, P p11) {
        c2990k.f8266p.setValue(p11);
    }

    public static final void u(C2990k c2990k, C7460f c7460f) {
        S1 s12 = c2990k.f8257g;
        if (s12 != null) {
            boolean w11 = c2990k.w();
            P p11 = P.None;
            s12.a(c7460f, !w11 ? null : new F(c2990k, p11, c2990k), !c2990k.y() ? null : new G(c2990k, p11, c2990k), !c2990k.x() ? null : new H(c2990k, p11, c2990k), c2990k.z() ? new I(c2990k, P.Selection, c2990k) : null);
        }
    }

    public static final /* synthetic */ long v(C2990k c2990k, D0.a aVar, int i11, int i12, I0.F f7, boolean z11) {
        return c2990k.g0(aVar, i11, i12, false, f7, false, z11);
    }

    public final void A() {
        this.f8263m.setValue(null);
        this.f8262l.setValue(C7459e.a(9205357640488583168L));
        this.f8261k.setValue(C7459e.a(9205357640488583168L));
    }

    public final void B(boolean z11) {
        c1 c1Var = this.f8251a;
        D0.a j11 = c1Var.j();
        if (Q.e(j11.d())) {
            return;
        }
        I0 i02 = this.f8258h;
        if (i02 != null) {
            i02.c(new C3422b(6, j11.subSequence(Q.h(j11.d()), Q.g(j11.d())).toString(), null));
        }
        if (z11) {
            c1Var.d();
        }
    }

    public final Object C(@NotNull x1.F f7, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object d11 = xe.N.d(new e(null, f7), dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public final void D() {
        c1 c1Var = this.f8251a;
        D0.a j11 = c1Var.j();
        if (Q.e(j11.d())) {
            return;
        }
        I0 i02 = this.f8258h;
        if (i02 != null) {
            i02.c(new C3422b(6, j11.subSequence(Q.h(j11.d()), Q.g(j11.d())).toString(), null));
        }
        c1Var.f();
    }

    public final void E() {
        c1 c1Var = this.f8251a;
        if (!Q.e(c1Var.j().d())) {
            c1Var.c();
        }
        this.f8265o.setValue(Boolean.FALSE);
        this.f8266p.setValue(P.None);
    }

    public final Object H(@NotNull x1.F f7, t0.q qVar, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object e11 = C9115P.e(f7, new f(qVar, this, null), new g(function0, this, function02), (kotlin.coroutines.jvm.internal.j) dVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }

    public final Object I(@NotNull x1.F f7, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object N02 = f7.N0(new w(this, null), jVar);
        return N02 == Wc.a.COROUTINE_SUSPENDED ? N02 : Unit.f71690a;
    }

    public final void J() {
        S();
        this.f8257g = null;
        this.f8258h = null;
        this.f8256f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if ((r0 != null ? I0.B0.c(r6, I0.B0.f(r0)) : false) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2983d K(boolean z11) {
        C2983d c2983d;
        D0.a j11 = this.f8251a.j();
        boolean booleanValue = ((Boolean) this.f8265o.getValue()).booleanValue();
        boolean z12 = true;
        boolean z13 = M() == a.None;
        EnumC2526y0 N11 = N();
        if (booleanValue && z13 && Q.e(j11.d()) && j11.f() && j11.length() > 0) {
            if (N11 != EnumC2526y0.Cursor) {
                AbstractC5715f a11 = AbstractC5715f.a.a();
                Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
                AbstractC5715f b11 = AbstractC5715f.a.b(a11);
                try {
                    long i11 = L().i();
                    AbstractC5715f.a.d(a11, b11, h11);
                    B1.B R11 = R();
                } catch (Throwable th2) {
                    AbstractC5715f.a.d(a11, b11, h11);
                    throw th2;
                }
            }
            if (!z12) {
                return new C2983d(true, z11 ? L().i() : 9205357640488583168L, V1.g.Ltr, false);
            }
            c2983d = C2983d.f8217e;
            return c2983d;
        }
        z12 = false;
        if (!z12) {
        }
    }

    @NotNull
    public final C7460f L() {
        float o11;
        C7460f c7460f;
        C7460f c7460f2;
        K1.K f7 = this.f8252b.f();
        if (f7 == null) {
            c7460f2 = C7460f.f70279e;
            return c7460f2;
        }
        D0.a j11 = this.f8251a.j();
        if (!Q.e(j11.d())) {
            c7460f = C7460f.f70279e;
            return c7460f;
        }
        C7460f e11 = f7.e((int) (j11.d() >> 32));
        float v12 = this.f8253c.v1(C2489l1.a());
        if (f7.k().d() == Z1.s.Ltr) {
            o11 = (v12 / 2) + e11.n();
        } else {
            o11 = e11.o() - (v12 / 2);
        }
        float f11 = v12 / 2;
        float A11 = ((int) (f7.A() >> 32)) - f11;
        if (o11 > A11) {
            o11 = A11;
        }
        if (o11 < f11) {
            o11 = f11;
        }
        return new C7460f(o11 - f11, e11.q(), o11 + f11, e11.h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final a M() {
        return (a) this.f8264n.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC2526y0 N() {
        return (EnumC2526y0) this.f8263m.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long O() {
        C3991w0 c3991w0 = this.f8262l;
        if (P9.a.e(((C7459e) c3991w0.getValue()).n())) {
            return 9205357640488583168L;
        }
        C3991w0 c3991w02 = this.f8261k;
        if (P9.a.e(((C7459e) c3991w02.getValue()).n())) {
            return a1.b(this.f8252b, ((C7459e) c3991w0.getValue()).n());
        }
        long n11 = ((C7459e) c3991w0.getValue()).n();
        long n12 = ((C7459e) c3991w02.getValue()).n();
        B1.B R11 = R();
        return C7459e.k(n11, C7459e.j(n12, R11 != null ? R11.u(0L) : 9205357640488583168L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if ((r0 != null ? I0.B0.c(r5, I0.B0.f(r0)) : false) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2983d Q(boolean z11, boolean z12) {
        boolean z13;
        C2983d c2983d;
        C2983d c2983d2;
        C2983d c2983d3;
        C2983d c2983d4;
        EnumC2526y0 enumC2526y0 = z11 ? EnumC2526y0.SelectionStart : EnumC2526y0.SelectionEnd;
        K1.K f7 = this.f8252b.f();
        if (f7 == null) {
            c2983d4 = C2983d.f8217e;
            return c2983d4;
        }
        c1 c1Var = this.f8251a;
        long d11 = c1Var.j().d();
        if (Q.e(d11)) {
            c2983d3 = C2983d.f8217e;
            return c2983d3;
        }
        long P11 = P(z11);
        if (M() == a.None) {
            if (N() != enumC2526y0) {
                B1.B R11 = R();
            }
            z13 = true;
            if (z13) {
                c2983d2 = C2983d.f8217e;
                return c2983d2;
            }
            if (!c1Var.j().f()) {
                c2983d = C2983d.f8217e;
                return c2983d;
            }
            V1.g c11 = f7.c(z11 ? (int) (d11 >> 32) : Math.max(((int) (4294967295L & d11)) - 1, 0));
            boolean i11 = Q.i(d11);
            if (z12) {
                B1.B R12 = R();
                if (R12 != null) {
                    P11 = a1.a(P11, I0.B0.f(R12));
                }
            } else {
                P11 = 9205357640488583168L;
            }
            return new C2983d(true, P11, c11, i11);
        }
        z13 = false;
        if (z13) {
        }
    }

    public final boolean T() {
        return this.f8255e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean U() {
        return ((Boolean) this.f8259i.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object V(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        x xVar;
        int i11;
        C2990k c2990k;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i12 = xVar.f8365g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                xVar.f8365g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = xVar.f8363e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = xVar.f8365g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    try {
                        y yVar = new y(this, null);
                        xVar.f8362d = this;
                        xVar.f8365g = 1;
                        if (xe.N.d(yVar, xVar) == aVar) {
                            return aVar;
                        }
                        c2990k = this;
                    } catch (Throwable th2) {
                        th = th2;
                        c2990k = this;
                        c2990k.f8265o.setValue(Boolean.FALSE);
                        if (((P) c2990k.f8266p.getValue()) != P.None) {
                            c2990k.S();
                        }
                        throw th;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2990k = xVar.f8362d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        c2990k.f8265o.setValue(Boolean.FALSE);
                        if (((P) c2990k.f8266p.getValue()) != P.None) {
                        }
                        throw th;
                    }
                }
                c2990k.f8265o.setValue(Boolean.FALSE);
                if (((P) c2990k.f8266p.getValue()) != P.None) {
                    c2990k.S();
                }
                return Unit.f71690a;
            }
        }
        xVar = new x(this, cVar);
        Object obj2 = xVar.f8363e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = xVar.f8365g;
        if (i11 != 0) {
        }
        c2990k.f8265o.setValue(Boolean.FALSE);
        if (((P) c2990k.f8266p.getValue()) != P.None) {
        }
        return Unit.f71690a;
    }

    public final void W() {
        C3422b text;
        String h11;
        AbstractC8823a invoke;
        C3422b text2;
        String h12;
        G0 a11;
        Function0<? extends AbstractC8823a> function0 = this.f8260j;
        c1 c1Var = this.f8251a;
        if (function0 == null || (invoke = function0.invoke()) == null) {
            I0 i02 = this.f8258h;
            if (i02 == null || (text = i02.getText()) == null || (h11 = text.h()) == null) {
                return;
            }
            c1.q(c1Var, h11, G0.c.NeverMerge, 2);
            return;
        }
        I0 i03 = this.f8258h;
        if (i03 != null && (a11 = i03.a()) != null) {
            a11.b();
            invoke.a();
            throw null;
        }
        I0 i04 = this.f8258h;
        if (i04 == null || (text2 = i04.getText()) == null || (h12 = text2.h()) == null) {
            return;
        }
        c1.q(c1Var, h12, G0.c.NeverMerge, 2);
    }

    public final void X() {
        this.f8251a.s();
    }

    public final Object Y(@NotNull x1.F f7, boolean z11, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        Object d11 = xe.N.d(new E(this, null, f7, z11), jVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }

    public final void Z(@NotNull a aVar) {
        this.f8264n.setValue(aVar);
    }

    public final void a0(boolean z11) {
        this.f8255e = z11;
    }

    public final void b0(boolean z11) {
        this.f8259i.setValue(Boolean.valueOf(z11));
    }

    public final void c0(Function0<? extends AbstractC8823a> function0) {
        this.f8260j = function0;
    }

    public final Object d0(@NotNull x1.F f7, @NotNull Function0<Unit> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object k11 = C3176c0.k(f7, new b(function0), new c(function0), dVar);
        return k11 == Wc.a.COROUTINE_SUSPENDED ? k11 : Unit.f71690a;
    }

    public final void e0(@NotNull InterfaceC9723a interfaceC9723a, @NotNull I0 i02, @NotNull S1 s12, @NotNull Z1.d dVar, boolean z11) {
        if (!z11) {
            S();
        }
        this.f8256f = interfaceC9723a;
        this.f8258h = i02;
        this.f8257g = s12;
        this.f8253c = dVar;
        this.f8254d = z11;
    }

    public final void f0(@NotNull EnumC2526y0 enumC2526y0, long j11) {
        this.f8263m.setValue(enumC2526y0);
        this.f8262l.setValue(C7459e.a(j11));
    }

    public final void i0(@NotNull P p11) {
        this.f8266p.setValue(p11);
    }

    public final boolean w() {
        return !Q.e(this.f8251a.j().d());
    }

    public final boolean x() {
        return !Q.e(this.f8251a.j().d()) && this.f8254d;
    }

    public final boolean y() {
        if (!this.f8254d) {
            return false;
        }
        I0 i02 = this.f8258h;
        if (i02 == null || !i02.b()) {
            Function0<? extends AbstractC8823a> function0 = this.f8260j;
            if ((function0 != null ? function0.invoke() : null) == null) {
                return false;
            }
            I0 i03 = this.f8258h;
            if ((i03 != null ? i03.a() : null) == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean z() {
        c1 c1Var = this.f8251a;
        return Q.f(c1Var.j().d()) != c1Var.j().length();
    }
}
