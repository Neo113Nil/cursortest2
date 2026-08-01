package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhmn {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzhmn() {
    }

    public final zzhmn zza(Enum r2, Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final zzhmo zzb() {
        return new zzhmo(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    /* synthetic */ zzhmn(byte[] bArr) {
    }
}
