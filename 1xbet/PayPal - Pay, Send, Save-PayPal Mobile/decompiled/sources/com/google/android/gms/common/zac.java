package com.google.android.gms.common;

/* loaded from: classes8.dex */
final class zac implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.app.Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ androidx.view.result.ActivityResultLauncher zac;
    final /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zad;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        android.app.PendingIntent errorResolutionPendingIntent = this.zad.getErrorResolutionPendingIntent(this.zaa, this.zab, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.zac.launch(new androidx.activity.result.IntentSenderRequest.Builder(errorResolutionPendingIntent.getIntentSender()).build());
    }

    zac(com.google.android.gms.common.GoogleApiAvailability googleApiAvailability, android.app.Activity activity, int i, androidx.view.result.ActivityResultLauncher activityResultLauncher) {
        this.zad = googleApiAvailability;
        this.zaa = activity;
        this.zab = i;
        this.zac = activityResultLauncher;
    }
}
