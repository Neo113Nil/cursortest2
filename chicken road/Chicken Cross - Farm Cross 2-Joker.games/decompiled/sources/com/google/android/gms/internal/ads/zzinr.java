package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzinr {
    final LinkedHashMap zza;

    zzinr(int i) {
        this.zza = zzint.zzc(i);
    }

    final zzinr zza(Object obj, zziof zziofVar) {
        zzioe.zza(obj, "key");
        zzioe.zza(zziofVar, IronSourceConstants.EVENTS_PROVIDER);
        this.zza.put(obj, zziofVar);
        return this;
    }
}
