package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzqp extends BroadcastReceiver {
    final /* synthetic */ zzqr zza;

    /* synthetic */ zzqp(zzqr zzqrVar, byte[] bArr) {
        Objects.requireNonNull(zzqrVar);
        this.zza = zzqrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzqr zzqrVar = this.zza;
        zzqrVar.zzh(zzql.zzb(context, intent, zzqrVar.zzl(), zzqrVar.zzj(), zzqrVar.zzg()));
    }
}
