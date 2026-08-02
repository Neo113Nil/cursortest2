package B;

import C.InterfaceC2694n;
import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.H;
import v.D0;
import v.Q;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private Q f1318a;

    public h(@NonNull Q q11) {
        this.f1318a = q11;
    }

    @NonNull
    public static h a(@NonNull InterfaceC2694n interfaceC2694n) {
        if (interfaceC2694n instanceof D0) {
            ((D0) interfaceC2694n).getClass();
            return null;
        }
        H o11 = ((H) interfaceC2694n).o();
        x2.i.a("CameraInfo doesn't contain Camera2 implementation.", o11 instanceof Q);
        return ((Q) o11).r();
    }

    public final <T> T b(@NonNull CameraCharacteristics.Key<T> key) {
        return (T) this.f1318a.s().a(key);
    }

    @NonNull
    public final String c() {
        return this.f1318a.b();
    }
}
