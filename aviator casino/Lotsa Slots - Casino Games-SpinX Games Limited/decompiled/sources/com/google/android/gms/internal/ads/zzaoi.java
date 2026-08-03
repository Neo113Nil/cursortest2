package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaoi {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final com.google.android.gms.internal.ads.zzaoo zzf;
    public final java.lang.String zzg;
    public final java.lang.String zzh;
    public final com.google.android.gms.internal.ads.zzaoi zzi;
    private final java.lang.String[] zzj;
    private final java.util.HashMap zzk;
    private final java.util.HashMap zzl;
    private java.util.List zzm;

    public static com.google.android.gms.internal.ads.zzaoi zza(java.lang.String str) {
        return new com.google.android.gms.internal.ads.zzaoi(null, str.replaceAll(io.ktor.sse.ServerSentEventKt.END_OF_LINE, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", io.ktor.sse.ServerSentEventKt.SPACE).replaceAll("[ \t\\x0B\f\r]+", io.ktor.sse.ServerSentEventKt.SPACE), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static com.google.android.gms.internal.ads.zzaoi zzb(java.lang.String str, long j, long j2, com.google.android.gms.internal.ads.zzaoo zzaooVar, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.zzaoi zzaoiVar) {
        return new com.google.android.gms.internal.ads.zzaoi(str, null, j, j2, zzaooVar, strArr, str2, str3, zzaoiVar);
    }

    private final void zzi(java.util.TreeSet treeSet, boolean z) {
        java.lang.String str = this.zza;
        boolean equals = "p".equals(str);
        if (z || equals || ("div".equals(str) && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                com.google.android.gms.internal.ads.zzaoi zzaoiVar = (com.google.android.gms.internal.ads.zzaoi) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                zzaoiVar.zzi(treeSet, z2);
            }
        }
    }

    private final void zzj(long j, java.lang.String str, java.util.List list) {
        java.lang.String str2;
        java.lang.String str3 = this.zzg;
        boolean equals = "".equals(str3);
        boolean zzc = zzc(j);
        if (true != equals) {
            str = str3;
        }
        if (zzc && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new android.util.Pair(str, str2));
            return;
        }
        for (int i = 0; i < zzf(); i++) {
            zze(i).zzj(j, str, list);
        }
    }

    private final void zzk(long j, boolean z, java.lang.String str, java.util.Map map) {
        java.util.HashMap hashMap = this.zzk;
        hashMap.clear();
        java.util.HashMap hashMap2 = this.zzl;
        hashMap2.clear();
        java.lang.String str2 = this.zza;
        if ("metadata".equals(str2)) {
            return;
        }
        java.lang.String str3 = this.zzg;
        java.lang.String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z) {
            android.text.SpannableStringBuilder zzl = zzl(str4, map);
            java.lang.String str5 = this.zzb;
            str5.getClass();
            zzl.append((java.lang.CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            zzl(str4, map).append('\n');
            return;
        }
        if (zzc(j)) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str6 = (java.lang.String) entry.getKey();
                java.lang.CharSequence zzb = ((com.google.android.gms.internal.ads.zzcw) entry.getValue()).zzb();
                zzb.getClass();
                hashMap.put(str6, java.lang.Integer.valueOf(zzb.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i = 0; i < zzf(); i++) {
                zze(i).zzk(j, z || equals, str4, map);
            }
            if (equals) {
                android.text.SpannableStringBuilder zzl2 = zzl(str4, map);
                int length = zzl2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (zzl2.charAt(length) == ' ');
                if (length >= 0 && zzl2.charAt(length) != '\n') {
                    zzl2.append('\n');
                }
            }
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                java.lang.String str7 = (java.lang.String) entry2.getKey();
                java.lang.CharSequence zzb2 = ((com.google.android.gms.internal.ads.zzcw) entry2.getValue()).zzb();
                zzb2.getClass();
                hashMap2.put(str7, java.lang.Integer.valueOf(zzb2.length()));
            }
        }
    }

    private static android.text.SpannableStringBuilder zzl(java.lang.String str, java.util.Map map) {
        if (!map.containsKey(str)) {
            com.google.android.gms.internal.ads.zzcw zzcwVar = new com.google.android.gms.internal.ads.zzcw();
            zzcwVar.zza(new android.text.SpannableStringBuilder());
            map.put(str, zzcwVar);
        }
        java.lang.CharSequence zzb = ((com.google.android.gms.internal.ads.zzcw) map.get(str)).zzb();
        zzb.getClass();
        return (android.text.SpannableStringBuilder) zzb;
    }

    private final void zzm(long j, java.util.Map map, java.util.Map map2, java.lang.String str, java.util.Map map3) {
        java.util.Iterator it;
        com.google.android.gms.internal.ads.zzaoi zzaoiVar;
        com.google.android.gms.internal.ads.zzaoo zza;
        int i;
        if (zzc(j)) {
            java.lang.String str2 = this.zzg;
            java.lang.String str3 = true != "".equals(str2) ? str2 : str;
            java.util.Iterator it2 = this.zzl.entrySet().iterator();
            while (it2.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                java.lang.String str4 = (java.lang.String) entry.getKey();
                java.util.HashMap hashMap = this.zzk;
                int intValue = hashMap.containsKey(str4) ? ((java.lang.Integer) hashMap.get(str4)).intValue() : 0;
                int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    com.google.android.gms.internal.ads.zzcw zzcwVar = (com.google.android.gms.internal.ads.zzcw) map3.get(str4);
                    zzcwVar.getClass();
                    com.google.android.gms.internal.ads.zzaom zzaomVar = (com.google.android.gms.internal.ads.zzaom) map2.get(str3);
                    zzaomVar.getClass();
                    int i2 = zzaomVar.zzj;
                    com.google.android.gms.internal.ads.zzaoo zza2 = com.google.android.gms.internal.ads.zzaon.zza(this.zzf, this.zzj, map);
                    android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) zzcwVar.zzb();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new android.text.SpannableStringBuilder();
                        zzcwVar.zza(spannableStringBuilder);
                    }
                    if (zza2 != null) {
                        com.google.android.gms.internal.ads.zzaoi zzaoiVar2 = this.zzi;
                        if (zza2.zza() != -1) {
                            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(zza2.zza()), intValue, intValue2, 33);
                        }
                        if (zza2.zzb()) {
                            spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzd()) {
                            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), intValue, intValue2, 33);
                        }
                        if (zza2.zzl()) {
                            com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new android.text.style.ForegroundColorSpan(zza2.zzj()), intValue, intValue2, 33);
                        }
                        if (zza2.zzo()) {
                            com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new android.text.style.BackgroundColorSpan(zza2.zzm()), intValue, intValue2, 33);
                        }
                        if (zza2.zzh() != null) {
                            com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new android.text.style.TypefaceSpan(zza2.zzh()), intValue, intValue2, 33);
                        }
                        if (zza2.zzE() != null) {
                            com.google.android.gms.internal.ads.zzaoh zzE = zza2.zzE();
                            zzE.getClass();
                            int i3 = zzE.zza;
                            it = it2;
                            if (i3 == -1) {
                                i3 = (i2 == 2 || i2 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = zzE.zzb;
                            }
                            int i4 = zzE.zzc;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new com.google.android.gms.internal.ads.zzde(i3, i, i4), intValue, intValue2, 33);
                        } else {
                            it = it2;
                        }
                        int zzv = zza2.zzv();
                        if (zzv == 2) {
                            while (true) {
                                if (zzaoiVar2 == null) {
                                    zzaoiVar2 = null;
                                    break;
                                }
                                com.google.android.gms.internal.ads.zzaoo zza3 = com.google.android.gms.internal.ads.zzaon.zza(zzaoiVar2.zzf, zzaoiVar2.zzj, map);
                                if (zza3 != null && zza3.zzv() == 1) {
                                    break;
                                } else {
                                    zzaoiVar2 = zzaoiVar2.zzi;
                                }
                            }
                            if (zzaoiVar2 != null) {
                                java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
                                arrayDeque.push(zzaoiVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzaoiVar = null;
                                        break;
                                    }
                                    com.google.android.gms.internal.ads.zzaoi zzaoiVar3 = (com.google.android.gms.internal.ads.zzaoi) arrayDeque.pop();
                                    com.google.android.gms.internal.ads.zzaoo zza4 = com.google.android.gms.internal.ads.zzaon.zza(zzaoiVar3.zzf, zzaoiVar3.zzj, map);
                                    if (zza4 != null && zza4.zzv() == 3) {
                                        zzaoiVar = zzaoiVar3;
                                        break;
                                    }
                                    for (int zzf = zzaoiVar3.zzf() - 1; zzf >= 0; zzf--) {
                                        arrayDeque.push(zzaoiVar3.zze(zzf));
                                    }
                                }
                                if (zzaoiVar != null) {
                                    if (zzaoiVar.zzf() != 1 || zzaoiVar.zze(0).zzb == null) {
                                        com.google.android.gms.internal.ads.zzeg.zzb("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        java.lang.String str5 = zzaoiVar.zze(0).zzb;
                                        java.lang.String str6 = com.google.android.gms.internal.ads.zzfl.zza;
                                        com.google.android.gms.internal.ads.zzaoo zza5 = com.google.android.gms.internal.ads.zzaon.zza(zzaoiVar.zzf, zzaoiVar.zzj, map);
                                        int zzx = zza5 != null ? zza5.zzx() : -1;
                                        if (zzx == -1 && (zza = com.google.android.gms.internal.ads.zzaon.zza(zzaoiVar2.zzf, zzaoiVar2.zzj, map)) != null) {
                                            zzx = zza.zzx();
                                        }
                                        spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.zzdc(str5, zzx), intValue, intValue2, 33);
                                    }
                                }
                            }
                        } else if (zzv == 3 || zzv == 4) {
                            spannableStringBuilder.setSpan(new com.google.android.gms.internal.ads.zzaog(), intValue, intValue2, 33);
                        }
                        if (zza2.zzC()) {
                            com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new com.google.android.gms.internal.ads.zzdb(), intValue, intValue2, 33);
                        }
                        int zzI = zza2.zzI();
                        if (zzI == 1) {
                            com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) zza2.zzJ(), true), intValue, intValue2, 33);
                        } else if (zzI == 2) {
                            com.google.android.gms.internal.ads.zzdd.zza(spannableStringBuilder, new android.text.style.RelativeSizeSpan(zza2.zzJ()), intValue, intValue2, 33);
                        } else if (zzI == 3) {
                            com.google.android.gms.internal.ads.zzdd.zzb(spannableStringBuilder, zza2.zzJ() / 100.0f, intValue, intValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zza2.zzq() != Float.MAX_VALUE) {
                                zzcwVar.zzp((zza2.zzq() * (-90.0f)) / 100.0f);
                            }
                            if (zza2.zzy() != null) {
                                zzcwVar.zzd(zza2.zzy());
                            }
                            if (zza2.zzA() != null) {
                                zzcwVar.zze(zza2.zzA());
                            }
                        }
                        it2 = it;
                    }
                }
            }
            for (int i5 = 0; i5 < zzf(); i5++) {
                zze(i5).zzm(j, map, map2, str3, map3);
            }
        }
    }

    public final boolean zzc(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.zze) {
            return j2 <= j && j < this.zze;
        }
        return true;
    }

    public final void zzd(com.google.android.gms.internal.ads.zzaoi zzaoiVar) {
        if (this.zzm == null) {
            this.zzm = new java.util.ArrayList();
        }
        this.zzm.add(zzaoiVar);
    }

    public final com.google.android.gms.internal.ads.zzaoi zze(int i) {
        java.util.List list = this.zzm;
        if (list != null) {
            return (com.google.android.gms.internal.ads.zzaoi) list.get(i);
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    public final int zzf() {
        java.util.List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] zzg() {
        java.util.TreeSet treeSet = new java.util.TreeSet();
        int i = 0;
        zzi(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((java.lang.Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public final java.util.List zzh(long j, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        java.util.List arrayList = new java.util.ArrayList();
        java.lang.String str = this.zzg;
        zzj(j, str, arrayList);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        zzk(j, false, str, treeMap);
        zzm(j, map, map2, str, treeMap);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            android.util.Pair pair = (android.util.Pair) arrayList.get(i);
            java.lang.String str2 = (java.lang.String) map3.get(pair.second);
            if (str2 != null) {
                byte[] decode = android.util.Base64.decode(str2, 0);
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length);
                com.google.android.gms.internal.ads.zzaom zzaomVar = (com.google.android.gms.internal.ads.zzaom) map2.get(pair.first);
                zzaomVar.getClass();
                com.google.android.gms.internal.ads.zzcw zzcwVar = new com.google.android.gms.internal.ads.zzcw();
                zzcwVar.zzc(decodeByteArray);
                zzcwVar.zzi(zzaomVar.zzb);
                zzcwVar.zzj(0);
                zzcwVar.zzf(zzaomVar.zzc, 0);
                zzcwVar.zzg(zzaomVar.zze);
                zzcwVar.zzm(zzaomVar.zzf);
                zzcwVar.zzn(zzaomVar.zzg);
                zzcwVar.zzo(zzaomVar.zzj);
                arrayList2.add(zzcwVar.zzr());
            }
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            com.google.android.gms.internal.ads.zzaom zzaomVar2 = (com.google.android.gms.internal.ads.zzaom) map2.get(entry.getKey());
            zzaomVar2.getClass();
            com.google.android.gms.internal.ads.zzcw zzcwVar2 = (com.google.android.gms.internal.ads.zzcw) entry.getValue();
            java.lang.CharSequence zzb = zzcwVar2.zzb();
            zzb.getClass();
            android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) zzb;
            for (com.google.android.gms.internal.ads.zzaog zzaogVar : (com.google.android.gms.internal.ads.zzaog[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), com.google.android.gms.internal.ads.zzaog.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzaogVar), spannableStringBuilder.getSpanEnd(zzaogVar), (java.lang.CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcwVar2.zzf(zzaomVar2.zzc, zzaomVar2.zzd);
            zzcwVar2.zzg(zzaomVar2.zze);
            zzcwVar2.zzi(zzaomVar2.zzb);
            zzcwVar2.zzm(zzaomVar2.zzf);
            zzcwVar2.zzl(zzaomVar2.zzi, zzaomVar2.zzh);
            zzcwVar2.zzo(zzaomVar2.zzj);
            arrayList2.add(zzcwVar2.zzr());
        }
        return arrayList2;
    }

    private zzaoi(java.lang.String str, java.lang.String str2, long j, long j2, com.google.android.gms.internal.ads.zzaoo zzaooVar, java.lang.String[] strArr, java.lang.String str3, java.lang.String str4, com.google.android.gms.internal.ads.zzaoi zzaoiVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaooVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzaoiVar;
        this.zzk = new java.util.HashMap();
        this.zzl = new java.util.HashMap();
    }
}
