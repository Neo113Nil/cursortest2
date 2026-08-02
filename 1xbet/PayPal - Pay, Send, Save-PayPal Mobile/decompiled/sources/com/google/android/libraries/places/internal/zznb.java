package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zznb {
    private static android.os.DropBoxManager zza;
    private static final java.util.LinkedHashMap zzb = new com.google.android.libraries.places.internal.zzna(16, 0.75f, true);
    private static java.lang.String zzc;

    public static void zza(android.content.Context context) {
        synchronized (com.google.android.libraries.places.internal.zznb.class) {
            if (zza == null) {
                zza = (android.os.DropBoxManager) context.getApplicationContext().getSystemService("dropbox");
                zzc = "com.google.android.libraries.places";
            }
        }
    }

    public static void zzb(java.lang.Throwable th) {
        android.os.DropBoxManager dropBoxManager;
        long j;
        synchronized (com.google.android.libraries.places.internal.zznb.class) {
            long id = java.lang.Thread.currentThread().getId();
            int hashCode = th.hashCode();
            java.lang.Integer num = (java.lang.Integer) zzb.get(java.lang.Long.valueOf(id));
            if ((num == null || num.intValue() != hashCode) && (dropBoxManager = zza) != null && dropBoxManager.isTagEnabled("system_app_crash")) {
                android.os.DropBoxManager dropBoxManager2 = zza;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String str = zzc;
                java.util.List<java.lang.String> splitToList = com.google.common.base.Splitter.on(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR).splitToList("5.1.1");
                if (splitToList.size() == 3) {
                    long j2 = 0;
                    for (int i = 0; i < splitToList.size(); i++) {
                        try {
                            j2 = (j2 * 100) + java.lang.Integer.parseInt(splitToList.get(i));
                        } catch (java.lang.NumberFormatException unused) {
                        }
                    }
                    j = j2;
                    sb.append(java.lang.String.format("Package: %s v%d (%s)\n", str, java.lang.Long.valueOf(j), "5.1.1"));
                    sb.append(java.lang.String.format("Build: %s\n", android.os.Build.FINGERPRINT));
                    sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                    sb.append(android.util.Log.getStackTraceString(th));
                    dropBoxManager2.addText("system_app_crash", sb.toString());
                    zzb.put(java.lang.Long.valueOf(id), java.lang.Integer.valueOf(hashCode));
                }
                j = -1;
                sb.append(java.lang.String.format("Package: %s v%d (%s)\n", str, java.lang.Long.valueOf(j), "5.1.1"));
                sb.append(java.lang.String.format("Build: %s\n", android.os.Build.FINGERPRINT));
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                sb.append(android.util.Log.getStackTraceString(th));
                dropBoxManager2.addText("system_app_crash", sb.toString());
                zzb.put(java.lang.Long.valueOf(id), java.lang.Integer.valueOf(hashCode));
            }
        }
    }
}
