package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaoq implements com.google.android.gms.internal.ads.zzanl {
    private final com.google.android.gms.internal.ads.zzet zza = new com.google.android.gms.internal.ads.zzet();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final java.lang.String zze;
    private final float zzf;
    private final int zzg;

    public zzaoq(java.util.List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(com.google.android.gms.internal.ads.zzfl.zzk(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * com.google.common.base.Ascii.DC4;
        this.zzg = i;
        boolean z = (bArr[0] & 32) != 0;
        this.zzb = z;
        if (z) {
            this.zzf = java.lang.Math.max(0.0f, java.lang.Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 == 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i3, i4, i6);
                }
                z = false;
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(3), i3, i4, i6);
            } else {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i3, i4, i6);
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(0), i3, i4, i6);
            }
        }
    }

    private static void zzc(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzank zzankVar, com.google.android.gms.internal.ads.zzdt zzdtVar) {
        java.lang.String zzK;
        int i3;
        int i4;
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        zzetVar.zzb(bArr, i + i2);
        zzetVar.zzh(i);
        int i5 = 1;
        int i6 = 2;
        com.google.android.gms.internal.ads.zzgtj.zza(zzetVar.zzd() >= 2);
        int zzt = zzetVar.zzt();
        if (zzt == 0) {
            zzK = "";
        } else {
            int zzg = zzetVar.zzg();
            java.nio.charset.Charset zzR = zzetVar.zzR();
            int zzg2 = zzetVar.zzg() - zzg;
            if (zzR == null) {
                zzR = java.nio.charset.StandardCharsets.UTF_8;
            }
            zzK = zzetVar.zzK(zzt - zzg2, zzR);
        }
        if (zzK.isEmpty()) {
            zzdtVar.zza(new com.google.android.gms.internal.ads.zzand(com.google.android.gms.internal.ads.zzgwm.zzi(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(zzK);
        int i7 = this.zzc;
        zzb(spannableStringBuilder, i7, 0, 0, spannableStringBuilder.length(), 16711680);
        int i8 = this.zzd;
        zzc(spannableStringBuilder, i8, -1, 0, spannableStringBuilder.length(), 16711680);
        java.lang.String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.zzf;
        while (zzetVar.zzd() >= 8) {
            int zzg3 = zzetVar.zzg();
            int zzB = zzetVar.zzB();
            int zzB2 = zzetVar.zzB();
            if (zzB2 == 1937013100) {
                com.google.android.gms.internal.ads.zzgtj.zza(zzetVar.zzd() >= i6);
                int zzt2 = zzetVar.zzt();
                int i9 = 0;
                while (i9 < zzt2) {
                    com.google.android.gms.internal.ads.zzgtj.zza(zzetVar.zzd() >= 12);
                    int zzt3 = zzetVar.zzt();
                    int zzt4 = zzetVar.zzt();
                    zzetVar.zzk(i6);
                    int zzs = zzetVar.zzs();
                    zzetVar.zzk(i5);
                    int zzB3 = zzetVar.zzB();
                    if (zzt4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        i3 = zzt2;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzt4).length() + 44 + java.lang.String.valueOf(length2).length() + 2);
                        sb.append("Truncating styl end (");
                        sb.append(zzt4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        com.google.android.gms.internal.ads.zzeg.zzc("Tx3gParser", sb.toString());
                        i4 = spannableStringBuilder.length();
                    } else {
                        i3 = zzt2;
                        i4 = zzt4;
                    }
                    if (zzt3 >= i4) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzt3).length() + 36 + java.lang.String.valueOf(i4).length() + 2);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(zzt3);
                        sb2.append(") >= end (");
                        sb2.append(i4);
                        sb2.append(").");
                        com.google.android.gms.internal.ads.zzeg.zzc("Tx3gParser", sb2.toString());
                    } else {
                        int i10 = i4;
                        zzb(spannableStringBuilder, zzs, i7, zzt3, i10, 0);
                        zzc(spannableStringBuilder, zzB3, i8, zzt3, i10, 0);
                    }
                    i9++;
                    zzt2 = i3;
                    i5 = 1;
                    i6 = 2;
                }
            } else if (zzB2 == 1952608120 && this.zzb) {
                com.google.android.gms.internal.ads.zzgtj.zza(zzetVar.zzd() >= 2);
                float zzt5 = zzetVar.zzt();
                int i11 = this.zzg;
                java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
                f = java.lang.Math.max(0.0f, java.lang.Math.min(zzt5 / i11, 0.95f));
                zzetVar.zzh(zzg3 + zzB);
                i5 = 1;
                i6 = 2;
            }
            zzetVar.zzh(zzg3 + zzB);
            i5 = 1;
            i6 = 2;
        }
        com.google.android.gms.internal.ads.zzcw zzcwVar = new com.google.android.gms.internal.ads.zzcw();
        zzcwVar.zza(spannableStringBuilder);
        zzcwVar.zzf(f, 0);
        zzcwVar.zzg(0);
        zzdtVar.zza(new com.google.android.gms.internal.ads.zzand(com.google.android.gms.internal.ads.zzgwm.zzj(zzcwVar.zzr()), -9223372036854775807L, -9223372036854775807L));
    }
}
