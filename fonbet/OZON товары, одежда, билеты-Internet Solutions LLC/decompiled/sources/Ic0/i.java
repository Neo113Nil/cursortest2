package Ic0;

import Sc.InterfaceC4008j;
import Sc.s;
import We.B;
import We.L;
import dc0.C6170p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class i implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6170p> f12230a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12231b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.initAuth.ResetCookiesInterceptor$intercept$1", f = "ResetCookiesInterceptor.kt", l = {17}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12232d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return i.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12232d;
            if (i11 == 0) {
                s.b(obj);
                C6170p c6170p = (C6170p) i.this.f12230a.getValue();
                this.f12232d = 1;
                if (C6170p.e(c6170p, false, false, this, 7) == aVar) {
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

    public i(@NotNull InterfaceC4008j<C6170p> cookieCleaner) {
        Intrinsics.checkNotNullParameter(cookieCleaner, "cookieCleaner");
        this.f12230a = cookieCleaner;
    }

    public final void b(boolean z11) {
        this.f12231b = z11;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        L proceed = chain.proceed(chain.request());
        if (proceed.v() && this.f12231b) {
            C10727i.d(kotlin.coroutines.g.f71771a, new a(null));
        }
        return proceed;
    }
}
