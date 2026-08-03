package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public final class zzcr {
    private static final androidx.collection.ArrayMap zza = new androidx.collection.ArrayMap();

    public static synchronized android.net.Uri zza(java.lang.String str) {
        synchronized (com.google.android.gms.internal.auth.zzcr.class) {
            androidx.collection.ArrayMap arrayMap = zza;
            android.net.Uri uri = (android.net.Uri) arrayMap.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            android.net.Uri parse = android.net.Uri.parse("content://com.google.android.gms.phenotype/".concat(java.lang.String.valueOf(android.net.Uri.encode("com.google.android.gms.auth_account"))));
            arrayMap.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
