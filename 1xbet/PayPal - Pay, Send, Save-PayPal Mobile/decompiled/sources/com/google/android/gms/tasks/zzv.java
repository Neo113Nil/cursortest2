package com.google.android.gms.tasks;

/* loaded from: classes8.dex */
final class zzv extends com.google.android.gms.common.api.internal.LifecycleCallback {
    private final java.util.List zza;

    private zzv(com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.zza = new java.util.ArrayList();
        this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    public static com.google.android.gms.tasks.zzv zza(android.app.Activity activity) {
        com.google.android.gms.tasks.zzv zzvVar;
        com.google.android.gms.common.api.internal.LifecycleFragment fragment = getFragment(activity);
        synchronized (fragment) {
            zzvVar = (com.google.android.gms.tasks.zzv) fragment.getCallbackOrNull("TaskOnStopCallback", com.google.android.gms.tasks.zzv.class);
            if (zzvVar == null) {
                zzvVar = new com.google.android.gms.tasks.zzv(fragment);
            }
        }
        return zzvVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        java.util.List list = this.zza;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.tasks.zzq zzqVar = (com.google.android.gms.tasks.zzq) ((java.lang.ref.WeakReference) it.next()).get();
                if (zzqVar != null) {
                    zzqVar.zzb();
                }
            }
            list.clear();
        }
    }

    public final void zzb(com.google.android.gms.tasks.zzq zzqVar) {
        java.util.List list = this.zza;
        synchronized (list) {
            list.add(new java.lang.ref.WeakReference(zzqVar));
        }
    }
}
