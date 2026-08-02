package H1;

import B1.B;
import D1.AbstractC2810k0;
import I1.r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f10497a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10498b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Z1.o f10499c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AbstractC2810k0 f10500d;

    public p(@NotNull r rVar, int i11, @NotNull Z1.o oVar, @NotNull AbstractC2810k0 abstractC2810k0) {
        this.f10497a = rVar;
        this.f10498b = i11;
        this.f10499c = oVar;
        this.f10500d = abstractC2810k0;
    }

    @NotNull
    public final B a() {
        return this.f10500d;
    }

    public final int b() {
        return this.f10498b;
    }

    @NotNull
    public final r c() {
        return this.f10497a;
    }

    @NotNull
    public final Z1.o d() {
        return this.f10499c;
    }

    @NotNull
    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.f10497a + ", depth=" + this.f10498b + ", viewportBoundsInWindow=" + this.f10499c + ", coordinates=" + this.f10500d + ')';
    }
}
