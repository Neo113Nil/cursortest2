package Ae;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

/* loaded from: classes.dex */
final class y0<T> implements B0<T>, InterfaceC2385c<T>, Be.w<T> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ w0 f1168a;

    /* renamed from: b, reason: collision with root package name */
    private final xe.B0 f1169b;

    public y0(@NotNull w0 w0Var, xe.B0 b02) {
        this.f1168a = w0Var;
        this.f1169b = b02;
    }

    @Override // Be.w
    @NotNull
    public final InterfaceC2395h<T> a(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return E0.d(this, coroutineContext, i11, enumC11113a);
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<?> dVar) {
        return this.f1168a.collect(interfaceC2397i, dVar);
    }
}
