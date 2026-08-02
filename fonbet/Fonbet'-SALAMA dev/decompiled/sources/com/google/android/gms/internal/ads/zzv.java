package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class zzv {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzv)) {
            return false;
        }
        zzv zzvVar = (zzv) obj;
        if (zzen.zza >= 24) {
            return this.zza.equals(zzvVar.zza);
        }
        if (this.zza.size() != zzvVar.zza.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            if (zza(i7) != zzvVar.zza(i7)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (zzen.zza >= 24) {
            return this.zza.hashCode();
        }
        int size = this.zza.size();
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            size = (size * 31) + zza(i7);
        }
        return size;
    }

    public final int zza(int i7) {
        zzcv.zza(i7, 0, this.zza.size());
        return this.zza.keyAt(i7);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i7) {
        return this.zza.get(i7);
    }
}
