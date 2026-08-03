package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaof implements com.google.android.gms.internal.ads.zzanl {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("\\{\\\\.*?\\}");
    private final java.lang.StringBuilder zzc = new java.lang.StringBuilder();
    private final java.util.ArrayList zzd = new java.util.ArrayList();
    private final com.google.android.gms.internal.ads.zzet zze = new com.google.android.gms.internal.ads.zzet();

    public static float zzb(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private static long zzc(java.util.regex.Matcher matcher, int i) {
        java.lang.String group = matcher.group(i + 1);
        long parseLong = group != null ? java.lang.Long.parseLong(group) * 3600000 : 0L;
        java.lang.String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = parseLong + (java.lang.Long.parseLong(group2) * 60000);
        java.lang.String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = parseLong2 + (java.lang.Long.parseLong(group3) * 1000);
        java.lang.String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += java.lang.Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzank zzankVar, com.google.android.gms.internal.ads.zzdt zzdtVar) {
        com.google.android.gms.internal.ads.zzet zzetVar;
        java.lang.String str;
        char c;
        char c2;
        com.google.android.gms.internal.ads.zzcx zzr;
        com.google.android.gms.internal.ads.zzaof zzaofVar = this;
        com.google.android.gms.internal.ads.zzet zzetVar2 = zzaofVar.zze;
        zzetVar2.zzb(bArr, i + i2);
        zzetVar2.zzh(i);
        java.nio.charset.Charset zzR = zzetVar2.zzR();
        if (zzR == null) {
            zzR = java.nio.charset.StandardCharsets.UTF_8;
        }
        while (true) {
            java.lang.String zzN = zzetVar2.zzN(zzR);
            if (zzN == null) {
                return;
            }
            if (zzN.isEmpty()) {
                zzetVar = zzetVar2;
            } else {
                try {
                    java.lang.Integer.parseInt(zzN);
                    com.google.android.gms.internal.ads.zzet zzetVar3 = zzaofVar.zze;
                    java.lang.String zzN2 = zzetVar3.zzN(zzR);
                    if (zzN2 == null) {
                        com.google.android.gms.internal.ads.zzeg.zzc("SubripParser", "Unexpected end");
                        return;
                    }
                    java.util.regex.Matcher matcher = zza.matcher(zzN2);
                    if (matcher.matches()) {
                        long zzc = zzc(matcher, 1);
                        long zzc2 = zzc(matcher, 6);
                        java.lang.StringBuilder sb = zzaofVar.zzc;
                        sb.setLength(0);
                        java.util.ArrayList arrayList = zzaofVar.zzd;
                        arrayList.clear();
                        for (java.lang.String zzN3 = zzetVar3.zzN(zzR); !android.text.TextUtils.isEmpty(zzN3); zzN3 = zzetVar3.zzN(zzR)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            java.lang.String trim = zzN3.trim();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(trim);
                            java.util.regex.Matcher matcher2 = zzb.matcher(trim);
                            int i3 = 0;
                            while (matcher2.find()) {
                                java.lang.String group = matcher2.group();
                                arrayList.add(group);
                                int start = matcher2.start() - i3;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i3 += length;
                                zzetVar2 = zzetVar2;
                            }
                            sb.append(sb2.toString());
                        }
                        zzetVar = zzetVar2;
                        android.text.Spanned fromHtml = android.text.Html.fromHtml(sb.toString());
                        int i4 = 0;
                        while (true) {
                            if (i4 < arrayList.size()) {
                                str = (java.lang.String) arrayList.get(i4);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i4++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        com.google.android.gms.internal.ads.zzcw zzcwVar = new com.google.android.gms.internal.ads.zzcw();
                        zzcwVar.zza(fromHtml);
                        if (str == null) {
                            zzr = zzcwVar.zzr();
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620617:
                                    if (str.equals("{\\an4}")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620555:
                                    if (str.equals("{\\an6}")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0 || c == 1 || c == 2) {
                                zzcwVar.zzj(0);
                            } else if (c == 3 || c == 4 || c == 5) {
                                zzcwVar.zzj(2);
                            } else {
                                zzcwVar.zzj(1);
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (str.equals("{\\an1}")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620679:
                                    if (str.equals("{\\an2}")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620648:
                                    if (str.equals("{\\an3}")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620524:
                                    if (str.equals("{\\an7}")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620493:
                                    if (str.equals("{\\an8}")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -685620462:
                                    if (str.equals("{\\an9}")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0 || c2 == 1 || c2 == 2) {
                                zzcwVar.zzg(2);
                            } else if (c2 == 3 || c2 == 4 || c2 == 5) {
                                zzcwVar.zzg(0);
                            } else {
                                zzcwVar.zzg(1);
                            }
                            zzcwVar.zzi(zzb(zzcwVar.zzk()));
                            zzcwVar.zzf(zzb(zzcwVar.zzh()), 0);
                            zzr = zzcwVar.zzr();
                        }
                        zzdtVar.zza(new com.google.android.gms.internal.ads.zzand(com.google.android.gms.internal.ads.zzgwm.zzj(zzr), zzc, zzc2 - zzc));
                    } else {
                        zzetVar = zzetVar2;
                        com.google.android.gms.internal.ads.zzeg.zzc("SubripParser", "Skipping invalid timing: ".concat(zzN2));
                    }
                } catch (java.lang.NumberFormatException unused) {
                    zzetVar = zzetVar2;
                    com.google.android.gms.internal.ads.zzeg.zzc("SubripParser", "Skipping invalid index: ".concat(zzN));
                }
            }
            zzaofVar = this;
            zzetVar2 = zzetVar;
        }
    }
}
