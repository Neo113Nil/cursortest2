package J0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3286e2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A0.g f13199a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final A0.g f13200b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final A0.g f13201c;

    public C3286e2() {
        this(0);
    }

    @NotNull
    public final A0.a a() {
        return this.f13201c;
    }

    @NotNull
    public final A0.a b() {
        return this.f13200b;
    }

    @NotNull
    public final A0.a c() {
        return this.f13199a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3286e2)) {
            return false;
        }
        C3286e2 c3286e2 = (C3286e2) obj;
        return Intrinsics.d(this.f13199a, c3286e2.f13199a) && Intrinsics.d(this.f13200b, c3286e2.f13200b) && Intrinsics.d(this.f13201c, c3286e2.f13201c);
    }

    public final int hashCode() {
        return this.f13201c.hashCode() + ((this.f13200b.hashCode() + (this.f13199a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Shapes(small=" + this.f13199a + ", medium=" + this.f13200b + ", large=" + this.f13201c + ')';
    }

    public C3286e2(int i11) {
        A0.g b11 = A0.h.b(4);
        A0.g b12 = A0.h.b(4);
        A0.g b13 = A0.h.b(0);
        this.f13199a = b11;
        this.f13200b = b12;
        this.f13201c = b13;
    }
}
