package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
final class zzaa extends zzag {
    final /* synthetic */ HsdpDeepLinkService.HsdpPrewarmListener zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaa(zzai zzaiVar, HsdpDeepLinkService.HsdpPrewarmListener hsdpPrewarmListener) {
        super(zzaiVar, null);
        this.zza = hsdpPrewarmListener;
        Objects.requireNonNull(zzaiVar);
    }

    @Override // com.google.android.play.core.hsdp.service.zzag
    final void zzd() {
        this.zza.onCompleted(new Bundle());
    }

    @Override // com.google.android.play.core.hsdp.service.zzag
    final void zze(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(IronSourceConstants.EVENTS_ERROR_CODE, i);
        bundle.putString("errorMessage", str);
        this.zza.onError(bundle);
    }
}
