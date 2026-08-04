package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
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
            if (i13 != 0) {
                if (i14 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i9, i10, i12);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i9, i10, i12);
                    z4 = false;
                }
            } else if (i14 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, i12);
            } else {
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
        String strZzB;
        int i9;
        int length;
        this.zza.zzJ(bArr, i7 + i8);
        this.zza.zzL(i7);
        zzed zzedVar = this.zza;
        int i10 = 1;
        int i11 = 0;
        int i12 = 2;
        zzcv.zzd(zzedVar.zzb() >= 2);
        int iZzq = zzedVar.zzq();
        if (iZzq == 0) {
            strZzB = "";
        } else {
            int iZzd = zzedVar.zzd();
            Charset charsetZzC = zzedVar.zzC();
            int iZzd2 = zzedVar.zzd() - iZzd;
            if (charsetZzC == null) {
                charsetZzC = StandardCharsets.UTF_8;
            }
            strZzB = zzedVar.zzB(iZzq - iZzd2, charsetZzC);
        }
        if (strZzB.isEmpty()) {
            zzddVar.zza(new zzajk(zzfwh.zzn(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzB);
        zzc(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float fMax = this.zzf;
        while (true) {
            zzed zzedVar2 = this.zza;
            if (zzedVar2.zzb() < 8) {
                zzcl zzclVar = new zzcl();
                zzclVar.zzl(spannableStringBuilder);
                zzclVar.zze(fMax, 0);
                zzclVar.zzf(0);
                zzddVar.zza(new zzajk(zzfwh.zzo(zzclVar.zzp()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int iZzd3 = zzedVar2.zzd();
            int iZzg = zzedVar2.zzg();
            int iZzg2 = this.zza.zzg();
            if (iZzg2 == 1937013100) {
                zzcv.zzd(this.zza.zzb() >= i12 ? i10 : i11);
                int iZzq2 = this.zza.zzq();
                int i13 = i11;
                while (i13 < iZzq2) {
                    zzed zzedVar3 = this.zza;
                    zzcv.zzd(zzedVar3.zzb() >= 12 ? i10 : i11);
                    int iZzq3 = zzedVar3.zzq();
                    int iZzq4 = zzedVar3.zzq();
                    zzedVar3.zzM(i12);
                    int iZzm = zzedVar3.zzm();
                    zzedVar3.zzM(i10);
                    int iZzg3 = zzedVar3.zzg();
                    if (iZzq4 > spannableStringBuilder.length()) {
                        zzdq.zzf("Tx3gParser", "Truncating styl end (" + iZzq4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        length = spannableStringBuilder.length();
                    } else {
                        length = iZzq4;
                    }
                    if (iZzq3 >= length) {
                        zzdq.zzf("Tx3gParser", "Ignoring styl with start (" + iZzq3 + ") >= end (" + length + ").");
                    } else {
                        int i14 = length;
                        zzc(spannableStringBuilder, iZzm, this.zzc, iZzq3, i14, 0);
                        zzb(spannableStringBuilder, iZzg3, this.zzd, iZzq3, i14, 0);
                    }
                    i10 = 1;
                    i13++;
                    iZzq2 = iZzq2;
                    i11 = 0;
                    i12 = 2;
                }
                i9 = i12;
            } else if (iZzg2 == 1952608120 && this.zzb) {
                i9 = 2;
                zzcv.zzd(this.zza.zzb() >= 2 ? i10 : 0);
                float fZzq = this.zza.zzq();
                int i15 = this.zzg;
                int i16 = zzen.zza;
                fMax = Math.max(0.0f, Math.min(fZzq / i15, 0.95f));
            } else {
                i9 = 2;
            }
            this.zza.zzL(iZzd3 + iZzg);
            i12 = i9;
            i11 = 0;
        }
    }
}
