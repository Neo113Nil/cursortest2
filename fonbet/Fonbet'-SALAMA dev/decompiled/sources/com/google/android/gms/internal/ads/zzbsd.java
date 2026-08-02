package com.google.android.gms.internal.ads;

import O2.c;

/* loaded from: classes.dex */
public final class zzbsd extends zzbgw {
    private final c zza;

    public zzbsd(c cVar) {
        this.zza = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zze(zzbhd zzbhdVar) {
        this.zza.onNativeAdLoaded(new zzbrx(zzbhdVar));
    }
}
