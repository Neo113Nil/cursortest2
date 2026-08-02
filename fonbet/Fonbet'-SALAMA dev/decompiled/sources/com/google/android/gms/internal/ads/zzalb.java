package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
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
        String zzd = zzd(zzedVar, sb);
        if (!"".equals(zzd)) {
            return zzd;
        }
        char zzm = (char) zzedVar.zzm();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zzm);
        return sb2.toString();
    }

    public static void zzc(zzed zzedVar) {
        while (true) {
            for (boolean z4 = true; zzedVar.zzb() > 0 && z4; z4 = false) {
                char c3 = (char) zzedVar.zzN()[zzedVar.zzd()];
                if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
                    zzedVar.zzM(1);
                } else {
                    int zzd = zzedVar.zzd();
                    int zze = zzedVar.zze();
                    byte[] zzN = zzedVar.zzN();
                    if (zzd + 2 <= zze) {
                        int i7 = zzd + 1;
                        if (zzN[zzd] == 47) {
                            int i8 = zzd + 2;
                            if (zzN[i7] == 42) {
                                while (true) {
                                    int i9 = i8 + 1;
                                    if (i9 >= zze) {
                                        break;
                                    }
                                    if (((char) zzN[i8]) == '*' && ((char) zzN[i9]) == '/') {
                                        zze = i8 + 2;
                                        i8 = zze;
                                    } else {
                                        i8 = i9;
                                    }
                                }
                                zzedVar.zzM(zze - zzedVar.zzd());
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
        sb.setLength(0);
        int zzd = zzedVar.zzd();
        int zze = zzedVar.zze();
        loop0: while (true) {
            for (boolean z4 = false; zzd < zze && !z4; z4 = true) {
                char c3 = (char) zzedVar.zzN()[zzd];
                if ((c3 >= 'A' && c3 <= 'Z') || ((c3 >= 'a' && c3 <= 'z') || ((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                    sb.append(c3);
                    zzd++;
                }
            }
        }
        zzedVar.zzM(zzd - zzedVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0314, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00b0, code lost:
    
        if (")".equals(zza(r5, r6)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzb(zzed zzedVar) {
        String str;
        String sb;
        char c3;
        int i7 = -1;
        int i8 = 0;
        this.zzd.setLength(0);
        int zzd = zzedVar.zzd();
        while (!TextUtils.isEmpty(zzedVar.zzz(StandardCharsets.UTF_8))) {
        }
        this.zzc.zzJ(zzedVar.zzN(), zzedVar.zzd());
        this.zzc.zzL(zzd);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzed zzedVar2 = this.zzc;
            StringBuilder sb2 = this.zzd;
            zzc(zzedVar2);
            if (zzedVar2.zzb() >= 5 && "::cue".equals(zzedVar2.zzB(5, StandardCharsets.UTF_8))) {
                int zzd2 = zzedVar2.zzd();
                String zza2 = zza(zzedVar2, sb2);
                if (zza2 != null) {
                    if ("{".equals(zza2)) {
                        zzedVar2.zzL(zzd2);
                        str = "";
                    } else if ("(".equals(zza2)) {
                        int zzd3 = zzedVar2.zzd();
                        int zze = zzedVar2.zze();
                        int i9 = i8;
                        while (zzd3 < zze && i9 == 0) {
                            int i10 = zzd3 + 1;
                            i9 = ((char) zzedVar2.zzN()[zzd3]) == ')' ? 1 : i8;
                            zzd3 = i10;
                        }
                        str = zzedVar2.zzB((zzd3 + i7) - zzedVar2.zzd(), StandardCharsets.UTF_8).trim();
                    } else {
                        str = null;
                    }
                    if (str == null || !"{".equals(zza(this.zzc, this.zzd))) {
                        break;
                    }
                    zzalc zzalcVar = new zzalc();
                    if (!"".equals(str)) {
                        int indexOf = str.indexOf(91);
                        if (indexOf != i7) {
                            Matcher matcher = zza.matcher(str.substring(indexOf));
                            if (matcher.matches()) {
                                String group = matcher.group(1);
                                group.getClass();
                                zzalcVar.zzv(group);
                            }
                            str = str.substring(i8, indexOf);
                        }
                        int i11 = zzen.zza;
                        String[] split = str.split("\\.", i7);
                        String str2 = split[i8];
                        int indexOf2 = str2.indexOf(35);
                        if (indexOf2 != i7) {
                            zzalcVar.zzu(str2.substring(i8, indexOf2));
                            zzalcVar.zzt(str2.substring(indexOf2 + 1));
                        } else {
                            zzalcVar.zzu(str2);
                        }
                        int length = split.length;
                        if (length > 1) {
                            zzalcVar.zzs((String[]) Arrays.copyOfRange(split, 1, length));
                        }
                    }
                    int i12 = i8;
                    String str3 = null;
                    while (i12 == 0) {
                        zzed zzedVar3 = this.zzc;
                        StringBuilder sb3 = this.zzd;
                        int zzd4 = zzedVar3.zzd();
                        str3 = zza(zzedVar3, sb3);
                        i12 = (str3 == null || "}".equals(str3)) ? 1 : i8;
                        if (i12 == 0) {
                            this.zzc.zzL(zzd4);
                            zzed zzedVar4 = this.zzc;
                            StringBuilder sb4 = this.zzd;
                            zzc(zzedVar4);
                            String zzd5 = zzd(zzedVar4, sb4);
                            if (!"".equals(zzd5) && ":".equals(zza(zzedVar4, sb4))) {
                                zzc(zzedVar4);
                                StringBuilder sb5 = new StringBuilder();
                                int i13 = i8;
                                while (true) {
                                    if (i13 != 0) {
                                        sb = sb5.toString();
                                        break;
                                    }
                                    int zzd6 = zzedVar4.zzd();
                                    String zza3 = zza(zzedVar4, sb4);
                                    if (zza3 == null) {
                                        sb = null;
                                        break;
                                    }
                                    if ("}".equals(zza3) || ";".equals(zza3)) {
                                        zzedVar4.zzL(zzd6);
                                        i13 = 1;
                                    } else {
                                        sb5.append(zza3);
                                    }
                                }
                                if (sb != null && !"".equals(sb)) {
                                    int zzd7 = zzedVar4.zzd();
                                    String zza4 = zza(zzedVar4, sb4);
                                    if (!";".equals(zza4)) {
                                        if ("}".equals(zza4)) {
                                            zzedVar4.zzL(zzd7);
                                        } else {
                                            continue;
                                        }
                                    }
                                    if ("color".equals(zzd5)) {
                                        zzalcVar.zzk(zzdb.zza(sb));
                                    } else if ("background-color".equals(zzd5)) {
                                        zzalcVar.zzh(zzdb.zza(sb));
                                    } else if ("ruby-position".equals(zzd5)) {
                                        if ("over".equals(sb)) {
                                            zzalcVar.zzp(1);
                                        } else if ("under".equals(sb)) {
                                            zzalcVar.zzp(2);
                                        }
                                    } else if ("text-combine-upright".equals(zzd5)) {
                                        zzalcVar.zzj("all".equals(sb) || sb.startsWith("digits"));
                                    } else if ("text-decoration".equals(zzd5)) {
                                        if ("underline".equals(sb)) {
                                            zzalcVar.zzq(true);
                                        }
                                    } else if ("font-family".equals(zzd5)) {
                                        zzalcVar.zzl(sb);
                                    } else if ("font-weight".equals(zzd5)) {
                                        if ("bold".equals(sb)) {
                                            zzalcVar.zzi(true);
                                        }
                                    } else if ("font-style".equals(zzd5)) {
                                        if ("italic".equals(sb)) {
                                            zzalcVar.zzo(true);
                                        }
                                    } else if ("font-size".equals(zzd5)) {
                                        Matcher matcher2 = zzb.matcher(zzfsn.zza(sb));
                                        if (matcher2.matches()) {
                                            String group2 = matcher2.group(2);
                                            group2.getClass();
                                            int hashCode = group2.hashCode();
                                            if (hashCode == 37) {
                                                if (group2.equals("%")) {
                                                    c3 = 2;
                                                    if (c3 != 0) {
                                                    }
                                                    String group3 = matcher2.group(1);
                                                    group3.getClass();
                                                    zzalcVar.zzm(Float.parseFloat(group3));
                                                }
                                                c3 = 65535;
                                                if (c3 != 0) {
                                                }
                                                String group32 = matcher2.group(1);
                                                group32.getClass();
                                                zzalcVar.zzm(Float.parseFloat(group32));
                                            } else if (hashCode != 3240) {
                                                if (hashCode == 3592 && group2.equals("px")) {
                                                    c3 = 0;
                                                    if (c3 != 0) {
                                                        zzalcVar.zzn(1);
                                                    } else if (c3 == 1) {
                                                        zzalcVar.zzn(2);
                                                    } else {
                                                        if (c3 != 2) {
                                                            throw new IllegalStateException();
                                                        }
                                                        zzalcVar.zzn(3);
                                                    }
                                                    String group322 = matcher2.group(1);
                                                    group322.getClass();
                                                    zzalcVar.zzm(Float.parseFloat(group322));
                                                }
                                                c3 = 65535;
                                                if (c3 != 0) {
                                                }
                                                String group3222 = matcher2.group(1);
                                                group3222.getClass();
                                                zzalcVar.zzm(Float.parseFloat(group3222));
                                            } else {
                                                if (group2.equals("em")) {
                                                    c3 = 1;
                                                    if (c3 != 0) {
                                                    }
                                                    String group32222 = matcher2.group(1);
                                                    group32222.getClass();
                                                    zzalcVar.zzm(Float.parseFloat(group32222));
                                                }
                                                c3 = 65535;
                                                if (c3 != 0) {
                                                }
                                                String group322222 = matcher2.group(1);
                                                group322222.getClass();
                                                zzalcVar.zzm(Float.parseFloat(group322222));
                                            }
                                        } else {
                                            zzdq.zzf("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        i8 = 0;
                    }
                    if ("}".equals(str3)) {
                        arrayList.add(zzalcVar);
                    }
                    i7 = -1;
                    i8 = 0;
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
