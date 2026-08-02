package Dj0;

import Sc.s;
import h3.C6788a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10711a;
import xe.B0;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6788a f6746a;

    /* renamed from: b, reason: collision with root package name */
    private B0 f6747b;

    @e(c = "ru.ozon.tracker.debug.menu.shared.utils.ThrottleJobImpl$throttle$1", f = "ThrottleJob.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f6748d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j f6749e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f6749e = (j) function1;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f6749e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f6748d;
            if (i11 == 0) {
                s.b(obj);
                this.f6748d = 1;
                if (this.f6749e.invoke(this) == aVar) {
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

    public c(@NotNull C6788a scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f6746a = scope;
    }

    @Override // Dj0.b
    public final void a(@NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        B0 b02 = this.f6747b;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            this.f6747b = C10727i.c(this.f6746a, null, null, new a(block, null), 3);
        }
    }
}
