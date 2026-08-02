package A20;

import Ae.AbstractC2381a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import Sc.s;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.D0;
import m0.H0;
import m0.Y;
import org.jetbrains.annotations.NotNull;
import t0.n;
import t0.o;
import t0.s;
import xe.M;

/* loaded from: classes3.dex */
public final class c {

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.debugMenu.internal.core.ui.utils.InteractionSourceExtKt$rememberIndicationTransition$1$1", f = "InteractionSourceExt.kt", l = {DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f297d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Y<Boolean> f298e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<Boolean> f299f;

        /* renamed from: A20.c$a$a, reason: collision with other inner class name */
        static final class C0017a extends AbstractC7737t implements Function0<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Y<Boolean> f300b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0017a(Y<Boolean> y11) {
                super(0);
                this.f300b = y11;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(this.f300b.h());
            }
        }

        static final class b<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Y<Boolean> f301a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3978p0<Boolean> f302b;

            b(Y<Boolean> y11, InterfaceC3978p0<Boolean> interfaceC3978p0) {
                this.f301a = y11;
                this.f302b = interfaceC3978p0;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                ((Boolean) obj).getClass();
                Boolean bool = Boolean.FALSE;
                this.f302b.setValue(bool);
                this.f301a.i(bool);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Y<Boolean> y11, InterfaceC3978p0<Boolean> interfaceC3978p0, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f298e = y11;
            this.f299f = interfaceC3978p0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f298e, this.f299f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f297d;
            if (i11 == 0) {
                s.b(obj);
                Y<Boolean> y11 = this.f298e;
                InterfaceC2395h m11 = n1.m(new C0017a(y11));
                InterfaceC3978p0<Boolean> interfaceC3978p0 = this.f299f;
                b bVar = new b(y11, interfaceC3978p0);
                this.f297d = 1;
                Object collect = ((AbstractC2381a) m11).collect(new d(bVar, interfaceC3978p0), this);
                if (collect != aVar) {
                    collect = Unit.f71690a;
                }
                if (collect == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.debugMenu.internal.core.ui.utils.InteractionSourceExtKt$rememberIndicationTransition$2$1", f = "InteractionSourceExt.kt", l = {38}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f303d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f304e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Y<Boolean> f305f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<Boolean> f306g;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Y<Boolean> f307a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3978p0<Boolean> f308b;

            a(Y<Boolean> y11, InterfaceC3978p0<Boolean> interfaceC3978p0) {
                this.f307a = y11;
                this.f308b = interfaceC3978p0;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                n nVar = (n) obj;
                boolean z11 = nVar instanceof s.b;
                Y<Boolean> y11 = this.f307a;
                if (z11) {
                    if (y11.h()) {
                        y11.i(Boolean.TRUE);
                    }
                } else if ((nVar instanceof s.c) || (nVar instanceof s.a)) {
                    if (y11.h()) {
                        y11.i(Boolean.FALSE);
                    } else {
                        this.f308b.setValue(Boolean.TRUE);
                    }
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o oVar, Y<Boolean> y11, InterfaceC3978p0<Boolean> interfaceC3978p0, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f304e = oVar;
            this.f305f = y11;
            this.f306g = interfaceC3978p0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f304e, this.f305f, this.f306g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f303d;
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC2395h<n> interactions = this.f304e.getInteractions();
                a aVar2 = new a(this.f305f, this.f306g);
                this.f303d = 1;
                if (interactions.collect(aVar2, this) == aVar) {
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

    @NotNull
    public static final D0<Boolean> a(@NotNull o oVar, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        interfaceC3967k.o(287232554);
        interfaceC3967k.o(-1477268444);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(Boolean.FALSE, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-1477266644);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new Y(Boolean.FALSE);
            interfaceC3967k.x(C12);
        }
        Y y11 = (Y) C12;
        interfaceC3967k.k();
        interfaceC3967k.o(-1477262509);
        boolean F11 = interfaceC3967k.F(y11);
        Object C13 = interfaceC3967k.C();
        if (F11 || C13 == InterfaceC3967k.a.a()) {
            C13 = new a(y11, interfaceC3978p0, null);
            interfaceC3967k.x(C13);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, oVar, (Function2) C13);
        interfaceC3967k.o(-1477250685);
        boolean F12 = ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(oVar)) || (i11 & 6) == 4) | interfaceC3967k.F(y11);
        Object C14 = interfaceC3967k.C();
        if (F12 || C14 == InterfaceC3967k.a.a()) {
            C14 = new b(oVar, y11, interfaceC3978p0, null);
            interfaceC3967k.x(C14);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, oVar, (Function2) C14);
        D0<Boolean> h11 = H0.h(y11, interfaceC3967k);
        interfaceC3967k.k();
        return h11;
    }
}
