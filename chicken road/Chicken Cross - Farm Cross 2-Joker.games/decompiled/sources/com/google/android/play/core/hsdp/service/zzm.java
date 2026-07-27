package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import android.util.Log;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
abstract class zzm extends com.google.android.play.core.hsdp.protocol.zzd {
    /* synthetic */ zzm(zzo zzoVar) {
    }

    @Override // com.google.android.play.core.hsdp.protocol.zze
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 9270);
        if (i == 9272) {
            zzd();
        } else if (i != 9281) {
            zzc(i);
        } else {
            Log.i("HpoaClientImpl", "onStateChange: HPOA_SERVICE_NO_OP");
        }
    }

    abstract void zzc(int i);

    abstract void zzd();
}
