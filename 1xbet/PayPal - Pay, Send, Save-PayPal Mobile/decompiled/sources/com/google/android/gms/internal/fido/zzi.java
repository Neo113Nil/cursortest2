package com.google.android.gms.internal.fido;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class zzi implements com.google.android.gms.fido.fido2.Fido2PendingIntent {
    private final android.app.PendingIntent zza;

    @Override // com.google.android.gms.fido.fido2.Fido2PendingIntent
    public final void launchPendingIntent(android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        android.app.PendingIntent pendingIntent = this.zza;
        if (pendingIntent == null) {
            throw new java.lang.IllegalStateException("No PendingIntent available");
        }
        activity.startIntentSenderForResult(((android.app.PendingIntent) java.util.Objects.requireNonNull(pendingIntent)).getIntentSender(), i, null, 0, 0, 0);
    }

    @Override // com.google.android.gms.fido.fido2.Fido2PendingIntent
    public final boolean hasPendingIntent() {
        return this.zza != null;
    }

    public zzi(android.app.PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }
}
