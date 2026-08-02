package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgw implements zzfx {
    private final zzfx zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.emptyMap();

    public zzgw(zzfx zzfxVar) {
        this.zza = zzfxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) {
        int zza = this.zza.zza(bArr, i7, i8);
        if (zza != -1) {
            this.zzb += zza;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) {
        this.zzc = zzgcVar.zza;
        this.zzd = Collections.emptyMap();
        try {
            long zzb = this.zza.zzb(zzgcVar);
            Uri zzc = zzc();
            if (zzc != null) {
                this.zzc = zzc;
            }
            this.zzd = zze();
            return zzb;
        } catch (Throwable th) {
            Uri zzc2 = zzc();
            if (zzc2 != null) {
                this.zzc = zzc2;
            }
            this.zzd = zze();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzf(zzgx zzgxVar) {
        zzgxVar.getClass();
        this.zza.zzf(zzgxVar);
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }
}
