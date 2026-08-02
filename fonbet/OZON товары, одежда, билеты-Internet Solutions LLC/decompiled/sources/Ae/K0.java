package Ae;

import Sc.C4005g;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class K0 implements I0 {

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    /* loaded from: classes10.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super G0>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f829d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f830e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ M0<Integer> f831f;

        /* renamed from: Ae.K0$a$a, reason: collision with other inner class name */
        static final class C0025a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.I f832a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i<G0> f833b;

            @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            /* renamed from: Ae.K0$a$a$a, reason: collision with other inner class name */
            static final class C0026a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f834d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ C0025a<T> f835e;

                /* renamed from: f, reason: collision with root package name */
                int f836f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0026a(C0025a<? super T> c0025a, kotlin.coroutines.d<? super C0026a> dVar) {
                    super(dVar);
                    this.f835e = c0025a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f834d = obj;
                    this.f836f |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f835e.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0025a(kotlin.jvm.internal.I i11, InterfaceC2397i<? super G0> interfaceC2397i) {
                this.f832a = i11;
                this.f833b = interfaceC2397i;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object a(int i11, kotlin.coroutines.d<? super Unit> dVar) {
                C0026a c0026a;
                int i12;
                if (dVar instanceof C0026a) {
                    c0026a = (C0026a) dVar;
                    int i13 = c0026a.f836f;
                    if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0026a.f836f = i13 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = c0026a.f834d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i12 = c0026a.f836f;
                        if (i12 != 0) {
                            Sc.s.b(obj);
                            if (i11 > 0) {
                                kotlin.jvm.internal.I i14 = this.f832a;
                                if (!i14.f71783a) {
                                    i14.f71783a = true;
                                    G0 g02 = G0.START;
                                    c0026a.f836f = 1;
                                    if (this.f833b.emit(g02, c0026a) == aVar) {
                                        return aVar;
                                    }
                                }
                            }
                            return Unit.f71690a;
                        }
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                        return Unit.f71690a;
                    }
                }
                c0026a = new C0026a(this, dVar);
                Object obj2 = c0026a.f834d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i12 = c0026a.f836f;
                if (i12 != 0) {
                }
                return Unit.f71690a;
            }

            @Override // Ae.InterfaceC2397i
            public final /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(M0<Integer> m02, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f831f = m02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f831f, dVar);
            aVar.f830e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC2397i<? super G0> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f829d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C0025a c0025a = new C0025a(new kotlin.jvm.internal.I(), (InterfaceC2397i) this.f830e);
                this.f829d = 1;
                if (this.f831f.collect(c0025a, this) == aVar) {
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

    @Override // Ae.I0
    @NotNull
    public final InterfaceC2395h<G0> a(@NotNull M0<Integer> m02) {
        return new A0(new a(m02, null));
    }

    @NotNull
    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
