package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class y implements m, Serializable {
    public static final y d;
    public static final y[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient j$.time.g b;
    public final transient String c;

    static {
        y yVar = new y(-1, j$.time.g.U(1868, 1, 1), "Meiji");
        d = yVar;
        e = new y[]{yVar, new y(0, j$.time.g.U(1912, 7, 30), "Taisho"), new y(1, j$.time.g.U(1926, 12, 25), "Showa"), new y(2, j$.time.g.U(1989, 1, 8), "Heisei"), new y(3, j$.time.g.U(2019, 5, 1), "Reiwa")};
    }

    public final y m() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return n(this.a + 1);
    }

    public y(int i, j$.time.g gVar, String str) {
        this.a = i;
        this.b = gVar;
        this.c = str;
    }

    public static y n(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            y[] yVarArr = e;
            if (i2 < yVarArr.length) {
                return yVarArr[i2];
            }
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    public static y l(j$.time.g gVar) {
        if (gVar.Q(x.d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = e.length - 1; length >= 0; length--) {
            y yVar = e[length];
            if (gVar.compareTo(yVar.b) >= 0) {
                return yVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u j(j$.time.temporal.q qVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (qVar == aVar) {
            return v.c.t(aVar);
        }
        return super.j(qVar);
    }

    public final String toString() {
        return this.c;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 5, this);
    }
}
