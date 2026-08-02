package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes.dex */
public final class zzakx implements zzajs {
    private final zzed zza = new zzed();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzakx(List list) {
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
        this.zze = true == "Serif".equals(zzen.zzC(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.zzg = i7;
        boolean z4 = (bArr[0] & 32) != 0;
        this.zzb = z4;
        if (z4) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i9, i10, i11 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            int i12 = i11 | 33;
            int i13 = i7 & 1;
            int i14 = i7 & 2;
            boolean z4 = true;
            if (i13 == 0) {
                if (i14 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, i12);
                }
                z4 = false;
            } else if (i14 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i9, i10, i12);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i9, i10, i12);
                z4 = false;
            }
            if ((i7 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, i12);
            } else {
                if (i13 != 0 || z4) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i9, i10, i12);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        String zzB;
        int i9;
        int i10;
        int i11;
        this.zza.zzJ(bArr, i7 + i8);
        this.zza.zzL(i7);
        zzed zzedVar = this.zza;
        int i12 = 1;
        int i13 = 0;
        int i14 = 2;
        zzcv.zzd(zzedVar.zzb() >= 2);
        int zzq = zzedVar.zzq();
        if (zzq == 0) {
            zzB = "";
        } else {
            int zzd = zzedVar.zzd();
            Charset zzC = zzedVar.zzC();
            int zzd2 = zzedVar.zzd() - zzd;
            if (zzC == null) {
                zzC = StandardCharsets.UTF_8;
            }
            zzB = zzedVar.zzB(zzq - zzd2, zzC);
        }
        if (zzB.isEmpty()) {
            zzddVar.zza(new zzajk(zzfwh.zzn(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzB);
        zzc(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f7 = this.zzf;
        while (true) {
            zzed zzedVar2 = this.zza;
            if (zzedVar2.zzb() < 8) {
                zzcl zzclVar = new zzcl();
                zzclVar.zzl(spannableStringBuilder);
                zzclVar.zze(f7, 0);
                zzclVar.zzf(0);
                zzddVar.zza(new zzajk(zzfwh.zzo(zzclVar.zzp()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int zzd3 = zzedVar2.zzd();
            int zzg = zzedVar2.zzg();
            int zzg2 = this.zza.zzg();
            if (zzg2 == 1937013100) {
                zzcv.zzd(this.zza.zzb() >= i14 ? i12 : i13);
                int zzq2 = this.zza.zzq();
                int i15 = i13;
                while (i15 < zzq2) {
                    zzed zzedVar3 = this.zza;
                    zzcv.zzd(zzedVar3.zzb() >= 12 ? i12 : i13);
                    int zzq3 = zzedVar3.zzq();
                    int zzq4 = zzedVar3.zzq();
                    zzedVar3.zzM(i14);
                    int zzm = zzedVar3.zzm();
                    zzedVar3.zzM(i12);
                    int zzg3 = zzedVar3.zzg();
                    if (zzq4 > spannableStringBuilder.length()) {
                        i10 = zzq2;
                        zzdq.zzf("Tx3gParser", "Truncating styl end (" + zzq4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        i11 = spannableStringBuilder.length();
                    } else {
                        i10 = zzq2;
                        i11 = zzq4;
                    }
                    if (zzq3 >= i11) {
                        zzdq.zzf("Tx3gParser", "Ignoring styl with start (" + zzq3 + ") >= end (" + i11 + ").");
                    } else {
                        int i16 = i11;
                        zzc(spannableStringBuilder, zzm, this.zzc, zzq3, i16, 0);
                        zzb(spannableStringBuilder, zzg3, this.zzd, zzq3, i16, 0);
                    }
                    i12 = 1;
                    i15++;
                    zzq2 = i10;
                    i13 = 0;
                    i14 = 2;
                }
                i9 = i14;
            } else if (zzg2 == 1952608120 && this.zzb) {
                i9 = 2;
                zzcv.zzd(this.zza.zzb() >= 2 ? i12 : 0);
                float zzq5 = this.zza.zzq();
                int i17 = this.zzg;
                int i18 = zzen.zza;
                f7 = Math.max(0.0f, Math.min(zzq5 / i17, 0.95f));
            } else {
                i9 = 2;
            }
            this.zza.zzL(zzd3 + zzg);
            i14 = i9;
            i13 = 0;
        }
    }
}
