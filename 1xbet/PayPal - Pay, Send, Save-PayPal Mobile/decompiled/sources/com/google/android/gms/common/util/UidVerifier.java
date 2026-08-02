package com.google.android.gms.common.util;

/* loaded from: classes8.dex */
public final class UidVerifier {
    public static boolean isGooglePlayServicesUid(android.content.Context context, int i) {
        if (!uidHasPackageName(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return com.google.android.gms.common.GoogleSignatureVerifier.getInstance(context).isGooglePublicSignedPackage(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean uidHasPackageName(android.content.Context context, int i, java.lang.String str) {
        return com.google.android.gms.common.wrappers.Wrappers.packageManager(context).zza(i, str);
    }

    private UidVerifier() {
    }
}
