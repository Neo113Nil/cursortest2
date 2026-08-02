package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public final class zzbl extends com.google.android.gms.internal.tapandpay.zzbj {
    private final java.lang.ref.WeakReference zza;
    private final int zzb;

    public zzbl(android.app.Activity activity, int i) {
        this.zza = new java.lang.ref.WeakReference(activity);
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzd(com.google.android.gms.common.api.Status status, android.os.Bundle bundle) {
        android.app.Activity activity = (android.app.Activity) this.zza.get();
        if (activity == null) {
            android.util.Log.d("TapAndPayClientImpl", "Ignoring onHandlePendingIntent, Activity is gone");
            return;
        }
        if (status.hasResolution()) {
            try {
                status.startResolutionForResult(activity, this.zzb);
                return;
            } catch (android.content.IntentSender.SendIntentException e) {
                android.util.Log.w("TapAndPayClientImpl", "Exception starting pending intent", e);
            }
        }
        android.app.PendingIntent createPendingResult = activity.createPendingResult(this.zzb, new android.content.Intent(), 1073741824);
        if (createPendingResult == null) {
            android.util.Log.w("TapAndPayClientImpl", "Null pending result returned for onHandleStatusPendingIntent");
            return;
        }
        try {
            createPendingResult.send(status.isSuccess() ? -1 : status.getStatusCode());
        } catch (android.app.PendingIntent.CanceledException e2) {
            android.util.Log.w("TapAndPayClientImpl", "Exception setting pending result", e2);
        }
    }
}
