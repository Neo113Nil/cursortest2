package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import e1.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class zzgm extends zzfq {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgm() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j = this.zzc;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i9 = zzen.zza;
            int read = randomAccessFile.read(bArr, i7, (int) Math.min(j, i8));
            if (read > 0) {
                this.zzc -= read;
                zzg(read);
            }
            return read;
        } catch (IOException e7) {
            throw new zzgl(e7, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) {
        Uri uri = zzgcVar.zza;
        this.zzb = uri;
        zzi(zzgcVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzgcVar.zze);
                long j = zzgcVar.zzf;
                if (j == -1) {
                    j = this.zza.length() - zzgcVar.zze;
                }
                this.zzc = j;
                if (j < 0) {
                    throw new zzgl(null, null, 2008);
                }
                this.zzd = true;
                zzj(zzgcVar);
                return this.zzc;
            } catch (IOException e7) {
                throw new zzgl(e7, 2000);
            }
        } catch (FileNotFoundException e8) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgl(e8, ((e8.getCause() instanceof ErrnoException) && ((ErrnoException) e8.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder l7 = k.l("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            l7.append(fragment);
            throw new zzgl(l7.toString(), e8, 1004);
        } catch (SecurityException e9) {
            throw new zzgl(e9, 2006);
        } catch (RuntimeException e10) {
            throw new zzgl(e10, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzh();
                }
            } catch (IOException e7) {
                throw new zzgl(e7, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}
