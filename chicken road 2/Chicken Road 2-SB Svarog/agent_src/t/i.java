package t;

import java.math.BigInteger;
import s.C0089a;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final i f1267g;

    /* renamed from: b, reason: collision with root package name */
    public final int f1268b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1269c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1270d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1271e;

    /* renamed from: f, reason: collision with root package name */
    public final W.e f1272f = new W.e(new C0089a(1, this));

    static {
        new i(0, 0, 0, "");
        f1267g = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i2, int i3, int i4, String str) {
        this.f1268b = i2;
        this.f1269c = i3;
        this.f1270d = i4;
        this.f1271e = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        g0.h.e(iVar, "other");
        Object a2 = this.f1272f.a();
        g0.h.d(a2, "<get-bigInteger>(...)");
        Object a3 = iVar.f1272f.a();
        g0.h.d(a3, "<get-bigInteger>(...)");
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f1268b == iVar.f1268b && this.f1269c == iVar.f1269c && this.f1270d == iVar.f1270d;
    }

    public final int hashCode() {
        return ((((527 + this.f1268b) * 31) + this.f1269c) * 31) + this.f1270d;
    }

    public final String toString() {
        String str;
        int i2 = 0;
        while (true) {
            String str2 = this.f1271e;
            if (i2 >= str2.length()) {
                str = "";
                break;
            }
            char charAt = str2.charAt(i2);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                str = "-".concat(str2);
                break;
            }
            i2++;
        }
        return this.f1268b + '.' + this.f1269c + '.' + this.f1270d + str;
    }
}
