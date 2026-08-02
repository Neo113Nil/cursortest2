package com.google.android.gms.internal.firebase_auth;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public class zzv extends RuntimeException {
    private zzad zzfi;

    public zzv(zzad zzadVar) {
        this.zzfi = (zzad) Preconditions.checkNotNull(zzadVar);
    }

    public zzv(Throwable th) {
        super(th);
    }

    @Nullable
    public final String getErrorMessage() {
        zzad zzadVar = this.zzfi;
        zzac zzar = zzadVar != null ? zzadVar.zzar() : null;
        return zzar != null ? zzar.getErrorMessage() : getMessage();
    }
}
