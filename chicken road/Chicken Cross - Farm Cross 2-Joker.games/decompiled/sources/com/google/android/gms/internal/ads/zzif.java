package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzif extends zzhk {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzif() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws zzie {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzc == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            String str = zzfm.zza;
            RandomAccessFile randomAccessFile2 = randomAccessFile;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(this.zzc, i2));
            if (read > 0) {
                this.zzc -= read;
                zzh(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzie(e, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long zzb(zzhw zzhwVar) throws zzie {
        Uri uri = zzhwVar.zza;
        this.zzb = uri;
        zzf(zzhwVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            String str = path;
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                long j = zzhwVar.zze;
                randomAccessFile.seek(j);
                long j2 = zzhwVar.zzf;
                if (j2 == -1) {
                    j2 = this.zza.length() - j;
                }
                this.zzc = j2;
                if (j2 < 0) {
                    throw new zzie(null, null, 2008);
                }
                this.zzd = true;
                zzg(zzhwVar);
                return this.zzc;
            } catch (IOException e) {
                throw new zzie(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzie(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new zzie(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new zzie(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzie(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() throws zzie {
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
                    zzi();
                }
            } catch (IOException e) {
                throw new zzie(e, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzi();
            }
            throw th;
        }
    }
}
