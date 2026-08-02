package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1041h implements j$.time.temporal.p, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final l a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.time.b.a(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    public C1041h(l lVar, int i, int i2, int i3) {
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            return this.a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" P");
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        l lVar = (l) mVar.b(j$.time.temporal.r.b);
        if (lVar == null || this.a.equals(lVar)) {
            if (this.c != 0) {
                j$.time.temporal.u t = this.a.t(j$.time.temporal.a.MONTH_OF_YEAR);
                long j = (t.a == t.b && t.c == t.d && t.d()) ? (t.d - t.a) + 1 : -1L;
                if (j > 0) {
                    mVar = mVar.d((this.b * j) + this.c, j$.time.temporal.b.MONTHS);
                } else {
                    int i = this.b;
                    if (i != 0) {
                        mVar = mVar.d(i, j$.time.temporal.b.YEARS);
                    }
                    mVar = mVar.d(this.c, j$.time.temporal.b.MONTHS);
                }
            } else {
                int i2 = this.b;
                if (i2 != 0) {
                    mVar = mVar.d(i2, j$.time.temporal.b.YEARS);
                }
            }
            int i3 = this.d;
            return i3 != 0 ? mVar.d(i3, j$.time.temporal.b.DAYS) : mVar;
        }
        throw new j$.time.c("Chronology mismatch, expected: " + this.a.m() + ", actual: " + lVar.m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1041h) {
            C1041h c1041h = (C1041h) obj;
            if (this.b == c1041h.b && this.c == c1041h.c && this.d == c1041h.d && this.a.equals(c1041h.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b)) ^ this.a.hashCode();
    }

    public Object writeReplace() {
        return new E((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
