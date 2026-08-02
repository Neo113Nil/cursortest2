package Be;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class E<T> implements InterfaceC2397i<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ze.x<T> f3557a;

    /* JADX WARN: Multi-variable type inference failed */
    public E(@NotNull ze.x<? super T> xVar) {
        this.f3557a = xVar;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object n11 = this.f3557a.n(t2, dVar);
        return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
    }
}
