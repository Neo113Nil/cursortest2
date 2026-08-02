package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;

/* loaded from: classes.dex */
final class zzbmy implements zzbzh {
    final /* synthetic */ zzbmw zza;

    public zzbmy(zzbnb zzbnbVar, zzbmw zzbmwVar) {
        this.zza = zzbmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zza() {
        J.k("Rejecting reference for JS Engine.");
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhI)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
