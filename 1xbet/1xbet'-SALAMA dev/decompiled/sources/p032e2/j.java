package p032e2;

import A1.X;
import p146u2.C0958q;
import p146u2.InterfaceC0954m;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f12645A;

    public j(InterfaceC0954m interfaceC0954m, C0958q c0958q, X x4, int i7, Object obj, long j, long j3, long j7) {
        super(interfaceC0954m, c0958q, 1, x4, i7, obj, j, j3);
        x4.getClass();
        this.f12645A = j7;
    }

    public long a() {
        long j = this.f12645A;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean b();
}
