package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzapc {
    public static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("(\\S+?):(\\S+)");
    private static final java.util.Map zzc;
    private static final java.util.Map zzd;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        hashMap.put("lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        hashMap.put("cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        hashMap.put("red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        hashMap.put("yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        hashMap.put("magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        hashMap.put("blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        hashMap.put("black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        zzc = java.util.Collections.unmodifiableMap(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("bg_white", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", java.lang.Integer.valueOf(android.graphics.Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", java.lang.Integer.valueOf(android.graphics.Color.rgb(0, 0, 0)));
        zzd = java.util.Collections.unmodifiableMap(hashMap2);
    }

    public static com.google.android.gms.internal.ads.zzaow zza(com.google.android.gms.internal.ads.zzet zzetVar, java.util.List list) {
        java.lang.String zzN = zzetVar.zzN(java.nio.charset.StandardCharsets.UTF_8);
        if (zzN != null) {
            java.util.regex.Pattern pattern = zza;
            java.util.regex.Matcher matcher = pattern.matcher(zzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzetVar, list);
            }
            java.lang.String zzN2 = zzetVar.zzN(java.nio.charset.StandardCharsets.UTF_8);
            if (zzN2 != null) {
                java.util.regex.Matcher matcher2 = pattern.matcher(zzN2);
                if (matcher2.matches()) {
                    return zzd(zzN.trim(), matcher2, zzetVar, list);
                }
            }
        }
        return null;
    }

    static com.google.android.gms.internal.ads.zzcw zzb(java.lang.String str) {
        com.google.android.gms.internal.ads.zzapb zzapbVar = new com.google.android.gms.internal.ads.zzapb();
        zze(str, zzapbVar);
        return zzapbVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static android.text.SpannedString zzc(java.lang.String str, java.lang.String str2, java.util.List list) {
        char c;
        char c2;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char c3 = 0;
        int i = 0;
        while (i < str2.length()) {
            int i2 = i + 1;
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                int indexOf = str2.indexOf(59, i2);
                int indexOf2 = str2.indexOf(32, i2);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = java.lang.Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    java.lang.String substring = str2.substring(i2, indexOf);
                    int hashCode = substring.hashCode();
                    if (hashCode == 3309) {
                        if (substring.equals("gt")) {
                            c = 1;
                            if (c != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i = indexOf + 1;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    } else if (hashCode == 3464) {
                        if (substring.equals("lt")) {
                            c = 0;
                            if (c != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i = indexOf + 1;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    } else if (hashCode != 96708) {
                        if (hashCode == 3374865 && substring.equals("nbsp")) {
                            c = 2;
                            if (c != 0) {
                                spannableStringBuilder.append(kotlin.text.Typography.less);
                            } else if (c == 1) {
                                spannableStringBuilder.append(kotlin.text.Typography.greater);
                            } else if (c == 2) {
                                spannableStringBuilder.append(' ');
                            } else if (c != 3) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(substring).length() + 33);
                                sb.append("ignoring unsupported entity: '&");
                                sb.append(substring);
                                sb.append(";'");
                                com.google.android.gms.internal.ads.zzeg.zzc("WebvttCueParser", sb.toString());
                            } else {
                                spannableStringBuilder.append(kotlin.text.Typography.amp);
                            }
                            if (indexOf == indexOf2) {
                                spannableStringBuilder.append((java.lang.CharSequence) io.ktor.sse.ServerSentEventKt.SPACE);
                            }
                            i = indexOf + 1;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    } else {
                        if (substring.equals("amp")) {
                            c = 3;
                            if (c != 0) {
                            }
                            if (indexOf == indexOf2) {
                            }
                            i = indexOf + 1;
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                        if (indexOf == indexOf2) {
                        }
                        i = indexOf + 1;
                    }
                    c3 = 0;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
            } else if (i2 < str2.length()) {
                char charAt2 = str2.charAt(i2);
                int indexOf3 = str2.indexOf(62, i2);
                i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                int i3 = i2 - 2;
                boolean z = str2.charAt(i3) == '/';
                int i4 = i + (charAt2 == '/' ? 2 : 1);
                if (!z) {
                    i3 = i2 - 1;
                }
                java.lang.String substring2 = str2.substring(i4, i3);
                if (!substring2.trim().isEmpty()) {
                    java.lang.String trim = substring2.trim();
                    com.google.android.gms.internal.ads.zzgtj.zza(!trim.isEmpty());
                    java.lang.String str3 = com.google.android.gms.internal.ads.zzfl.zza;
                    java.lang.String str4 = trim.split("[ \\.]", 2)[c3];
                    int hashCode2 = str4.hashCode();
                    if (hashCode2 == 98) {
                        if (str4.equals("b")) {
                            c2 = 0;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else if (hashCode2 == 99) {
                        if (str4.equals("c")) {
                            c2 = 1;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else if (hashCode2 == 105) {
                        if (str4.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)) {
                            c2 = 2;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else if (hashCode2 == 3650) {
                        if (str4.equals("rt")) {
                            c2 = 5;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else if (hashCode2 == 3314158) {
                        if (str4.equals(com.ironsource.M6.q)) {
                            c2 = 3;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else if (hashCode2 == 3511770) {
                        if (str4.equals("ruby")) {
                            c2 = 4;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else if (hashCode2 != 117) {
                        if (hashCode2 == 118 && str4.equals("v")) {
                            c2 = 7;
                            switch (c2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (charAt2 != '/') {
                                        if (!z) {
                                            arrayDeque.push(com.google.android.gms.internal.ads.zzaoz.zza(substring2, spannableStringBuilder.length()));
                                            break;
                                        }
                                    } else {
                                        while (!arrayDeque.isEmpty()) {
                                            com.google.android.gms.internal.ads.zzaoz zzaozVar = (com.google.android.gms.internal.ads.zzaoz) arrayDeque.pop();
                                            zzf(str, zzaozVar, arrayList, spannableStringBuilder, list);
                                            if (arrayDeque.isEmpty()) {
                                                arrayList.clear();
                                            } else {
                                                arrayList.add(new com.google.android.gms.internal.ads.zzaoy(zzaozVar, spannableStringBuilder.length(), null));
                                            }
                                            if (zzaozVar.zza.equals(str4)) {
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    } else {
                        if (str4.equals("u")) {
                            c2 = 6;
                            switch (c2) {
                            }
                        }
                        c2 = 65535;
                        switch (c2) {
                        }
                    }
                }
            }
            i = i2;
            c3 = 0;
        }
        while (!arrayDeque.isEmpty()) {
            zzf(str, (com.google.android.gms.internal.ads.zzaoz) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzf(str, com.google.android.gms.internal.ads.zzaoz.zzb(), java.util.Collections.emptyList(), spannableStringBuilder, list);
        return android.text.SpannedString.valueOf(spannableStringBuilder);
    }

    private static com.google.android.gms.internal.ads.zzaow zzd(java.lang.String str, java.util.regex.Matcher matcher, com.google.android.gms.internal.ads.zzet zzetVar, java.util.List list) {
        com.google.android.gms.internal.ads.zzapb zzapbVar = new com.google.android.gms.internal.ads.zzapb();
        try {
            java.lang.String group = matcher.group(1);
            group.getClass();
            java.lang.String str2 = group;
            zzapbVar.zza = com.google.android.gms.internal.ads.zzape.zza(group);
            java.lang.String group2 = matcher.group(2);
            group2.getClass();
            java.lang.String str3 = group2;
            zzapbVar.zzb = com.google.android.gms.internal.ads.zzape.zza(group2);
            java.lang.String group3 = matcher.group(3);
            group3.getClass();
            zze(group3, zzapbVar);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String zzN = zzetVar.zzN(java.nio.charset.StandardCharsets.UTF_8);
            while (!android.text.TextUtils.isEmpty(zzN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(zzN.trim());
                zzN = zzetVar.zzN(java.nio.charset.StandardCharsets.UTF_8);
            }
            zzapbVar.zzc = zzc(str, sb.toString(), list);
            return new com.google.android.gms.internal.ads.zzaow(zzapbVar.zza().zzr(), zzapbVar.zza, zzapbVar.zzb);
        } catch (java.lang.IllegalArgumentException unused) {
            java.lang.String group4 = matcher.group();
            java.lang.String.valueOf(group4);
            com.google.android.gms.internal.ads.zzeg.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(java.lang.String.valueOf(group4)));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zze(java.lang.String str, com.google.android.gms.internal.ads.zzapb zzapbVar) {
        char c;
        char c2;
        char c3;
        java.util.regex.Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            java.lang.String group = matcher.group(1);
            group.getClass();
            int i2 = 2;
            java.lang.String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    char c4 = 65535;
                    if (indexOf != -1) {
                        java.lang.String substring = group2.substring(indexOf + 1);
                        switch (substring.hashCode()) {
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c4 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c4 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c4 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c4 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c4 == 0) {
                            i2 = 0;
                        } else if (c4 == 1 || c4 == 2) {
                            i2 = 1;
                        } else if (c4 != 3) {
                            java.lang.String.valueOf(substring);
                            com.google.android.gms.internal.ads.zzeg.zzc("WebvttCueParser", "Invalid anchor value: ".concat(java.lang.String.valueOf(substring)));
                            i2 = Integer.MIN_VALUE;
                        }
                        zzapbVar.zzg = i2;
                        group2 = group2.substring(0, indexOf);
                    }
                    if (group2.endsWith("%")) {
                        zzapbVar.zze = com.google.android.gms.internal.ads.zzape.zzb(group2);
                        zzapbVar.zzf = 0;
                    } else {
                        zzapbVar.zze = java.lang.Integer.parseInt(group2);
                        zzapbVar.zzf = 1;
                    }
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2 && c != 3) {
                                if (c == 4) {
                                    i = 3;
                                } else if (c != 5) {
                                    com.google.android.gms.internal.ads.zzeg.zzc("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                } else {
                                    i = 5;
                                }
                            }
                            i = 2;
                        } else {
                            i = 4;
                        }
                    }
                    zzapbVar.zzd = i;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        java.lang.String substring2 = group2.substring(indexOf2 + 1);
                        switch (substring2.hashCode()) {
                            case -1842484672:
                                if (substring2.equals("line-left")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1364013995:
                                if (substring2.equals("center")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1276788989:
                                if (substring2.equals("line-right")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1074341483:
                                if (substring2.equals("middle")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 100571:
                                if (substring2.equals("end")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 109757538:
                                if (substring2.equals("start")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        if (c3 == 0 || c3 == 1) {
                            i = 0;
                        } else if (c3 != 2 && c3 != 3) {
                            if (c3 == 4 || c3 == 5) {
                                i = 2;
                            } else {
                                java.lang.String.valueOf(substring2);
                                com.google.android.gms.internal.ads.zzeg.zzc("WebvttCueParser", "Invalid anchor value: ".concat(java.lang.String.valueOf(substring2)));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        zzapbVar.zzi = i;
                        group2 = group2.substring(0, indexOf2);
                    }
                    zzapbVar.zzh = com.google.android.gms.internal.ads.zzape.zzb(group2);
                } else if ("size".equals(group)) {
                    zzapbVar.zzj = com.google.android.gms.internal.ads.zzape.zzb(group2);
                } else if (com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL.equals(group)) {
                    int hashCode = group2.hashCode();
                    if (hashCode != 3462) {
                        if (hashCode == 3642 && group2.equals("rl")) {
                            c2 = 0;
                        }
                        c2 = 65535;
                    } else {
                        if (group2.equals("lr")) {
                            c2 = 1;
                        }
                        c2 = 65535;
                    }
                    if (c2 != 0) {
                        if (c2 != 1) {
                            com.google.android.gms.internal.ads.zzeg.zzc("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    zzapbVar.zzk = i;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    com.google.android.gms.internal.ads.zzeg.zzc("WebvttCueParser", sb.toString());
                }
            } catch (java.lang.NumberFormatException unused) {
                java.lang.String group3 = matcher.group();
                java.lang.String.valueOf(group3);
                com.google.android.gms.internal.ads.zzeg.zzc("WebvttCueParser", "Skipping bad cue setting: ".concat(java.lang.String.valueOf(group3)));
            }
        }
    }

    private static void zzf(java.lang.String str, com.google.android.gms.internal.ads.zzaoz zzaozVar, java.util.List list, android.text.SpannableStringBuilder spannableStringBuilder, java.util.List list2) {
        char c;
        java.util.Comparator comparator;
        int i = zzaozVar.zzb;
        int length = spannableStringBuilder.length();
        java.lang.String str2 = zzaozVar.zza;
        int hashCode = str2.hashCode();
        int i2 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c = 7;
            }
            c = 65535;
        } else if (hashCode == 105) {
            if (str2.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT)) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals(com.ironsource.M6.q)) {
                c = 6;
            }
            c = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c = 5;
            }
            c = 65535;
        } else {
            if (str2.equals("u")) {
                c = 3;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, length, 33);
                break;
            case 1:
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, length, 33);
                break;
            case 2:
                int zzg = zzg(list2, str, zzaozVar);
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                arrayList.addAll(list);
                comparator = com.google.android.gms.internal.ads.zzaoy.zza;
                java.util.Collections.sort(arrayList, comparator);
                int i3 = i;
                int i4 = 0;
                int i5 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((com.google.android.gms.internal.ads.zzaoy) arrayList.get(i4)).zzc().zza)) {
                        com.google.android.gms.internal.ads.zzaoy zzaoyVar = (com.google.android.gms.internal.ads.zzaoy) arrayList.get(i4);
                        int zzg2 = zzg(list2, str, zzaoyVar.zzc());
                        if (zzg2 == i2) {
                            zzg2 = zzg != i2 ? zzg : 1;
                        }
                        int i6 = zzaoyVar.zzc().zzb - i5;
                        int zzd2 = zzaoyVar.zzd() - i5;
                        java.lang.CharSequence subSequence = spannableStringBuilder.subSequence(i6, zzd2);
                        spannableStringBuilder.delete(i6, zzd2);
                        spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.zzdc(subSequence.toString(), zzg2), i3, i6, 33);
                        i5 += subSequence.length();
                        i3 = i6;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, length, 33);
                break;
            case 4:
                for (java.lang.String str3 : zzaozVar.zzd) {
                    java.util.Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        java.util.Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(((java.lang.Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.zzdf(zzaozVar.zzc), i, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        java.util.List zzh = zzh(list2, str, zzaozVar);
        for (int i7 = 0; i7 < zzh.size(); i7++) {
            com.google.android.gms.internal.ads.zzaov zzaovVar = ((com.google.android.gms.internal.ads.zzapa) zzh.get(i7)).zzb;
            if (zzaovVar != null) {
                if (zzaovVar.zzf() != -1) {
                    com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new android.text.style.StyleSpan(zzaovVar.zzf()), i, length, 33);
                }
                if (zzaovVar.zzg()) {
                    spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, length, 33);
                }
                if (zzaovVar.zzo()) {
                    com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new android.text.style.ForegroundColorSpan(zzaovVar.zzm()), i, length, 33);
                }
                if (zzaovVar.zzr()) {
                    com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new android.text.style.BackgroundColorSpan(zzaovVar.zzp()), i, length, 33);
                }
                if (zzaovVar.zzk() != null) {
                    com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new android.text.style.TypefaceSpan(zzaovVar.zzk()), i, length, 33);
                }
                int zzu = zzaovVar.zzu();
                if (zzu == 1) {
                    com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) zzaovVar.zzv(), true), i, length, 33);
                } else if (zzu == 2) {
                    com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new android.text.style.RelativeSizeSpan(zzaovVar.zzv()), i, length, 33);
                } else if (zzu == 3) {
                    com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new android.text.style.RelativeSizeSpan(zzaovVar.zzv() / 100.0f), i, length, 33);
                }
                if (zzaovVar.zzz()) {
                    spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.zzdb(), i, length, 33);
                }
            }
        }
    }

    private static int zzg(java.util.List list, java.lang.String str, com.google.android.gms.internal.ads.zzaoz zzaozVar) {
        java.util.List zzh = zzh(list, str, zzaozVar);
        for (int i = 0; i < zzh.size(); i++) {
            com.google.android.gms.internal.ads.zzaov zzaovVar = ((com.google.android.gms.internal.ads.zzapa) zzh.get(i)).zzb;
            if (zzaovVar.zzx() != -1) {
                return zzaovVar.zzx();
            }
        }
        return -1;
    }

    private static java.util.List zzh(java.util.List list, java.lang.String str, com.google.android.gms.internal.ads.zzaoz zzaozVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            com.google.android.gms.internal.ads.zzaov zzaovVar = (com.google.android.gms.internal.ads.zzaov) list.get(i);
            int zze = zzaovVar.zze(str, zzaozVar.zza, zzaozVar.zzd, zzaozVar.zzc);
            if (zze > 0) {
                arrayList.add(new com.google.android.gms.internal.ads.zzapa(zze, zzaovVar));
            }
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }
}
