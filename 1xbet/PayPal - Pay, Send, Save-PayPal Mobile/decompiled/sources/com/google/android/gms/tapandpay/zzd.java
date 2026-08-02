package com.google.android.gms.tapandpay;

/* loaded from: classes8.dex */
final class zzd implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier {
    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.tapandpay.TapAndPay.DataChangedListener) obj).onDataChanged();
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    zzd() {
    }
}
