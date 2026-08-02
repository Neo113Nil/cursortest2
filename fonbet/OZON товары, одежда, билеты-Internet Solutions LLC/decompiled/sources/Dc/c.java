package Dc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
final class c implements Future<Object> {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC8487b f6335a;

    c(InterfaceC8487b interfaceC8487b) {
        this.f6335a = interfaceC8487b;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        this.f6335a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }
}
