package Ae;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* loaded from: classes.dex */
final class z0<T> implements M0<T>, InterfaceC2385c<T>, Be.w<T> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ x0 f1177a;

    /* renamed from: b, reason: collision with root package name */
    private final xe.B0 f1178b;

    public z0(@NotNull x0 x0Var, xe.B0 b02) {
        this.f1177a = x0Var;
        this.f1178b = b02;
    }

    @Override // Be.w
    @NotNull
    public final InterfaceC2395h<T> a(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return (((i11 < 0 || i11 >= 2) && i11 != -2) || enumC11113a != EnumC11113a.DROP_OLDEST) ? E0.d(this, coroutineContext, i11, enumC11113a) : this;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<?> dVar) {
        return this.f1177a.collect(interfaceC2397i, dVar);
    }

    @Override // Ae.M0
    public final T getValue() {
        return this.f1177a.getValue();
    }
}
