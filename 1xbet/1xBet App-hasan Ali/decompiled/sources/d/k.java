package d;

import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class k extends AbstractC2346c {
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final long f16822j;

    public k(Object obj, long j5) {
        this.i = obj;
        this.f16822j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.l.a(this.i, kVar.i) && this.f16822j == kVar.f16822j;
    }

    public final int hashCode() {
        int hashCode = this.i.hashCode() * 31;
        long j5 = this.f16822j;
        return hashCode + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.i + ", compositeKey=" + this.f16822j + ')';
    }
}
