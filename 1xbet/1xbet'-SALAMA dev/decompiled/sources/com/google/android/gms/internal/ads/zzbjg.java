package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbjg implements zzbiz {
    static final Map zza;
    private final E2.b zzb;
    private final zzbrm zzc;
    private final zzbrt zzd;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        p122r.b bVar = new p122r.b(7);
        for (int i7 = 0; i7 < 7; i7++) {
            bVar.put(strArr[i7], numArr[i7]);
        }
        zza = Collections.unmodifiableMap(bVar);
    }

    public zzbjg(E2.b bVar, zzbrm zzbrmVar, zzbrt zzbrtVar) {
        this.zzb = bVar;
        this.zzc = zzbrmVar;
        this.zzd = zzbrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        int iIntValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i7 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                E2.b bVar = this.zzb;
                if (!bVar.b()) {
                    bVar.a(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zzc(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbrp(zzcebVar, map).zzb();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbrj(zzcebVar, map).zzc();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (iIntValue != 7) {
                        int i8 = J.f3546b;
                        j.f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z4 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcebVar == null) {
            int i9 = J.f3546b;
            j.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i7 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i7 = z4 ? -1 : 14;
        }
        zzcebVar.zzau(i7);
    }
}
