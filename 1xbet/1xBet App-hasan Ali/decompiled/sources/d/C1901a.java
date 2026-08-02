package d;

import r0.AbstractC2346c;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1901a extends AbstractC2346c {
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final long f16805j;

    public C1901a(Object obj, long j5) {
        this.i = obj;
        this.f16805j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1901a)) {
            return false;
        }
        C1901a c1901a = (C1901a) obj;
        return kotlin.jvm.internal.l.a(this.i, c1901a.i) && this.f16805j == c1901a.f16805j;
    }

    public final int hashCode() {
        int hashCode = this.i.hashCode() * 31;
        long j5 = this.f16805j;
        return hashCode + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.i + ", compositeKey=" + this.f16805j + ')';
    }
}
