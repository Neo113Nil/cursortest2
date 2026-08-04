package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzait extends zzaiw {
    private final int zzc;
    private final int zzd;

    public zzait(byte[] bArr, int i7, int i8) {
        super(bArr);
        zzaip.zza(i7, i7 + i8, bArr.length);
        this.zzc = i7;
        this.zzd = i8;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final byte zza(int i7) {
        int iZzb = zzb();
        if (((iZzb - (i7 + 1)) | i7) >= 0) {
            return this.zzb[this.zzc + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(k.d(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0486a1.e(i7, iZzb, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final byte zzb(int i7) {
        return this.zzb[this.zzc + i7];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final void zza(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i9);
    }
}
