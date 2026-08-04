package com.google.android.gms.internal.measurement;

import W5.AbstractC0486a1;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class zziy extends zzix {
    protected final byte[] zza;

    public zziy(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjb) || zzd() != ((zzjb) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zziy)) {
            return obj.equals(this);
        }
        zziy zziyVar = (zziy) obj;
        int iZzk = zzk();
        int iZzk2 = zziyVar.zzk();
        if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zziyVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + iZzd + zzd());
        }
        if (iZzd > zziyVar.zzd()) {
            throw new IllegalArgumentException(AbstractC0486a1.e(iZzd, zziyVar.zzd(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zziyVar.zza;
        zziyVar.zzc();
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

    @Override // com.google.android.gms.internal.measurement.zzjb
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public byte zzb(int i7) {
        return this.zza[i7];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final int zze(int i7, int i8, int i9) {
        return zzkk.zzd(i7, this.zza, 0, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final zzjb zzf(int i7, int i8) {
        int iZzj = zzjb.zzj(0, i8, zzd());
        return iZzj == 0 ? zzjb.zzb : new zziv(this.zza, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final void zzh(zzir zzirVar) {
        ((zzjg) zzirVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final boolean zzi() {
        return zzna.zzf(this.zza, 0, zzd());
    }
}
