package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import e1.k;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import w1.L;

/* loaded from: classes.dex */
public abstract class zzajg extends zzaim {
    private static final Logger zza = Logger.getLogger(zzajg.class.getName());
    private static final boolean zzb = zzamp.zzc();
    zzajj zze;

    public static abstract class zza extends zzajg {
        final byte[] zza;
        final int zzb;
        int zzc;
        int zzd;

        public zza(int i7) {
            super();
            if (i7 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i7, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void zzb(int i7) {
            if (!zzajg.zzb) {
                while ((i7 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i8 = this.zzc;
                    this.zzc = i8 + 1;
                    bArr[i8] = (byte) (i7 | 128);
                    this.zzd++;
                    i7 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i9 = this.zzc;
                this.zzc = i9 + 1;
                bArr2[i9] = (byte) i7;
                this.zzd++;
                return;
            }
            long j = this.zzc;
            while ((i7 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                zzamp.zza(bArr3, i10, (byte) (i7 | 128));
                i7 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            zzamp.zza(bArr4, i11, (byte) i7);
            this.zzd += (int) (this.zzc - j);
        }

        public final void zza(byte b7) {
            byte[] bArr = this.zza;
            int i7 = this.zzc;
            this.zzc = i7 + 1;
            bArr[i7] = b7;
            this.zzd++;
        }

        public final void zza(int i7) {
            byte[] bArr = this.zza;
            int i8 = this.zzc;
            int i9 = i8 + 1;
            this.zzc = i9;
            bArr[i8] = (byte) i7;
            int i10 = i8 + 2;
            this.zzc = i10;
            bArr[i9] = (byte) (i7 >> 8);
            int i11 = i8 + 3;
            this.zzc = i11;
            bArr[i10] = (byte) (i7 >> 16);
            this.zzc = i8 + 4;
            bArr[i11] = (byte) (i7 >>> 24);
            this.zzd += 4;
        }

        public final void zza(long j) {
            byte[] bArr = this.zza;
            int i7 = this.zzc;
            int i8 = i7 + 1;
            this.zzc = i8;
            bArr[i7] = (byte) (j & 255);
            int i9 = i7 + 2;
            this.zzc = i9;
            bArr[i8] = (byte) ((j >> 8) & 255);
            int i10 = i7 + 3;
            this.zzc = i10;
            bArr[i9] = (byte) ((j >> 16) & 255);
            int i11 = i7 + 4;
            this.zzc = i11;
            bArr[i10] = (byte) (255 & (j >> 24));
            int i12 = i7 + 5;
            this.zzc = i12;
            bArr[i11] = (byte) (j >> 32);
            int i13 = i7 + 6;
            this.zzc = i13;
            bArr[i12] = (byte) (j >> 40);
            int i14 = i7 + 7;
            this.zzc = i14;
            bArr[i13] = (byte) (j >> 48);
            this.zzc = i7 + 8;
            bArr[i14] = (byte) (j >> 56);
            this.zzd += 8;
        }

        public final void zzb(long j) {
            if (zzajg.zzb) {
                long j3 = this.zzc;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i7 = this.zzc;
                    this.zzc = i7 + 1;
                    zzamp.zza(bArr, i7, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i8 = this.zzc;
                this.zzc = i8 + 1;
                zzamp.zza(bArr2, i8, (byte) j);
                this.zzd += (int) (this.zzc - j3);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i9 = this.zzc;
                this.zzc = i9 + 1;
                bArr3[i9] = (byte) (((int) j) | 128);
                this.zzd++;
                j >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr4[i10] = (byte) j;
            this.zzd++;
        }

        public final void zza(int i7, int i8) {
            zzb((i7 << 3) | i8);
        }
    }

    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        private zzb(String str, Throwable th) {
            super(L.i("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zzb(int i7, int i8, int i9, Throwable th) {
            this(i7, i8, i9, th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private zzb(long j, long j3, int i7, Throwable th) {
            this(r3.toString(), th);
            Locale locale = Locale.US;
            StringBuilder j7 = k.j("Pos: ", ", limit: ", j);
            j7.append(j3);
            j7.append(", len: ");
            j7.append(i7);
        }
    }

    public static class zzc extends zzajg {
        private final byte[] zza;
        private final int zzb;
        private int zzc;

        public zzc(byte[] bArr, int i7, int i8) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i8) | i8) < 0) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(AbstractC0486a1.e(bArr.length, i8, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            }
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i8;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final int zza() {
            return this.zzb - this.zzc;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(byte b7) {
            int i7 = this.zzc;
            try {
                int i8 = i7 + 1;
                try {
                    this.zza[i7] = b7;
                    this.zzc = i8;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    i7 = i8;
                    throw new zzb(i7, this.zzb, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e8) {
                e = e8;
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzd(int i7, zzaip zzaipVar) {
            zzk(1, 3);
            zzl(2, i7);
            zzc(3, zzaipVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzf(int i7, long j) {
            zzk(i7, 1);
            zzh(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(int i7, int i8) {
            zzk(i7, 5);
            zzk(i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzi(int i7, int i8) {
            zzk(i7, 0);
            zzl(i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzj(long j) {
            if (zzajg.zzb && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i7 = this.zzc;
                    this.zzc = i7 + 1;
                    zzamp.zza(bArr, i7, (byte) (((int) j) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i8 = this.zzc;
                this.zzc = i8 + 1;
                zzamp.zza(bArr2, i8, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zza;
                    int i9 = this.zzc;
                    this.zzc = i9 + 1;
                    bArr3[i9] = (byte) (((int) j) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new zzb(this.zzc, this.zzb, 1, (Throwable) e7);
                }
            }
            byte[] bArr4 = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr4[i10] = (byte) j;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzk(int i7) {
            int i8 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i8] = (byte) i7;
                bArr[i8 + 1] = (byte) (i7 >> 8);
                bArr[i8 + 2] = (byte) (i7 >> 16);
                bArr[i8 + 3] = (byte) (i7 >>> 24);
                this.zzc = i8 + 4;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzb(i8, this.zzb, 4, (Throwable) e7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzl(int i7) {
            if (i7 >= 0) {
                zzn(i7);
            } else {
                zzj(i7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzn(int i7) {
            while ((i7 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zza;
                    int i8 = this.zzc;
                    this.zzc = i8 + 1;
                    bArr[i8] = (byte) (i7 | 128);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new zzb(this.zzc, this.zzb, 1, (Throwable) e7);
                }
            }
            byte[] bArr2 = this.zza;
            int i9 = this.zzc;
            this.zzc = i9 + 1;
            bArr2[i9] = (byte) i7;
        }

        private final void zzc(byte[] bArr, int i7, int i8) {
            try {
                System.arraycopy(bArr, i7, this.zza, this.zzc, i8);
                this.zzc += i8;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzb(this.zzc, this.zzb, i8, (Throwable) e7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zza(byte[] bArr, int i7, int i8) {
            zzc(bArr, i7, i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(long j) {
            int i7 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i7] = (byte) j;
                bArr[i7 + 1] = (byte) (j >> 8);
                bArr[i7 + 2] = (byte) (j >> 16);
                bArr[i7 + 3] = (byte) (j >> 24);
                bArr[i7 + 4] = (byte) (j >> 32);
                bArr[i7 + 5] = (byte) (j >> 40);
                bArr[i7 + 6] = (byte) (j >> 48);
                bArr[i7 + 7] = (byte) (j >> 56);
                this.zzc = i7 + 8;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzb(i7, this.zzb, 8, (Throwable) e7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzl(int i7, int i8) {
            zzk(i7, 0);
            zzn(i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i7, boolean z4) {
            zzk(i7, 0);
            zzb(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(int i7, zzaip zzaipVar) {
            zzk(i7, 2);
            zzb(zzaipVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(byte[] bArr, int i7, int i8) {
            zzn(i8);
            zzc(bArr, 0, i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(int i7, zzalc zzalcVar, zzalv zzalvVar) {
            zzk(i7, 2);
            zzn(((zzaif) zzalcVar).zza(zzalvVar));
            zzalvVar.zza((zzalv) zzalcVar, (zzanf) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzk(int i7, int i8) {
            zzn((i7 << 3) | i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(zzaip zzaipVar) {
            zzn(zzaipVar.zzb());
            zzaipVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(zzalc zzalcVar) {
            zzn(zzalcVar.zzl());
            zzalcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(zzalc zzalcVar, zzalv zzalvVar) {
            zzn(((zzaif) zzalcVar).zza(zzalvVar));
            zzalvVar.zza((zzalv) zzalcVar, (zzanf) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i7, zzalc zzalcVar) {
            zzk(1, 3);
            zzl(2, i7);
            zzk(3, 2);
            zzc(zzalcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(int i7, long j) {
            zzk(i7, 0);
            zzj(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i7, String str) {
            zzk(i7, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(String str) {
            int i7 = this.zzc;
            try {
                int zzj = zzajg.zzj(str.length() * 3);
                int zzj2 = zzajg.zzj(str.length());
                if (zzj2 == zzj) {
                    int i8 = i7 + zzj2;
                    this.zzc = i8;
                    int zza = zzamt.zza(str, this.zza, i8, zza());
                    this.zzc = i7;
                    zzn((zza - i7) - zzj2);
                    this.zzc = zza;
                    return;
                }
                zzn(zzamt.zza(str));
                this.zzc = zzamt.zza(str, this.zza, this.zzc, zza());
            } catch (zzamx e7) {
                this.zzc = i7;
                zza(str, e7);
            } catch (IndexOutOfBoundsException e8) {
                throw new zzb(e8);
            }
        }
    }

    public static int zza(double d7) {
        return 8;
    }

    public static int zzb(int i7, int i8) {
        return zzg(i8) + zzj(i7 << 3);
    }

    public static int zzc(long j) {
        return 8;
    }

    public static int zzd(int i7) {
        return 4;
    }

    public static int zze(long j) {
        return 8;
    }

    public static int zzf(int i7) {
        if (i7 > 4096) {
            return 4096;
        }
        return i7;
    }

    public static int zzg(int i7) {
        return 4;
    }

    public static int zzh(int i7) {
        return zzj(zza(i7));
    }

    public static int zzi(int i7) {
        return zzj(i7 << 3);
    }

    public static int zzj(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public abstract int zza();

    public abstract void zzb(byte b7);

    public abstract void zzb(int i7, zzalc zzalcVar);

    public abstract void zzb(int i7, String str);

    public abstract void zzb(int i7, boolean z4);

    public abstract void zzb(zzaip zzaipVar);

    public abstract void zzb(zzalc zzalcVar, zzalv zzalvVar);

    public abstract void zzb(String str);

    public abstract void zzb(byte[] bArr, int i7, int i8);

    public abstract void zzc();

    public abstract void zzc(int i7, zzaip zzaipVar);

    public abstract void zzc(int i7, zzalc zzalcVar, zzalv zzalvVar);

    public abstract void zzc(zzalc zzalcVar);

    public abstract void zzd(int i7, zzaip zzaipVar);

    public abstract void zzf(int i7, long j);

    public abstract void zzh(int i7, int i8);

    public abstract void zzh(int i7, long j);

    public abstract void zzh(long j);

    public abstract void zzi(int i7, int i8);

    public abstract void zzj(long j);

    public abstract void zzk(int i7);

    public abstract void zzk(int i7, int i8);

    public abstract void zzl(int i7);

    public abstract void zzl(int i7, int i8);

    public final void zzm(int i7) {
        zzn(zza(i7));
    }

    public abstract void zzn(int i7);

    public static final class zzd extends zza {
        private final OutputStream zzf;

        public zzd(OutputStream outputStream, int i7) {
            super(i7);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zze() {
            this.zzf.write(this.zza, 0, this.zzc);
            this.zzc = 0;
        }

        private final void zzo(int i7) {
            if (this.zzb - this.zzc < i7) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaim
        public final void zza(byte[] bArr, int i7, int i8) {
            zzc(bArr, i7, i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(byte b7) {
            if (this.zzc == this.zzb) {
                zze();
            }
            zza(b7);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc() {
            if (this.zzc > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzd(int i7, zzaip zzaipVar) {
            zzk(1, 3);
            zzl(2, i7);
            zzc(3, zzaipVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzf(int i7, long j) {
            zzo(18);
            zza(i7, 1);
            zza(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(int i7, int i8) {
            zzo(14);
            zza(i7, 5);
            zza(i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzi(int i7, int i8) {
            zzo(20);
            zza(i7, 0);
            if (i8 >= 0) {
                zzb(i8);
            } else {
                zzb(i8);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzj(long j) {
            zzo(10);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzk(int i7) {
            zzo(4);
            zza(i7);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzl(int i7) {
            if (i7 >= 0) {
                zzn(i7);
            } else {
                zzj(i7);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzn(int i7) {
            zzo(5);
            zzb(i7);
        }

        private final void zzc(byte[] bArr, int i7, int i8) {
            int i9 = this.zzb;
            int i10 = this.zzc;
            if (i9 - i10 >= i8) {
                System.arraycopy(bArr, i7, this.zza, i10, i8);
                this.zzc += i8;
            } else {
                int i11 = i9 - i10;
                System.arraycopy(bArr, i7, this.zza, i10, i11);
                int i12 = i7 + i11;
                i8 -= i11;
                this.zzc = this.zzb;
                this.zzd += i11;
                zze();
                if (i8 <= this.zzb) {
                    System.arraycopy(bArr, i12, this.zza, 0, i8);
                    this.zzc = i8;
                } else {
                    this.zzf.write(bArr, i12, i8);
                }
            }
            this.zzd += i8;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzk(int i7, int i8) {
            zzn((i7 << 3) | i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzl(int i7, int i8) {
            zzo(20);
            zza(i7, 0);
            zzb(i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i7, boolean z4) {
            zzo(11);
            zza(i7, 0);
            zza(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(long j) {
            zzo(8);
            zza(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzh(int i7, long j) {
            zzo(20);
            zza(i7, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(byte[] bArr, int i7, int i8) {
            zzn(i8);
            zzc(bArr, 0, i8);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(zzaip zzaipVar) {
            zzn(zzaipVar.zzb());
            zzaipVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(zzalc zzalcVar, zzalv zzalvVar) {
            zzn(((zzaif) zzalcVar).zza(zzalvVar));
            zzalvVar.zza((zzalv) zzalcVar, (zzanf) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i7, zzalc zzalcVar) {
            zzk(1, 3);
            zzl(2, i7);
            zzk(3, 2);
            zzc(zzalcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(int i7, zzaip zzaipVar) {
            zzk(i7, 2);
            zzb(zzaipVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(int i7, zzalc zzalcVar, zzalv zzalvVar) {
            zzk(i7, 2);
            zzb(zzalcVar, zzalvVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(int i7, String str) {
            zzk(i7, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzc(zzalc zzalcVar) {
            zzn(zzalcVar.zzl());
            zzalcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajg
        public final void zzb(String str) {
            int zza;
            try {
                int length = str.length() * 3;
                int zzj = zzajg.zzj(length);
                int i7 = zzj + length;
                int i8 = this.zzb;
                if (i7 > i8) {
                    byte[] bArr = new byte[length];
                    int zza2 = zzamt.zza(str, bArr, 0, length);
                    zzn(zza2);
                    zza(bArr, 0, zza2);
                    return;
                }
                if (i7 > i8 - this.zzc) {
                    zze();
                }
                int zzj2 = zzajg.zzj(str.length());
                int i9 = this.zzc;
                try {
                    if (zzj2 == zzj) {
                        int i10 = i9 + zzj2;
                        this.zzc = i10;
                        int zza3 = zzamt.zza(str, this.zza, i10, this.zzb - i10);
                        this.zzc = i9;
                        zza = (zza3 - i9) - zzj2;
                        zzb(zza);
                        this.zzc = zza3;
                    } else {
                        zza = zzamt.zza(str);
                        zzb(zza);
                        this.zzc = zzamt.zza(str, this.zza, this.zzc, zza);
                    }
                    this.zzd += zza;
                } catch (zzamx e7) {
                    this.zzd -= this.zzc - i9;
                    this.zzc = i9;
                    throw e7;
                } catch (ArrayIndexOutOfBoundsException e8) {
                    throw new zzb(e8);
                }
            } catch (zzamx e9) {
                zza(str, e9);
            }
        }
    }

    private zzajg() {
    }

    public static int zza(float f7) {
        return 4;
    }

    public static int zzc(int i7) {
        return zzg(i7);
    }

    public static int zze(int i7) {
        return zzg(i7);
    }

    public static int zzf(int i7, int i8) {
        return zzj(zza(i8)) + zzj(i7 << 3);
    }

    public static int zzg(int i7, int i8) {
        return zzj(i8) + zzj(i7 << 3);
    }

    public final void zzi(long j) {
        zzj(zza(j));
    }

    public final void zzj(int i7, int i8) {
        zzl(i7, zza(i8));
    }

    private static int zza(int i7) {
        return (i7 >> 31) ^ (i7 << 1);
    }

    public static int zzb(int i7, long j) {
        return zzg(j) + zzj(i7 << 3);
    }

    public static int zzc(int i7, int i8) {
        return zzj(i7 << 3) + 4;
    }

    public static int zzd(int i7, int i8) {
        return zzg(i8) + zzj(i7 << 3);
    }

    public static int zze(int i7, int i8) {
        return zzj(i7 << 3) + 4;
    }

    public static int zza(boolean z4) {
        return 1;
    }

    public static int zzc(int i7, long j) {
        return zzj(i7 << 3) + 8;
    }

    public static int zze(int i7, long j) {
        return zzg(j) + zzj(i7 << 3);
    }

    public static int zzf(long j) {
        return zzg(zza(j));
    }

    public static int zzg(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    private static long zza(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzb(int i7, zzakk zzakkVar) {
        int zzj = zzj(i7 << 3);
        int zza2 = zzakkVar.zza();
        return zzj(zza2) + zza2 + zzj;
    }

    public static int zzd(long j) {
        return zzg(j);
    }

    public final void zzg(int i7, long j) {
        zzh(i7, zza(j));
    }

    public static int zza(int i7, boolean z4) {
        return zzj(i7 << 3) + 1;
    }

    public static int zzd(int i7, long j) {
        return zzg(zza(j)) + zzj(i7 << 3);
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    public static int zzb(int i7, zzalc zzalcVar, zzalv zzalvVar) {
        return zza(zzalcVar, zzalvVar) + zzj(i7 << 3);
    }

    public static int zza(int i7, zzaip zzaipVar) {
        int zzj = zzj(i7 << 3);
        int zzb2 = zzaipVar.zzb();
        return zzj(zzb2) + zzb2 + zzj;
    }

    public static int zzb(zzalc zzalcVar) {
        int zzl = zzalcVar.zzl();
        return zzj(zzl) + zzl;
    }

    public static int zza(zzaip zzaipVar) {
        int zzb2 = zzaipVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzb(int i7, zzaip zzaipVar) {
        return zza(3, zzaipVar) + zzg(2, i7) + (zzj(8) << 1);
    }

    public static int zza(int i7, double d7) {
        return zzj(i7 << 3) + 8;
    }

    public static int zza(int i7, long j) {
        return zzj(i7 << 3) + 8;
    }

    public static zzajg zzb(byte[] bArr) {
        return new zzc(bArr, 0, bArr.length);
    }

    public static int zza(int i7, float f7) {
        return zzj(i7 << 3) + 4;
    }

    @Deprecated
    public static int zza(int i7, zzalc zzalcVar, zzalv zzalvVar) {
        return ((zzaif) zzalcVar).zza(zzalvVar) + (zzj(i7 << 3) << 1);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public static int zza(zzalc zzalcVar) {
        return zzalcVar.zzl();
    }

    public final void zzb(boolean z4) {
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    public static int zza(int i7, zzakk zzakkVar) {
        return zzb(3, zzakkVar) + zzg(2, i7) + (zzj(8) << 1);
    }

    public final void zzb(int i7, double d7) {
        zzf(i7, Double.doubleToRawLongBits(d7));
    }

    public final void zzb(double d7) {
        zzh(Double.doubleToRawLongBits(d7));
    }

    public final void zzb(int i7, float f7) {
        zzh(i7, Float.floatToRawIntBits(f7));
    }

    public static int zza(zzakk zzakkVar) {
        int zza2 = zzakkVar.zza();
        return zzj(zza2) + zza2;
    }

    public final void zzb(float f7) {
        zzk(Float.floatToRawIntBits(f7));
    }

    public static int zza(int i7, zzalc zzalcVar) {
        return zzb(zzalcVar) + zzj(24) + zzg(2, i7) + (zzj(8) << 1);
    }

    public static int zza(zzalc zzalcVar, zzalv zzalvVar) {
        int zza2 = ((zzaif) zzalcVar).zza(zzalvVar);
        return zzj(zza2) + zza2;
    }

    public static int zza(int i7, String str) {
        return zza(str) + zzj(i7 << 3);
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzamt.zza(str);
        } catch (zzamx unused) {
            length = str.getBytes(zzakb.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzajg zza(OutputStream outputStream, int i7) {
        return new zzd(outputStream, i7);
    }

    public final void zza(String str, zzamx zzamxVar) {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzamxVar);
        byte[] bytes = str.getBytes(zzakb.zza);
        try {
            zzn(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzb(e7);
        }
    }
}
