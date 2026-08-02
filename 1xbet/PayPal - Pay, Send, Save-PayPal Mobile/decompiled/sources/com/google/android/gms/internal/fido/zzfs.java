package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzfs extends com.google.android.gms.internal.fido.zzft implements java.io.Serializable {
    final byte[] zza;

    zzfs(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    final boolean zzc(com.google.android.gms.internal.fido.zzft zzftVar) {
        if (this.zza.length != zzftVar.zze().length) {
            return false;
        }
        boolean z = true;
        int i = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i >= bArr.length) {
                return z;
            }
            z &= bArr[i] == zzftVar.zze()[i];
            i++;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length < 4) {
            throw new java.lang.IllegalStateException(com.google.android.gms.internal.fido.zzbo.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", java.lang.Integer.valueOf(length)));
        }
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // com.google.android.gms.internal.fido.zzft
    final byte[] zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzft
    public final int zzb() {
        return this.zza.length * 8;
    }
}
