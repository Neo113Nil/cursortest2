package p104o2;

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
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p028d6.k;
import p068j2.b;
import p068j2.e;
import p068j2.f;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Pattern f15578I = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f15579D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final K f15580E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public LinkedHashMap f15581F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f15582G = -3.4028235E38f;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f15583H = -3.4028235E38f;

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.f15579D = false;
            this.f15580E = null;
            return;
        }
        this.f15579D = true;
        String strN = t.n((byte[]) list.get(0));
        p151v2.a.f(strN.startsWith("Format:"));
        K kB = K.b(strN);
        kB.getClass();
        this.f15580E = kB;
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
        Matcher matcher = f15578I.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i7 = t.f17159a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // p068j2.e
    public final f e(byte[] bArr, int i7, boolean z4) {
        C0095a c0095a;
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
        int iA;
        int i15;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0095a c0095a2 = new C0095a(bArr, i7);
        boolean z7 = aVar.f15579D;
        if (!z7) {
            aVar.i(c0095a2);
        }
        K kB = z7 ? aVar.f15580E : null;
        while (true) {
            String strH = c0095a2.h();
            if (strH == null) {
                return new k(11, arrayList, arrayList2);
            }
            if (strH.startsWith("Format:")) {
                kB = K.b(strH);
            } else {
                if (strH.startsWith("Dialogue:")) {
                    if (kB == null) {
                        Log.w("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strH));
                    } else {
                        p151v2.a.f(strH.startsWith("Dialogue:"));
                        String strSubstring = strH.substring(9);
                        int i16 = kB.f1243e;
                        String[] strArrSplit = strSubstring.split(",", i16);
                        if (strArrSplit.length != i16) {
                            Log.w("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(strH));
                        } else {
                            if (j(strArrSplit[kB.f1239a]) == -9223372036854775807L) {
                                Log.w("SsaDecoder", "Skipping invalid timing: ".concat(strH));
                            } else {
                                long j = j(strArrSplit[kB.f1240b]);
                                if (j == -9223372036854775807L) {
                                    Log.w("SsaDecoder", "Skipping invalid timing: ".concat(strH));
                                } else {
                                    LinkedHashMap linkedHashMap = aVar.f15581F;
                                    d dVar = (linkedHashMap == null || (i15 = kB.f1241c) == -1) ? null : (d) linkedHashMap.get(strArrSplit[i15].trim());
                                    String str = strArrSplit[kB.f1242d];
                                    Matcher matcher = c.f15594a.matcher(str);
                                    int i17 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        C0095a c0095a3 = c0095a2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = c.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = c.f15597d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = d.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i17 = iA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        c0095a2 = c0095a3;
                                    }
                                    c0095a = c0095a2;
                                    String strReplace = c.f15594a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f13 = aVar.f15582G;
                                    float f14 = aVar.f15583H;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (dVar != null) {
                                        Integer num2 = dVar.f15600c;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (dVar.j == 3 && (num = dVar.f15601d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f15 = dVar.f15602e;
                                        if (f15 == -3.4028235E38f || f14 == -3.4028235E38f) {
                                            f11 = -3.4028235E38f;
                                            i12 = Integer.MIN_VALUE;
                                        } else {
                                            f11 = f15 / f14;
                                            i12 = 1;
                                        }
                                        boolean z8 = dVar.f15604g;
                                        boolean z9 = dVar.f15603f;
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
                                        if (dVar.f15605h) {
                                            spannableString.setSpan(new UnderlineSpan(), i14, spannableString.length(), i13);
                                        }
                                        if (dVar.f15606i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i14, spannableString.length(), i13);
                                        }
                                        i8 = i12;
                                        f7 = f12;
                                    } else {
                                        kB = kB;
                                        j = j;
                                        f7 = -3.4028235E38f;
                                        i8 = Integer.MIN_VALUE;
                                    }
                                    int i18 = -1;
                                    if (i17 != -1) {
                                        i18 = i17;
                                    } else if (dVar != null) {
                                        i18 = dVar.f15599b;
                                    }
                                    switch (i18) {
                                        case 0:
                                        default:
                                            p150v0.a.j(i18, "Unknown alignment: ", "SsaDecoder");
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
                                    int i19 = Integer.MIN_VALUE;
                                    switch (i18) {
                                        case 0:
                                        default:
                                            p150v0.a.j(i18, "Unknown alignment: ", "SsaDecoder");
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
                                    switch (i18) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            p150v0.a.j(i18, "Unknown alignment: ", "SsaDecoder");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i19 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i19 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i19 = 0;
                                            break;
                                    }
                                    if (pointF == null || f14 == -3.4028235E38f || f13 == -3.4028235E38f) {
                                        float f16 = 0.05f;
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
                                        if (i19 != 0) {
                                            f16 = i19 != i10 ? i19 != i11 ? -3.4028235E38f : 0.95f : 0.5f;
                                        }
                                        f9 = f16;
                                        f10 = f8;
                                    } else {
                                        f10 = pointF.x / f13;
                                        f9 = pointF.y / f14;
                                    }
                                    b bVar = new b(spannableString, alignment2, null, null, f9, 0, i19, f10, i9, i8, f7, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int iH = h(j, arrayList2, arrayList);
                                    for (int iH2 = h(r9, arrayList2, arrayList); iH2 < iH; iH2++) {
                                        ((List) arrayList.get(iH2)).add(bVar);
                                    }
                                }
                            }
                        }
                    }
                    c0095a = c0095a2;
                    kB = kB;
                } else {
                    c0095a = c0095a2;
                    kB = kB;
                }
                aVar = this;
                c0095a2 = c0095a;
                kB = kB;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x02f1  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void i(C0095a c0095a) {
        int i7;
        d dVar;
        float f7;
        int i8;
        int i9;
        float f8;
        int i10 = 6;
        int i11 = 7;
        int i12 = 2;
        int i13 = 0;
        while (true) {
            String strH = c0095a.h();
            if (strH == null) {
                return;
            }
            char c3 = '[';
            if ("[Script Info]".equalsIgnoreCase(strH)) {
                while (true) {
                    String strH2 = c0095a.h();
                    if (strH2 == null || (c0095a.d() != 0 && (((byte[]) c0095a.f1465c)[c0095a.f1463a] & 255) == 91)) {
                        break;
                    }
                    String[] strArrSplit = strH2.split(":");
                    if (strArrSplit.length == i12) {
                        String strA0 = D.a0(strArrSplit[i13].trim());
                        strA0.getClass();
                        if (strA0.equals("playresx")) {
                            this.f15582G = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strA0.equals("playresy")) {
                            try {
                                this.f15583H = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else {
                if ("[V4+ Styles]".equalsIgnoreCase(strH)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    b bVar = null;
                    while (true) {
                        String strH3 = c0095a.h();
                        if (strH3 != null && (c0095a.d() == 0 || (((byte[]) c0095a.f1465c)[c0095a.f1463a] & 255) != c3)) {
                            if (strH3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strH3.substring(i11), ",");
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
                                for (int i24 = i13; i24 < strArrSplit2.length; i24++) {
                                    String strA1 = D.a0(strArrSplit2[i24].trim());
                                    strA1.getClass();
                                    switch (strA1.hashCode()) {
                                        case -1178781136:
                                            i7 = strA1.equals("italic") ? i13 : -1;
                                            break;
                                        case -1026963764:
                                            i7 = strA1.equals("underline") ? 1 : -1;
                                            break;
                                        case -192095652:
                                            i7 = strA1.equals("strikeout") ? 2 : -1;
                                            break;
                                        case -70925746:
                                            i7 = strA1.equals("primarycolour") ? 3 : -1;
                                            break;
                                        case 3029637:
                                            i7 = strA1.equals("bold") ? 4 : -1;
                                            break;
                                        case 3373707:
                                            i7 = strA1.equals("name") ? 5 : -1;
                                            break;
                                        case 366554320:
                                            i7 = strA1.equals("fontsize") ? i10 : -1;
                                            break;
                                        case 767321349:
                                            i7 = strA1.equals("borderstyle") ? 7 : -1;
                                            break;
                                        case 1767875043:
                                            i7 = strA1.equals("alignment") ? 8 : -1;
                                            break;
                                        case 1988365454:
                                            i7 = strA1.equals("outlinecolour") ? 9 : -1;
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
                                bVar = i14 != -1 ? new b(i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, strArrSplit2.length) : null;
                                i11 = 7;
                            } else {
                                if (strH3.startsWith("Style:")) {
                                    if (bVar == null) {
                                        Log.w("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(strH3));
                                    } else {
                                        p151v2.a.f(strH3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strH3.substring(i10), ",");
                                        int length = strArrSplit3.length;
                                        int i25 = bVar.f15593k;
                                        if (length != i25) {
                                            int length2 = strArrSplit3.length;
                                            int i26 = t.f17159a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbG = p150v0.a.g("Skipping malformed 'Style:' line (expected ", i25, " values, found ", length2, "): '");
                                            sbG.append(strH3);
                                            sbG.append("'");
                                            Log.w("SsaStyle", sbG.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[bVar.f15584a].trim();
                                                int i27 = bVar.f15585b;
                                                int iA = i27 != -1 ? d.a(strArrSplit3[i27].trim()) : -1;
                                                int i28 = bVar.f15586c;
                                                Integer numC = i28 != -1 ? d.c(strArrSplit3[i28].trim()) : null;
                                                int i29 = bVar.f15587d;
                                                Integer numC2 = i29 != -1 ? d.c(strArrSplit3[i29].trim()) : null;
                                                int i30 = bVar.f15588e;
                                                if (i30 != -1) {
                                                    String strTrim2 = strArrSplit3[i30].trim();
                                                    try {
                                                        f8 = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e7) {
                                                        p151v2.a.G(e7, "SsaStyle", "Failed to parse font size: '" + strTrim2 + "'");
                                                        f8 = -3.4028235E38f;
                                                    }
                                                    f7 = f8;
                                                } else {
                                                    f7 = -3.4028235E38f;
                                                }
                                                int i31 = bVar.f15589f;
                                                boolean z4 = i31 != -1 && d.b(strArrSplit3[i31].trim());
                                                int i32 = bVar.f15590g;
                                                boolean z7 = i32 != -1 && d.b(strArrSplit3[i32].trim());
                                                int i33 = bVar.f15591h;
                                                boolean z8 = i33 != -1 && d.b(strArrSplit3[i33].trim());
                                                int i34 = bVar.f15592i;
                                                boolean z9 = i34 != -1 && d.b(strArrSplit3[i34].trim());
                                                int i35 = bVar.j;
                                                if (i35 != -1) {
                                                    String strTrim3 = strArrSplit3[i35].trim();
                                                    try {
                                                        i9 = Integer.parseInt(strTrim3.trim());
                                                        if (i9 != 1 && i9 != 3) {
                                                            try {
                                                                Log.w("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                                i9 = -1;
                                                            } catch (RuntimeException e8) {
                                                                e = e8;
                                                                p151v2.a.G(e, "SsaStyle", "Skipping malformed 'Style:' line: '" + strH3 + "'");
                                                                dVar = null;
                                                            }
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    i8 = i9;
                                                } else {
                                                    i8 = -1;
                                                }
                                                dVar = new d(strTrim, iA, numC, numC2, f7, z4, z7, z8, z9, i8);
                                            } catch (RuntimeException e9) {
                                                e = e9;
                                            }
                                            if (dVar != null) {
                                                linkedHashMap.put(dVar.f15598a, dVar);
                                            }
                                        }
                                        dVar = null;
                                        if (dVar != null) {
                                            linkedHashMap.put(dVar.f15598a, dVar);
                                        }
                                    }
                                }
                                i10 = 6;
                                i11 = 7;
                                i13 = 0;
                                c3 = '[';
                            }
                        }
                    }
                    this.f15581F = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(strH)) {
                    Log.i("SsaDecoder", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strH)) {
                    return;
                }
                i10 = 6;
                i11 = 7;
                i12 = 2;
                i13 = 0;
            }
        }
    }
}
