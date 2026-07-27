package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzihn extends zziei {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zziei zzd;
    private final zziei zze;
    private final int zzf;
    private final int zzg;

    private zzihn(zziei zzieiVar, zziei zzieiVar2) {
        this.zzd = zzieiVar;
        this.zze = zzieiVar2;
        int zzb2 = zzieiVar.zzb();
        this.zzf = zzb2;
        this.zzc = zzb2 + zzieiVar2.zzb();
        this.zzg = Math.max(zzieiVar.zzp(), zzieiVar2.zzp()) + 1;
    }

    /* synthetic */ zzihn(zziei zzieiVar, zziei zzieiVar2, byte[] bArr) {
        this(zzieiVar, zzieiVar2);
    }

    private static zziei zzG(zziei zzieiVar, zziei zzieiVar2) {
        int zzb2 = zzieiVar.zzb();
        int zzb3 = zzieiVar2.zzb();
        byte[] bArr = new byte[zzb2 + zzb3];
        zzieiVar.zzz(bArr, 0, 0, zzb2);
        zzieiVar2.zzz(bArr, 0, zzb2, zzb3);
        return zziei.zzv(bArr);
    }

    static zziei zzk(zziei zzieiVar, zziei zzieiVar2) {
        if (zzieiVar2.zzb() == 0) {
            return zzieiVar;
        }
        if (zzieiVar.zzb() == 0) {
            return zzieiVar2;
        }
        int zzb2 = zzieiVar.zzb() + zzieiVar2.zzb();
        if (zzb2 < 128) {
            return zzG(zzieiVar, zzieiVar2);
        }
        if (zzieiVar instanceof zzihn) {
            zzihn zzihnVar = (zzihn) zzieiVar;
            zziei zzieiVar3 = zzihnVar.zze;
            if (zzieiVar3.zzb() + zzieiVar2.zzb() < 128) {
                return new zzihn(zzihnVar.zzd, zzG(zzieiVar3, zzieiVar2));
            }
            zziei zzieiVar4 = zzihnVar.zzd;
            if (zzieiVar4.zzp() > zzieiVar3.zzp() && zzihnVar.zzg > zzieiVar2.zzp()) {
                return new zzihn(zzieiVar4, new zzihn(zzieiVar3, zzieiVar2));
            }
        }
        return zzb2 >= zzn(Math.max(zzieiVar.zzp(), zzieiVar2.zzp()) + 1) ? new zzihn(zzieiVar, zzieiVar2) : zzihl.zza(zzieiVar, zzieiVar2, new ArrayDeque());
    }

    static int zzn(int i) {
        int[] iArr = zzb;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zziei, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzihk(this);
    }

    final /* synthetic */ zziei zzF() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    final byte zza(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zza(i) : this.zze.zza(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei zzc(int i, int i2) {
        return zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei zzd(int i, int i2) {
        int i3 = this.zzc;
        int zzD = zzD(i, i2, i3);
        if (zzD == 0) {
            return zziei.zza;
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
        zziei zzieiVar = this.zzd;
        return new zzihn(zzieiVar.zzc(i, zzieiVar.zzb()), this.zze.zzc(0, i5));
    }

    @Override // com.google.android.gms.internal.ads.zziei
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

    @Override // com.google.android.gms.internal.ads.zziei
    public final ByteBuffer zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    final void zzg(zzidz zzidzVar) throws IOException {
        this.zzd.zzg(zzidzVar);
        this.zze.zzg(zzidzVar);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    protected final String zzh(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean zzi() {
        zzihm zzihmVar = new zzihm(this, null);
        while (zzihmVar.hasNext()) {
            if (!zzihmVar.next().zzi()) {
                return zziim.zza(zzA());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean zzj(zziei zzieiVar) {
        byte[] bArr = null;
        zzihm zzihmVar = new zzihm(this, bArr);
        zzief next = zzihmVar.next();
        zzihm zzihmVar2 = new zzihm(zzieiVar, bArr);
        zzief next2 = zzihmVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzb2 = next.zzb() - i;
            int zzb3 = next2.zzb() - i2;
            int min = Math.min(zzb2, zzb3);
            if (!(i == 0 ? next.zzk(next2, i2, min) : next2.zzk(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzb2) {
                i = 0;
                next = zzihmVar.next();
            } else {
                i += min;
                next = next;
            }
            if (min == zzb3) {
                next2 = zzihmVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zziei
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

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziem zzm() {
        ArrayList arrayList = new ArrayList();
        zzihm zzihmVar = new zzihm(this, null);
        while (zzihmVar.hasNext()) {
            arrayList.add(zzihmVar.next().zzf());
        }
        int i = zziem.zze;
        return zziem.zzH(new zzigf(arrayList), 4096);
    }

    final /* synthetic */ zziei zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    protected final int zzp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    protected final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    /* renamed from: zzr */
    public final zzied iterator() {
        return new zzihk(this);
    }
}
