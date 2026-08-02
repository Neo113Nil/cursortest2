package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzbh extends zzcy<AuthResult, com.google.firebase.auth.internal.zza> {

    @NonNull
    private final String zzah;

    @NonNull
    private final String zzbi;

    public zzbh(@NonNull String str, @NonNull String str2) {
        super(2);
        this.zzah = Preconditions.checkNotEmpty(str, "email cannot be null or empty");
        this.zzbi = Preconditions.checkNotEmpty(str2, "password cannot be null or empty");
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzaa() throws RemoteException {
        this.zzid.zzd(this.zzah, this.zzbi, this.zzib);
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
