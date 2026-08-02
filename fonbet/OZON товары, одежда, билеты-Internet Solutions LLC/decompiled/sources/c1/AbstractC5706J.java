package c1;

import org.jetbrains.annotations.NotNull;

/* renamed from: c1.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5706J {

    /* renamed from: a, reason: collision with root package name */
    private int f56190a = C5721l.C().f();

    /* renamed from: b, reason: collision with root package name */
    private AbstractC5706J f56191b;

    public abstract void a(@NotNull AbstractC5706J abstractC5706J);

    @NotNull
    public abstract AbstractC5706J b();

    public final AbstractC5706J c() {
        return this.f56191b;
    }

    public final int d() {
        return this.f56190a;
    }

    public final void e(AbstractC5706J abstractC5706J) {
        this.f56191b = abstractC5706J;
    }

    public final void f(int i11) {
        this.f56190a = i11;
    }
}
