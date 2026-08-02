package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzcrz {
    private final Object zza = new Object();
    private final ConcurrentHashMap zzb = new ConcurrentHashMap();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();
    private final ConcurrentHashMap zzd = new ConcurrentHashMap();

    public final int zza(String str) {
        Integer num = (Integer) this.zzb.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long zzb(String str) {
        Long l7 = (Long) this.zzd.get(str);
        if (l7 == null) {
            return -1L;
        }
        return l7.longValue();
    }

    public final void zzc(String str) {
        synchronized (this.zza) {
            try {
                Integer num = (Integer) this.zzb.get(str);
                this.zzb.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(String str, String str2, long j) {
        Long l7 = (Long) this.zzc.get(str2);
        if (l7 == null) {
            return;
        }
        this.zzc.remove(str2);
        this.zzd.put(str, Long.valueOf(j - l7.longValue()));
    }

    public final void zze(String str, long j) {
        this.zzc.put(str, Long.valueOf(j));
    }
}
