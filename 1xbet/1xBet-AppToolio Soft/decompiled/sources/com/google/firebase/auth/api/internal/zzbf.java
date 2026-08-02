package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzbf extends zzcy<AuthResult, com.google.firebase.auth.internal.zza> {

    @NonNull
    private final EmailAuthCredential zzgv;

    public zzbf(@NonNull EmailAuthCredential emailAuthCredential) {
        super(2);
        this.zzgv = (EmailAuthCredential) Preconditions.checkNotNull(emailAuthCredential, "credential cannot be null or empty");
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzaa() throws RemoteException {
        this.zzid.zza(this.zzgv, this.zzib);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzab() {
        com.google.firebase.auth.internal.zzl zza = zzao.zza(this.zzeb, this.zzim);
        if (!this.zzic.getUid().equalsIgnoreCase(zza.getUid())) {
            zzc(new Status(FirebaseError.ERROR_USER_MISMATCH));
        } else {
            ((com.google.firebase.auth.internal.zza) this.zzie).zza(this.zzil, zza);
            zzb(new com.google.firebase.auth.internal.zzf(zza));
        }
    }
}
