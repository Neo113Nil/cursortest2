package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzalu {
    public static java.lang.String zza(java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str = null;
        boolean z = false;
        while (it.hasNext()) {
            java.lang.String str2 = ((com.google.android.gms.internal.ads.zzaml) it.next()).zza.zzg.zzp;
            if (com.google.android.gms.internal.ads.zzas.zzb(str2)) {
                return "video/mp4";
            }
            if (com.google.android.gms.internal.ads.zzas.zza(str2)) {
                z = true;
            } else if (com.google.android.gms.internal.ads.zzas.zzc(str2)) {
                if (java.util.Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (java.util.Objects.equals(str2, androidx.media3.common.MimeTypes.IMAGE_AVIF)) {
                    str = androidx.media3.common.MimeTypes.IMAGE_AVIF;
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
