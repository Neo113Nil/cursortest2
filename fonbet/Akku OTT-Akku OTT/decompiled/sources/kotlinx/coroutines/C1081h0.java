package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.h0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1081h0 implements InterfaceC1110s0 {
    public final boolean a;

    public C1081h0(boolean z) {
        this.a = z;
    }

    @Override // kotlinx.coroutines.InterfaceC1110s0
    public final I0 b() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC1110s0
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return androidx.compose.runtime.t.b('}', this.a ? "Active" : "New", new StringBuilder("Empty{"));
    }
}
