package R2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {416}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class r extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f24457d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<kotlin.coroutines.d<Object>, Object> f24458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    r(Function1<? super kotlin.coroutines.d<Object>, ? extends Object> function1, kotlin.coroutines.d<? super r> dVar) {
        super(1, dVar);
        this.f24458e = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new r(this.f24458e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<Object> dVar) {
        return ((r) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f24457d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        this.f24457d = 1;
        Object invoke = ((B) this.f24458e).invoke(this);
        return invoke == aVar ? aVar : invoke;
    }
}
