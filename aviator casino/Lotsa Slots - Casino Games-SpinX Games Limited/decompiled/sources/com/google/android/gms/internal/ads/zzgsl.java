package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgsl {
    private static final com.google.android.gms.internal.ads.zzgsj zza = new com.google.android.gms.internal.ads.zzgsj("PhoneskyVerificationUtils");

    public static boolean zza(android.content.Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        zza.zzb("Play Store package is not signed -- possibly self-built package. Could not verify.", new java.lang.Object[0]);
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (android.content.pm.Signature signature : signatureArr) {
                            java.lang.String zza2 = com.google.android.gms.internal.ads.zzgsk.zza(signature.toByteArray());
                            arrayList.add(zza2);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(zza2) || ((android.os.Build.TAGS.contains("dev-keys") || android.os.Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(zza2))) {
                                return true;
                            }
                        }
                        zza.zzb(java.lang.String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", kotlin.UByte$$ExternalSyntheticBackport0.m((java.lang.CharSequence) ", ", (java.lang.Iterable) arrayList)), new java.lang.Object[0]);
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    zza.zzb("Play Store package is not found.", new java.lang.Object[0]);
                }
            } else {
                zza.zzb("Play Store package is disabled.", new java.lang.Object[0]);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            zza.zzb("Play Store package is not found.", new java.lang.Object[0]);
        }
        return false;
    }
}
