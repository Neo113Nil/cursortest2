package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.H;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzevc implements zzesh {
    private final zzgbn zza;

    public zzevc(zzgbn zzgbnVar) {
        this.zza = zzgbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                zzbbp zzbbpVar = zzbby.zzY;
                C0254t c0254t = C0254t.f2723d;
                String str = (String) c0254t.f2726c.zzb(zzbbpVar);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) c0254t.f2726c.zzb(zzbby.zzZ)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, H.a(str2));
                        }
                    }
                }
                return new zzevd(hashMap);
            }
        });
    }
}
