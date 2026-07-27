package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.util.Log;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
final class zzaz implements HsdpDeepLinkService.HsdpDeepLinkServiceListener {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Map zzc;
    final /* synthetic */ HsdpShimActivity zzd;

    zzaz(HsdpShimActivity hsdpShimActivity, String str, String str2, Map map) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = map;
        Objects.requireNonNull(hsdpShimActivity);
        this.zzd = hsdpShimActivity;
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onAffordanceEnded() {
        throw new UnsupportedOperationException("not supported when to call HSDP service from shim activity");
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onAffordanceStarted() {
        throw new UnsupportedOperationException("not supported when to call HSDP service from shim activity");
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onDeepLinkStarted() {
        throw new UnsupportedOperationException("not supported when to call HSDP service from shim activity");
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onDismissed(Bundle bundle) {
        boolean z;
        boolean z2;
        if (Log.isLoggable("HsdpShimActivity", 4)) {
            z2 = this.zzd.zzb;
            Log.i("HsdpShimActivity", "HSDP service based UI dismissed. hasBeenShown=" + z2);
        }
        boolean z3 = bundle.getBoolean("dldpRedirect", false);
        HsdpShimActivity hsdpShimActivity = this.zzd;
        z = hsdpShimActivity.zzb;
        if (!z && !z3) {
            Log.i("HsdpShimActivity", "Ignore dismiss before shown (likely temporary reuse cleanup)");
            return;
        }
        Log.i("HsdpShimActivity", "Finish the shim activity.");
        hsdpShimActivity.zza = null;
        hsdpShimActivity.finish();
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onError(Bundle bundle) {
        Log.e("HsdpShimActivity", "HSDP service based UI error: " + String.valueOf(bundle) + ". Finish the shim activity.");
        String str = this.zza;
        String str2 = this.zzb;
        Map map = this.zzc;
        HsdpShimActivity hsdpShimActivity = this.zzd;
        hsdpShimActivity.startActivityForResult(zzq.zza(str, str2, map), 0);
        hsdpShimActivity.zza = null;
        hsdpShimActivity.zzb = false;
        hsdpShimActivity.finish();
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpDeepLinkService.HsdpDeepLinkServiceListener
    public final void onShown(Bundle bundle) {
        Log.i("HsdpShimActivity", "HSDP service based UI shown");
        this.zzd.zzb = true;
    }
}
