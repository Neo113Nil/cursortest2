package T20;

import A0.g;
import A0.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final float f26565a = 8;

    /* renamed from: b, reason: collision with root package name */
    private static final float f26566b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final g f26567c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final g f26568d;

    static {
        float f7 = 16;
        f26566b = f7;
        f26567c = h.d(f7, f7, 0.0f, 0.0f, 12);
        f26568d = h.d(0.0f, 0.0f, f7, f7, 3);
    }

    @NotNull
    public static g a() {
        return f26568d;
    }

    public static float b() {
        return f26566b;
    }

    public static float c() {
        return f26565a;
    }

    @NotNull
    public static g d() {
        return f26567c;
    }
}
