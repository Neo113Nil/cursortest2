package x;

import a.AbstractC0009a;
import androidx.lifecycle.w;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final i f6772f;

    /* renamed from: a, reason: collision with root package name */
    public final int f6773a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6774b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6775c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6776d;

    /* renamed from: e, reason: collision with root package name */
    public final K0.g f6777e = AbstractC0009a.t(new w(1, this));

    static {
        new i(0, 0, 0, "");
        f6772f = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i2, int i3, int i4, String str) {
        this.f6773a = i2;
        this.f6774b = i3;
        this.f6775c = i4;
        this.f6776d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i other = (i) obj;
        kotlin.jvm.internal.j.e(other, "other");
        Object a2 = this.f6777e.a();
        kotlin.jvm.internal.j.d(a2, "<get-bigInteger>(...)");
        Object a3 = other.f6777e.a();
        kotlin.jvm.internal.j.d(a3, "<get-bigInteger>(...)");
        return ((BigInteger) a2).compareTo((BigInteger) a3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f6773a == iVar.f6773a && this.f6774b == iVar.f6774b && this.f6775c == iVar.f6775c;
    }

    public final int hashCode() {
        return ((((527 + this.f6773a) * 31) + this.f6774b) * 31) + this.f6775c;
    }

    public final String toString() {
        String str;
        String str2 = this.f6776d;
        if (a1.h.S(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f6773a + '.' + this.f6774b + '.' + this.f6775c + str;
    }
}
