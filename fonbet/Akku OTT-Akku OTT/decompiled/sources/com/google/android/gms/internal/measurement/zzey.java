package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C0875q;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzey extends zzeq {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzco zzb;
    final /* synthetic */ zzfa zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzfa zzfaVar, Activity activity, zzco zzcoVar) {
        super(zzfaVar.zza, true);
        this.zza = activity;
        this.zzb = zzcoVar;
        Objects.requireNonNull(zzfaVar);
        this.zzc = zzfaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() throws RemoteException {
        zzcr zzQ = this.zzc.zza.zzQ();
        C0875q.g(zzQ);
        zzQ.onActivitySaveInstanceStateByScionActivityInfo(zzdf.zza(this.zza), this.zzb, this.zzi);
    }
}
