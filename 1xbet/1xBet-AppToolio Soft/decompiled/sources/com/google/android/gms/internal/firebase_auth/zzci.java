package com.google.android.gms.internal.firebase_auth;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzci extends zzbt {
    private static final Logger logger = Logger.getLogger(zzci.class.getName());
    private static final boolean zznf = zzfv.zzgc();
    zzck zzng;

    static class zza extends zzci {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.buffer = bArr;
            this.offset = i;
            this.position = i;
            this.limit = i3;
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public void flush() {
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(int i, long j) throws IOException {
            zzb(i, 0);
            zza(j);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(int i, zzbu zzbuVar) throws IOException {
            zzb(i, 2);
            zza(zzbuVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(int i, zzeh zzehVar) throws IOException {
            zzb(i, 2);
            zzb(zzehVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        final void zza(int i, zzeh zzehVar, zzev zzevVar) throws IOException {
            zzb(i, 2);
            zzbn zzbnVar = (zzbn) zzehVar;
            int zzbp = zzbnVar.zzbp();
            if (zzbp == -1) {
                zzbp = zzevVar.zzo(zzbnVar);
                zzbnVar.zzg(zzbp);
            }
            zzx(zzbp);
            zzevVar.zza(zzehVar, this.zzng);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(int i, String str) throws IOException {
            zzb(i, 2);
            zzal(str);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(long j) throws IOException {
            if (zzci.zznf && zzdc() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    zzfv.zza(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                zzfv.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(zzbu zzbuVar) throws IOException {
            zzx(zzbuVar.size());
            zzbuVar.zza(this);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        final void zza(zzeh zzehVar, zzev zzevVar) throws IOException {
            zzbn zzbnVar = (zzbn) zzehVar;
            int zzbp = zzbnVar.zzbp();
            if (zzbp == -1) {
                zzbp = zzevVar.zzo(zzbnVar);
                zzbnVar.zzg(zzbp);
            }
            zzx(zzbp);
            zzevVar.zza(zzehVar, this.zzng);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzbt
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzal(String str) throws IOException {
            int i = this.position;
            try {
                int zzac = zzac(str.length() * 3);
                int zzac2 = zzac(str.length());
                if (zzac2 != zzac) {
                    zzx(zzfx.zza(str));
                    this.position = zzfx.zza(str, this.buffer, this.position, zzdc());
                    return;
                }
                this.position = i + zzac2;
                int zza = zzfx.zza(str, this.buffer, this.position, zzdc());
                this.position = i;
                zzx((zza - i) - zzac2);
                this.position = zza;
            } catch (zzga e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(int i, int i2) throws IOException {
            zzx((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(int i, zzbu zzbuVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzbuVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(int i, zzeh zzehVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzehVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(int i, boolean z) throws IOException {
            zzb(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(zzeh zzehVar) throws IOException {
            zzx(zzehVar.zzdq());
            zzehVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzc(int i, int i2) throws IOException {
            zzb(i, 0);
            zzw(i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzc(int i, long j) throws IOException {
            zzb(i, 1);
            zzc(j);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzc(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.buffer;
                int i6 = this.position;
                this.position = i6 + 1;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.buffer;
                int i7 = this.position;
                this.position = i7 + 1;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.buffer;
                int i8 = this.position;
                this.position = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzd(int i, int i2) throws IOException {
            zzb(i, 0);
            zzx(i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final int zzdc() {
            return this.limit - this.position;
        }

        public final int zzde() {
            return this.position - this.offset;
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zze(byte[] bArr, int i, int i2) throws IOException {
            zzx(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzf(int i, int i2) throws IOException {
            zzb(i, 5);
            zzz(i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzw(int i) throws IOException {
            if (i >= 0) {
                zzx(i);
            } else {
                zza(i);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzx(int i) throws IOException {
            if (zzci.zznf && zzdc() >= 10) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    zzfv.zza(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                zzfv.zza(bArr2, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i4 = this.position;
                    this.position = i4 + 1;
                    bArr3[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            bArr4[i5] = (byte) i;
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzz(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                bArr4[i5] = i >> 24;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }
    }

    static final class zzb extends zza {
        private final ByteBuffer zznh;
        private int zzni;

        zzb(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.zznh = byteBuffer;
            this.zzni = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci.zza, com.google.android.gms.internal.firebase_auth.zzci
        public final void flush() {
            this.zznh.position(this.zzni + zzde());
        }
    }

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        zzc(String str) {
            super(r3.length() != 0 ? r0.concat(r3) : new String(r0));
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        zzc(String str, Throwable th) {
            super(r3.length() != 0 ? r0.concat(r3) : new String(r0), th);
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            String valueOf2 = String.valueOf(str);
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    static final class zzd extends zzci {
        private final int zzni;
        private final ByteBuffer zznj;
        private final ByteBuffer zznk;

        zzd(ByteBuffer byteBuffer) {
            super();
            this.zznj = byteBuffer;
            this.zznk = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzni = byteBuffer.position();
        }

        private final void zzan(String str) throws IOException {
            try {
                zzfx.zza(str, this.zznk);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void flush() {
            this.zznj.position(this.zznk.position());
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.zznk.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            } catch (BufferOverflowException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(byte b) throws IOException {
            try {
                this.zznk.put(b);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(int i, long j) throws IOException {
            zzb(i, 0);
            zza(j);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(int i, zzbu zzbuVar) throws IOException {
            zzb(i, 2);
            zza(zzbuVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(int i, zzeh zzehVar) throws IOException {
            zzb(i, 2);
            zzb(zzehVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        final void zza(int i, zzeh zzehVar, zzev zzevVar) throws IOException {
            zzb(i, 2);
            zza(zzehVar, zzevVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(int i, String str) throws IOException {
            zzb(i, 2);
            zzal(str);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(long j) throws IOException {
            while (((-128) & j) != 0) {
                try {
                    this.zznk.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzc(e);
                }
            }
            this.zznk.put((byte) j);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(zzbu zzbuVar) throws IOException {
            zzx(zzbuVar.size());
            zzbuVar.zza(this);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        final void zza(zzeh zzehVar, zzev zzevVar) throws IOException {
            zzbn zzbnVar = (zzbn) zzehVar;
            int zzbp = zzbnVar.zzbp();
            if (zzbp == -1) {
                zzbp = zzevVar.zzo(zzbnVar);
                zzbnVar.zzg(zzbp);
            }
            zzx(zzbp);
            zzevVar.zza(zzehVar, this.zzng);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzbt
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzal(String str) throws IOException {
            int position = this.zznk.position();
            try {
                int zzac = zzac(str.length() * 3);
                int zzac2 = zzac(str.length());
                if (zzac2 != zzac) {
                    zzx(zzfx.zza(str));
                    zzan(str);
                    return;
                }
                int position2 = this.zznk.position() + zzac2;
                this.zznk.position(position2);
                zzan(str);
                int position3 = this.zznk.position();
                this.zznk.position(position);
                zzx(position3 - position2);
                this.zznk.position(position3);
            } catch (zzga e) {
                this.zznk.position(position);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(int i, int i2) throws IOException {
            zzx((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(int i, zzbu zzbuVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzbuVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(int i, zzeh zzehVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzehVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(int i, boolean z) throws IOException {
            zzb(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(zzeh zzehVar) throws IOException {
            zzx(zzehVar.zzdq());
            zzehVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzc(int i, int i2) throws IOException {
            zzb(i, 0);
            zzw(i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzc(int i, long j) throws IOException {
            zzb(i, 1);
            zzc(j);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzc(long j) throws IOException {
            try {
                this.zznk.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzd(int i, int i2) throws IOException {
            zzb(i, 0);
            zzx(i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final int zzdc() {
            return this.zznk.remaining();
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zze(byte[] bArr, int i, int i2) throws IOException {
            zzx(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzf(int i, int i2) throws IOException {
            zzb(i, 5);
            zzz(i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzw(int i) throws IOException {
            if (i >= 0) {
                zzx(i);
            } else {
                zza(i);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzx(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    this.zznk.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzc(e);
                }
            }
            this.zznk.put((byte) i);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzz(int i) throws IOException {
            try {
                this.zznk.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }
    }

    static final class zze extends zzci {
        private final ByteBuffer zznj;
        private final ByteBuffer zznk;
        private final long zznl;
        private final long zznm;
        private final long zznn;
        private final long zzno;
        private long zznp;

        zze(ByteBuffer byteBuffer) {
            super();
            this.zznj = byteBuffer;
            this.zznk = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zznl = zzfv.zzb(byteBuffer);
            this.zznm = this.zznl + byteBuffer.position();
            this.zznn = this.zznl + byteBuffer.limit();
            this.zzno = this.zznn - 10;
            this.zznp = this.zznm;
        }

        private final void zzj(long j) {
            this.zznk.position((int) (j - this.zznl));
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void flush() {
            this.zznj.position((int) (this.zznp - this.zznl));
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.zznn - j;
                long j3 = this.zznp;
                if (j2 >= j3) {
                    zzfv.zza(bArr, i, j3, j);
                    this.zznp += j;
                    return;
                }
            }
            if (bArr != null) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zznp), Long.valueOf(this.zznn), Integer.valueOf(i2)));
            }
            throw new NullPointerException(FirebaseAnalytics.Param.VALUE);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(byte b) throws IOException {
            long j = this.zznp;
            if (j >= this.zznn) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(this.zznn), 1));
            }
            this.zznp = 1 + j;
            zzfv.zza(j, b);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(int i, long j) throws IOException {
            zzb(i, 0);
            zza(j);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(int i, zzbu zzbuVar) throws IOException {
            zzb(i, 2);
            zza(zzbuVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(int i, zzeh zzehVar) throws IOException {
            zzb(i, 2);
            zzb(zzehVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        final void zza(int i, zzeh zzehVar, zzev zzevVar) throws IOException {
            zzb(i, 2);
            zza(zzehVar, zzevVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(int i, String str) throws IOException {
            zzb(i, 2);
            zzal(str);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(long j) throws IOException {
            long j2;
            if (this.zznp <= this.zzno) {
                while ((j & (-128)) != 0) {
                    long j3 = this.zznp;
                    this.zznp = j3 + 1;
                    zzfv.zza(j3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                j2 = this.zznp;
            } else {
                while (true) {
                    j2 = this.zznp;
                    if (j2 >= this.zznn) {
                        throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j2), Long.valueOf(this.zznn), 1));
                    }
                    if ((j & (-128)) == 0) {
                        break;
                    }
                    this.zznp = j2 + 1;
                    zzfv.zza(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
            this.zznp = 1 + j2;
            zzfv.zza(j2, (byte) j);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zza(zzbu zzbuVar) throws IOException {
            zzx(zzbuVar.size());
            zzbuVar.zza(this);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        final void zza(zzeh zzehVar, zzev zzevVar) throws IOException {
            zzbn zzbnVar = (zzbn) zzehVar;
            int zzbp = zzbnVar.zzbp();
            if (zzbp == -1) {
                zzbp = zzevVar.zzo(zzbnVar);
                zzbnVar.zzg(zzbp);
            }
            zzx(zzbp);
            zzevVar.zza(zzehVar, this.zzng);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzbt
        public final void zza(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzal(String str) throws IOException {
            long j = this.zznp;
            try {
                int zzac = zzac(str.length() * 3);
                int zzac2 = zzac(str.length());
                if (zzac2 != zzac) {
                    int zza = zzfx.zza(str);
                    zzx(zza);
                    zzj(this.zznp);
                    zzfx.zza(str, this.zznk);
                    this.zznp += zza;
                    return;
                }
                int i = ((int) (this.zznp - this.zznl)) + zzac2;
                this.zznk.position(i);
                zzfx.zza(str, this.zznk);
                int position = this.zznk.position() - i;
                zzx(position);
                this.zznp += position;
            } catch (zzga e) {
                this.zznp = j;
                zzj(this.zznp);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc(e3);
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(int i, int i2) throws IOException {
            zzx((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(int i, zzbu zzbuVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzbuVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(int i, zzeh zzehVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzehVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(int i, boolean z) throws IOException {
            zzb(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzb(zzeh zzehVar) throws IOException {
            zzx(zzehVar.zzdq());
            zzehVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzc(int i, int i2) throws IOException {
            zzb(i, 0);
            zzw(i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzc(int i, long j) throws IOException {
            zzb(i, 1);
            zzc(j);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzc(long j) throws IOException {
            this.zznk.putLong((int) (this.zznp - this.zznl), j);
            this.zznp += 8;
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzd(int i, int i2) throws IOException {
            zzb(i, 0);
            zzx(i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final int zzdc() {
            return (int) (this.zznn - this.zznp);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zze(byte[] bArr, int i, int i2) throws IOException {
            zzx(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzf(int i, int i2) throws IOException {
            zzb(i, 5);
            zzz(i2);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzw(int i) throws IOException {
            if (i >= 0) {
                zzx(i);
            } else {
                zza(i);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzx(int i) throws IOException {
            long j;
            if (this.zznp <= this.zzno) {
                while ((i & (-128)) != 0) {
                    long j2 = this.zznp;
                    this.zznp = j2 + 1;
                    zzfv.zza(j2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                j = this.zznp;
            } else {
                while (true) {
                    j = this.zznp;
                    if (j >= this.zznn) {
                        throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(this.zznn), 1));
                    }
                    if ((i & (-128)) == 0) {
                        break;
                    }
                    this.zznp = j + 1;
                    zzfv.zza(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
            this.zznp = 1 + j;
            zzfv.zza(j, (byte) i);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzci
        public final void zzz(int i) throws IOException {
            this.zznk.putInt((int) (this.zznp - this.zznl), i);
            this.zznp += 4;
        }
    }

    private zzci() {
    }

    public static int zza(int i, zzdo zzdoVar) {
        int zzaa = zzaa(i);
        int zzdq = zzdoVar.zzdq();
        return zzaa + zzac(zzdq) + zzdq;
    }

    public static int zza(zzdo zzdoVar) {
        int zzdq = zzdoVar.zzdq();
        return zzac(zzdq) + zzdq;
    }

    public static zzci zza(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new zzb(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return zzfv.zzgd() ? new zze(byteBuffer) : new zzd(byteBuffer);
    }

    public static int zzaa(int i) {
        return zzac(i << 3);
    }

    public static int zzab(int i) {
        if (i >= 0) {
            return zzac(i);
        }
        return 10;
    }

    public static int zzac(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzad(int i) {
        return zzac(zzah(i));
    }

    public static int zzae(int i) {
        return 4;
    }

    public static int zzaf(int i) {
        return 4;
    }

    public static int zzag(int i) {
        return zzab(i);
    }

    private static int zzah(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int zzai(int i) {
        return zzac(i);
    }

    public static int zzam(String str) {
        int length;
        try {
            length = zzfx.zza(str);
        } catch (zzga unused) {
            length = str.getBytes(zzdd.UTF_8).length;
        }
        return zzac(length) + length;
    }

    public static int zzb(double d) {
        return 8;
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzb(int i, double d) {
        return zzaa(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzaa(i) + 4;
    }

    public static int zzb(int i, zzdo zzdoVar) {
        return (zzaa(1) << 1) + zzh(2, i) + zza(3, zzdoVar);
    }

    static int zzb(int i, zzeh zzehVar, zzev zzevVar) {
        return zzaa(i) + zzb(zzehVar, zzevVar);
    }

    public static int zzb(int i, String str) {
        return zzaa(i) + zzam(str);
    }

    public static int zzb(zzbu zzbuVar) {
        int size = zzbuVar.size();
        return zzac(size) + size;
    }

    static int zzb(zzeh zzehVar, zzev zzevVar) {
        zzbn zzbnVar = (zzbn) zzehVar;
        int zzbp = zzbnVar.zzbp();
        if (zzbp == -1) {
            zzbp = zzevVar.zzo(zzbnVar);
            zzbnVar.zzg(zzbp);
        }
        return zzac(zzbp) + zzbp;
    }

    public static zzci zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzc(int i, zzbu zzbuVar) {
        int zzaa = zzaa(i);
        int size = zzbuVar.size();
        return zzaa + zzac(size) + size;
    }

    public static int zzc(int i, zzeh zzehVar) {
        return zzaa(i) + zzc(zzehVar);
    }

    @Deprecated
    static int zzc(int i, zzeh zzehVar, zzev zzevVar) {
        int zzaa = zzaa(i) << 1;
        zzbn zzbnVar = (zzbn) zzehVar;
        int zzbp = zzbnVar.zzbp();
        if (zzbp == -1) {
            zzbp = zzevVar.zzo(zzbnVar);
            zzbnVar.zzg(zzbp);
        }
        return zzaa + zzbp;
    }

    public static int zzc(int i, boolean z) {
        return zzaa(i) + 1;
    }

    public static int zzc(zzeh zzehVar) {
        int zzdq = zzehVar.zzdq();
        return zzac(zzdq) + zzdq;
    }

    public static int zzc(byte[] bArr) {
        int length = bArr.length;
        return zzac(length) + length;
    }

    public static int zzd(int i, long j) {
        return zzaa(i) + zze(j);
    }

    public static int zzd(int i, zzbu zzbuVar) {
        return (zzaa(1) << 1) + zzh(2, i) + zzc(3, zzbuVar);
    }

    public static int zzd(int i, zzeh zzehVar) {
        return (zzaa(1) << 1) + zzh(2, i) + zzc(3, zzehVar);
    }

    public static int zzd(long j) {
        return zze(j);
    }

    @Deprecated
    public static int zzd(zzeh zzehVar) {
        return zzehVar.zzdq();
    }

    public static int zze(int i, long j) {
        return zzaa(i) + zze(j);
    }

    public static int zze(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzf(int i, long j) {
        return zzaa(i) + zze(zzi(j));
    }

    public static int zzf(long j) {
        return zze(zzi(j));
    }

    public static int zzg(int i, int i2) {
        return zzaa(i) + zzab(i2);
    }

    public static int zzg(int i, long j) {
        return zzaa(i) + 8;
    }

    public static int zzg(long j) {
        return 8;
    }

    public static int zzg(boolean z) {
        return 1;
    }

    public static int zzh(int i, int i2) {
        return zzaa(i) + zzac(i2);
    }

    public static int zzh(int i, long j) {
        return zzaa(i) + 8;
    }

    public static int zzh(long j) {
        return 8;
    }

    public static int zzi(int i, int i2) {
        return zzaa(i) + zzac(zzah(i2));
    }

    private static long zzi(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzj(int i, int i2) {
        return zzaa(i) + 4;
    }

    public static int zzk(int i, int i2) {
        return zzaa(i) + 4;
    }

    public static int zzl(int i, int i2) {
        return zzaa(i) + zzab(i2);
    }

    public abstract void flush() throws IOException;

    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zza(byte b) throws IOException;

    public final void zza(double d) throws IOException {
        zzc(Double.doubleToRawLongBits(d));
    }

    public final void zza(float f) throws IOException {
        zzz(Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zza(int i, float f) throws IOException {
        zzf(i, Float.floatToRawIntBits(f));
    }

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzbu zzbuVar) throws IOException;

    public abstract void zza(int i, zzeh zzehVar) throws IOException;

    abstract void zza(int i, zzeh zzehVar, zzev zzevVar) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(long j) throws IOException;

    public abstract void zza(zzbu zzbuVar) throws IOException;

    abstract void zza(zzeh zzehVar, zzev zzevVar) throws IOException;

    final void zza(String str, zzga zzgaVar) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzgaVar);
        byte[] bytes = str.getBytes(zzdd.UTF_8);
        try {
            zzx(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (zzc e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzc(e2);
        }
    }

    public abstract void zzal(String str) throws IOException;

    public abstract void zzb(int i, int i2) throws IOException;

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzi(j));
    }

    public abstract void zzb(int i, zzbu zzbuVar) throws IOException;

    public abstract void zzb(int i, zzeh zzehVar) throws IOException;

    public abstract void zzb(int i, boolean z) throws IOException;

    public final void zzb(long j) throws IOException {
        zza(zzi(j));
    }

    public abstract void zzb(zzeh zzehVar) throws IOException;

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzc(long j) throws IOException;

    public abstract void zzd(int i, int i2) throws IOException;

    public abstract int zzdc();

    public final void zze(int i, int i2) throws IOException {
        zzd(i, zzah(i2));
    }

    abstract void zze(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public final void zzf(boolean z) throws IOException {
        zza(z ? (byte) 1 : (byte) 0);
    }

    public abstract void zzw(int i) throws IOException;

    public abstract void zzx(int i) throws IOException;

    public final void zzy(int i) throws IOException {
        zzx(zzah(i));
    }

    public abstract void zzz(int i) throws IOException;
}
