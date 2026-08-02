package com.google.android.gms.internal.ads;

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
import e1.k;
import io.sentry.rrweb.RRWebVideoEvent;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzalk {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

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
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        k.n(255, 255, 255, hashMap2, "bg_white");
        k.n(0, 255, 0, hashMap2, "bg_lime");
        k.n(0, 255, 255, hashMap2, "bg_cyan");
        k.n(255, 0, 0, hashMap2, "bg_red");
        k.n(255, 255, 0, hashMap2, "bg_yellow");
        k.n(255, 0, 255, hashMap2, "bg_magenta");
        k.n(0, 0, 255, hashMap2, "bg_blue");
        k.n(0, 0, 0, hashMap2, "bg_black");
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x010e, code lost:
    
        if (r4.equals("i") != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannedString zza(String str, String str2, List list) {
        int i7;
        char c3;
        int i8 = -1;
        int i9 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i11 < str2.length()) {
            int i12 = i11 + 1;
            char charAt = str2.charAt(i11);
            int i13 = 2;
            if (charAt != '&') {
                if (charAt != '<') {
                    spannableStringBuilder.append(charAt);
                } else if (i12 < str2.length()) {
                    char charAt2 = str2.charAt(i12);
                    int indexOf = str2.indexOf(62, i12);
                    int length = indexOf == i8 ? str2.length() : indexOf + i9;
                    int i14 = length - 2;
                    int i15 = str2.charAt(i14) == '/' ? i9 : i10;
                    int i16 = i11 + (charAt2 == '/' ? 2 : i9);
                    if (i15 == 0) {
                        i14 = length - 1;
                    }
                    String substring = str2.substring(i16, i14);
                    if (!substring.trim().isEmpty()) {
                        String trim = substring.trim();
                        zzcv.zzd(!trim.isEmpty());
                        int i17 = zzen.zza;
                        String str3 = trim.split("[ \\.]", 2)[i10];
                        int hashCode = str3.hashCode();
                        if (hashCode == 98) {
                            if (str3.equals("b")) {
                                i13 = 0;
                                switch (i13) {
                                }
                            }
                            i13 = i8;
                            switch (i13) {
                            }
                        } else if (hashCode == 99) {
                            if (str3.equals("c")) {
                                i13 = 1;
                                switch (i13) {
                                }
                            }
                            i13 = i8;
                            switch (i13) {
                            }
                        } else if (hashCode != 105) {
                            if (hashCode == 3650) {
                                if (str3.equals("rt")) {
                                    i13 = 5;
                                    switch (i13) {
                                    }
                                }
                                i13 = i8;
                                switch (i13) {
                                }
                            } else if (hashCode == 3314158) {
                                if (str3.equals("lang")) {
                                    i13 = 3;
                                    switch (i13) {
                                    }
                                }
                                i13 = i8;
                                switch (i13) {
                                }
                            } else if (hashCode == 3511770) {
                                if (str3.equals("ruby")) {
                                    i13 = 4;
                                    switch (i13) {
                                    }
                                }
                                i13 = i8;
                                switch (i13) {
                                }
                            } else if (hashCode != 117) {
                                if (hashCode == 118 && str3.equals("v")) {
                                    i13 = 7;
                                    switch (i13) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                            if (charAt2 != '/') {
                                                if (i15 == 0) {
                                                    arrayDeque.push(zzalg.zza(substring, spannableStringBuilder.length()));
                                                    break;
                                                }
                                            } else {
                                                while (!arrayDeque.isEmpty()) {
                                                    zzalg zzalgVar = (zzalg) arrayDeque.pop();
                                                    zzg(str, zzalgVar, arrayList, spannableStringBuilder, list);
                                                    if (arrayDeque.isEmpty()) {
                                                        arrayList.clear();
                                                    } else {
                                                        arrayList.add(new zzalf(zzalgVar, spannableStringBuilder.length(), null));
                                                    }
                                                    if (zzalgVar.zza.equals(str3)) {
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                                i13 = i8;
                                switch (i13) {
                                }
                            } else {
                                if (str3.equals("u")) {
                                    i13 = 6;
                                    switch (i13) {
                                    }
                                }
                                i13 = i8;
                                switch (i13) {
                                }
                            }
                        }
                        i10 = 0;
                    }
                    i11 = length;
                    i9 = 1;
                    i10 = 0;
                }
                i7 = i9;
            } else {
                int indexOf2 = str2.indexOf(59, i12);
                int indexOf3 = str2.indexOf(32, i12);
                if (indexOf2 == i8) {
                    indexOf2 = indexOf3;
                } else if (indexOf3 != i8) {
                    indexOf2 = Math.min(indexOf2, indexOf3);
                }
                if (indexOf2 != i8) {
                    String substring2 = str2.substring(i12, indexOf2);
                    int hashCode2 = substring2.hashCode();
                    if (hashCode2 == 3309) {
                        if (substring2.equals("gt")) {
                            c3 = 1;
                            if (c3 != 0) {
                            }
                            if (indexOf2 == indexOf3) {
                            }
                            i11 = indexOf2 + 1;
                            i9 = 1;
                            i8 = -1;
                            i10 = 0;
                        }
                        c3 = 65535;
                        if (c3 != 0) {
                        }
                        if (indexOf2 == indexOf3) {
                        }
                        i11 = indexOf2 + 1;
                        i9 = 1;
                        i8 = -1;
                        i10 = 0;
                    } else if (hashCode2 == 3464) {
                        if (substring2.equals("lt")) {
                            c3 = 0;
                            if (c3 != 0) {
                            }
                            if (indexOf2 == indexOf3) {
                            }
                            i11 = indexOf2 + 1;
                            i9 = 1;
                            i8 = -1;
                            i10 = 0;
                        }
                        c3 = 65535;
                        if (c3 != 0) {
                        }
                        if (indexOf2 == indexOf3) {
                        }
                        i11 = indexOf2 + 1;
                        i9 = 1;
                        i8 = -1;
                        i10 = 0;
                    } else if (hashCode2 != 96708) {
                        if (hashCode2 == 3374865 && substring2.equals("nbsp")) {
                            c3 = 2;
                            if (c3 != 0) {
                                spannableStringBuilder.append('<');
                            } else if (c3 == 1) {
                                spannableStringBuilder.append('>');
                            } else if (c3 == 2) {
                                spannableStringBuilder.append(' ');
                            } else if (c3 != 3) {
                                zzdq.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                            } else {
                                spannableStringBuilder.append('&');
                            }
                            if (indexOf2 == indexOf3) {
                                spannableStringBuilder.append((CharSequence) " ");
                            }
                            i11 = indexOf2 + 1;
                            i9 = 1;
                            i8 = -1;
                            i10 = 0;
                        }
                        c3 = 65535;
                        if (c3 != 0) {
                        }
                        if (indexOf2 == indexOf3) {
                        }
                        i11 = indexOf2 + 1;
                        i9 = 1;
                        i8 = -1;
                        i10 = 0;
                    } else {
                        if (substring2.equals("amp")) {
                            c3 = 3;
                            if (c3 != 0) {
                            }
                            if (indexOf2 == indexOf3) {
                            }
                            i11 = indexOf2 + 1;
                            i9 = 1;
                            i8 = -1;
                            i10 = 0;
                        }
                        c3 = 65535;
                        if (c3 != 0) {
                        }
                        if (indexOf2 == indexOf3) {
                        }
                        i11 = indexOf2 + 1;
                        i9 = 1;
                        i8 = -1;
                        i10 = 0;
                    }
                } else {
                    i7 = 1;
                    spannableStringBuilder.append(charAt);
                }
            }
            i9 = i7;
            i11 = i12;
            i8 = -1;
            i10 = 0;
        }
        while (!arrayDeque.isEmpty()) {
            zzg(str, (zzalg) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzg(str, zzalg.zzb(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static zzcl zzb(String str) {
        zzali zzaliVar = new zzali();
        zzh(str, zzaliVar);
        return zzaliVar.zza();
    }

    public static zzald zzc(zzed zzedVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String zzz = zzedVar.zzz(charset);
        if (zzz != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzz);
            if (matcher.matches()) {
                return zze(null, matcher, zzedVar, list);
            }
            String zzz2 = zzedVar.zzz(charset);
            if (zzz2 != null) {
                Matcher matcher2 = pattern.matcher(zzz2);
                if (matcher2.matches()) {
                    return zze(zzz.trim(), matcher2, zzedVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzalg zzalgVar) {
        List zzf = zzf(list, str, zzalgVar);
        for (int i7 = 0; i7 < zzf.size(); i7++) {
            zzalc zzalcVar = ((zzalh) zzf.get(i7)).zzb;
            if (zzalcVar.zze() != -1) {
                return zzalcVar.zze();
            }
        }
        return -1;
    }

    private static zzald zze(String str, Matcher matcher, zzed zzedVar, List list) {
        zzali zzaliVar = new zzali();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            zzaliVar.zza = zzalm.zzb(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            zzaliVar.zzb = zzalm.zzb(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zzh(group3, zzaliVar);
            StringBuilder sb = new StringBuilder();
            String zzz = zzedVar.zzz(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(zzz)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(zzz.trim());
                zzz = zzedVar.zzz(StandardCharsets.UTF_8);
            }
            zzaliVar.zzc = zza(str, sb.toString(), list);
            return new zzald(zzaliVar.zza().zzp(), zzaliVar.zza, zzaliVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzdq.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, String str, zzalg zzalgVar) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            zzalc zzalcVar = (zzalc) list.get(i7);
            int zzf = zzalcVar.zzf(str, zzalgVar.zza, zzalgVar.zzd, zzalgVar.zzc);
            if (zzf > 0) {
                arrayList.add(new zzalh(zzf, zzalcVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void zzg(String str, zzalg zzalgVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c3;
        Comparator comparator;
        zzalg zzalgVar2;
        zzalg zzalgVar3;
        zzalg zzalgVar4;
        int i7;
        int i8 = zzalgVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzalgVar.zza;
        int hashCode = str2.hashCode();
        int i9 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c3 = 7;
            }
            c3 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c3 = 1;
            }
            c3 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c3 = 6;
            }
            c3 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c3 = 2;
            }
            c3 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c3 = 0;
            }
            c3 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c3 = 4;
            }
            c3 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c3 = 5;
            }
            c3 = 65535;
        } else {
            if (str2.equals("u")) {
                c3 = 3;
            }
            c3 = 65535;
        }
        switch (c3) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i8, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i8, length, 33);
                break;
            case 2:
                int zzd2 = zzd(list2, str, zzalgVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                comparator = zzalf.zza;
                Collections.sort(arrayList, comparator);
                int i10 = zzalgVar.zzb;
                int i11 = 0;
                int i12 = 0;
                while (i11 < arrayList.size()) {
                    zzalgVar2 = ((zzalf) arrayList.get(i11)).zzb;
                    if ("rt".equals(zzalgVar2.zza)) {
                        zzalf zzalfVar = (zzalf) arrayList.get(i11);
                        zzalgVar3 = zzalfVar.zzb;
                        int zzd3 = zzd(list2, str, zzalgVar3);
                        if (zzd3 == i9) {
                            zzd3 = zzd2 != i9 ? zzd2 : 1;
                        }
                        zzalgVar4 = zzalfVar.zzb;
                        int i13 = zzalgVar4.zzb - i12;
                        i7 = zzalfVar.zzc;
                        int i14 = i7 - i12;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i13, i14);
                        spannableStringBuilder.delete(i13, i14);
                        spannableStringBuilder.setSpan(new zzcr(subSequence.toString(), zzd3), i10, i13, 33);
                        i12 = subSequence.length() + i12;
                        i10 = i13;
                    }
                    i11++;
                    i9 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i8, length, 33);
                break;
            case 4:
                for (String str3 : zzalgVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i8, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i8, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzcu(zzalgVar.zzc), i8, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List zzf = zzf(list2, str, zzalgVar);
        for (int i15 = 0; i15 < zzf.size(); i15++) {
            zzalc zzalcVar = ((zzalh) zzf.get(i15)).zzb;
            if (zzalcVar != null) {
                if (zzalcVar.zzg() != -1) {
                    zzcs.zzb(spannableStringBuilder, new StyleSpan(zzalcVar.zzg()), i8, length, 33);
                }
                if (zzalcVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i8, length, 33);
                }
                if (zzalcVar.zzy()) {
                    zzcs.zzb(spannableStringBuilder, new ForegroundColorSpan(zzalcVar.zzc()), i8, length, 33);
                }
                if (zzalcVar.zzx()) {
                    zzcs.zzb(spannableStringBuilder, new BackgroundColorSpan(zzalcVar.zzb()), i8, length, 33);
                }
                if (zzalcVar.zzr() != null) {
                    zzcs.zzb(spannableStringBuilder, new TypefaceSpan(zzalcVar.zzr()), i8, length, 33);
                }
                int zzd4 = zzalcVar.zzd();
                if (zzd4 == 1) {
                    zzcs.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzalcVar.zza(), true), i8, length, 33);
                } else if (zzd4 == 2) {
                    zzcs.zzb(spannableStringBuilder, new RelativeSizeSpan(zzalcVar.zza()), i8, length, 33);
                } else if (zzd4 == 3) {
                    zzcs.zzb(spannableStringBuilder, new RelativeSizeSpan(zzalcVar.zza() / 100.0f), i8, length, 33);
                }
                if (zzalcVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzcq(), i8, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zzh(String str, zzali zzaliVar) {
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i7 = 1;
            String group = matcher.group(1);
            group.getClass();
            int i8 = 2;
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                char c3 = 65535;
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c3 == 0) {
                            i8 = 0;
                        } else if (c3 == 1 || c3 == 2) {
                            i8 = 1;
                        } else if (c3 != 3) {
                            zzdq.zzf("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                            i8 = Integer.MIN_VALUE;
                        }
                        zzaliVar.zzg = i8;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        zzaliVar.zze = zzalm.zza(group2);
                        zzaliVar.zzf = 0;
                    } else {
                        zzaliVar.zze = Integer.parseInt(group2);
                        zzaliVar.zzf = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals(RRWebVideoEvent.JsonKeys.LEFT)) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c3 = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c3 = 0;
                                break;
                            }
                            break;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            if (c3 != 2 && c3 != 3) {
                                if (c3 == 4) {
                                    i7 = 3;
                                } else if (c3 != 5) {
                                    zzdq.zzf("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                } else {
                                    i7 = 5;
                                }
                            }
                            i7 = 2;
                        } else {
                            i7 = 4;
                        }
                    }
                    zzaliVar.zzd = i7;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c3 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c3 == 0 || c3 == 1) {
                            i7 = 0;
                        } else if (c3 != 2 && c3 != 3) {
                            if (c3 == 4 || c3 == 5) {
                                i7 = 2;
                            } else {
                                zzdq.zzf("WebvttCueParser", "Invalid anchor value: ".concat(substring2));
                                i7 = Integer.MIN_VALUE;
                            }
                        }
                        zzaliVar.zzi = i7;
                        group2 = group2.substring(0, indexOf2);
                    }
                    zzaliVar.zzh = zzalm.zza(group2);
                } else if (RRWebVideoEvent.JsonKeys.SIZE.equals(group)) {
                    zzaliVar.zzj = zzalm.zza(group2);
                } else if ("vertical".equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c3 = 0;
                        }
                    } else if (group2.equals("lr")) {
                        c3 = 1;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            zzdq.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i7 = Integer.MIN_VALUE;
                        } else {
                            i7 = 2;
                        }
                    }
                    zzaliVar.zzk = i7;
                } else {
                    zzdq.zzf("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                zzdq.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
