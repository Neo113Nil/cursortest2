package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzfpy extends zzfpx {
    private static zzfpy zzd;

    private zzfpy(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfpy zzj(Context context) {
        zzfpy zzfpyVar;
        synchronized (zzfpy.class) {
            try {
                if (zzd == null) {
                    zzd = new zzfpy(context);
                }
                zzfpyVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfpyVar;
    }

    public final zzfpu zzh(long j, boolean z4) {
        zzfpu zzfpuVarZzb;
        synchronized (zzfpy.class) {
            zzfpuVarZzb = zzb(null, null, j, z4);
        }
        return zzfpuVarZzb;
    }

    public final zzfpu zzi(String str, String str2, long j, boolean z4) {
        zzfpu zzfpuVarZzb;
        synchronized (zzfpy.class) {
            zzfpuVarZzb = zzb(str, str2, j, z4);
        }
        return zzfpuVarZzb;
    }

    public final void zzk() {
        synchronized (zzfpy.class) {
            zzf(false);
        }
    }

    public final void zzl() {
        synchronized (zzfpy.class) {
            zzf(true);
        }
    }
}
