package D1;

import S0.InterfaceC3951e;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class L0 implements InterfaceC3951e<H> {

    /* renamed from: a, reason: collision with root package name */
    private final H f5365a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f5366b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private H f5367c;

    public L0(H h11) {
        this.f5365a = h11;
        this.f5367c = h11;
    }

    @Override // S0.InterfaceC3951e
    public final void a(int i11, int i12) {
        ((H) d()).a1(i11, i12);
    }

    @Override // S0.InterfaceC3951e
    public final void b(int i11, int i12, int i13) {
        ((H) d()).T0(i11, i12, i13);
    }

    @Override // S0.InterfaceC3951e
    public final /* bridge */ /* synthetic */ void c(int i11, H h11) {
    }

    @Override // S0.InterfaceC3951e
    public final H d() {
        return this.f5367c;
    }

    @Override // S0.InterfaceC3951e
    public final void e(int i11, H h11) {
        ((H) d()).r0(i11, h11);
    }

    @Override // S0.InterfaceC3951e
    public final void f(H h11) {
        this.f5366b.add(this.f5367c);
        this.f5367c = h11;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [D1.H, java.lang.Object] */
    @Override // S0.InterfaceC3951e
    public final void g() {
        ArrayList arrayList = this.f5366b;
        if (arrayList.isEmpty()) {
            S0.B0.b("empty stack");
            throw null;
        }
        this.f5367c = arrayList.remove(arrayList.size() - 1);
    }

    public final void h() {
        this.f5366b.clear();
        this.f5367c = this.f5365a;
        this.f5365a.Z0();
    }

    public final void i() {
        x0 f02 = this.f5365a.f0();
        if (f02 != null) {
            ((AndroidComposeView) f02).B0();
        }
    }
}
