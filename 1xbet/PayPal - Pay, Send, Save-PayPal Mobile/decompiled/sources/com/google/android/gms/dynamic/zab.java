package com.google.android.gms.dynamic;

/* loaded from: classes8.dex */
final class zab implements com.google.android.gms.dynamic.zah {
    final /* synthetic */ android.app.Activity zaa;
    final /* synthetic */ android.os.Bundle zab;
    final /* synthetic */ android.os.Bundle zac;
    final /* synthetic */ com.google.android.gms.dynamic.DeferredLifecycleHelper zad;

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 0;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate) {
        com.google.android.gms.dynamic.LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.zad.zaa;
        lifecycleDelegate2.onInflate(this.zaa, this.zab, this.zac);
    }

    zab(com.google.android.gms.dynamic.DeferredLifecycleHelper deferredLifecycleHelper, android.app.Activity activity, android.os.Bundle bundle, android.os.Bundle bundle2) {
        this.zad = deferredLifecycleHelper;
        this.zaa = activity;
        this.zab = bundle;
        this.zac = bundle2;
    }
}
