package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzga {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public /* synthetic */ zzga(zzgc zzgcVar, zzgb zzgbVar) {
        this.zza = zzgcVar.zza;
        this.zzb = zzgcVar.zzd;
        this.zzc = zzgcVar.zze;
        this.zzd = zzgcVar.zzf;
        this.zze = zzgcVar.zzg;
    }

    public final zzga zza(int i7) {
        this.zze = 6;
        return this;
    }

    public final zzga zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzga zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzga zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzgc zze() {
        if (this.zza == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new zzgc(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public zzga() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1L;
    }
}
