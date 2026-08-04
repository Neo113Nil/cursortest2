package com.google.android.gms.internal.ads;

import E2.o;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzbim implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        try {
            String str = (String) map.get("enabled");
            zzbiz zzbizVar = zzbiy.zza;
            if (!zzfsn.zzc("true", str) && !zzfsn.zzc("false", str)) {
                return;
            }
            zzfpv.zza(zzcebVar.getContext()).zzb(Boolean.parseBoolean(str));
        } catch (IOException e7) {
            o.f1952C.f1961g.zzw(e7, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
