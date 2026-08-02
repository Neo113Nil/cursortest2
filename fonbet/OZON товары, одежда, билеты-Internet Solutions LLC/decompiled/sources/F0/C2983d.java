package F0;

import B4.V;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;

/* renamed from: F0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2983d {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C2983d f8217e = new C2983d(false, 9205357640488583168L, V1.g.Ltr, false);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8218a;

    /* renamed from: b, reason: collision with root package name */
    private final long f8219b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final V1.g f8220c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8221d;

    public C2983d(boolean z11, long j11, V1.g gVar, boolean z12) {
        this.f8218a = z11;
        this.f8219b = j11;
        this.f8220c = gVar;
        this.f8221d = z12;
    }

    @NotNull
    public final V1.g b() {
        return this.f8220c;
    }

    public final boolean c() {
        return this.f8221d;
    }

    public final long d() {
        return this.f8219b;
    }

    public final boolean e() {
        return this.f8218a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2983d)) {
            return false;
        }
        C2983d c2983d = (C2983d) obj;
        return this.f8218a == c2983d.f8218a && C7459e.d(this.f8219b, c2983d.f8219b) && this.f8220c == c2983d.f8220c && this.f8221d == c2983d.f8221d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8221d) + ((this.f8220c.hashCode() + Pk0.c.a(Boolean.hashCode(this.f8218a) * 31, 31, this.f8219b)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextFieldHandleState(visible=");
        sb2.append(this.f8218a);
        sb2.append(", position=");
        sb2.append((Object) C7459e.m(this.f8219b));
        sb2.append(", direction=");
        sb2.append(this.f8220c);
        sb2.append(", handlesCrossed=");
        return V.d(sb2, this.f8221d, ')');
    }
}
