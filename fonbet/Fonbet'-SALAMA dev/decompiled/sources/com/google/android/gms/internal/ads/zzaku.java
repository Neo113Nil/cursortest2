package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzaku {
    public static zzakv zza(zzakv zzakvVar, String[] strArr, Map map) {
        int length;
        int i7 = 0;
        if (zzakvVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzakv) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzakv zzakvVar2 = new zzakv();
                while (i7 < length2) {
                    zzakvVar2.zzl((zzakv) map.get(strArr[i7]));
                    i7++;
                }
                return zzakvVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzakvVar.zzl((zzakv) map.get(strArr[0]));
                return zzakvVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i7 < length) {
                    zzakvVar.zzl((zzakv) map.get(strArr[i7]));
                    i7++;
                }
            }
        }
        return zzakvVar;
    }
}
