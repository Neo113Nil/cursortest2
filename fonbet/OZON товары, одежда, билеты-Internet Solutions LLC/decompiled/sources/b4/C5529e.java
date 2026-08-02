package b4;

import java.util.Objects;

/* renamed from: b4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5529e extends AbstractC5532h {

    /* renamed from: b, reason: collision with root package name */
    public final String f55500b;

    /* renamed from: c, reason: collision with root package name */
    public final String f55501c;

    /* renamed from: d, reason: collision with root package name */
    public final String f55502d;

    public C5529e(String str, String str2, String str3) {
        super("COMM");
        this.f55500b = str;
        this.f55501c = str2;
        this.f55502d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5529e.class == obj.getClass()) {
            C5529e c5529e = (C5529e) obj;
            if (Objects.equals(this.f55501c, c5529e.f55501c) && Objects.equals(this.f55500b, c5529e.f55500b) && Objects.equals(this.f55502d, c5529e.f55502d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f55500b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f55501c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55502d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // b4.AbstractC5532h
    public final String toString() {
        return this.f55512a + ": language=" + this.f55500b + ", description=" + this.f55501c + ", text=" + this.f55502d;
    }
}
