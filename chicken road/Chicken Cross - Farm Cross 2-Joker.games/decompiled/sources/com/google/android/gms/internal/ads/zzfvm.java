package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzfvm {
    public static zzfvm zze(zzfvn zzfvnVar, zzfvo zzfvoVar) {
        zzfxk.zza();
        return new zzfvq(zzfvnVar, zzfvoVar, UUID.randomUUID().toString());
    }

    public abstract void zza();

    public abstract void zzb(View view);

    public abstract void zzc();

    public abstract void zzd(View view, zzfvt zzfvtVar, String str);
}
