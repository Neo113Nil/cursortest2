package Ic;

import Gc.g;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* loaded from: classes9.dex */
public abstract class c<T> implements w<T>, InterfaceC8487b {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<InterfaceC8487b> f12161a = new AtomicReference<>();

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        rc.d.a(this.f12161a);
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return this.f12161a.get() == rc.d.DISPOSED;
    }

    @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        AtomicReference<InterfaceC8487b> atomicReference = this.f12161a;
        Class<?> cls = getClass();
        C9656b.c(interfaceC8487b, "next is null");
        while (!atomicReference.compareAndSet(null, interfaceC8487b)) {
            if (atomicReference.get() != null) {
                interfaceC8487b.dispose();
                if (atomicReference.get() != rc.d.DISPOSED) {
                    g.a(cls);
                    return;
                }
                return;
            }
        }
    }
}
