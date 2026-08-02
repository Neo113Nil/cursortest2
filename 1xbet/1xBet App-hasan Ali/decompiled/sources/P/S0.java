package P;

/* loaded from: classes.dex */
public final class S0 extends Z.w {

    /* renamed from: c, reason: collision with root package name */
    public long f4395c;

    public S0(long j5, long j6) {
        super(j5);
        this.f4395c = j6;
    }

    @Override // Z.w
    public final void a(Z.w wVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord", wVar);
        this.f4395c = ((S0) wVar).f4395c;
    }

    @Override // Z.w
    public final Z.w b(long j5) {
        return new S0(j5, this.f4395c);
    }
}
