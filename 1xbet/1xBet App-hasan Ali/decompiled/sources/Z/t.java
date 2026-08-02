package Z;

/* loaded from: classes.dex */
public final class t extends w {

    /* renamed from: c, reason: collision with root package name */
    public T.c f6238c;

    /* renamed from: d, reason: collision with root package name */
    public int f6239d;

    /* renamed from: e, reason: collision with root package name */
    public int f6240e;

    public t(long j5, T.c cVar) {
        super(j5);
        this.f6238c = cVar;
    }

    @Override // Z.w
    public final void a(w wVar) {
        synchronized (q.f6219a) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>", wVar);
            this.f6238c = ((t) wVar).f6238c;
            this.f6239d = ((t) wVar).f6239d;
            this.f6240e = ((t) wVar).f6240e;
        }
    }

    @Override // Z.w
    public final w b(long j5) {
        return new t(j5, this.f6238c);
    }
}
