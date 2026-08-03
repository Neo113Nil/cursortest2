package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes4.dex */
public final class zzi implements com.google.android.gms.fido.fido2.Fido2PendingIntent {
    private final android.app.PendingIntent zza;

    public zzi(android.app.PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.fido.fido2.Fido2PendingIntent
    public final boolean hasPendingIntent() {
        return this.zza != null;
    }

    @Override // com.google.android.gms.fido.fido2.Fido2PendingIntent
    public final void launchPendingIntent(android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        android.app.PendingIntent pendingIntent = this.zza;
        if (pendingIntent == null) {
            throw new java.lang.IllegalStateException("No PendingIntent available");
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
    }
}
