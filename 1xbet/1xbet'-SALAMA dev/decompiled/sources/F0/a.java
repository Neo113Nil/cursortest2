package F0;

import java.util.Locale;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2483g;

    public a(int i7, String str, String str2, String str3, boolean z4, int i8) {
        this.f2477a = str;
        this.f2478b = str2;
        this.f2480d = z4;
        this.f2481e = i7;
        int i9 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i9 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i9 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i9 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f2479c = i9;
        this.f2482f = str3;
        this.f2483g = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2481e != aVar.f2481e || !this.f2477a.equals(aVar.f2477a) || this.f2480d != aVar.f2480d) {
            return false;
        }
        String str = this.f2482f;
        int i7 = this.f2483g;
        int i8 = aVar.f2483g;
        String str2 = aVar.f2482f;
        if (i7 == 1 && i8 == 2 && str != null && !str.equals(str2)) {
            return false;
        }
        if (i7 != 2 || i8 != 1 || str2 == null || str2.equals(str)) {
            return (i7 == 0 || i7 != i8 || (str == null ? str2 == null : str.equals(str2))) && this.f2479c == aVar.f2479c;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f2477a.hashCode() * 31) + this.f2479c) * 31) + (this.f2480d ? 1231 : 1237)) * 31) + this.f2481e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f2477a);
        sb.append("', type='");
        sb.append(this.f2478b);
        sb.append("', affinity='");
        sb.append(this.f2479c);
        sb.append("', notNull=");
        sb.append(this.f2480d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f2481e);
        sb.append(", defaultValue='");
        return k.i(sb, this.f2482f, "'}");
    }
}
