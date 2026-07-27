package E2;

import B2.t;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class k extends t {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceArray f361e;

    public k(long j3, k kVar, int i3) {
        super(j3, kVar, i3);
        this.f361e = new AtomicReferenceArray(j.f);
    }

    @Override // B2.t
    public final int f() {
        return j.f;
    }

    @Override // B2.t
    public final void g(int i3, g2.h hVar) {
        this.f361e.set(i3, j.f360e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f181c + ", hashCode=" + hashCode() + ']';
    }
}
