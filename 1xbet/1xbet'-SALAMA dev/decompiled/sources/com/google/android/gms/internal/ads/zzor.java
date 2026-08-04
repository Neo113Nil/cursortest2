package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzor {
    public final String zza;
    private final zzoq zzb;
    private final Object zzc;

    static {
        new zzor("");
    }

    public zzor(String str) {
        this.zza = str;
        this.zzb = zzen.zza >= 31 ? new zzoq() : null;
        this.zzc = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzor)) {
            return false;
        }
        zzor zzorVar = (zzor) obj;
        return Objects.equals(this.zza, zzorVar.zza) && Objects.equals(this.zzb, zzorVar.zzb) && Objects.equals(this.zzc, zzorVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc);
    }

    public final synchronized LogSessionId zza() {
        zzoq zzoqVar;
        zzoqVar = this.zzb;
        if (zzoqVar == null) {
            throw null;
        }
        return zzoqVar.zza;
    }

    public final synchronized void zzb(LogSessionId logSessionId) {
        zzoq zzoqVar = this.zzb;
        if (zzoqVar == null) {
            throw null;
        }
        zzcv.zzf(zzoqVar.zza.equals(LogSessionId.LOG_SESSION_ID_NONE));
        zzoqVar.zza = logSessionId;
    }
}
