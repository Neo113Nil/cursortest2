package P;

/* loaded from: classes.dex */
public final class R0 extends Z.w {

    /* renamed from: c, reason: collision with root package name */
    public int f4391c;

    public R0(int i, long j5) {
        super(j5);
        this.f4391c = i;
    }

    @Override // Z.w
    public final void a(Z.w wVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord", wVar);
        this.f4391c = ((R0) wVar).f4391c;
    }

    @Override // Z.w
    public final Z.w b(long j5) {
        return new R0(this.f4391c, j5);
    }
}
