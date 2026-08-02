package b4;

import java.util.Objects;

/* renamed from: b4.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5538n extends AbstractC5532h {

    /* renamed from: b, reason: collision with root package name */
    public final String f55526b;

    /* renamed from: c, reason: collision with root package name */
    public final String f55527c;

    public C5538n(String str, String str2, String str3) {
        super(str);
        this.f55526b = str2;
        this.f55527c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5538n.class == obj.getClass()) {
            C5538n c5538n = (C5538n) obj;
            if (this.f55512a.equals(c5538n.f55512a) && Objects.equals(this.f55526b, c5538n.f55526b) && Objects.equals(this.f55527c, c5538n.f55527c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a11 = G.g.a(527, 31, this.f55512a);
        String str = this.f55526b;
        int hashCode = (a11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55527c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // b4.AbstractC5532h
    public final String toString() {
        return this.f55512a + ": url=" + this.f55527c;
    }
}
