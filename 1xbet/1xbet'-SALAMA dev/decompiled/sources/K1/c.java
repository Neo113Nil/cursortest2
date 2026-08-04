package K1;

import E3.AbstractC0167z;
import E3.C0165x;
import E3.L;
import java.util.List;
import p068j2.f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f3895b;

    public /* synthetic */ c(long j, L l7) {
        this.f3894a = j;
        this.f3895b = l7;
    }

    @Override // p068j2.f
    public int d(long j) {
        return this.f3894a > j ? 0 : -1;
    }

    @Override // p068j2.f
    public long h(int i7) {
        p151v2.a.f(i7 == 0);
        return this.f3894a;
    }

    @Override // p068j2.f
    public List m(long j) {
        if (j >= this.f3894a) {
            return this.f3895b;
        }
        C0165x c0165x = AbstractC0167z.f2083b;
        return L.f2000e;
    }

    @Override // p068j2.f
    public int p() {
        return 1;
    }
}
