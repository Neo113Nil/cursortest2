package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfbf implements zzfdg {
    public final zzflc zza;

    public zzfbf(zzflc zzflcVar) {
        this.zza = zzflcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflc zzflcVar = this.zza;
        if (zzflcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznE)).booleanValue()) {
                return;
            }
            bundle.putBoolean("render_in_browser", zzflcVar.zzb());
            bundle.putBoolean("disable_ml", zzflcVar.zzc());
        }
    }
}
