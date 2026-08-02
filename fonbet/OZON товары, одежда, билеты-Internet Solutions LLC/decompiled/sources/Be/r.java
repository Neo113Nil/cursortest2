package Be;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.D0;
import xe.E0;
import xe.M;
import ze.l;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class r extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    D0 f3647d;

    /* renamed from: e, reason: collision with root package name */
    int f3648e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f3649f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f3650g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f3651h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i<Object> f3652i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f3653j;

    static final class a implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ D0 f3654a;

        a(D0 d02) {
            this.f3654a = d02;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            D0 d02 = this.f3654a;
            if (d02.isActive()) {
                d02.j(new C2629a(d02));
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {124}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<Unit, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f3655d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h<Object> f3656e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f3657f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f3658g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ze.w<Object> f3659h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i<Object> f3660i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f3661j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ D0 f3662k;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f3663a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f3664b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ze.w<Object> f3665c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i<Object> f3666d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlin.coroutines.jvm.internal.j f3667e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ D0 f3668f;

            @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {126, 129, 129}, m = "invokeSuspend")
            /* renamed from: Be.r$b$a$a, reason: collision with other inner class name */
            static final class C0094a extends kotlin.coroutines.jvm.internal.j implements Function2<Unit, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                InterfaceC2397i f3669d;

                /* renamed from: e, reason: collision with root package name */
                int f3670e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ ze.w<Object> f3671f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC2397i<Object> f3672g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ kotlin.coroutines.jvm.internal.j f3673h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ Object f3674i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ D0 f3675j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0094a(ze.w wVar, InterfaceC2397i interfaceC2397i, InterfaceC6511n interfaceC6511n, Object obj, D0 d02, kotlin.coroutines.d dVar) {
                    super(2, dVar);
                    this.f3671f = wVar;
                    this.f3672g = interfaceC2397i;
                    this.f3673h = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
                    this.f3674i = obj;
                    this.f3675j = d02;
                }

                /* JADX WARN: Type inference failed for: r3v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    D0 d02 = this.f3675j;
                    return new C0094a(this.f3671f, this.f3672g, this.f3673h, this.f3674i, d02, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Unit unit, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0094a) create(unit, dVar)).invokeSuspend(Unit.f71690a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
                
                    if (r1.emit(r7, r6) == r0) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
                
                    if (r7 == r0) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
                
                    if (r7 == r0) goto L29;
                 */
                /* JADX WARN: Type inference failed for: r4v1, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object f7;
                    InterfaceC2397i<Object> interfaceC2397i;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f3670e;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        this.f3670e = 1;
                        f7 = ((ze.i) this.f3671f).f(this);
                    } else if (i11 == 1) {
                        Sc.s.b(obj);
                        f7 = ((ze.l) obj).e();
                    } else {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj);
                            return Unit.f71690a;
                        }
                        interfaceC2397i = this.f3669d;
                        Sc.s.b(obj);
                        this.f3669d = null;
                        this.f3670e = 3;
                    }
                    if (f7 instanceof l.b) {
                        Throwable c11 = ze.l.c(f7);
                        if (c11 == null) {
                            throw new C2629a(this.f3675j);
                        }
                        throw c11;
                    }
                    if (f7 == z.f3696a) {
                        f7 = null;
                    }
                    interfaceC2397i = this.f3672g;
                    this.f3669d = interfaceC2397i;
                    this.f3670e = 2;
                    obj = this.f3673h.invoke(this.f3674i, f7, this);
                }
            }

            @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", l = {125}, m = "emit")
            /* renamed from: Be.r$b$a$b, reason: collision with other inner class name */
            static final class C0095b extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f3676d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ a<T> f3677e;

                /* renamed from: f, reason: collision with root package name */
                int f3678f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0095b(a<? super T> aVar, kotlin.coroutines.d<? super C0095b> dVar) {
                    super(dVar);
                    this.f3677e = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3676d = obj;
                    this.f3678f |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f3677e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(CoroutineContext coroutineContext, Object obj, ze.w wVar, InterfaceC2397i interfaceC2397i, InterfaceC6511n interfaceC6511n, D0 d02) {
                this.f3663a = coroutineContext;
                this.f3664b = obj;
                this.f3665c = wVar;
                this.f3666d = interfaceC2397i;
                this.f3667e = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
                this.f3668f = d02;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Type inference failed for: r7v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                C0095b c0095b;
                int i11;
                if (dVar instanceof C0095b) {
                    c0095b = (C0095b) dVar;
                    int i12 = c0095b.f3678f;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0095b.f3678f = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c0095b.f3676d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0095b.f3678f;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            Unit unit = Unit.f71690a;
                            D0 d02 = this.f3668f;
                            C0094a c0094a = new C0094a(this.f3665c, this.f3666d, this.f3667e, obj, d02, null);
                            c0095b.f3678f = 1;
                            if (C2636h.b(this.f3663a, unit, this.f3664b, c0094a, c0095b) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c0095b = new C0095b(this, dVar);
                Object obj22 = c0095b.f3676d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0095b.f3678f;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC2395h interfaceC2395h, CoroutineContext coroutineContext, Object obj, ze.w wVar, InterfaceC2397i interfaceC2397i, InterfaceC6511n interfaceC6511n, D0 d02, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f3656e = interfaceC2395h;
            this.f3657f = coroutineContext;
            this.f3658g = obj;
            this.f3659h = wVar;
            this.f3660i = interfaceC2397i;
            this.f3661j = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
            this.f3662k = d02;
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            ?? r62 = this.f3661j;
            D0 d02 = this.f3662k;
            return new b(this.f3656e, this.f3657f, this.f3658g, this.f3659h, this.f3660i, r62, d02, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(unit, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r8v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f3655d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a(this.f3657f, this.f3658g, this.f3659h, this.f3660i, this.f3661j, this.f3662k);
                this.f3655d = 1;
                if (this.f3656e.collect(aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", l = {86}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f3679d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f3680e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h<Object> f3681f;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ze.u<Object> f3682a;

            @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", l = {87}, m = "emit")
            /* renamed from: Be.r$c$a$a, reason: collision with other inner class name */
            static final class C0096a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f3683d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ a<T> f3684e;

                /* renamed from: f, reason: collision with root package name */
                int f3685f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0096a(a<? super T> aVar, kotlin.coroutines.d<? super C0096a> dVar) {
                    super(dVar);
                    this.f3684e = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3683d = obj;
                    this.f3685f |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f3684e.emit(null, this);
                }
            }

            a(ze.u<Object> uVar) {
                this.f3682a = uVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                C0096a c0096a;
                int i11;
                if (dVar instanceof C0096a) {
                    c0096a = (C0096a) dVar;
                    int i12 = c0096a.f3685f;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0096a.f3685f = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c0096a.f3683d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0096a.f3685f;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            ze.x<Object> k11 = this.f3682a.k();
                            if (obj == null) {
                                obj = z.f3696a;
                            }
                            c0096a.f3685f = 1;
                            if (((ze.i) k11).n(obj, c0096a) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c0096a = new C0096a(this, dVar);
                Object obj22 = c0096a.f3683d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0096a.f3685f;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC2395h<Object> interfaceC2395h, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f3681f = interfaceC2395h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f3681f, dVar);
            cVar.f3680e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ze.u<? super Object> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f3679d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a((ze.u) this.f3680e);
                this.f3679d = 1;
                if (this.f3681f.collect(aVar2, this) == aVar) {
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
    r(InterfaceC2395h<Object> interfaceC2395h, InterfaceC2395h<Object> interfaceC2395h2, InterfaceC2397i<Object> interfaceC2397i, InterfaceC6511n<Object, Object, ? super kotlin.coroutines.d<Object>, ? extends Object> interfaceC6511n, kotlin.coroutines.d<? super r> dVar) {
        super(2, dVar);
        this.f3650g = interfaceC2395h;
        this.f3651h = interfaceC2395h2;
        this.f3652i = interfaceC2397i;
        this.f3653j = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        r rVar = new r(this.f3650g, this.f3651h, this.f3652i, this.f3653j, dVar);
        rVar.f3649f = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((r) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0017, blocks: (B:6:0x0013, B:13:0x007e, B:15:0x0086), top: B:5:0x0013 }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ze.w wVar;
        D0 d02;
        Object b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3648e;
        if (i11 == 0) {
            Sc.s.b(obj);
            M m11 = (M) this.f3649f;
            ze.w d11 = ze.s.d(m11, 0, new c(this.f3650g, null), 3);
            D0 a11 = E0.a();
            ((ze.x) d11).a(new a(a11));
            try {
                CoroutineContext coroutineContext = m11.getCoroutineContext();
                Object b12 = De.G.b(coroutineContext);
                CoroutineContext plus = m11.getCoroutineContext().plus(a11);
                Unit unit = Unit.f71690a;
                b bVar = new b(this.f3651h, coroutineContext, b12, d11, this.f3652i, this.f3653j, a11, null);
                this.f3649f = d11;
                this.f3647d = a11;
                this.f3648e = 1;
                b11 = C2636h.b(plus, unit, De.G.b(plus), bVar, this);
                if (b11 == aVar) {
                    return aVar;
                }
                wVar = d11;
            } catch (C2629a e11) {
                e = e11;
                wVar = d11;
                d02 = a11;
                if (e.f3566a != d02) {
                }
                wVar.j(null);
                return Unit.f71690a;
            } catch (Throwable th2) {
                th = th2;
                wVar = d11;
                wVar.j(null);
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d02 = this.f3647d;
            wVar = (ze.w) this.f3649f;
            try {
                try {
                    Sc.s.b(obj);
                } catch (C2629a e12) {
                    e = e12;
                    if (e.f3566a != d02) {
                        throw e;
                    }
                    wVar.j(null);
                    return Unit.f71690a;
                }
            } catch (Throwable th3) {
                th = th3;
                wVar.j(null);
                throw th;
            }
        }
        wVar.j(null);
        return Unit.f71690a;
    }
}
