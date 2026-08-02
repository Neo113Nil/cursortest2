package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzcb {
    static java.util.HashMap zze;
    static boolean zzj;
    private static java.lang.Object zzm;
    public static final android.net.Uri zza = android.net.Uri.parse("content://com.google.android.gsf.gservices");
    public static final android.net.Uri zzb = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final java.util.regex.Pattern zzd = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final java.util.concurrent.atomic.AtomicBoolean zzl = new java.util.concurrent.atomic.AtomicBoolean();
    static final java.util.HashMap zzf = new java.util.HashMap(16, 1.0f);
    static final java.util.HashMap zzg = new java.util.HashMap(16, 1.0f);
    static final java.util.HashMap zzh = new java.util.HashMap(16, 1.0f);
    static final java.util.HashMap zzi = new java.util.HashMap(16, 1.0f);
    static final java.lang.String[] zzk = new java.lang.String[0];

    public static java.lang.String zza(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.auth.zzcb.class) {
            java.lang.String str3 = null;
            if (zze == null) {
                zzl.set(false);
                zze = new java.util.HashMap(16, 1.0f);
                zzm = new java.lang.Object();
                zzj = false;
                contentResolver.registerContentObserver(zza, true, new com.google.android.gms.internal.auth.zzca(null));
            } else if (zzl.getAndSet(false)) {
                zze.clear();
                zzf.clear();
                zzg.clear();
                zzh.clear();
                zzi.clear();
                zzm = new java.lang.Object();
                zzj = false;
            }
            java.lang.Object obj = zzm;
            if (zze.containsKey(str)) {
                java.lang.String str4 = (java.lang.String) zze.get(str);
                if (str4 != null) {
                    str3 = str4;
                }
                return str3;
            }
            int length = zzk.length;
            android.database.Cursor query = contentResolver.query(zza, null, null, new java.lang.String[]{str}, null);
            if (query == null) {
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    zzc(obj, str, null);
                    return null;
                }
                java.lang.String string = query.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                zzc(obj, str, string);
                if (string != null) {
                    return string;
                }
                return null;
            } finally {
                query.close();
            }
        }
    }

    private static void zzc(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        synchronized (com.google.android.gms.internal.auth.zzcb.class) {
            if (obj == zzm) {
                zze.put(str, str2);
            }
        }
    }
}
