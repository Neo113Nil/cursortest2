package S0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final J0 f25323a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25324b;

    /* renamed from: c, reason: collision with root package name */
    private Object f25325c;

    public X(@NotNull J0 j02, int i11, Object obj) {
        this.f25323a = j02;
        this.f25324b = i11;
        this.f25325c = obj;
    }

    public final Object a() {
        return this.f25325c;
    }

    public final int b() {
        return this.f25324b;
    }

    @NotNull
    public final J0 c() {
        return this.f25323a;
    }

    public final boolean d() {
        return this.f25323a.s(this.f25325c);
    }

    public final void e(Object obj) {
        this.f25325c = obj;
    }
}
