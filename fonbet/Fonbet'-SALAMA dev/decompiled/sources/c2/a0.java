package c2;

import A1.H0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a0 implements InterfaceC0794B {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f10303c = new f0(new e0("", c0.j));

    /* renamed from: a, reason: collision with root package name */
    public final long f10304a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10305b = new ArrayList();

    public a0(long j) {
        this.f10304a = j;
    }

    @Override // c2.InterfaceC0794B
    public final long I(t2.c[] cVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j) {
        long k7 = v2.t.k(j, 0L, this.f10304a);
        for (int i7 = 0; i7 < cVarArr.length; i7++) {
            W w7 = wArr[i7];
            ArrayList arrayList = this.f10305b;
            if (w7 != null && (cVarArr[i7] == null || !zArr[i7])) {
                arrayList.remove(w7);
                wArr[i7] = null;
            }
            if (wArr[i7] == null && cVarArr[i7] != null) {
                b0 b0Var = new b0(this.f10304a);
                b0Var.a(k7);
                arrayList.add(b0Var);
                wArr[i7] = b0Var;
                zArr2[i7] = true;
            }
        }
        return k7;
    }

    @Override // c2.InterfaceC0794B
    public final long M() {
        return -9223372036854775807L;
    }

    @Override // c2.InterfaceC0794B
    public final f0 P() {
        return f10303c;
    }

    @Override // c2.Y
    public final long T() {
        return Long.MIN_VALUE;
    }

    @Override // c2.Y
    public final boolean isLoading() {
        return false;
    }

    @Override // c2.Y
    public final long k() {
        return Long.MIN_VALUE;
    }

    @Override // c2.InterfaceC0794B
    public final long o(long j, H0 h02) {
        return v2.t.k(j, 0L, this.f10304a);
    }

    @Override // c2.InterfaceC0794B
    public final void p(InterfaceC0793A interfaceC0793A, long j) {
        interfaceC0793A.f(this);
    }

    @Override // c2.InterfaceC0794B
    public final long v(long j) {
        long k7 = v2.t.k(j, 0L, this.f10304a);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f10305b;
            if (i7 >= arrayList.size()) {
                return k7;
            }
            ((b0) arrayList.get(i7)).a(k7);
            i7++;
        }
    }

    @Override // c2.Y
    public final boolean y(long j) {
        return false;
    }

    @Override // c2.InterfaceC0794B
    public final void q() {
    }

    @Override // c2.Y
    public final void Y(long j) {
    }

    @Override // c2.InterfaceC0794B
    public final void w(long j) {
    }
}
