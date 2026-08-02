package D1;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2825z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final H f5575a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f5576b;

    public C2825z(@NotNull H h11, @NotNull B1.V v11) {
        C3991w0 f7;
        this.f5575a = h11;
        f7 = n1.f(v11, D1.f25195a);
        this.f5576b = f7;
    }

    private final B1.V a() {
        return (B1.V) this.f5576b.getValue();
    }

    public final int b(int i11) {
        B1.V a11 = a();
        H h11 = this.f5575a;
        return a11.maxIntrinsicHeight(h11.e0(), h11.z(), i11);
    }

    public final int c(int i11) {
        B1.V a11 = a();
        H h11 = this.f5575a;
        return a11.maxIntrinsicWidth(h11.e0(), h11.z(), i11);
    }

    public final int d(int i11) {
        B1.V a11 = a();
        H h11 = this.f5575a;
        return a11.maxIntrinsicHeight(h11.e0(), h11.y(), i11);
    }

    public final int e(int i11) {
        B1.V a11 = a();
        H h11 = this.f5575a;
        return a11.maxIntrinsicWidth(h11.e0(), h11.y(), i11);
    }

    public final int f(int i11) {
        B1.V a11 = a();
        H h11 = this.f5575a;
        return a11.minIntrinsicHeight(h11.e0(), h11.z(), i11);
    }

    public final int g(int i11) {
        B1.V a11 = a();
        H h11 = this.f5575a;
        return a11.minIntrinsicWidth(h11.e0(), h11.z(), i11);
    }

    public final int h(int i11) {
        B1.V a11 = a();
        H h11 = this.f5575a;
        return a11.minIntrinsicHeight(h11.e0(), h11.y(), i11);
    }

    public final int i(int i11) {
        B1.V a11 = a();
        H h11 = this.f5575a;
        return a11.minIntrinsicWidth(h11.e0(), h11.y(), i11);
    }

    public final void j(@NotNull B1.V v11) {
        this.f5576b.setValue(v11);
    }
}
