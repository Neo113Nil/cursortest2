package androidx.lifecycle;

import Je.InterfaceC3394a;
import Sc.r;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.C10737n;
import xe.L0;

/* renamed from: androidx.lifecycle.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5412d0 {

    @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.d0$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f43274d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f43275e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5434v f43276f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC5434v.b f43277g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f43278h;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.d0$a$a, reason: collision with other inner class name */
        static final class C0791a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            kotlin.jvm.internal.M f43279d;

            /* renamed from: e, reason: collision with root package name */
            kotlin.jvm.internal.M f43280e;

            /* renamed from: f, reason: collision with root package name */
            xe.M f43281f;

            /* renamed from: g, reason: collision with root package name */
            int f43282g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ AbstractC5434v f43283h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ AbstractC5434v.b f43284i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ xe.M f43285j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.jvm.internal.j f43286k;

            /* renamed from: androidx.lifecycle.d0$a$a$a, reason: collision with other inner class name */
            static final class C0792a implements G {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC5434v.a f43287a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.M<xe.B0> f43288b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ xe.M f43289c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ AbstractC5434v.a f43290d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C10737n f43291e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Je.d f43292f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ kotlin.coroutines.jvm.internal.j f43293g;

                @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
                /* renamed from: androidx.lifecycle.d0$a$a$a$a, reason: collision with other inner class name */
                static final class C0793a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                    /* renamed from: d, reason: collision with root package name */
                    InterfaceC3394a f43294d;

                    /* renamed from: e, reason: collision with root package name */
                    kotlin.coroutines.jvm.internal.j f43295e;

                    /* renamed from: f, reason: collision with root package name */
                    int f43296f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ Je.d f43297g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ kotlin.coroutines.jvm.internal.j f43298h;

                    @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
                    /* renamed from: androidx.lifecycle.d0$a$a$a$a$a, reason: collision with other inner class name */
                    static final class C0794a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

                        /* renamed from: d, reason: collision with root package name */
                        int f43299d;

                        /* renamed from: e, reason: collision with root package name */
                        private /* synthetic */ Object f43300e;

                        /* renamed from: f, reason: collision with root package name */
                        final /* synthetic */ Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> f43301f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C0794a(Function2<? super xe.M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C0794a> dVar) {
                            super(2, dVar);
                            this.f43301f = function2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @NotNull
                        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                            C0794a c0794a = new C0794a(this.f43301f, dVar);
                            c0794a.f43300e = obj;
                            return c0794a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                            return ((C0794a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            int i11 = this.f43299d;
                            if (i11 == 0) {
                                Sc.s.b(obj);
                                xe.M m11 = (xe.M) this.f43300e;
                                this.f43299d = 1;
                                if (this.f43301f.invoke(m11, this) == aVar) {
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
                    /* JADX WARN: Multi-variable type inference failed */
                    C0793a(Je.d dVar, Function2 function2, kotlin.coroutines.d dVar2) {
                        super(2, dVar2);
                        this.f43297g = dVar;
                        this.f43298h = (kotlin.coroutines.jvm.internal.j) function2;
                    }

                    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @NotNull
                    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                        return new C0793a(this.f43297g, this.f43298h, dVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                        return ((C0793a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
                    
                        if (r7.a(r6) == r0) goto L19;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function2] */
                    /* JADX WARN: Type inference failed for: r1v6 */
                    /* JADX WARN: Type inference failed for: r1v7 */
                    /* JADX WARN: Type inference failed for: r3v3, types: [Je.a] */
                    @Override // kotlin.coroutines.jvm.internal.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Je.d dVar;
                        ?? r12;
                        InterfaceC3394a interfaceC3394a;
                        Throwable th2;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        int i11 = this.f43296f;
                        try {
                            if (i11 == 0) {
                                Sc.s.b(obj);
                                dVar = this.f43297g;
                                this.f43294d = dVar;
                                kotlin.coroutines.jvm.internal.j jVar = this.f43298h;
                                this.f43295e = jVar;
                                this.f43296f = 1;
                                r12 = jVar;
                            } else {
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    interfaceC3394a = this.f43294d;
                                    try {
                                        Sc.s.b(obj);
                                        Unit unit = Unit.f71690a;
                                        interfaceC3394a.c(null);
                                        return Unit.f71690a;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        interfaceC3394a.c(null);
                                        throw th2;
                                    }
                                }
                                Function2 function2 = (Function2) this.f43295e;
                                ?? r32 = this.f43294d;
                                Sc.s.b(obj);
                                dVar = r32;
                                r12 = function2;
                            }
                            C0794a c0794a = new C0794a(r12, null);
                            this.f43294d = dVar;
                            this.f43295e = null;
                            this.f43296f = 2;
                            if (xe.N.d(c0794a, this) != aVar) {
                                interfaceC3394a = dVar;
                                Unit unit2 = Unit.f71690a;
                                interfaceC3394a.c(null);
                                return Unit.f71690a;
                            }
                            return aVar;
                        } catch (Throwable th4) {
                            interfaceC3394a = dVar;
                            th2 = th4;
                            interfaceC3394a.c(null);
                            throw th2;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C0792a(AbstractC5434v.a aVar, kotlin.jvm.internal.M m11, xe.M m12, AbstractC5434v.a aVar2, C10737n c10737n, Je.d dVar, Function2 function2) {
                    this.f43287a = aVar;
                    this.f43288b = m11;
                    this.f43289c = m12;
                    this.f43290d = aVar2;
                    this.f43291e = c10737n;
                    this.f43292f = dVar;
                    this.f43293g = (kotlin.coroutines.jvm.internal.j) function2;
                }

                /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
                /* JADX WARN: Type inference failed for: r5v3, types: [T, xe.B0] */
                @Override // androidx.lifecycle.G
                public final void onStateChanged(@NotNull J j11, @NotNull AbstractC5434v.a event) {
                    Intrinsics.checkNotNullParameter(j11, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    kotlin.jvm.internal.M<xe.B0> m11 = this.f43288b;
                    if (event == this.f43287a) {
                        m11.f71787a = C10727i.c(this.f43289c, null, null, new C0793a(this.f43292f, this.f43293g, null), 3);
                        return;
                    }
                    if (event == this.f43290d) {
                        xe.B0 b02 = m11.f71787a;
                        if (b02 != null) {
                            b02.j(null);
                        }
                        m11.f71787a = null;
                    }
                    if (event == AbstractC5434v.a.ON_DESTROY) {
                        r.Companion companion = Sc.r.INSTANCE;
                        this.f43291e.resumeWith(Unit.f71690a);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0791a(AbstractC5434v abstractC5434v, AbstractC5434v.b bVar, xe.M m11, Function2<? super xe.M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super C0791a> dVar) {
                super(2, dVar);
                this.f43283h = abstractC5434v;
                this.f43284i = bVar;
                this.f43285j = m11;
                this.f43286k = (kotlin.coroutines.jvm.internal.j) function2;
            }

            /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0791a(this.f43283h, this.f43284i, this.f43285j, this.f43286k, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0791a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
            /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.I, androidx.lifecycle.d0$a$a$a] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.jvm.internal.M m11;
                Throwable th2;
                kotlin.jvm.internal.M m12;
                xe.B0 b02;
                G g10;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f43282g;
                AbstractC5434v abstractC5434v = this.f43283h;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    if (abstractC5434v.b() == AbstractC5434v.b.DESTROYED) {
                        return Unit.f71690a;
                    }
                    kotlin.jvm.internal.M m13 = new kotlin.jvm.internal.M();
                    m11 = new kotlin.jvm.internal.M();
                    try {
                        AbstractC5434v.b bVar = this.f43284i;
                        xe.M m14 = this.f43285j;
                        ?? r11 = this.f43286k;
                        this.f43279d = m13;
                        this.f43280e = m11;
                        this.f43281f = m14;
                        this.f43282g = 1;
                        C10737n c10737n = new C10737n(1, Wc.b.b(this));
                        c10737n.o();
                        AbstractC5434v.a.Companion.getClass();
                        ?? c0792a = new C0792a(AbstractC5434v.a.C0798a.c(bVar), m13, m14, AbstractC5434v.a.C0798a.a(bVar), c10737n, Je.e.a(), r11);
                        m11.f71787a = c0792a;
                        abstractC5434v.a(c0792a);
                        Object n11 = c10737n.n();
                        if (n11 == aVar) {
                            Intrinsics.checkNotNullParameter(this, "frame");
                        }
                        if (n11 == aVar) {
                            return aVar;
                        }
                        m12 = m13;
                    } catch (Throwable th3) {
                        th2 = th3;
                        m12 = m13;
                        b02 = (xe.B0) m12.f71787a;
                        if (b02 != null) {
                            b02.j(null);
                        }
                        g10 = (G) m11.f71787a;
                        if (g10 != null) {
                            throw th2;
                        }
                        abstractC5434v.e(g10);
                        throw th2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m11 = this.f43280e;
                    m12 = this.f43279d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        b02 = (xe.B0) m12.f71787a;
                        if (b02 != null) {
                        }
                        g10 = (G) m11.f71787a;
                        if (g10 != null) {
                        }
                    }
                }
                xe.B0 b03 = (xe.B0) m12.f71787a;
                if (b03 != null) {
                    b03.j(null);
                }
                G g11 = (G) m11.f71787a;
                if (g11 != null) {
                    abstractC5434v.e(g11);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC5434v abstractC5434v, AbstractC5434v.b bVar, Function2<? super xe.M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f43276f = abstractC5434v;
            this.f43277g = bVar;
            this.f43278h = (kotlin.coroutines.jvm.internal.j) function2;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f43276f, this.f43277g, this.f43278h, dVar);
            aVar.f43275e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f43274d;
            if (i11 == 0) {
                Sc.s.b(obj);
                xe.M m11 = (xe.M) this.f43275e;
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 x11 = De.s.f6650a.x();
                C0791a c0791a = new C0791a(this.f43276f, this.f43277g, m11, this.f43278h, null);
                this.f43274d = 1;
                if (C10727i.f(x11, c0791a, this) == aVar) {
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

    public static final Object a(@NotNull AbstractC5434v abstractC5434v, @NotNull AbstractC5434v.b bVar, @NotNull Function2<? super xe.M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object d11;
        if (bVar != AbstractC5434v.b.INITIALIZED) {
            return (abstractC5434v.b() != AbstractC5434v.b.DESTROYED && (d11 = xe.N.d(new a(abstractC5434v, bVar, function2, null), dVar)) == Wc.a.COROUTINE_SUSPENDED) ? d11 : Unit.f71690a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object b(@NotNull J j11, @NotNull AbstractC5434v.b bVar, @NotNull Function2<? super xe.M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = a(j11.getLifecycle(), bVar, function2, dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
