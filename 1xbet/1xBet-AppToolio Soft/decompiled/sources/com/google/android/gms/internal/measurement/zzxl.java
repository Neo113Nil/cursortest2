package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class zzxl extends WeakReference<Throwable> {
    private final int zzbqf;

    public zzxl(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.zzbqf = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            zzxl zzxlVar = (zzxl) obj;
            if (this.zzbqf == zzxlVar.zzbqf && get() == zzxlVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzbqf;
    }
}
