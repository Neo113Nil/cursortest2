package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
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
        zzfrt zzfrtVarZzc = zzfru.zzc();
        zzfrtVarZzc.zzb(i7);
        if (string != null) {
            zzfrtVarZzc.zza(string);
        }
        this.zzb.zza(zzfrtVarZzc.zzc());
        if (i7 == 8157) {
            this.zza.zzd();
        }
    }
}
