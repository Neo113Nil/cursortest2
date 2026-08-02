package Ae;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.wallet.WalletConstants;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ze.l;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION}, m = "invokeSuspend")
/* renamed from: Ae.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C2416s extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<xe.M, InterfaceC2397i<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    kotlin.jvm.internal.M f1117d;

    /* renamed from: e, reason: collision with root package name */
    ze.w f1118e;

    /* renamed from: f, reason: collision with root package name */
    int f1119f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f1120g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f1121h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f1122i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f1123j;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ae.s$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<ze.l<? extends Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1124d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<Object> f1125e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ze.w<Unit> f1126f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.M<Object> m11, ze.w<Unit> wVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f1125e = m11;
            this.f1126f = wVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f1125e, this.f1126f, dVar);
            aVar.f1124d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ze.l<? extends Object> lVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(ze.l.b(lVar.e()), dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v7, types: [De.A, T] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            ?? e11 = ((ze.l) this.f1124d).e();
            boolean z11 = e11 instanceof l.b;
            kotlin.jvm.internal.M<Object> m11 = this.f1125e;
            if (!z11) {
                m11.f71787a = e11;
            }
            if (z11) {
                Throwable c11 = ze.l.c(e11);
                if (c11 != null) {
                    throw c11;
                }
                this.f1126f.j(new Be.o());
                m11.f71787a = Be.z.f3698c;
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {293}, m = "invokeSuspend")
    /* renamed from: Ae.s$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<Unit, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1127d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<Object> f1128e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i<Object> f1129f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2397i interfaceC2397i, kotlin.coroutines.d dVar, kotlin.jvm.internal.M m11) {
            super(2, dVar);
            this.f1128e = m11;
            this.f1129f = interfaceC2397i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f1129f, dVar, this.f1128e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(unit, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1127d;
            if (i11 == 0) {
                Sc.s.b(obj);
                kotlin.jvm.internal.M<Object> m11 = this.f1128e;
                Object obj2 = m11.f71787a;
                if (obj2 == null) {
                    return Unit.f71690a;
                }
                m11.f71787a = null;
                if (obj2 == Be.z.f3696a) {
                    obj2 = null;
                }
                this.f1127d = 1;
                if (this.f1129f.emit(obj2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", l = {273}, m = "invokeSuspend")
    /* renamed from: Ae.s$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<? super Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1130d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f1131e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h<Object> f1132f;

        /* renamed from: Ae.s$c$a */
        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ze.u<Object> f1133a;

            @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", l = {273}, m = "emit")
            /* renamed from: Ae.s$c$a$a, reason: collision with other inner class name */
            static final class C0036a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f1134d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ a<T> f1135e;

                /* renamed from: f, reason: collision with root package name */
                int f1136f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0036a(a<? super T> aVar, kotlin.coroutines.d<? super C0036a> dVar) {
                    super(dVar);
                    this.f1135e = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f1134d = obj;
                    this.f1136f |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f1135e.emit(null, this);
                }
            }

            a(ze.u<Object> uVar) {
                this.f1133a = uVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                C0036a c0036a;
                int i11;
                if (dVar instanceof C0036a) {
                    c0036a = (C0036a) dVar;
                    int i12 = c0036a.f1136f;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0036a.f1136f = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c0036a.f1134d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0036a.f1136f;
                        if (i11 != 0) {
                            Sc.s.b(obj);
                            if (t2 == null) {
                                t2 = (T) Be.z.f3696a;
                            }
                            c0036a.f1136f = 1;
                            if (this.f1133a.n(t2, c0036a) == aVar) {
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
                c0036a = new C0036a(this, dVar);
                Object obj2 = c0036a.f1134d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0036a.f1136f;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC2395h<Object> interfaceC2395h, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f1132f = interfaceC2395h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f1132f, dVar);
            cVar.f1131e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ze.u<? super Object> uVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1130d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a((ze.u) this.f1131e);
                this.f1130d = 1;
                if (this.f1132f.collect(aVar2, this) == aVar) {
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
    C2416s(long j11, InterfaceC2395h<Object> interfaceC2395h, kotlin.coroutines.d<? super C2416s> dVar) {
        super(3, dVar);
        this.f1122i = j11;
        this.f1123j = interfaceC2395h;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(xe.M m11, InterfaceC2397i<Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        C2416s c2416s = new C2416s(this.f1122i, this.f1123j, dVar);
        c2416s.f1120g = m11;
        c2416s.f1121h = interfaceC2397i;
        return c2416s.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ze.w wVar;
        kotlin.jvm.internal.M m11;
        InterfaceC2397i interfaceC2397i;
        ze.w d11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f1119f;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.M m12 = (xe.M) this.f1120g;
            InterfaceC2397i interfaceC2397i2 = (InterfaceC2397i) this.f1121h;
            ze.w d12 = ze.s.d(m12, -1, new c(this.f1123j, null), 1);
            kotlin.jvm.internal.M m13 = new kotlin.jvm.internal.M();
            wVar = d12;
            m11 = m13;
            interfaceC2397i = interfaceC2397i2;
            d11 = ze.s.d(m12, 0, new r(this.f1122i, null), 1);
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d11 = this.f1118e;
            m11 = this.f1117d;
            wVar = (ze.w) this.f1121h;
            interfaceC2397i = (InterfaceC2397i) this.f1120g;
            Sc.s.b(obj);
        }
        while (m11.f71787a != Be.z.f3698c) {
            Ie.h hVar = new Ie.h(getContext());
            hVar.m(wVar.c(), new a(m11, d11, null));
            hVar.m(d11.h(), new b(interfaceC2397i, null, m11));
            this.f1120g = interfaceC2397i;
            this.f1121h = wVar;
            this.f1117d = m11;
            this.f1118e = d11;
            this.f1119f = 1;
            if (hVar.i(this) == aVar) {
                return aVar;
            }
        }
        return Unit.f71690a;
    }
}
