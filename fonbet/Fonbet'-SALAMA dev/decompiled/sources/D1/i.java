package D1;

import A1.X;
import android.text.TextUtils;
import v0.AbstractC1663a;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f1702a;

    /* renamed from: b, reason: collision with root package name */
    public final X f1703b;

    /* renamed from: c, reason: collision with root package name */
    public final X f1704c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1705d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1706e;

    public i(String str, X x4, X x7, int i7, int i8) {
        AbstractC1664a.f(i7 == 0 || i8 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f1702a = str;
        x4.getClass();
        this.f1703b = x4;
        x7.getClass();
        this.f1704c = x7;
        this.f1705d = i7;
        this.f1706e = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f1705d == iVar.f1705d && this.f1706e == iVar.f1706e && this.f1702a.equals(iVar.f1702a) && this.f1703b.equals(iVar.f1703b) && this.f1704c.equals(iVar.f1704c);
    }

    public final int hashCode() {
        return this.f1704c.hashCode() + ((this.f1703b.hashCode() + AbstractC1663a.d((((527 + this.f1705d) * 31) + this.f1706e) * 31, 31, this.f1702a)) * 31);
    }
}
