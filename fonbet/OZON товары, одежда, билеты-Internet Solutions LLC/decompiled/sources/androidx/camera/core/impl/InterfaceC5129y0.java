package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC5129y0<T> {

    /* renamed from: androidx.camera.core.impl.y0$a */
    public interface a<T> {
        void a(T t2);

        void onError(@NonNull Throwable th2);
    }

    @NonNull
    com.google.common.util.concurrent.m<T> b();

    void c(@NonNull Executor executor, @NonNull a<? super T> aVar);

    void d(@NonNull a<? super T> aVar);
}
