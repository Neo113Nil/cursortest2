package J4;

import Sc.r;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Callable<Object> f13874d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10737n f13875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(Callable callable, C10737n c10737n, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f13874d = callable;
        this.f13875e = c10737n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new e(this.f13874d, this.f13875e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        C10737n c10737n = this.f13875e;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        try {
            Object call = this.f13874d.call();
            r.Companion companion = Sc.r.INSTANCE;
            c10737n.resumeWith(call);
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            c10737n.resumeWith(Sc.s.a(th2));
        }
        return Unit.f71690a;
    }
}
