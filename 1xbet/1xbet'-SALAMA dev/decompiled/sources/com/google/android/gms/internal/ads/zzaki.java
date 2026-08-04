package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzaki implements zzajs {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzakh zzc;
    private final zzed zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzaki() {
        this(null);
    }

    private static float zzb(int i7) {
        if (i7 == 0) {
            return 0.05f;
        }
        if (i7 != 1) {
            return i7 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zzc(long j, List list, List list2) {
        int i7;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i7 = size + 1;
                break;
            }
        }
        list.add(i7, Long.valueOf(j));
        list2.add(i7, i7 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i7 - 1)));
        return i7;
    }

    private static long zzd(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i7 = zzen.zza;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j3 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j3 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void zze(zzed zzedVar, Charset charset) {
        while (true) {
            String strZzz = zzedVar.zzz(charset);
            if (strZzz == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZzz)) {
                while (true) {
                    String strZzz2 = zzedVar.zzz(charset);
                    if (strZzz2 == null || (zzedVar.zzb() != 0 && zzedVar.zza(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strZzz2.split(":");
                    if (strArrSplit.length == 2) {
                        byte b7 = 0;
                        String strZza = zzfsn.zza(strArrSplit[0].trim());
                        switch (strZza.hashCode()) {
                            case 1879649548:
                                if (!strZza.equals("playresx")) {
                                    b7 = -1;
                                }
                                break;
                            case 1879649549:
                                if (!strZza.equals("playresy")) {
                                    b7 = -1;
                                } else {
                                    b7 = 1;
                                }
                                break;
                            default:
                                b7 = -1;
                                break;
                        }
                        if (b7 == 0) {
                            this.zzf = Float.parseFloat(strArrSplit[1].trim());
                        } else if (b7 == 1) {
                            try {
                                this.zzg = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZzz)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzakj zzakjVarZza = null;
                while (true) {
                    String strZzz3 = zzedVar.zzz(charset);
                    if (strZzz3 != null && (zzedVar.zzb() == 0 || zzedVar.zza(charset) != '[')) {
                        if (strZzz3.startsWith("Format:")) {
                            zzakjVarZza = zzakj.zza(strZzz3);
                        } else if (strZzz3.startsWith("Style:")) {
                            if (zzakjVarZza == null) {
                                zzdq.zzf("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzz3));
                            } else {
                                zzakl zzaklVarZzb = zzakl.zzb(strZzz3, zzakjVarZza);
                                if (zzaklVarZzb != null) {
                                    linkedHashMap.put(zzaklVarZzb.zza, zzaklVarZzb);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strZzz)) {
                zzdq.zze("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZzz)) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x028d  */
    /* JADX WARN: Code duplicated, block: B:136:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b2  */
    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        int i9;
        zzed zzedVar;
        int i10;
        Layout.Alignment alignment;
        int i11;
        int i12;
        int i13;
        Integer num;
        int i14;
        zzaki zzakiVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzakiVar.zzd.zzJ(bArr, i7 + i8);
        zzakiVar.zzd.zzL(i7);
        Charset charsetZzC = zzakiVar.zzd.zzC();
        if (charsetZzC == null) {
            charsetZzC = StandardCharsets.UTF_8;
        }
        if (!zzakiVar.zzb) {
            zzakiVar.zze(zzakiVar.zzd, charsetZzC);
        }
        zzed zzedVar2 = zzakiVar.zzd;
        zzakh zzakhVarZza = zzakiVar.zzb ? zzakiVar.zzc : null;
        while (true) {
            String strZzz = zzedVar2.zzz(charsetZzC);
            if (strZzz == null) {
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    List list = (List) arrayList.get(i15);
                    if (!list.isEmpty()) {
                        if (i15 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        zzddVar.zza(new zzajk(list, ((Long) arrayList2.get(i15)).longValue(), ((Long) arrayList2.get(i15 + 1)).longValue() - ((Long) arrayList2.get(i15)).longValue()));
                        i9 = 1;
                    } else if (i15 != 0) {
                        i9 = 1;
                    } else {
                        i15 = 0;
                        if (i15 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        zzddVar.zza(new zzajk(list, ((Long) arrayList2.get(i15)).longValue(), ((Long) arrayList2.get(i15 + 1)).longValue() - ((Long) arrayList2.get(i15)).longValue()));
                        i9 = 1;
                    }
                    i15 += i9;
                }
                return;
            }
            if (strZzz.startsWith("Format:")) {
                zzakhVarZza = zzakh.zza(strZzz);
            } else {
                if (strZzz.startsWith("Dialogue:")) {
                    if (zzakhVarZza == null) {
                        zzdq.zzf("SsaParser", "Skipping dialogue line before complete format: ".concat(strZzz));
                    } else {
                        zzcv.zzd(strZzz.startsWith("Dialogue:"));
                        String[] strArrSplit = strZzz.substring(9).split(",", zzakhVarZza.zze);
                        if (strArrSplit.length != zzakhVarZza.zze) {
                            zzdq.zzf("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strZzz));
                        } else {
                            long jZzd = zzd(strArrSplit[zzakhVarZza.zza]);
                            if (jZzd == -9223372036854775807L) {
                                zzdq.zzf("SsaParser", "Skipping invalid timing: ".concat(strZzz));
                            } else {
                                long jZzd2 = zzd(strArrSplit[zzakhVarZza.zzb]);
                                if (jZzd2 == -9223372036854775807L || jZzd2 <= jZzd) {
                                    zzedVar = zzedVar2;
                                    zzakhVarZza = zzakhVarZza;
                                    zzdq.zzf("SsaParser", "Skipping invalid timing: ".concat(strZzz));
                                } else {
                                    Map map = zzakiVar.zze;
                                    zzakl zzaklVar = (map == null || (i14 = zzakhVarZza.zzc) == -1) ? null : (zzakl) map.get(strArrSplit[i14].trim());
                                    String str = strArrSplit[zzakhVarZza.zzd];
                                    zzakk zzakkVarZza = zzakk.zza(str);
                                    String strReplace = zzakk.zzb(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = zzakiVar.zzf;
                                    float f8 = zzakiVar.zzg;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    zzcl zzclVar = new zzcl();
                                    zzclVar.zzl(spannableString);
                                    if (zzaklVar != null) {
                                        Integer num2 = zzaklVar.zzc;
                                        zzedVar = zzedVar2;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (zzaklVar.zzj == 3 && (num = zzaklVar.zzd) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f9 = zzaklVar.zze;
                                        if (f9 != -3.4028235E38f && f8 != -3.4028235E38f) {
                                            zzclVar.zzn(f9 / f8, 1);
                                        }
                                        if (!zzaklVar.zzf) {
                                            i12 = 0;
                                            i13 = 33;
                                            if (zzaklVar.zzg) {
                                                i10 = 2;
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                            if (zzaklVar.zzh) {
                                                spannableString.setSpan(new UnderlineSpan(), i12, spannableString.length(), i13);
                                            }
                                            if (zzaklVar.zzi) {
                                                spannableString.setSpan(new StrikethroughSpan(), i12, spannableString.length(), i13);
                                            }
                                        } else if (zzaklVar.zzg) {
                                            i12 = 0;
                                            i13 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i12 = 0;
                                            i13 = 33;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        i10 = 2;
                                        if (zzaklVar.zzh) {
                                            spannableString.setSpan(new UnderlineSpan(), i12, spannableString.length(), i13);
                                        }
                                        if (zzaklVar.zzi) {
                                            spannableString.setSpan(new StrikethroughSpan(), i12, spannableString.length(), i13);
                                        }
                                    } else {
                                        zzedVar = zzedVar2;
                                        zzakhVarZza = zzakhVarZza;
                                        jZzd2 = jZzd2;
                                        i10 = 2;
                                    }
                                    int i16 = zzakkVarZza.zza;
                                    if (i16 == -1) {
                                        i16 = zzaklVar != null ? zzaklVar.zzb : -1;
                                    }
                                    switch (i16) {
                                        case 0:
                                        default:
                                            AbstractC0486a1.k(i16, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    zzclVar.zzm(alignment);
                                    int i17 = Integer.MIN_VALUE;
                                    switch (i16) {
                                        case 0:
                                        default:
                                            AbstractC0486a1.k(i16, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            i11 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i11 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i11 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i11 = i10;
                                            break;
                                    }
                                    zzclVar.zzi(i11);
                                    switch (i16) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            AbstractC0486a1.k(i16, "Unknown alignment: ", "SsaParser");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i17 = i10;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i17 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i17 = 0;
                                            break;
                                    }
                                    zzclVar.zzf(i17);
                                    PointF pointF = zzakkVarZza.zzb;
                                    if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                        zzclVar.zzh(zzb(zzclVar.zzb()));
                                        zzclVar.zze(zzb(zzclVar.zza()), 0);
                                    } else {
                                        zzclVar.zzh(pointF.x / f7);
                                        zzclVar.zze(zzakkVarZza.zzb.y / f8, 0);
                                    }
                                    zzcn zzcnVarZzp = zzclVar.zzp();
                                    int iZzc = zzc(jZzd2, arrayList2, arrayList);
                                    for (int iZzc2 = zzc(jZzd, arrayList2, arrayList); iZzc2 < iZzc; iZzc2++) {
                                        ((List) arrayList.get(iZzc2)).add(zzcnVarZzp);
                                    }
                                }
                            }
                        }
                    }
                    zzedVar = zzedVar2;
                    zzakhVarZza = zzakhVarZza;
                } else {
                    zzedVar = zzedVar2;
                    zzakhVarZza = zzakhVarZza;
                }
                zzakiVar = this;
                charsetZzC = charsetZzC;
                zzedVar2 = zzedVar;
                zzakhVarZza = zzakhVarZza;
            }
        }
    }

    public zzaki(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzed();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzB = zzen.zzB((byte[]) list.get(0));
        zzcv.zzd(strZzB.startsWith("Format:"));
        zzakh zzakhVarZza = zzakh.zza(strZzB);
        zzakhVarZza.getClass();
        this.zzc = zzakhVarZza;
        zze(new zzed((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
