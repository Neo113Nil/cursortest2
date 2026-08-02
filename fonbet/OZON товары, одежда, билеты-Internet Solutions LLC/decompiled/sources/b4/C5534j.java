package b4;

import java.util.Objects;

/* renamed from: b4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5534j extends AbstractC5532h {

    /* renamed from: b, reason: collision with root package name */
    public final String f55514b;

    /* renamed from: c, reason: collision with root package name */
    public final String f55515c;

    /* renamed from: d, reason: collision with root package name */
    public final String f55516d;

    public C5534j(String str, String str2, String str3) {
        super("----");
        this.f55514b = str;
        this.f55515c = str2;
        this.f55516d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5534j.class == obj.getClass()) {
            C5534j c5534j = (C5534j) obj;
            if (Objects.equals(this.f55515c, c5534j.f55515c) && Objects.equals(this.f55514b, c5534j.f55514b) && Objects.equals(this.f55516d, c5534j.f55516d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f55514b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55515c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55516d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // b4.AbstractC5532h
    public final String toString() {
        return this.f55512a + ": domain=" + this.f55514b + ", description=" + this.f55515c;
    }
}
