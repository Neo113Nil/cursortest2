package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
public final class zzt implements com.google.android.gms.fido.u2f.U2fPendingIntent {
    private final android.app.PendingIntent zza;

    public zzt(android.app.PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.fido.u2f.U2fPendingIntent
    public final boolean hasPendingIntent() {
        return this.zza != null;
    }

    @Override // com.google.android.gms.fido.u2f.U2fPendingIntent
    public final void launchPendingIntent(android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        android.app.PendingIntent pendingIntent = this.zza;
        if (pendingIntent == null) {
            throw new java.lang.IllegalStateException("No PendingIntent available");
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
    }
}
