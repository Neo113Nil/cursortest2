package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzt implements com.google.android.gms.fido.u2f.U2fPendingIntent {
    private final android.app.PendingIntent zza;

    @Override // com.google.android.gms.fido.u2f.U2fPendingIntent
    public final void launchPendingIntent(android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        android.app.PendingIntent pendingIntent = this.zza;
        if (pendingIntent == null) {
            throw new java.lang.IllegalStateException("No PendingIntent available");
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
    }

    @Override // com.google.android.gms.fido.u2f.U2fPendingIntent
    public final boolean hasPendingIntent() {
        return this.zza != null;
    }

    public zzt(android.app.PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }
}
