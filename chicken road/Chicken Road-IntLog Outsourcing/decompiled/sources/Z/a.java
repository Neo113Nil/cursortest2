package Z;

import B4.k;
import a.AbstractC0169a;
import b2.AbstractC0279e;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3724a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3725b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3726c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3727d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3728e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3729f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3730g;

    public a(String str, String str2, boolean z, int i2, String str3, int i3) {
        this.f3724a = str;
        this.f3725b = str2;
        this.f3726c = z;
        this.f3727d = i2;
        this.f3728e = str3;
        this.f3729f = i3;
        Locale US = Locale.US;
        i.d(US, "US");
        String upperCase = str2.toUpperCase(US);
        i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f3730g = k.R(upperCase, "INT", false) ? 3 : (k.R(upperCase, "CHAR", false) || k.R(upperCase, "CLOB", false) || k.R(upperCase, "TEXT", false)) ? 2 : k.R(upperCase, "BLOB", false) ? 5 : (k.R(upperCase, "REAL", false) || k.R(upperCase, "FLOA", false) || k.R(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3727d != aVar.f3727d) {
            return false;
        }
        if (!this.f3724a.equals(aVar.f3724a) || this.f3726c != aVar.f3726c) {
            return false;
        }
        int i2 = aVar.f3729f;
        String str = aVar.f3728e;
        String str2 = this.f3728e;
        int i3 = this.f3729f;
        if (i3 == 1 && i2 == 2 && str2 != null && !AbstractC0169a.j(str2, str)) {
            return false;
        }
        if (i3 != 2 || i2 != 1 || str == null || AbstractC0169a.j(str, str2)) {
            return (i3 == 0 || i3 != i2 || (str2 == null ? str == null : AbstractC0169a.j(str2, str))) && this.f3730g == aVar.f3730g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f3724a.hashCode() * 31) + this.f3730g) * 31) + (this.f3726c ? 1231 : 1237)) * 31) + this.f3727d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f3724a);
        sb.append("', type='");
        sb.append(this.f3725b);
        sb.append("', affinity='");
        sb.append(this.f3730g);
        sb.append("', notNull=");
        sb.append(this.f3726c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f3727d);
        sb.append(", defaultValue='");
        String str = this.f3728e;
        if (str == null) {
            str = StringUtils.UNDEFINED;
        }
        return AbstractC0279e.h(sb, str, "'}");
    }
}
