package t4;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: k, reason: collision with root package name */
    public d[] f19591k;

    /* renamed from: l, reason: collision with root package name */
    public int f19592l;

    /* renamed from: m, reason: collision with root package name */
    public int f19593m;

    /* renamed from: n, reason: collision with root package name */
    public y f19594n;

    public final d c() {
        d dVar;
        y yVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f19591k;
                if (dVarArr == null) {
                    dVarArr = f();
                    this.f19591k = dVarArr;
                } else if (this.f19592l >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
                    this.f19591k = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i = this.f19593m;
                do {
                    dVar = dVarArr[i];
                    if (dVar == null) {
                        dVar = e();
                        dVarArr[i] = dVar;
                    }
                    i++;
                    if (i >= dVarArr.length) {
                        i = 0;
                    }
                } while (!dVar.a(this));
                this.f19593m = i;
                this.f19592l++;
                yVar = this.f19594n;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yVar != null) {
            yVar.w(1);
        }
        return dVar;
    }

    public abstract d e();

    public abstract d[] f();

    public final void g(d dVar) {
        y yVar;
        int i;
        a4.c[] b3;
        synchronized (this) {
            try {
                int i5 = this.f19592l - 1;
                this.f19592l = i5;
                yVar = this.f19594n;
                if (i5 == 0) {
                    this.f19593m = 0;
                }
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>", dVar);
                b3 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (a4.c cVar : b3) {
            if (cVar != null) {
                cVar.resumeWith(W3.o.f6046a);
            }
        }
        if (yVar != null) {
            yVar.w(-1);
        }
    }

    public final y h() {
        y yVar;
        synchronized (this) {
            yVar = this.f19594n;
            if (yVar == null) {
                int i = this.f19592l;
                yVar = new y(1, Integer.MAX_VALUE, r4.a.f19107l);
                yVar.q(Integer.valueOf(i));
                this.f19594n = yVar;
            }
        }
        return yVar;
    }
}
