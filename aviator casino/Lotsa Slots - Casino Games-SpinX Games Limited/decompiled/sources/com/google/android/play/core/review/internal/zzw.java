package com.google.android.play.core.review.internal;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes4.dex */
public final class zzw {
    private static final com.google.android.play.core.review.internal.zzi zza = new com.google.android.play.core.review.internal.zzi("PhoneskyVerificationUtils");

    public static boolean zza(android.content.Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    zza.zze("Phonesky package is not signed -- possibly self-built package. Could not verify.", new java.lang.Object[0]);
                } else {
                    for (android.content.pm.Signature signature : signatureArr) {
                        java.lang.String zza2 = com.google.android.play.core.review.internal.zzv.zza(signature.toByteArray());
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(zza2)) {
                            return true;
                        }
                        if ((android.os.Build.TAGS.contains("dev-keys") || android.os.Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(zza2)) {
                            return true;
                        }
                    }
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
