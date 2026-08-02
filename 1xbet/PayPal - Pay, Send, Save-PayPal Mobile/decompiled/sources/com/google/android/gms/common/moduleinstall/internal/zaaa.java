package com.google.android.gms.common.moduleinstall.internal;

/* loaded from: classes8.dex */
final class zaaa implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier {
    final /* synthetic */ com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate zaa;

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.common.moduleinstall.InstallStatusListener) obj).onInstallStatusUpdated(this.zaa);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }

    zaaa(com.google.android.gms.common.moduleinstall.internal.zaab zaabVar, com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.zaa = moduleInstallStatusUpdate;
    }
}
