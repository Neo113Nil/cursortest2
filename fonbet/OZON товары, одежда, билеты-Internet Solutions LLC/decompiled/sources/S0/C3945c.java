package S0;

import org.jetbrains.annotations.NotNull;

/* renamed from: S0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3945c {

    /* renamed from: a, reason: collision with root package name */
    private int f25360a;

    public C3945c(int i11) {
        this.f25360a = i11;
    }

    public final int a() {
        return this.f25360a;
    }

    public final boolean b() {
        return this.f25360a != Integer.MIN_VALUE;
    }

    public final void c(int i11) {
        this.f25360a = i11;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return K00.b.e(this.f25360a, " }", sb2);
    }
}
