package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbix implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        if (map.keySet().contains("start")) {
            zzcebVar.zzax(true);
        }
        if (map.keySet().contains("stop")) {
            zzcebVar.zzax(false);
        }
    }
}
