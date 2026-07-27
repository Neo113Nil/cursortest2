package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhng {
    private HashMap zza = new HashMap();

    public final zzhnh zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzhnh zzhnhVar = new zzhnh(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzhnhVar;
    }
}
