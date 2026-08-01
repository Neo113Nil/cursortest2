package com.google.android.play.core.hsdp.service;

import android.util.Log;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
final class zzl extends zzm {
    final /* synthetic */ HsdpDeepLinkService.AffordanceListener zza;
    final /* synthetic */ zzp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzl(zzp zzpVar, HsdpDeepLinkService.AffordanceListener affordanceListener) {
        super(null);
        this.zza = affordanceListener;
        Objects.requireNonNull(zzpVar);
        this.zzb = zzpVar;
    }

    @Override // com.google.android.play.core.hsdp.service.zzm
    protected final void zzc(int i) {
        Log.e("HpoaClientImpl", "HPOA error: " + i);
        if (i == 9278) {
            this.zza.onError("HPOA internal error");
        } else if (i == 9279) {
            this.zza.onError("HPOA authentication error");
        } else if (i == 9280) {
            this.zza.onError("HPOA invalid parameter");
        } else {
            this.zza.onError("HPOA unknown error");
        }
        this.zzb.zza();
    }

    @Override // com.google.android.play.core.hsdp.service.zzm
    protected final void zzd() {
        this.zza.onStop();
        this.zzb.zza();
    }
}
