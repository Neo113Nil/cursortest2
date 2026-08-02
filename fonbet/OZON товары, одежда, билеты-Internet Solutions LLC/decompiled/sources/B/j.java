package B;

import C.B;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.InterfaceC5121u0;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.T;
import u.C9887a;

/* loaded from: classes8.dex */
public class j implements J0 {

    /* renamed from: G, reason: collision with root package name */
    private final T f1321G;

    public static final class a implements B<j> {

        /* renamed from: a, reason: collision with root package name */
        private final C5123v0 f1322a = C5123v0.R();

        public static void c(a aVar, T t2, T.a aVar2) {
            aVar.f1322a.T(aVar2, t2.h(aVar2), t2.a(aVar2));
        }

        @NonNull
        public static a e(@NonNull T t2) {
            a aVar = new a();
            t2.e(new i(aVar, t2));
            return aVar;
        }

        @Override // C.B
        @NonNull
        public final InterfaceC5121u0 a() {
            throw null;
        }

        @NonNull
        public final j d() {
            return new j(A0.Q(this.f1322a));
        }

        @NonNull
        public final void f(@NonNull CaptureRequest.Key key, @NonNull Number number) {
            this.f1322a.U(C9887a.P(key), number);
        }
    }

    public j(@NonNull T t2) {
        this.f1321G = t2;
    }

    @Override // androidx.camera.core.impl.J0
    @NonNull
    public final T s() {
        return this.f1321G;
    }
}
