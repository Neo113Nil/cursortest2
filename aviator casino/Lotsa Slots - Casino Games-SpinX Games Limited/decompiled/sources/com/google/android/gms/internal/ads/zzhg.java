package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhg extends com.google.android.gms.internal.ads.zzhh {
    private final android.content.res.AssetManager zza;
    private android.net.Uri zzb;
    private java.io.InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzhg(android.content.Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzhf {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzd;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) java.lang.Math.min(j, i2);
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.internal.ads.zzhf(e, 2000);
            }
        }
        java.io.InputStream inputStream = this.zzc;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        java.io.InputStream inputStream2 = inputStream;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.zzd;
        if (j2 != -1) {
            this.zzd = j2 - read;
        }
        zzh(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws com.google.android.gms.internal.ads.zzhf {
        try {
            android.net.Uri uri = zzhtVar.zza;
            this.zzb = uri;
            java.lang.String path = uri.getPath();
            path.getClass();
            java.lang.String str = path;
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            zzf(zzhtVar);
            java.io.InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            long j = zzhtVar.zze;
            if (open.skip(j) < j) {
                throw new com.google.android.gms.internal.ads.zzhf(null, 2008);
            }
            long j2 = zzhtVar.zzf;
            if (j2 != -1) {
                this.zzd = j2;
            } else {
                long available = this.zzc.available();
                this.zzd = available;
                if (available == 2147483647L) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzg(zzhtVar);
            return this.zzd;
        } catch (com.google.android.gms.internal.ads.zzhf e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new com.google.android.gms.internal.ads.zzhf(e2, true != (e2 instanceof java.io.FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws com.google.android.gms.internal.ads.zzhf {
        this.zzb = null;
        try {
            try {
                java.io.InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzi();
                }
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.internal.ads.zzhf(e, 2000);
            }
        } catch (java.lang.Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzi();
            }
            throw th;
        }
    }
}
