package f4;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f12916a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12917b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12918c;

    public F(String str, String str2, String str3) {
        this.f12916a = str;
        this.f12917b = str2;
        this.f12918c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F) {
            F f7 = (F) obj;
            String str = this.f12916a;
            if (str != null ? str.equals(f7.f12916a) : f7.f12916a == null) {
                String str2 = this.f12917b;
                if (str2 != null ? str2.equals(f7.f12917b) : f7.f12917b == null) {
                    String str3 = this.f12918c;
                    if (str3 != null ? str3.equals(f7.f12918c) : f7.f12918c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12916a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f12917b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12918c;
        return (str3 != null ? str3.hashCode() : 0) ^ hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttestationResult{recaptchaV2Token=");
        sb.append(this.f12916a);
        sb.append(", playIntegrityToken=");
        sb.append(this.f12917b);
        sb.append(", recaptchaEnterpriseToken=");
        return e1.k.i(sb, this.f12918c, "}");
    }
}
