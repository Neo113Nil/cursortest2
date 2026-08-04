package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zzeqy implements zzesg {
    private final Bundle zza;

    public zzeqy(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcts zzctsVar = (zzcts) obj;
        if (bundle != null) {
            zzctsVar.zzb.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzcts zzctsVar = (zzcts) obj;
        if (bundle != null) {
            zzctsVar.zza.putAll(bundle);
        }
    }
}
