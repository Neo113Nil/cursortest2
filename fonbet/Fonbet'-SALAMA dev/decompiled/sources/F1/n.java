package F1;

import v2.AbstractC1664a;
import w1.P2;

/* loaded from: classes.dex */
public class n implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2546a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2547b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2548c;

    public /* synthetic */ n(Object obj, long j, int i7) {
        this.f2546a = i7;
        this.f2548c = obj;
        this.f2547b = j;
    }

    @Override // F1.s
    public final boolean d() {
        switch (this.f2546a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // F1.s
    public final r h(long j) {
        switch (this.f2546a) {
            case 0:
                o oVar = (o) this.f2548c;
                AbstractC1664a.i(oVar.f2558k);
                P2 p22 = oVar.f2558k;
                long[] jArr = (long[]) p22.f17508b;
                int f7 = v2.t.f(jArr, v2.t.k((oVar.f2553e * j) / 1000000, 0L, oVar.j - 1), false);
                long j3 = f7 == -1 ? 0L : jArr[f7];
                long[] jArr2 = (long[]) p22.f17509c;
                long j7 = f7 != -1 ? jArr2[f7] : 0L;
                int i7 = oVar.f2553e;
                long j8 = (j3 * 1000000) / i7;
                long j9 = this.f2547b;
                t tVar = new t(j8, j7 + j9);
                if (j8 == j || f7 == jArr.length - 1) {
                    return new r(tVar, tVar);
                }
                int i8 = f7 + 1;
                return new r(tVar, new t((jArr[i8] * 1000000) / i7, j9 + jArr2[i8]));
            case 1:
                return (r) this.f2548c;
            default:
                H1.b bVar = (H1.b) this.f2548c;
                r b7 = bVar.f3203g[0].b(j);
                int i9 = 1;
                while (true) {
                    H1.e[] eVarArr = bVar.f3203g;
                    if (i9 >= eVarArr.length) {
                        return b7;
                    }
                    r b8 = eVarArr[i9].b(j);
                    if (b8.f2567a.f2571b < b7.f2567a.f2571b) {
                        b7 = b8;
                    }
                    i9++;
                }
        }
    }

    @Override // F1.s
    public final long i() {
        switch (this.f2546a) {
        }
        return this.f2547b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(long j) {
        this(j, 0L);
        this.f2546a = 1;
    }

    public n(long j, long j3) {
        this.f2546a = 1;
        this.f2547b = j;
        t tVar = j3 == 0 ? t.f2569c : new t(0L, j3);
        this.f2548c = new r(tVar, tVar);
    }
}
