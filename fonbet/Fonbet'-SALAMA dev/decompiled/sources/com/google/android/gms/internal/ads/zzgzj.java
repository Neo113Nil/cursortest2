package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
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
        int zzd = zzgvyVar2.zzd() + zzgvyVar.zzd();
        if (zzd < 128) {
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
        return zzd >= zzc(Math.max(zzgvyVar.zzf(), zzgvyVar2.zzf()) + 1) ? new zzgzj(zzgvyVar, zzgvyVar2) : zzgzg.zza(new zzgzg(null), zzgvyVar, zzgvyVar2);
    }

    private static zzgvy zzD(zzgvy zzgvyVar, zzgvy zzgvyVar2) {
        int zzd = zzgvyVar.zzd();
        int zzd2 = zzgvyVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgvyVar.zzz(bArr, 0, 0, zzd);
        zzgvyVar2.zzz(bArr, 0, zzd, zzd2);
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
        int zzr = zzr();
        int zzr2 = zzgvyVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgzi zzgziVar = null;
        zzgzh zzgzhVar = new zzgzh(this, zzgziVar);
        zzgvu next = zzgzhVar.next();
        zzgzh zzgzhVar2 = new zzgzh(zzgvyVar, zzgziVar);
        zzgvu next2 = zzgzhVar2.next();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int zzd = next.zzd() - i7;
            int zzd2 = next2.zzd() - i8;
            int min = Math.min(zzd, zzd2);
            if (!(i7 == 0 ? next.zzg(next2, i8, min) : next2.zzg(next, i7, min))) {
                return false;
            }
            i9 += min;
            int i10 = this.zzc;
            if (i9 >= i10) {
                if (i9 == i10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzgzhVar.next();
                i7 = 0;
            } else {
                i7 += min;
                next = next;
            }
            if (min == zzd2) {
                next2 = zzgzhVar2.next();
                i8 = 0;
            } else {
                i8 += min;
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
        int zzq = zzgvy.zzq(i7, i8, this.zzc);
        if (zzq == 0) {
            return zzgvy.zzb;
        }
        if (zzq == this.zzc) {
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
        ArrayList arrayList = new ArrayList();
        Object[] objArr = 0;
        zzgzh zzgzhVar = new zzgzh(this, null);
        while (zzgzhVar.hasNext()) {
            arrayList.add(zzgzhVar.next().zzn());
        }
        Iterator it = arrayList.iterator();
        int i7 = 0;
        int i8 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i8 += byteBuffer.remaining();
            i7 = byteBuffer.hasArray() ? i7 | 1 : byteBuffer.isDirect() ? i7 | 2 : i7 | 4;
        }
        return i7 == 2 ? new zzgwa(arrayList, i8, true, objArr == true ? 1 : 0) : zzgwe.zzG(new zzgxw(arrayList), 4096);
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
    /* renamed from: zzs */
    public final zzgvt iterator() {
        return new zzgzf(this);
    }

    private zzgzj(zzgvy zzgvyVar, zzgvy zzgvyVar2) {
        this.zzd = zzgvyVar;
        this.zze = zzgvyVar2;
        int zzd = zzgvyVar.zzd();
        this.zzf = zzd;
        this.zzc = zzgvyVar2.zzd() + zzd;
        this.zzg = Math.max(zzgvyVar.zzf(), zzgvyVar2.zzf()) + 1;
    }
}
