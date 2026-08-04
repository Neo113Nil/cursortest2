package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: classes.dex */
public final class zzcgh implements zzheg {
    private final zzhep zza;

    public zzcgh(zzhep zzhepVar) {
        this.zza = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        ApplicationInfo applicationInfo = ((zzcgi) this.zza).zza().getApplicationInfo();
        zzheo.zzb(applicationInfo);
        return applicationInfo;
    }
}
