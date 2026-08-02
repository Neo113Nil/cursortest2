package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
public final class zab extends com.google.android.gms.common.api.internal.ActivityLifecycleObserver {
    private final java.lang.ref.WeakReference zaa;

    zab(com.google.android.gms.common.api.internal.zaa zaaVar) {
        this.zaa = new java.lang.ref.WeakReference(zaaVar);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(java.lang.Runnable runnable) {
        com.google.android.gms.common.api.internal.zaa zaaVar = (com.google.android.gms.common.api.internal.zaa) this.zaa.get();
        if (zaaVar == null) {
            throw new java.lang.IllegalStateException("The target activity has already been GC'd");
        }
        zaaVar.zac(runnable);
        return this;
    }
}
