package c1;

import S0.C3954f;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5705I implements InterfaceC5704H {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3954f f56189a = new C3954f(0);

    public final boolean w(int i11) {
        return (i11 & this.f56189a.get()) != 0;
    }

    public final void x(int i11) {
        C3954f c3954f;
        int i12;
        do {
            c3954f = this.f56189a;
            i12 = c3954f.get();
            if ((i12 & i11) != 0) {
                return;
            }
        } while (!c3954f.compareAndSet(i12, i12 | i11));
    }
}
