package com.google.android.gms.common.moduleinstall.internal;

/* loaded from: classes8.dex */
final class zaab extends com.google.android.gms.common.moduleinstall.internal.zag {
    private final com.google.android.gms.common.api.internal.ListenerHolder zaa;

    public zaab(com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zaa = listenerHolder;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zah
    public final void zab(com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.zaa.notifyListener(new com.google.android.gms.common.moduleinstall.internal.zaaa(this, moduleInstallStatusUpdate));
    }
}
