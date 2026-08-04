package U0;

import C6.o;
import Y4.D;
import io.sentry.protocol.Request;
import java.math.BigInteger;
import p031e1.k;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f6393f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p044f6.g f6398e = D.C(new i(this, 0));

    static {
        new j(0, 0, "", 0);
        f6393f = new j(0, 1, "", 0);
        new j(1, 0, "", 0);
    }

    public j(int i7, int i8, String str, int i9) {
        this.f6394a = i7;
        this.f6395b = i8;
        this.f6396c = i9;
        this.f6397d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j jVar = (j) obj;
        t6.h.e(jVar, Request.JsonKeys.OTHER);
        Object value = this.f6398e.getValue();
        t6.h.d(value, "<get-bigInteger>(...)");
        Object value2 = jVar.f6398e.getValue();
        t6.h.d(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f6394a == jVar.f6394a && this.f6395b == jVar.f6395b && this.f6396c == jVar.f6396c;
    }

    public final int hashCode() {
        return ((((527 + this.f6394a) * 31) + this.f6395b) * 31) + this.f6396c;
    }

    public final String toString() {
        String str = this.f6397d;
        String strI = !o.u0(str) ? L.i("-", str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6394a);
        sb.append('.');
        sb.append(this.f6395b);
        sb.append('.');
        return k.g(sb, this.f6396c, strI);
    }
}
