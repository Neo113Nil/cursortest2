package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgdp {
    private static zzgdp zzb;
    final zzgdl zza;

    private zzgdp(Context context) {
        this.zza = zzgdl.zza(context);
        zzgdk.zza(context);
    }

    public static final zzgdp zza(Context context) {
        zzgdp zzgdpVar;
        synchronized (zzgdp.class) {
            if (zzb == null) {
                zzb = new zzgdp(context);
            }
            zzgdpVar = zzb;
        }
        return zzgdpVar;
    }

    public final void zzb(zzgdj zzgdjVar) throws IOException {
        synchronized (zzgdp.class) {
            zzgdl zzgdlVar = this.zza;
            zzgdlVar.zzf("vendor_scoped_gpid_v2_id");
            zzgdlVar.zzf("vendor_scoped_gpid_v2_creation_time");
        }
    }
}
