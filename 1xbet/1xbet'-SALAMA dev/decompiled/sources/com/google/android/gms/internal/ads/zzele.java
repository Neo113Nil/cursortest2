package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zzele implements zzesg {
    private final Bundle zza;

    public zzele(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcts zzctsVar = (zzcts) obj;
        if (this.zza.isEmpty()) {
            return;
        }
        zzctsVar.zza.putBundle("installed_adapter_data", this.zza);
    }
}
