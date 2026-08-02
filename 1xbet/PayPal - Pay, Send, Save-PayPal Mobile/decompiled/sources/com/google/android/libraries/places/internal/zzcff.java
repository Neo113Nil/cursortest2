package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcff implements java.lang.Cloneable, java.nio.channels.ByteChannel, com.google.android.libraries.places.internal.zzcfh, com.google.android.libraries.places.internal.zzcfg {
    public com.google.android.libraries.places.internal.zzcfq zza;
    private long zzb;

    public final /* synthetic */ java.lang.Object clone() {
        com.google.android.libraries.places.internal.zzcff zzcffVar = new com.google.android.libraries.places.internal.zzcff();
        if (this.zzb == 0) {
            return zzcffVar;
        }
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
        com.google.android.libraries.places.internal.zzcfq zza = zzcfqVar.zza();
        zzcffVar.zza = zza;
        zza.zzg = zza;
        zza.zzf = zza.zzg;
        for (com.google.android.libraries.places.internal.zzcfq zzcfqVar2 = zzcfqVar.zzf; zzcfqVar2 != zzcfqVar; zzcfqVar2 = zzcfqVar2.zzf) {
            com.google.android.libraries.places.internal.zzcfq zzcfqVar3 = zza.zzg;
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar2);
            zzcfqVar3.zzc(zzcfqVar2.zza());
        }
        zzcffVar.zzb = this.zzb;
        return zzcffVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzcfv
    public final void close() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzcff)) {
            return false;
        }
        long j = this.zzb;
        com.google.android.libraries.places.internal.zzcff zzcffVar = (com.google.android.libraries.places.internal.zzcff) obj;
        if (j != zzcffVar.zzb) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
        com.google.android.libraries.places.internal.zzcfq zzcfqVar2 = zzcffVar.zza;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar2);
        int i = zzcfqVar.zzb;
        int i2 = zzcfqVar2.zzb;
        long j3 = 0;
        while (j3 < this.zzb) {
            long min = java.lang.Math.min(zzcfqVar.zzc - i, zzcfqVar2.zzc - i2);
            long j4 = j2;
            while (j4 < min) {
                if (zzcfqVar.zza[i] != zzcfqVar2.zza[i2]) {
                    return false;
                }
                j4++;
                i++;
                i2++;
            }
            if (i == zzcfqVar.zzc) {
                zzcfqVar = zzcfqVar.zzf;
                kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
                i = zzcfqVar.zzb;
            }
            if (i2 == zzcfqVar2.zzc) {
                zzcfqVar2 = zzcfqVar2.zzf;
                kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar2);
                i2 = zzcfqVar2.zzb;
            }
            j3 += min;
            j2 = 0;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzcfg, com.google.android.libraries.places.internal.zzcft, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        if (zzcfqVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = zzcfqVar.zzc;
            for (int i3 = zzcfqVar.zzb; i3 < i2; i3++) {
                i = (i * 31) + zzcfqVar.zza[i3];
            }
            zzcfqVar = zzcfqVar.zzf;
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
        } while (zzcfqVar != this.zza);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        if (zzcfqVar == null) {
            return -1;
        }
        int min = java.lang.Math.min(byteBuffer.remaining(), zzcfqVar.zzc - zzcfqVar.zzb);
        byteBuffer.put(zzcfqVar.zza, zzcfqVar.zzb, min);
        int i = zzcfqVar.zzb + min;
        zzcfqVar.zzb = i;
        this.zzb -= min;
        if (i == zzcfqVar.zzc) {
            this.zza = zzcfqVar.zzb();
            com.google.android.libraries.places.internal.zzcfr.zzb(zzcfqVar);
        }
        return min;
    }

    public final java.lang.String toString() {
        return zzF().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            com.google.android.libraries.places.internal.zzcfq zzE = zzE(1);
            int min = java.lang.Math.min(i, 8192 - zzE.zzc);
            byteBuffer.get(zzE.zza, zzE.zzc, min);
            i -= min;
            zzE.zzc += min;
        }
        this.zzb += remaining;
        return remaining;
    }

    public final com.google.android.libraries.places.internal.zzcff zzA(int i) {
        com.google.android.libraries.places.internal.zzcfq zzE = zzE(1);
        byte[] bArr = zzE.zza;
        int i2 = zzE.zzc;
        zzE.zzc = i2 + 1;
        bArr[i2] = (byte) i;
        this.zzb++;
        return this;
    }

    public final com.google.android.libraries.places.internal.zzcff zzB(int i) {
        com.google.android.libraries.places.internal.zzcfq zzE = zzE(2);
        byte[] bArr = zzE.zza;
        int i2 = zzE.zzc;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        zzE.zzc = i2 + 2;
        this.zzb += 2;
        return this;
    }

    public final com.google.android.libraries.places.internal.zzcff zzC(int i) {
        com.google.android.libraries.places.internal.zzcfq zzE = zzE(4);
        byte[] bArr = zzE.zza;
        int i2 = zzE.zzc;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        zzE.zzc = i2 + 4;
        this.zzb += 4;
        return this;
    }

    public final com.google.android.libraries.places.internal.zzcff zzD(long j) {
        if (j == 0) {
            zzA(48);
            return this;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 - ((j5 >>> 1) & 6148914691236517205L);
        long j7 = ((j6 >>> 2) & 3689348814741910323L) + (j6 & 3689348814741910323L);
        long j8 = ((j7 >>> 4) + j7) & 1085102592571150095L;
        long j9 = j8 + (j8 >>> 8);
        long j10 = j9 + (j9 >>> 16);
        int i = (int) ((((j10 & 63) + ((j10 >>> 32) & 63)) + 3) >> 2);
        com.google.android.libraries.places.internal.zzcfq zzE = zzE(i);
        byte[] bArr = zzE.zza;
        int i2 = zzE.zzc;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 < i2) {
                zzE.zzc += i;
                this.zzb += i;
                return this;
            }
            bArr[i3] = com.google.android.libraries.places.internal.zzcfz.zza()[(int) (15 & j)];
            j >>>= 4;
        }
    }

    public final com.google.android.libraries.places.internal.zzcfj zzF() {
        long j = this.zzb;
        if (j <= androidx.collection.SieveCacheKt.NodeLinkMask) {
            return zzG((int) j);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 22);
        sb.append("size > Int.MAX_VALUE: ");
        sb.append(j);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzcfg
    public final /* synthetic */ com.google.android.libraries.places.internal.zzcfg zzH(java.lang.String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcfg
    public final /* synthetic */ com.google.android.libraries.places.internal.zzcfg zzI(byte[] bArr) {
        zzy(bArr);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcfg
    public final /* synthetic */ com.google.android.libraries.places.internal.zzcfg zzJ(int i) {
        zzA(i);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcfg
    public final /* synthetic */ com.google.android.libraries.places.internal.zzcfg zzK(int i) {
        zzB(i);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcfg
    public final /* synthetic */ com.google.android.libraries.places.internal.zzcfg zzL(int i) {
        zzC(i);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcfv
    public final long zza(com.google.android.libraries.places.internal.zzcff zzcffVar, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcffVar, "");
        if (j < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 15);
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        long j2 = this.zzb;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        zzcffVar.zzc(this, j);
        return j;
    }

    @Override // com.google.android.libraries.places.internal.zzcft
    public final void zzc(com.google.android.libraries.places.internal.zzcff zzcffVar, long j) {
        com.google.android.libraries.places.internal.zzcfq zzcfqVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcffVar, "");
        if (zzcffVar == this) {
            throw new java.lang.IllegalArgumentException("source == this");
        }
        com.google.android.libraries.places.internal.zzcfb.zza(zzcffVar.zzb, 0L, j);
        while (j > 0) {
            com.google.android.libraries.places.internal.zzcfq zzcfqVar2 = zzcffVar.zza;
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar2);
            int i = zzcfqVar2.zzc;
            com.google.android.libraries.places.internal.zzcfq zzcfqVar3 = zzcffVar.zza;
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar3);
            long j2 = i - zzcfqVar3.zzb;
            int i2 = 0;
            if (j < j2) {
                com.google.android.libraries.places.internal.zzcfq zzcfqVar4 = this.zza;
                if (zzcfqVar4 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar4);
                    zzcfqVar = zzcfqVar4.zzg;
                } else {
                    zzcfqVar = null;
                }
                int i3 = (int) j;
                if (zzcfqVar != null && zzcfqVar.zze) {
                    if ((zzcfqVar.zzc + j) - (zzcfqVar.zzd ? 0 : zzcfqVar.zzb) <= 8192) {
                        com.google.android.libraries.places.internal.zzcfq zzcfqVar5 = zzcffVar.zza;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar5);
                        zzcfqVar5.zze(zzcfqVar, i3);
                        zzcffVar.zzb -= j;
                        this.zzb += j;
                        return;
                    }
                }
                com.google.android.libraries.places.internal.zzcfq zzcfqVar6 = zzcffVar.zza;
                kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar6);
                zzcffVar.zza = zzcfqVar6.zzd(i3);
            }
            com.google.android.libraries.places.internal.zzcfq zzcfqVar7 = zzcffVar.zza;
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar7);
            int i4 = zzcfqVar7.zzc;
            int i5 = zzcfqVar7.zzb;
            zzcffVar.zza = zzcfqVar7.zzb();
            com.google.android.libraries.places.internal.zzcfq zzcfqVar8 = this.zza;
            if (zzcfqVar8 == null) {
                this.zza = zzcfqVar7;
                zzcfqVar7.zzg = zzcfqVar7;
                zzcfqVar7.zzf = zzcfqVar7.zzg;
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar8);
                com.google.android.libraries.places.internal.zzcfq zzcfqVar9 = zzcfqVar8.zzg;
                kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar9);
                zzcfqVar9.zzc(zzcfqVar7);
                com.google.android.libraries.places.internal.zzcfq zzcfqVar10 = zzcfqVar7.zzg;
                if (zzcfqVar10 == zzcfqVar7) {
                    throw new java.lang.IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar10);
                if (zzcfqVar10.zze) {
                    int i6 = zzcfqVar7.zzc - zzcfqVar7.zzb;
                    com.google.android.libraries.places.internal.zzcfq zzcfqVar11 = zzcfqVar7.zzg;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar11);
                    int i7 = zzcfqVar11.zzc;
                    com.google.android.libraries.places.internal.zzcfq zzcfqVar12 = zzcfqVar7.zzg;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar12);
                    if (!zzcfqVar12.zzd) {
                        com.google.android.libraries.places.internal.zzcfq zzcfqVar13 = zzcfqVar7.zzg;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar13);
                        i2 = zzcfqVar13.zzb;
                    }
                    if (i6 <= (8192 - i7) + i2) {
                        com.google.android.libraries.places.internal.zzcfq zzcfqVar14 = zzcfqVar7.zzg;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar14);
                        zzcfqVar7.zze(zzcfqVar14, i6);
                        zzcfqVar7.zzb();
                        com.google.android.libraries.places.internal.zzcfr.zzb(zzcfqVar7);
                    }
                }
            }
            long j3 = i4 - i5;
            zzcffVar.zzb -= j3;
            this.zzb += j3;
            j -= j3;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final com.google.android.libraries.places.internal.zzcff zze() {
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final void zzg(long j) throws java.io.EOFException {
        if (this.zzb < j) {
            throw new java.io.EOFException();
        }
    }

    public final com.google.android.libraries.places.internal.zzcff zzh(java.io.OutputStream outputStream, long j) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "");
        com.google.android.libraries.places.internal.zzcfb.zza(this.zzb, 0L, j);
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        while (j > 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
            int min = (int) java.lang.Math.min(j, zzcfqVar.zzc - zzcfqVar.zzb);
            outputStream.write(zzcfqVar.zza, zzcfqVar.zzb, min);
            int i = zzcfqVar.zzb + min;
            zzcfqVar.zzb = i;
            long j2 = min;
            this.zzb -= j2;
            j -= j2;
            if (i == zzcfqVar.zzc) {
                com.google.android.libraries.places.internal.zzcfq zzb = zzcfqVar.zzb();
                this.zza = zzb;
                com.google.android.libraries.places.internal.zzcfr.zzb(zzcfqVar);
                zzcfqVar = zzb;
            }
        }
        return this;
    }

    public final long zzi() {
        long j = this.zzb;
        if (j == 0) {
            return 0L;
        }
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
        com.google.android.libraries.places.internal.zzcfq zzcfqVar2 = zzcfqVar.zzg;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar2);
        return (zzcfqVar2.zzc >= 8192 || !zzcfqVar2.zze) ? j : j - (r3 - zzcfqVar2.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final byte zzj() throws java.io.EOFException {
        if (this.zzb == 0) {
            throw new java.io.EOFException();
        }
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
        int i = zzcfqVar.zzb;
        int i2 = zzcfqVar.zzc;
        int i3 = i + 1;
        byte b = zzcfqVar.zza[i];
        this.zzb--;
        if (i3 != i2) {
            zzcfqVar.zzb = i3;
            return b;
        }
        this.zza = zzcfqVar.zzb();
        com.google.android.libraries.places.internal.zzcfr.zzb(zzcfqVar);
        return b;
    }

    public final byte zzk(long j) {
        com.google.android.libraries.places.internal.zzcfb.zza(this.zzb, j, 1L);
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        if (zzcfqVar == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(null);
            throw null;
        }
        long j2 = this.zzb;
        if (j2 - j < j) {
            while (j2 > j) {
                zzcfqVar = zzcfqVar.zzg;
                kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
                j2 -= zzcfqVar.zzc - zzcfqVar.zzb;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
            return zzcfqVar.zza[(int) ((zzcfqVar.zzb + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            long j4 = (zzcfqVar.zzc - zzcfqVar.zzb) + j3;
            if (j4 > j) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
                return zzcfqVar.zza[(int) ((zzcfqVar.zzb + j) - j3)];
            }
            zzcfqVar = zzcfqVar.zzf;
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
            j3 = j4;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final short zzl() throws java.io.EOFException {
        int i;
        int i2;
        if (this.zzb < 2) {
            throw new java.io.EOFException();
        }
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
        int i3 = zzcfqVar.zzb;
        int i4 = zzcfqVar.zzc;
        if (i4 - i3 < 2) {
            i = (zzj() & 255) << 8;
            i2 = zzj() & 255;
        } else {
            byte[] bArr = zzcfqVar.zza;
            byte b = bArr[i3];
            byte b2 = bArr[i3 + 1];
            this.zzb -= 2;
            int i5 = i3 + 2;
            if (i5 == i4) {
                this.zza = zzcfqVar.zzb();
                com.google.android.libraries.places.internal.zzcfr.zzb(zzcfqVar);
            } else {
                zzcfqVar.zzb = i5;
            }
            i = (b & 255) << 8;
            i2 = b2 & 255;
        }
        return (short) (i | i2);
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final int zzm() throws java.io.EOFException {
        if (this.zzb < 4) {
            throw new java.io.EOFException();
        }
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
        int i = zzcfqVar.zzb;
        int i2 = zzcfqVar.zzc;
        if (i2 - i < 4) {
            return ((zzj() & 255) << 24) | ((zzj() & 255) << 16) | ((zzj() & 255) << 8) | (zzj() & 255);
        }
        byte[] bArr = zzcfqVar.zza;
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        this.zzb -= 4;
        int i3 = (b4 & 255) | ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8);
        int i4 = i + 4;
        if (i4 != i2) {
            zzcfqVar.zzb = i4;
            return i3;
        }
        this.zza = zzcfqVar.zzb();
        com.google.android.libraries.places.internal.zzcfr.zzb(zzcfqVar);
        return i3;
    }

    public final java.lang.String zzo() {
        return zzp(this.zzb, kotlin.text.Charsets.UTF_8);
    }

    public final int zzs(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        com.google.android.libraries.places.internal.zzcfb.zza(bArr.length, i, i2);
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        if (zzcfqVar == null) {
            return -1;
        }
        int min = java.lang.Math.min(i2, zzcfqVar.zzc - zzcfqVar.zzb);
        int i3 = zzcfqVar.zzb;
        kotlin.collections.ArraysKt.copyInto(zzcfqVar.zza, bArr, i, i3, i3 + min);
        int i4 = zzcfqVar.zzb + min;
        zzcfqVar.zzb = i4;
        this.zzb -= min;
        if (i4 != zzcfqVar.zzc) {
            return min;
        }
        this.zza = zzcfqVar.zzb();
        com.google.android.libraries.places.internal.zzcfr.zzb(zzcfqVar);
        return min;
    }

    public final com.google.android.libraries.places.internal.zzcff zzu(com.google.android.libraries.places.internal.zzcfj zzcfjVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfjVar, "");
        zzcfjVar.zzm(this, 0, zzcfjVar.zzj());
        return this;
    }

    public final com.google.android.libraries.places.internal.zzcff zzv(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        zzw(str, 0, str.length());
        return this;
    }

    public final com.google.android.libraries.places.internal.zzcff zzw(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (i2 < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 27);
            sb.append("endIndex < beginIndex: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 > str.length()) {
            int length = str.length();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 29 + java.lang.String.valueOf(length).length());
            sb2.append("endIndex > string.length: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(length);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                com.google.android.libraries.places.internal.zzcfq zzE = zzE(1);
                byte[] bArr = zzE.zza;
                int i5 = zzE.zzc - i3;
                int min = java.lang.Math.min(i2, 8192 - i5);
                bArr[i3 + i5] = (byte) charAt;
                i3 = i4;
                while (i3 < min) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i3 + i5] = (byte) charAt2;
                    i3++;
                }
                int i6 = zzE.zzc;
                int i7 = (i5 + i3) - i6;
                zzE.zzc = i6 + i7;
                this.zzb += i7;
            } else {
                if (charAt < 2048) {
                    com.google.android.libraries.places.internal.zzcfq zzE2 = zzE(2);
                    byte[] bArr2 = zzE2.zza;
                    int i8 = zzE2.zzc;
                    bArr2[i8] = (byte) ((charAt >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((charAt & '?') | 128);
                    zzE2.zzc = i8 + 2;
                    this.zzb += 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    com.google.android.libraries.places.internal.zzcfq zzE3 = zzE(3);
                    byte[] bArr3 = zzE3.zza;
                    int i9 = zzE3.zzc;
                    bArr3[i9] = (byte) ((charAt >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((charAt & '?') | 128);
                    zzE3.zzc = i9 + 3;
                    this.zzb += 3;
                } else {
                    char charAt3 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 >= 57344) {
                        zzA(63);
                    } else {
                        com.google.android.libraries.places.internal.zzcfq zzE4 = zzE(4);
                        byte[] bArr4 = zzE4.zza;
                        int i10 = zzE4.zzc;
                        int i11 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        bArr4[i10] = (byte) ((i11 >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                        bArr4[i10 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i10 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i10 + 3] = (byte) ((i11 & 63) | 128);
                        zzE4.zzc = i10 + 4;
                        this.zzb += 4;
                        i3 += 2;
                    }
                }
                i3 = i4;
            }
        }
        return this;
    }

    public final com.google.android.libraries.places.internal.zzcff zzx(int i) {
        if (i < 128) {
            zzA(i);
            return this;
        }
        if (i < 2048) {
            com.google.android.libraries.places.internal.zzcfq zzE = zzE(2);
            byte[] bArr = zzE.zza;
            int i2 = zzE.zzc;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            zzE.zzc = i2 + 2;
            this.zzb += 2;
            return this;
        }
        if (i >= 55296 && i < 57344) {
            zzA(63);
            return this;
        }
        if (i < 65536) {
            com.google.android.libraries.places.internal.zzcfq zzE2 = zzE(3);
            byte[] bArr2 = zzE2.zza;
            int i3 = zzE2.zzc;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            zzE2.zzc = i3 + 3;
            this.zzb += 3;
            return this;
        }
        if (i > 1114111) {
            throw new java.lang.IllegalArgumentException("Unexpected code point: 0x".concat(java.lang.String.valueOf(com.google.android.libraries.places.internal.zzcfb.zzc(i))));
        }
        com.google.android.libraries.places.internal.zzcfq zzE3 = zzE(4);
        byte[] bArr3 = zzE3.zza;
        int i4 = zzE3.zzc;
        bArr3[i4] = (byte) ((i >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        zzE3.zzc = i4 + 4;
        this.zzb += 4;
        return this;
    }

    public final com.google.android.libraries.places.internal.zzcff zzy(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        zzz(bArr, 0, bArr.length);
        return this;
    }

    public final com.google.android.libraries.places.internal.zzcff zzz(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        long j = i2;
        com.google.android.libraries.places.internal.zzcfb.zza(bArr.length, i, j);
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                this.zzb += j;
                return this;
            }
            com.google.android.libraries.places.internal.zzcfq zzE = zzE(1);
            int min = java.lang.Math.min(i4 - i3, 8192 - zzE.zzc);
            int i5 = i3 + min;
            kotlin.collections.ArraysKt.copyInto(bArr, zzE.zza, zzE.zzc, i3, i5);
            zzE.zzc += min;
            i3 = i5;
        }
    }

    public final com.google.android.libraries.places.internal.zzcfq zzE(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("unexpected capacity");
        }
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        if (zzcfqVar == null) {
            com.google.android.libraries.places.internal.zzcfq zza = com.google.android.libraries.places.internal.zzcfr.zza();
            this.zza = zza;
            zza.zzg = zza;
            zza.zzf = zza;
            return zza;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
        com.google.android.libraries.places.internal.zzcfq zzcfqVar2 = zzcfqVar.zzg;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar2);
        if (zzcfqVar2.zzc + i <= 8192 && zzcfqVar2.zze) {
            return zzcfqVar2;
        }
        com.google.android.libraries.places.internal.zzcfq zza2 = com.google.android.libraries.places.internal.zzcfr.zza();
        zzcfqVar2.zzc(zza2);
        return zza2;
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final com.google.android.libraries.places.internal.zzcfj zzn(long j) throws java.io.EOFException {
        if (j < 0 || j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 11);
            sb.append("byteCount: ");
            sb.append(j);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (this.zzb < j) {
            throw new java.io.EOFException();
        }
        if (j < 4096) {
            return new com.google.android.libraries.places.internal.zzcfj(zzr(j));
        }
        com.google.android.libraries.places.internal.zzcfj zzG = zzG((int) j);
        zzt(j);
        return zzG;
    }

    public final java.lang.String zzp(long j, java.nio.charset.Charset charset) throws java.io.EOFException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        if (j < 0 || j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 11);
            sb.append("byteCount: ");
            sb.append(j);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (this.zzb < j) {
            throw new java.io.EOFException();
        }
        if (j == 0) {
            return "";
        }
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
        int i = zzcfqVar.zzb;
        int i2 = zzcfqVar.zzc;
        if (i + j > i2) {
            return new java.lang.String(zzr(j), charset);
        }
        int i3 = (int) j;
        java.lang.String str = new java.lang.String(zzcfqVar.zza, i, i3, charset);
        int i4 = i + i3;
        zzcfqVar.zzb = i4;
        this.zzb -= j;
        if (i4 == i2) {
            this.zza = zzcfqVar.zzb();
            com.google.android.libraries.places.internal.zzcfr.zzb(zzcfqVar);
        }
        return str;
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final byte[] zzr(long j) throws java.io.EOFException {
        if (j < 0 || j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 11);
            sb.append("byteCount: ");
            sb.append(j);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (this.zzb < j) {
            throw new java.io.EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int i2 = 0;
        while (i2 < i) {
            int zzs = zzs(bArr, i2, i - i2);
            if (zzs == -1) {
                throw new java.io.EOFException();
            }
            i2 += zzs;
        }
        return bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final void zzt(long j) throws java.io.EOFException {
        while (j > 0) {
            com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
            if (zzcfqVar == null) {
                throw new java.io.EOFException();
            }
            int min = (int) java.lang.Math.min(j, zzcfqVar.zzc - zzcfqVar.zzb);
            long j2 = min;
            this.zzb -= j2;
            j -= j2;
            int i = zzcfqVar.zzb + min;
            zzcfqVar.zzb = i;
            if (i == zzcfqVar.zzc) {
                this.zza = zzcfqVar.zzb();
                com.google.android.libraries.places.internal.zzcfr.zzb(zzcfqVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String zzq(long j) throws java.io.EOFException {
        long j2;
        long j3;
        com.google.android.libraries.places.internal.zzcfq zzcfqVar;
        long j4;
        long j5 = this.zzb;
        long j6 = j5 < Long.MAX_VALUE ? j5 : Long.MAX_VALUE;
        if (j6 != 0 && (zzcfqVar = this.zza) != null) {
            if (j5 < 0) {
                while (j5 > 0) {
                    zzcfqVar = zzcfqVar.zzg;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
                    j5 -= zzcfqVar.zzc - zzcfqVar.zzb;
                }
                if (zzcfqVar != null) {
                    long j7 = 0;
                    loop1: while (j5 < j6) {
                        byte[] bArr = zzcfqVar.zza;
                        int min = (int) java.lang.Math.min(zzcfqVar.zzc, (zzcfqVar.zzb + j6) - j5);
                        for (int i = (int) ((zzcfqVar.zzb + j7) - j5); i < min; i++) {
                            if (bArr[i] == 10) {
                                j4 = i - zzcfqVar.zzb;
                                j3 = j4 + j5;
                                j2 = -1;
                                break loop1;
                            }
                        }
                        j7 = j5 + (zzcfqVar.zzc - zzcfqVar.zzb);
                        zzcfqVar = zzcfqVar.zzf;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
                        j5 = j7;
                    }
                }
            } else {
                j5 = 0;
                while (true) {
                    long j8 = (zzcfqVar.zzc - zzcfqVar.zzb) + j5;
                    if (j8 > 0) {
                        break;
                    }
                    zzcfqVar = zzcfqVar.zzf;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
                    j5 = j8;
                }
                if (zzcfqVar != null) {
                    long j9 = 0;
                    loop6: while (j5 < j6) {
                        byte[] bArr2 = zzcfqVar.zza;
                        int min2 = (int) java.lang.Math.min(zzcfqVar.zzc, (zzcfqVar.zzb + j6) - j5);
                        for (int i2 = (int) ((zzcfqVar.zzb + j9) - j5); i2 < min2; i2++) {
                            if (bArr2[i2] == 10) {
                                j4 = i2 - zzcfqVar.zzb;
                                j3 = j4 + j5;
                                j2 = -1;
                                break loop1;
                            }
                        }
                        j9 = (zzcfqVar.zzc - zzcfqVar.zzb) + j5;
                        zzcfqVar = zzcfqVar.zzf;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
                        j5 = j9;
                    }
                }
            }
            if (j3 == j2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "");
                if (j3 > 0) {
                    long j10 = j3 - 1;
                    if (zzk(j10) == 13) {
                        java.lang.String zzp = zzp(j10, kotlin.text.Charsets.UTF_8);
                        zzt(2L);
                        return zzp;
                    }
                }
                java.lang.String zzp2 = zzp(j3, kotlin.text.Charsets.UTF_8);
                zzt(1L);
                return zzp2;
            }
            com.google.android.libraries.places.internal.zzcff zzcffVar = new com.google.android.libraries.places.internal.zzcff();
            long min3 = java.lang.Math.min(32L, this.zzb);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcffVar, "");
            com.google.android.libraries.places.internal.zzcfb.zza(this.zzb, 0L, min3);
            if (min3 != 0) {
                zzcffVar.zzb += min3;
                com.google.android.libraries.places.internal.zzcfq zzcfqVar2 = this.zza;
                long j11 = 0;
                while (true) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar2);
                    long j12 = zzcfqVar2.zzc - zzcfqVar2.zzb;
                    if (j11 < j12) {
                        break;
                    }
                    zzcfqVar2 = zzcfqVar2.zzf;
                    j11 -= j12;
                }
                while (min3 > 0) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar2);
                    com.google.android.libraries.places.internal.zzcfq zza = zzcfqVar2.zza();
                    int i3 = zza.zzb + ((int) j11);
                    zza.zzb = i3;
                    zza.zzc = java.lang.Math.min(i3 + ((int) min3), zza.zzc);
                    com.google.android.libraries.places.internal.zzcfq zzcfqVar3 = zzcffVar.zza;
                    if (zzcfqVar3 == null) {
                        zza.zzg = zza;
                        zza.zzf = zza.zzg;
                        zzcffVar.zza = zza.zzf;
                    } else {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar3);
                        com.google.android.libraries.places.internal.zzcfq zzcfqVar4 = zzcfqVar3.zzg;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar4);
                        zzcfqVar4.zzc(zza);
                    }
                    min3 -= zza.zzc - zza.zzb;
                    zzcfqVar2 = zzcfqVar2.zzf;
                    j11 = 0;
                }
            }
            long min4 = java.lang.Math.min(this.zzb, Long.MAX_VALUE);
            java.lang.String zzg = zzcffVar.zzn(zzcffVar.zzb).zzg();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(min4).length() + 29 + java.lang.String.valueOf(zzg).length() + 1);
            sb.append("\\n not found: limit=");
            sb.append(min4);
            sb.append(" content=");
            sb.append(zzg);
            sb.append("…");
            throw new java.io.EOFException(sb.toString());
        }
        j2 = -1;
        j3 = -1;
        if (j3 == j2) {
        }
    }

    public final com.google.android.libraries.places.internal.zzcfj zzG(int i) {
        if (i == 0) {
            return com.google.android.libraries.places.internal.zzcfj.zza;
        }
        com.google.android.libraries.places.internal.zzcfb.zza(this.zzb, 0L, i);
        com.google.android.libraries.places.internal.zzcfq zzcfqVar = this.zza;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar);
            int i5 = zzcfqVar.zzc;
            int i6 = zzcfqVar.zzb;
            if (i5 == i6) {
                throw new java.lang.AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            zzcfqVar = zzcfqVar.zzf;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        com.google.android.libraries.places.internal.zzcfq zzcfqVar2 = this.zza;
        int i7 = 0;
        while (i2 < i) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzcfqVar2);
            bArr[i7] = zzcfqVar2.zza;
            i2 += zzcfqVar2.zzc - zzcfqVar2.zzb;
            iArr[i7] = java.lang.Math.min(i2, i);
            iArr[bArr.length + i7] = zzcfqVar2.zzb;
            zzcfqVar2.zzd = true;
            i7++;
            zzcfqVar2 = zzcfqVar2.zzf;
        }
        return new com.google.android.libraries.places.internal.zzcfs(bArr, iArr);
    }

    @Override // com.google.android.libraries.places.internal.zzcfh
    public final boolean zzf() {
        return this.zzb == 0;
    }

    public final void zzd(long j) {
        this.zzb = j;
    }

    public final long zzb() {
        return this.zzb;
    }
}
