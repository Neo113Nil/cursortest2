package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5129y0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class U<T> implements InterfaceC5129y0<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final U<Object> f38212b = new U<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.m<T> f38213a;

    private U(T t2) {
        this.f38213a = I.k.h(t2);
    }

    public static /* synthetic */ void a(U u11, InterfaceC5129y0.a aVar) {
        u11.getClass();
        try {
            aVar.a(u11.f38213a.get());
        } catch (InterruptedException | ExecutionException e11) {
            aVar.onError(e11);
        }
    }

    @NonNull
    public static U f(Object obj) {
        return obj == null ? f38212b : new U(obj);
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0
    @NonNull
    public final com.google.common.util.concurrent.m<T> b() {
        return this.f38213a;
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0
    public final void c(@NonNull Executor executor, @NonNull InterfaceC5129y0.a<? super T> aVar) {
        this.f38213a.a(new VS.a(1, this, aVar), executor);
    }

    @Override // androidx.camera.core.impl.InterfaceC5129y0
    public final void d(@NonNull InterfaceC5129y0.a<? super T> aVar) {
    }
}
