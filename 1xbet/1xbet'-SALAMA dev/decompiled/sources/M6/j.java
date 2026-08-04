package M6;

import I6.u;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceArray f4628e;

    public j(long j, j jVar, int i7) {
        super(j, jVar, i7);
        this.f4628e = new AtomicReferenceArray(i.f4627f);
    }

    @Override // I6.u
    public final int f() {
        return i.f4627f;
    }

    @Override // I6.u
    public final void g(int i7, p065i6.i iVar) {
        this.f4628e.set(i7, i.f4626e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f3759c + ", hashCode=" + hashCode() + ']';
    }
}
