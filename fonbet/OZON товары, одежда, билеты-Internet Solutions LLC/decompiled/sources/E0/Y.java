package E0;

import Q1.C3844m;
import Q1.InterfaceC3841j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Y implements InterfaceC3841j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3841j[] f7129a;

    Y(InterfaceC3841j[] interfaceC3841jArr) {
        this.f7129a = interfaceC3841jArr;
    }

    @Override // Q1.InterfaceC3841j
    public final void a(@NotNull C3844m c3844m) {
        for (InterfaceC3841j interfaceC3841j : this.f7129a) {
            interfaceC3841j.a(c3844m);
        }
    }
}
