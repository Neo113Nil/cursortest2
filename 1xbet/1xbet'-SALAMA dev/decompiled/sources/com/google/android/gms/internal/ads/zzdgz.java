package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzdgz {
    private zzbfg zza;

    public zzdgz(zzdgk zzdgkVar) {
        this.zza = zzdgkVar;
    }

    public final synchronized zzbfg zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbfg zzbfgVar) {
        this.zza = zzbfgVar;
    }
}
