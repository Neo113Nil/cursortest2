package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import io.sentry.protocol.Device;

/* loaded from: classes.dex */
public final class zzesu implements zzesg {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzesu(String str, int i7, int i8, int i9, boolean z4, int i10) {
        this.zza = str;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = i9;
        this.zze = z4;
        this.zzf = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        zzfbo.zzf(bundle, "carrier", this.zza, !TextUtils.isEmpty(this.zza));
        int i7 = this.zzb;
        zzfbo.zze(bundle, "cnt", i7, i7 != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle zza = zzfbo.zza(bundle, Device.TYPE);
        bundle.putBundle(Device.TYPE, zza);
        Bundle zza2 = zzfbo.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzf);
        zza2.putBoolean("active_network_metered", this.zze);
    }
}
