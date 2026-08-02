package androidx.compose.ui.platform;

import Ae.InterfaceC2397i;
import De.C2862e;
import S0.C3993x0;
import Sc.C4005g;
import android.view.View;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

/* loaded from: classes.dex */
public final class o2 implements androidx.lifecycle.G {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2862e f40951a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3993x0 f40952b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ S0.L0 f40953c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<C5257j1> f40954d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ View f40955e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40956a;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC5434v.a.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC5434v.a.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC5434v.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f40956a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {396}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40957d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f40958e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<C5257j1> f40959f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ S0.L0 f40960g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.J f40961h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ o2 f40962i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ View f40963j;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {391}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f40964d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Ae.M0<Float> f40965e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C5257j1 f40966f;

            /* renamed from: androidx.compose.ui.platform.o2$b$a$a, reason: collision with other inner class name */
            static final class C0750a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C5257j1 f40967a;

                C0750a(C5257j1 c5257j1) {
                    this.f40967a = c5257j1;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    this.f40967a.a(((Number) obj).floatValue());
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ae.M0<Float> m02, C5257j1 c5257j1, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f40965e = m02;
                this.f40966f = c5257j1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f40965e, this.f40966f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f40964d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C0750a c0750a = new C0750a(this.f40966f);
                    this.f40964d = 1;
                    if (this.f40965e.collect(c0750a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.M<C5257j1> m11, S0.L0 l02, androidx.lifecycle.J j11, o2 o2Var, View view, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f40959f = m11;
            this.f40960g = l02;
            this.f40961h = j11;
            this.f40962i = o2Var;
            this.f40963j = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f40959f, this.f40960g, this.f40961h, this.f40962i, this.f40963j, dVar);
            bVar.f40958e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            xe.B0 b02;
            xe.B0 b03;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40957d;
            androidx.lifecycle.J j11 = this.f40961h;
            o2 o2Var = this.f40962i;
            if (i11 == 0) {
                Sc.s.b(obj);
                xe.M m11 = (xe.M) this.f40958e;
                try {
                    C5257j1 c5257j1 = this.f40959f.f71787a;
                    if (c5257j1 != null) {
                        Ae.M0 a11 = r2.a(this.f40963j.getContext().getApplicationContext());
                        c5257j1.a(((Number) a11.getValue()).floatValue());
                        b03 = C10727i.c(m11, null, null, new a(a11, c5257j1, null), 3);
                    } else {
                        b03 = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    b02 = null;
                }
                try {
                    S0.L0 l02 = this.f40960g;
                    this.f40958e = b03;
                    this.f40957d = 1;
                    if (l02.i0(this) == aVar) {
                        return aVar;
                    }
                    b02 = b03;
                } catch (Throwable th3) {
                    b02 = b03;
                    th = th3;
                    if (b02 != null) {
                        b02.j(null);
                    }
                    j11.getLifecycle().e(o2Var);
                    throw th;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b02 = (xe.B0) this.f40958e;
                try {
                    Sc.s.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    if (b02 != null) {
                    }
                    j11.getLifecycle().e(o2Var);
                    throw th;
                }
            }
            if (b02 != null) {
                b02.j(null);
            }
            j11.getLifecycle().e(o2Var);
            return Unit.f71690a;
        }
    }

    o2(C2862e c2862e, C3993x0 c3993x0, S0.L0 l02, kotlin.jvm.internal.M m11, View view) {
        this.f40951a = c2862e;
        this.f40952b = c3993x0;
        this.f40953c = l02;
        this.f40954d = m11;
        this.f40955e = view;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NotNull androidx.lifecycle.J j11, @NotNull AbstractC5434v.a aVar) {
        int i11 = a.f40956a[aVar.ordinal()];
        S0.L0 l02 = this.f40953c;
        if (i11 == 1) {
            C10727i.c(this.f40951a, null, xe.O.UNDISPATCHED, new b(this.f40954d, l02, j11, this, this.f40955e, null), 1);
            return;
        }
        if (i11 == 2) {
            C3993x0 c3993x0 = this.f40952b;
            if (c3993x0 != null) {
                c3993x0.b();
            }
            l02.h0();
            return;
        }
        if (i11 == 3) {
            l02.b0();
        } else {
            if (i11 != 4) {
                return;
            }
            l02.T();
        }
    }
}
