package com.google.android.gms.dynamic;

/* loaded from: classes8.dex */
final class zaf implements com.google.android.gms.dynamic.zah {
    final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zaa;

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 4;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.zaa.zaa;
        lifecycleDelegate2.onStart();
    }

    zaf(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }
}
