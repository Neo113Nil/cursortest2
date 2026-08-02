package T1;

import java.util.Locale;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5605a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5606b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5607c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5608d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5609e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5610g;

    public a(int i, int i5, String str, String str2, String str3, boolean z3) {
        this.f5605a = str;
        this.f5606b = str2;
        this.f5608d = z3;
        this.f5609e = i;
        int i6 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i6 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i6 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i6 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f5607c = i6;
        this.f = str3;
        this.f5610g = i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f5609e != aVar.f5609e || !this.f5605a.equals(aVar.f5605a) || this.f5608d != aVar.f5608d) {
                return false;
            }
            String str = this.f;
            int i = this.f5610g;
            int i5 = aVar.f5610g;
            String str2 = aVar.f;
            if (i == 1 && i5 == 2 && str != null && !str.equals(str2)) {
                return false;
            }
            if (i == 2 && i5 == 1 && str2 != null && !str2.equals(str)) {
                return false;
            }
            if (i != 0 && i == i5) {
                if (str != null) {
                    if (!str.equals(str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            }
            if (this.f5607c != aVar.f5607c) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f5605a.hashCode() * 31) + this.f5607c) * 31) + (this.f5608d ? 1231 : 1237)) * 31) + this.f5609e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f5605a);
        sb.append("', type='");
        sb.append(this.f5606b);
        sb.append("', affinity='");
        sb.append(this.f5607c);
        sb.append("', notNull=");
        sb.append(this.f5608d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f5609e);
        sb.append(", defaultValue='");
        return AbstractC2107A.u(sb, this.f, "'}");
    }
}
