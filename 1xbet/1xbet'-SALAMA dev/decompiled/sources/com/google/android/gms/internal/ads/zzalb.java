package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class zzalb {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzed zzc = new zzed();
    private final StringBuilder zzd = new StringBuilder();

    public static String zza(zzed zzedVar, StringBuilder sb) {
        zzc(zzedVar);
        if (zzedVar.zzb() == 0) {
            return null;
        }
        String strZzd = zzd(zzedVar, sb);
        if (!"".equals(strZzd)) {
            return strZzd;
        }
        char cZzm = (char) zzedVar.zzm();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cZzm);
        return sb2.toString();
    }

    public static void zzc(zzed zzedVar) {
        while (true) {
            for (boolean z4 = true; zzedVar.zzb() > 0 && z4; z4 = false) {
                char c3 = (char) zzedVar.zzN()[zzedVar.zzd()];
                if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
                    zzedVar.zzM(1);
                } else {
                    int iZzd = zzedVar.zzd();
                    int iZze = zzedVar.zze();
                    byte[] bArrZzN = zzedVar.zzN();
                    if (iZzd + 2 <= iZze) {
                        int i7 = iZzd + 1;
                        if (bArrZzN[iZzd] == 47) {
                            int i8 = iZzd + 2;
                            if (bArrZzN[i7] == 42) {
                                while (true) {
                                    int i9 = i8 + 1;
                                    if (i9 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzN[i8]) == '*' && ((char) bArrZzN[i9]) == '/') {
                                        iZze = i8 + 2;
                                        i8 = iZze;
                                    } else {
                                        i8 = i9;
                                    }
                                }
                                zzedVar.zzM(iZze - zzedVar.zzd());
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

    private static String zzd(zzed zzedVar, StringBuilder sb) {
        char c3;
        sb.setLength(0);
        int iZzd = zzedVar.zzd();
        int iZze = zzedVar.zze();
        loop0: while (true) {
            boolean z4 = false;
            while (true) {
                if (iZzd < iZze && !z4) {
                    c3 = (char) zzedVar.zzN()[iZzd];
                    if ((c3 >= 'A' && c3 <= 'Z') || ((c3 >= 'a' && c3 <= 'z') || ((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                        break;
                    }
                    z4 = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c3);
            iZzd++;
        }
        zzedVar.zzM(iZzd - zzedVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x0204  */
    /* JADX WARN: Code duplicated, block: B:107:0x0209  */
    /* JADX WARN: Code duplicated, block: B:109:0x0211  */
    /* JADX WARN: Code duplicated, block: B:113:0x0221  */
    /* JADX WARN: Code duplicated, block: B:116:0x0229  */
    /* JADX WARN: Code duplicated, block: B:118:0x0231  */
    /* JADX WARN: Code duplicated, block: B:120:0x0239  */
    /* JADX WARN: Code duplicated, block: B:121:0x023e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0246  */
    /* JADX WARN: Code duplicated, block: B:124:0x024b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0253  */
    /* JADX WARN: Code duplicated, block: B:128:0x025b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0260  */
    /* JADX WARN: Code duplicated, block: B:131:0x0268  */
    /* JADX WARN: Code duplicated, block: B:133:0x0270  */
    /* JADX WARN: Code duplicated, block: B:134:0x0275  */
    /* JADX WARN: Code duplicated, block: B:136:0x027d  */
    /* JADX WARN: Code duplicated, block: B:138:0x028d  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:154:0x02da  */
    /* JADX WARN: Code duplicated, block: B:155:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:157:0x02df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x02e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:175:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0045  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e6  */
    /* JADX WARN: Instruction removed from duplicated block: B:138:0x028d, please report this as an issue */
    public final List zzb(zzed zzedVar) {
        String strTrim;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        byte b7;
        boolean z4;
        int i7 = -1;
        int i8 = 0;
        this.zzd.setLength(0);
        int iZzd = zzedVar.zzd();
        while (!TextUtils.isEmpty(zzedVar.zzz(StandardCharsets.UTF_8))) {
        }
        this.zzc.zzJ(zzedVar.zzN(), zzedVar.zzd());
        this.zzc.zzL(iZzd);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzed zzedVar2 = this.zzc;
            StringBuilder sb = this.zzd;
            zzc(zzedVar2);
            if (zzedVar2.zzb() >= 5 && "::cue".equals(zzedVar2.zzB(5, StandardCharsets.UTF_8))) {
                int iZzd2 = zzedVar2.zzd();
                String strZza = zza(zzedVar2, sb);
                if (strZza == null) {
                    strTrim = null;
                } else if ("{".equals(strZza)) {
                    zzedVar2.zzL(iZzd2);
                    strTrim = "";
                } else {
                    if ("(".equals(strZza)) {
                        int iZzd3 = zzedVar2.zzd();
                        int iZze = zzedVar2.zze();
                        int i9 = i8;
                        while (iZzd3 < iZze && i9 == 0) {
                            int i10 = iZzd3 + 1;
                            i9 = ((char) zzedVar2.zzN()[iZzd3]) == ')' ? 1 : i8;
                            iZzd3 = i10;
                        }
                        strTrim = zzedVar2.zzB((iZzd3 + i7) - zzedVar2.zzd(), StandardCharsets.UTF_8).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(zza(zzedVar2, sb))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !"{".equals(zza(this.zzc, this.zzd))) {
                break;
            }
            zzalc zzalcVar = new zzalc();
            if (!"".equals(strTrim)) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != i7) {
                    Matcher matcher2 = zza.matcher(strTrim.substring(iIndexOf));
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        zzalcVar.zzv(strGroup2);
                    }
                    strTrim = strTrim.substring(i8, iIndexOf);
                }
                int i11 = zzen.zza;
                String[] strArrSplit = strTrim.split("\\.", i7);
                String str = strArrSplit[i8];
                int iIndexOf2 = str.indexOf(35);
                if (iIndexOf2 != i7) {
                    zzalcVar.zzu(str.substring(i8, iIndexOf2));
                    zzalcVar.zzt(str.substring(iIndexOf2 + 1));
                } else {
                    zzalcVar.zzu(str);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    zzalcVar.zzs((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            int i12 = i8;
            String strZza2 = null;
            while (i12 == 0) {
                zzed zzedVar3 = this.zzc;
                StringBuilder sb2 = this.zzd;
                int iZzd4 = zzedVar3.zzd();
                strZza2 = zza(zzedVar3, sb2);
                i12 = (strZza2 == null || "}".equals(strZza2)) ? 1 : i8;
                if (i12 == 0) {
                    this.zzc.zzL(iZzd4);
                    zzed zzedVar4 = this.zzc;
                    StringBuilder sb3 = this.zzd;
                    zzc(zzedVar4);
                    String strZzd = zzd(zzedVar4, sb3);
                    if (!"".equals(strZzd) && ":".equals(zza(zzedVar4, sb3))) {
                        zzc(zzedVar4);
                        StringBuilder sb4 = new StringBuilder();
                        int i13 = i8;
                        while (true) {
                            if (i13 != 0) {
                                string = sb4.toString();
                                break;
                            }
                            int iZzd5 = zzedVar4.zzd();
                            String strZza3 = zza(zzedVar4, sb3);
                            if (strZza3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strZza3) || ";".equals(strZza3)) {
                                zzedVar4.zzL(iZzd5);
                                i13 = 1;
                            } else {
                                sb4.append(strZza3);
                            }
                        }
                        if (string != null && !"".equals(string)) {
                            int iZzd6 = zzedVar4.zzd();
                            String strZza4 = zza(zzedVar4, sb3);
                            if (";".equals(strZza4)) {
                                if ("color".equals(strZzd)) {
                                    zzalcVar.zzk(zzdb.zza(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzalcVar.zzh(zzdb.zza(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzalcVar.zzp(1);
                                    } else if ("under".equals(string)) {
                                        zzalcVar.zzp(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string)) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    zzalcVar.zzj(z4);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if ("underline".equals(string)) {
                                        zzalcVar.zzq(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzalcVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if ("bold".equals(string)) {
                                        zzalcVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if ("italic".equals(string)) {
                                        zzalcVar.zzo(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzfsn.zza(string));
                                    if (matcher.matches()) {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592) {
                                                    b7 = -1;
                                                } else {
                                                    b7 = 0;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b7 = 1;
                                            } else {
                                                b7 = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b7 = 2;
                                        } else {
                                            b7 = -1;
                                        }
                                        if (b7 != 0) {
                                            zzalcVar.zzn(1);
                                        } else if (b7 != 1) {
                                            zzalcVar.zzn(2);
                                        } else {
                                            if (b7 == 2) {
                                                throw new IllegalStateException();
                                            }
                                            zzalcVar.zzn(3);
                                        }
                                        String strGroup3 = matcher.group(1);
                                        strGroup3.getClass();
                                        zzalcVar.zzm(Float.parseFloat(strGroup3));
                                    } else {
                                        zzdq.zzf("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    }
                                } else {
                                    continue;
                                }
                            } else if ("}".equals(strZza4)) {
                                zzedVar4.zzL(iZzd6);
                                if ("color".equals(strZzd)) {
                                    zzalcVar.zzk(zzdb.zza(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzalcVar.zzh(zzdb.zza(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzalcVar.zzp(1);
                                    } else if ("under".equals(string)) {
                                        zzalcVar.zzp(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string) || string.startsWith("digits")) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    zzalcVar.zzj(z4);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if ("underline".equals(string)) {
                                        zzalcVar.zzq(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzalcVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if ("bold".equals(string)) {
                                        zzalcVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if ("italic".equals(string)) {
                                        zzalcVar.zzo(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzfsn.zza(string));
                                    if (matcher.matches()) {
                                        zzdq.zzf("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592 && strGroup.equals("px")) {
                                                    b7 = 0;
                                                } else {
                                                    b7 = -1;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b7 = 1;
                                            } else {
                                                b7 = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b7 = 2;
                                        } else {
                                            b7 = -1;
                                        }
                                        if (b7 != 0) {
                                            zzalcVar.zzn(1);
                                        } else if (b7 != 1) {
                                            zzalcVar.zzn(2);
                                        } else {
                                            if (b7 == 2) {
                                                throw new IllegalStateException();
                                            }
                                            zzalcVar.zzn(3);
                                        }
                                        String strGroup4 = matcher.group(1);
                                        strGroup4.getClass();
                                        zzalcVar.zzm(Float.parseFloat(strGroup4));
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i8 = 0;
            }
            if ("}".equals(strZza2)) {
                arrayList.add(zzalcVar);
            }
            i7 = -1;
            i8 = 0;
        }
        return arrayList;
    }
}
