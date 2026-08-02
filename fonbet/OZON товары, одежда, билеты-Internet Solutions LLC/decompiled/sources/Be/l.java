package Be;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* loaded from: classes.dex */
public final class l<T> extends k<T, T> {
    public l(InterfaceC2395h interfaceC2395h, CoroutineContext coroutineContext, int i11, EnumC11113a enumC11113a, int i12) {
        super((i12 & 4) != 0 ? -3 : i11, interfaceC2395h, (i12 & 2) != 0 ? kotlin.coroutines.g.f71771a : coroutineContext, (i12 & 8) != 0 ? EnumC11113a.SUSPEND : enumC11113a);
    }

    @Override // Be.AbstractC2635g
    @NotNull
    protected final AbstractC2635g<T> e(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return new l(i11, this.f3600d, coroutineContext, enumC11113a);
    }

    @Override // Be.AbstractC2635g
    @NotNull
    public final InterfaceC2395h<T> f() {
        return (InterfaceC2395h<T>) this.f3600d;
    }

    @Override // Be.k
    protected final Object h(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object collect = this.f3600d.collect(interfaceC2397i, dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
