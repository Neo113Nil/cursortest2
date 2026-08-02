package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzell implements zzesg {
    private final String zza;
    private final boolean zzb;

    public zzell(String str, boolean z4) {
        this.zza = str;
        this.zzb = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        zzcts zzctsVar = (zzcts) obj;
        if (str != null) {
            Bundle zza = zzfbo.zza(zzctsVar.zza, "pii");
            zza.putString("afai", str);
            zza.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
