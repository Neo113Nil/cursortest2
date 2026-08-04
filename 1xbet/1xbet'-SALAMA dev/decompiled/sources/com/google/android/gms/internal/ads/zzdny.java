package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzdny implements zzcvl {
    private final zzceb zza;

    public zzdny(zzceb zzcebVar) {
        this.zza = zzcebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzdh(Context context) {
        zzceb zzcebVar = this.zza;
        if (zzcebVar != null) {
            zzcebVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzdj(Context context) {
        zzceb zzcebVar = this.zza;
        if (zzcebVar != null) {
            zzcebVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zzdk(Context context) {
        zzceb zzcebVar = this.zza;
        if (zzcebVar != null) {
            zzcebVar.onResume();
        }
    }
}
