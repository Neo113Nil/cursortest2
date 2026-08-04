package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzakm implements zzajs {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzed zze = new zzed();

    public static float zzb(int i7) {
        if (i7 == 0) {
            return 0.08f;
        }
        if (i7 == 1) {
            return 0.5f;
        }
        if (i7 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i7) {
        String strGroup = matcher.group(i7 + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i7 + 2);
        strGroup2.getClass();
        long j3 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i7 + 3);
        strGroup3.getClass();
        long j7 = (Long.parseLong(strGroup3) * 1000) + j3;
        String strGroup4 = matcher.group(i7 + 4);
        if (strGroup4 != null) {
            j7 += Long.parseLong(strGroup4);
        }
        return j7 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0197  */
    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        String str;
        byte b7;
        byte b8;
        int i9;
        zzcn zzcnVarZzp;
        zzakm zzakmVar = this;
        zzakmVar.zze.zzJ(bArr, i7 + i8);
        zzakmVar.zze.zzL(i7);
        Charset charsetZzC = zzakmVar.zze.zzC();
        if (charsetZzC == null) {
            charsetZzC = StandardCharsets.UTF_8;
        }
        while (true) {
            String strZzz = zzakmVar.zze.zzz(charsetZzC);
            if (strZzz == null) {
                return;
            }
            if (strZzz.length() != 0) {
                try {
                    Integer.parseInt(strZzz);
                    String strZzz2 = zzakmVar.zze.zzz(charsetZzC);
                    if (strZzz2 == null) {
                        zzdq.zzf("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(strZzz2);
                    if (matcher.matches()) {
                        long jZzc = zzc(matcher, 1);
                        long jZzc2 = zzc(matcher, 6);
                        int i10 = 0;
                        zzakmVar.zzc.setLength(0);
                        zzakmVar.zzd.clear();
                        String strZzz3 = zzakmVar.zze.zzz(charsetZzC);
                        while (!TextUtils.isEmpty(strZzz3)) {
                            if (zzakmVar.zzc.length() > 0) {
                                zzakmVar.zzc.append("<br>");
                            }
                            StringBuilder sb = zzakmVar.zzc;
                            ArrayList arrayList = zzakmVar.zzd;
                            String strTrim = strZzz3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = zzb.matcher(strTrim);
                            int i11 = i10;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i11;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i11 += length;
                            }
                            sb.append(sb2.toString());
                            strZzz3 = zzakmVar.zze.zzz(charsetZzC);
                            i10 = 0;
                        }
                        Spanned spannedFromHtml = Html.fromHtml(zzakmVar.zzc.toString());
                        int i12 = 0;
                        while (true) {
                            if (i12 < zzakmVar.zzd.size()) {
                                str = (String) zzakmVar.zzd.get(i12);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i12++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcl zzclVar = new zzcl();
                        zzclVar.zzl(spannedFromHtml);
                        if (str == null) {
                            zzcnVarZzp = zzclVar.zzp();
                        } else {
                            switch (str) {
                                case "{\an1}":
                                    b7 = 0;
                                    break;
                                case "{\an3}":
                                    b7 = 3;
                                    break;
                                case "{\an4}":
                                    b7 = 1;
                                    break;
                                case "{\an6}":
                                    b7 = 4;
                                    break;
                                case "{\an7}":
                                    b7 = 2;
                                    break;
                                case "{\an9}":
                                    b7 = 5;
                                    break;
                                default:
                                    b7 = -1;
                                    break;
                            }
                            if (b7 == 0 || b7 == 1 || b7 == 2) {
                                zzclVar.zzi(0);
                            } else if (b7 == 3 || b7 == 4 || b7 == 5) {
                                zzclVar.zzi(2);
                            } else {
                                zzclVar.zzi(1);
                            }
                            switch (str) {
                                case "{\an1}":
                                    b8 = 0;
                                    break;
                                case "{\an2}":
                                    b8 = 1;
                                    break;
                                case "{\an3}":
                                    b8 = 2;
                                    break;
                                case "{\an7}":
                                    b8 = 3;
                                    break;
                                case "{\an8}":
                                    b8 = 4;
                                    break;
                                case "{\an9}":
                                    b8 = 5;
                                    break;
                                default:
                                    b8 = -1;
                                    break;
                            }
                            if (b8 == 0 || b8 == 1) {
                                i9 = 2;
                            } else {
                                if (b8 == 2) {
                                    i9 = 2;
                                } else if (b8 == 3 || b8 == 4 || b8 == 5) {
                                    zzclVar.zzf(0);
                                } else {
                                    zzclVar.zzf(1);
                                }
                                zzclVar.zzh(zzb(zzclVar.zzb()));
                                zzclVar.zze(zzb(zzclVar.zza()), 0);
                                zzcnVarZzp = zzclVar.zzp();
                            }
                            zzclVar.zzf(i9);
                            zzclVar.zzh(zzb(zzclVar.zzb()));
                            zzclVar.zze(zzb(zzclVar.zza()), 0);
                            zzcnVarZzp = zzclVar.zzp();
                        }
                        zzddVar.zza(new zzajk(zzfwh.zzo(zzcnVarZzp), jZzc, jZzc2 - jZzc));
                    } else {
                        zzdq.zzf("SubripParser", "Skipping invalid timing: ".concat(strZzz2));
                    }
                } catch (NumberFormatException unused) {
                    zzdq.zzf("SubripParser", "Skipping invalid index: ".concat(strZzz));
                }
            }
            zzakmVar = this;
        }
    }
}
