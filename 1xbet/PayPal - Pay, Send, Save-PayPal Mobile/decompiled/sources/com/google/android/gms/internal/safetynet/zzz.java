package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
abstract class zzz extends com.google.android.gms.internal.safetynet.zze<com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult> {
    protected final com.google.android.gms.internal.safetynet.zzg zze;

    public zzz(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zze = new com.google.android.gms.internal.safetynet.zzy(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return new com.google.android.gms.internal.safetynet.zzac(status, null);
    }
}
