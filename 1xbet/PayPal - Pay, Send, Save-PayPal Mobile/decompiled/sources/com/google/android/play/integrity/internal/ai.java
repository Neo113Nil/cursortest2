package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public final class ai {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.integrity.internal.s f3843a = new com.google.android.play.integrity.internal.s("PhoneskyVerificationUtils");

    public static int a(android.content.Context context) {
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            if (packageInfo.applicationInfo != null && packageInfo.applicationInfo.enabled && c(packageInfo.signatures)) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static boolean b(android.content.Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    if (c(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                        return true;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    f3843a.e("Play Store package is not found.", new java.lang.Object[0]);
                }
            } else {
                f3843a.e("Play Store package is disabled.", new java.lang.Object[0]);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            f3843a.e("Play Store package is not found.", new java.lang.Object[0]);
        }
        return false;
    }

    private static boolean c(android.content.pm.Signature[] signatureArr) {
        if (signatureArr == null || (signatureArr.length) == 0) {
            f3843a.e("Play Store package is not signed -- possibly self-built package. Could not verify.", new java.lang.Object[0]);
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.Signature signature : signatureArr) {
            java.lang.String a2 = com.google.android.play.integrity.internal.ah.a(signature.toByteArray());
            arrayList.add(a2);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a2)) {
                return true;
            }
            if ((android.os.Build.TAGS.contains("dev-keys") || android.os.Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a2)) {
                return true;
            }
        }
        com.google.android.play.integrity.internal.s sVar = f3843a;
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
        sVar.e(java.lang.String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb.toString()), new java.lang.Object[0]);
        return false;
    }
}
