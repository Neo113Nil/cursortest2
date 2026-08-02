package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzat extends zzcy<Void, com.google.firebase.auth.internal.zzv> {
    public zzat() {
        super(5);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzaa() throws RemoteException {
        this.zzid.zzg(this.zzic.zzq(), this.zzib);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzab() {
        ((com.google.firebase.auth.internal.zzv) this.zzie).zzm();
        zzb(null);
    }
}
