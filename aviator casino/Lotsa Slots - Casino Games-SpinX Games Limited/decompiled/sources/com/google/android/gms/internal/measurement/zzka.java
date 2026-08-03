package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzka {
    public static final /* synthetic */ int zza = 0;
    private static final androidx.collection.ArrayMap zzb = new androidx.collection.ArrayMap();

    public static synchronized android.net.Uri zza(java.lang.String str) {
        synchronized (com.google.android.gms.internal.measurement.zzka.class) {
            androidx.collection.ArrayMap arrayMap = zzb;
            android.net.Uri uri = (android.net.Uri) arrayMap.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            java.lang.String encode = android.net.Uri.encode("com.google.android.gms.measurement");
            java.lang.String.valueOf(encode);
            android.net.Uri parse = android.net.Uri.parse("content://com.google.android.gms.phenotype/".concat(java.lang.String.valueOf(encode)));
            arrayMap.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
