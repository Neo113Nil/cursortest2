package L4;

import I4.u;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public final class j extends u {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceArray f1545e;

    public j(long j2, j jVar, int i2) {
        super(j2, jVar, i2);
        this.f1545e = new AtomicReferenceArray(i.f1544f);
    }

    @Override // I4.u
    public final int f() {
        return i.f1544f;
    }

    @Override // I4.u
    public final void g(int i2, InterfaceC1223i interfaceC1223i) {
        this.f1545e.set(i2, i.f1543e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1323c + ", hashCode=" + hashCode() + ']';
    }
}
