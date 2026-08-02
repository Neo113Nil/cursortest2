package L5;

import java.util.Objects;
import y2.C1797a;

/* renamed from: L5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0326e {

    /* renamed from: a, reason: collision with root package name */
    public final int f4460a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4461b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4462c;

    public C0326e(C1797a c1797a) {
        this.f4460a = c1797a.a();
        this.f4461b = c1797a.f18140c;
        this.f4462c = c1797a.f18139b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0326e)) {
            return false;
        }
        C0326e c0326e = (C0326e) obj;
        if (this.f4460a == c0326e.f4460a && this.f4461b.equals(c0326e.f4461b)) {
            return this.f4462c.equals(c0326e.f4462c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4460a), this.f4461b, this.f4462c);
    }

    public C0326e(int i7, String str, String str2) {
        this.f4460a = i7;
        this.f4461b = str;
        this.f4462c = str2;
    }
}
