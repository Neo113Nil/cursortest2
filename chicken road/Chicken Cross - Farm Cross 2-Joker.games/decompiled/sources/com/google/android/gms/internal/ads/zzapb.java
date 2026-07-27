package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzapb {
    public static zzapc zza(zzapc zzapcVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (zzapcVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzapc) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzapc zzapcVar2 = new zzapc();
                while (i < length2) {
                    zzapcVar2.zzr((zzapc) map.get(strArr[i]));
                    i++;
                }
                return zzapcVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzapcVar.zzr((zzapc) map.get(strArr[0]));
                return zzapcVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    zzapcVar.zzr((zzapc) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return zzapcVar;
    }
}
