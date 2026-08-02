package P;

/* loaded from: classes.dex */
public final class Q0 extends Z.w {

    /* renamed from: c, reason: collision with root package name */
    public float f4390c;

    public Q0(float f, long j5) {
        super(j5);
        this.f4390c = f;
    }

    @Override // Z.w
    public final void a(Z.w wVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord", wVar);
        this.f4390c = ((Q0) wVar).f4390c;
    }

    @Override // Z.w
    public final Z.w b(long j5) {
        return new Q0(this.f4390c, j5);
    }
}
