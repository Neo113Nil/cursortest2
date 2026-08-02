package R2;

import fd.InterfaceC6511n;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class j0 extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<X<Object>, Boolean, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f24379d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ X f24380e;

    @Override // fd.InterfaceC6511n
    public final Object invoke(X<Object> x11, Boolean bool, kotlin.coroutines.d<Object> dVar) {
        bool.getClass();
        j0 j0Var = new j0(3, dVar);
        j0Var.f24380e = x11;
        return j0Var.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f24379d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        X x11 = this.f24380e;
        this.f24379d = 1;
        Object e11 = x11.e(this);
        return e11 == aVar ? aVar : e11;
    }
}
