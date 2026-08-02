package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class zzfrp extends zzfqi {
    final /* synthetic */ zzfrq zza;
    private final zzfrv zzb;

    public zzfrp(zzfrq zzfrqVar, zzfrv zzfrvVar) {
        this.zza = zzfrqVar;
        this.zzb = zzfrvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzb(Bundle bundle) {
        int i7 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfrt zzc = zzfru.zzc();
        zzc.zzb(i7);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i7 == 8157) {
            this.zza.zzd();
        }
    }
}
