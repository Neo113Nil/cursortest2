package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzaj implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zza;

    public zzaj(com.google.android.gms.common.api.Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }
}
