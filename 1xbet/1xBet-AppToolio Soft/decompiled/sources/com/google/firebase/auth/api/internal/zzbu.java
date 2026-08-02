package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.AuthResult;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzbu extends zzcy<AuthResult, com.google.firebase.auth.internal.zza> {

    @NonNull
    private String zzhe;

    public zzbu(@NonNull String str) {
        super(2);
        this.zzhe = Preconditions.checkNotEmpty(str, "provider cannot be null or empty");
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzaa() throws RemoteException {
        this.zzid.zze(this.zzhe, this.zzic.zzq(), this.zzib);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzab() {
        com.google.firebase.auth.internal.zzl zza = zzao.zza(this.zzeb, this.zzim);
        ((com.google.firebase.auth.internal.zza) this.zzie).zza(this.zzil, zza);
        zzb(new com.google.firebase.auth.internal.zzf(zza));
    }
}
