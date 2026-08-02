package e2;

import A1.X;
import u2.C1640q;
import u2.InterfaceC1636m;

/* renamed from: e2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1013j extends AbstractC1008e {

    /* renamed from: A, reason: collision with root package name */
    public final long f12639A;

    public AbstractC1013j(InterfaceC1636m interfaceC1636m, C1640q c1640q, X x4, int i7, Object obj, long j, long j3, long j7) {
        super(interfaceC1636m, c1640q, 1, x4, i7, obj, j, j3);
        x4.getClass();
        this.f12639A = j7;
    }

    public long a() {
        long j = this.f12639A;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean b();
}
