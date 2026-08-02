package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzgc extends com.google.android.gms.internal.fido.zzge {
    final char[] zza;

    private zzgc(com.google.android.gms.internal.fido.zzgb zzgbVar) {
        super(zzgbVar, null);
        char[] cArr;
        this.zza = new char[512];
        cArr = zzgbVar.zzf;
        com.google.android.gms.internal.fido.zzbm.zzc(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzgbVar.zza(i >>> 4);
            this.zza[i | 256] = zzgbVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzge
    final com.google.android.gms.internal.fido.zzgf zza(com.google.android.gms.internal.fido.zzgb zzgbVar, @javax.annotation.CheckForNull java.lang.Character ch) {
        return new com.google.android.gms.internal.fido.zzgc(zzgbVar);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    final void zzb(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.android.gms.internal.fido.zzbm.zze(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            appendable.append(this.zza[i4]);
            appendable.append(this.zza[i4 | 256]);
        }
    }

    zzgc(java.lang.String str, java.lang.String str2) {
        this(new com.google.android.gms.internal.fido.zzgb("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
