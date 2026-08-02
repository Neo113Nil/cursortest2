package L5;

import java.util.Objects;

/* renamed from: L5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0328g {

    /* renamed from: a, reason: collision with root package name */
    public final int f4472a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4473b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4474c;

    /* renamed from: d, reason: collision with root package name */
    public final C0330i f4475d;

    public C0328g(y2.n nVar) {
        this.f4472a = nVar.f18138a;
        this.f4473b = nVar.f18140c;
        this.f4474c = nVar.f18139b;
        y2.v vVar = nVar.f18175e;
        if (vVar != null) {
            this.f4475d = new C0330i(vVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0328g)) {
            return false;
        }
        C0328g c0328g = (C0328g) obj;
        if (this.f4472a == c0328g.f4472a && this.f4473b.equals(c0328g.f4473b) && Objects.equals(this.f4475d, c0328g.f4475d)) {
            return this.f4474c.equals(c0328g.f4474c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4472a), this.f4473b, this.f4474c, this.f4475d);
    }

    public C0328g(int i7, String str, String str2, C0330i c0330i) {
        this.f4472a = i7;
        this.f4473b = str;
        this.f4474c = str2;
        this.f4475d = c0330i;
    }
}
