package B1;

import B1.m0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class u0 extends m0.a {

    /* renamed from: b, reason: collision with root package name */
    private final int f2153b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Z1.s f2154c;

    public u0(int i11, @NotNull Z1.s sVar) {
        this.f2153b = i11;
        this.f2154c = sVar;
    }

    @Override // B1.m0.a
    @NotNull
    protected final Z1.s b() {
        return this.f2154c;
    }

    @Override // B1.m0.a
    protected final int c() {
        return this.f2153b;
    }
}
