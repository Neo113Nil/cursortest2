package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zzero implements zzesg {
    private final String zza;
    private final Bundle zzb;

    public zzero(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcts zzctsVar = (zzcts) obj;
        zzctsVar.zza.putString("rtb", this.zza);
        if (this.zzb.isEmpty()) {
            return;
        }
        zzctsVar.zza.putBundle("adapter_initialization_status", this.zzb);
    }
}
