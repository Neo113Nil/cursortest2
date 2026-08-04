package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzgvw extends OutputStream {
    private static final byte[] zza = new byte[0];
    private int zzd;
    private int zzf;
    private final int zzb = 128;
    private final ArrayList zzc = new ArrayList();
    private byte[] zze = new byte[128];

    public zzgvw(int i7) {
    }

    private final void zzc(int i7) {
        this.zzc.add(new zzgvv(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[Math.max(this.zzb, Math.max(i7, length >>> 1))];
        this.zzf = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zza()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i7) {
        try {
            if (this.zzf == this.zze.length) {
                zzc(1);
            }
            byte[] bArr = this.zze;
            int i8 = this.zzf;
            this.zzf = i8 + 1;
            bArr[i8] = (byte) i7;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int zza() {
        return this.zzd + this.zzf;
    }

    public final synchronized zzgvy zzb() {
        try {
            int i7 = this.zzf;
            byte[] bArr = this.zze;
            if (i7 >= bArr.length) {
                this.zzc.add(new zzgvv(this.zze));
                this.zze = zza;
            } else if (i7 > 0) {
                this.zzc.add(new zzgvv(Arrays.copyOf(bArr, i7)));
            }
            this.zzd += this.zzf;
            this.zzf = 0;
        } catch (Throwable th) {
            throw th;
        }
        return zzgvy.zzu(this.zzc);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        int i9 = this.zzf;
        int i10 = length - i9;
        if (i8 <= i10) {
            System.arraycopy(bArr, i7, bArr2, i9, i8);
            this.zzf += i8;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i9, i10);
        int i11 = i8 - i10;
        zzc(i11);
        System.arraycopy(bArr, i7 + i10, this.zze, 0, i11);
        this.zzf = i11;
    }
}
