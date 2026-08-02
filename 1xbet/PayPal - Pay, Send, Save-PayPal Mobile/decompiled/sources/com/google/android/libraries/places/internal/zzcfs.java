package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcfs extends com.google.android.libraries.places.internal.zzcfj {
    private final transient byte[][] zzb;
    private final transient int[] zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcfs(byte[][] bArr, int[] iArr) {
        super(com.google.android.libraries.places.internal.zzcfj.zza.zza());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        this.zzb = bArr;
        this.zzc = iArr;
    }

    private final com.google.android.libraries.places.internal.zzcfj zzs() {
        return new com.google.android.libraries.places.internal.zzcfj(zzk());
    }

    @Override // com.google.android.libraries.places.internal.zzcfj
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.internal.zzcfj) {
            com.google.android.libraries.places.internal.zzcfj zzcfjVar = (com.google.android.libraries.places.internal.zzcfj) obj;
            return zzcfjVar.zzj() == zzj() && zzn(0, zzcfjVar, 0, zzj());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzcfj
    public final int hashCode() {
        int zzb = zzb();
        if (zzb != 0) {
            return zzb;
        }
        byte[][] bArr = this.zzb;
        int length = bArr.length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.zzc;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            byte[] bArr2 = bArr[i];
            for (int i6 = i4; i6 < (i5 - i3) + i4; i6++) {
                i2 = (i2 * 31) + bArr2[i6];
            }
            i++;
            i3 = i5;
        }
        zzc(i2);
        return i2;
    }

    @Override // com.google.android.libraries.places.internal.zzcfj
    public final java.lang.String toString() {
        return zzs().toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcfj
    public final java.lang.String zzg() {
        return zzs().zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzcfj
    public final com.google.android.libraries.places.internal.zzcfj zzh() {
        return zzs().zzh();
    }

    @Override // com.google.android.libraries.places.internal.zzcfj
    public final byte zzi(int i) {
        byte[][] bArr = this.zzb;
        int length = bArr.length;
        int[] iArr = this.zzc;
        com.google.android.libraries.places.internal.zzcfb.zza(iArr[length - 1], i, 1L);
        int zza = com.google.android.libraries.places.internal.zzcgb.zza(this, i);
        return bArr[zza][(i - (zza == 0 ? 0 : iArr[zza - 1])) + iArr[length + zza]];
    }

    @Override // com.google.android.libraries.places.internal.zzcfj
    public final int zzj() {
        return this.zzc[this.zzb.length - 1];
    }

    @Override // com.google.android.libraries.places.internal.zzcfj
    public final byte[] zzk() {
        byte[] bArr = new byte[zzj()];
        byte[][] bArr2 = this.zzb;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.zzc;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            kotlin.collections.ArraysKt.copyInto(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzcfj
    public final byte[] zzl() {
        return zzk();
    }

    @Override // com.google.android.libraries.places.internal.zzcfj
    public final void zzm(com.google.android.libraries.places.internal.zzcff zzcffVar, int i, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcffVar, "");
        int zza = com.google.android.libraries.places.internal.zzcgb.zza(this, 0);
        int i4 = 0;
        while (i4 < i2) {
            if (zza == 0) {
                zza = 0;
                i3 = 0;
            } else {
                i3 = this.zzc[zza - 1];
            }
            int[] iArr = this.zzc;
            int i5 = iArr[zza];
            byte[][] bArr = this.zzb;
            int i6 = iArr[bArr.length + zza];
            int min = java.lang.Math.min(i2, (i5 - i3) + i3) - i4;
            int i7 = i6 + (i4 - i3);
            com.google.android.libraries.places.internal.zzcfq zzcfqVar = new com.google.android.libraries.places.internal.zzcfq(bArr[zza], i7, i7 + min, true, false);
            com.google.android.libraries.places.internal.zzcfq zzcfqVar2 = zzcffVar.zza;
            if (zzcfqVar2 == null) {
                zzcfqVar.zzg = zzcfqVar;
                zzcfqVar.zzf = zzcfqVar.zzg;
                zzcffVar.zza = zzcfqVar.zzf;
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar2);
                com.google.android.libraries.places.internal.zzcfq zzcfqVar3 = zzcfqVar2.zzg;
                kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar3);
                zzcfqVar3.zzc(zzcfqVar);
            }
            i4 += min;
            zza++;
        }
        zzcffVar.zzd(zzcffVar.zzb() + i2);
    }

    @Override // com.google.android.libraries.places.internal.zzcfj
    public final boolean zzn(int i, com.google.android.libraries.places.internal.zzcfj zzcfjVar, int i2, int i3) {
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfjVar, "");
        if (zzj() - i3 < 0) {
            return false;
        }
        int zza = com.google.android.libraries.places.internal.zzcgb.zza(this, 0);
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            if (zza == 0) {
                zza = 0;
                i4 = 0;
            } else {
                i4 = this.zzc[zza - 1];
            }
            int[] iArr = this.zzc;
            int i7 = iArr[zza];
            byte[][] bArr = this.zzb;
            int i8 = iArr[bArr.length + zza];
            int min = java.lang.Math.min(i3, (i7 - i4) + i4) - i5;
            if (!zzcfjVar.zzo(i6, bArr[zza], i8 + (i5 - i4), min)) {
                return false;
            }
            i6 += min;
            i5 += min;
            zza++;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzcfj
    public final boolean zzo(int i, byte[] bArr, int i2, int i3) {
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        if (i < 0 || i > zzj() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int zza = com.google.android.libraries.places.internal.zzcgb.zza(this, i);
        while (i < i5) {
            if (zza == 0) {
                zza = 0;
                i4 = 0;
            } else {
                i4 = this.zzc[zza - 1];
            }
            int[] iArr = this.zzc;
            int i6 = iArr[zza];
            byte[][] bArr2 = this.zzb;
            int i7 = iArr[bArr2.length + zza];
            int min = java.lang.Math.min(i5, (i6 - i4) + i4) - i;
            if (!com.google.android.libraries.places.internal.zzcfb.zzb(bArr2[zza], i7 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            zza++;
        }
        return true;
    }

    public final int[] zzr() {
        return this.zzc;
    }

    public final byte[][] zzq() {
        return this.zzb;
    }
}
