package com.google.android.gms.internal.ads;

import android.os.Bundle;
import io.sentry.protocol.Device;

/* JADX INFO: loaded from: classes.dex */
public final class zzemr implements zzesg {
    private final double zza;
    private final boolean zzb;

    public zzemr(double d7, boolean z4) {
        this.zza = d7;
        this.zzb = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        Bundle bundleZza = zzfbo.zza(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, bundleZza);
        Bundle bundleZza2 = zzfbo.zza(bundleZza, "battery");
        bundleZza.putBundle("battery", bundleZza2);
        bundleZza2.putBoolean("is_charging", this.zzb);
        bundleZza2.putDouble(Device.JsonKeys.BATTERY_LEVEL, this.zza);
    }
}
