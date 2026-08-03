package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class MediationUtils {
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.ads.AdSize findClosestSize(android.content.Context context, com.google.android.gms.ads.AdSize adSize, java.util.List<com.google.android.gms.ads.AdSize> list) {
        com.google.android.gms.ads.AdSize adSize2 = null;
        if (list != null && adSize != null) {
            if (!adSize.zzc() && !adSize.zzg()) {
                float f = context.getResources().getDisplayMetrics().density;
                adSize = new com.google.android.gms.ads.AdSize(java.lang.Math.round(adSize.getWidthInPixels(context) / f), java.lang.Math.round(adSize.getHeightInPixels(context) / f));
            }
            float floatValue = ((java.lang.Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpS)).floatValue();
            float floatValue2 = ((java.lang.Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpT)).floatValue();
            int intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjb)).intValue();
            int intValue2 = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjc)).intValue();
            for (com.google.android.gms.ads.AdSize adSize3 : list) {
                if (adSize3 != null) {
                    int width = adSize.getWidth();
                    int width2 = adSize3.getWidth();
                    int height = adSize.getHeight();
                    int height2 = adSize3.getHeight();
                    if ((width * floatValue) - width2 <= 1.0E-6f && width >= width2) {
                        if (adSize.zzg()) {
                            int zzi = adSize.zzi();
                            if (intValue <= width2 && intValue2 <= height2 && zzi >= height2) {
                                if (adSize2 == null || adSize2.getWidth() * adSize2.getHeight() <= adSize3.getWidth() * adSize3.getHeight()) {
                                    adSize2 = adSize3;
                                }
                            }
                        } else if (adSize.zzc()) {
                            if (adSize.zzf() >= height2) {
                                if (adSize2 == null) {
                                }
                                adSize2 = adSize3;
                            }
                        } else if ((height * floatValue2) - height2 <= 1.0E-6f && height >= height2) {
                            if (adSize2 == null) {
                            }
                            adSize2 = adSize3;
                        }
                    }
                }
            }
        }
        return adSize2;
    }
}
