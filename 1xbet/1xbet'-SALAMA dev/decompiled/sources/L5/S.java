package L5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4436b;

    public S(String str, String str2) {
        this.f4435a = str;
        this.f4436b = str2;
    }

    public final S2.e a() {
        L l7 = new L();
        l7.f4417a = "";
        l7.f4418b = "";
        String str = this.f4435a;
        if (str != null) {
            l7.f4417a = str;
        }
        String str2 = this.f4436b;
        if (str2 != null) {
            l7.f4418b = str2;
        }
        return new S2.e(l7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s7 = (S) obj;
        return Objects.equals(s7.f4435a, this.f4435a) && Objects.equals(s7.f4436b, this.f4436b);
    }

    public final int hashCode() {
        return Objects.hash(this.f4435a, this.f4436b);
    }
}
