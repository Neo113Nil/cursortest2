package M;

/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements i0.q, kotlin.jvm.internal.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A.l f3486k;

    public r0(A.l lVar) {
        this.f3486k = lVar;
    }

    @Override // i0.q
    public final long a() {
        return ((i0.p) this.f3486k.get()).f17295a;
    }

    @Override // kotlin.jvm.internal.g
    public final W3.c b() {
        return this.f3486k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0.q) || !(obj instanceof kotlin.jvm.internal.g)) {
            return false;
        }
        return this.f3486k.equals(((kotlin.jvm.internal.g) obj).b());
    }

    public final int hashCode() {
        return this.f3486k.hashCode();
    }
}
