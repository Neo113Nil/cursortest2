package R;

import G.r;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.C5092f0;
import androidx.camera.core.impl.H;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class l extends C5092f0 {

    /* renamed from: b, reason: collision with root package name */
    private final String f23891b;

    /* renamed from: c, reason: collision with root package name */
    private int f23892c;

    l(@NonNull H h11) {
        super(h11);
        this.f23891b = "virtual-" + h11.b() + "-" + UUID.randomUUID().toString();
    }

    @Override // androidx.camera.core.impl.C5092f0, androidx.camera.core.impl.H
    @NonNull
    public final String b() {
        return this.f23891b;
    }

    @Override // androidx.camera.core.impl.C5092f0, C.InterfaceC2694n
    public final int g(int i11) {
        return r.h(super.g(i11) - this.f23892c);
    }

    @Override // androidx.camera.core.impl.C5092f0, C.InterfaceC2694n
    public final int i() {
        return g(0);
    }

    final void r(int i11) {
        this.f23892c = i11;
    }
}
