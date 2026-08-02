package P;

/* loaded from: classes.dex */
public final class T0 extends Z.w {

    /* renamed from: c, reason: collision with root package name */
    public Object f4401c;

    public T0(long j5, Object obj) {
        super(j5);
        this.f4401c = obj;
    }

    @Override // Z.w
    public final void a(Z.w wVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>", wVar);
        this.f4401c = ((T0) wVar).f4401c;
    }

    @Override // Z.w
    public final Z.w b(long j5) {
        return new T0(Z.l.k().g(), this.f4401c);
    }
}
