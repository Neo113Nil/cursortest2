package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;

/* JADX INFO: loaded from: classes.dex */
class zziu extends zzit {
    protected final byte[] zza;

    public zziu(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziv) || zzd() != ((zziv) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zziu)) {
            return obj.equals(this);
        }
        zziu zziuVar = (zziu) obj;
        int iZzj = zzj();
        int iZzj2 = zziuVar.zzj();
        if (iZzj != 0 && iZzj2 != 0 && iZzj != iZzj2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zziuVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zziuVar.zzd()) {
            throw new IllegalArgumentException(AbstractC0486a1.e(iZzd, zziuVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zziuVar.zza;
        zziuVar.zzc();
        int i7 = 0;
        int i8 = 0;
        while (i7 < iZzd) {
            if (bArr[i7] != bArr2[i8]) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public byte zzb(int i7) {
        return this.zza[i7];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public void zze(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.zza, 0, bArr, 0, i9);
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public final int zzf(int i7, int i8, int i9) {
        return zzla.zzb(i7, this.zza, 0, i9);
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public final zziv zzg(int i7, int i8) {
        int iZzi = zziv.zzi(0, i8, zzd());
        return iZzi == 0 ? zziv.zzb : new zziq(this.zza, 0, iZzi);
    }

    @Override // com.google.android.recaptcha.internal.zziv
    public final void zzh(zzin zzinVar) {
        ((zzjd) zzinVar).zzc(this.zza, 0, zzd());
    }
}
