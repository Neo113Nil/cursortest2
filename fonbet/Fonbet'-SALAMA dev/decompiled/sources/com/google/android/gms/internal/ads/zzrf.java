package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import com.google.android.gms.internal.ads.zzbbd;
import e1.k;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
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
        int zzr = ((zzr(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzcv.zzf(zzr >= 0);
        int min = (int) Math.min((i7 * 0.2f) + 0.5f, zzr);
        int i8 = this.zzd;
        return (min / i8) * i8;
    }

    private final int zzr(long j) {
        return (int) ((j * this.zzb.zzb) / 1000000);
    }

    private static int zzs(byte b7, byte b8) {
        return (b7 << 8) | (b8 & 255);
    }

    private final void zzt(boolean z4) {
        int i7;
        int i8;
        int i9 = this.zzk;
        int length = this.zzi.length;
        if (i9 != length) {
            if (!z4) {
                return;
            } else {
                z4 = true;
            }
        }
        if (this.zzh == 0) {
            if (z4) {
                zzu(i9, 3);
                i8 = i9;
            } else {
                zzcv.zzf(i9 >= (length >> 1));
                i8 = this.zzi.length >> 1;
                zzu(i8, 0);
            }
            i7 = i8;
        } else {
            int i10 = length >> 1;
            int i11 = i9 - i10;
            if (z4) {
                int zzq = zzq(i11) + (this.zzi.length >> 1);
                zzu(zzq, 2);
                int i12 = i10 + i11;
                i7 = zzq;
                i8 = i12;
            } else {
                int zzq2 = zzq(i11);
                zzu(zzq2, 1);
                i7 = zzq2;
                i8 = i11;
            }
        }
        zzcv.zzg(i8 % this.zzd == 0, "bytesConsumed is not aligned to frame size: %s" + i8);
        zzcv.zzf(i9 >= i7);
        this.zzk -= i8;
        int i13 = this.zzj + i8;
        this.zzj = i13;
        this.zzj = i13 % this.zzi.length;
        this.zzh = (i7 / this.zzd) + this.zzh;
        this.zzg += (i8 - i7) / r2;
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
                int zzs = zzs(bArr3[i19], bArr3[i18]);
                if (i8 == 0) {
                    i9 = ((((i18 * zzbbd.zzq.zzf) / (i7 - 1)) * (-90)) / zzbbd.zzq.zzf) + 100;
                } else {
                    i9 = 10;
                    if (i8 == 2) {
                        i9 = 10 + (((90000 * i18) / (i7 - 1)) / zzbbd.zzq.zzf);
                    }
                }
                int i20 = (zzs * i9) / 100;
                if (i20 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = Byte.MAX_VALUE;
                } else if (i20 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = Byte.MIN_VALUE;
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
        int limit;
        int i7;
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            if (this.zzf != 0) {
                zzcv.zzf(this.zzj < this.zzi.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzv(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i8 = this.zzd;
                            limit = (position2 / i8) * i8;
                            break;
                        }
                        position2 += 2;
                    }
                }
                int position3 = limit - byteBuffer.position();
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
                int min = Math.min(position3, i7);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.zzi, i11, min);
                int i12 = this.zzk + min;
                this.zzk = i12;
                zzcv.zzf(i12 <= this.zzi.length);
                boolean z4 = limit < limit2 && position3 < i7;
                zzt(z4);
                if (z4) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.zzi.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (zzv(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i13 = this.zzd;
                            position = AbstractC0486a1.d(limit4, i13, i13, i13);
                            break;
                        }
                        limit4 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    zzj(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch, com.google.android.gms.internal.ads.zzcg
    public final boolean zzg() {
        return super.zzg() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzce zzi(zzce zzceVar) {
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
            int zzr = zzr(100000L) / 2;
            int i8 = this.zzd;
            int i9 = (zzr / i8) * i8;
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
