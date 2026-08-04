package p073k2;

import p068j2.j;

/* JADX INFO: loaded from: classes.dex */
public final class g extends j implements Comparable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f14765A;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (f(4) == gVar.f(4)) {
            long j = this.f1699f - gVar.f1699f;
            if (j == 0) {
                j = this.f14765A - gVar.f14765A;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!f(4)) {
            return -1;
        }
        return 1;
    }
}
