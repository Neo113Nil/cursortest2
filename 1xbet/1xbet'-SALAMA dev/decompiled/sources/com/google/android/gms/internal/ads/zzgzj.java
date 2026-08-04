package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzgzj extends zzgvy {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, f.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzgvy zzd;
    private final zzgvy zze;
    private final int zzf;
    private final int zzg;

    public static zzgvy zzC(zzgvy zzgvyVar, zzgvy zzgvyVar2) {
        if (zzgvyVar2.zzd() == 0) {
            return zzgvyVar;
        }
        if (zzgvyVar.zzd() == 0) {
            return zzgvyVar2;
        }
        int iZzd = zzgvyVar2.zzd() + zzgvyVar.zzd();
        if (iZzd < 128) {
            return zzD(zzgvyVar, zzgvyVar2);
        }
        if (zzgvyVar instanceof zzgzj) {
            zzgzj zzgzjVar = (zzgzj) zzgvyVar;
            if (zzgvyVar2.zzd() + zzgzjVar.zze.zzd() < 128) {
                return new zzgzj(zzgzjVar.zzd, zzD(zzgzjVar.zze, zzgvyVar2));
            }
            if (zzgzjVar.zzd.zzf() > zzgzjVar.zze.zzf() && zzgzjVar.zzg > zzgvyVar2.zzf()) {
                return new zzgzj(zzgzjVar.zzd, new zzgzj(zzgzjVar.zze, zzgvyVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzgvyVar.zzf(), zzgvyVar2.zzf()) + 1) ? new zzgzj(zzgvyVar, zzgvyVar2) : zzgzg.zza(new zzgzg(null), zzgvyVar, zzgvyVar2);
    }

    private static zzgvy zzD(zzgvy zzgvyVar, zzgvy zzgvyVar2) {
        int iZzd = zzgvyVar.zzd();
        int iZzd2 = zzgvyVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzgvyVar.zzz(bArr, 0, 0, iZzd);
        zzgvyVar2.zzz(bArr, 0, iZzd, iZzd2);
        return new zzgvv(bArr);
    }

    public static int zzc(int i7) {
        int[] iArr = zza;
        int length = iArr.length;
        return i7 >= 47 ? f.API_PRIORITY_OTHER : iArr[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgvy)) {
            return false;
        }
        zzgvy zzgvyVar = (zzgvy) obj;
        if (this.zzc != zzgvyVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzr = zzr();
        int iZzr2 = zzgvyVar.zzr();
        if (iZzr != 0 && iZzr2 != 0 && iZzr != iZzr2) {
            return false;
        }
        zzgzi zzgziVar = null;
        zzgzh zzgzhVar = new zzgzh(this, zzgziVar);
        zzgvu zzgvuVarZza = zzgzhVar.next();
        zzgzh zzgzhVar2 = new zzgzh(zzgvyVar, zzgziVar);
        zzgvu zzgvuVarZza2 = zzgzhVar2.next();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int iZzd = zzgvuVarZza.zzd() - i7;
            int iZzd2 = zzgvuVarZza2.zzd() - i8;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i7 == 0 ? zzgvuVarZza.zzg(zzgvuVarZza2, i8, iMin) : zzgvuVarZza2.zzg(zzgvuVarZza, i7, iMin))) {
                return false;
            }
            i9 += iMin;
            int i10 = this.zzc;
            if (i9 >= i10) {
                if (i9 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                zzgvuVarZza = zzgzhVar.next();
                i7 = 0;
            } else {
                i7 += iMin;
            }
            if (iMin == iZzd2) {
                zzgvuVarZza = zzgvuVarZza;
                zzgvuVarZza2 = zzgzhVar2.next();
                i8 = 0;
            } else {
                zzgvuVarZza = zzgvuVarZza;
                i8 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvy, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzgzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final byte zza(int i7) {
        zzgvy.zzy(i7, this.zzc);
        return zzb(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final byte zzb(int i7) {
        int i8 = this.zzf;
        return i7 < i8 ? this.zzd.zzb(i7) : this.zze.zzb(i7 - i8);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final void zze(byte[] bArr, int i7, int i8, int i9) {
        int i10 = i7 + i9;
        int i11 = this.zzf;
        if (i10 <= i11) {
            this.zzd.zze(bArr, i7, i8, i9);
        } else {
            if (i7 >= i11) {
                this.zze.zze(bArr, i7 - i11, i8, i9);
                return;
            }
            int i12 = i11 - i7;
            this.zzd.zze(bArr, i7, i8, i12);
            this.zze.zze(bArr, 0, i8 + i12, i9 - i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final int zzi(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzi(i7, i8, i9);
        }
        if (i8 >= i11) {
            return this.zze.zzi(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return this.zze.zzi(this.zzd.zzi(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final int zzj(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        int i11 = this.zzf;
        if (i10 <= i11) {
            return this.zzd.zzj(i7, i8, i9);
        }
        if (i8 >= i11) {
            return this.zze.zzj(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return this.zze.zzj(this.zzd.zzj(i7, i8, i12), 0, i9 - i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final zzgvy zzk(int i7, int i8) {
        int iZzq = zzgvy.zzq(i7, i8, this.zzc);
        if (iZzq == 0) {
            return zzgvy.zzb;
        }
        if (iZzq == this.zzc) {
            return this;
        }
        int i9 = this.zzf;
        if (i8 <= i9) {
            return this.zzd.zzk(i7, i8);
        }
        if (i7 >= i9) {
            return this.zze.zzk(i7 - i9, i8 - i9);
        }
        zzgvy zzgvyVar = this.zzd;
        return new zzgzj(zzgvyVar.zzk(i7, zzgvyVar.zzd()), this.zze.zzk(0, i8 - this.zzf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgvy
    public final zzgwe zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        zzgzh zzgzhVar = new zzgzh(this, null);
        while (zzgzhVar.hasNext()) {
            arrayList.add(zzgzhVar.next().zzn());
        }
        int i7 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i7 = byteBuffer.hasArray() ? i7 | 1 : byteBuffer.isDirect() ? i7 | 2 : i7 | 4;
        }
        return i7 == 2 ? new zzgwa(arrayList, iRemaining, true, objArr == true ? 1 : 0) : zzgwe.zzG(new zzgxw(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final void zzo(zzgvp zzgvpVar) {
        this.zzd.zzo(zzgvpVar);
        this.zze.zzo(zzgvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final boolean zzp() {
        zzgvy zzgvyVar = this.zzd;
        zzgvy zzgvyVar2 = this.zze;
        return zzgvyVar2.zzj(zzgvyVar.zzj(0, 0, this.zzf), 0, zzgvyVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    /* JADX INFO: renamed from: zzs */
    public final zzgvt iterator() {
        return new zzgzf(this);
    }

    private zzgzj(zzgvy zzgvyVar, zzgvy zzgvyVar2) {
        this.zzd = zzgvyVar;
        this.zze = zzgvyVar2;
        int iZzd = zzgvyVar.zzd();
        this.zzf = iZzd;
        this.zzc = zzgvyVar2.zzd() + iZzd;
        this.zzg = Math.max(zzgvyVar.zzf(), zzgvyVar2.zzf()) + 1;
    }
}
