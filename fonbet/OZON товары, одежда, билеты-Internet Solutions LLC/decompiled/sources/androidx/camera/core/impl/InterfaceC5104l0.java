package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC5104l0 {

    /* renamed from: androidx.camera.core.impl.l0$a */
    public interface a {
        void a(@NonNull InterfaceC5104l0 interfaceC5104l0);
    }

    Surface a();

    int b();

    int c();

    void close();

    androidx.camera.core.p d();

    androidx.camera.core.p e();

    void f();

    void g(@NonNull a aVar, @NonNull Executor executor);

    int getHeight();

    int getWidth();
}
