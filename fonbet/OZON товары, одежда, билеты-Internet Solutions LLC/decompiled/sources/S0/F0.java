package S0;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class F0<T> implements E0<T>, InterfaceC3978p0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f25200a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC3978p0<T> f25201b;

    public F0(@NotNull InterfaceC3978p0<T> interfaceC3978p0, @NotNull CoroutineContext coroutineContext) {
        this.f25200a = coroutineContext;
        this.f25201b = interfaceC3978p0;
    }

    @Override // xe.M
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f25200a;
    }

    @Override // S0.A1
    public final T getValue() {
        return this.f25201b.getValue();
    }

    @Override // S0.InterfaceC3978p0
    public final void setValue(T t2) {
        this.f25201b.setValue(t2);
    }
}
