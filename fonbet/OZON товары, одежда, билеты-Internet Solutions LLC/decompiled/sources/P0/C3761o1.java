package P0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: P0.o1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3761o1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A0.g f21270a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final A0.g f21271b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final A0.g f21272c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final A0.g f21273d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final A0.g f21274e;

    public C3761o1() {
        this(0);
    }

    @NotNull
    public final A0.a a() {
        return this.f21274e;
    }

    @NotNull
    public final A0.a b() {
        return this.f21270a;
    }

    @NotNull
    public final A0.a c() {
        return this.f21273d;
    }

    @NotNull
    public final A0.a d() {
        return this.f21272c;
    }

    @NotNull
    public final A0.a e() {
        return this.f21271b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3761o1)) {
            return false;
        }
        C3761o1 c3761o1 = (C3761o1) obj;
        return Intrinsics.d(this.f21270a, c3761o1.f21270a) && Intrinsics.d(this.f21271b, c3761o1.f21271b) && Intrinsics.d(this.f21272c, c3761o1.f21272c) && Intrinsics.d(this.f21273d, c3761o1.f21273d) && Intrinsics.d(this.f21274e, c3761o1.f21274e);
    }

    public final int hashCode() {
        return this.f21274e.hashCode() + ((this.f21273d.hashCode() + ((this.f21272c.hashCode() + ((this.f21271b.hashCode() + (this.f21270a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Shapes(extraSmall=" + this.f21270a + ", small=" + this.f21271b + ", medium=" + this.f21272c + ", large=" + this.f21273d + ", extraLarge=" + this.f21274e + ')';
    }

    public C3761o1(int i11) {
        A0.g b11 = C3758n1.b();
        A0.g e11 = C3758n1.e();
        A0.g d11 = C3758n1.d();
        A0.g c11 = C3758n1.c();
        A0.g a11 = C3758n1.a();
        this.f21270a = b11;
        this.f21271b = e11;
        this.f21272c = d11;
        this.f21273d = c11;
        this.f21274e = a11;
    }
}
