package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzfpz extends zzfpx {
    private static zzfpz zzd;

    private zzfpz(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfpz zzi(Context context) {
        zzfpz zzfpzVar;
        synchronized (zzfpz.class) {
            try {
                if (zzd == null) {
                    zzd = new zzfpz(context);
                }
                zzfpzVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfpzVar;
    }

    public final zzfpu zzh(long j, boolean z4) {
        synchronized (zzfpz.class) {
            try {
                if (this.zzc.zzd()) {
                    return zzb(null, null, j, z4);
                }
                return new zzfpu();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() {
        synchronized (zzfpz.class) {
            try {
                if (zzg(false)) {
                    zzf(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
