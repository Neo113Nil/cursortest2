package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgdn extends zzgdm {
    private static zzgdn zzd;

    private zzgdn(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzgdn zzh(Context context) {
        zzgdn zzgdnVar;
        synchronized (zzgdn.class) {
            if (zzd == null) {
                zzd = new zzgdn(context);
            }
            zzgdnVar = zzd;
        }
        return zzgdnVar;
    }

    public final zzgdj zzi(long j, boolean z) throws IOException {
        zzgdj zza;
        synchronized (zzgdn.class) {
            zza = zza(null, null, j, z);
        }
        return zza;
    }

    public final zzgdj zzj(String str, String str2, long j, boolean z) throws IOException {
        zzgdj zza;
        synchronized (zzgdn.class) {
            zza = zza(str, str2, j, z);
        }
        return zza;
    }

    public final void zzk() throws IOException {
        synchronized (zzgdn.class) {
            zzc(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzgdn.class) {
            zzc(true);
        }
    }
}
