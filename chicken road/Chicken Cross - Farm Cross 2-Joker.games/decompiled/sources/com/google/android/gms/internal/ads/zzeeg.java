package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzeeg extends AdListener {
    final /* synthetic */ zzeem zza;

    zzeeg(zzeem zzeemVar) {
        Objects.requireNonNull(zzeemVar);
        this.zza = zzeemVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzeem zzeemVar = this.zza;
        zzl = zzeem.zzl(loadAdError);
        zzeemVar.zzf(zzl);
    }
}
