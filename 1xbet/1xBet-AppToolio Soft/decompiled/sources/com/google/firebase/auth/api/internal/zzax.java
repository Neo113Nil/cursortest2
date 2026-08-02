package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzax extends zzcy<AuthResult, com.google.firebase.auth.internal.zza> {

    @NonNull
    private final EmailAuthCredential zzgv;

    public zzax(@NonNull EmailAuthCredential emailAuthCredential) {
        super(2);
        this.zzgv = (EmailAuthCredential) Preconditions.checkNotNull(emailAuthCredential, "credential cannot be null");
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzaa() throws RemoteException {
        this.zzid.zza(this.zzgv.getEmail(), this.zzgv.getPassword(), this.zzic.zzq(), this.zzib);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzab() {
        com.google.firebase.auth.internal.zzl zza = zzao.zza(this.zzeb, this.zzim);
        ((com.google.firebase.auth.internal.zza) this.zzie).zza(this.zzil, zza);
        zzb(new com.google.firebase.auth.internal.zzf(zza));
    }
}
