package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgdo extends zzgdm {
    private static zzgdo zzd;

    private zzgdo(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzgdo zzh(Context context) {
        zzgdo zzgdoVar;
        synchronized (zzgdo.class) {
            if (zzd == null) {
                zzd = new zzgdo(context);
            }
            zzgdoVar = zzd;
        }
        return zzgdoVar;
    }

    public final zzgdj zzi(long j, boolean z) throws IOException {
        synchronized (zzgdo.class) {
            if (this.zzc.zzc()) {
                return zza(null, null, j, z);
            }
            return new zzgdj();
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzgdo.class) {
            if (zzg(false)) {
                zzc(false);
            }
        }
    }
}
