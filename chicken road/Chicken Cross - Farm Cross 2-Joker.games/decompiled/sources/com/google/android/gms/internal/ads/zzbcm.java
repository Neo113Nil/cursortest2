package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbcm extends BroadcastReceiver {
    final /* synthetic */ zzbcn zza;

    zzbcm(zzbcn zzbcnVar) {
        Objects.requireNonNull(zzbcnVar);
        this.zza = zzbcnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzd();
    }
}
