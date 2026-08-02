package androidx.compose.foundation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import D1.C2820u;
import D1.InterfaceC2807j;
import D1.InterfaceC2819t;
import D1.J;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.K;
import l1.C7807Z;
import n0.InterfaceC8369J;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import t0.C9717f;
import t0.C9718g;
import t0.s;
import xe.C10727i;
import xe.M;

/* loaded from: classes8.dex */
final class o implements InterfaceC8369J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f39713a = new o();

    private static final class a extends e.c implements InterfaceC2819t {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final t0.o f39714a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f39715b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f39716c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f39717d;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {240}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.o$a$a, reason: collision with other inner class name */
        static final class C0734a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f39718d;

            /* renamed from: androidx.compose.foundation.o$a$a$a, reason: collision with other inner class name */
            static final class C0735a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ K f39720a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ K f39721b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ K f39722c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ a f39723d;

                C0735a(K k11, K k12, K k13, a aVar) {
                    this.f39720a = k11;
                    this.f39721b = k12;
                    this.f39722c = k13;
                    this.f39723d = aVar;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    t0.n nVar = (t0.n) obj;
                    boolean z11 = nVar instanceof s.b;
                    K k11 = this.f39722c;
                    K k12 = this.f39721b;
                    K k13 = this.f39720a;
                    boolean z12 = true;
                    if (z11) {
                        k13.f71785a++;
                    } else if (nVar instanceof s.c) {
                        k13.f71785a--;
                    } else if (nVar instanceof s.a) {
                        k13.f71785a--;
                    } else if (nVar instanceof t0.j) {
                        k12.f71785a++;
                    } else if (nVar instanceof t0.k) {
                        k12.f71785a--;
                    } else if (nVar instanceof C9717f) {
                        k11.f71785a++;
                    } else if (nVar instanceof C9718g) {
                        k11.f71785a--;
                    }
                    boolean z13 = false;
                    boolean z14 = k13.f71785a > 0;
                    boolean z15 = k12.f71785a > 0;
                    boolean z16 = k11.f71785a > 0;
                    a aVar = this.f39723d;
                    if (aVar.f39715b != z14) {
                        aVar.f39715b = z14;
                        z13 = true;
                    }
                    if (aVar.f39716c != z15) {
                        aVar.f39716c = z15;
                        z13 = true;
                    }
                    if (aVar.f39717d != z16) {
                        aVar.f39717d = z16;
                    } else {
                        z12 = z13;
                    }
                    if (z12) {
                        C2820u.a(aVar);
                    }
                    return Unit.f71690a;
                }
            }

            C0734a(kotlin.coroutines.d<? super C0734a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return a.this.new C0734a(dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0734a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f39718d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    K k11 = new K();
                    K k12 = new K();
                    K k13 = new K();
                    a aVar2 = a.this;
                    InterfaceC2395h<t0.n> interactions = aVar2.f39714a.getInteractions();
                    C0735a c0735a = new C0735a(k11, k12, k13, aVar2);
                    this.f39718d = 1;
                    if (interactions.collect(c0735a, this) == aVar) {
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

        public a(@NotNull t0.o oVar) {
            this.f39714a = oVar;
        }

        @Override // D1.InterfaceC2819t
        public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
            long j11;
            long j12;
            J j13 = (J) interfaceC8410c;
            j13.F0();
            if (this.f39715b) {
                j12 = C7807Z.f72248b;
                InterfaceC8412e.Q(interfaceC8410c, C7807Z.o(0.3f, j12), 0L, j13.i(), 0.0f, null, 122);
            } else if (this.f39716c || this.f39717d) {
                j11 = C7807Z.f72248b;
                InterfaceC8412e.Q(interfaceC8410c, C7807Z.o(0.1f, j11), 0L, j13.i(), 0.0f, null, 122);
            }
        }

        @Override // androidx.compose.ui.e.c
        public final void onAttach() {
            C10727i.c(getCoroutineScope(), null, null, new C0734a(null), 3);
        }
    }

    @Override // n0.InterfaceC8369J
    @NotNull
    public final InterfaceC2807j b(@NotNull t0.o oVar) {
        return new a(oVar);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return -1;
    }
}
