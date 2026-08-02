package o2;

import C0.K;
import C1.C0095a;
import Y4.D;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import d6.C0977k;
import j2.AbstractC1308e;
import j2.C1305b;
import j2.InterfaceC1309f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0.AbstractC1663a;
import v2.AbstractC1664a;
import v2.t;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1502a extends AbstractC1308e {

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f15572I = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: D, reason: collision with root package name */
    public final boolean f15573D;

    /* renamed from: E, reason: collision with root package name */
    public final K f15574E;

    /* renamed from: F, reason: collision with root package name */
    public LinkedHashMap f15575F;

    /* renamed from: G, reason: collision with root package name */
    public float f15576G = -3.4028235E38f;

    /* renamed from: H, reason: collision with root package name */
    public float f15577H = -3.4028235E38f;

    public C1502a(List list) {
        if (list == null || list.isEmpty()) {
            this.f15573D = false;
            this.f15574E = null;
            return;
        }
        this.f15573D = true;
        String n2 = t.n((byte[]) list.get(0));
        AbstractC1664a.f(n2.startsWith("Format:"));
        K b7 = K.b(n2);
        b7.getClass();
        this.f15574E = b7;
        i(new C0095a((byte[]) list.get(1)));
    }

    public static int h(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i7;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, Long.valueOf(j));
        arrayList2.add(i7, i7 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i7 - 1)));
        return i7;
    }

    public static long j(String str) {
        Matcher matcher = f15572I.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i7 = t.f17153a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override // j2.AbstractC1308e
    public final InterfaceC1309f e(byte[] bArr, int i7, boolean z4) {
        C0095a c0095a;
        K k7;
        long j;
        float f7;
        int i8;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i9;
        int i10;
        int i11;
        float f8;
        float f9;
        float f10;
        float f11;
        int i12;
        float f12;
        int i13;
        int i14;
        Integer num;
        int i15;
        int i16;
        C1502a c1502a = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0095a c0095a2 = new C0095a(bArr, i7);
        boolean z7 = c1502a.f15573D;
        if (!z7) {
            c1502a.i(c0095a2);
        }
        K k8 = z7 ? c1502a.f15574E : null;
        while (true) {
            String h6 = c0095a2.h();
            if (h6 == null) {
                return new C0977k(11, arrayList, arrayList2);
            }
            if (h6.startsWith("Format:")) {
                k8 = K.b(h6);
            } else {
                if (h6.startsWith("Dialogue:")) {
                    if (k8 == null) {
                        Log.w("SsaDecoder", "Skipping dialogue line before complete format: ".concat(h6));
                    } else {
                        AbstractC1664a.f(h6.startsWith("Dialogue:"));
                        String substring = h6.substring(9);
                        int i17 = k8.f1243e;
                        String[] split = substring.split(",", i17);
                        if (split.length != i17) {
                            Log.w("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(h6));
                        } else {
                            long j3 = j(split[k8.f1239a]);
                            if (j3 == -9223372036854775807L) {
                                Log.w("SsaDecoder", "Skipping invalid timing: ".concat(h6));
                            } else {
                                long j7 = j(split[k8.f1240b]);
                                if (j7 == -9223372036854775807L) {
                                    Log.w("SsaDecoder", "Skipping invalid timing: ".concat(h6));
                                } else {
                                    LinkedHashMap linkedHashMap = c1502a.f15575F;
                                    C1505d c1505d = (linkedHashMap == null || (i16 = k8.f1241c) == -1) ? null : (C1505d) linkedHashMap.get(split[i16].trim());
                                    String str = split[k8.f1242d];
                                    Matcher matcher = C1504c.f15588a.matcher(str);
                                    int i18 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        C0095a c0095a3 = c0095a2;
                                        String group = matcher.group(1);
                                        group.getClass();
                                        try {
                                            PointF a2 = C1504c.a(group);
                                            if (a2 != null) {
                                                pointF = a2;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = C1504c.f15591d.matcher(group);
                                            if (matcher2.find()) {
                                                String group2 = matcher2.group(1);
                                                group2.getClass();
                                                i15 = C1505d.a(group2);
                                            } else {
                                                i15 = -1;
                                            }
                                            if (i15 != -1) {
                                                i18 = i15;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        c0095a2 = c0095a3;
                                    }
                                    c0095a = c0095a2;
                                    String replace = C1504c.f15588a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f13 = c1502a.f15576G;
                                    float f14 = c1502a.f15577H;
                                    SpannableString spannableString = new SpannableString(replace);
                                    if (c1505d != null) {
                                        Integer num2 = c1505d.f15594c;
                                        if (num2 != null) {
                                            k7 = k8;
                                            j = j7;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            k7 = k8;
                                            j = j7;
                                        }
                                        if (c1505d.j == 3 && (num = c1505d.f15595d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f15 = c1505d.f15596e;
                                        if (f15 == -3.4028235E38f || f14 == -3.4028235E38f) {
                                            f11 = -3.4028235E38f;
                                            i12 = Integer.MIN_VALUE;
                                        } else {
                                            f11 = f15 / f14;
                                            i12 = 1;
                                        }
                                        boolean z8 = c1505d.f15598g;
                                        boolean z9 = c1505d.f15597f;
                                        if (z9 && z8) {
                                            f12 = f11;
                                            i13 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            i14 = 0;
                                        } else {
                                            f12 = f11;
                                            i13 = 33;
                                            i14 = 0;
                                            if (z9) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z8) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (c1505d.f15599h) {
                                            spannableString.setSpan(new UnderlineSpan(), i14, spannableString.length(), i13);
                                        }
                                        if (c1505d.f15600i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i14, spannableString.length(), i13);
                                        }
                                        i8 = i12;
                                        f7 = f12;
                                    } else {
                                        k7 = k8;
                                        j = j7;
                                        f7 = -3.4028235E38f;
                                        i8 = Integer.MIN_VALUE;
                                    }
                                    int i19 = -1;
                                    if (i18 != -1) {
                                        i19 = i18;
                                    } else if (c1505d != null) {
                                        i19 = c1505d.f15593b;
                                    }
                                    switch (i19) {
                                        case 0:
                                        default:
                                            AbstractC1663a.j(i19, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i20 = Integer.MIN_VALUE;
                                    switch (i19) {
                                        case 0:
                                        default:
                                            AbstractC1663a.j(i19, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            i9 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i9 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i9 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i9 = 2;
                                            break;
                                    }
                                    switch (i19) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            AbstractC1663a.j(i19, "Unknown alignment: ", "SsaDecoder");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i20 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i20 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i20 = 0;
                                            break;
                                    }
                                    if (pointF == null || f14 == -3.4028235E38f || f13 == -3.4028235E38f) {
                                        if (i9 != 0) {
                                            i10 = 1;
                                            if (i9 != 1) {
                                                i11 = 2;
                                                f8 = i9 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i11 = 2;
                                                f8 = 0.5f;
                                            }
                                        } else {
                                            i10 = 1;
                                            i11 = 2;
                                            f8 = 0.05f;
                                        }
                                        f9 = i20 != 0 ? i20 != i10 ? i20 != i11 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                        f10 = f8;
                                    } else {
                                        f10 = pointF.x / f13;
                                        f9 = pointF.y / f14;
                                    }
                                    C1305b c1305b = new C1305b(spannableString, alignment2, null, null, f9, 0, i20, f10, i9, i8, f7, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int h7 = h(j, arrayList2, arrayList);
                                    for (int h8 = h(j3, arrayList2, arrayList); h8 < h7; h8++) {
                                        ((List) arrayList.get(h8)).add(c1305b);
                                    }
                                    c1502a = this;
                                    c0095a2 = c0095a;
                                    k8 = k7;
                                }
                            }
                        }
                    }
                }
                c0095a = c0095a2;
                k7 = k8;
                c1502a = this;
                c0095a2 = c0095a;
                k8 = k7;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02b6, code lost:
    
        if (r4 != 3) goto L185;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(C0095a c0095a) {
        char c3;
        String h6;
        int i7;
        C1505d c1505d;
        float f7;
        int i8;
        String trim;
        int i9;
        float f8;
        int i10 = 6;
        int i11 = 7;
        int i12 = 2;
        int i13 = 0;
        while (true) {
            String h7 = c0095a.h();
            if (h7 == null) {
                return;
            }
            c3 = '[';
            if ("[Script Info]".equalsIgnoreCase(h7)) {
                while (true) {
                    String h8 = c0095a.h();
                    if (h8 != null && (c0095a.d() == 0 || (((byte[]) c0095a.f1465c)[c0095a.f1463a] & 255) != 91)) {
                        String[] split = h8.split(":");
                        if (split.length == i12) {
                            String a02 = D.a0(split[i13].trim());
                            a02.getClass();
                            if (a02.equals("playresx")) {
                                this.f15576G = Float.parseFloat(split[1].trim());
                            } else if (a02.equals("playresy")) {
                                try {
                                    this.f15577H = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else {
                if ("[V4+ Styles]".equalsIgnoreCase(h7)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1503b c1503b = null;
                    while (true) {
                        h6 = c0095a.h();
                        if (h6 != null && (c0095a.d() == 0 || (((byte[]) c0095a.f1465c)[c0095a.f1463a] & 255) != c3)) {
                            if (h6.startsWith("Format:")) {
                                String[] split2 = TextUtils.split(h6.substring(i11), ",");
                                int i14 = -1;
                                int i15 = -1;
                                int i16 = -1;
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = -1;
                                int i20 = -1;
                                int i21 = -1;
                                int i22 = -1;
                                int i23 = -1;
                                for (int i24 = i13; i24 < split2.length; i24++) {
                                    String a03 = D.a0(split2[i24].trim());
                                    a03.getClass();
                                    switch (a03.hashCode()) {
                                        case -1178781136:
                                            if (a03.equals("italic")) {
                                                i7 = i13;
                                                break;
                                            }
                                            i7 = -1;
                                            break;
                                        case -1026963764:
                                            if (a03.equals("underline")) {
                                                i7 = 1;
                                                break;
                                            }
                                            i7 = -1;
                                            break;
                                        case -192095652:
                                            if (a03.equals("strikeout")) {
                                                i7 = 2;
                                                break;
                                            }
                                            i7 = -1;
                                            break;
                                        case -70925746:
                                            if (a03.equals("primarycolour")) {
                                                i7 = 3;
                                                break;
                                            }
                                            i7 = -1;
                                            break;
                                        case 3029637:
                                            if (a03.equals("bold")) {
                                                i7 = 4;
                                                break;
                                            }
                                            i7 = -1;
                                            break;
                                        case 3373707:
                                            if (a03.equals("name")) {
                                                i7 = 5;
                                                break;
                                            }
                                            i7 = -1;
                                            break;
                                        case 366554320:
                                            if (a03.equals("fontsize")) {
                                                i7 = i10;
                                                break;
                                            }
                                            i7 = -1;
                                            break;
                                        case 767321349:
                                            if (a03.equals("borderstyle")) {
                                                i7 = 7;
                                                break;
                                            }
                                            i7 = -1;
                                            break;
                                        case 1767875043:
                                            if (a03.equals("alignment")) {
                                                i7 = 8;
                                                break;
                                            }
                                            i7 = -1;
                                            break;
                                        case 1988365454:
                                            if (a03.equals("outlinecolour")) {
                                                i7 = 9;
                                                break;
                                            }
                                            i7 = -1;
                                            break;
                                        default:
                                            i7 = -1;
                                            break;
                                    }
                                    switch (i7) {
                                        case 0:
                                            i20 = i24;
                                            break;
                                        case 1:
                                            i21 = i24;
                                            break;
                                        case 2:
                                            i22 = i24;
                                            break;
                                        case 3:
                                            i16 = i24;
                                            break;
                                        case 4:
                                            i19 = i24;
                                            break;
                                        case 5:
                                            i14 = i24;
                                            break;
                                        case 6:
                                            i18 = i24;
                                            break;
                                        case 7:
                                            i23 = i24;
                                            break;
                                        case 8:
                                            i15 = i24;
                                            break;
                                        case 9:
                                            i17 = i24;
                                            break;
                                    }
                                }
                                c1503b = i14 != -1 ? new C1503b(i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, split2.length) : null;
                                i11 = 7;
                            } else {
                                if (h6.startsWith("Style:")) {
                                    if (c1503b == null) {
                                        Log.w("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(h6));
                                    } else {
                                        AbstractC1664a.f(h6.startsWith("Style:"));
                                        String[] split3 = TextUtils.split(h6.substring(i10), ",");
                                        int length = split3.length;
                                        int i25 = c1503b.f15587k;
                                        if (length != i25) {
                                            int length2 = split3.length;
                                            int i26 = t.f17153a;
                                            Locale locale = Locale.US;
                                            StringBuilder g3 = AbstractC1663a.g("Skipping malformed 'Style:' line (expected ", i25, " values, found ", length2, "): '");
                                            g3.append(h6);
                                            g3.append("'");
                                            Log.w("SsaStyle", g3.toString());
                                        } else {
                                            try {
                                                String trim2 = split3[c1503b.f15578a].trim();
                                                int i27 = c1503b.f15579b;
                                                int a2 = i27 != -1 ? C1505d.a(split3[i27].trim()) : -1;
                                                int i28 = c1503b.f15580c;
                                                Integer c4 = i28 != -1 ? C1505d.c(split3[i28].trim()) : null;
                                                int i29 = c1503b.f15581d;
                                                Integer c7 = i29 != -1 ? C1505d.c(split3[i29].trim()) : null;
                                                int i30 = c1503b.f15582e;
                                                if (i30 != -1) {
                                                    String trim3 = split3[i30].trim();
                                                    try {
                                                        f8 = Float.parseFloat(trim3);
                                                    } catch (NumberFormatException e7) {
                                                        AbstractC1664a.G(e7, "SsaStyle", "Failed to parse font size: '" + trim3 + "'");
                                                        f8 = -3.4028235E38f;
                                                    }
                                                    f7 = f8;
                                                } else {
                                                    f7 = -3.4028235E38f;
                                                }
                                                int i31 = c1503b.f15583f;
                                                boolean z4 = i31 != -1 && C1505d.b(split3[i31].trim());
                                                int i32 = c1503b.f15584g;
                                                boolean z7 = i32 != -1 && C1505d.b(split3[i32].trim());
                                                int i33 = c1503b.f15585h;
                                                boolean z8 = i33 != -1 && C1505d.b(split3[i33].trim());
                                                int i34 = c1503b.f15586i;
                                                boolean z9 = i34 != -1 && C1505d.b(split3[i34].trim());
                                                int i35 = c1503b.j;
                                                if (i35 != -1) {
                                                    trim = split3[i35].trim();
                                                    try {
                                                        i9 = Integer.parseInt(trim.trim());
                                                        if (i9 != 1) {
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    i8 = i9;
                                                } else {
                                                    i8 = -1;
                                                }
                                                c1505d = new C1505d(trim2, a2, c4, c7, f7, z4, z7, z8, z9, i8);
                                            } catch (RuntimeException e8) {
                                                e = e8;
                                            }
                                            if (c1505d != null) {
                                                linkedHashMap.put(c1505d.f15592a, c1505d);
                                            }
                                            i10 = 6;
                                            i11 = 7;
                                            i13 = 0;
                                            c3 = '[';
                                        }
                                        c1505d = null;
                                        if (c1505d != null) {
                                        }
                                        i10 = 6;
                                        i11 = 7;
                                        i13 = 0;
                                        c3 = '[';
                                    }
                                }
                                i10 = 6;
                                i11 = 7;
                                i13 = 0;
                                c3 = '[';
                            }
                        }
                    }
                    this.f15575F = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(h7)) {
                    Log.i("SsaDecoder", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(h7)) {
                    return;
                }
                i10 = 6;
                i11 = 7;
                i12 = 2;
                i13 = 0;
            }
        }
        try {
            Log.w("SsaStyle", "Ignoring unknown BorderStyle: " + trim);
            i9 = -1;
            i8 = i9;
            c1505d = new C1505d(trim2, a2, c4, c7, f7, z4, z7, z8, z9, i8);
        } catch (RuntimeException e9) {
            e = e9;
            AbstractC1664a.G(e, "SsaStyle", "Skipping malformed 'Style:' line: '" + h6 + "'");
            c1505d = null;
            if (c1505d != null) {
            }
            i10 = 6;
            i11 = 7;
            i13 = 0;
            c3 = '[';
        }
        if (c1505d != null) {
        }
        i10 = 6;
        i11 = 7;
        i13 = 0;
        c3 = '[';
    }
}
