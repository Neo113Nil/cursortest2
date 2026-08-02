package k6;

import i6.InterfaceC1287d;
import i6.InterfaceC1292i;

/* renamed from: k6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1355b implements InterfaceC1287d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1355b f14792a = new C1355b();

    @Override // i6.InterfaceC1287d
    public final InterfaceC1292i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // i6.InterfaceC1287d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
