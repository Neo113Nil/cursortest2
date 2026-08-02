package androidx.compose.ui.platform;

import S0.C3991w0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j2 implements i2 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C3991w0 f40898b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3991w0 f40899a;

    static {
        C3991w0 f7;
        f7 = S0.n1.f(x1.J.a(0), S0.D1.f25195a);
        f40898b = f7;
    }

    public j2() {
        C3991w0 f7;
        f7 = S0.n1.f(Boolean.FALSE, S0.D1.f25195a);
        this.f40899a = f7;
    }

    public static void b(int i11) {
        f40898b.setValue(x1.J.a(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.i2
    public final boolean a() {
        return ((Boolean) this.f40899a.getValue()).booleanValue();
    }

    public final void c(boolean z11) {
        this.f40899a.setValue(Boolean.valueOf(z11));
    }
}
