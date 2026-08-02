package com.google.android.gms.internal.firebase_database;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class zzh extends WeakReference<Throwable> {
    private final int zzj;

    public zzh(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.zzj = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            zzh zzhVar = (zzh) obj;
            if (this.zzj == zzhVar.zzj && get() == zzhVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzj;
    }
}
