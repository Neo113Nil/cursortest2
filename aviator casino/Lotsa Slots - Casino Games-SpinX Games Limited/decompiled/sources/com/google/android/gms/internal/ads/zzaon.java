package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaon {
    public static com.google.android.gms.internal.ads.zzaoo zza(com.google.android.gms.internal.ads.zzaoo zzaooVar, java.lang.String[] strArr, java.util.Map map) {
        int length;
        int i = 0;
        if (zzaooVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (com.google.android.gms.internal.ads.zzaoo) map.get(strArr[0]);
            }
            if (length2 > 1) {
                com.google.android.gms.internal.ads.zzaoo zzaooVar2 = new com.google.android.gms.internal.ads.zzaoo();
                while (i < length2) {
                    zzaooVar2.zzr((com.google.android.gms.internal.ads.zzaoo) map.get(strArr[i]));
                    i++;
                }
                return zzaooVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzaooVar.zzr((com.google.android.gms.internal.ads.zzaoo) map.get(strArr[0]));
                return zzaooVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    zzaooVar.zzr((com.google.android.gms.internal.ads.zzaoo) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return zzaooVar;
    }
}
