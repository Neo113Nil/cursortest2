package i1;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f1348j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f1349k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f1350l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f1351m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f1352a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1353b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1354c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1355d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1356e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1357f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1358g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1359h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1360i;

    public j(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f1352a = str;
        this.f1353b = str2;
        this.f1354c = j2;
        this.f1355d = str3;
        this.f1356e = str4;
        this.f1357f = z2;
        this.f1358g = z3;
        this.f1360i = z4;
        this.f1359h = z5;
    }

    public static int a(String str, int i2, int i3, boolean z2) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static long b(int i2, String str) {
        int a2 = a(str, 0, i2, false);
        Pattern pattern = f1351m;
        Matcher matcher = pattern.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a2 < i2) {
            int a3 = a(str, a2 + 1, i2, true);
            matcher.region(a2, a3);
            if (i4 == -1 && matcher.usePattern(pattern).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f1350l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else {
                if (i6 == -1) {
                    Pattern pattern2 = f1349k;
                    if (matcher.usePattern(pattern2).matches()) {
                        i6 = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f1348j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            }
            a2 = a(str, a3 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i6 == -1) {
            throw new IllegalArgumentException();
        }
        if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        }
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(j1.d.f6057e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f1352a.equals(this.f1352a) && jVar.f1353b.equals(this.f1353b) && jVar.f1355d.equals(this.f1355d) && jVar.f1356e.equals(this.f1356e) && jVar.f1354c == this.f1354c && jVar.f1357f == this.f1357f && jVar.f1358g == this.f1358g && jVar.f1359h == this.f1359h && jVar.f1360i == this.f1360i;
    }

    public final int hashCode() {
        int f2 = C0.g.f(this.f1356e, C0.g.f(this.f1355d, C0.g.f(this.f1353b, C0.g.f(this.f1352a, 527, 31), 31), 31), 31);
        long j2 = this.f1354c;
        return ((((((((f2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f1357f ? 1 : 0)) * 31) + (!this.f1358g ? 1 : 0)) * 31) + (!this.f1359h ? 1 : 0)) * 31) + (!this.f1360i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1352a);
        sb.append('=');
        sb.append(this.f1353b);
        if (this.f1359h) {
            long j2 = this.f1354c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) m1.c.f6129a.get()).format(new Date(j2)));
            }
        }
        if (!this.f1360i) {
            sb.append("; domain=");
            sb.append(this.f1355d);
        }
        sb.append("; path=");
        sb.append(this.f1356e);
        if (this.f1357f) {
            sb.append("; secure");
        }
        if (this.f1358g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
