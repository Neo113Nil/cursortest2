package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzbo extends zzcy<AuthResult, com.google.firebase.auth.internal.zza> {

    @NonNull
    private final com.google.android.gms.internal.firebase_auth.zzbf zzgw;

    public zzbo(@NonNull AuthCredential authCredential) {
        super(2);
        Preconditions.checkNotNull(authCredential, "credential cannot be null");
        this.zzgw = com.google.firebase.auth.internal.zzb.zza(authCredential);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzaa() throws RemoteException {
        this.zzid.zza(this.zzgw, this.zzib);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzab() {
        com.google.firebase.auth.internal.zzl zza = zzao.zza(this.zzeb, this.zzim);
        ((com.google.firebase.auth.internal.zza) this.zzie).zza(this.zzil, zza);
        zzb(new com.google.firebase.auth.internal.zzf(zza));
    }
}
