package com.google.android.gms.internal.ads;

import android.graphics.Color;
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
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1814y2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f16382a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f16383b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f16384c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f16385d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f16384c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f16385d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannedString a(String str, String str2, List list) {
        int i;
        int i5;
        int i6;
        int i7 = -1;
        int i8 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            String str3 = "";
            if (i10 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    e(str, (C1679v2) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                e(str, new C1679v2("", i9, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            int i11 = i10 + 1;
            char charAt = str2.charAt(i10);
            int i12 = i8;
            int i13 = i9;
            if (charAt == '&') {
                int indexOf = str2.indexOf(59, i11);
                int indexOf2 = str2.indexOf(32, i11);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i11, indexOf);
                    int hashCode = substring.hashCode();
                    if (hashCode == 3309) {
                        if (substring.equals("gt")) {
                            i = i12;
                            if (i != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i12 = 1;
                            i10 = indexOf + 1;
                            i8 = i12;
                            i9 = i13;
                            i7 = -1;
                        }
                        i = -1;
                        if (i != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i12 = 1;
                        i10 = indexOf + 1;
                        i8 = i12;
                        i9 = i13;
                        i7 = -1;
                    } else if (hashCode == 3464) {
                        if (substring.equals("lt")) {
                            i = i13;
                            if (i != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i12 = 1;
                            i10 = indexOf + 1;
                            i8 = i12;
                            i9 = i13;
                            i7 = -1;
                        }
                        i = -1;
                        if (i != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i12 = 1;
                        i10 = indexOf + 1;
                        i8 = i12;
                        i9 = i13;
                        i7 = -1;
                    } else if (hashCode != 96708) {
                        if (hashCode == 3374865 && substring.equals("nbsp")) {
                            i = 2;
                            if (i != 0) {
                                spannableStringBuilder.append('<');
                            } else if (i == i12) {
                                spannableStringBuilder.append('>');
                            } else if (i == 2) {
                                spannableStringBuilder.append(' ');
                            } else if (i != 3) {
                                JB.l("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            } else {
                                spannableStringBuilder.append('&');
                            }
                            if (indexOf == indexOf2) {
                                spannableStringBuilder.append((CharSequence) " ");
                            }
                            i12 = 1;
                            i10 = indexOf + 1;
                            i8 = i12;
                            i9 = i13;
                            i7 = -1;
                        }
                        i = -1;
                        if (i != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i12 = 1;
                        i10 = indexOf + 1;
                        i8 = i12;
                        i9 = i13;
                        i7 = -1;
                    } else {
                        if (substring.equals("amp")) {
                            i = 3;
                            if (i != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i12 = 1;
                            i10 = indexOf + 1;
                            i8 = i12;
                            i9 = i13;
                            i7 = -1;
                        }
                        i = -1;
                        if (i != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i12 = 1;
                        i10 = indexOf + 1;
                        i8 = i12;
                        i9 = i13;
                        i7 = -1;
                    }
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
            } else if (i11 < str2.length()) {
                char charAt2 = str2.charAt(i11);
                int indexOf3 = str2.indexOf(62, i11);
                int length = indexOf3 == i7 ? str2.length() : indexOf3 + 1;
                int i14 = length - 2;
                int i15 = str2.charAt(i14) == '/' ? i12 : i13;
                int i16 = i10 + (charAt2 == '/' ? 2 : i12);
                if (i15 == 0) {
                    i14 = length - 1;
                }
                String substring2 = str2.substring(i16, i14);
                if (!substring2.trim().isEmpty()) {
                    String trim = substring2.trim();
                    AbstractC1668us.S(!trim.isEmpty());
                    int i17 = AbstractC1260lo.f14419a;
                    String str4 = trim.split("[ \\.]", 2)[i13];
                    int hashCode2 = str4.hashCode();
                    if (hashCode2 == 98) {
                        if (str4.equals("b")) {
                            i5 = i13;
                            switch (i5) {
                            }
                            i10 = length;
                            i9 = i6;
                            i8 = i12;
                        }
                        i5 = -1;
                        switch (i5) {
                        }
                        i10 = length;
                        i9 = i6;
                        i8 = i12;
                    } else if (hashCode2 == 99) {
                        if (str4.equals("c")) {
                            i5 = i12;
                            switch (i5) {
                            }
                            i10 = length;
                            i9 = i6;
                            i8 = i12;
                        }
                        i5 = -1;
                        switch (i5) {
                        }
                        i10 = length;
                        i9 = i6;
                        i8 = i12;
                    } else if (hashCode2 == 105) {
                        if (str4.equals("i")) {
                            i5 = 2;
                            switch (i5) {
                            }
                            i10 = length;
                            i9 = i6;
                            i8 = i12;
                        }
                        i5 = -1;
                        switch (i5) {
                        }
                        i10 = length;
                        i9 = i6;
                        i8 = i12;
                    } else if (hashCode2 == 3650) {
                        if (str4.equals("rt")) {
                            i5 = 5;
                            switch (i5) {
                            }
                            i10 = length;
                            i9 = i6;
                            i8 = i12;
                        }
                        i5 = -1;
                        switch (i5) {
                        }
                        i10 = length;
                        i9 = i6;
                        i8 = i12;
                    } else if (hashCode2 == 3314158) {
                        if (str4.equals("lang")) {
                            i5 = 3;
                            switch (i5) {
                            }
                            i10 = length;
                            i9 = i6;
                            i8 = i12;
                        }
                        i5 = -1;
                        switch (i5) {
                        }
                        i10 = length;
                        i9 = i6;
                        i8 = i12;
                    } else if (hashCode2 == 3511770) {
                        if (str4.equals("ruby")) {
                            i5 = 4;
                            switch (i5) {
                            }
                            i10 = length;
                            i9 = i6;
                            i8 = i12;
                        }
                        i5 = -1;
                        switch (i5) {
                        }
                        i10 = length;
                        i9 = i6;
                        i8 = i12;
                    } else if (hashCode2 != 117) {
                        if (hashCode2 == 118 && str4.equals("v")) {
                            i5 = 7;
                            switch (i5) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (charAt2 == '/') {
                                        while (!arrayDeque.isEmpty()) {
                                            C1679v2 c1679v2 = (C1679v2) arrayDeque.pop();
                                            e(str, c1679v2, arrayList, spannableStringBuilder, list);
                                            if (arrayDeque.isEmpty()) {
                                                arrayList.clear();
                                            } else {
                                                arrayList.add(new C1634u2(c1679v2, spannableStringBuilder.length()));
                                            }
                                            if (c1679v2.f15955a.equals(str4)) {
                                            }
                                        }
                                    } else if (i15 == 0) {
                                        int length2 = spannableStringBuilder.length();
                                        String trim2 = substring2.trim();
                                        AbstractC1668us.S(!trim2.isEmpty());
                                        int indexOf4 = trim2.indexOf(" ");
                                        if (indexOf4 == -1) {
                                            i6 = i13;
                                        } else {
                                            str3 = trim2.substring(indexOf4).trim();
                                            i6 = i13;
                                            trim2 = trim2.substring(i6, indexOf4);
                                        }
                                        String[] split = trim2.split("\\.", -1);
                                        String str5 = split[i6];
                                        HashSet hashSet = new HashSet();
                                        for (int i18 = i12; i18 < split.length; i18++) {
                                            hashSet.add(split[i18]);
                                        }
                                        arrayDeque.push(new C1679v2(str5, length2, str3, hashSet));
                                        break;
                                    }
                                default:
                                    i6 = i13;
                                    break;
                            }
                            i10 = length;
                            i9 = i6;
                            i8 = i12;
                        }
                        i5 = -1;
                        switch (i5) {
                        }
                        i10 = length;
                        i9 = i6;
                        i8 = i12;
                    } else {
                        if (str4.equals("u")) {
                            i5 = 6;
                            switch (i5) {
                            }
                            i10 = length;
                            i9 = i6;
                            i8 = i12;
                        }
                        i5 = -1;
                        switch (i5) {
                        }
                        i10 = length;
                        i9 = i6;
                        i8 = i12;
                    }
                    i7 = -1;
                }
                i6 = i13;
                i10 = length;
                i9 = i6;
                i8 = i12;
                i7 = -1;
            }
            i10 = i11;
            i8 = i12;
            i9 = i13;
            i7 = -1;
        }
    }

    public static int b(List list, String str, C1679v2 c1679v2) {
        ArrayList d5 = d(list, str, c1679v2);
        for (int i = 0; i < d5.size(); i++) {
            int i5 = ((C1724w2) d5.get(i)).f16089l.f15256o;
            if (i5 != -1) {
                return i5;
            }
        }
        return -1;
    }

    public static C1544s2 c(String str, Matcher matcher, C1617tm c1617tm, ArrayList arrayList) {
        C1769x2 c1769x2 = new C1769x2();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            c1769x2.f16212a = AbstractC1668us.x(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            c1769x2.f16213b = AbstractC1668us.x(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            f(group3, c1769x2);
            StringBuilder sb = new StringBuilder();
            String H5 = c1617tm.H(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(H5)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(H5.trim());
                H5 = c1617tm.H(StandardCharsets.UTF_8);
            }
            c1769x2.f16214c = a(str, sb.toString(), arrayList);
            return new C1544s2(c1769x2.a().a(), c1769x2.f16212a, c1769x2.f16213b);
        } catch (NumberFormatException unused) {
            JB.l("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    public static ArrayList d(List list, String str, C1679v2 c1679v2) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C1499r2 c1499r2 = (C1499r2) list.get(i);
            String str2 = c1679v2.f15955a;
            if (c1499r2.f15244a.isEmpty() && c1499r2.f15245b.isEmpty() && c1499r2.f15246c.isEmpty() && c1499r2.f15247d.isEmpty()) {
                if (TextUtils.isEmpty(str2)) {
                    size = 1;
                }
                size = 0;
            } else {
                int a5 = C1499r2.a(C1499r2.a(C1499r2.a(0, 1073741824, c1499r2.f15244a, str), 2, c1499r2.f15245b, str2), 4, c1499r2.f15247d, c1679v2.f15957c);
                if (a5 != -1) {
                    if (c1679v2.f15958d.containsAll(c1499r2.f15246c)) {
                        size = a5 + (c1499r2.f15246c.size() * 4);
                    }
                }
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new C1724w2(size, c1499r2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static void e(String str, C1679v2 c1679v2, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c5;
        ?? r6;
        int i;
        int i5;
        int i6 = c1679v2.f15956b;
        int length = spannableStringBuilder.length();
        String str2 = c1679v2.f15955a;
        int hashCode = str2.hashCode();
        int i7 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c5 = 7;
            }
            c5 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c5 = 1;
            }
            c5 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c5 = 6;
            }
            c5 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c5 = 2;
            }
            c5 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c5 = 0;
            }
            c5 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c5 = 4;
            }
            c5 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c5 = 5;
            }
            c5 = 65535;
        } else {
            if (str2.equals("u")) {
                c5 = 3;
            }
            c5 = 65535;
        }
        switch (c5) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i6, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i6, length, 33);
                break;
            case 2:
                int b3 = b(list2, str, c1679v2);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C1634u2.f15787c);
                int i8 = c1679v2.f15956b;
                int i9 = 0;
                int i10 = 0;
                while (i9 < arrayList.size()) {
                    if ("rt".equals(((C1634u2) arrayList.get(i9)).f15788a.f15955a)) {
                        C1634u2 c1634u2 = (C1634u2) arrayList.get(i9);
                        int b5 = b(list2, str, c1634u2.f15788a);
                        if (b5 == i7) {
                            b5 = b3 != i7 ? b3 : 1;
                        }
                        int i11 = c1634u2.f15788a.f15956b - i10;
                        int i12 = c1634u2.f15789b - i10;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i11, i12);
                        spannableStringBuilder.delete(i11, i12);
                        spannableStringBuilder.setSpan(new C1208kh(subSequence.toString(), b5), i8, i11, 33);
                        i10 = subSequence.length() + i10;
                        i8 = i11;
                    }
                    i9++;
                    i7 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, length, 33);
                break;
            case 4:
                for (String str3 : c1679v2.f15958d) {
                    Map map = f16384c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i6, length, 33);
                    } else {
                        Map map2 = f16385d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i6, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new Fh(c1679v2.f15957c), i6, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        ArrayList d5 = d(list2, str, c1679v2);
        for (int i13 = 0; i13 < d5.size(); i13++) {
            C1499r2 c1499r2 = ((C1724w2) d5.get(i13)).f16089l;
            int i14 = c1499r2.f15252k;
            if (i14 == -1 && c1499r2.f15253l == -1) {
                r6 = -1;
            } else {
                r6 = (c1499r2.f15253l == 1 ? 2 : false) | (i14 == 1);
            }
            if (r6 != -1) {
                int i15 = c1499r2.f15252k;
                if (i15 == -1 && c1499r2.f15253l == -1) {
                    i5 = -1;
                    i = 1;
                } else {
                    i = 1;
                    i5 = (i15 == 1 ? 1 : 0) | (c1499r2.f15253l == 1 ? 2 : 0);
                }
                AbstractC1803xs.x(spannableStringBuilder, new StyleSpan(i5), i6, length);
            } else {
                i = 1;
            }
            if (c1499r2.f15251j == i) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, length, 33);
            }
            if (c1499r2.f15249g) {
                if (!c1499r2.f15249g) {
                    throw new IllegalStateException("Font color not defined");
                }
                AbstractC1803xs.x(spannableStringBuilder, new ForegroundColorSpan(c1499r2.f), i6, length);
            }
            if (c1499r2.i) {
                if (!c1499r2.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                AbstractC1803xs.x(spannableStringBuilder, new BackgroundColorSpan(c1499r2.f15250h), i6, length);
            }
            if (c1499r2.f15248e != null) {
                AbstractC1803xs.x(spannableStringBuilder, new TypefaceSpan(c1499r2.f15248e), i6, length);
            }
            int i16 = c1499r2.f15254m;
            if (i16 == 1) {
                AbstractC1803xs.x(spannableStringBuilder, new AbsoluteSizeSpan((int) c1499r2.f15255n, true), i6, length);
            } else if (i16 == 2) {
                AbstractC1803xs.x(spannableStringBuilder, new RelativeSizeSpan(c1499r2.f15255n), i6, length);
            } else if (i16 == 3) {
                AbstractC1803xs.x(spannableStringBuilder, new RelativeSizeSpan(c1499r2.f15255n / 100.0f), i6, length);
            }
            if (c1499r2.f15257p) {
                spannableStringBuilder.setSpan(new C0807bh(), i6, length, 33);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void f(String str, C1769x2 c1769x2) {
        Matcher matcher = f16383b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            int i5 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                char c5 = 65535;
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c5 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c5 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c5 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c5 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c5 == 0) {
                            i5 = 0;
                        } else if (c5 == 1 || c5 == 2) {
                            i5 = 1;
                        } else if (c5 != 3) {
                            JB.l("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                            i5 = Integer.MIN_VALUE;
                        }
                        c1769x2.f16217g = i5;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        c1769x2.f16216e = AbstractC1668us.a(group2);
                        c1769x2.f = 0;
                    } else {
                        c1769x2.f16216e = Integer.parseInt(group2);
                        c1769x2.f = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c5 = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c5 = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c5 = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c5 = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c5 = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c5 = 0;
                                break;
                            }
                            break;
                    }
                    if (c5 != 0) {
                        if (c5 != 1) {
                            if (c5 != 2 && c5 != 3) {
                                if (c5 == 4) {
                                    i = 3;
                                } else if (c5 != 5) {
                                    JB.l("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                } else {
                                    i = 5;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    c1769x2.f16215d = i;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c5 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c5 = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c5 = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c5 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c5 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c5 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c5 == 0 || c5 == 1) {
                            i = 0;
                        } else if (c5 != 2 && c5 != 3) {
                            if (c5 == 4 || c5 == 5) {
                                i = 2;
                            } else {
                                JB.l("WebvttCueParser", "Invalid anchor value: ".concat(substring2));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        c1769x2.i = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    c1769x2.f16218h = AbstractC1668us.a(group2);
                } else if ("size".equals(group)) {
                    c1769x2.f16219j = AbstractC1668us.a(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c5 = 0;
                        }
                    } else if (group2.equals("lr")) {
                        c5 = 1;
                    }
                    if (c5 != 0) {
                        if (c5 != 1) {
                            JB.l("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    c1769x2.f16220k = i;
                } else {
                    JB.l("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                JB.l("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
