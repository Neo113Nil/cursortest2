package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzbm extends zzcy<Void, com.google.firebase.auth.internal.zza> {
    private String zzhc;

    public zzbm(String str) {
        super(9);
        this.zzhc = str;
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzaa() throws RemoteException {
        this.zzid.zzk(this.zzhc, this.zzib);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzab() {
        zzb(null);
    }
}
