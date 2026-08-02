package androidx.compose.ui.platform;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {244}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class D0 extends kotlin.coroutines.jvm.internal.j implements Function2<Unit, kotlin.coroutines.d<?>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f40618d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ F0 f40619e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC5272o1 f40620f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC5289u1 f40621g;

    static final class a extends AbstractC7737t implements Function0<InterfaceC5269n1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F0 f40622b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(F0 f02) {
            super(0);
            this.f40622b = f02;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC5269n1 invoke() {
            this.f40622b.getClass();
            throw null;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {245}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC5269n1, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40623d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f40624e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5272o1 f40625f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5289u1 f40626g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5272o1 interfaceC5272o1, InterfaceC5289u1 interfaceC5289u1, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f40625f = interfaceC5272o1;
            this.f40626g = interfaceC5289u1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f40625f, this.f40626g, dVar);
            bVar.f40624e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC5269n1 interfaceC5269n1, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(interfaceC5269n1, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40623d;
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC5269n1 interfaceC5269n1 = (InterfaceC5269n1) this.f40624e;
                this.f40623d = 1;
                if (interfaceC5269n1.a() == aVar) {
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
    D0(F0 f02, InterfaceC5272o1 interfaceC5272o1, InterfaceC5289u1 interfaceC5289u1, kotlin.coroutines.d<? super D0> dVar) {
        super(2, dVar);
        this.f40619e = f02;
        this.f40620f = interfaceC5272o1;
        this.f40621g = interfaceC5289u1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new D0(this.f40619e, this.f40620f, this.f40621g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, kotlin.coroutines.d<?> dVar) {
        return ((D0) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f40618d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2395h m11 = S0.n1.m(new a(this.f40619e));
            b bVar = new b(this.f40620f, this.f40621g, null);
            this.f40618d = 1;
            if (C2399j.h(m11, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        throw new IllegalStateException("Interceptors flow should never terminate.");
    }
}
