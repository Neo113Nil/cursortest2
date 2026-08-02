package R;

import J.n;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.c1;
import java.util.List;

/* loaded from: classes8.dex */
public final class e implements b1<c>, InterfaceC5102k0, n {

    /* renamed from: H, reason: collision with root package name */
    static final T.a<List<c1.b>> f23866H = T.a.a(List.class, "camerax.core.streamSharing.captureTypes");

    /* renamed from: G, reason: collision with root package name */
    private final A0 f23867G;

    e(@NonNull A0 a02) {
        this.f23867G = a02;
    }

    @NonNull
    public final List<c1.b> P() {
        return (List) a(f23866H);
    }

    @Override // androidx.camera.core.impl.J0
    @NonNull
    public final T s() {
        return this.f23867G;
    }
}
