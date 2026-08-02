package K1;

import E3.AbstractC0167z;
import E3.C0165x;
import E3.L;
import j2.InterfaceC1309f;
import java.util.List;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class c implements InterfaceC1309f {

    /* renamed from: a, reason: collision with root package name */
    public final long f3894a;

    /* renamed from: b, reason: collision with root package name */
    public final L f3895b;

    public /* synthetic */ c(long j, L l7) {
        this.f3894a = j;
        this.f3895b = l7;
    }

    @Override // j2.InterfaceC1309f
    public int d(long j) {
        return this.f3894a > j ? 0 : -1;
    }

    @Override // j2.InterfaceC1309f
    public long h(int i7) {
        AbstractC1664a.f(i7 == 0);
        return this.f3894a;
    }

    @Override // j2.InterfaceC1309f
    public List m(long j) {
        if (j >= this.f3894a) {
            return this.f3895b;
        }
        C0165x c0165x = AbstractC0167z.f2083b;
        return L.f2000e;
    }

    @Override // j2.InterfaceC1309f
    public int p() {
        return 1;
    }
}
