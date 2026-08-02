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

/* loaded from: classes.dex */
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
        String group = matcher.group(1);
        int i7 = zzen.zza;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0050, code lost:
    
        if (r3.equals("playresx") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zze(zzed zzedVar, Charset charset) {
        while (true) {
            String zzz = zzedVar.zzz(charset);
            if (zzz == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(zzz)) {
                while (true) {
                    String zzz2 = zzedVar.zzz(charset);
                    if (zzz2 != null && (zzedVar.zzb() == 0 || zzedVar.zza(charset) != '[')) {
                        String[] split = zzz2.split(":");
                        if (split.length == 2) {
                            char c3 = 0;
                            String zza2 = zzfsn.zza(split[0].trim());
                            switch (zza2.hashCode()) {
                                case 1879649548:
                                    break;
                                case 1879649549:
                                    if (zza2.equals("playresy")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            if (c3 == 0) {
                                this.zzf = Float.parseFloat(split[1].trim());
                            } else if (c3 == 1) {
                                try {
                                    this.zzg = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(zzz)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzakj zzakjVar = null;
                while (true) {
                    String zzz3 = zzedVar.zzz(charset);
                    if (zzz3 != null && (zzedVar.zzb() == 0 || zzedVar.zza(charset) != '[')) {
                        if (zzz3.startsWith("Format:")) {
                            zzakjVar = zzakj.zza(zzz3);
                        } else if (zzz3.startsWith("Style:")) {
                            if (zzakjVar == null) {
                                zzdq.zzf("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(zzz3));
                            } else {
                                zzakl zzb = zzakl.zzb(zzz3, zzakjVar);
                                if (zzb != null) {
                                    linkedHashMap.put(zzb.zza, zzb);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(zzz)) {
                zzdq.zze("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(zzz)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b2  */
    @Override // com.google.android.gms.internal.ads.zzajs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        int i9;
        Charset charset;
        zzed zzedVar;
        zzakh zzakhVar;
        long j;
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
        Charset zzC = zzakiVar.zzd.zzC();
        if (zzC == null) {
            zzC = StandardCharsets.UTF_8;
        }
        if (!zzakiVar.zzb) {
            zzakiVar.zze(zzakiVar.zzd, zzC);
        }
        zzed zzedVar2 = zzakiVar.zzd;
        zzakh zzakhVar2 = zzakiVar.zzb ? zzakiVar.zzc : null;
        while (true) {
            String zzz = zzedVar2.zzz(zzC);
            if (zzz == null) {
                int i15 = 0;
                while (i15 < arrayList.size()) {
                    List list = (List) arrayList.get(i15);
                    if (list.isEmpty()) {
                        if (i15 != 0) {
                            i9 = 1;
                            i15 += i9;
                        } else {
                            i15 = 0;
                        }
                    }
                    if (i15 == arrayList.size() - 1) {
                        throw new IllegalStateException();
                    }
                    zzddVar.zza(new zzajk(list, ((Long) arrayList2.get(i15)).longValue(), ((Long) arrayList2.get(i15 + 1)).longValue() - ((Long) arrayList2.get(i15)).longValue()));
                    i9 = 1;
                    i15 += i9;
                }
                return;
            }
            if (zzz.startsWith("Format:")) {
                zzakhVar2 = zzakh.zza(zzz);
            } else {
                if (zzz.startsWith("Dialogue:")) {
                    if (zzakhVar2 == null) {
                        zzdq.zzf("SsaParser", "Skipping dialogue line before complete format: ".concat(zzz));
                    } else {
                        zzcv.zzd(zzz.startsWith("Dialogue:"));
                        String[] split = zzz.substring(9).split(",", zzakhVar2.zze);
                        if (split.length != zzakhVar2.zze) {
                            zzdq.zzf("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(zzz));
                        } else {
                            long zzd = zzd(split[zzakhVar2.zza]);
                            if (zzd == -9223372036854775807L) {
                                zzdq.zzf("SsaParser", "Skipping invalid timing: ".concat(zzz));
                            } else {
                                long zzd2 = zzd(split[zzakhVar2.zzb]);
                                if (zzd2 == -9223372036854775807L || zzd2 <= zzd) {
                                    charset = zzC;
                                    zzedVar = zzedVar2;
                                    zzakhVar = zzakhVar2;
                                    zzdq.zzf("SsaParser", "Skipping invalid timing: ".concat(zzz));
                                } else {
                                    Map map = zzakiVar.zze;
                                    zzakl zzaklVar = (map == null || (i14 = zzakhVar2.zzc) == -1) ? null : (zzakl) map.get(split[i14].trim());
                                    String str = split[zzakhVar2.zzd];
                                    zzakk zza2 = zzakk.zza(str);
                                    String replace = zzakk.zzb(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = zzakiVar.zzf;
                                    float f8 = zzakiVar.zzg;
                                    SpannableString spannableString = new SpannableString(replace);
                                    zzcl zzclVar = new zzcl();
                                    zzclVar.zzl(spannableString);
                                    charset = zzC;
                                    if (zzaklVar != null) {
                                        Integer num2 = zzaklVar.zzc;
                                        zzedVar = zzedVar2;
                                        if (num2 != null) {
                                            zzakhVar = zzakhVar2;
                                            j = zzd2;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            zzakhVar = zzakhVar2;
                                            j = zzd2;
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
                                                if (zzaklVar.zzh) {
                                                    spannableString.setSpan(new UnderlineSpan(), i12, spannableString.length(), i13);
                                                }
                                                if (zzaklVar.zzi) {
                                                    spannableString.setSpan(new StrikethroughSpan(), i12, spannableString.length(), i13);
                                                }
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
                                        }
                                        if (zzaklVar.zzi) {
                                        }
                                    } else {
                                        zzedVar = zzedVar2;
                                        zzakhVar = zzakhVar2;
                                        j = zzd2;
                                        i10 = 2;
                                    }
                                    int i16 = zza2.zza;
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
                                    PointF pointF = zza2.zzb;
                                    if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                        zzclVar.zzh(zzb(zzclVar.zzb()));
                                        zzclVar.zze(zzb(zzclVar.zza()), 0);
                                    } else {
                                        zzclVar.zzh(pointF.x / f7);
                                        zzclVar.zze(zza2.zzb.y / f8, 0);
                                    }
                                    zzcn zzp = zzclVar.zzp();
                                    int zzc = zzc(j, arrayList2, arrayList);
                                    for (int zzc2 = zzc(zzd, arrayList2, arrayList); zzc2 < zzc; zzc2++) {
                                        ((List) arrayList.get(zzc2)).add(zzp);
                                    }
                                }
                                zzakiVar = this;
                                zzC = charset;
                                zzedVar2 = zzedVar;
                                zzakhVar2 = zzakhVar;
                            }
                        }
                    }
                }
                charset = zzC;
                zzedVar = zzedVar2;
                zzakhVar = zzakhVar2;
                zzakiVar = this;
                zzC = charset;
                zzedVar2 = zzedVar;
                zzakhVar2 = zzakhVar;
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
        String zzB = zzen.zzB((byte[]) list.get(0));
        zzcv.zzd(zzB.startsWith("Format:"));
        zzakh zza2 = zzakh.zza(zzB);
        zza2.getClass();
        this.zzc = zza2;
        zze(new zzed((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
