package D4;

import D4.C2830e;
import a1.C4912a;
import org.jetbrains.annotations.NotNull;

/* renamed from: D4.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2831f extends B4.J<C2830e.a> {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2830e f5889g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C4912a f5890h;

    public C2831f(@NotNull C2830e c2830e, @NotNull String str, @NotNull C4912a c4912a) {
        super(c2830e, str);
        this.f5889g = c2830e;
        this.f5890h = c4912a;
    }

    @Override // B4.J
    public final C2830e.a b() {
        return (C2830e.a) super.b();
    }

    @Override // B4.J
    public final C2830e.a e() {
        return new C2830e.a(this.f5889g, this.f5890h);
    }
}
