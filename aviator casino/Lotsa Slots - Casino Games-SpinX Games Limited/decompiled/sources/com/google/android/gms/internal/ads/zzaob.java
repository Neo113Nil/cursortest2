package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaob implements com.google.android.gms.internal.ads.zzanl {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final com.google.android.gms.internal.ads.zzaoa zzc;
    private final com.google.android.gms.internal.ads.zzet zzd;
    private java.util.Map zze;
    private float zzf;
    private float zzg;

    public zzaob() {
        this(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0050, code lost:
    
        if (r3.equals("playresx") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(com.google.android.gms.internal.ads.zzet zzetVar, java.nio.charset.Charset charset) {
        while (true) {
            java.lang.String zzN = zzetVar.zzN(charset);
            if (zzN == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(zzN)) {
                while (true) {
                    java.lang.String zzN2 = zzetVar.zzN(charset);
                    if (zzN2 != null && (zzetVar.zzd() == 0 || zzetVar.zzp(charset) != 91)) {
                        java.lang.String[] split = zzN2.split(":");
                        if (split.length == 2) {
                            char c = 0;
                            java.lang.String zza2 = com.google.android.gms.internal.ads.zzgss.zza(split[0].trim());
                            switch (zza2.hashCode()) {
                                case 1879649548:
                                    break;
                                case 1879649549:
                                    if (zza2.equals("playresy")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                this.zzf = java.lang.Float.parseFloat(split[1].trim());
                            } else if (c == 1) {
                                try {
                                    this.zzg = java.lang.Float.parseFloat(split[1].trim());
                                } catch (java.lang.NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(zzN)) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                com.google.android.gms.internal.ads.zzaoc zzaocVar = null;
                while (true) {
                    java.lang.String zzN3 = zzetVar.zzN(charset);
                    if (zzN3 != null && (zzetVar.zzd() == 0 || zzetVar.zzp(charset) != 91)) {
                        if (zzN3.startsWith("Format:")) {
                            zzaocVar = com.google.android.gms.internal.ads.zzaoc.zza(zzN3);
                        } else if (zzN3.startsWith("Style:")) {
                            if (zzaocVar == null) {
                                com.google.android.gms.internal.ads.zzeg.zzc("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(zzN3));
                            } else {
                                com.google.android.gms.internal.ads.zzaoe zza3 = com.google.android.gms.internal.ads.zzaoe.zza(zzN3, zzaocVar);
                                if (zza3 != null) {
                                    linkedHashMap.put(zza3.zza, zza3);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(zzN)) {
                com.google.android.gms.internal.ads.zzeg.zzb("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(zzN)) {
                return;
            }
        }
    }

    private static long zzc(java.lang.String str) {
        java.util.regex.Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        java.lang.String group = matcher.group(1);
        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
        long parseLong = java.lang.Long.parseLong(group) * 3600000000L;
        long parseLong2 = java.lang.Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (java.lang.Long.parseLong(matcher.group(3)) * 1000000) + (java.lang.Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float zzd(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zze(long j, java.util.List list, java.util.List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((java.lang.Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((java.lang.Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, java.lang.Long.valueOf(j));
        list2.add(i, i == 0 ? new java.util.ArrayList() : new java.util.ArrayList((java.util.Collection) list2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c1  */
    @Override // com.google.android.gms.internal.ads.zzanl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzank zzankVar, com.google.android.gms.internal.ads.zzdt zzdtVar) {
        com.google.android.gms.internal.ads.zzaoa zzaoaVar;
        int i3;
        java.nio.charset.Charset charset;
        com.google.android.gms.internal.ads.zzaoa zzaoaVar2;
        com.google.android.gms.internal.ads.zzet zzetVar;
        int parseInt;
        long zzc;
        long j;
        android.text.Layout.Alignment alignment;
        int i4;
        int i5;
        int i6;
        java.lang.Integer num;
        int i7;
        com.google.android.gms.internal.ads.zzaob zzaobVar = this;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.google.android.gms.internal.ads.zzet zzetVar2 = zzaobVar.zzd;
        zzetVar2.zzb(bArr, i + i2);
        zzetVar2.zzh(i);
        java.nio.charset.Charset zzR = zzetVar2.zzR();
        if (zzR == null) {
            zzR = java.nio.charset.StandardCharsets.UTF_8;
        }
        if (zzaobVar.zzb) {
            zzaoaVar = zzaobVar.zzc;
        } else {
            zzaobVar.zzb(zzetVar2, zzR);
            zzaoaVar = null;
        }
        while (true) {
            java.lang.String zzN = zzetVar2.zzN(zzR);
            if (zzN == null) {
                int i8 = 0;
                while (i8 < arrayList.size()) {
                    java.util.List list = (java.util.List) arrayList.get(i8);
                    if (list.isEmpty()) {
                        if (i8 != 0) {
                            i3 = 1;
                            i8 += i3;
                        } else {
                            i8 = 0;
                        }
                    }
                    if (i8 == arrayList.size() - 1) {
                        throw new java.lang.IllegalStateException();
                    }
                    long longValue = ((java.lang.Long) arrayList2.get(i8)).longValue();
                    zzdtVar.zza(new com.google.android.gms.internal.ads.zzand(list, longValue, ((java.lang.Long) arrayList2.get(i8 + 1)).longValue() - longValue));
                    i3 = 1;
                    i8 += i3;
                }
                return;
            }
            if (zzN.startsWith("Format:")) {
                zzaoaVar = com.google.android.gms.internal.ads.zzaoa.zza(zzN);
            } else {
                if (zzN.startsWith("Dialogue:")) {
                    if (zzaoaVar == null) {
                        com.google.android.gms.internal.ads.zzeg.zzc("SsaParser", "Skipping dialogue line before complete format: ".concat(zzN));
                    } else {
                        com.google.android.gms.internal.ads.zzgtj.zza(zzN.startsWith("Dialogue:"));
                        java.lang.String substring = zzN.substring(9);
                        int i9 = zzaoaVar.zzf;
                        java.lang.String[] split = substring.split(",", i9);
                        if (split.length != i9) {
                            com.google.android.gms.internal.ads.zzeg.zzc("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(zzN));
                        } else {
                            int i10 = zzaoaVar.zza;
                            if (i10 != -1) {
                                try {
                                    parseInt = java.lang.Integer.parseInt(split[i10].trim());
                                } catch (java.lang.RuntimeException unused) {
                                    java.lang.String str = split[zzaoaVar.zza];
                                    java.lang.String.valueOf(str);
                                    com.google.android.gms.internal.ads.zzeg.zzc("SsaParser", "Fail to parse layer: ".concat(java.lang.String.valueOf(str)));
                                }
                                zzc = zzc(split[zzaoaVar.zzb]);
                                if (zzc != -9223372036854775807L) {
                                    com.google.android.gms.internal.ads.zzeg.zzc("SsaParser", "Skipping invalid timing: ".concat(zzN));
                                } else {
                                    long zzc2 = zzc(split[zzaoaVar.zzc]);
                                    if (zzc2 == -9223372036854775807L || zzc2 <= zzc) {
                                        charset = zzR;
                                        zzaoaVar2 = zzaoaVar;
                                        zzetVar = zzetVar2;
                                        com.google.android.gms.internal.ads.zzeg.zzc("SsaParser", "Skipping invalid timing: ".concat(zzN));
                                    } else {
                                        java.util.Map map = zzaobVar.zze;
                                        com.google.android.gms.internal.ads.zzaoe zzaoeVar = (map == null || (i7 = zzaoaVar.zzd) == -1) ? null : (com.google.android.gms.internal.ads.zzaoe) map.get(split[i7].trim());
                                        java.lang.String str2 = split[zzaoaVar.zze];
                                        com.google.android.gms.internal.ads.zzaod zza2 = com.google.android.gms.internal.ads.zzaod.zza(str2);
                                        charset = zzR;
                                        java.lang.String replace = com.google.android.gms.internal.ads.zzaod.zzb(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f = zzaobVar.zzf;
                                        float f2 = zzaobVar.zzg;
                                        android.text.SpannableString spannableString = new android.text.SpannableString(replace);
                                        com.google.android.gms.internal.ads.zzcw zzcwVar = new com.google.android.gms.internal.ads.zzcw();
                                        zzcwVar.zza(spannableString);
                                        zzcwVar.zzq(parseInt);
                                        if (zzaoeVar != null) {
                                            java.lang.Integer num2 = zzaoeVar.zzc;
                                            zzaoaVar2 = zzaoaVar;
                                            if (num2 != null) {
                                                zzetVar = zzetVar2;
                                                j = zzc2;
                                                spannableString.setSpan(new android.text.style.ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                zzetVar = zzetVar2;
                                                j = zzc2;
                                            }
                                            if (zzaoeVar.zzj == 3 && (num = zzaoeVar.zzd) != null) {
                                                spannableString.setSpan(new android.text.style.BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f3 = zzaoeVar.zze;
                                            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                                zzcwVar.zzl(f3 / f2, 1);
                                            }
                                            boolean z = zzaoeVar.zzf;
                                            if (z && zzaoeVar.zzg) {
                                                i5 = 33;
                                                i6 = 0;
                                                spannableString.setSpan(new android.text.style.StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i5 = 33;
                                                i6 = 0;
                                                if (z) {
                                                    spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (zzaoeVar.zzg) {
                                                    spannableString.setSpan(new android.text.style.StyleSpan(2), 0, spannableString.length(), 33);
                                                    if (zzaoeVar.zzh) {
                                                        spannableString.setSpan(new android.text.style.UnderlineSpan(), i6, spannableString.length(), i5);
                                                    }
                                                    if (zzaoeVar.zzi) {
                                                        spannableString.setSpan(new android.text.style.StrikethroughSpan(), i6, spannableString.length(), i5);
                                                    }
                                                }
                                            }
                                            if (zzaoeVar.zzh) {
                                            }
                                            if (zzaoeVar.zzi) {
                                            }
                                        } else {
                                            zzaoaVar2 = zzaoaVar;
                                            zzetVar = zzetVar2;
                                            j = zzc2;
                                        }
                                        int i11 = zza2.zza;
                                        if (i11 == -1) {
                                            i11 = zzaoeVar != null ? zzaoeVar.zzb : -1;
                                        }
                                        switch (i11) {
                                            case 0:
                                            default:
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i11).length() + 19);
                                                sb.append("Unknown alignment: ");
                                                sb.append(i11);
                                                com.google.android.gms.internal.ads.zzeg.zzc("SsaParser", sb.toString());
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = android.text.Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        zzcwVar.zzd(alignment);
                                        int i12 = Integer.MIN_VALUE;
                                        switch (i11) {
                                            case 0:
                                            default:
                                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i11).length() + 19);
                                                sb2.append("Unknown alignment: ");
                                                sb2.append(i11);
                                                com.google.android.gms.internal.ads.zzeg.zzc("SsaParser", sb2.toString());
                                            case -1:
                                                i4 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i4 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i4 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i4 = 2;
                                                break;
                                        }
                                        zzcwVar.zzj(i4);
                                        switch (i11) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i11).length() + 19);
                                                sb3.append("Unknown alignment: ");
                                                sb3.append(i11);
                                                com.google.android.gms.internal.ads.zzeg.zzc("SsaParser", sb3.toString());
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i12 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i12 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i12 = 0;
                                                break;
                                        }
                                        zzcwVar.zzg(i12);
                                        android.graphics.PointF pointF = zza2.zzb;
                                        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                            zzcwVar.zzi(zzd(zzcwVar.zzk()));
                                            zzcwVar.zzf(zzd(zzcwVar.zzh()), 0);
                                        } else {
                                            zzcwVar.zzi(pointF.x / f);
                                            zzcwVar.zzf(pointF.y / f2, 0);
                                        }
                                        com.google.android.gms.internal.ads.zzcx zzr = zzcwVar.zzr();
                                        int zze = zze(j, arrayList2, arrayList);
                                        for (int zze2 = zze(zzc, arrayList2, arrayList); zze2 < zze; zze2++) {
                                            ((java.util.List) arrayList.get(zze2)).add(zzr);
                                        }
                                    }
                                    zzaobVar = this;
                                    zzR = charset;
                                    zzaoaVar = zzaoaVar2;
                                    zzetVar2 = zzetVar;
                                }
                            }
                            parseInt = 0;
                            zzc = zzc(split[zzaoaVar.zzb]);
                            if (zzc != -9223372036854775807L) {
                            }
                        }
                    }
                }
                charset = zzR;
                zzaoaVar2 = zzaoaVar;
                zzetVar = zzetVar2;
                zzaobVar = this;
                zzR = charset;
                zzaoaVar = zzaoaVar2;
                zzetVar2 = zzetVar;
            }
        }
    }

    public zzaob(java.util.List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new com.google.android.gms.internal.ads.zzet();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        java.lang.String zzj = com.google.android.gms.internal.ads.zzfl.zzj((byte[]) list.get(0));
        com.google.android.gms.internal.ads.zzgtj.zza(zzj.startsWith("Format:"));
        com.google.android.gms.internal.ads.zzaoa zza2 = com.google.android.gms.internal.ads.zzaoa.zza(zzj);
        zza2.getClass();
        this.zzc = zza2;
        zzb(new com.google.android.gms.internal.ads.zzet((byte[]) list.get(1)), java.nio.charset.StandardCharsets.UTF_8);
    }
}
