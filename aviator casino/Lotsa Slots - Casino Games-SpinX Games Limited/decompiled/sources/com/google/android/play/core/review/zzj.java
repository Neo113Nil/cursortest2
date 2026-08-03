package com.google.android.play.core.review;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
public final class zzj {
    private static final java.util.Set zza = new java.util.HashSet(java.util.Arrays.asList("native", "unity"));
    private static final java.util.Map zzb = new java.util.HashMap();
    private static final com.google.android.play.core.review.internal.zzi zzc = new com.google.android.play.core.review.internal.zzi("PlayCoreVersion");

    public static android.os.Bundle zza() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Map zzb2 = zzb();
        bundle.putInt("playcore_version_code", ((java.lang.Integer) zzb2.get("java")).intValue());
        if (zzb2.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((java.lang.Integer) zzb2.get("native")).intValue());
        }
        if (zzb2.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((java.lang.Integer) zzb2.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized java.util.Map zzb() {
        java.util.Map map;
        synchronized (com.google.android.play.core.review.zzj.class) {
            map = zzb;
            map.put("java", 11004);
        }
        return map;
    }
}
