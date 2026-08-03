package com.google.android.gms.fido.fido2;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public interface Fido2PendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException;
}
