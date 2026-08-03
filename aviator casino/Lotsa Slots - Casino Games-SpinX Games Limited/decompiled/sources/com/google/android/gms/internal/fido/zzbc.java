package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
final class zzbc extends com.google.android.gms.internal.fido.zzbe {
    final char[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    zzbc(java.lang.String str, java.lang.String str2) {
        super(r4, null);
        char[] cArr;
        com.google.android.gms.internal.fido.zzbb zzbbVar = new com.google.android.gms.internal.fido.zzbb("base16()", "0123456789ABCDEF".toCharArray());
        this.zza = new char[512];
        cArr = zzbbVar.zzf;
        com.google.android.gms.internal.fido.zzam.zzc(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzbbVar.zza(i >>> 4);
            this.zza[i | 256] = zzbbVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbe, com.google.android.gms.internal.fido.zzbf
    final void zza(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.android.gms.internal.fido.zzam.zze(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            appendable.append(this.zza[i4]);
            appendable.append(this.zza[i4 | 256]);
        }
    }
}
