package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.PhoneAuthCredential;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzbx extends zzcy<Void, com.google.firebase.auth.internal.zza> {

    @NonNull
    private final PhoneAuthCredential zzgx;

    public zzbx(PhoneAuthCredential phoneAuthCredential) {
        super(2);
        this.zzgx = (PhoneAuthCredential) Preconditions.checkNotNull(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzaa() throws RemoteException {
        this.zzid.zza(this.zzic.zzq(), this.zzgx, this.zzib);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzab() {
        ((com.google.firebase.auth.internal.zza) this.zzie).zza(this.zzil, zzao.zza(this.zzeb, this.zzim));
        zzb(null);
    }
}
