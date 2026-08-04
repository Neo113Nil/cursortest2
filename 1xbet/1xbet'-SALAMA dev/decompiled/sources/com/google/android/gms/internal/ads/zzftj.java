package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzftj implements Serializable, zzfti {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzftj) {
            return this.zza.equals(((zzftj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (Object obj : this.zza) {
            if (!z4) {
                sb.append(',');
            }
            sb.append(obj);
            z4 = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final boolean zza(Object obj) {
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            if (!((zzfti) this.zza.get(i7)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
