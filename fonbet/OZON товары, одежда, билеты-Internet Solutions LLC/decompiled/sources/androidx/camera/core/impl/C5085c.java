package androidx.camera.core.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5085c extends N {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f38272a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f38273b;

    C5085c(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f38272a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f38273b = handler;
    }

    @Override // androidx.camera.core.impl.N
    @NonNull
    public final Executor b() {
        return this.f38272a;
    }

    @Override // androidx.camera.core.impl.N
    @NonNull
    public final Handler c() {
        return this.f38273b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n11 = (N) obj;
        return this.f38272a.equals(n11.b()) && this.f38273b.equals(n11.c());
    }

    public final int hashCode() {
        return ((this.f38272a.hashCode() ^ 1000003) * 1000003) ^ this.f38273b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f38272a + ", schedulerHandler=" + this.f38273b + "}";
    }
}
