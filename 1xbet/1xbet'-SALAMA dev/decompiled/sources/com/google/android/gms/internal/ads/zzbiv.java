package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzbiv implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcebVar.zzde();
        } else if ("resume".equals(str)) {
            zzcebVar.zzdf();
        }
    }
}
