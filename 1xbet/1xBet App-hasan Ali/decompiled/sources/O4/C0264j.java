package O4;

import java.util.concurrent.CompletableFuture;

/* renamed from: O4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264j extends CompletableFuture {

    /* renamed from: k, reason: collision with root package name */
    public final A f4214k;

    public C0264j(A a5) {
        this.f4214k = a5;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        if (z3) {
            this.f4214k.cancel();
        }
        return super.cancel(z3);
    }
}
