package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.PhoneAuthCredential;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzbs extends zzcy<AuthResult, com.google.firebase.auth.internal.zza> {
    private PhoneAuthCredential zzgx;

    public zzbs(PhoneAuthCredential phoneAuthCredential) {
        super(2);
        this.zzgx = (PhoneAuthCredential) Preconditions.checkNotNull(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzaa() throws RemoteException {
        this.zzid.zza(this.zzgx, this.zzib);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzab() {
        com.google.firebase.auth.internal.zzl zza = zzao.zza(this.zzeb, this.zzim);
        ((com.google.firebase.auth.internal.zza) this.zzie).zza(this.zzil, zza);
        zzb(new com.google.firebase.auth.internal.zzf(zza));
    }
}
