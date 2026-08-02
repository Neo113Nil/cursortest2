package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzgxw extends InputStream {
    private Iterator zza;
    private ByteBuffer zzb;
    private int zzc = 0;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    public zzgxw(Iterable iterable) {
        this.zza = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzc++;
        }
        this.zzd = -1;
        if (zzb()) {
            return;
        }
        this.zzb = zzgxt.zzc;
        this.zzd = 0;
        this.zze = 0;
        this.zzi = 0L;
    }

    private final void zza(int i7) {
        int i8 = this.zze + i7;
        this.zze = i8;
        if (i8 == this.zzb.limit()) {
            zzb();
        }
    }

    private final boolean zzb() {
        this.zzd++;
        if (!this.zza.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.zza.next();
        this.zzb = byteBuffer;
        this.zze = byteBuffer.position();
        if (this.zzb.hasArray()) {
            this.zzf = true;
            this.zzg = this.zzb.array();
            this.zzh = this.zzb.arrayOffset();
        } else {
            this.zzf = false;
            this.zzi = zzhad.zze(this.zzb);
            this.zzg = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.zzd == this.zzc) {
            return -1;
        }
        if (this.zzf) {
            int i7 = this.zzg[this.zze + this.zzh] & 255;
            zza(1);
            return i7;
        }
        int zza = zzhad.zza(this.zze + this.zzi) & 255;
        zza(1);
        return zza;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        if (this.zzd == this.zzc) {
            return -1;
        }
        int limit = this.zzb.limit();
        int i9 = this.zze;
        int i10 = limit - i9;
        if (i8 > i10) {
            i8 = i10;
        }
        if (this.zzf) {
            System.arraycopy(this.zzg, i9 + this.zzh, bArr, i7, i8);
            zza(i8);
        } else {
            int position = this.zzb.position();
            this.zzb.position(this.zze);
            this.zzb.get(bArr, i7, i8);
            this.zzb.position(position);
            zza(i8);
        }
        return i8;
    }
}
