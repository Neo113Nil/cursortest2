package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzge implements zzfx {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzfx zzc;
    private zzfx zzd;
    private zzfx zze;
    private zzfx zzf;
    private zzfx zzg;
    private zzfx zzh;
    private zzfx zzi;
    private zzfx zzj;
    private zzfx zzk;

    public zzge(Context context, zzfx zzfxVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzfxVar;
    }

    private final zzfx zzg() {
        if (this.zze == null) {
            zzfp zzfpVar = new zzfp(this.zza);
            this.zze = zzfpVar;
            zzh(zzfpVar);
        }
        return this.zze;
    }

    private final void zzh(zzfx zzfxVar) {
        for (int i7 = 0; i7 < this.zzb.size(); i7++) {
            zzfxVar.zzf((zzgx) this.zzb.get(i7));
        }
    }

    private static final void zzi(zzfx zzfxVar, zzgx zzgxVar) {
        if (zzfxVar != null) {
            zzfxVar.zzf(zzgxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) {
        zzfx zzfxVar = this.zzk;
        zzfxVar.getClass();
        return zzfxVar.zza(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) {
        zzfx zzfxVar;
        zzcv.zzf(this.zzk == null);
        String scheme = zzgcVar.zza.getScheme();
        Uri uri = zzgcVar.zza;
        int i7 = zzen.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = zzgcVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzgm zzgmVar = new zzgm();
                    this.zzd = zzgmVar;
                    zzh(zzgmVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzfu zzfuVar = new zzfu(this.zza);
                this.zzf = zzfuVar;
                zzh(zzfuVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzfx zzfxVar2 = (zzfx) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.zzg = zzfxVar2;
                    zzh(zzfxVar2);
                } catch (ClassNotFoundException unused) {
                    zzdq.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating RTMP extension", e7);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzgz zzgzVar = new zzgz(2000);
                this.zzh = zzgzVar;
                zzh(zzgzVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzfv zzfvVar = new zzfv();
                this.zzi = zzfvVar;
                zzh(zzfvVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzgv zzgvVar = new zzgv(this.zza);
                    this.zzj = zzgvVar;
                    zzh(zzgvVar);
                }
                zzfxVar = this.zzj;
            } else {
                zzfxVar = this.zzc;
            }
            this.zzk = zzfxVar;
        }
        return this.zzk.zzb(zzgcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        zzfx zzfxVar = this.zzk;
        if (zzfxVar == null) {
            return null;
        }
        return zzfxVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        zzfx zzfxVar = this.zzk;
        if (zzfxVar != null) {
            try {
                zzfxVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Map zze() {
        zzfx zzfxVar = this.zzk;
        return zzfxVar == null ? Collections.emptyMap() : zzfxVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzf(zzgx zzgxVar) {
        zzgxVar.getClass();
        this.zzc.zzf(zzgxVar);
        this.zzb.add(zzgxVar);
        zzi(this.zzd, zzgxVar);
        zzi(this.zze, zzgxVar);
        zzi(this.zzf, zzgxVar);
        zzi(this.zzg, zzgxVar);
        zzi(this.zzh, zzgxVar);
        zzi(this.zzi, zzgxVar);
        zzi(this.zzj, zzgxVar);
    }
}
