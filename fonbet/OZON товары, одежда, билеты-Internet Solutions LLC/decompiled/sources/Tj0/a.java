package Tj0;

import Ae.C2399j;
import Ae.C2408n0;
import Qj0.V;
import Sc.r;
import Sc.s;
import android.annotation.SuppressLint;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository;
import xe.M;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final PowerManagerRepository f27192a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final M f27193b;

    @e(c = "ru.ozon.tracker.performance.powermanager.SkipPerfTracesInLowPowerModeInteractor$execute$1", f = "SkipPerfTracesInLowPowerModeInteractor.kt", l = {22}, m = "invokeSuspend")
    /* renamed from: Tj0.a$a, reason: collision with other inner class name */
    static final class C0549a extends j implements Function2<Boolean, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f27194d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ boolean f27195e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ V f27197g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0549a(V v11, d<? super C0549a> dVar) {
            super(2, dVar);
            this.f27197g = v11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            C0549a c0549a = a.this.new C0549a(this.f27197g, dVar);
            c0549a.f27195e = ((Boolean) obj).booleanValue();
            return c0549a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((C0549a) create(bool2, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f27194d;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    boolean z11 = this.f27195e;
                    V v11 = this.f27197g;
                    r.Companion companion = r.INSTANCE;
                    if (z11) {
                        this.f27194d = 1;
                        if (v11.f(this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Unit unit = Unit.f71690a;
                r.Companion companion2 = r.INSTANCE;
            } catch (Throwable th2) {
                r.Companion companion3 = r.INSTANCE;
                s.a(th2);
            }
            return Unit.f71690a;
        }
    }

    public a(@NotNull PowerManagerRepository powerManagerRepository, @NotNull M coroutineScope) {
        Intrinsics.checkNotNullParameter(powerManagerRepository, "powerManagerRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f27192a = powerManagerRepository;
        this.f27193b = coroutineScope;
    }

    @SuppressLint({"CheckResult"})
    public final void a(@NotNull V traceController) {
        Intrinsics.checkNotNullParameter(traceController, "traceController");
        C2399j.C(new C2408n0(this.f27192a.powerSaveModeFlow(), new C0549a(traceController, null)), this.f27193b);
    }
}
