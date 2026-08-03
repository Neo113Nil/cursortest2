package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzch {
    private static java.util.List zzb;
    private static final java.util.Map zza = new java.util.HashMap();
    private static final java.lang.Object zzc = new java.lang.Object();

    public static java.util.List zza(java.lang.String str) {
        java.util.ArrayList arrayList;
        java.lang.Object obj = zzc;
        synchronized (obj) {
            java.util.Map map = zza;
            if (map.containsKey(str)) {
                return (java.util.List) map.get(str);
            }
            try {
                synchronized (obj) {
                    if (zzb == null) {
                        zzb = java.util.Arrays.asList(new android.media.MediaCodecList(0).getCodecInfos());
                    }
                    arrayList = new java.util.ArrayList();
                    for (android.media.MediaCodecInfo mediaCodecInfo : zzb) {
                        if (!mediaCodecInfo.isEncoder() && java.util.Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put("codecName", mediaCodecInfo.getName());
                            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new java.lang.Integer[]{java.lang.Integer.valueOf(codecProfileLevel.profile), java.lang.Integer.valueOf(codecProfileLevel.level)});
                            }
                            hashMap.put("profileLevels", arrayList2);
                            android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            if (videoCapabilities != null) {
                                hashMap.put("bitRatesBps", zzb(videoCapabilities.getBitrateRange()));
                                hashMap.put("widthAlignment", java.lang.Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                hashMap.put("heightAlignment", java.lang.Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                hashMap.put("frameRates", zzb(videoCapabilities.getSupportedFrameRates()));
                                hashMap.put("widths", zzb(videoCapabilities.getSupportedWidths()));
                                hashMap.put("heights", zzb(videoCapabilities.getSupportedHeights()));
                            }
                            hashMap.put("instancesLimit", java.lang.Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            arrayList.add(hashMap);
                        }
                    }
                    zza.put(str, arrayList);
                }
                return arrayList;
            } catch (java.lang.LinkageError | java.lang.RuntimeException e) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(hashMap2);
                zza.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    private static java.lang.Integer[] zzb(android.util.Range range) {
        return new java.lang.Integer[]{(java.lang.Integer) range.getLower(), (java.lang.Integer) range.getUpper()};
    }
}
