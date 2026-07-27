package com.mbridge.msdk.thrid.okhttp;

import com.google.common.net.HttpHeaders;
import com.ironsource.C4761z5;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.internal.publicsuffix.PublicSuffixDatabase;
import io.ktor.client.utils.CacheControl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* compiled from: Cookie.java */
/* loaded from: classes6.dex */
public final class k {
    private static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    private final String f9938a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    private k(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f9938a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.i = z3;
        this.h = z4;
    }

    public String a() {
        return this.f9938a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f9938a.equals(this.f9938a) && kVar.b.equals(this.b) && kVar.d.equals(this.d) && kVar.e.equals(this.e) && kVar.c == this.c && kVar.f == this.f && kVar.g == this.g && kVar.h == this.h && kVar.i == this.i;
    }

    public int hashCode() {
        int hashCode = (((((((this.f9938a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        long j2 = this.c;
        return ((((((((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f ? 1 : 0)) * 31) + (!this.g ? 1 : 0)) * 31) + (!this.h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    public String toString() {
        return a(false);
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !com.mbridge.msdk.thrid.okhttp.internal.c.d(str);
    }

    private static long b(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    @Nullable
    public static k a(s sVar, String str) {
        return a(System.currentTimeMillis(), sVar, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static k a(long j2, s sVar, String str) {
        long j3;
        String g;
        k kVar;
        String str2;
        String substring;
        int length = str.length();
        char c = ';';
        int a2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, length, ';');
        char c2 = C4761z5.U;
        int a3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, a2, C4761z5.U);
        if (a3 == a2) {
            return null;
        }
        String d = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, 0, a3);
        if (d.isEmpty() || com.mbridge.msdk.thrid.okhttp.internal.c.c(d) != -1) {
            return null;
        }
        String d2 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, a3 + 1, a2);
        if (com.mbridge.msdk.thrid.okhttp.internal.c.c(d2) != -1) {
            return null;
        }
        int i = a2 + 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str3 = null;
        boolean z4 = true;
        long j4 = -1;
        long j5 = 253402300799999L;
        String str4 = null;
        while (i < length) {
            int a4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i, length, c);
            int a5 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i, a4, c2);
            String d3 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, i, a5);
            String d4 = a5 < a4 ? com.mbridge.msdk.thrid.okhttp.internal.c.d(str, a5 + 1, a4) : "";
            if (d3.equalsIgnoreCase("expires")) {
                try {
                    j5 = a(d4, 0, d4.length());
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (d3.equalsIgnoreCase(CacheControl.MAX_AGE)) {
                j4 = b(d4);
            } else {
                if (d3.equalsIgnoreCase(U3.j.D)) {
                    str3 = a(d4);
                    z4 = false;
                } else if (d3.equalsIgnoreCase("path")) {
                    str4 = d4;
                } else if (d3.equalsIgnoreCase("secure")) {
                    z = true;
                } else if (d3.equalsIgnoreCase("httponly")) {
                    z2 = true;
                }
                i = a4 + 1;
                c = ';';
                c2 = C4761z5.U;
            }
            z3 = true;
            i = a4 + 1;
            c = ';';
            c2 = C4761z5.U;
        }
        long j6 = Long.MIN_VALUE;
        if (j4 != Long.MIN_VALUE) {
            if (j4 != -1) {
                j6 = j2 + (j4 <= 9223372036854775L ? j4 * 1000 : Long.MAX_VALUE);
                if (j6 < j2 || j6 > 253402300799999L) {
                    j3 = 253402300799999L;
                }
            } else {
                j3 = j5;
            }
            g = sVar.g();
            if (str3 != null) {
                str2 = g;
                kVar = null;
            } else {
                if (!a(g, str3)) {
                    return null;
                }
                kVar = null;
                str2 = str3;
            }
            if (g.length() == str2.length() && PublicSuffixDatabase.a().a(str2) == null) {
                return kVar;
            }
            if (str4 == null && str4.startsWith("/")) {
                substring = str4;
            } else {
                String c3 = sVar.c();
                int lastIndexOf = c3.lastIndexOf(47);
                substring = lastIndexOf != 0 ? c3.substring(0, lastIndexOf) : "/";
            }
            return new k(d, d2, j3, str2, substring, z, z2, z4, z3);
        }
        j3 = j6;
        g = sVar.g();
        if (str3 != null) {
        }
        if (g.length() == str2.length()) {
        }
        if (str4 == null) {
        }
        String c32 = sVar.c();
        int lastIndexOf2 = c32.lastIndexOf(47);
        substring = lastIndexOf2 != 0 ? c32.substring(0, lastIndexOf2) : "/";
        return new k(d, d2, j3, str2, substring, z, z2, z4, z3);
    }

    private static long a(String str, int i, int i2) {
        int a2 = a(str, i, i2, false);
        Matcher matcher = m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a2 < i2) {
            int a3 = a(str, a2 + 1, i2, true);
            matcher.region(a2, a3);
            if (i4 == -1 && matcher.usePattern(m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else {
                if (i6 == -1) {
                    Pattern pattern = k;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(j).matches()) {
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
        if (i8 >= 0 && i8 <= 59) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(com.mbridge.msdk.thrid.okhttp.internal.c.p);
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
        throw new IllegalArgumentException();
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static String a(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String a2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static List<k> a(s sVar, r rVar) {
        List<String> c = rVar.c(HttpHeaders.SET_COOKIE);
        int size = c.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            k a2 = a(sVar, c.get(i));
            if (a2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a2);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9938a);
        sb.append(C4761z5.U);
        sb.append(this.b);
        if (this.h) {
            if (this.c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=").append(com.mbridge.msdk.thrid.okhttp.internal.http.d.a(new Date(this.c)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.d);
        }
        sb.append("; path=").append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
