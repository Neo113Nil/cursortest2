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
import io.sentry.rrweb.RRWebVideoEvent;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzalk {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

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
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        k.n(255, 255, 255, map2, "bg_white");
        k.n(0, 255, 0, map2, "bg_lime");
        k.n(0, 255, 255, map2, "bg_cyan");
        k.n(255, 0, 0, map2, "bg_red");
        k.n(255, 255, 0, map2, "bg_yellow");
        k.n(255, 0, 255, map2, "bg_magenta");
        k.n(0, 0, 255, map2, "bg_blue");
        k.n(0, 0, 0, map2, "bg_black");
        zzd = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    public static SpannedString zza(String str, String str2, List list) {
        int i7;
        byte b7;
        int i8 = -1;
        int i9 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i11 < str2.length()) {
            int i12 = i11 + 1;
            char cCharAt = str2.charAt(i11);
            int i13 = 2;
            if (cCharAt != '&') {
                if (cCharAt != '<') {
                    spannableStringBuilder.append(cCharAt);
                } else {
                    if (i12 < str2.length()) {
                        char cCharAt2 = str2.charAt(i12);
                        int iIndexOf = str2.indexOf(62, i12);
                        int length = iIndexOf == i8 ? str2.length() : iIndexOf + i9;
                        int i14 = length - 2;
                        int i15 = str2.charAt(i14) == '/' ? i9 : i10;
                        int i16 = i11 + (cCharAt2 == '/' ? 2 : i9);
                        if (i15 == 0) {
                            i14 = length - 1;
                        }
                        String strSubstring = str2.substring(i16, i14);
                        if (!strSubstring.trim().isEmpty()) {
                            String strTrim = strSubstring.trim();
                            zzcv.zzd(!strTrim.isEmpty());
                            int i17 = zzen.zza;
                            String str3 = strTrim.split("[ \\.]", 2)[i10];
                            int iHashCode = str3.hashCode();
                            if (iHashCode != 98) {
                                if (iHashCode != 99) {
                                    if (iHashCode != 105) {
                                        if (iHashCode != 3650) {
                                            if (iHashCode != 3314158) {
                                                if (iHashCode != 3511770) {
                                                    if (iHashCode != 117) {
                                                        if (iHashCode == 118 && str3.equals("v")) {
                                                            i13 = 7;
                                                        } else {
                                                            i13 = i8;
                                                        }
                                                    } else if (str3.equals("u")) {
                                                        i13 = 6;
                                                    } else {
                                                        i13 = i8;
                                                    }
                                                } else if (str3.equals("ruby")) {
                                                    i13 = 4;
                                                } else {
                                                    i13 = i8;
                                                }
                                            } else if (str3.equals("lang")) {
                                                i13 = 3;
                                            } else {
                                                i13 = i8;
                                            }
                                        } else if (str3.equals("rt")) {
                                            i13 = 5;
                                        } else {
                                            i13 = i8;
                                        }
                                    } else if (!str3.equals("i")) {
                                        i13 = i8;
                                    }
                                } else if (str3.equals("c")) {
                                    i13 = 1;
                                } else {
                                    i13 = i8;
                                }
                            } else if (str3.equals("b")) {
                                i13 = 0;
                            } else {
                                i13 = i8;
                            }
                            switch (i13) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (cCharAt2 == '/') {
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
                                    } else if (i15 == 0) {
                                        arrayDeque.push(zzalg.zza(strSubstring, spannableStringBuilder.length()));
                                    }
                                    break;
                            }
                        }
                        i11 = length;
                        i9 = 1;
                    }
                    i10 = 0;
                }
                i7 = i9;
            } else {
                int iIndexOf2 = str2.indexOf(59, i12);
                int iIndexOf3 = str2.indexOf(32, i12);
                if (iIndexOf2 == i8) {
                    iIndexOf2 = iIndexOf3;
                } else if (iIndexOf3 != i8) {
                    iIndexOf2 = Math.min(iIndexOf2, iIndexOf3);
                }
                if (iIndexOf2 != i8) {
                    String strSubstring2 = str2.substring(i12, iIndexOf2);
                    int iHashCode2 = strSubstring2.hashCode();
                    if (iHashCode2 != 3309) {
                        if (iHashCode2 != 3464) {
                            if (iHashCode2 != 96708) {
                                if (iHashCode2 == 3374865 && strSubstring2.equals("nbsp")) {
                                    b7 = 2;
                                } else {
                                    b7 = -1;
                                }
                            } else if (strSubstring2.equals("amp")) {
                                b7 = 3;
                            } else {
                                b7 = -1;
                            }
                        } else if (strSubstring2.equals("lt")) {
                            b7 = 0;
                        } else {
                            b7 = -1;
                        }
                    } else if (strSubstring2.equals("gt")) {
                        b7 = 1;
                    } else {
                        b7 = -1;
                    }
                    if (b7 == 0) {
                        spannableStringBuilder.append('<');
                    } else if (b7 == 1) {
                        spannableStringBuilder.append('>');
                    } else if (b7 == 2) {
                        spannableStringBuilder.append(' ');
                    } else if (b7 != 3) {
                        zzdq.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring2 + ";'");
                    } else {
                        spannableStringBuilder.append('&');
                    }
                    if (iIndexOf2 == iIndexOf3) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i11 = iIndexOf2 + 1;
                    i9 = 1;
                } else {
                    i7 = 1;
                    spannableStringBuilder.append(cCharAt);
                }
                i8 = -1;
                i10 = 0;
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
        String strZzz = zzedVar.zzz(charset);
        if (strZzz != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzz);
            if (matcher.matches()) {
                return zze(null, matcher, zzedVar, list);
            }
            String strZzz2 = zzedVar.zzz(charset);
            if (strZzz2 != null) {
                Matcher matcher2 = pattern.matcher(strZzz2);
                if (matcher2.matches()) {
                    return zze(strZzz.trim(), matcher2, zzedVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, String str, zzalg zzalgVar) {
        List listZzf = zzf(list, str, zzalgVar);
        for (int i7 = 0; i7 < listZzf.size(); i7++) {
            zzalc zzalcVar = ((zzalh) listZzf.get(i7)).zzb;
            if (zzalcVar.zze() != -1) {
                return zzalcVar.zze();
            }
        }
        return -1;
    }

    private static zzald zze(String str, Matcher matcher, zzed zzedVar, List list) {
        zzali zzaliVar = new zzali();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzaliVar.zza = zzalm.zzb(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzaliVar.zzb = zzalm.zzb(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zzh(strGroup3, zzaliVar);
            StringBuilder sb = new StringBuilder();
            String strZzz = zzedVar.zzz(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzz)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strZzz.trim());
                strZzz = zzedVar.zzz(StandardCharsets.UTF_8);
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
            int iZzf = zzalcVar.zzf(str, zzalgVar.zza, zzalgVar.zzd, zzalgVar.zzc);
            if (iZzf > 0) {
                arrayList.add(new zzalh(iZzf, zzalcVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    private static void zzg(String str, zzalg zzalgVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        byte b7;
        int i7 = zzalgVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzalgVar.zza;
        int iHashCode = str2.hashCode();
        int i8 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals("v")) {
                                        b7 = 5;
                                    } else {
                                        b7 = -1;
                                    }
                                } else if (str2.equals("u")) {
                                    b7 = 3;
                                } else {
                                    b7 = -1;
                                }
                            } else if (str2.equals("c")) {
                                b7 = 4;
                            } else {
                                b7 = -1;
                            }
                        } else if (str2.equals("b")) {
                            b7 = 0;
                        } else {
                            b7 = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b7 = 2;
                    } else {
                        b7 = -1;
                    }
                } else if (str2.equals("lang")) {
                    b7 = 6;
                } else {
                    b7 = -1;
                }
            } else if (str2.equals("i")) {
                b7 = 1;
            } else {
                b7 = -1;
            }
        } else if (str2.equals("")) {
            b7 = 7;
        } else {
            b7 = -1;
        }
        switch (b7) {
            case 0:
                spannableStringBuilder.setSpan(new StyleSpan(1), i7, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(2), i7, length, 33);
                break;
            case 2:
                int iZzd = zzd(list2, str, zzalgVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, zzalf.zza);
                int i9 = zzalgVar.zzb;
                int i10 = 0;
                int length2 = 0;
                while (i10 < arrayList.size()) {
                    if ("rt".equals(((zzalf) arrayList.get(i10)).zzb.zza)) {
                        zzalf zzalfVar = (zzalf) arrayList.get(i10);
                        int iZzd2 = zzd(list2, str, zzalfVar.zzb);
                        if (iZzd2 == i8) {
                            iZzd2 = iZzd != i8 ? iZzd : 1;
                        }
                        int i11 = zzalfVar.zzb.zzb - length2;
                        int i12 = zzalfVar.zzc - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i11, i12);
                        spannableStringBuilder.delete(i11, i12);
                        spannableStringBuilder.setSpan(new zzcr(charSequenceSubSequence.toString(), iZzd2), i9, i11, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i9 = i11;
                    }
                    i10++;
                    i8 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
                break;
            case 4:
                for (String str3 : zzalgVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i7, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i7, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzcu(zzalgVar.zzc), i7, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List listZzf = zzf(list2, str, zzalgVar);
        for (int i13 = 0; i13 < listZzf.size(); i13++) {
            zzalc zzalcVar = ((zzalh) listZzf.get(i13)).zzb;
            if (zzalcVar != null) {
                if (zzalcVar.zzg() != -1) {
                    zzcs.zzb(spannableStringBuilder, new StyleSpan(zzalcVar.zzg()), i7, length, 33);
                }
                if (zzalcVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
                }
                if (zzalcVar.zzy()) {
                    zzcs.zzb(spannableStringBuilder, new ForegroundColorSpan(zzalcVar.zzc()), i7, length, 33);
                }
                if (zzalcVar.zzx()) {
                    zzcs.zzb(spannableStringBuilder, new BackgroundColorSpan(zzalcVar.zzb()), i7, length, 33);
                }
                if (zzalcVar.zzr() != null) {
                    zzcs.zzb(spannableStringBuilder, new TypefaceSpan(zzalcVar.zzr()), i7, length, 33);
                }
                int iZzd3 = zzalcVar.zzd();
                if (iZzd3 == 1) {
                    zzcs.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzalcVar.zza(), true), i7, length, 33);
                } else if (iZzd3 == 2) {
                    zzcs.zzb(spannableStringBuilder, new RelativeSizeSpan(zzalcVar.zza()), i7, length, 33);
                } else if (iZzd3 == 3) {
                    zzcs.zzb(spannableStringBuilder, new RelativeSizeSpan(zzalcVar.zza() / 100.0f), i7, length, 33);
                }
                if (zzalcVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzcq(), i7, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zzh(String str, zzali zzaliVar) {
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i7 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i8 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                byte b7 = -1;
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    b7 = 1;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    b7 = 2;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    b7 = 3;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    b7 = 0;
                                }
                                break;
                        }
                        if (b7 == 0) {
                            i8 = 0;
                        } else if (b7 == 1 || b7 == 2) {
                            i8 = 1;
                        } else if (b7 != 3) {
                            zzdq.zzf("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i8 = Integer.MIN_VALUE;
                        }
                        zzaliVar.zzg = i8;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzaliVar.zze = zzalm.zza(strGroup2);
                        zzaliVar.zzf = 0;
                    } else {
                        zzaliVar.zze = Integer.parseInt(strGroup2);
                        zzaliVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (strGroup2.equals("center")) {
                                b7 = 2;
                            }
                            break;
                        case -1074341483:
                            if (strGroup2.equals("middle")) {
                                b7 = 3;
                            }
                            break;
                        case 100571:
                            if (strGroup2.equals("end")) {
                                b7 = 4;
                            }
                            break;
                        case 3317767:
                            if (strGroup2.equals(RRWebVideoEvent.JsonKeys.LEFT)) {
                                b7 = 1;
                            }
                            break;
                        case 108511772:
                            if (strGroup2.equals("right")) {
                                b7 = 5;
                            }
                            break;
                        case 109757538:
                            if (strGroup2.equals("start")) {
                                b7 = 0;
                            }
                            break;
                    }
                    if (b7 != 0) {
                        if (b7 == 1) {
                            i7 = 4;
                        } else if (b7 == 2 || b7 == 3) {
                            i7 = 2;
                        } else if (b7 == 4) {
                            i7 = 3;
                        } else if (b7 != 5) {
                            zzdq.zzf("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i7 = 2;
                        } else {
                            i7 = 5;
                        }
                    }
                    zzaliVar.zzd = i7;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (strSubstring2.equals("line-left")) {
                                    b7 = 0;
                                }
                                break;
                            case -1364013995:
                                if (strSubstring2.equals("center")) {
                                    b7 = 2;
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    b7 = 4;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring2.equals("middle")) {
                                    b7 = 3;
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals("end")) {
                                    b7 = 5;
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals("start")) {
                                    b7 = 1;
                                }
                                break;
                        }
                        if (b7 == 0 || b7 == 1) {
                            i7 = 0;
                        } else if (b7 != 2 && b7 != 3) {
                            if (b7 == 4 || b7 == 5) {
                                i7 = 2;
                            } else {
                                zzdq.zzf("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i7 = Integer.MIN_VALUE;
                            }
                        }
                        zzaliVar.zzi = i7;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzaliVar.zzh = zzalm.zza(strGroup2);
                } else if (RRWebVideoEvent.JsonKeys.SIZE.equals(strGroup)) {
                    zzaliVar.zzj = zzalm.zza(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            b7 = 0;
                        }
                    } else if (strGroup2.equals("lr")) {
                        b7 = 1;
                    }
                    if (b7 != 0) {
                        if (b7 != 1) {
                            zzdq.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i7 = Integer.MIN_VALUE;
                        } else {
                            i7 = 2;
                        }
                    }
                    zzaliVar.zzk = i7;
                } else {
                    zzdq.zzf("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                zzdq.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
