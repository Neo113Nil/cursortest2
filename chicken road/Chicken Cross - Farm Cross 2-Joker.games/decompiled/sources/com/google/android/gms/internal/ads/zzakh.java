package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzakh implements zzao {
    public final List zza;

    public zzakh(List list) {
        this.zza = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((zzakg) list.get(0)).zzb;
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (((zzakg) list.get(i)).zza < j) {
                    z = true;
                    break;
                } else {
                    j = ((zzakg) list.get(i)).zzb;
                    i++;
                }
            }
        }
        zzguk.zza(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzakh) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }
}
