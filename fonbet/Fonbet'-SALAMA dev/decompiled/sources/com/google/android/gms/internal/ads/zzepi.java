package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzepi implements zzesg {
    public final String zza;
    public final boolean zzb;

    public zzepi(String str, boolean z4) {
        this.zza = str;
        this.zzb = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ((zzcts) obj).zzb.putString("gct", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", "1");
        }
    }
}
