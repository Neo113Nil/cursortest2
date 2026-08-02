package s2;

import B4.V;
import C1.C0095a;
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
import e1.k;
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
import v2.AbstractC1664a;
import v2.t;
import w1.C1722m0;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f16138a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f16139b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f16140c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f16141d;

    static {
        HashMap hashMap = new HashMap();
        k.n(255, 255, 255, hashMap, "white");
        k.n(0, 255, 0, hashMap, "lime");
        k.n(0, 255, 255, hashMap, "cyan");
        k.n(255, 0, 0, hashMap, "red");
        k.n(255, 255, 0, hashMap, "yellow");
        k.n(255, 0, 255, hashMap, "magenta");
        k.n(0, 0, 255, hashMap, "blue");
        k.n(0, 0, 0, hashMap, "black");
        f16140c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        k.n(255, 255, 255, hashMap2, "bg_white");
        k.n(0, 255, 0, hashMap2, "bg_lime");
        k.n(0, 255, 255, hashMap2, "bg_cyan");
        k.n(255, 0, 0, hashMap2, "bg_red");
        k.n(255, 255, 0, hashMap2, "bg_yellow");
        k.n(255, 0, 255, hashMap2, "bg_magenta");
        k.n(0, 0, 255, hashMap2, "bg_blue");
        k.n(0, 0, 0, hashMap2, "bg_black");
        f16141d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, C1591e c1591e, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c3;
        int i7;
        int i8;
        int i9 = c1591e.f16123b;
        int length = spannableStringBuilder.length();
        String str2 = c1591e.f16122a;
        str2.getClass();
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i9, length, 33);
                break;
            case 2:
                for (String str3 : c1591e.f16125d) {
                    Map map = f16140c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i9, length, 33);
                    } else {
                        Map map2 = f16141d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i9, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i9, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, length, 33);
                break;
            case 7:
                c(list2, str, c1591e);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C1590d.f16119c);
                int i10 = c1591e.f16123b;
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if ("rt".equals(((C1590d) arrayList.get(i12)).f16120a.f16122a)) {
                        C1590d c1590d = (C1590d) arrayList.get(i12);
                        c(list2, str, c1590d.f16120a);
                        int i13 = c1590d.f16120a.f16123b - i11;
                        int i14 = c1590d.f16121b - i11;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i13, i14);
                        spannableStringBuilder.delete(i13, i14);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new V(20), i10, i13, 33);
                        i11 += subSequence.length();
                        i10 = i13;
                    }
                }
                break;
            default:
                return;
        }
        ArrayList b7 = b(list2, str, c1591e);
        for (int i15 = 0; i15 < b7.size(); i15++) {
            C1588b c1588b = ((f) b7.get(i15)).f16127b;
            int i16 = c1588b.f16110k;
            if (i16 == -1 && c1588b.f16111l == -1) {
                i8 = -1;
                i7 = -1;
            } else {
                i7 = (c1588b.f16111l == 1 ? 2 : 0) | (i16 == 1 ? 1 : 0);
                i8 = -1;
            }
            if (i7 != i8) {
                int i17 = c1588b.f16110k;
                Q0.a.b(spannableStringBuilder, new StyleSpan((i17 == i8 && c1588b.f16111l == i8) ? i8 : (i17 == 1 ? 1 : 0) | (c1588b.f16111l == 1 ? 2 : 0)), i9, length);
            }
            if (c1588b.j == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, length, 33);
            }
            if (c1588b.f16107g) {
                if (!c1588b.f16107g) {
                    throw new IllegalStateException("Font color not defined");
                }
                Q0.a.b(spannableStringBuilder, new ForegroundColorSpan(c1588b.f16106f), i9, length);
            }
            if (c1588b.f16109i) {
                if (!c1588b.f16109i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                Q0.a.b(spannableStringBuilder, new BackgroundColorSpan(c1588b.f16108h), i9, length);
            }
            if (c1588b.f16105e != null) {
                Q0.a.b(spannableStringBuilder, new TypefaceSpan(c1588b.f16105e), i9, length);
            }
            int i18 = c1588b.f16112m;
            if (i18 == 1) {
                Q0.a.b(spannableStringBuilder, new AbsoluteSizeSpan((int) c1588b.f16113n, true), i9, length);
            } else if (i18 == 2) {
                Q0.a.b(spannableStringBuilder, new RelativeSizeSpan(c1588b.f16113n), i9, length);
            } else if (i18 == 3) {
                Q0.a.b(spannableStringBuilder, new RelativeSizeSpan(c1588b.f16113n / 100.0f), i9, length);
            }
            if (c1588b.f16115p) {
                spannableStringBuilder.setSpan(new C1722m0(19), i9, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, C1591e c1591e) {
        int i7;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            C1588b c1588b = (C1588b) list.get(i8);
            String str2 = c1591e.f16122a;
            if (c1588b.f16101a.isEmpty() && c1588b.f16102b.isEmpty() && c1588b.f16103c.isEmpty() && c1588b.f16104d.isEmpty()) {
                i7 = TextUtils.isEmpty(str2);
            } else {
                int a2 = C1588b.a(C1588b.a(C1588b.a(0, 1073741824, c1588b.f16101a, str), 2, c1588b.f16102b, str2), 4, c1588b.f16104d, c1591e.f16124c);
                if (a2 != -1) {
                    if (c1591e.f16125d.containsAll(c1588b.f16103c)) {
                        i7 = a2 + (c1588b.f16103c.size() * 4);
                    }
                }
                i7 = 0;
            }
            if (i7 > 0) {
                arrayList.add(new f(i7, c1588b));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void c(List list, String str, C1591e c1591e) {
        ArrayList b7 = b(list, str, c1591e);
        for (int i7 = 0; i7 < b7.size() && ((f) b7.get(i7)).f16127b.f16114o == -1; i7++) {
        }
    }

    public static C1589c d(String str, Matcher matcher, C0095a c0095a, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.f16128a = j.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.f16129b = j.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gVar);
            StringBuilder sb = new StringBuilder();
            String h6 = c0095a.h();
            while (!TextUtils.isEmpty(h6)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(h6.trim());
                h6 = c0095a.h();
            }
            gVar.f16130c = f(str, sb.toString(), arrayList);
            return new C1589c(gVar.a().a(), gVar.f16128a, gVar.f16129b);
        } catch (NumberFormatException unused) {
            Log.w("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, g gVar) {
        int i7;
        char c3;
        int i8;
        int i9;
        Matcher matcher = f16139b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, gVar);
                } else if ("align".equals(group)) {
                    switch (group2) {
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
                            Log.w("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            i7 = 2;
                            break;
                    }
                    gVar.f16131d = i7;
                } else if ("position".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1842484672:
                                if (substring.equals("line-left")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1276788989:
                                if (substring.equals("line-right")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                            case 5:
                                i8 = 0;
                                break;
                            case 1:
                            case 3:
                                i8 = 1;
                                break;
                            case 2:
                            case 4:
                                i8 = 2;
                                break;
                            default:
                                Log.w("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i8 = Integer.MIN_VALUE;
                                break;
                        }
                        gVar.f16136i = i8;
                        group2 = group2.substring(0, indexOf);
                    }
                    gVar.f16135h = j.b(group2);
                } else if (RRWebVideoEvent.JsonKeys.SIZE.equals(group)) {
                    gVar.j = j.b(group2);
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i9 = 2;
                    } else if (group2.equals("rl")) {
                        i9 = 1;
                    } else {
                        Log.w("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i9 = Integer.MIN_VALUE;
                    }
                    gVar.f16137k = i9;
                } else {
                    Log.w("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                Log.w("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00fb. Please report as an issue. */
    public static SpannedString f(String str, String str2, List list) {
        int i7;
        int i8;
        char c3;
        int i9;
        char c4;
        int i10 = -1;
        int i11 = 2;
        int i12 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (true) {
            String str3 = "";
            if (i13 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (C1591e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new C1591e("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i13);
            if (charAt != '&') {
                if (charAt != '<') {
                    spannableStringBuilder.append(charAt);
                    i13 += i12;
                } else {
                    int i14 = i13 + 1;
                    if (i14 >= str2.length()) {
                        i13 = i14;
                    } else {
                        int i15 = str2.charAt(i14) == '/' ? i12 : 0;
                        int indexOf = str2.indexOf(62, i14);
                        int length = indexOf == i10 ? str2.length() : indexOf + i12;
                        int i16 = length - 2;
                        int i17 = str2.charAt(i16) == '/' ? i12 : 0;
                        int i18 = i13 + (i15 != 0 ? i11 : i12);
                        if (i17 == 0) {
                            i16 = length - 1;
                        }
                        String substring = str2.substring(i18, i16);
                        if (!substring.trim().isEmpty()) {
                            String trim = substring.trim();
                            AbstractC1664a.f(trim.isEmpty() ^ i12);
                            int i19 = t.f17153a;
                            String str4 = trim.split("[ \\.]", i11)[0];
                            str4.getClass();
                            switch (str4.hashCode()) {
                                case 98:
                                    if (str4.equals("b")) {
                                        i9 = 0;
                                        break;
                                    }
                                    i9 = -1;
                                    break;
                                case 99:
                                    if (str4.equals("c")) {
                                        i9 = i12;
                                        break;
                                    }
                                    i9 = -1;
                                    break;
                                case 105:
                                    if (str4.equals("i")) {
                                        i9 = i11;
                                        break;
                                    }
                                    i9 = -1;
                                    break;
                                case 117:
                                    if (str4.equals("u")) {
                                        i9 = 3;
                                        break;
                                    }
                                    i9 = -1;
                                    break;
                                case 118:
                                    if (str4.equals("v")) {
                                        i9 = 4;
                                        break;
                                    }
                                    i9 = -1;
                                    break;
                                case 3650:
                                    if (str4.equals("rt")) {
                                        i9 = 5;
                                        break;
                                    }
                                    i9 = -1;
                                    break;
                                case 3314158:
                                    if (str4.equals("lang")) {
                                        i9 = 6;
                                        break;
                                    }
                                    i9 = -1;
                                    break;
                                case 3511770:
                                    if (str4.equals("ruby")) {
                                        i9 = 7;
                                        break;
                                    }
                                    i9 = -1;
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
                                            C1591e c1591e = (C1591e) arrayDeque.pop();
                                            a(str, c1591e, arrayList, spannableStringBuilder, list);
                                            if (arrayDeque.isEmpty()) {
                                                arrayList.clear();
                                            } else {
                                                arrayList.add(new C1590d(c1591e, spannableStringBuilder.length()));
                                            }
                                            if (c1591e.f16122a.equals(str4)) {
                                            }
                                        }
                                    } else if (i17 == 0) {
                                        int length2 = spannableStringBuilder.length();
                                        String trim2 = substring.trim();
                                        AbstractC1664a.f(trim2.isEmpty() ^ i12);
                                        int indexOf2 = trim2.indexOf(" ");
                                        if (indexOf2 == -1) {
                                            c4 = 0;
                                        } else {
                                            str3 = trim2.substring(indexOf2).trim();
                                            c4 = 0;
                                            trim2 = trim2.substring(0, indexOf2);
                                        }
                                        String[] split = trim2.split("\\.", -1);
                                        String str5 = split[c4];
                                        HashSet hashSet = new HashSet();
                                        for (int i20 = i12; i20 < split.length; i20 += i12) {
                                            hashSet.add(split[i20]);
                                        }
                                        arrayDeque.push(new C1591e(str5, length2, str3, hashSet));
                                    }
                                    i13 = length;
                                    i8 = i12;
                                    i7 = -1;
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
                int indexOf3 = str2.indexOf(59, i13);
                int indexOf4 = str2.indexOf(32, i13);
                i7 = -1;
                if (indexOf3 == -1) {
                    indexOf3 = indexOf4;
                } else if (indexOf4 != -1) {
                    indexOf3 = Math.min(indexOf3, indexOf4);
                }
                if (indexOf3 != -1) {
                    String substring2 = str2.substring(i13, indexOf3);
                    substring2.getClass();
                    switch (substring2.hashCode()) {
                        case 3309:
                            if (substring2.equals("gt")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3464:
                            if (substring2.equals("lt")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 96708:
                            if (substring2.equals("amp")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3374865:
                            if (substring2.equals("nbsp")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            spannableStringBuilder.append('>');
                            break;
                        case 1:
                            spannableStringBuilder.append('<');
                            break;
                        case 2:
                            spannableStringBuilder.append('&');
                            break;
                        case 3:
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            Log.w("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                            break;
                    }
                    if (indexOf3 == indexOf4) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i8 = 1;
                    i13 = indexOf3 + 1;
                } else {
                    i8 = 1;
                    spannableStringBuilder.append(charAt);
                }
            }
            i10 = i7;
            i11 = 2;
            i12 = i8;
        }
    }

    public static void g(String str, g gVar) {
        String substring;
        int i7 = 2;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
            switch (substring) {
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
                    Log.w("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i7 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f16134g = i7;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gVar.f16132e = j.b(str);
            gVar.f16133f = 0;
        } else {
            gVar.f16132e = Integer.parseInt(str);
            gVar.f16133f = 1;
        }
    }
}
