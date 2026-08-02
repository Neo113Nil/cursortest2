package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007g2 implements P1 {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f13548n = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f13549o = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: k, reason: collision with root package name */
    public final StringBuilder f13550k = new StringBuilder();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f13551l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final C1617tm f13552m = new C1617tm();

    public static long a(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.P1
    public final void f(byte[] bArr, int i, int i5, Q1 q12) {
        String str;
        char c5;
        char c6;
        float f;
        C1881zg c1881zg;
        C1007g2 c1007g2 = this;
        C1617tm c1617tm = c1007g2.f13552m;
        c1617tm.h(i + i5, bArr);
        c1617tm.j(i);
        Charset c7 = c1617tm.c();
        if (c7 == null) {
            c7 = StandardCharsets.UTF_8;
        }
        while (true) {
            String H5 = c1617tm.H(c7);
            if (H5 == null) {
                return;
            }
            if (H5.length() != 0) {
                try {
                    Integer.parseInt(H5);
                    String H6 = c1617tm.H(c7);
                    if (H6 == null) {
                        JB.l("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = f13548n.matcher(H6);
                    if (matcher.matches()) {
                        long a5 = a(matcher, 1);
                        long a6 = a(matcher, 6);
                        StringBuilder sb = c1007g2.f13550k;
                        int i6 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = c1007g2.f13551l;
                        arrayList.clear();
                        String H7 = c1617tm.H(c7);
                        while (!TextUtils.isEmpty(H7)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String trim = H7.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = f13549o.matcher(trim);
                            int i7 = i6;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i7;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i7 += length;
                            }
                            sb.append(sb2.toString());
                            H7 = c1617tm.H(c7);
                            i6 = 0;
                        }
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        int i8 = 0;
                        while (true) {
                            if (i8 < arrayList.size()) {
                                str = (String) arrayList.get(i8);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i8++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        if (str == null) {
                            c1881zg = new C1881zg(fromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f);
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c5 = 0;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c5 = 3;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case -685620617:
                                    if (str.equals("{\\an4}")) {
                                        c5 = 1;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case -685620555:
                                    if (str.equals("{\\an6}")) {
                                        c5 = 4;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c5 = 2;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c5 = 5;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                default:
                                    c5 = 65535;
                                    break;
                            }
                            int i9 = (c5 == 0 || c5 == 1 || c5 == 2) ? 0 : (c5 == 3 || c5 == 4 || c5 == 5) ? 2 : 1;
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c6 = 0;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                case -685620679:
                                    if (str.equals("{\\an2}")) {
                                        c6 = 1;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c6 = 2;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c6 = 3;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                case -685620493:
                                    if (str.equals("{\\an8}")) {
                                        c6 = 4;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c6 = 5;
                                        break;
                                    }
                                    c6 = 65535;
                                    break;
                                default:
                                    c6 = 65535;
                                    break;
                            }
                            int i10 = (c6 == 0 || c6 == 1 || c6 == 2) ? 2 : (c6 == 3 || c6 == 4 || c6 == 5) ? 0 : 1;
                            float f5 = 0.08f;
                            if (i9 == 0) {
                                f = 0.08f;
                            } else if (i9 == 1) {
                                f = 0.5f;
                            } else {
                                if (i9 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                f = 0.92f;
                            }
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    f5 = 0.5f;
                                } else {
                                    if (i10 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    f5 = 0.92f;
                                }
                            }
                            c1881zg = new C1881zg(fromHtml, null, null, null, f5, 0, i10, f, i9, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f);
                        }
                        q12.mo11k(new L1(AbstractC1044gv.n(c1881zg), a5, a6 - a5));
                    } else {
                        JB.l("SubripParser", "Skipping invalid timing: ".concat(H6));
                    }
                } catch (NumberFormatException unused) {
                    JB.l("SubripParser", "Skipping invalid index: ".concat(H5));
                }
            }
            c1007g2 = this;
        }
    }
}
