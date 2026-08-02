package t4;

import s4.B;
import s4.K;

/* loaded from: classes.dex */
public final class y extends B implements K {
    @Override // s4.K
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f19217r;
            kotlin.jvm.internal.l.c(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f19218s + ((int) ((o() + this.f19220u) - this.f19218s))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.f19217r;
            kotlin.jvm.internal.l.c(objArr);
            q(Integer.valueOf(((Number) objArr[((int) ((this.f19218s + ((int) ((o() + this.f19220u) - this.f19218s))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
