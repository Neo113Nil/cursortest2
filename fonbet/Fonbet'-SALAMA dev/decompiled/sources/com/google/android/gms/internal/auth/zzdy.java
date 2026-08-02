package com.google.android.gms.internal.auth;

import W5.AbstractC0486a1;
import e1.k;

/* loaded from: classes.dex */
final class zzdy extends zzeb {
    private final int zzc;

    public zzdy(byte[] bArr, int i7, int i8) {
        super(bArr);
        zzee.zzi(0, i8, bArr.length);
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zza(int i7) {
        int i8 = this.zzc;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.zza[i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(k.d(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final byte zzb(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzeb, com.google.android.gms.internal.auth.zzee
    public final int zzd() {
        return this.zzc;
    }
}
