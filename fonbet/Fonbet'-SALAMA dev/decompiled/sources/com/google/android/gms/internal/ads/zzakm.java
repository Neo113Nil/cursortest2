package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
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
        String group = matcher.group(i7 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i7 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i7 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i7 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        String str;
        char c3;
        char c4;
        int i9;
        zzcn zzp;
        zzakm zzakmVar = this;
        zzakmVar.zze.zzJ(bArr, i7 + i8);
        zzakmVar.zze.zzL(i7);
        Charset zzC = zzakmVar.zze.zzC();
        if (zzC == null) {
            zzC = StandardCharsets.UTF_8;
        }
        while (true) {
            String zzz = zzakmVar.zze.zzz(zzC);
            if (zzz == null) {
                return;
            }
            if (zzz.length() != 0) {
                try {
                    Integer.parseInt(zzz);
                    String zzz2 = zzakmVar.zze.zzz(zzC);
                    if (zzz2 == null) {
                        zzdq.zzf("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(zzz2);
                    if (matcher.matches()) {
                        long zzc = zzc(matcher, 1);
                        long zzc2 = zzc(matcher, 6);
                        int i10 = 0;
                        zzakmVar.zzc.setLength(0);
                        zzakmVar.zzd.clear();
                        String zzz3 = zzakmVar.zze.zzz(zzC);
                        while (!TextUtils.isEmpty(zzz3)) {
                            if (zzakmVar.zzc.length() > 0) {
                                zzakmVar.zzc.append("<br>");
                            }
                            StringBuilder sb = zzakmVar.zzc;
                            ArrayList arrayList = zzakmVar.zzd;
                            String trim = zzz3.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = zzb.matcher(trim);
                            int i11 = i10;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i11;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i11 += length;
                            }
                            sb.append(sb2.toString());
                            zzz3 = zzakmVar.zze.zzz(zzC);
                            i10 = 0;
                        }
                        Spanned fromHtml = Html.fromHtml(zzakmVar.zzc.toString());
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
                        zzclVar.zzl(fromHtml);
                        if (str == null) {
                            zzp = zzclVar.zzp();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -685620617:
                                    if (str.equals("{\\an4}")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -685620555:
                                    if (str.equals("{\\an6}")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            if (c3 == 0 || c3 == 1 || c3 == 2) {
                                zzclVar.zzi(0);
                            } else if (c3 == 3 || c3 == 4 || c3 == 5) {
                                zzclVar.zzi(2);
                            } else {
                                zzclVar.zzi(1);
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c4 = 0;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -685620679:
                                    if (str.equals("{\\an2}")) {
                                        c4 = 1;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c4 = 2;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c4 = 3;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -685620493:
                                    if (str.equals("{\\an8}")) {
                                        c4 = 4;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c4 = 5;
                                        break;
                                    }
                                    c4 = 65535;
                                    break;
                                default:
                                    c4 = 65535;
                                    break;
                            }
                            if (c4 == 0 || c4 == 1) {
                                i9 = 2;
                            } else if (c4 != 2) {
                                if (c4 == 3 || c4 == 4 || c4 == 5) {
                                    zzclVar.zzf(0);
                                } else {
                                    zzclVar.zzf(1);
                                }
                                zzclVar.zzh(zzb(zzclVar.zzb()));
                                zzclVar.zze(zzb(zzclVar.zza()), 0);
                                zzp = zzclVar.zzp();
                            } else {
                                i9 = 2;
                            }
                            zzclVar.zzf(i9);
                            zzclVar.zzh(zzb(zzclVar.zzb()));
                            zzclVar.zze(zzb(zzclVar.zza()), 0);
                            zzp = zzclVar.zzp();
                        }
                        zzddVar.zza(new zzajk(zzfwh.zzo(zzp), zzc, zzc2 - zzc));
                    } else {
                        zzdq.zzf("SubripParser", "Skipping invalid timing: ".concat(zzz2));
                    }
                } catch (NumberFormatException unused) {
                    zzdq.zzf("SubripParser", "Skipping invalid index: ".concat(zzz));
                }
            }
            zzakmVar = this;
        }
    }
}
