package B1;

import A1.Q0;
import A1.R0;
import p018c2.D;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D f998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f1001g;

    public i(j jVar, String str, int i7, D d7) {
        this.f1001g = jVar;
        this.f995a = str;
        this.f996b = i7;
        this.f997c = d7 == null ? -1L : d7.f10164d;
        if (d7 == null || !d7.a()) {
            return;
        }
        this.f998d = d7;
    }

    public final boolean a(a aVar) {
        long j = this.f997c;
        if (j == -1) {
            return false;
        }
        D d7 = aVar.f971d;
        if (d7 == null) {
            return this.f996b != aVar.f970c;
        }
        if (d7.f10164d > j) {
            return true;
        }
        D d8 = this.f998d;
        if (d8 == null) {
            return false;
        }
        R0 r7 = aVar.f969b;
        int iB = r7.b(d7.f10161a);
        int iB2 = r7.b(d8.f10161a);
        if (d7.f10164d < d8.f10164d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        boolean zA = d7.a();
        int i7 = d8.f10162b;
        if (!zA) {
            int i8 = d7.f10165e;
            return i8 == -1 || i8 > i7;
        }
        int i9 = d7.f10162b;
        if (i9 <= i7) {
            if (i9 != i7) {
                return false;
            }
            if (d7.f10163c <= d8.f10163c) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(R0 r7, R0 r8) {
        int i7 = this.f996b;
        if (i7 < r7.o()) {
            j jVar = this.f1001g;
            r7.n(i7, jVar.f1004a);
            Q0 q1 = jVar.f1004a;
            int i8 = q1.f208F;
            while (true) {
                if (i8 > q1.f209G) {
                    i7 = -1;
                    break;
                }
                int iB = r8.b(r7.l(i8));
                if (iB != -1) {
                    i7 = r8.f(iB, jVar.f1005b, false).f188c;
                    break;
                }
                i8++;
            }
        } else if (i7 >= r8.o()) {
            i7 = -1;
            break;
        }
        this.f996b = i7;
        if (i7 == -1) {
            return false;
        }
        D d7 = this.f998d;
        return d7 == null || r8.b(d7.f10161a) != -1;
    }
}
