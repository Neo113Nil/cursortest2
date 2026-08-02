package com.google.android.gms.fido.u2f;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public interface U2fPendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException;
}
