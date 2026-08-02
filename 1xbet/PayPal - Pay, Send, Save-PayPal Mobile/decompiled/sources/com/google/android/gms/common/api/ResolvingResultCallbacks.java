package com.google.android.gms.common.api;

/* loaded from: classes8.dex */
public abstract class ResolvingResultCallbacks<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.ResultCallbacks<R> {
    private final android.app.Activity zza;
    private final int zzb;

    protected ResolvingResultCallbacks(android.app.Activity activity, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
        this.zzb = i;
    }

    @Override // com.google.android.gms.common.api.ResultCallbacks
    public final void onFailure(com.google.android.gms.common.api.Status status) {
        if (!status.hasResolution()) {
            onUnresolvableFailure(status);
            return;
        }
        try {
            status.startResolutionForResult(this.zza, this.zzb);
        } catch (android.content.IntentSender.SendIntentException unused) {
            onUnresolvableFailure(new com.google.android.gms.common.api.Status(8));
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallbacks
    public abstract void onSuccess(R r);

    public abstract void onUnresolvableFailure(com.google.android.gms.common.api.Status status);
}
