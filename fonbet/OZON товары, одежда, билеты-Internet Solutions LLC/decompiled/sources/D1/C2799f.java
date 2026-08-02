package D1;

import org.jetbrains.annotations.NotNull;

/* renamed from: D1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2799f implements j1.m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2799f f5438a = new C2799f();

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f5439b;

    public static boolean e() {
        return f5439b != null;
    }

    public static void f() {
        f5439b = null;
    }

    @Override // j1.m
    public final void a(boolean z11) {
        f5439b = Boolean.valueOf(z11);
    }

    @Override // j1.m
    public final boolean c() {
        Boolean bool = f5439b;
        if (bool != null) {
            return bool.booleanValue();
        }
        A1.a.c("canFocus is read before it is written");
        throw null;
    }
}
