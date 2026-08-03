package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
class zzjm extends com.google.android.gms.internal.drive.zzjl {
    protected final byte[] zzny;

    zzjm(byte[] bArr) {
        bArr.getClass();
        this.zzny = bArr;
    }

    protected int zzbw() {
        return 0;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public byte zzs(int i) {
        return this.zzny[i];
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    byte zzt(int i) {
        return this.zzny[i];
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public int size() {
        return this.zzny.length;
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final com.google.android.gms.internal.drive.zzjc zza(int i, int i2) {
        int zzb = zzb(0, i2, size());
        if (zzb == 0) {
            return com.google.android.gms.internal.drive.zzjc.zznq;
        }
        return new com.google.android.gms.internal.drive.zzjh(this.zzny, zzbw(), zzb);
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    final void zza(com.google.android.gms.internal.drive.zzjb zzjbVar) throws java.io.IOException {
        zzjbVar.zza(this.zzny, zzbw(), size());
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    protected final java.lang.String zza(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zzny, zzbw(), size(), charset);
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final boolean zzbu() {
        int zzbw = zzbw();
        return com.google.android.gms.internal.drive.zznf.zze(this.zzny, zzbw, size() + zzbw);
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.drive.zzjc) || size() != ((com.google.android.gms.internal.drive.zzjc) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.drive.zzjm) {
            com.google.android.gms.internal.drive.zzjm zzjmVar = (com.google.android.gms.internal.drive.zzjm) obj;
            int zzbv = zzbv();
            int zzbv2 = zzjmVar.zzbv();
            if (zzbv == 0 || zzbv2 == 0 || zzbv == zzbv2) {
                return zza(zzjmVar, 0, size());
            }
            return false;
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.drive.zzjl
    final boolean zza(com.google.android.gms.internal.drive.zzjc zzjcVar, int i, int i2) {
        if (i2 > zzjcVar.size()) {
            int size = size();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 > zzjcVar.size()) {
            int size2 = zzjcVar.size();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (zzjcVar instanceof com.google.android.gms.internal.drive.zzjm) {
            com.google.android.gms.internal.drive.zzjm zzjmVar = (com.google.android.gms.internal.drive.zzjm) zzjcVar;
            byte[] bArr = this.zzny;
            byte[] bArr2 = zzjmVar.zzny;
            int zzbw = zzbw() + i2;
            int zzbw2 = zzbw();
            int zzbw3 = zzjmVar.zzbw();
            while (zzbw2 < zzbw) {
                if (bArr[zzbw2] != bArr2[zzbw3]) {
                    return false;
                }
                zzbw2++;
                zzbw3++;
            }
            return true;
        }
        return zzjcVar.zza(0, i2).equals(zza(0, i2));
    }

    @Override // com.google.android.gms.internal.drive.zzjc
    protected final int zza(int i, int i2, int i3) {
        return com.google.android.gms.internal.drive.zzkm.zza(i, this.zzny, zzbw(), i3);
    }
}
