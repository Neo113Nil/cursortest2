package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class zzesd implements zzesg {
    private final Bundle zza;

    public zzesd(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcts zzctsVar = (zzcts) obj;
        if (this.zza.isEmpty()) {
            return;
        }
        zzctsVar.zzb.putBundle("shared_pref", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcts zzctsVar = (zzcts) obj;
        if (this.zza.isEmpty()) {
            return;
        }
        zzctsVar.zza.putBundle("shared_pref", this.zza);
    }
}
