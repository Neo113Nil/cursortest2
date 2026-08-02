package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;

/* loaded from: classes.dex */
class zzaiw extends zzaix {
    protected final byte[] zzb;

    public zzaiw(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaip) || zzb() != ((zzaip) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzaiw)) {
            return obj.equals(this);
        }
        zzaiw zzaiwVar = (zzaiw) obj;
        int zza = zza();
        int zza2 = zzaiwVar.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzaiwVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public byte zza(int i7) {
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public byte zzb(int i7) {
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final zzajb zzc() {
        return zzajb.zza(this.zzb, zze(), zzb(), true);
    }

    public int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final zzaip zza(int i7, int i8) {
        int zza = zzaip.zza(0, i8, zzb());
        return zza == 0 ? zzaip.zza : new zzait(this.zzb, zze(), zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final int zzb(int i7, int i8, int i9) {
        return zzakb.zza(i7, this.zzb, zze(), i9);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public void zza(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.zzb, 0, bArr, 0, i9);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final void zza(zzaim zzaimVar) {
        zzaimVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
    public final boolean zza(zzaip zzaipVar, int i7, int i8) {
        if (i8 <= zzaipVar.zzb()) {
            if (i8 <= zzaipVar.zzb()) {
                if (zzaipVar instanceof zzaiw) {
                    zzaiw zzaiwVar = (zzaiw) zzaipVar;
                    byte[] bArr = this.zzb;
                    byte[] bArr2 = zzaiwVar.zzb;
                    int zze = zze() + i8;
                    int zze2 = zze();
                    int zze3 = zzaiwVar.zze();
                    while (zze2 < zze) {
                        if (bArr[zze2] != bArr2[zze3]) {
                            return false;
                        }
                        zze2++;
                        zze3++;
                    }
                    return true;
                }
                return zzaipVar.zza(0, i8).equals(zza(0, i8));
            }
            throw new IllegalArgumentException(AbstractC0486a1.e(i8, zzaipVar.zzb(), "Ran off end of other: 0, ", ", "));
        }
        throw new IllegalArgumentException("Length too large: " + i8 + zzb());
    }
}
