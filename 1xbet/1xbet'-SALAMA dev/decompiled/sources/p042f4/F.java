package p042f4;

import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12924c;

    public F(String str, String str2, String str3) {
        this.f12922a = str;
        this.f12923b = str2;
        this.f12924c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F) {
            F f7 = (F) obj;
            String str = this.f12922a;
            if (str != null ? str.equals(f7.f12922a) : f7.f12922a == null) {
                String str2 = this.f12923b;
                if (str2 != null ? str2.equals(f7.f12923b) : f7.f12923b == null) {
                    String str3 = this.f12924c;
                    if (str3 != null ? str3.equals(f7.f12924c) : f7.f12924c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12922a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f12923b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12924c;
        return (str3 != null ? str3.hashCode() : 0) ^ iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttestationResult{recaptchaV2Token=");
        sb.append(this.f12922a);
        sb.append(", playIntegrityToken=");
        sb.append(this.f12923b);
        sb.append(", recaptchaEnterpriseToken=");
        return k.i(sb, this.f12924c, "}");
    }
}
