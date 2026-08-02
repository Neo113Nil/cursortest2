package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzfqa {
    private static zzfqa zzb;
    final zzfpw zza;

    private zzfqa(Context context) {
        this.zza = zzfpw.zzb(context);
        zzfpv.zza(context);
    }

    public static final zzfqa zza(Context context) {
        zzfqa zzfqaVar;
        synchronized (zzfqa.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfqa(context);
                }
                zzfqaVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfqaVar;
    }

    public final void zzb(zzfpu zzfpuVar) {
        synchronized (zzfqa.class) {
            this.zza.zze("vendor_scoped_gpid_v2_id");
            this.zza.zze("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
