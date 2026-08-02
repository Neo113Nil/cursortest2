package androidx.core.view;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private int f42226a;

    /* renamed from: b, reason: collision with root package name */
    private int f42227b;

    public final int a() {
        return this.f42226a | this.f42227b;
    }

    public final void b(int i11) {
        this.f42226a = i11;
    }

    public final void c(int i11, int i12) {
        if (i12 == 1) {
            this.f42227b = i11;
        } else {
            this.f42226a = i11;
        }
    }

    public final void d() {
        this.f42226a = 0;
    }

    public final void e(int i11) {
        if (i11 == 1) {
            this.f42227b = 0;
        } else {
            this.f42226a = 0;
        }
    }
}
