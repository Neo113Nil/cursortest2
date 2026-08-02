package com.google.android.gms.dynamic;

/* loaded from: classes8.dex */
final class zag implements com.google.android.gms.dynamic.zah {
    final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zaa;

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 5;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.zaa.zaa;
        lifecycleDelegate2.onResume();
    }

    zag(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }
}
