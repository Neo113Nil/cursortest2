package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class zzcb extends zzca {
    protected final byte[] zzmp;

    zzcb(byte[] bArr) {
        this.zzmp = bArr;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbu) || size() != ((zzbu) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzcb)) {
            return obj.equals(this);
        }
        zzcb zzcbVar = (zzcb) obj;
        int zzby = zzby();
        int zzby2 = zzcbVar.zzby();
        if (zzby == 0 || zzby2 == 0 || zzby == zzby2) {
            return zza(zzcbVar, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbu
    public int size() {
        return this.zzmp.length;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbu
    protected final int zza(int i, int i2, int i3) {
        return zzdd.zza(i, this.zzmp, zzbz(), i3);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbu
    public final zzbu zza(int i, int i2) {
        int zzb = zzb(0, i2, size());
        return zzb == 0 ? zzbu.zzmi : new zzbx(this.zzmp, zzbz(), zzb);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbu
    protected final String zza(Charset charset) {
        return new String(this.zzmp, zzbz(), size(), charset);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbu
    final void zza(zzbt zzbtVar) throws IOException {
        zzbtVar.zza(this.zzmp, zzbz(), size());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_auth.zzca
    final boolean zza(zzbu zzbuVar, int i, int i2) {
        if (i2 > zzbuVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 > zzbuVar.size()) {
            int size2 = zzbuVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(zzbuVar instanceof zzcb)) {
            return zzbuVar.zza(0, i2).equals(zza(0, i2));
        }
        zzcb zzcbVar = (zzcb) zzbuVar;
        byte[] bArr = this.zzmp;
        byte[] bArr2 = zzcbVar.zzmp;
        int zzbz = zzbz() + i2;
        int zzbz2 = zzbz();
        int zzbz3 = zzcbVar.zzbz();
        while (zzbz2 < zzbz) {
            if (bArr[zzbz2] != bArr2[zzbz3]) {
                return false;
            }
            zzbz2++;
            zzbz3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbu
    public final boolean zzbx() {
        int zzbz = zzbz();
        return zzfx.zzf(this.zzmp, zzbz, size() + zzbz);
    }

    protected int zzbz() {
        return 0;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzbu
    public byte zzk(int i) {
        return this.zzmp[i];
    }
}
