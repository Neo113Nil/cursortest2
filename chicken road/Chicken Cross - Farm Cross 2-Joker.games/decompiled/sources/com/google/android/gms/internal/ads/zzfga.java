package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzfga implements Callable {
    static final /* synthetic */ zzfga zza = new zzfga();

    private /* synthetic */ zzfga() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaC);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaD)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, com.google.android.gms.ads.internal.util.zzch.zza(str2));
                }
            }
        }
        return new zzfgc(hashMap);
    }
}
