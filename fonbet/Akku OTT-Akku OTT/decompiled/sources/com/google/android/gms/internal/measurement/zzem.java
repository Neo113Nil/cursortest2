package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C0875q;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzem extends zzeq {
    final /* synthetic */ Intent zza;
    final /* synthetic */ zzfb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzfb zzfbVar, Intent intent) {
        super(zzfbVar, true);
        this.zza = intent;
        Objects.requireNonNull(zzfbVar);
        this.zzb = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() throws RemoteException {
        zzcr zzQ = this.zzb.zzQ();
        C0875q.g(zzQ);
        zzQ.setSgtmDebugInfo(this.zza);
    }
}
