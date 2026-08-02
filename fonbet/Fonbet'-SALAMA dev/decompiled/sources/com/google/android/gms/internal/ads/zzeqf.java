package com.google.android.gms.internal.ads;

import android.os.Bundle;
import io.sentry.protocol.Device;

/* loaded from: classes.dex */
public final class zzeqf implements zzesg {
    public final Bundle zza;

    public zzeqf(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        Bundle zza = zzfbo.zza(bundle, Device.TYPE);
        zza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(Device.TYPE, zza);
    }
}
