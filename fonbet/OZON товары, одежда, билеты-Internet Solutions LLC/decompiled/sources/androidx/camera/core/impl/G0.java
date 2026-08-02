package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.F0;
import androidx.camera.core.impl.InterfaceC5129y0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import x2.InterfaceC10646a;

/* loaded from: classes8.dex */
public final class G0 {

    /* renamed from: b, reason: collision with root package name */
    public static final F0 f38121b;

    /* renamed from: c, reason: collision with root package name */
    private static final G0 f38122c;

    /* renamed from: a, reason: collision with root package name */
    private final C5125w0<F0> f38123a = new C5125w0<>(f38121b);

    private static class a<T> implements InterfaceC5129y0.a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC10646a<T> f38124a;

        a(@NonNull InterfaceC10646a<T> interfaceC10646a) {
            this.f38124a = interfaceC10646a;
        }

        @Override // androidx.camera.core.impl.InterfaceC5129y0.a
        public final void a(T t2) {
            this.f38124a.accept(t2);
        }

        @Override // androidx.camera.core.impl.InterfaceC5129y0.a
        public final void onError(@NonNull Throwable th2) {
            C.S.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th2);
        }
    }

    static {
        F0.a aVar = new F0.a();
        aVar.d(true);
        f38121b = aVar.a();
        f38122c = new G0();
    }

    @NonNull
    public static G0 b() {
        return f38122c;
    }

    @NonNull
    public final F0 a() {
        try {
            return this.f38123a.b().get();
        } catch (InterruptedException | ExecutionException e11) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e11);
        }
    }

    public final void c(@NonNull Executor executor, @NonNull InterfaceC10646a<F0> interfaceC10646a) {
        this.f38123a.c(executor, new a(interfaceC10646a));
    }

    public final void d(@NonNull F0 f02) {
        this.f38123a.i(f02);
    }
}
