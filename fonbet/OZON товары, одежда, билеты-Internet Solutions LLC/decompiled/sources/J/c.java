package J;

import C.L;
import G.j;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.impl.X0;

/* loaded from: classes8.dex */
public final class c implements L {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5130z f12611a;

    public c(@NonNull InterfaceC5130z interfaceC5130z) {
        this.f12611a = interfaceC5130z;
    }

    @Override // C.L
    @NonNull
    public final X0 a() {
        return this.f12611a.a();
    }

    @Override // C.L
    public final void b(@NonNull j.b bVar) {
        this.f12611a.b(bVar);
    }

    @Override // C.L
    public final int c() {
        return 0;
    }

    @NonNull
    public final InterfaceC5130z d() {
        return this.f12611a;
    }

    @Override // C.L
    public final long getTimestamp() {
        return this.f12611a.getTimestamp();
    }
}
