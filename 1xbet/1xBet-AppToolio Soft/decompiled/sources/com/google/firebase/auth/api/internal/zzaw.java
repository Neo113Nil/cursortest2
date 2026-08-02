package com.google.firebase.auth.api.internal;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.auth.GetTokenResult;

@VisibleForTesting
/* loaded from: classes.dex */
final class zzaw extends zzcy<GetTokenResult, com.google.firebase.auth.internal.zza> {

    @NonNull
    private final String zzai;

    public zzaw(@NonNull String str) {
        super(1);
        this.zzai = Preconditions.checkNotEmpty(str, "refresh token cannot be null");
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzaa() throws RemoteException {
        this.zzid.zza(this.zzai, this.zzib);
    }

    @Override // com.google.firebase.auth.api.internal.zzcy
    public final void zzab() {
        if (TextUtils.isEmpty(this.zzil.zzap())) {
            this.zzil.zzr(this.zzai);
        }
        ((com.google.firebase.auth.internal.zza) this.zzie).zza(this.zzil, this.zzic);
        zzb(com.google.firebase.auth.internal.zzy.zzag(this.zzil.zzaw()));
    }
}
