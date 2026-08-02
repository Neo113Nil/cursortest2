package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzfx {
    private static final Object zze = new Object();
    private final String zza;
    private final zzbn zzb;
    private final Object zzc;
    private final Object zzd = new Object();

    @GuardedBy("overrideLock")
    private volatile Object zzf = null;

    @GuardedBy("cachingLock")
    private volatile Object zzg = null;

    public /* synthetic */ zzfx(String str, Object obj, Object obj2, zzbn zzbnVar, byte[] bArr) {
        this.zza = str;
        this.zzc = obj;
        this.zzb = zzbnVar;
    }

    public final String zza() {
        return this.zza;
    }

    public final Object zzb(Object obj) {
        List<zzfx> list;
        synchronized (this.zzd) {
        }
        if (obj != null) {
            return obj;
        }
        if (zzfr.zza == null) {
            return this.zzc;
        }
        synchronized (zze) {
            try {
                if (zzae.zza()) {
                    return this.zzg == null ? this.zzc : this.zzg;
                }
                try {
                    list = zzfy.zzbl;
                    for (zzfx zzfxVar : list) {
                        if (zzae.zza()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            zzbn zzbnVar = zzfxVar.zzb;
                            if (zzbnVar != null) {
                                obj2 = zzbnVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (zze) {
                            zzfxVar.zzg = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                zzbn zzbnVar2 = this.zzb;
                if (zzbnVar2 != null) {
                    try {
                        return zzbnVar2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.zzc;
            } finally {
            }
        }
    }
}
