package J3;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f1351e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f1352a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1353b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1354c;

    /* renamed from: d, reason: collision with root package name */
    public final Q2.c f1355d;

    static {
        a("", null, null, Q2.a.f2475d);
    }

    public a(String str, String str2, String str3, Q2.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f1352a = str;
        this.f1353b = str2;
        this.f1354c = str3;
        if (cVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f1355d = cVar;
    }

    public static a a(String str, String str2, String str3, Q2.c cVar) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(cVar, "attributes");
        return new a(str, str2, str3, cVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1352a.equals(aVar.f1352a)) {
            String str = aVar.f1353b;
            String str2 = this.f1353b;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = aVar.f1354c;
                String str4 = this.f1354c;
                if (str4 != null ? str4.equals(str3) : str3 == null) {
                    if (this.f1355d.equals(aVar.f1355d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f1352a.hashCode() ^ 1000003) * 1000003;
        String str = this.f1353b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1354c;
        return ((hashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 1000003) ^ this.f1355d.hashCode();
    }

    public final String toString() {
        return "InstrumentationScopeInfo{name=" + this.f1352a + ", version=" + this.f1353b + ", schemaUrl=" + this.f1354c + ", attributes=" + this.f1355d + "}";
    }
}
