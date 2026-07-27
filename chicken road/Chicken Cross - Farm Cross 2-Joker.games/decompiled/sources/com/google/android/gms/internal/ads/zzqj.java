package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzqj {
    public static final zzqj zza;
    public final String zzb;
    private final zzqi zzc;

    static {
        new zzqj("");
        zza = new zzqj("preload");
    }

    public zzqj(String str) {
        this.zzb = str;
        this.zzc = Build.VERSION.SDK_INT >= 31 ? new zzqi() : null;
    }

    public final synchronized LogSessionId zza() {
        zzqi zzqiVar;
        zzqiVar = this.zzc;
        if (zzqiVar == null) {
            throw null;
        }
        zzqi zzqiVar2 = zzqiVar;
        return zzqiVar.zza;
    }

    public final synchronized void zzb(LogSessionId logSessionId) {
        zzqi zzqiVar = this.zzc;
        if (zzqiVar == null) {
            throw null;
        }
        zzqi zzqiVar2 = zzqiVar;
        zzguk.zzi(zzqiVar.zza.equals(LogSessionId.LOG_SESSION_ID_NONE));
        zzqiVar.zza = logSessionId;
    }
}
