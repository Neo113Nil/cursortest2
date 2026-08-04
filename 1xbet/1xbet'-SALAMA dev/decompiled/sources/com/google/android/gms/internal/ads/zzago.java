package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzago implements zzau {
    public final List zza;

    public zzago(List list) {
        this.zza = list;
        boolean z4 = false;
        if (!list.isEmpty()) {
            long j = ((zzagn) list.get(0)).zzb;
            for (int i7 = 1; i7 < list.size(); i7++) {
                if (((zzagn) list.get(i7)).zza < j) {
                    z4 = true;
                    break;
                }
                j = ((zzagn) list.get(i7)).zzb;
            }
        }
        zzcv.zzd(!z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzago.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzago) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void zza(zzar zzarVar) {
    }
}
