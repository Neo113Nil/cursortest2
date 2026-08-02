package com.google.android.gms.internal.ads;

import android.os.Bundle;
import io.sentry.protocol.Device;

/* loaded from: classes.dex */
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
        Bundle zza = zzfbo.zza(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, zza);
        Bundle zza2 = zzfbo.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble(Device.JsonKeys.BATTERY_LEVEL, this.zza);
    }
}
