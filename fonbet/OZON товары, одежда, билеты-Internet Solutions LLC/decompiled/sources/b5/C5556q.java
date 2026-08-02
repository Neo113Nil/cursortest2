package b5;

import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* renamed from: b5.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5556q {

    /* renamed from: a, reason: collision with root package name */
    private final WebSettingsBoundaryInterface f55535a;

    public C5556q(@NonNull WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f55535a = webSettingsBoundaryInterface;
    }

    public final void a(boolean z11) {
        this.f55535a.setAlgorithmicDarkeningAllowed(z11);
    }

    public final void b(int i11) {
        this.f55535a.setForceDark(i11);
    }

    public final void c() {
        this.f55535a.setForceDarkBehavior(1);
    }
}
