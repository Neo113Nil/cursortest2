package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbjb implements zzbiz {
    private final zzbjc zza;

    public zzbjb(zzbjc zzbjcVar) {
        this.zza = zzbjcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f7 = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f7 = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e7) {
            int i7 = J.f3546b;
            j.e("Fail to parse float", e7);
        }
        this.zza.zzc(zEquals);
        this.zza.zzb(zEquals2, f7);
        zzcebVar.zzay(zEquals);
    }
}
