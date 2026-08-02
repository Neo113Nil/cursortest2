package androidx.compose.ui.draw;

import androidx.collection.J;
import l1.InterfaceC7823h0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class f implements InterfaceC7823h0 {

    /* renamed from: a, reason: collision with root package name */
    private J<o1.d> f40355a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC7823h0 f40356b;

    @Override // l1.InterfaceC7823h0
    @NotNull
    public final o1.d a() {
        InterfaceC7823h0 interfaceC7823h0 = this.f40356b;
        if (interfaceC7823h0 == null) {
            A1.a.b("GraphicsContext not provided");
            throw null;
        }
        o1.d a11 = interfaceC7823h0.a();
        J<o1.d> j11 = this.f40355a;
        if (j11 != null) {
            j11.b(a11);
            return a11;
        }
        J<o1.d> j12 = new J<>(1);
        j12.b(a11);
        this.f40355a = j12;
        return a11;
    }

    @Override // l1.InterfaceC7823h0
    public final void b(@NotNull o1.d dVar) {
        InterfaceC7823h0 interfaceC7823h0 = this.f40356b;
        if (interfaceC7823h0 != null) {
            interfaceC7823h0.b(dVar);
        }
    }

    public final InterfaceC7823h0 c() {
        return this.f40356b;
    }

    public final void d() {
        J<o1.d> j11 = this.f40355a;
        if (j11 != null) {
            Object[] objArr = j11.f38646a;
            int i11 = j11.f38647b;
            for (int i12 = 0; i12 < i11; i12++) {
                b((o1.d) objArr[i12]);
            }
            j11.c();
        }
    }

    public final void e(InterfaceC7823h0 interfaceC7823h0) {
        d();
        this.f40356b = interfaceC7823h0;
    }
}
