package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzaif {
    public static String zza(List list) {
        Iterator it = list.iterator();
        String str = null;
        boolean z4 = false;
        while (it.hasNext()) {
            String str2 = ((zzair) it.next()).zza.zzg.zzo;
            if (zzay.zzj(str2)) {
                return "video/mp4";
            }
            if (zzay.zzh(str2)) {
                z4 = true;
            } else if (zzay.zzi(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z4 ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
