package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzelz implements zzesg {
    final String zza;
    final int zzb;

    public zzelz(String str, int i7) {
        this.zza = str;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        Bundle zza = zzfbo.zza(bundle, "pii");
        bundle.putBundle("pii", zza);
        zza.putString("pvid", this.zza);
        zza.putInt("pvid_s", this.zzb);
    }
}
