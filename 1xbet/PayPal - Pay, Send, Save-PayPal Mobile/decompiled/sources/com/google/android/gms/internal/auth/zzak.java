package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzak implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zza;

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    public zzak(com.google.android.gms.common.api.Status status) {
        this.zza = status;
    }
}
