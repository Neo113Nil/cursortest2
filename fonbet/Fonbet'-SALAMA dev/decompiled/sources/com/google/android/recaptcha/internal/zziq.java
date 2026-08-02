package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;
import e1.k;

/* loaded from: classes.dex */
final class zziq extends zziu {
    private final int zzc;

    public zziq(byte[] bArr, int i7, int i8) {
        super(bArr);
        zziv.zzi(0, i8, bArr.length);
        this.zzc = i8;
    }

    @Override // com.google.android.recaptcha.internal.zziu, com.google.android.recaptcha.internal.zziv
    public final byte zza(int i7) {
        int i8 = this.zzc;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return ((zziu) this).zza[i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(k.d(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "Index > length: ", ", "));
    }

    @Override // com.google.android.recaptcha.internal.zziu, com.google.android.recaptcha.internal.zziv
    public final byte zzb(int i7) {
        return ((zziu) this).zza[i7];
    }

    @Override // com.google.android.recaptcha.internal.zziu
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zziu, com.google.android.recaptcha.internal.zziv
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zziu, com.google.android.recaptcha.internal.zziv
    public final void zze(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(((zziu) this).zza, 0, bArr, 0, i9);
    }
}
