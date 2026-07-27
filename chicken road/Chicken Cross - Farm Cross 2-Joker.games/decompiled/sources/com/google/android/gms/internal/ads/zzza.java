package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzza {
    private final zzabp zza;
    private final zzeu zzb = new zzeu(32);
    private zzyz zzc;
    private zzyz zzd;
    private zzyz zze;
    private long zzf;

    public zzza(zzabp zzabpVar) {
        this.zza = zzabpVar;
        zzyz zzyzVar = new zzyz(0L, 65536);
        this.zzc = zzyzVar;
        this.zzd = zzyzVar;
        this.zze = zzyzVar;
    }

    private final int zzi(int i) {
        zzyz zzyzVar = this.zze;
        if (zzyzVar.zzc == null) {
            zzabn zza = this.zza.zza();
            zzyz zzyzVar2 = new zzyz(this.zze.zzb, 65536);
            zzyzVar.zzc = zza;
            zzyzVar.zzd = zzyzVar2;
        }
        return Math.min(i, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i) {
        long j = this.zzf + i;
        this.zzf = j;
        zzyz zzyzVar = this.zze;
        if (j == zzyzVar.zzb) {
            this.zze = zzyzVar.zzd;
        }
    }

    private static zzyz zzk(zzyz zzyzVar, zziy zziyVar, zzzb zzzbVar, zzeu zzeuVar) {
        zzyz zzyzVar2;
        if (zziyVar.zzk()) {
            long j = zzzbVar.zzb;
            int i = 1;
            zzeuVar.zza(1);
            zzyz zzm = zzm(zzyzVar, j, zzeuVar.zzi(), 1);
            long j2 = j + 1;
            byte b = zzeuVar.zzi()[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            zziv zzivVar = zziyVar.zzb;
            byte[] bArr = zzivVar.zza;
            if (bArr == null) {
                zzivVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            zzyzVar2 = zzm(zzm, j2, zzivVar.zza, i3);
            long j3 = j2 + i3;
            if (z) {
                zzeuVar.zza(2);
                zzyzVar2 = zzm(zzyzVar2, j3, zzeuVar.zzi(), 2);
                j3 += 2;
                i = zzeuVar.zzt();
            }
            int i4 = i;
            int[] iArr = zzivVar.zzd;
            if (iArr == null || iArr.length < i4) {
                iArr = new int[i4];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzivVar.zze;
            if (iArr3 == null || iArr3.length < i4) {
                iArr3 = new int[i4];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i5 = i4 * 6;
                zzeuVar.zza(i5);
                zzyzVar2 = zzm(zzyzVar2, j3, zzeuVar.zzi(), i5);
                j3 += i5;
                zzeuVar.zzh(0);
                for (int i6 = 0; i6 < i4; i6++) {
                    iArr2[i6] = zzeuVar.zzt();
                    iArr4[i6] = zzeuVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzzbVar.zza - ((int) (j3 - zzzbVar.zzb));
            }
            zzahs zzahsVar = zzzbVar.zzc;
            String str = zzfm.zza;
            zzivVar.zza(i4, iArr2, iArr4, zzahsVar.zzb, zzivVar.zza, zzahsVar.zza, zzahsVar.zzc, zzahsVar.zzd);
            long j4 = zzzbVar.zzb;
            int i7 = (int) (j3 - j4);
            zzzbVar.zzb = j4 + i7;
            zzzbVar.zza -= i7;
        } else {
            zzyzVar2 = zzyzVar;
        }
        if (!zziyVar.zze()) {
            zziyVar.zzj(zzzbVar.zza);
            return zzl(zzyzVar2, zzzbVar.zzb, zziyVar.zzc, zzzbVar.zza);
        }
        zzeuVar.zza(4);
        zzyz zzm2 = zzm(zzyzVar2, zzzbVar.zzb, zzeuVar.zzi(), 4);
        int zzH = zzeuVar.zzH();
        zzzbVar.zzb += 4;
        zzzbVar.zza -= 4;
        zziyVar.zzj(zzH);
        zzyz zzl = zzl(zzm2, zzzbVar.zzb, zziyVar.zzc, zzH);
        zzzbVar.zzb += zzH;
        int i8 = zzzbVar.zza - zzH;
        zzzbVar.zza = i8;
        ByteBuffer byteBuffer = zziyVar.zze;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            zziyVar.zze = ByteBuffer.allocate(i8);
        } else {
            zziyVar.zze.clear();
        }
        return zzl(zzl, zzzbVar.zzb, zziyVar.zze, zzzbVar.zza);
    }

    private static zzyz zzl(zzyz zzyzVar, long j, ByteBuffer byteBuffer, int i) {
        zzyz zzn = zzn(zzyzVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzn.zzb - j));
            byteBuffer.put(zzn.zzc.zza, zzn.zzb(j), min);
            i -= min;
            j += min;
            if (j == zzn.zzb) {
                zzn = zzn.zzd;
            }
        }
        return zzn;
    }

    private static zzyz zzm(zzyz zzyzVar, long j, byte[] bArr, int i) {
        zzyz zzn = zzn(zzyzVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzn.zzb - j));
            System.arraycopy(zzn.zzc.zza, zzn.zzb(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == zzn.zzb) {
                zzn = zzn.zzd;
            }
        }
        return zzn;
    }

    private static zzyz zzn(zzyz zzyzVar, long j) {
        while (j >= zzyzVar.zzb) {
            zzyzVar = zzyzVar.zzd;
        }
        return zzyzVar;
    }

    public final void zza() {
        zzyz zzyzVar = this.zzc;
        if (zzyzVar.zzc != null) {
            this.zza.zzc(zzyzVar);
            zzyzVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        zzyz zzyzVar2 = this.zzc;
        this.zzd = zzyzVar2;
        this.zze = zzyzVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zziy zziyVar, zzzb zzzbVar) {
        this.zzd = zzk(this.zzd, zziyVar, zzzbVar, this.zzb);
    }

    public final void zzd(zziy zziyVar, zzzb zzzbVar) {
        zzk(this.zzd, zziyVar, zzzbVar, this.zzb);
    }

    public final void zze(long j) {
        zzyz zzyzVar;
        if (j != -1) {
            while (true) {
                zzyzVar = this.zzc;
                if (j < zzyzVar.zzb) {
                    break;
                }
                this.zza.zzb(zzyzVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzyzVar.zza) {
                this.zzd = zzyzVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzyz zzyzVar = this.zze;
        int zza = zzjVar.zza(zzyzVar.zzc.zza, zzyzVar.zzb(this.zzf), zzi);
        if (zza != -1) {
            zzj(zza);
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzeu zzeuVar, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzyz zzyzVar = this.zze;
            zzeuVar.zzm(zzyzVar.zzc.zza, zzyzVar.zzb(this.zzf), zzi);
            i -= zzi;
            zzj(zzi);
        }
    }
}
