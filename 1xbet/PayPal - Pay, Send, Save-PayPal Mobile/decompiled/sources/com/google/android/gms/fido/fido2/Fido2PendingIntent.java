package com.google.android.gms.fido.fido2;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public interface Fido2PendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException;
}
