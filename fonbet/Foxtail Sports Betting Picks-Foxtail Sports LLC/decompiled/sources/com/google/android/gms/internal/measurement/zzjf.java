package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
class zzjf extends zzjg {
    protected final byte[] zzb;

    @Override // com.google.android.gms.internal.measurement.zziy
    public byte zza(int i) {
        return this.zzb[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    protected final int zzb(int i, int i2, int i3) {
        return zzkj.zza(i, this.zzb, zzc(), i3);
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final zziy zza(int i, int i2) {
        int zza = zza(0, i2, zzb());
        if (zza == 0) {
            return zziy.zza;
        }
        return new zzjc(this.zzb, zzc(), zza);
    }

    zzjf(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    final void zza(zziv zzivVar) throws IOException {
        zzivVar.zza(this.zzb, zzc(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zziy
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zziy) || zzb() != ((zziy) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (obj instanceof zzjf) {
            zzjf zzjfVar = (zzjf) obj;
            int zza = zza();
            int zza2 = zzjfVar.zza();
            if (zza == 0 || zza2 == 0 || zza == zza2) {
                return zza(zzjfVar, 0, zzb());
            }
            return false;
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzjg
    final boolean zza(zziy zziyVar, int i, int i2) {
        if (i2 > zziyVar.zzb()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzb());
        }
        if (i2 > zziyVar.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i2 + ", " + zziyVar.zzb());
        }
        if (zziyVar instanceof zzjf) {
            zzjf zzjfVar = (zzjf) zziyVar;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzjfVar.zzb;
            int zzc = zzc() + i2;
            int zzc2 = zzc();
            int zzc3 = zzjfVar.zzc();
            while (zzc2 < zzc) {
                if (bArr[zzc2] != bArr2[zzc3]) {
                    return false;
                }
                zzc2++;
                zzc3++;
            }
            return true;
        }
        return zziyVar.zza(0, i2).equals(zza(0, i2));
    }
}
