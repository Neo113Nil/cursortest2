package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzbj extends zzcy<Void, com.google.firebase.auth.internal.zza> {
    public zzbj() {
        super(2);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzaa() throws RemoteException {
        this.zzid.zzf(this.zzic.zzq(), this.zzib);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzab() {
        ((com.google.firebase.auth.internal.zza) this.zzie).zza(this.zzil, zzao.zza(this.zzeb, this.zzim));
        zzb(null);
    }
}
