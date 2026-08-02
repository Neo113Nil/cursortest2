package E0;

import Ae.InterfaceC2397i;
import D0.e;
import E0.C2924h;
import Q1.C3848q;
import Sc.C4005g;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.InterfaceC5272o1;
import androidx.compose.ui.platform.InterfaceC5286t1;
import androidx.compose.ui.platform.c2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p0.AbstractC8823a;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", l = {129}, m = "invokeSuspend")
/* renamed from: E0.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2924h extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<?>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f7221d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f7222e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Ae.w0<Unit> f7223f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c1 f7224g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Z0 f7225h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC2945s f7226i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ InterfaceC5286t1 f7227j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Q1.r f7228k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ AbstractC8823a f7229l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Function1<C3848q, Unit> f7230m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ c2 f7231n;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: E0.h$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f7232d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c1 f7233e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2945s f7234f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c1 c1Var, InterfaceC2945s interfaceC2945s, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f7233e = c1Var;
            this.f7234f = interfaceC2945s;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f7233e, this.f7234f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [E0.g] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f7232d;
            if (i11 == 0) {
                Sc.s.b(obj);
                final InterfaceC2945s interfaceC2945s = this.f7234f;
                ?? r42 = new e.a() { // from class: E0.g
                    @Override // D0.e.a
                    public final void a(D0.a aVar2, D0.a aVar3, boolean z11) {
                        long d11 = aVar2.d();
                        long d12 = aVar3.d();
                        K1.Q b11 = aVar2.b();
                        K1.Q b12 = aVar3.b();
                        InterfaceC2945s interfaceC2945s2 = InterfaceC2945s.this;
                        if (z11 && aVar2.b() != null && !aVar2.a(aVar3)) {
                            interfaceC2945s2.b();
                        } else {
                            if (K1.Q.d(d11, d12) && Intrinsics.d(b11, b12)) {
                                return;
                            }
                            interfaceC2945s2.a(K1.Q.h(d12), K1.Q.g(d12), b12 != null ? K1.Q.h(b12.k()) : -1, b12 != null ? K1.Q.g(b12.k()) : -1);
                        }
                    }
                };
                this.f7232d = 1;
                if (this.f7233e.e(r42, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1", f = "AndroidTextInputSession.android.kt", l = {115, 116}, m = "invokeSuspend")
    /* renamed from: E0.h$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f7235d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ae.w0<Unit> f7236e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2945s f7237f;

        /* renamed from: E0.h$b$a */
        static final class a extends AbstractC7737t implements Function1<Long, Unit> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f7238b = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Long l11) {
                l11.longValue();
                return Unit.f71690a;
            }
        }

        /* renamed from: E0.h$b$b, reason: collision with other inner class name */
        static final class C0157b<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2945s f7239a;

            C0157b(InterfaceC2945s interfaceC2945s) {
                this.f7239a = interfaceC2945s;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                this.f7239a.c();
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ae.w0<Unit> w0Var, InterfaceC2945s interfaceC2945s, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f7236e = w0Var;
            this.f7237f = interfaceC2945s;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f7236e, this.f7237f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            if (r4.f7236e.collect(r5, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            if (S0.C3961h0.a(getContext()).v(new S0.C3958g0(E0.C2924h.b.a.f7238b), r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f7235d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f7235d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    throw new C4005g();
                }
                Sc.s.b(obj);
            }
            C0157b c0157b = new C0157b(this.f7237f);
            this.f7235d = 2;
        }
    }

    /* renamed from: E0.h$c */
    static final class c extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f7240b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c1 c1Var) {
            super(0);
            this.f7240b = c1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "createInputConnection(value=\"" + ((Object) this.f7240b.j()) + "\")";
        }
    }

    /* renamed from: E0.h$d */
    public static final class d implements X0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c1 f7241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2945s f7242b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C3848q, Unit> f7243c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC8823a f7244d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ E f7245e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Z0 f7246f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c2 f7247g;

        /* JADX WARN: Multi-variable type inference failed */
        d(c1 c1Var, InterfaceC2945s interfaceC2945s, Function1<? super C3848q, Unit> function1, AbstractC8823a abstractC8823a, E e11, Z0 z02, c2 c2Var) {
            this.f7241a = c1Var;
            this.f7242b = interfaceC2945s;
            this.f7243c = function1;
            this.f7244d = abstractC8823a;
            this.f7245e = e11;
            this.f7246f = z02;
            this.f7247g = c2Var;
        }

        @Override // E0.X0
        public final int a(@NotNull HandwritingGesture handwritingGesture) {
            if (Build.VERSION.SDK_INT < 34) {
                return 2;
            }
            return X.f7124a.k(this.f7241a, handwritingGesture, this.f7246f, this.f7247g);
        }

        @Override // E0.X0
        public final boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
            if (Build.VERSION.SDK_INT >= 34) {
                return X.f7124a.C(this.f7241a, previewableHandwritingGesture, this.f7246f, cancellationSignal);
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C2924h(Ae.w0<Unit> w0Var, c1 c1Var, Z0 z02, InterfaceC2945s interfaceC2945s, InterfaceC5286t1 interfaceC5286t1, Q1.r rVar, AbstractC8823a abstractC8823a, Function1<? super C3848q, Unit> function1, c2 c2Var, kotlin.coroutines.d<? super C2924h> dVar) {
        super(2, dVar);
        this.f7223f = w0Var;
        this.f7224g = c1Var;
        this.f7225h = z02;
        this.f7226i = interfaceC2945s;
        this.f7227j = interfaceC5286t1;
        this.f7228k = rVar;
        this.f7229l = abstractC8823a;
        this.f7230m = function1;
        this.f7231n = c2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C2924h c2924h = new C2924h(this.f7223f, this.f7224g, this.f7225h, this.f7226i, this.f7227j, this.f7228k, this.f7229l, this.f7230m, this.f7231n, dVar);
        c2924h.f7222e = obj;
        return c2924h;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<?> dVar) {
        return ((C2924h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f7221d;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.M m11 = (xe.M) this.f7222e;
            xe.O o11 = xe.O.UNDISPATCHED;
            c1 c1Var = this.f7224g;
            InterfaceC2945s interfaceC2945s = this.f7226i;
            C10727i.c(m11, null, o11, new a(c1Var, interfaceC2945s, null), 1);
            Ae.w0<Unit> w0Var = this.f7223f;
            if (w0Var != null) {
                C10727i.c(m11, null, null, new b(w0Var, interfaceC2945s, null), 3);
            }
            final E e11 = new E(c1Var, this.f7225h, interfaceC2945s, m11);
            final Function1<C3848q, Unit> function1 = this.f7230m;
            final Z0 z02 = this.f7225h;
            final c2 c2Var = this.f7231n;
            final c1 c1Var2 = this.f7224g;
            final Q1.r rVar = this.f7228k;
            final AbstractC8823a abstractC8823a = this.f7229l;
            final InterfaceC2945s interfaceC2945s2 = this.f7226i;
            InterfaceC5272o1 interfaceC5272o1 = new InterfaceC5272o1() { // from class: E0.f
                @Override // androidx.compose.ui.platform.InterfaceC5272o1
                public final InputConnection a(EditorInfo editorInfo) {
                    c1 c1Var3 = c1.this;
                    new C2924h.c(c1Var3);
                    Function1 function12 = function1;
                    E e12 = e11;
                    Z0 z03 = z02;
                    c2 c2Var2 = c2Var;
                    InterfaceC2945s interfaceC2945s3 = interfaceC2945s2;
                    AbstractC8823a abstractC8823a2 = abstractC8823a;
                    C2924h.d dVar = new C2924h.d(c1Var3, interfaceC2945s3, function12, abstractC8823a2, e12, z03, c2Var2);
                    L.a(editorInfo, c1Var3.j(), c1Var3.j().d(), rVar, abstractC8823a2 != null ? C2926i.f7251a : null);
                    return new InputConnectionC2954w0(dVar, editorInfo);
                }
            };
            this.f7221d = 1;
            if (this.f7227j.a(interfaceC5272o1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        throw new C4005g();
    }
}
