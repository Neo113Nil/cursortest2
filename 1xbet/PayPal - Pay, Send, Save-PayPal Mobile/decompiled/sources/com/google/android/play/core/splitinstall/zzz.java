package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zzz implements com.google.android.play.core.common.IntentSenderForResultStarter {
    final /* synthetic */ android.app.Activity zza;

    @Override // com.google.android.play.core.common.IntentSenderForResultStarter
    public final void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        this.zza.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    zzz(com.google.android.play.core.splitinstall.zzaa zzaaVar, android.app.Activity activity) {
        this.zza = activity;
    }
}
