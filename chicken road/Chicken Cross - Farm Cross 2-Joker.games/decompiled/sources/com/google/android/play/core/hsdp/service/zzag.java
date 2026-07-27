package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
abstract class zzag extends com.google.android.play.core.hsdp.protocol.zzk {
    final /* synthetic */ zzai zzb;

    /* synthetic */ zzag(zzai zzaiVar, zzah zzahVar) {
        Objects.requireNonNull(zzaiVar);
        this.zzb = zzaiVar;
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzl
    public final void zzb(Bundle bundle) {
        this.zzb.zza();
    }

    @Override // com.google.android.play.core.hsdp.protocol.zzl
    public final void zzc(Bundle bundle) {
        int i = bundle.getInt("hsdpPrewarmStatusCode", 1);
        if (!bundle.containsKey("hsdpPrewarmStatusCode")) {
            Log.w("HsdpClientImpl", "HsdpServicePrewarmListener.onStateChange: cannot find status code");
        }
        if (Log.isLoggable("HsdpClientImpl", 3)) {
            Log.d("HsdpClientImpl", "HsdpServicePrewarmListener.onStateChange: " + i);
        }
        String string = bundle.getString("errorMessage", "");
        if (i != 2) {
            if (i != 6) {
                zze(i, string);
            } else {
                zzd();
            }
        }
    }

    abstract void zzd();

    abstract void zze(int i, String str);
}
