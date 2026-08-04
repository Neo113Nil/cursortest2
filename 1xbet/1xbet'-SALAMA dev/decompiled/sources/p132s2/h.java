package p132s2;

import B4.V;
import C1.C0095a;
import Q0.a;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p031e1.k;
import p151v2.t;
import p155w1.C1013m0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f16144a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f16145b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f16146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f16147d;

    static {
        HashMap map = new HashMap();
        k.n(255, 255, 255, map, "white");
        k.n(0, 255, 0, map, "lime");
        k.n(0, 255, 255, map, "cyan");
        k.n(255, 0, 0, map, "red");
        k.n(255, 255, 0, map, "yellow");
        k.n(255, 0, 255, map, "magenta");
        k.n(0, 0, 255, map, "blue");
        k.n(0, 0, 0, map, "black");
        f16146c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        k.n(255, 255, 255, map2, "bg_white");
        k.n(0, 255, 0, map2, "bg_lime");
        k.n(0, 255, 255, map2, "bg_cyan");
        k.n(255, 0, 0, map2, "bg_red");
        k.n(255, 255, 0, map2, "bg_yellow");
        k.n(255, 0, 255, map2, "bg_magenta");
        k.n(0, 0, 255, map2, "bg_blue");
        k.n(0, 0, 0, map2, "bg_black");
        f16147d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x001e  */
    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i7;
        int i8;
        int i9 = eVar.f16129b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.f16128a;
        str2.getClass();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i9, length, 33);
                break;
            case "c":
                for (String str3 : eVar.f16131d) {
                    Map map = f16146c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i9, length, 33);
                    } else {
                        Map map2 = f16147d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i9, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i9, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, length, 33);
                break;
            case "ruby":
                c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f16125c);
                int i10 = eVar.f16129b;
                int length2 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if ("rt".equals(((d) arrayList.get(i11)).f16126a.f16128a)) {
                        d dVar = (d) arrayList.get(i11);
                        c(list2, str, dVar.f16126a);
                        int i12 = dVar.f16126a.f16129b - length2;
                        int i13 = dVar.f16127b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i13);
                        spannableStringBuilder.delete(i12, i13);
                        charSequenceSubSequence.toString();
                        spannableStringBuilder.setSpan(new V(20), i10, i12, 33);
                        length2 += charSequenceSubSequence.length();
                        i10 = i12;
                    }
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, eVar);
        for (int i14 = 0; i14 < arrayListB.size(); i14++) {
            b bVar = ((f) arrayListB.get(i14)).f16133b;
            int i15 = bVar.f16116k;
            if (i15 == -1 && bVar.f16117l == -1) {
                i8 = -1;
                i7 = -1;
            } else {
                i7 = (bVar.f16117l == 1 ? 2 : 0) | (i15 == 1 ? 1 : 0);
                i8 = -1;
            }
            if (i7 != i8) {
                int i16 = bVar.f16116k;
                a.b(spannableStringBuilder, new StyleSpan((i16 == i8 && bVar.f16117l == i8) ? i8 : (i16 == 1 ? 1 : 0) | (bVar.f16117l == 1 ? 2 : 0)), i9, length);
            }
            if (bVar.j == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, length, 33);
            }
            if (bVar.f16113g) {
                if (!bVar.f16113g) {
                    throw new IllegalStateException("Font color not defined");
                }
                a.b(spannableStringBuilder, new ForegroundColorSpan(bVar.f16112f), i9, length);
            }
            if (bVar.f16115i) {
                if (!bVar.f16115i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                a.b(spannableStringBuilder, new BackgroundColorSpan(bVar.f16114h), i9, length);
            }
            if (bVar.f16111e != null) {
                a.b(spannableStringBuilder, new TypefaceSpan(bVar.f16111e), i9, length);
            }
            int i17 = bVar.f16118m;
            if (i17 == 1) {
                a.b(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.f16119n, true), i9, length);
            } else if (i17 == 2) {
                a.b(spannableStringBuilder, new RelativeSizeSpan(bVar.f16119n), i9, length);
            } else if (i17 == 3) {
                a.b(spannableStringBuilder, new RelativeSizeSpan(bVar.f16119n / 100.0f), i9, length);
            }
            if (bVar.f16121p) {
                spannableStringBuilder.setSpan(new C1013m0(19), i9, length, 33);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, e eVar) {
        ?? r7;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            b bVar = (b) list.get(i7);
            String str2 = eVar.f16128a;
            if (bVar.f16107a.isEmpty() && bVar.f16108b.isEmpty() && bVar.f16109c.isEmpty() && bVar.f16110d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iA = b.a(b.a(b.a(0, 1073741824, bVar.f16107a, str), 2, bVar.f16108b, str2), 4, bVar.f16110d, eVar.f16130c);
                if (iA != -1) {
                    if (eVar.f16131d.containsAll(bVar.f16109c)) {
                        size = iA + (bVar.f16109c.size() * 4);
                    } else {
                        r7 = 0;
                    }
                } else {
                    r7 = 0;
                }
            }
            if (r7 > 0) {
                r7 = size;
                r7 = zIsEmpty;
                arrayList.add(new f(r7, bVar));
            } else {
                r7 = size;
                r7 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void c(List list, String str, e eVar) {
        ArrayList arrayListB = b(list, str, eVar);
        for (int i7 = 0; i7 < arrayListB.size() && ((f) arrayListB.get(i7)).f16133b.f16120o == -1; i7++) {
        }
    }

    public static c d(String str, Matcher matcher, C0095a c0095a, ArrayList arrayList) {
        g gVar = new g();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            gVar.f16134a = j.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            gVar.f16135b = j.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, gVar);
            StringBuilder sb = new StringBuilder();
            String strH = c0095a.h();
            while (!TextUtils.isEmpty(strH)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strH.trim());
                strH = c0095a.h();
            }
            gVar.f16136c = f(str, sb.toString(), arrayList);
            return new c(gVar.a().a(), gVar.f16134a, gVar.f16135b);
        } catch (NumberFormatException unused) {
            Log.w("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, g gVar) {
        int i7;
        int i8;
        int i9;
        Matcher matcher = f16145b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, gVar);
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            i7 = 2;
                            break;
                        case "end":
                            i7 = 3;
                            break;
                        case "left":
                            i7 = 4;
                            break;
                        case "right":
                            i7 = 5;
                            break;
                        case "start":
                            i7 = 1;
                            break;
                        default:
                            Log.w("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i7 = 2;
                            break;
                    }
                    gVar.f16137d = i7;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        strSubstring.getClass();
                        switch (strSubstring) {
                            case "line-left":
                            case "start":
                                i8 = 0;
                                break;
                            case "center":
                            case "middle":
                                i8 = 1;
                                break;
                            case "line-right":
                            case "end":
                                i8 = 2;
                                break;
                            default:
                                Log.w("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                i8 = Integer.MIN_VALUE;
                                break;
                        }
                        gVar.f16142i = i8;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    gVar.f16141h = j.b(strGroup2);
                } else if (RRWebVideoEvent.JsonKeys.SIZE.equals(strGroup)) {
                    gVar.j = j.b(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    if (strGroup2.equals("lr")) {
                        i9 = 2;
                    } else if (strGroup2.equals("rl")) {
                        i9 = 1;
                    } else {
                        Log.w("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                        i9 = Integer.MIN_VALUE;
                    }
                    gVar.f16143k = i9;
                } else {
                    Log.w("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                Log.w("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00fb. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SpannedString f(String str, String str2, List list) {
        int i7;
        int i8;
        int i9;
        char c3;
        int i10 = -1;
        int i11 = 2;
        int i12 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (true) {
            String strTrim = "";
            if (i13 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i13);
            if (cCharAt != '&') {
                if (cCharAt != '<') {
                    spannableStringBuilder.append(cCharAt);
                    i13 += i12;
                } else {
                    int i14 = i13 + 1;
                    if (i14 >= str2.length()) {
                        i13 = i14;
                    } else {
                        int i15 = str2.charAt(i14) == '/' ? i12 : 0;
                        int iIndexOf = str2.indexOf(62, i14);
                        int length = iIndexOf == i10 ? str2.length() : iIndexOf + i12;
                        int i16 = length - 2;
                        int i17 = str2.charAt(i16) == '/' ? i12 : 0;
                        int i18 = i13 + (i15 != 0 ? i11 : i12);
                        if (i17 == 0) {
                            i16 = length - 1;
                        }
                        String strSubstring = str2.substring(i18, i16);
                        if (!strSubstring.trim().isEmpty()) {
                            String strTrim2 = strSubstring.trim();
                            p151v2.a.f(strTrim2.isEmpty() ^ i12);
                            int i19 = t.f17159a;
                            String str3 = strTrim2.split("[ \\.]", i11)[0];
                            str3.getClass();
                            switch (str3.hashCode()) {
                                case 98:
                                    if (str3.equals("b")) {
                                        i9 = 0;
                                    } else {
                                        i9 = -1;
                                    }
                                    break;
                                case 99:
                                    if (str3.equals("c")) {
                                        i9 = i12;
                                    } else {
                                        i9 = -1;
                                    }
                                    break;
                                case 105:
                                    if (str3.equals("i")) {
                                        i9 = i11;
                                    } else {
                                        i9 = -1;
                                    }
                                    break;
                                case 117:
                                    if (str3.equals("u")) {
                                        i9 = 3;
                                    } else {
                                        i9 = -1;
                                    }
                                    break;
                                case 118:
                                    if (str3.equals("v")) {
                                        i9 = 4;
                                    } else {
                                        i9 = -1;
                                    }
                                    break;
                                case 3650:
                                    if (str3.equals("rt")) {
                                        i9 = 5;
                                    } else {
                                        i9 = -1;
                                    }
                                    break;
                                case 3314158:
                                    if (str3.equals("lang")) {
                                        i9 = 6;
                                    } else {
                                        i9 = -1;
                                    }
                                    break;
                                case 3511770:
                                    if (str3.equals("ruby")) {
                                        i9 = 7;
                                    } else {
                                        i9 = -1;
                                    }
                                    break;
                                default:
                                    i9 = -1;
                                    break;
                            }
                            switch (i9) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (i15 != 0) {
                                        while (!arrayDeque.isEmpty()) {
                                            e eVar = (e) arrayDeque.pop();
                                            a(str, eVar, arrayList, spannableStringBuilder, list);
                                            if (arrayDeque.isEmpty()) {
                                                arrayList.clear();
                                            } else {
                                                arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                            }
                                            if (eVar.f16128a.equals(str3)) {
                                            }
                                        }
                                    } else if (i17 == 0) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring.trim();
                                        p151v2.a.f(strTrim3.isEmpty() ^ i12);
                                        int iIndexOf2 = strTrim3.indexOf(" ");
                                        if (iIndexOf2 == -1) {
                                            c3 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf2).trim();
                                            c3 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf2);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str4 = strArrSplit[c3];
                                        HashSet hashSet = new HashSet();
                                        for (int i20 = i12; i20 < strArrSplit.length; i20 += i12) {
                                            hashSet.add(strArrSplit[i20]);
                                        }
                                        arrayDeque.push(new e(str4, length2, strTrim, hashSet));
                                    }
                                    i13 = length;
                                    i8 = i12;
                                    i7 = -1;
                                    break;
                                default:
                                    break;
                            }
                        }
                        i13 = length;
                        i10 = -1;
                    }
                }
                i8 = i12;
                i7 = i10;
            } else {
                i13 += i12;
                int iIndexOf3 = str2.indexOf(59, i13);
                int iIndexOf4 = str2.indexOf(32, i13);
                i7 = -1;
                if (iIndexOf3 == -1) {
                    iIndexOf3 = iIndexOf4;
                } else if (iIndexOf4 != -1) {
                    iIndexOf3 = Math.min(iIndexOf3, iIndexOf4);
                }
                if (iIndexOf3 != -1) {
                    String strSubstring2 = str2.substring(i13, iIndexOf3);
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            Log.w("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring2 + ";'");
                            break;
                    }
                    if (iIndexOf3 == iIndexOf4) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i8 = 1;
                    i13 = iIndexOf3 + 1;
                } else {
                    i8 = 1;
                    spannableStringBuilder.append(cCharAt);
                }
            }
            i10 = i7;
            i11 = 2;
            i12 = i8;
        }
    }

    public static void g(String str, g gVar) {
        int i7 = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i7 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i7 = 0;
                    break;
                default:
                    Log.w("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i7 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f16140g = i7;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            gVar.f16138e = j.b(str);
            gVar.f16139f = 0;
        } else {
            gVar.f16138e = Integer.parseInt(str);
            gVar.f16139f = 1;
        }
    }
}
