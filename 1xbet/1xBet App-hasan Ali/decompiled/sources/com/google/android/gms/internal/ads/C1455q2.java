package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.q2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1455q2 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f15083c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f15084d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final C1617tm f15085a = new C1617tm();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f15086b = new StringBuilder();

    public static String a(C1617tm c1617tm, StringBuilder sb) {
        b(c1617tm);
        if (c1617tm.o() == 0) {
            return null;
        }
        String c5 = c(c1617tm, sb);
        if (!"".equals(c5)) {
            return c5;
        }
        char v4 = (char) c1617tm.v();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v4);
        return sb2.toString();
    }

    public static void b(C1617tm c1617tm) {
        while (true) {
            for (boolean z3 = true; c1617tm.o() > 0 && z3; z3 = false) {
                int i = c1617tm.f15725b;
                byte[] bArr = c1617tm.f15724a;
                byte b3 = bArr[i];
                char c5 = (char) b3;
                if (c5 == '\t' || c5 == '\n' || c5 == '\f' || c5 == '\r' || c5 == ' ') {
                    c1617tm.k(1);
                } else {
                    int i5 = c1617tm.f15726c;
                    if (i + 2 <= i5) {
                        int i6 = i + 1;
                        if (b3 == 47) {
                            int i7 = i + 2;
                            if (bArr[i6] == 42) {
                                while (true) {
                                    int i8 = i7 + 1;
                                    if (i8 >= i5) {
                                        break;
                                    }
                                    if (((char) bArr[i7]) == '*' && ((char) bArr[i8]) == '/') {
                                        i5 = i7 + 2;
                                        i7 = i5;
                                    } else {
                                        i7 = i8;
                                    }
                                }
                                c1617tm.k(i5 - c1617tm.f15725b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String c(C1617tm c1617tm, StringBuilder sb) {
        sb.setLength(0);
        int i = c1617tm.f15725b;
        int i5 = c1617tm.f15726c;
        loop0: while (true) {
            for (boolean z3 = false; i < i5 && !z3; z3 = true) {
                char c5 = (char) c1617tm.f15724a[i];
                if ((c5 >= 'A' && c5 <= 'Z') || ((c5 >= 'a' && c5 <= 'z') || ((c5 >= '0' && c5 <= '9') || c5 == '#' || c5 == '-' || c5 == '.' || c5 == '_'))) {
                    sb.append(c5);
                    i++;
                }
            }
        }
        c1617tm.k(i - c1617tm.f15725b);
        return sb.toString();
    }
}
