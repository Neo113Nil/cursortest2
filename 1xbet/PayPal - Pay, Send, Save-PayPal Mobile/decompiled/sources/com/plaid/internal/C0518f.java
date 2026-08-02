package com.plaid.internal;

/* renamed from: com.plaid.internal.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0518f {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList<java.lang.String> f6405a;

    /* renamed from: com.plaid.internal.f$a */
    public static final class a {
        public static java.lang.String a(java.lang.String str, java.lang.String str2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            java.lang.String obj = sb.toString();
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
                java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charset, "");
                byte[] bytes = obj.getBytes(charset);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                messageDigest.update(bytes);
                java.lang.String encodeToString = android.util.Base64.encodeToString(java.util.Arrays.copyOfRange(messageDigest.digest(), 0, 9), 3);
                kotlin.jvm.internal.Intrinsics.checkNotNull(encodeToString);
                java.lang.String substring = encodeToString.substring(0, 11);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                return substring;
            } catch (java.security.NoSuchAlgorithmException e) {
                com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "hash:NoSuchAlgorithm", new java.lang.Object[]{e});
                return null;
            }
        }
    }

    public final java.lang.String a(android.app.Application application) {
        android.content.pm.Signature[] apkContentsSigners;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        java.util.ArrayList<java.lang.String> arrayList = null;
        if (this.f6405a == null) {
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            try {
                java.lang.String packageName = application.getPackageName();
                android.content.pm.PackageManager packageManager = application.getPackageManager();
                if (android.os.Build.VERSION.SDK_INT < 28) {
                    apkContentsSigners = packageManager.getPackageInfo(packageName, 64).signatures;
                } else {
                    android.content.pm.SigningInfo signingInfo = packageManager.getPackageInfo(packageName, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
                    apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
                }
                if (apkContentsSigners != null) {
                    java.util.Iterator it = kotlin.jvm.internal.ArrayIteratorKt.iterator(apkContentsSigners);
                    while (it.hasNext()) {
                        android.content.pm.Signature signature = (android.content.pm.Signature) it.next();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(packageName);
                        java.lang.String charsString = signature.toCharsString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charsString, "");
                        java.lang.String a2 = com.plaid.internal.C0518f.a.a(packageName, charsString);
                        if (a2 != null) {
                            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                            java.lang.String format = java.lang.String.format("%s", java.util.Arrays.copyOf(new java.lang.Object[]{a2}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            arrayList2.add(format);
                        }
                    }
                }
                this.f6405a = arrayList2;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                java.lang.Object[] objArr = {e};
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
                com.plaid.internal.C0452a6.b.a("Unable to find package to obtain hash.", new java.lang.Object[]{objArr}, true);
            }
        }
        java.util.ArrayList<java.lang.String> arrayList3 = this.f6405a;
        if (arrayList3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            arrayList = arrayList3;
        }
        return (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
    }
}
