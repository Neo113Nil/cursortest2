package com.google.android.gms.internal.playcore_age_signals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
public final class zzr {
    private static final com.google.android.gms.internal.playcore_age_signals.zzd zza = new com.google.android.gms.internal.playcore_age_signals.zzd("PhoneskyVerificationUtils");

    public static int zza(android.content.Context context) {
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            if (packageInfo.applicationInfo != null && packageInfo.applicationInfo.enabled && zzc(packageInfo.signatures)) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static boolean zzb(android.content.Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (zzc(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        return true;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    zza.zzd("Play Store package is not found.", new java.lang.Object[0]);
                }
            } else {
                zza.zzd("Play Store package is disabled.", new java.lang.Object[0]);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            zza.zzd("Play Store package is not found.", new java.lang.Object[0]);
        }
        return false;
    }

    private static boolean zzc(android.content.pm.Signature[] signatureArr) {
        if (signatureArr == null || (signatureArr.length) == 0) {
            zza.zzd("Play Store package is not signed -- possibly self-built package. Could not verify.", new java.lang.Object[0]);
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.Signature signature : signatureArr) {
            java.lang.String zza2 = com.google.android.gms.internal.playcore_age_signals.zzq.zza(signature.toByteArray());
            arrayList.add(zza2);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(zza2) || ((android.os.Build.TAGS.contains("dev-keys") || android.os.Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(zza2))) {
                return true;
            }
        }
        com.google.android.gms.internal.playcore_age_signals.zzd zzdVar = zza;
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((java.lang.CharSequence) ", ");
            }
        }
        objArr[0] = sb.toString();
        zzdVar.zzd(java.lang.String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", objArr), new java.lang.Object[0]);
        return false;
    }
}
