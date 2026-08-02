package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzt {
    protected final java.util.Set zza = new java.util.HashSet();

    public final void zza(com.google.android.play.core.listener.StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            this.zza.add(stateUpdatedListener);
        }
    }

    public final void zzb(com.google.android.play.core.listener.StateUpdatedListener stateUpdatedListener) {
        synchronized (this) {
            this.zza.remove(stateUpdatedListener);
        }
    }

    public final void zzc(java.lang.Object obj) {
        synchronized (this) {
            java.util.Iterator it = this.zza.iterator();
            while (it.hasNext()) {
                ((com.google.android.play.core.listener.StateUpdatedListener) it.next()).onStateUpdate(obj);
            }
        }
    }
}
