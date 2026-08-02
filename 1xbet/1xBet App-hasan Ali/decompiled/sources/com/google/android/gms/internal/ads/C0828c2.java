package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828c2 implements P1 {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f12955q = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: k, reason: collision with root package name */
    public final boolean f12956k;

    /* renamed from: l, reason: collision with root package name */
    public final C0784b2 f12957l;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashMap f12959n;

    /* renamed from: o, reason: collision with root package name */
    public float f12960o = -3.4028235E38f;

    /* renamed from: p, reason: collision with root package name */
    public float f12961p = -3.4028235E38f;

    /* renamed from: m, reason: collision with root package name */
    public final C1617tm f12958m = new C1617tm();

    public C0828c2(List list) {
        if (list == null || list.isEmpty()) {
            this.f12956k = false;
            this.f12957l = null;
            return;
        }
        this.f12956k = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        AbstractC1668us.S(str.startsWith("Format:"));
        C0784b2 a5 = C0784b2.a(str);
        a5.getClass();
        this.f12957l = a5;
        c(new C1617tm((byte[]) list.get(1)), charset);
    }

    public static int a(long j5, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j5) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j5) {
                i = size + 1;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j5));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long b(String str) {
        Matcher matcher = f12955q.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = AbstractC1260lo.f14419a;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ca A[Catch: RuntimeException -> 0x0220, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0220, blocks: (B:48:0x01f0, B:50:0x01fe, B:52:0x0204, B:56:0x0225, B:58:0x0229, B:59:0x0238, B:61:0x023c, B:62:0x024b, B:64:0x024f, B:66:0x0255, B:68:0x0272, B:70:0x0276, B:73:0x0287, B:75:0x028b, B:78:0x029c, B:80:0x02a0, B:83:0x02b1, B:85:0x02b5, B:88:0x02c6, B:90:0x02ca, B:92:0x02d0, B:98:0x02f0, B:96:0x02e1, B:109:0x025d, B:54:0x020f), top: B:47:0x01f0, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C1617tm c1617tm, Charset charset) {
        boolean z3;
        int i;
        String trim;
        int i5;
        Integer a5;
        Integer a6;
        int i6;
        float f;
        int i7;
        int i8;
        C0962f2 c0962f2;
        int parseInt;
        int i9;
        while (true) {
            String H5 = c1617tm.H(charset);
            if (H5 == null) {
                return;
            }
            char c5 = '[';
            int i10 = 0;
            if ("[Script Info]".equalsIgnoreCase(H5)) {
                while (true) {
                    String H6 = c1617tm.H(charset);
                    if (H6 == null) {
                        break;
                    }
                    if (c1617tm.o() != 0) {
                        AbstractC1668us.W("Unsupported charset: ".concat(String.valueOf(charset)), C1617tm.f.contains(charset));
                        if (((char) (c1617tm.n(charset) >> 16)) == '[') {
                            break;
                        }
                    }
                    String[] split = H6.split(":");
                    if (split.length == 2) {
                        String n5 = AbstractC0952et.n(split[0].trim());
                        switch (n5.hashCode()) {
                            case 1879649548:
                                if (n5.equals("playresx")) {
                                    z3 = false;
                                    break;
                                }
                                z3 = -1;
                                break;
                            case 1879649549:
                                if (n5.equals("playresy")) {
                                    z3 = true;
                                    break;
                                }
                                z3 = -1;
                                break;
                            default:
                                z3 = -1;
                                break;
                        }
                        if (!z3) {
                            this.f12960o = Float.parseFloat(split[1].trim());
                        } else if (z3) {
                            try {
                                this.f12961p = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(H5)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C0873d2 c0873d2 = null;
                while (true) {
                    String H7 = c1617tm.H(charset);
                    if (H7 != null) {
                        if (c1617tm.o() != 0) {
                            AbstractC1668us.W("Unsupported charset: ".concat(String.valueOf(charset)), C1617tm.f.contains(charset));
                            if (((char) (c1617tm.n(charset) >> 16)) == c5) {
                            }
                        }
                        if (H7.startsWith("Format:")) {
                            String[] split2 = TextUtils.split(H7.substring(7), ",");
                            int i11 = -1;
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = -1;
                            int i15 = -1;
                            int i16 = -1;
                            int i17 = -1;
                            int i18 = -1;
                            int i19 = -1;
                            int i20 = -1;
                            int i21 = i10;
                            while (true) {
                                int length = split2.length;
                                if (i21 < length) {
                                    String n6 = AbstractC0952et.n(split2[i21].trim());
                                    switch (n6.hashCode()) {
                                        case -1178781136:
                                            if (n6.equals("italic")) {
                                                i = 6;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -1026963764:
                                            if (n6.equals("underline")) {
                                                i = 7;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -192095652:
                                            if (n6.equals("strikeout")) {
                                                i = 8;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -70925746:
                                            if (n6.equals("primarycolour")) {
                                                i = 2;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3029637:
                                            if (n6.equals("bold")) {
                                                i = 5;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3373707:
                                            if (n6.equals("name")) {
                                                i = i10;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 366554320:
                                            if (n6.equals("fontsize")) {
                                                i = 4;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 767321349:
                                            if (n6.equals("borderstyle")) {
                                                i = 9;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1767875043:
                                            if (n6.equals("alignment")) {
                                                i = 1;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1988365454:
                                            if (n6.equals("outlinecolour")) {
                                                i = 3;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        default:
                                            i = -1;
                                            break;
                                    }
                                    switch (i) {
                                        case 0:
                                            i11 = i21;
                                            break;
                                        case 1:
                                            i12 = i21;
                                            break;
                                        case 2:
                                            i13 = i21;
                                            break;
                                        case 3:
                                            i14 = i21;
                                            break;
                                        case 4:
                                            i15 = i21;
                                            break;
                                        case 5:
                                            i16 = i21;
                                            break;
                                        case 6:
                                            i17 = i21;
                                            break;
                                        case 7:
                                            i18 = i21;
                                            break;
                                        case 8:
                                            i19 = i21;
                                            break;
                                        case 9:
                                            i20 = i21;
                                            break;
                                    }
                                    i21++;
                                } else {
                                    c0873d2 = i11 != -1 ? new C0873d2(i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, length) : null;
                                    c5 = '[';
                                }
                            }
                        } else {
                            if (H7.startsWith("Style:")) {
                                if (c0873d2 == null) {
                                    JB.l("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(H7));
                                } else {
                                    AbstractC1668us.S(H7.startsWith("Style:"));
                                    String[] split3 = TextUtils.split(H7.substring(6), ",");
                                    int length2 = split3.length;
                                    int i22 = c0873d2.f13095k;
                                    if (length2 != i22) {
                                        Locale locale = Locale.US;
                                        StringBuilder w5 = AbstractC2107A.w("Skipping malformed 'Style:' line (expected ", i22, " values, found ", length2, "): '");
                                        w5.append(H7);
                                        w5.append("'");
                                        JB.l("SsaStyle", w5.toString());
                                    } else {
                                        try {
                                            trim = split3[c0873d2.f13087a].trim();
                                            int i23 = c0873d2.f13088b;
                                            if (i23 != -1) {
                                                String trim2 = split3[i23].trim();
                                                try {
                                                    i9 = Integer.parseInt(trim2.trim());
                                                } catch (NumberFormatException unused2) {
                                                }
                                                switch (i9) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        break;
                                                    default:
                                                        JB.l("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(trim2)));
                                                        i9 = -1;
                                                        break;
                                                }
                                                i5 = i9;
                                            } else {
                                                i5 = -1;
                                            }
                                            int i24 = c0873d2.f13089c;
                                            a5 = i24 != -1 ? C0962f2.a(split3[i24].trim()) : null;
                                            int i25 = c0873d2.f13090d;
                                            a6 = i25 != -1 ? C0962f2.a(split3[i25].trim()) : null;
                                            i6 = c0873d2.f13091e;
                                        } catch (RuntimeException e3) {
                                            JB.n("SsaStyle", "Skipping malformed 'Style:' line: '" + H7 + "'", e3);
                                        }
                                        if (i6 != -1) {
                                            String trim3 = split3[i6].trim();
                                            try {
                                                f = Float.parseFloat(trim3);
                                            } catch (NumberFormatException e5) {
                                                JB.n("SsaStyle", "Failed to parse font size: '" + trim3 + "'", e5);
                                            }
                                            int i26 = c0873d2.f;
                                            boolean z5 = i26 == -1 && C0962f2.b(split3[i26].trim());
                                            int i27 = c0873d2.f13092g;
                                            boolean z6 = i27 == -1 && C0962f2.b(split3[i27].trim());
                                            int i28 = c0873d2.f13093h;
                                            boolean z7 = i28 == -1 && C0962f2.b(split3[i28].trim());
                                            int i29 = c0873d2.i;
                                            boolean z8 = i29 == -1 && C0962f2.b(split3[i29].trim());
                                            i7 = c0873d2.f13094j;
                                            if (i7 != -1) {
                                                String trim4 = split3[i7].trim();
                                                try {
                                                    parseInt = Integer.parseInt(trim4.trim());
                                                } catch (NumberFormatException unused3) {
                                                }
                                                if (parseInt == 1 || parseInt == 3) {
                                                    i8 = parseInt;
                                                    c0962f2 = new C0962f2(trim, i5, a5, a6, f, z5, z6, z7, z8, i8);
                                                    if (c0962f2 != null) {
                                                        linkedHashMap.put(c0962f2.f13418a, c0962f2);
                                                    }
                                                }
                                                JB.l("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(trim4)));
                                            }
                                            i8 = -1;
                                            c0962f2 = new C0962f2(trim, i5, a5, a6, f, z5, z6, z7, z8, i8);
                                            if (c0962f2 != null) {
                                            }
                                        }
                                        f = -3.4028235E38f;
                                        int i262 = c0873d2.f;
                                        if (i262 == -1) {
                                        }
                                        int i272 = c0873d2.f13092g;
                                        if (i272 == -1) {
                                        }
                                        int i282 = c0873d2.f13093h;
                                        if (i282 == -1) {
                                        }
                                        int i292 = c0873d2.i;
                                        if (i292 == -1) {
                                        }
                                        i7 = c0873d2.f13094j;
                                        if (i7 != -1) {
                                        }
                                        i8 = -1;
                                        c0962f2 = new C0962f2(trim, i5, a5, a6, f, z5, z6, z7, z8, i8);
                                        if (c0962f2 != null) {
                                        }
                                    }
                                    c0962f2 = null;
                                    if (c0962f2 != null) {
                                    }
                                }
                            }
                            c5 = '[';
                            i10 = 0;
                        }
                    }
                }
                this.f12959n = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(H5)) {
                JB.i("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(H5)) {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x018a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b A[Catch: RuntimeException -> 0x01a9, TRY_LEAVE, TryCatch #4 {RuntimeException -> 0x01a9, blocks: (B:63:0x016f, B:65:0x017b, B:72:0x0182, B:67:0x019b, B:74:0x018d), top: B:62:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    @Override // com.google.android.gms.internal.ads.P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(byte[] bArr, int i, int i5, Q1 q12) {
        Charset charset;
        C0784b2 c0784b2;
        int i6;
        float f;
        float f5;
        int i7;
        Layout.Alignment alignment;
        int i8;
        PointF pointF;
        float f6;
        float f7;
        float f8;
        float f9;
        int i9;
        Integer num;
        Charset charset2;
        C0784b2 c0784b22;
        Matcher matcher;
        int i10;
        Matcher matcher2;
        Matcher matcher3;
        boolean find;
        boolean find2;
        PointF pointF2;
        String group;
        String str;
        int i11;
        C0828c2 c0828c2 = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1617tm c1617tm = c0828c2.f12958m;
        c1617tm.h(i + i5, bArr);
        c1617tm.j(i);
        Charset c5 = c1617tm.c();
        if (c5 == null) {
            c5 = StandardCharsets.UTF_8;
        }
        boolean z3 = c0828c2.f12956k;
        if (!z3) {
            c0828c2.c(c1617tm, c5);
        }
        C0784b2 c0784b23 = z3 ? c0828c2.f12957l : null;
        while (true) {
            String H5 = c1617tm.H(c5);
            int i12 = 1;
            if (H5 == null) {
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    List list = (List) arrayList.get(i13);
                    if (list.isEmpty()) {
                        if (i13 != 0) {
                            i13++;
                        } else {
                            i13 = 0;
                        }
                    }
                    if (i13 == arrayList.size() - 1) {
                        throw new IllegalStateException();
                    }
                    q12.mo11k(new L1(list, ((Long) arrayList2.get(i13)).longValue(), ((Long) arrayList2.get(i13 + 1)).longValue() - ((Long) arrayList2.get(i13)).longValue()));
                    i13++;
                }
                return;
            }
            if (H5.startsWith("Format:")) {
                c0784b23 = C0784b2.a(H5);
            } else {
                if (H5.startsWith("Dialogue:")) {
                    if (c0784b23 == null) {
                        JB.l("SsaParser", "Skipping dialogue line before complete format: ".concat(H5));
                    } else {
                        AbstractC1668us.S(H5.startsWith("Dialogue:"));
                        String substring = H5.substring(9);
                        int i14 = c0784b23.f12758e;
                        String[] split = substring.split(",", i14);
                        if (split.length != i14) {
                            JB.l("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(H5));
                        } else {
                            long b3 = b(split[c0784b23.f12754a]);
                            if (b3 == -9223372036854775807L) {
                                JB.l("SsaParser", "Skipping invalid timing: ".concat(H5));
                            } else {
                                long b5 = b(split[c0784b23.f12755b]);
                                if (b5 == -9223372036854775807L) {
                                    JB.l("SsaParser", "Skipping invalid timing: ".concat(H5));
                                } else {
                                    LinkedHashMap linkedHashMap = c0828c2.f12959n;
                                    C0962f2 c0962f2 = (linkedHashMap == null || (i11 = c0784b23.f12756c) == -1) ? null : (C0962f2) linkedHashMap.get(split[i11].trim());
                                    String str2 = split[c0784b23.f12757d];
                                    Matcher matcher4 = C0917e2.f13229a.matcher(str2);
                                    PointF pointF3 = null;
                                    int i15 = -1;
                                    while (matcher4.find()) {
                                        String group2 = matcher4.group(i12);
                                        group2.getClass();
                                        try {
                                            matcher2 = C0917e2.f13230b.matcher(group2);
                                            matcher3 = C0917e2.f13231c.matcher(group2);
                                            find = matcher2.find();
                                            find2 = matcher3.find();
                                        } catch (RuntimeException unused) {
                                            charset2 = c5;
                                        }
                                        if (find) {
                                            if (find2) {
                                                charset2 = c5;
                                                try {
                                                    StringBuilder sb = new StringBuilder();
                                                    c0784b22 = c0784b23;
                                                    try {
                                                        sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                                                        sb.append(group2);
                                                        sb.append("'");
                                                        JB.i("SsaStyle.Overrides", sb.toString());
                                                    } catch (RuntimeException unused2) {
                                                    }
                                                } catch (RuntimeException unused3) {
                                                    c0784b22 = c0784b23;
                                                    try {
                                                        matcher = C0917e2.f13232d.matcher(group2);
                                                        if (matcher.find()) {
                                                        }
                                                        i10 = -1;
                                                        if (i10 != -1) {
                                                        }
                                                    } catch (RuntimeException unused4) {
                                                    }
                                                    c5 = charset2;
                                                    c0784b23 = c0784b22;
                                                    i12 = 1;
                                                }
                                            } else {
                                                charset2 = c5;
                                                c0784b22 = c0784b23;
                                            }
                                            str = matcher2.group(1);
                                            group = matcher2.group(2);
                                        } else {
                                            charset2 = c5;
                                            c0784b22 = c0784b23;
                                            if (find2) {
                                                String group3 = matcher3.group(1);
                                                group = matcher3.group(2);
                                                str = group3;
                                            } else {
                                                pointF2 = null;
                                                if (pointF2 != null) {
                                                    pointF3 = pointF2;
                                                }
                                                matcher = C0917e2.f13232d.matcher(group2);
                                                if (matcher.find()) {
                                                    String group4 = matcher.group(1);
                                                    if (group4 == null) {
                                                        throw null;
                                                    }
                                                    try {
                                                        i10 = Integer.parseInt(group4.trim());
                                                    } catch (NumberFormatException unused5) {
                                                    }
                                                    switch (i10) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            break;
                                                        default:
                                                            JB.l("SsaStyle", "Ignoring unknown alignment: ".concat(group4));
                                                            break;
                                                    }
                                                    if (i10 != -1) {
                                                        i15 = i10;
                                                        c5 = charset2;
                                                        c0784b23 = c0784b22;
                                                        i12 = 1;
                                                    }
                                                    c5 = charset2;
                                                    c0784b23 = c0784b22;
                                                    i12 = 1;
                                                }
                                                i10 = -1;
                                                if (i10 != -1) {
                                                }
                                                c5 = charset2;
                                                c0784b23 = c0784b22;
                                                i12 = 1;
                                            }
                                        }
                                        if (str == null) {
                                            throw null;
                                        }
                                        float parseFloat = Float.parseFloat(str.trim());
                                        if (group == null) {
                                            throw null;
                                        }
                                        pointF2 = new PointF(parseFloat, Float.parseFloat(group.trim()));
                                        if (pointF2 != null) {
                                        }
                                        matcher = C0917e2.f13232d.matcher(group2);
                                        if (matcher.find()) {
                                        }
                                        i10 = -1;
                                        if (i10 != -1) {
                                        }
                                        c5 = charset2;
                                        c0784b23 = c0784b22;
                                        i12 = 1;
                                    }
                                    charset = c5;
                                    c0784b2 = c0784b23;
                                    String replace = C0917e2.f13229a.matcher(str2).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f10 = c0828c2.f12960o;
                                    float f11 = c0828c2.f12961p;
                                    SpannableString spannableString = new SpannableString(replace);
                                    if (c0962f2 != null) {
                                        Integer num2 = c0962f2.f13420c;
                                        if (num2 != null) {
                                            f = -3.4028235E38f;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            f = -3.4028235E38f;
                                        }
                                        if (c0962f2.f13425j == 3 && (num = c0962f2.f13421d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f12 = c0962f2.f13422e;
                                        if (f12 == f || f11 == f) {
                                            f8 = -3.4028235E38f;
                                            i7 = Integer.MIN_VALUE;
                                        } else {
                                            f8 = f12 / f11;
                                            i7 = 1;
                                        }
                                        boolean z5 = c0962f2.f;
                                        boolean z6 = c0962f2.f13423g;
                                        if (!z5) {
                                            f9 = f8;
                                            i6 = 0;
                                            i9 = 33;
                                            if (z6) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        } else if (z6) {
                                            f9 = f8;
                                            i6 = 0;
                                            i9 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f9 = f8;
                                            i6 = 0;
                                            i9 = 33;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        if (c0962f2.f13424h) {
                                            spannableString.setSpan(new UnderlineSpan(), i6, spannableString.length(), i9);
                                        }
                                        if (c0962f2.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i6, spannableString.length(), i9);
                                        }
                                        f5 = f9;
                                    } else {
                                        i6 = 0;
                                        f = -3.4028235E38f;
                                        f5 = -3.4028235E38f;
                                        i7 = Integer.MIN_VALUE;
                                    }
                                    int i16 = i15 != -1 ? i15 : c0962f2 != null ? c0962f2.f13419b : -1;
                                    switch (i16) {
                                        case 0:
                                        default:
                                            AbstractC0467k.y(i16, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    int i17 = Integer.MIN_VALUE;
                                    switch (i16) {
                                        case 0:
                                        default:
                                            AbstractC0467k.y(i16, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            i8 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i8 = i6;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i8 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i8 = 2;
                                            break;
                                    }
                                    switch (i16) {
                                        case -1:
                                            pointF = pointF3;
                                            break;
                                        case 0:
                                        default:
                                            AbstractC0467k.y(i16, "Unknown alignment: ", "SsaParser");
                                            pointF = pointF3;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            pointF = pointF3;
                                            i17 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            pointF = pointF3;
                                            i17 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i17 = i6;
                                            pointF = pointF3;
                                            break;
                                    }
                                    if (pointF == null || f11 == f || f10 == f) {
                                        f6 = 0.05f;
                                        f7 = i8 != 0 ? i8 != 1 ? i8 != 2 ? f : 0.95f : 0.5f : 0.05f;
                                        if (i17 != 0) {
                                            f6 = i17 != 1 ? i17 != 2 ? f : 0.95f : 0.5f;
                                        }
                                    } else {
                                        float f13 = pointF.x / f10;
                                        f6 = pointF.y / f11;
                                        f7 = f13;
                                    }
                                    C1881zg c1881zg = new C1881zg(spannableString, alignment, null, null, f6, i6, i17, f7, i8, i7, f5, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f);
                                    int a5 = a(b5, arrayList2, arrayList);
                                    for (int a6 = a(b3, arrayList2, arrayList); a6 < a5; a6++) {
                                        ((List) arrayList.get(a6)).add(c1881zg);
                                    }
                                    c0828c2 = this;
                                    c5 = charset;
                                    c0784b23 = c0784b2;
                                }
                            }
                            charset = c5;
                            c0784b2 = c0784b23;
                            c0828c2 = this;
                            c5 = charset;
                            c0784b23 = c0784b2;
                        }
                    }
                }
                charset = c5;
                c0784b2 = c0784b23;
                c0828c2 = this;
                c5 = charset;
                c0784b23 = c0784b2;
            }
        }
    }
}
