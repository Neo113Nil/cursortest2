package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzigg extends com.google.android.gms.internal.ads.zzida {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final com.google.android.gms.internal.ads.zzida zzd;
    private final com.google.android.gms.internal.ads.zzida zze;
    private final int zzf;
    private final int zzg;

    private zzigg(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzida zzidaVar2) {
        this.zzd = zzidaVar;
        this.zze = zzidaVar2;
        int zzb2 = zzidaVar.zzb();
        this.zzf = zzb2;
        this.zzc = zzb2 + zzidaVar2.zzb();
        this.zzg = java.lang.Math.max(zzidaVar.zzp(), zzidaVar2.zzp()) + 1;
    }

    /* synthetic */ zzigg(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzida zzidaVar2, byte[] bArr) {
        this(zzidaVar, zzidaVar2);
    }

    private static com.google.android.gms.internal.ads.zzida zzG(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzida zzidaVar2) {
        int zzb2 = zzidaVar.zzb();
        int zzb3 = zzidaVar2.zzb();
        byte[] bArr = new byte[zzb2 + zzb3];
        zzidaVar.zzz(bArr, 0, 0, zzb2);
        zzidaVar2.zzz(bArr, 0, zzb2, zzb3);
        return com.google.android.gms.internal.ads.zzida.zzv(bArr);
    }

    static com.google.android.gms.internal.ads.zzida zzk(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzida zzidaVar2) {
        if (zzidaVar2.zzb() == 0) {
            return zzidaVar;
        }
        if (zzidaVar.zzb() == 0) {
            return zzidaVar2;
        }
        int zzb2 = zzidaVar.zzb() + zzidaVar2.zzb();
        if (zzb2 < 128) {
            return zzG(zzidaVar, zzidaVar2);
        }
        if (zzidaVar instanceof com.google.android.gms.internal.ads.zzigg) {
            com.google.android.gms.internal.ads.zzigg zziggVar = (com.google.android.gms.internal.ads.zzigg) zzidaVar;
            com.google.android.gms.internal.ads.zzida zzidaVar3 = zziggVar.zze;
            if (zzidaVar3.zzb() + zzidaVar2.zzb() < 128) {
                return new com.google.android.gms.internal.ads.zzigg(zziggVar.zzd, zzG(zzidaVar3, zzidaVar2));
            }
            com.google.android.gms.internal.ads.zzida zzidaVar4 = zziggVar.zzd;
            if (zzidaVar4.zzp() > zzidaVar3.zzp() && zziggVar.zzg > zzidaVar2.zzp()) {
                return new com.google.android.gms.internal.ads.zzigg(zzidaVar4, new com.google.android.gms.internal.ads.zzigg(zzidaVar3, zzidaVar2));
            }
        }
        return zzb2 >= zzn(java.lang.Math.max(zzidaVar.zzp(), zzidaVar2.zzp()) + 1) ? new com.google.android.gms.internal.ads.zzigg(zzidaVar, zzidaVar2) : com.google.android.gms.internal.ads.zzige.zza(zzidaVar, zzidaVar2, new java.util.ArrayDeque());
    }

    static int zzn(int i) {
        int[] iArr = zzb;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzida, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return new com.google.android.gms.internal.ads.zzigd(this);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzida zzF() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    final byte zza(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zza(i) : this.zze.zza(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final com.google.android.gms.internal.ads.zzida zzc(int i, int i2) {
        return zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final com.google.android.gms.internal.ads.zzida zzd(int i, int i2) {
        int i3 = this.zzc;
        int zzD = zzD(i, i2, i3);
        if (zzD == 0) {
            return com.google.android.gms.internal.ads.zzida.zza;
        }
        if (zzD == i3) {
            return this;
        }
        int i4 = this.zzf;
        if (i2 <= i4) {
            return this.zzd.zzc(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.zze.zzc(i - i4, i5);
        }
        com.google.android.gms.internal.ads.zzida zzidaVar = this.zzd;
        return new com.google.android.gms.internal.ads.zzigg(zzidaVar.zzc(i, zzidaVar.zzb()), this.zze.zzc(0, i5));
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.zze(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final java.nio.ByteBuffer zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    final void zzg(com.google.android.gms.internal.ads.zzicr zzicrVar) throws java.io.IOException {
        this.zzd.zzg(zzicrVar);
        this.zze.zzg(zzicrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final java.lang.String zzh(java.nio.charset.Charset charset) {
        return new java.lang.String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzi() {
        com.google.android.gms.internal.ads.zzigf zzigfVar = new com.google.android.gms.internal.ads.zzigf(this, null);
        while (zzigfVar.hasNext()) {
            if (!zzigfVar.next().zzi()) {
                return com.google.android.gms.internal.ads.zzihf.zza(zzA());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzj(com.google.android.gms.internal.ads.zzida zzidaVar) {
        byte[] bArr = null;
        com.google.android.gms.internal.ads.zzigf zzigfVar = new com.google.android.gms.internal.ads.zzigf(this, bArr);
        com.google.android.gms.internal.ads.zzicx next = zzigfVar.next();
        com.google.android.gms.internal.ads.zzigf zzigfVar2 = new com.google.android.gms.internal.ads.zzigf(zzidaVar, bArr);
        com.google.android.gms.internal.ads.zzicx next2 = zzigfVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzb2 = next.zzb() - i;
            int zzb3 = next2.zzb() - i2;
            int min = java.lang.Math.min(zzb2, zzb3);
            if (!(i == 0 ? next.zzk(next2, i2, min) : next2.zzk(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new java.lang.IllegalStateException();
            }
            if (min == zzb2) {
                i = 0;
                next = zzigfVar.next();
            } else {
                i += min;
                next = next;
            }
            if (min == zzb3) {
                next2 = zzigfVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final int zzl(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzl(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzl(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzl(this.zzd.zzl(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final com.google.android.gms.internal.ads.zzide zzm() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.gms.internal.ads.zzigf zzigfVar = new com.google.android.gms.internal.ads.zzigf(this, null);
        while (zzigfVar.hasNext()) {
            arrayList.add(zzigfVar.next().zzf());
        }
        int i = com.google.android.gms.internal.ads.zzide.zze;
        return com.google.android.gms.internal.ads.zzide.zzH(new com.google.android.gms.internal.ads.zzieu(arrayList), 4096);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzida zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final int zzp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    /* renamed from: zzr */
    public final com.google.android.gms.internal.ads.zzicv iterator() {
        return new com.google.android.gms.internal.ads.zzigd(this);
    }
}
