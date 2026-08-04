package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.nio.ByteBuffer;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzrf extends zzch {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zzrf() {
        byte[] bArr = zzen.zzc;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final int zzq(int i7) {
        int iZzr = ((zzr(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzcv.zzf(iZzr >= 0);
        int iMin = (int) Math.min((i7 * 0.2f) + 0.5f, iZzr);
        int i8 = this.zzd;
        return (iMin / i8) * i8;
    }

    private final int zzr(long j) {
        return (int) ((j * ((long) this.zzb.zzb)) / 1000000);
    }

    private static int zzs(byte b7, byte b8) {
        return (b7 << 8) | (b8 & 255);
    }

    private final void zzt(boolean z4) {
        int i7;
        int length;
        int i8 = this.zzk;
        int length2 = this.zzi.length;
        if (i8 != length2) {
            if (!z4) {
                return;
            } else {
                z4 = true;
            }
        }
        if (this.zzh == 0) {
            if (z4) {
                zzu(i8, 3);
                length = i8;
            } else {
                zzcv.zzf(i8 >= (length2 >> 1));
                length = this.zzi.length >> 1;
                zzu(length, 0);
            }
            i7 = length;
        } else {
            int i9 = length2 >> 1;
            int i10 = i8 - i9;
            if (z4) {
                int iZzq = zzq(i10) + (this.zzi.length >> 1);
                zzu(iZzq, 2);
                int i11 = i9 + i10;
                i7 = iZzq;
                length = i11;
            } else {
                int iZzq2 = zzq(i10);
                zzu(iZzq2, 1);
                i7 = iZzq2;
                length = i10;
            }
        }
        zzcv.zzg(length % this.zzd == 0, "bytesConsumed is not aligned to frame size: %s" + length);
        zzcv.zzf(i8 >= i7);
        this.zzk -= length;
        int i12 = this.zzj + length;
        this.zzj = i12;
        this.zzj = i12 % this.zzi.length;
        int i13 = this.zzh;
        int i14 = this.zzd;
        this.zzh = (i7 / i14) + i13;
        this.zzg += (long) ((length - i7) / i14);
    }

    private final void zzu(int i7, int i8) {
        int i9;
        if (i7 == 0) {
            return;
        }
        zzcv.zzd(this.zzk >= i7);
        if (i8 == 2) {
            int i10 = this.zzj;
            int i11 = this.zzk;
            int i12 = i10 + i11;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i12 <= length) {
                System.arraycopy(bArr, i12 - i7, this.zzl, 0, i7);
            } else {
                int i13 = i11 - (length - i10);
                if (i13 >= i7) {
                    System.arraycopy(bArr, i13 - i7, this.zzl, 0, i7);
                } else {
                    int i14 = i7 - i13;
                    System.arraycopy(bArr, length - i14, this.zzl, 0, i14);
                    System.arraycopy(this.zzi, 0, this.zzl, i14, i13);
                }
            }
        } else {
            int i15 = this.zzj;
            int i16 = i15 + i7;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i16 <= length2) {
                System.arraycopy(bArr2, i15, this.zzl, 0, i7);
            } else {
                int i17 = length2 - i15;
                System.arraycopy(bArr2, i15, this.zzl, 0, i17);
                System.arraycopy(this.zzi, 0, this.zzl, i17, i7 - i17);
            }
        }
        zzcv.zze(i7 % this.zzd == 0, "sizeToOutput is not aligned to frame size: " + i7);
        zzcv.zzf(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzcv.zze(i7 % this.zzd == 0, k.d(i7, "byteOutput size is not aligned to frame size "));
        if (i8 != 3) {
            for (int i18 = 0; i18 < i7; i18 += 2) {
                int i19 = i18 + 1;
                int iZzs = zzs(bArr3[i19], bArr3[i18]);
                if (i8 == 0) {
                    i9 = ((((i18 * zzbbd.zzq.zzf) / (i7 - 1)) * (-90)) / zzbbd.zzq.zzf) + 100;
                } else {
                    i9 = 10;
                    if (i8 == 2) {
                        i9 = 10 + (((90000 * i18) / (i7 - 1)) / zzbbd.zzq.zzf);
                    }
                }
                int i20 = (iZzs * i9) / 100;
                if (i20 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = 127;
                } else if (i20 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = -128;
                } else {
                    bArr3[i18] = (byte) (i20 & 255);
                    bArr3[i19] = (byte) (i20 >> 8);
                }
            }
        }
        zzj(i7).put(bArr3, 0, i7).flip();
    }

    private static final boolean zzv(byte b7, byte b8) {
        return Math.abs(zzs(b7, b8)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzcg
    public final void zze(ByteBuffer byteBuffer) {
        int iLimit;
        int i7;
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzn()) {
            if (this.zzf != 0) {
                zzcv.zzf(this.zzj < this.zzi.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzv(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i8 = this.zzd;
                            iLimit = (iPosition2 / i8) * i8;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i9 = this.zzj;
                int i10 = this.zzk;
                int i11 = i9 + i10;
                int length = this.zzi.length;
                if (i11 < length) {
                    i7 = length - i11;
                } else {
                    i11 = i10 - (length - i9);
                    i7 = i9 - i11;
                }
                int iMin = Math.min(iPosition3, i7);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.zzi, i11, iMin);
                int i12 = this.zzk + iMin;
                this.zzk = i12;
                zzcv.zzf(i12 <= this.zzi.length);
                boolean z4 = iLimit < iLimit2 && iPosition3 < i7;
                zzt(z4);
                if (z4) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.zzi.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (zzv(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i13 = this.zzd;
                            iPosition = AbstractC0486a1.d(iLimit4, i13, i13, i13);
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    zzj(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch, com.google.android.gms.internal.ads.zzcg
    public final boolean zzg() {
        return super.zzg() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzce zzi(zzce zzceVar) throws zzcf {
        if (zzceVar.zzd == 2) {
            return zzceVar.zzb == -1 ? zzce.zza : zzceVar;
        }
        throw new zzcf("Unhandled input format:", zzceVar);
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzk() {
        if (zzg()) {
            int i7 = this.zzb.zzc;
            this.zzd = i7 + i7;
            int iZzr = zzr(100000L) / 2;
            int i8 = this.zzd;
            int i9 = (iZzr / i8) * i8;
            int i10 = i9 + i9;
            if (this.zzi.length != i10) {
                this.zzi = new byte[i10];
                this.zzl = new byte[i10];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzl() {
        if (this.zzk > 0) {
            zzt(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzm() {
        this.zze = false;
        byte[] bArr = zzen.zzc;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final long zzo() {
        return this.zzg;
    }

    public final void zzp(boolean z4) {
        this.zze = z4;
    }
}
