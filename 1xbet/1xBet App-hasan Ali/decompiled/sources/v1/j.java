package v1;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o4.AbstractC2227e;

/* loaded from: classes.dex */
public abstract class j {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int a(int i, int i5, int i6, boolean z3) {
        if (i5 >= i6) {
            if (z3) {
                return 0;
            }
            return i6 - i5;
        }
        if (z3) {
            if (z3) {
                if (z3) {
                }
            } else if (z3) {
            }
        } else {
            if (z3 ? i6 - i5 <= i : i5 > i) {
                if (z3) {
                    return i6 - i5;
                }
                return 0;
            }
            if (z3) {
                return i - i5;
            }
        }
        return i;
    }

    public static int b(String str, int i, int i5, boolean z3) {
        while (i < i5) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z3)) {
                return i;
            }
            i++;
        }
        return i5;
    }

    public static long e(String str, int i) {
        int b3 = b(str, 0, i, false);
        Matcher matcher = y4.j.f21345m.matcher(str);
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        while (b3 < i) {
            int b5 = b(str, b3 + 1, i, true);
            matcher.region(b3, b5);
            if (i6 == -1 && matcher.usePattern(y4.j.f21345m).matches()) {
                String group = matcher.group(1);
                kotlin.jvm.internal.l.e("matcher.group(1)", group);
                i6 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                kotlin.jvm.internal.l.e("matcher.group(2)", group2);
                i9 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                kotlin.jvm.internal.l.e("matcher.group(3)", group3);
                i10 = Integer.parseInt(group3);
            } else if (i7 == -1 && matcher.usePattern(y4.j.f21344l).matches()) {
                String group4 = matcher.group(1);
                kotlin.jvm.internal.l.e("matcher.group(1)", group4);
                i7 = Integer.parseInt(group4);
            } else {
                if (i8 == -1) {
                    Pattern pattern = y4.j.f21343k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        kotlin.jvm.internal.l.e("matcher.group(1)", group5);
                        Locale locale = Locale.US;
                        kotlin.jvm.internal.l.e("US", locale);
                        String lowerCase = group5.toLowerCase(locale);
                        kotlin.jvm.internal.l.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
                        String pattern2 = pattern.pattern();
                        kotlin.jvm.internal.l.e("MONTH_PATTERN.pattern()", pattern2);
                        i8 = AbstractC2227e.E0(pattern2, lowerCase, 0, false) / 4;
                    }
                }
                if (i5 == -1 && matcher.usePattern(y4.j.f21342j).matches()) {
                    String group6 = matcher.group(1);
                    kotlin.jvm.internal.l.e("matcher.group(1)", group6);
                    i5 = Integer.parseInt(group6);
                }
            }
            b3 = b(str, b5 + 1, i, false);
        }
        if (70 <= i5 && i5 < 100) {
            i5 += 1900;
        }
        if (i5 >= 0 && i5 < 70) {
            i5 += 2000;
        }
        if (i5 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i7 || i7 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 < 0 || i6 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0 || i9 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i10 < 0 || i10 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(z4.b.f21983e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i5);
        gregorianCalendar.set(2, i8 - 1);
        gregorianCalendar.set(5, i7);
        gregorianCalendar.set(11, i6);
        gregorianCalendar.set(12, i9);
        gregorianCalendar.set(13, i10);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public abstract void c(Throwable th);

    public abstract void d(m2.g gVar);
}
