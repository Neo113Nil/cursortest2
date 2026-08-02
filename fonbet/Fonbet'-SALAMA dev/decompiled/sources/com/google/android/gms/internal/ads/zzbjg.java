package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbjg implements zzbiz {
    static final Map zza;
    private final E2.b zzb;
    private final zzbrm zzc;
    private final zzbrt zzd;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        r.b bVar = new r.b(7);
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
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i7 = 6;
        if (intValue != 5) {
            if (intValue != 7) {
                E2.b bVar = this.zzb;
                if (!bVar.b()) {
                    bVar.a(null);
                    return;
                }
                if (intValue == 1) {
                    this.zzc.zzc(map);
                    return;
                }
                if (intValue == 3) {
                    new zzbrp(zzcebVar, map).zzb();
                    return;
                }
                if (intValue == 4) {
                    new zzbrj(zzcebVar, map).zzc();
                    return;
                }
                if (intValue != 5) {
                    if (intValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (intValue != 7) {
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
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcebVar == null) {
            int i9 = J.f3546b;
            j.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i7 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i7 = parseBoolean ? -1 : 14;
        }
        zzcebVar.zzau(i7);
    }
}
