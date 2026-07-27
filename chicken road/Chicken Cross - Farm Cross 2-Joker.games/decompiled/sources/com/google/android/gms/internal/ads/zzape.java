package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzape implements zzanz {
    private final zzeu zza = new zzeu();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzape(List list) {
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
        this.zze = true == "Serif".equals(zzfm.zzk(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * Ascii.DC4;
        this.zzg = i;
        boolean z = (bArr[0] & 32) != 0;
        this.zzb = z;
        if (z) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 == 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
                }
                z = false;
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i, int i2, zzany zzanyVar, zzdu zzduVar) {
        String zzK;
        int i3;
        int i4;
        int i5;
        zzeu zzeuVar = this.zza;
        zzeuVar.zzb(bArr, i + i2);
        zzeuVar.zzh(i);
        int i6 = 1;
        int i7 = 0;
        int i8 = 2;
        zzguk.zza(zzeuVar.zzd() >= 2);
        int zzt = zzeuVar.zzt();
        if (zzt == 0) {
            zzK = "";
        } else {
            int zzg = zzeuVar.zzg();
            Charset zzR = zzeuVar.zzR();
            int zzg2 = zzeuVar.zzg() - zzg;
            if (zzR == null) {
                zzR = StandardCharsets.UTF_8;
            }
            zzK = zzeuVar.zzK(zzt - zzg2, zzR);
        }
        if (zzK.isEmpty()) {
            zzduVar.zza(new zzanr(zzgxm.zzi(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzK);
        int i9 = this.zzc;
        zzb(spannableStringBuilder, i9, 0, 0, spannableStringBuilder.length(), 16711680);
        int i10 = this.zzd;
        zzc(spannableStringBuilder, i10, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.zzf;
        while (zzeuVar.zzd() >= 8) {
            int zzg3 = zzeuVar.zzg();
            int zzB = zzeuVar.zzB();
            int zzB2 = zzeuVar.zzB();
            if (zzB2 == 1937013100) {
                zzguk.zza(zzeuVar.zzd() >= i8 ? i6 : i7);
                int zzt2 = zzeuVar.zzt();
                int i11 = i7;
                while (i11 < zzt2) {
                    zzguk.zza(zzeuVar.zzd() >= 12 ? i6 : i7);
                    int zzt3 = zzeuVar.zzt();
                    int zzt4 = zzeuVar.zzt();
                    zzeuVar.zzk(i8);
                    int zzs = zzeuVar.zzs();
                    zzeuVar.zzk(i6);
                    int zzB3 = zzeuVar.zzB();
                    if (zzt4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        i4 = zzt2;
                        StringBuilder sb = new StringBuilder(String.valueOf(zzt4).length() + 44 + String.valueOf(length2).length() + 2);
                        sb.append("Truncating styl end (");
                        sb.append(zzt4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        zzeh.zzc("Tx3gParser", sb.toString());
                        i5 = spannableStringBuilder.length();
                    } else {
                        i4 = zzt2;
                        i5 = zzt4;
                    }
                    if (zzt3 >= i5) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzt3).length() + 36 + String.valueOf(i5).length() + 2);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(zzt3);
                        sb2.append(") >= end (");
                        sb2.append(i5);
                        sb2.append(").");
                        zzeh.zzc("Tx3gParser", sb2.toString());
                    } else {
                        int i12 = i5;
                        zzb(spannableStringBuilder, zzs, i9, zzt3, i12, 0);
                        zzc(spannableStringBuilder, zzB3, i10, zzt3, i12, 0);
                    }
                    i11++;
                    zzt2 = i4;
                    i6 = 1;
                    i7 = 0;
                    i8 = 2;
                }
                i3 = i8;
            } else if (zzB2 == 1952608120 && this.zzb) {
                i3 = 2;
                zzguk.zza(zzeuVar.zzd() >= 2);
                float zzt5 = zzeuVar.zzt();
                int i13 = this.zzg;
                String str2 = zzfm.zza;
                f = Math.max(0.0f, Math.min(zzt5 / i13, 0.95f));
            } else {
                i3 = 2;
            }
            zzeuVar.zzh(zzg3 + zzB);
            i8 = i3;
            i6 = 1;
            i7 = 0;
        }
        zzcx zzcxVar = new zzcx();
        zzcxVar.zza(spannableStringBuilder);
        zzcxVar.zzf(f, 0);
        zzcxVar.zzg(0);
        zzduVar.zza(new zzanr(zzgxm.zzj(zzcxVar.zzr()), -9223372036854775807L, -9223372036854775807L));
    }
}
