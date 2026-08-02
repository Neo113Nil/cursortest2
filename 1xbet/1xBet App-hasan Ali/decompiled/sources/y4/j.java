package y4;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f21342j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f21343k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f21344l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f21345m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f21346a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21347b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21348c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21349d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21350e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f21351g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21352h;
    public final boolean i;

    public j(String str, String str2, long j5, String str3, String str4, boolean z3, boolean z5, boolean z6, boolean z7) {
        this.f21346a = str;
        this.f21347b = str2;
        this.f21348c = j5;
        this.f21349d = str3;
        this.f21350e = str4;
        this.f = z3;
        this.f21351g = z5;
        this.f21352h = z6;
        this.i = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.l.a(jVar.f21346a, this.f21346a) && kotlin.jvm.internal.l.a(jVar.f21347b, this.f21347b) && jVar.f21348c == this.f21348c && kotlin.jvm.internal.l.a(jVar.f21349d, this.f21349d) && kotlin.jvm.internal.l.a(jVar.f21350e, this.f21350e) && jVar.f == this.f && jVar.f21351g == this.f21351g && jVar.f21352h == this.f21352h && jVar.i == this.i;
    }

    public final int hashCode() {
        int i = L1.a.i(L1.a.i(527, 31, this.f21346a), 31, this.f21347b);
        long j5 = this.f21348c;
        return ((((((L1.a.i(L1.a.i((i + ((int) (j5 ^ (j5 >>> 32)))) * 31, 31, this.f21349d), 31, this.f21350e) + (this.f ? 1231 : 1237)) * 31) + (this.f21351g ? 1231 : 1237)) * 31) + (this.f21352h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21346a);
        sb.append('=');
        sb.append(this.f21347b);
        if (this.f21352h) {
            long j5 = this.f21348c;
            if (j5 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) D4.c.f973a.get()).format(new Date(j5));
                kotlin.jvm.internal.l.e("STANDARD_DATE_FORMAT.get().format(this)", format);
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f21349d);
        }
        sb.append("; path=");
        sb.append(this.f21350e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.f21351g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString()", sb2);
        return sb2;
    }
}
