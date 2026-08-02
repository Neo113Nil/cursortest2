package Be;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* loaded from: classes.dex */
public abstract class k<S, T> extends AbstractC2635g<T> {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    protected final InterfaceC2395h<S> f3600d;

    public k(int i11, @NotNull InterfaceC2395h interfaceC2395h, @NotNull CoroutineContext coroutineContext, @NotNull EnumC11113a enumC11113a) {
        super(coroutineContext, i11, enumC11113a);
        this.f3600d = interfaceC2395h;
    }

    @Override // Be.AbstractC2635g, Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object b11;
        if (this.f3580b == -3) {
            CoroutineContext context = dVar.getContext();
            CoroutineContext b12 = xe.G.b(context, this.f3579a);
            if (Intrinsics.d(b12, context)) {
                Object h11 = h(interfaceC2397i, dVar);
                return h11 == Wc.a.COROUTINE_SUSPENDED ? h11 : Unit.f71690a;
            }
            e.Companion companion = kotlin.coroutines.e.INSTANCE;
            if (Intrinsics.d(b12.get(companion), context.get(companion))) {
                b11 = C2636h.b(b12, C2636h.a(interfaceC2397i, dVar.getContext()), De.G.b(b12), new j(this, null), dVar);
                return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
            }
        }
        Object collect = super.collect(interfaceC2397i, dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }

    @Override // Be.AbstractC2635g
    protected final Object d(@NotNull ze.u<? super T> uVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object h11 = h(new E(uVar), dVar);
        return h11 == Wc.a.COROUTINE_SUSPENDED ? h11 : Unit.f71690a;
    }

    protected abstract Object h(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Override // Be.AbstractC2635g
    @NotNull
    public final String toString() {
        return this.f3600d + " -> " + super.toString();
    }
}
