package B1;

import A1.Q0;
import A1.R0;
import c2.D;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f995a;

    /* renamed from: b, reason: collision with root package name */
    public int f996b;

    /* renamed from: c, reason: collision with root package name */
    public long f997c;

    /* renamed from: d, reason: collision with root package name */
    public final D f998d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f999e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1000f;

    /* renamed from: g, reason: collision with root package name */
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
        R0 r02 = aVar.f969b;
        int b7 = r02.b(d7.f10161a);
        int b8 = r02.b(d8.f10161a);
        if (d7.f10164d < d8.f10164d || b7 < b8) {
            return false;
        }
        if (b7 > b8) {
            return true;
        }
        boolean a2 = d7.a();
        int i7 = d8.f10162b;
        if (!a2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(R0 r02, R0 r03) {
        int i7 = this.f996b;
        if (i7 < r02.o()) {
            j jVar = this.f1001g;
            r02.n(i7, jVar.f1004a);
            Q0 q02 = jVar.f1004a;
            for (int i8 = q02.f208F; i8 <= q02.f209G; i8++) {
                int b7 = r03.b(r02.l(i8));
                if (b7 != -1) {
                    i7 = r03.f(b7, jVar.f1005b, false).f188c;
                    break;
                }
            }
            i7 = -1;
        }
        this.f996b = i7;
        if (i7 == -1) {
            return false;
        }
        D d7 = this.f998d;
        return d7 == null || r03.b(d7.f10161a) != -1;
    }
}
