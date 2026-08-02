package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzelp implements zzesg {
    private final com.google.android.gms.ads.internal.client.zzx zza;
    private final boolean zzb;

    public zzelp(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z4) {
        this.zza = zzxVar;
        this.zzb = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfu)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.zza;
        if (zzxVar != null) {
            int i7 = zzxVar.f10792a;
            if (i7 == 1) {
                bundle.putString("avo", "p");
            } else if (i7 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
