package g2;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j, long j3, long j7, long j8, List list, long j9, List list2, long j10, long j11) {
        super(jVar, j, j3, j7, j8, list, j9, j10, j11);
        this.j = list2;
    }

    @Override // g2.n
    public final long d(long j) {
        return this.j.size();
    }

    @Override // g2.n
    public final j h(k kVar, long j) {
        return (j) this.j.get((int) (j - this.f13169d));
    }

    @Override // g2.n
    public final boolean i() {
        return true;
    }
}
