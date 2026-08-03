package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
final class zzbd extends com.google.android.gms.internal.fido.zzbe {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzbd(java.lang.String str, java.lang.String str2, @javax.annotation.CheckForNull java.lang.Character ch) {
        super(r0, ch);
        char[] cArr;
        com.google.android.gms.internal.fido.zzbb zzbbVar = new com.google.android.gms.internal.fido.zzbb(str, str2.toCharArray());
        cArr = zzbbVar.zzf;
        com.google.android.gms.internal.fido.zzam.zzc(cArr.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    final void zza(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        com.google.android.gms.internal.fido.zzam.zze(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = bArr[i3] & 255;
            int i6 = ((bArr[i3 + 1] & 255) << 8) | (i5 << 16) | (bArr[i3 + 2] & 255);
            appendable.append(this.zzb.zza(i6 >>> 18));
            appendable.append(this.zzb.zza((i6 >>> 12) & 63));
            appendable.append(this.zzb.zza((i6 >>> 6) & 63));
            appendable.append(this.zzb.zza(i6 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zzc(appendable, bArr, i3, i2 - i3);
        }
    }
}
