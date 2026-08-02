package D1;

import org.jetbrains.annotations.NotNull;

/* renamed from: D1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2816p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f5543a = Sc.k.a(Sc.n.NONE, C2815o.f5542b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K0<H> f5544b = new K0<>(new C2814n());

    public final void a(@NotNull H h11) {
        if (h11.z0()) {
            this.f5544b.add(h11);
        } else {
            A1.a.b("DepthSortedSet.add called on an unattached node");
            throw null;
        }
    }

    public final boolean b(@NotNull H h11) {
        return this.f5544b.contains(h11);
    }

    public final boolean c() {
        return this.f5544b.isEmpty();
    }

    @NotNull
    public final H d() {
        H first = this.f5544b.first();
        e(first);
        return first;
    }

    public final boolean e(@NotNull H h11) {
        if (h11.z0()) {
            return this.f5544b.remove(h11);
        }
        A1.a.b("DepthSortedSet.remove called on an unattached node");
        throw null;
    }

    @NotNull
    public final String toString() {
        return this.f5544b.toString();
    }
}
