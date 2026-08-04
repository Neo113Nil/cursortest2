package p018c2;

import A1.H0;
import java.util.ArrayList;
import p139t2.c;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f10303c = new f0(new e0("", c0.j));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10305b = new ArrayList();

    public a0(long j) {
        this.f10304a = j;
    }

    @Override // p018c2.B
    public final long I(c[] cVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j) {
        long jK = t.k(j, 0L, this.f10304a);
        for (int i7 = 0; i7 < cVarArr.length; i7++) {
            W w7 = wArr[i7];
            ArrayList arrayList = this.f10305b;
            if (w7 != null && (cVarArr[i7] == null || !zArr[i7])) {
                arrayList.remove(w7);
                wArr[i7] = null;
            }
            if (wArr[i7] == null && cVarArr[i7] != null) {
                b0 b0Var = new b0(this.f10304a);
                b0Var.a(jK);
                arrayList.add(b0Var);
                wArr[i7] = b0Var;
                zArr2[i7] = true;
            }
        }
        return jK;
    }

    @Override // p018c2.B
    public final long M() {
        return -9223372036854775807L;
    }

    @Override // p018c2.B
    public final f0 P() {
        return f10303c;
    }

    @Override // p018c2.Y
    public final long T() {
        return Long.MIN_VALUE;
    }

    @Override // p018c2.Y
    public final boolean isLoading() {
        return false;
    }

    @Override // p018c2.Y
    public final long k() {
        return Long.MIN_VALUE;
    }

    @Override // p018c2.B
    public final long o(long j, H0 h6) {
        return t.k(j, 0L, this.f10304a);
    }

    @Override // p018c2.B
    public final void p(A a2, long j) {
        a2.f(this);
    }

    @Override // p018c2.B
    public final long v(long j) {
        long jK = t.k(j, 0L, this.f10304a);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f10305b;
            if (i7 >= arrayList.size()) {
                return jK;
            }
            ((b0) arrayList.get(i7)).a(jK);
            i7++;
        }
    }

    @Override // p018c2.Y
    public final boolean y(long j) {
        return false;
    }

    @Override // p018c2.B
    public final void q() {
    }

    @Override // p018c2.Y
    public final void Y(long j) {
    }

    @Override // p018c2.B
    public final void w(long j) {
    }
}
