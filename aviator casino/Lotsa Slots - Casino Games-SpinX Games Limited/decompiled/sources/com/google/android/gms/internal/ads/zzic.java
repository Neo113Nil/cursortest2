package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzic extends com.google.android.gms.internal.ads.zzhh {
    private java.io.RandomAccessFile zza;
    private android.net.Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzic() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzib {
        if (i2 == 0) {
            return 0;
        }
        if (this.zzc == 0) {
            return -1;
        }
        try {
            java.io.RandomAccessFile randomAccessFile = this.zza;
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            java.io.RandomAccessFile randomAccessFile2 = randomAccessFile;
            int read = randomAccessFile.read(bArr, i, (int) java.lang.Math.min(this.zzc, i2));
            if (read > 0) {
                this.zzc -= read;
                zzh(read);
            }
            return read;
        } catch (java.io.IOException e) {
            throw new com.google.android.gms.internal.ads.zzib(e, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws com.google.android.gms.internal.ads.zzib {
        android.net.Uri uri = zzhtVar.zza;
        this.zzb = uri;
        zzf(zzhtVar);
        try {
            java.lang.String path = uri.getPath();
            path.getClass();
            java.lang.String str = path;
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(path, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.zza = randomAccessFile;
            try {
                long j = zzhtVar.zze;
                randomAccessFile.seek(j);
                long j2 = zzhtVar.zzf;
                if (j2 == -1) {
                    j2 = this.zza.length() - j;
                }
                this.zzc = j2;
                if (j2 < 0) {
                    throw new com.google.android.gms.internal.ads.zzib(null, null, 2008);
                }
                this.zzd = true;
                zzg(zzhtVar);
                return this.zzc;
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.internal.ads.zzib(e, 2000);
            }
        } catch (java.io.FileNotFoundException e2) {
            if (android.text.TextUtils.isEmpty(uri.getQuery()) && android.text.TextUtils.isEmpty(uri.getFragment())) {
                throw new com.google.android.gms.internal.ads.zzib(e2, ((e2.getCause() instanceof android.system.ErrnoException) && ((android.system.ErrnoException) e2.getCause()).errno == android.system.OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new com.google.android.gms.internal.ads.zzib(java.lang.String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (java.lang.SecurityException e3) {
            throw new com.google.android.gms.internal.ads.zzib(e3, 2006);
        } catch (java.lang.RuntimeException e4) {
            throw new com.google.android.gms.internal.ads.zzib(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws com.google.android.gms.internal.ads.zzib {
        this.zzb = null;
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzi();
                }
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.internal.ads.zzib(e, 2000);
            }
        } catch (java.lang.Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzi();
            }
            throw th;
        }
    }
}
