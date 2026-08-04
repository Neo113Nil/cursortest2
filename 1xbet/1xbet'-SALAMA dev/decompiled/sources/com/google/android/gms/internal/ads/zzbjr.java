package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbjr implements zzbiz {
    private final zzbjq zza;

    public zzbjr(zzbjq zzbjqVar) {
        this.zza = zzbjqVar;
    }

    public static void zzb(zzceb zzcebVar, zzbjq zzbjqVar) {
        zzcebVar.zzag("/reward", new zzbjr(zzbjqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzb();
                    return;
                }
                return;
            }
        }
        zzbvm zzbvmVar = null;
        try {
            int i7 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbvmVar = new zzbvm(str2, i7);
            }
        } catch (NumberFormatException e7) {
            int i8 = J.f3546b;
            j.h("Unable to parse reward amount.", e7);
        }
        this.zza.zza(zzbvmVar);
    }
}
