package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.internal.ads.zzbvq;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzb {
    private static volatile zzch zza;

    private zzb() {
    }

    public static zzch zza(Context context) {
        if (zza == null) {
            synchronized (zzb.class) {
                if (zza == null) {
                    zza = zzay.zzb().zzd(context, new zzbvq());
                }
            }
        }
        return zza;
    }
}
