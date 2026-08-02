package com.google.android.gms.internal.ads;

import F2.InterfaceC0217a;

/* loaded from: classes.dex */
public final class zzcrv implements InterfaceC0217a {
    private final zzcrz zza;
    private final zzfba zzb;

    public zzcrv(zzcrz zzcrzVar, zzfba zzfbaVar) {
        this.zza = zzcrzVar;
        this.zzb = zzfbaVar;
    }

    @Override // F2.InterfaceC0217a
    public final void onAdClicked() {
        this.zza.zzc(this.zzb.zzf);
    }
}
