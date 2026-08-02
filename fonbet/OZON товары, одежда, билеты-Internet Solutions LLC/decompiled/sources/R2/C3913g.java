package R2;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
/* renamed from: R2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3913g extends kotlin.coroutines.jvm.internal.j implements Function2<T<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f24362d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f24363e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<InterfaceC3912f<Object>> f24364f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C3913g(List<? extends InterfaceC3912f<Object>> list, kotlin.coroutines.d<? super C3913g> dVar) {
        super(2, dVar);
        this.f24364f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C3913g c3913g = new C3913g(this.f24364f, dVar);
        c3913g.f24363e = obj;
        return c3913g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(T<Object> t2, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3913g) create(t2, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f24362d;
        if (i11 == 0) {
            Sc.s.b(obj);
            T t2 = (T) this.f24363e;
            this.f24362d = 1;
            if (C3916j.a(this.f24364f, t2, this) == aVar) {
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
