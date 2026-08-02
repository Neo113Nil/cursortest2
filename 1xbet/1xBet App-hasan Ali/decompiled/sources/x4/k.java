package x4;

import java.util.concurrent.atomic.AtomicReferenceArray;
import u4.q;

/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f21115e;

    public k(long j5, k kVar, int i) {
        super(j5, kVar, i);
        this.f21115e = new AtomicReferenceArray(j.f);
    }

    @Override // u4.q
    public final int f() {
        return j.f;
    }

    @Override // u4.q
    public final void g(int i, a4.h hVar) {
        this.f21115e.set(i, j.f21114e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f20113c + ", hashCode=" + hashCode() + ']';
    }
}
