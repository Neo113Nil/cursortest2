package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzas implements java.lang.Iterable, com.google.android.gms.internal.measurement.zzao {
    private final java.lang.String zza;

    public zzas(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzas) {
            return this.zza.equals(((com.google.android.gms.internal.measurement.zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.measurement.zzar(this);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    final /* synthetic */ java.lang.String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.String zzc() {
        return this.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0286  */
    @Override // com.google.android.gms.internal.measurement.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.internal.measurement.zzao zzcA(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        char c;
        com.google.android.gms.internal.measurement.zzas zzasVar;
        int i;
        com.google.android.gms.internal.measurement.zzas zzasVar2;
        int i2;
        int i3;
        com.google.android.gms.internal.measurement.zzg zzgVar2;
        int i4;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str)) {
            str2 = "toLocaleUpperCase";
            str3 = "toUpperCase";
        } else {
            str3 = "toUpperCase";
            str2 = "toLocaleUpperCase";
            if (!str3.equals(str) && !str2.equals(str)) {
                str4 = "hasOwnProperty";
                if (!"trim".equals(str)) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("%s is not a String function", str));
                }
                switch (str.hashCode()) {
                    case -1789698943:
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        if (str.equals(str6)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1776922004:
                        str5 = "charAt";
                        str7 = "toString";
                        if (str.equals(str7)) {
                            c = 14;
                            str6 = str4;
                            break;
                        } else {
                            str6 = str4;
                            c = 65535;
                            break;
                        }
                    case -1464939364:
                        str5 = "charAt";
                        if (str.equals("toLocaleLowerCase")) {
                            c = '\f';
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case -1361633751:
                        str5 = "charAt";
                        if (str.equals(str5)) {
                            str6 = str4;
                            str7 = "toString";
                            c = 0;
                            break;
                        }
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case -1354795244:
                        if (str.equals("concat")) {
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            c = 1;
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case -1137582698:
                        if (str.equals("toLowerCase")) {
                            c = '\r';
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case -906336856:
                        if (str.equals(com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH)) {
                            c = 7;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case -726908483:
                        if (str.equals(str2)) {
                            c = 11;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case -467511597:
                        if (str.equals("lastIndexOf")) {
                            c = 4;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case -399551817:
                        if (str.equals(str3)) {
                            c = 15;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case 3568674:
                        if (str.equals("trim")) {
                            c = 16;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case 103668165:
                        if (str.equals("match")) {
                            c = 5;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case 109526418:
                        if (str.equals("slice")) {
                            c = '\b';
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case 109648666:
                        if (str.equals("split")) {
                            c = '\t';
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case 530542161:
                        if (str.equals("substring")) {
                            c = '\n';
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case 1094496948:
                        if (str.equals("replace")) {
                            c = 6;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    case 1943291465:
                        if (str.equals("indexOf")) {
                            c = 3;
                            str5 = "charAt";
                            str6 = str4;
                            str7 = "toString";
                            break;
                        }
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                    default:
                        str5 = "charAt";
                        str6 = str4;
                        str7 = "toString";
                        c = 65535;
                        break;
                }
                java.lang.String str8 = com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
                java.lang.String str9 = str6;
                java.lang.String str10 = str5;
                switch (c) {
                    case 0:
                        com.google.android.gms.internal.measurement.zzh.zzc(str10, 1, list);
                        int zzi = !list.isEmpty() ? (int) com.google.android.gms.internal.measurement.zzh.zzi(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue()) : 0;
                        java.lang.String str11 = this.zza;
                        return (zzi < 0 || zzi >= str11.length()) ? com.google.android.gms.internal.measurement.zzao.zzm : new com.google.android.gms.internal.measurement.zzas(java.lang.String.valueOf(str11.charAt(zzi)));
                    case 1:
                        zzasVar = this;
                        if (!list.isEmpty()) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(zzasVar.zza);
                            for (int i5 = 0; i5 < list.size(); i5++) {
                                sb.append(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(i5)).zzc());
                            }
                            return new com.google.android.gms.internal.measurement.zzas(sb.toString());
                        }
                        return zzasVar;
                    case 2:
                        com.google.android.gms.internal.measurement.zzh.zza(str9, 1, list);
                        java.lang.String str12 = this.zza;
                        com.google.android.gms.internal.measurement.zzao zza = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0));
                        if ("length".equals(zza.zzc())) {
                            return com.google.android.gms.internal.measurement.zzaf.zzk;
                        }
                        double doubleValue = zza.zzd().doubleValue();
                        return (doubleValue != java.lang.Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str12.length()) ? com.google.android.gms.internal.measurement.zzaf.zzl : com.google.android.gms.internal.measurement.zzaf.zzk;
                    case 3:
                        com.google.android.gms.internal.measurement.zzh.zzc("indexOf", 2, list);
                        java.lang.String str13 = this.zza;
                        if (list.size() > 0) {
                            str8 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
                        }
                        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(str13.indexOf(str8, (int) com.google.android.gms.internal.measurement.zzh.zzi(list.size() < 2 ? 0.0d : zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue()))));
                    case 4:
                        com.google.android.gms.internal.measurement.zzh.zzc("lastIndexOf", 2, list);
                        java.lang.String str14 = this.zza;
                        if (list.size() > 0) {
                            str8 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
                        }
                        java.lang.String str15 = str8;
                        return new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(str14.lastIndexOf(str15, (int) (java.lang.Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : com.google.android.gms.internal.measurement.zzh.zzi(r1)))));
                    case 5:
                        com.google.android.gms.internal.measurement.zzh.zzc("match", 1, list);
                        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(list.size() <= 0 ? "" : zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc()).matcher(this.zza);
                        return matcher.find() ? new com.google.android.gms.internal.measurement.zzae(java.util.Arrays.asList(new com.google.android.gms.internal.measurement.zzas(matcher.group()))) : com.google.android.gms.internal.measurement.zzao.zzg;
                    case 6:
                        zzasVar = this;
                        com.google.android.gms.internal.measurement.zzh.zzc("replace", 2, list);
                        com.google.android.gms.internal.measurement.zzao zzaoVar = com.google.android.gms.internal.measurement.zzao.zzf;
                        if (!list.isEmpty()) {
                            str8 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
                            if (list.size() > 1) {
                                zzaoVar = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1));
                            }
                        }
                        java.lang.String str16 = str8;
                        java.lang.String str17 = zzasVar.zza;
                        int indexOf = str17.indexOf(str16);
                        if (indexOf >= 0) {
                            if (zzaoVar instanceof com.google.android.gms.internal.measurement.zzai) {
                                zzaoVar = ((com.google.android.gms.internal.measurement.zzai) zzaoVar).zza(zzgVar, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.zzas(str16), new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(indexOf)), zzasVar));
                            }
                            java.lang.String substring = str17.substring(0, indexOf);
                            java.lang.String zzc = zzaoVar.zzc();
                            java.lang.String substring2 = str17.substring(indexOf + str16.length());
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(substring).length() + java.lang.String.valueOf(zzc).length() + java.lang.String.valueOf(substring2).length());
                            sb2.append(substring);
                            sb2.append(zzc);
                            sb2.append(substring2);
                            zzasVar2 = new com.google.android.gms.internal.measurement.zzas(sb2.toString());
                            return zzasVar2;
                        }
                        return zzasVar;
                    case 7:
                        com.google.android.gms.internal.measurement.zzh.zzc(com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH, 1, list);
                        if (!list.isEmpty()) {
                            str8 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
                        }
                        return java.util.regex.Pattern.compile(str8).matcher(this.zza).find() ? new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(r1.start())) : new com.google.android.gms.internal.measurement.zzah(java.lang.Double.valueOf(-1.0d));
                    case '\b':
                        com.google.android.gms.internal.measurement.zzh.zzc("slice", 2, list);
                        java.lang.String str18 = this.zza;
                        double zzi2 = com.google.android.gms.internal.measurement.zzh.zzi(!list.isEmpty() ? zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue() : 0.0d);
                        double max = zzi2 < 0.0d ? java.lang.Math.max(str18.length() + zzi2, 0.0d) : java.lang.Math.min(zzi2, str18.length());
                        double zzi3 = com.google.android.gms.internal.measurement.zzh.zzi(list.size() > 1 ? zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue() : str18.length());
                        int i6 = (int) max;
                        return new com.google.android.gms.internal.measurement.zzas(str18.substring(i6, java.lang.Math.max(0, ((int) (zzi3 < 0.0d ? java.lang.Math.max(str18.length() + zzi3, 0.0d) : java.lang.Math.min(zzi3, str18.length()))) - i6) + i6));
                    case '\t':
                        com.google.android.gms.internal.measurement.zzh.zzc("split", 2, list);
                        java.lang.String str19 = this.zza;
                        if (str19.length() == 0) {
                            return new com.google.android.gms.internal.measurement.zzae(java.util.Arrays.asList(this));
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        if (list.isEmpty()) {
                            arrayList.add(this);
                        } else {
                            java.lang.String zzc2 = zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzc();
                            long zzh = list.size() > 1 ? com.google.android.gms.internal.measurement.zzh.zzh(zzgVar.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue()) : 2147483647L;
                            if (zzh == 0) {
                                return new com.google.android.gms.internal.measurement.zzae();
                            }
                            java.lang.String[] split = str19.split(java.util.regex.Pattern.quote(zzc2), ((int) zzh) + 1);
                            int length = split.length;
                            if (!zzc2.isEmpty() || length <= 0) {
                                i2 = length;
                                i3 = 0;
                            } else {
                                boolean isEmpty = split[0].isEmpty();
                                i2 = length - 1;
                                i3 = isEmpty;
                                if (!split[i2].isEmpty()) {
                                    i2 = length;
                                    i3 = isEmpty;
                                }
                            }
                            if (length > zzh) {
                                i2--;
                            }
                            while (i3 < i2) {
                                arrayList.add(new com.google.android.gms.internal.measurement.zzas(split[i3]));
                                i3++;
                            }
                        }
                        return new com.google.android.gms.internal.measurement.zzae(arrayList);
                    case '\n':
                        com.google.android.gms.internal.measurement.zzh.zzc("substring", 2, list);
                        java.lang.String str20 = this.zza;
                        if (list.isEmpty()) {
                            zzgVar2 = zzgVar;
                            i4 = 0;
                        } else {
                            zzgVar2 = zzgVar;
                            i4 = (int) com.google.android.gms.internal.measurement.zzh.zzi(zzgVar2.zza((com.google.android.gms.internal.measurement.zzao) list.get(0)).zzd().doubleValue());
                        }
                        int zzi4 = list.size() > 1 ? (int) com.google.android.gms.internal.measurement.zzh.zzi(zzgVar2.zza((com.google.android.gms.internal.measurement.zzao) list.get(1)).zzd().doubleValue()) : str20.length();
                        int min = java.lang.Math.min(java.lang.Math.max(i4, 0), str20.length());
                        int min2 = java.lang.Math.min(java.lang.Math.max(zzi4, 0), str20.length());
                        zzasVar2 = new com.google.android.gms.internal.measurement.zzas(str20.substring(java.lang.Math.min(min, min2), java.lang.Math.max(min, min2)));
                        return zzasVar2;
                    case 11:
                        com.google.android.gms.internal.measurement.zzh.zza(str2, 0, list);
                        return new com.google.android.gms.internal.measurement.zzas(this.zza.toUpperCase());
                    case '\f':
                        com.google.android.gms.internal.measurement.zzh.zza("toLocaleLowerCase", 0, list);
                        return new com.google.android.gms.internal.measurement.zzas(this.zza.toLowerCase());
                    case '\r':
                        com.google.android.gms.internal.measurement.zzh.zza("toLowerCase", 0, list);
                        return new com.google.android.gms.internal.measurement.zzas(this.zza.toLowerCase(java.util.Locale.ENGLISH));
                    case 14:
                        zzasVar = this;
                        com.google.android.gms.internal.measurement.zzh.zza(str7, 0, list);
                        return zzasVar;
                    case 15:
                        com.google.android.gms.internal.measurement.zzh.zza(str3, 0, list);
                        return new com.google.android.gms.internal.measurement.zzas(this.zza.toUpperCase(java.util.Locale.ENGLISH));
                    case 16:
                        com.google.android.gms.internal.measurement.zzh.zza(str3, 0, list);
                        return new com.google.android.gms.internal.measurement.zzas(this.zza.trim());
                    default:
                        throw new java.lang.IllegalArgumentException("Command not supported");
                }
            }
        }
        str4 = "hasOwnProperty";
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        java.lang.String str82 = com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
        java.lang.String str92 = str6;
        java.lang.String str102 = str5;
        switch (c) {
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Double zzd() {
        java.lang.String str = this.zza;
        if (str.isEmpty()) {
            return java.lang.Double.valueOf(0.0d);
        }
        try {
            return java.lang.Double.valueOf(str);
        } catch (java.lang.NumberFormatException unused) {
            return java.lang.Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Boolean zze() {
        return java.lang.Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.util.Iterator zzf() {
        return new com.google.android.gms.internal.measurement.zzaq(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzt() {
        return new com.google.android.gms.internal.measurement.zzas(this.zza);
    }
}
