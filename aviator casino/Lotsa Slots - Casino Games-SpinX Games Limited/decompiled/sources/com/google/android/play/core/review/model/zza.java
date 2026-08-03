package com.google.android.play.core.review.model;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
public final class zza {
    private static final java.util.Map zza;
    private static final java.util.Map zzb;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        zza = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        zzb = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }

    public static java.lang.String zza(int i) {
        java.util.Map map = zza;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        return ((java.lang.String) map.get(valueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((java.lang.String) zzb.get(valueOf)) + ")";
    }
}
