package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaou {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final com.google.android.gms.internal.ads.zzet zzc = new com.google.android.gms.internal.ads.zzet();
    private final java.lang.StringBuilder zzd = new java.lang.StringBuilder();

    static void zzb(com.google.android.gms.internal.ads.zzet zzetVar) {
        while (true) {
            for (boolean z = true; zzetVar.zzd() > 0 && z; z = false) {
                char c = (char) zzetVar.zzi()[zzetVar.zzg()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzetVar.zzk(1);
                } else {
                    int zzg = zzetVar.zzg();
                    int zze = zzetVar.zze();
                    byte[] zzi = zzetVar.zzi();
                    if (zzg + 2 <= zze) {
                        int i = zzg + 1;
                        if (zzi[zzg] == 47) {
                            int i2 = zzg + 2;
                            if (zzi[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= zze) {
                                        break;
                                    }
                                    if (((char) zzi[i2]) == '*' && ((char) zzi[i3]) == '/') {
                                        zze = i2 + 2;
                                        i2 = zze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzetVar.zzk(zze - zzetVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    static java.lang.String zzc(com.google.android.gms.internal.ads.zzet zzetVar, java.lang.StringBuilder sb) {
        zzb(zzetVar);
        if (zzetVar.zzd() == 0) {
            return null;
        }
        java.lang.String zzd = zzd(zzetVar, sb);
        if (!zzd.isEmpty()) {
            return zzd;
        }
        char zzs = (char) zzetVar.zzs();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzs).length());
        sb2.append(zzs);
        return sb2.toString();
    }

    private static java.lang.String zzd(com.google.android.gms.internal.ads.zzet zzetVar, java.lang.StringBuilder sb) {
        sb.setLength(0);
        int zzg = zzetVar.zzg();
        int zze = zzetVar.zze();
        loop0: while (true) {
            for (boolean z = false; zzg < zze && !z; z = true) {
                char c = (char) zzetVar.zzi()[zzg];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb.append(c);
                    zzg++;
                }
            }
        }
        zzetVar.zzk(zzg - zzetVar.zzg());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0315, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00a9, code lost:
    
        if (")".equals(zzc(r4, r1)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List zza(com.google.android.gms.internal.ads.zzet zzetVar) {
        java.lang.String str;
        java.lang.String sb;
        char c;
        java.lang.StringBuilder sb2 = this.zzd;
        int i = 0;
        sb2.setLength(0);
        int zzg = zzetVar.zzg();
        while (!android.text.TextUtils.isEmpty(zzetVar.zzN(java.nio.charset.StandardCharsets.UTF_8))) {
        }
        com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzc;
        zzetVar2.zzb(zzetVar.zzi(), zzetVar.zzg());
        zzetVar2.zzh(zzg);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            zzb(zzetVar2);
            if (zzetVar2.zzd() >= 5 && "::cue".equals(zzetVar2.zzK(5, java.nio.charset.StandardCharsets.UTF_8))) {
                int zzg2 = zzetVar2.zzg();
                java.lang.String zzc = zzc(zzetVar2, sb2);
                if (zzc != null) {
                    if ("{".equals(zzc)) {
                        zzetVar2.zzh(zzg2);
                        str = "";
                    } else if ("(".equals(zzc)) {
                        int zzg3 = zzetVar2.zzg();
                        int zze = zzetVar2.zze();
                        boolean z = false;
                        while (zzg3 < zze && !z) {
                            int i2 = zzg3 + 1;
                            z = ((char) zzetVar2.zzi()[zzg3]) == ')';
                            zzg3 = i2;
                        }
                        str = zzetVar2.zzK((zzg3 - 1) - zzetVar2.zzg(), java.nio.charset.StandardCharsets.UTF_8).trim();
                    } else {
                        str = null;
                    }
                    if (str == null || !"{".equals(zzc(zzetVar2, sb2))) {
                        break;
                    }
                    com.google.android.gms.internal.ads.zzaov zzaovVar = new com.google.android.gms.internal.ads.zzaov();
                    if (!str.isEmpty()) {
                        int indexOf = str.indexOf(91);
                        if (indexOf != -1) {
                            java.util.regex.Matcher matcher = zza.matcher(str.substring(indexOf));
                            if (matcher.matches()) {
                                java.lang.String group = matcher.group(1);
                                group.getClass();
                                zzaovVar.zzd(group);
                            }
                            str = str.substring(i, indexOf);
                        }
                        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
                        java.lang.String[] split = str.split("\\.", -1);
                        java.lang.String str3 = split[i];
                        int indexOf2 = str3.indexOf(35);
                        if (indexOf2 != -1) {
                            zzaovVar.zzb(str3.substring(i, indexOf2));
                            zzaovVar.zza(str3.substring(indexOf2 + 1));
                        } else {
                            zzaovVar.zzb(str3);
                        }
                        int length = split.length;
                        if (length > 1) {
                            zzaovVar.zzc((java.lang.String[]) java.util.Arrays.copyOfRange(split, 1, length));
                        }
                    }
                    boolean z2 = false;
                    java.lang.String str4 = null;
                    while (!z2) {
                        int zzg4 = zzetVar2.zzg();
                        str4 = zzc(zzetVar2, sb2);
                        boolean z3 = str4 == null || "}".equals(str4);
                        if (!z3) {
                            zzetVar2.zzh(zzg4);
                            zzb(zzetVar2);
                            java.lang.String zzd = zzd(zzetVar2, sb2);
                            if (!zzd.isEmpty() && ":".equals(zzc(zzetVar2, sb2))) {
                                zzb(zzetVar2);
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                boolean z4 = false;
                                while (true) {
                                    if (z4) {
                                        sb = sb3.toString();
                                        break;
                                    }
                                    int zzg5 = zzetVar2.zzg();
                                    java.lang.String zzc2 = zzc(zzetVar2, sb2);
                                    if (zzc2 == null) {
                                        sb = null;
                                        break;
                                    }
                                    if ("}".equals(zzc2) || ";".equals(zzc2)) {
                                        zzetVar2.zzh(zzg5);
                                        z4 = true;
                                    } else {
                                        sb3.append(zzc2);
                                    }
                                }
                                if (sb != null && !sb.isEmpty()) {
                                    int zzg6 = zzetVar2.zzg();
                                    java.lang.String zzc3 = zzc(zzetVar2, sb2);
                                    if (!";".equals(zzc3)) {
                                        if ("}".equals(zzc3)) {
                                            zzetVar2.zzh(zzg6);
                                        } else {
                                            continue;
                                        }
                                    }
                                    if ("color".equals(zzd)) {
                                        zzaovVar.zzn(com.google.android.gms.internal.ads.zzdr.zzb(sb));
                                    } else if ("background-color".equals(zzd)) {
                                        zzaovVar.zzq(com.google.android.gms.internal.ads.zzdr.zzb(sb));
                                    } else if ("ruby-position".equals(zzd)) {
                                        if ("over".equals(sb)) {
                                            zzaovVar.zzw(1);
                                        } else if ("under".equals(sb)) {
                                            zzaovVar.zzw(2);
                                        }
                                    } else if ("text-combine-upright".equals(zzd)) {
                                        zzaovVar.zzy("all".equals(sb) || sb.startsWith("digits"));
                                    } else if ("text-decoration".equals(zzd)) {
                                        if ("underline".equals(sb)) {
                                            zzaovVar.zzh(true);
                                        }
                                    } else if ("font-family".equals(zzd)) {
                                        zzaovVar.zzl(sb);
                                    } else if ("font-weight".equals(zzd)) {
                                        if ("bold".equals(sb)) {
                                            zzaovVar.zzi(true);
                                        }
                                    } else if ("font-style".equals(zzd)) {
                                        if ("italic".equals(sb)) {
                                            zzaovVar.zzj(true);
                                        }
                                    } else if ("font-size".equals(zzd)) {
                                        java.util.regex.Matcher matcher2 = zzb.matcher(com.google.android.gms.internal.ads.zzgss.zza(sb));
                                        if (matcher2.matches()) {
                                            java.lang.String group2 = matcher2.group(2);
                                            group2.getClass();
                                            int hashCode = group2.hashCode();
                                            if (hashCode == 37) {
                                                if (group2.equals("%")) {
                                                    c = 2;
                                                    if (c != 0) {
                                                    }
                                                    java.lang.String group3 = matcher2.group(1);
                                                    group3.getClass();
                                                    zzaovVar.zzs(java.lang.Float.parseFloat(group3));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                java.lang.String group32 = matcher2.group(1);
                                                group32.getClass();
                                                zzaovVar.zzs(java.lang.Float.parseFloat(group32));
                                            } else if (hashCode != 3240) {
                                                if (hashCode == 3592 && group2.equals("px")) {
                                                    c = 0;
                                                    if (c != 0) {
                                                        zzaovVar.zzt(1);
                                                    } else if (c == 1) {
                                                        zzaovVar.zzt(2);
                                                    } else {
                                                        if (c != 2) {
                                                            throw new java.lang.IllegalStateException();
                                                        }
                                                        zzaovVar.zzt(3);
                                                    }
                                                    java.lang.String group322 = matcher2.group(1);
                                                    group322.getClass();
                                                    zzaovVar.zzs(java.lang.Float.parseFloat(group322));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                java.lang.String group3222 = matcher2.group(1);
                                                group3222.getClass();
                                                zzaovVar.zzs(java.lang.Float.parseFloat(group3222));
                                            } else {
                                                if (group2.equals(com.facebook.appevents.UserDataStore.EMAIL)) {
                                                    c = 1;
                                                    if (c != 0) {
                                                    }
                                                    java.lang.String group32222 = matcher2.group(1);
                                                    group32222.getClass();
                                                    zzaovVar.zzs(java.lang.Float.parseFloat(group32222));
                                                }
                                                c = 65535;
                                                if (c != 0) {
                                                }
                                                java.lang.String group322222 = matcher2.group(1);
                                                group322222.getClass();
                                                zzaovVar.zzs(java.lang.Float.parseFloat(group322222));
                                            }
                                        } else {
                                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(sb.length() + 22);
                                            sb4.append("Invalid font-size: '");
                                            sb4.append(sb);
                                            sb4.append("'.");
                                            com.google.android.gms.internal.ads.zzeg.zzc("WebvttCssParser", sb4.toString());
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        z2 = z3;
                    }
                    if ("}".equals(str4)) {
                        arrayList.add(zzaovVar);
                    }
                    i = 0;
                }
            }
            str = null;
            if (str == null) {
                break;
            }
            break;
        }
    }
}
