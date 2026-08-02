package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzgd extends com.google.android.gms.internal.fido.zzge {
    private zzgd(com.google.android.gms.internal.fido.zzgb zzgbVar, @javax.annotation.CheckForNull java.lang.Character ch) {
        super(zzgbVar, ch);
        char[] cArr;
        cArr = zzgbVar.zzf;
        com.google.android.gms.internal.fido.zzbm.zzc(cArr.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzge
    final com.google.android.gms.internal.fido.zzgf zza(com.google.android.gms.internal.fido.zzgb zzgbVar, @javax.annotation.CheckForNull java.lang.Character ch) {
        return new com.google.android.gms.internal.fido.zzgd(zzgbVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    final void zzb(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        com.google.android.gms.internal.fido.zzbm.zze(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8) | (bArr[i3 + 2] & 255);
            appendable.append(this.zzb.zza(i5 >>> 18));
            appendable.append(this.zzb.zza((i5 >>> 12) & 63));
            appendable.append(this.zzb.zza((i5 >>> 6) & 63));
            appendable.append(this.zzb.zza(i5 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zze(appendable, bArr, i3, i2 - i3);
        }
    }

    zzgd(java.lang.String str, java.lang.String str2, @javax.annotation.CheckForNull java.lang.Character ch) {
        this(new com.google.android.gms.internal.fido.zzgb(str, str2.toCharArray()), ch);
    }
}
