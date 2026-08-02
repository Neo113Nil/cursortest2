package com.google.android.gms.internal.ads;

import I2.r;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public final class zzbnq {
    static final r zza = new zzbno();
    static final r zzb = new zzbnp();
    private final zzbnc zzc;

    public zzbnq(Context context, VersionInfoParcel versionInfoParcel, String str, zzfgb zzfgbVar) {
        this.zzc = new zzbnc(context, versionInfoParcel, str, zza, zzb, zzfgbVar);
    }

    public final zzbng zza(String str, zzbnj zzbnjVar, zzbni zzbniVar) {
        return new zzbnu(this.zzc, str, zzbnjVar, zzbniVar);
    }

    public final zzbnz zzb() {
        return new zzbnz(this.zzc);
    }
}
