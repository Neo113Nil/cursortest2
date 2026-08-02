package S;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.T;

/* loaded from: classes8.dex */
public final class d implements J0 {

    /* renamed from: G, reason: collision with root package name */
    @NonNull
    private A0 f25184G;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private C5123v0 f25185a = C5123v0.R();

        @NonNull
        public final d a() {
            return new d(A0.Q(this.f25185a));
        }

        @NonNull
        public final void b(@NonNull CaptureRequest.Key key, @NonNull Object obj) {
            this.f25185a.U(T.a.b("camera2.captureRequest.option." + key.getName(), key), obj);
        }
    }

    d(A0 a02) {
        this.f25184G = a02;
    }

    @Override // androidx.camera.core.impl.J0
    @NonNull
    public final T s() {
        return this.f25184G;
    }
}
