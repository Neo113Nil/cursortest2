package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class a implements com.iovation.mobile.android.a.h {
    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        linkedHashMap.put("APPN", context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
        linkedHashMap.put("APPID", applicationInfo.packageName);
        android.content.pm.Signature[] signatureArr = null;
        try {
            if (android.os.Build.VERSION.SDK_INT < 28) {
                signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            } else {
                android.content.pm.SigningInfo signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                if (signingInfo != null) {
                    signatureArr = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                }
            }
            if (signatureArr != null) {
                int length = signatureArr.length;
                java.lang.String str2 = "";
                int i = 0;
                while (i < length) {
                    android.content.pm.Signature signature = signatureArr[i];
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str);
                    sb.append(str2);
                    sb.append(signature.hashCode());
                    str = sb.toString();
                    i++;
                    str2 = ", ";
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = null;
        }
        linkedHashMap.put("AASN", str);
        linkedHashMap.put("EXEN", applicationInfo.sourceDir);
        if ((context.getApplicationInfo().flags & 2) != 0) {
            linkedHashMap.put("DEBUG", "1");
        } else {
            linkedHashMap.put("DEBUG", "0");
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(packageInfo);
            linkedHashMap.put("APPV", android.os.Build.VERSION.SDK_INT < 28 ? java.lang.String.valueOf(packageInfo.versionCode) : java.lang.String.valueOf(packageInfo.getLongVersionCode()));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
        }
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "96fa23";
    }
}
