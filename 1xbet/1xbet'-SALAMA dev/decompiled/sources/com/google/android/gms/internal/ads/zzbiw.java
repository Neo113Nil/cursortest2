package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzbiw implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        if (map.keySet().contains("start")) {
            zzcebVar.zzN().zzp();
        } else if (map.keySet().contains("stop")) {
            zzcebVar.zzN().zzq();
        } else if (map.keySet().contains("cancel")) {
            zzcebVar.zzN().zzo();
        }
    }
}
