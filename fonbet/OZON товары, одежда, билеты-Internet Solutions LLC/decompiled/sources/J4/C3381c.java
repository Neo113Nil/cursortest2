package J4;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* renamed from: J4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3381c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Callable<Object> f13871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3381c(Callable<Object> callable, kotlin.coroutines.d<? super C3381c> dVar) {
        super(2, dVar);
        this.f13871d = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new C3381c(this.f13871d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<Object> dVar) {
        return ((C3381c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        return this.f13871d.call();
    }
}
