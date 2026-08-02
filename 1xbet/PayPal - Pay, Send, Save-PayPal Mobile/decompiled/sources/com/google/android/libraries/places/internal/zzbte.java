package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbte {
    private final java.util.Set zza = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());

    public final void zza(java.lang.Object obj, boolean z) {
        java.util.Set set = this.zza;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                zzd();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            zze();
        }
    }

    public final boolean zzb() {
        return !this.zza.isEmpty();
    }

    public final boolean zzc(java.lang.Object... objArr) {
        for (int i = 0; i < 2; i++) {
            if (this.zza.contains(objArr[i])) {
                return true;
            }
        }
        return false;
    }

    protected abstract void zzd();

    protected abstract void zze();
}
