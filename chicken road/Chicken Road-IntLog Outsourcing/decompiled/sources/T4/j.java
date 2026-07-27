package T4;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2886k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2887l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2888m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f2889n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2890a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2891b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2892c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2893d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2894e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2895f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2896g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2897h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2898i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2899j;

    public j(String str, String str2, long j2, String str3, String str4, boolean z, boolean z5, boolean z6, boolean z7, String str5) {
        this.f2890a = str;
        this.f2891b = str2;
        this.f2892c = j2;
        this.f2893d = str3;
        this.f2894e = str4;
        this.f2895f = z;
        this.f2896g = z5;
        this.f2897h = z6;
        this.f2898i = z7;
        this.f2899j = str5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (kotlin.jvm.internal.i.a(jVar.f2890a, this.f2890a) && kotlin.jvm.internal.i.a(jVar.f2891b, this.f2891b) && jVar.f2892c == this.f2892c && kotlin.jvm.internal.i.a(jVar.f2893d, this.f2893d) && kotlin.jvm.internal.i.a(jVar.f2894e, this.f2894e) && jVar.f2895f == this.f2895f && jVar.f2896g == this.f2896g && jVar.f2897h == this.f2897h && jVar.f2898i == this.f2898i && kotlin.jvm.internal.i.a(jVar.f2899j, this.f2899j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(this.f2898i) + ((Boolean.hashCode(this.f2897h) + ((Boolean.hashCode(this.f2896g) + ((Boolean.hashCode(this.f2895f) + B0.o.f(this.f2894e, B0.o.f(this.f2893d, (Long.hashCode(this.f2892c) + B0.o.f(this.f2891b, B0.o.f(this.f2890a, 527, 31), 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f2899j;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2890a);
        sb.append('=');
        sb.append(this.f2891b);
        if (this.f2897h) {
            long j2 = this.f2892c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) Y4.e.f3711a.get()).format(new Date(j2));
                kotlin.jvm.internal.i.d(format, "format(...)");
                sb.append(format);
            }
        }
        if (!this.f2898i) {
            sb.append("; domain=");
            sb.append(this.f2893d);
        }
        sb.append("; path=");
        sb.append(this.f2894e);
        if (this.f2895f) {
            sb.append("; secure");
        }
        if (this.f2896g) {
            sb.append("; httponly");
        }
        String str = this.f2899j;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }
}
