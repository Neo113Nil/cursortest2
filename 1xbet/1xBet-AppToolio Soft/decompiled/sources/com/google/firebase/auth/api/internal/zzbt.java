package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.AuthResult;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzbt extends zzcy<AuthResult, com.google.firebase.auth.internal.zza> {
    public zzbt() {
        super(2);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzaa() throws RemoteException {
        this.zzid.zze(this.zzic.zzq(), this.zzib);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzab() {
        com.google.firebase.auth.internal.zzl zza = zzao.zza(this.zzeb, this.zzim);
        ((com.google.firebase.auth.internal.zza) this.zzie).zza(this.zzil, zza);
        zzb(new com.google.firebase.auth.internal.zzf(zza));
    }
}
