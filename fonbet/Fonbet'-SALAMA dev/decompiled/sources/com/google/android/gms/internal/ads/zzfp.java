package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzfp extends zzfq {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzfp(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j = this.zzd;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i8 = (int) Math.min(j, i8);
            } catch (IOException e7) {
                throw new zzfo(e7, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        int i9 = zzen.zza;
        int read = inputStream.read(bArr, i7, i8);
        if (read == -1) {
            return -1;
        }
        long j3 = this.zzd;
        if (j3 != -1) {
            this.zzd = j3 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) {
        try {
            Uri uri = zzgcVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzi(zzgcVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            if (open.skip(zzgcVar.zze) < zzgcVar.zze) {
                throw new zzfo(null, 2008);
            }
            long j = zzgcVar.zzf;
            if (j != -1) {
                this.zzd = j;
            } else {
                long available = this.zzc.available();
                this.zzd = available;
                if (available == 2147483647L) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzj(zzgcVar);
            return this.zzd;
        } catch (zzfo e7) {
            throw e7;
        } catch (IOException e8) {
            throw new zzfo(e8, true != (e8 instanceof FileNotFoundException) ? 2000 : 2005);
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
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzh();
                }
            } catch (IOException e7) {
                throw new zzfo(e7, 2000);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzh();
            }
            throw th;
        }
    }
}
