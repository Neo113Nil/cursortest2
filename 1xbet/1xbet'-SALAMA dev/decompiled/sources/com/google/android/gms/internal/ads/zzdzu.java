package com.google.android.gms.internal.ads;

import H2.j;
import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
final class zzdzu extends zzear {
    private Activity zza;
    private j zzb;
    private String zzc;
    private String zzd;

    @Override // com.google.android.gms.internal.ads.zzear
    public final zzear zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzear
    public final zzear zzb(j jVar) {
        this.zzb = jVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzear
    public final zzear zzc(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzear
    public final zzear zzd(String str) {
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzear
    public final zzeas zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzdzw(activity, this.zzb, this.zzc, this.zzd, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
