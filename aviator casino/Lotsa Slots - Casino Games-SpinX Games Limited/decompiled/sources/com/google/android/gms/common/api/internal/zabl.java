package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
final class zabl implements com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;

    zabl(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager) {
        this.zaa = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zar.sendMessage(googleApiManager.zar.obtainMessage(1, java.lang.Boolean.valueOf(z)));
    }
}
