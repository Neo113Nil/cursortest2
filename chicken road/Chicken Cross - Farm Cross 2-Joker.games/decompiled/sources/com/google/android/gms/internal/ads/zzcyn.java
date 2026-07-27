package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcyn implements zzcyo {
    private final Map zza;

    zzcyn(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final zzemq zza(int i, String str) {
        return (zzemq) this.zza.get(str);
    }
}
