package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzcq {
    static volatile com.google.android.gms.internal.auth.zzdh zza = com.google.android.gms.internal.auth.zzdh.zzc();
    private static final java.lang.Object zzb = new java.lang.Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(8:20|(1:22)(1:31)|23|(1:25)|27|28|29|30)|32|33|34|35|(1:37)|27|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(android.content.Context context, android.net.Uri uri) {
        java.lang.String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            android.util.Log.e("PhenotypeClientHelper", java.lang.String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (zza.zzb()) {
            return ((java.lang.Boolean) zza.zza()).booleanValue();
        }
        synchronized (zzb) {
            if (zza.zzb()) {
                return ((java.lang.Boolean) zza.zza()).booleanValue();
            }
            if (!"com.google.android.gms".equals(context.getPackageName())) {
                android.content.pm.ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", android.os.Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                if (resolveContentProvider != null) {
                }
                zza = com.google.android.gms.internal.auth.zzdh.zzd(java.lang.Boolean.valueOf(z));
                return ((java.lang.Boolean) zza.zza()).booleanValue();
            }
            if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                z = true;
            }
            zza = com.google.android.gms.internal.auth.zzdh.zzd(java.lang.Boolean.valueOf(z));
            return ((java.lang.Boolean) zza.zza()).booleanValue();
        }
    }
}
