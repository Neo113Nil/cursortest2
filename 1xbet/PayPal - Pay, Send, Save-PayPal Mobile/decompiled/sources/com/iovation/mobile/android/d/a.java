package com.iovation.mobile.android.d;

/* loaded from: classes9.dex */
public abstract class a {
    public static boolean a(java.lang.String str, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid()) == 0;
    }

    public static java.lang.String a(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA256");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            kotlin.jvm.internal.Intrinsics.checkNotNull(digest);
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, digest);
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format("%032x", java.util.Arrays.copyOf(new java.lang.Object[]{bigInteger}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            return format;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static java.lang.String a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.Process exec = java.lang.Runtime.getRuntime().exec(str);
            java.io.InputStream inputStream = exec.getInputStream();
            kotlin.jvm.internal.Intrinsics.checkNotNull(inputStream);
            java.lang.String a2 = a(inputStream);
            try {
                try {
                    exec.waitFor();
                    return a2;
                } catch (android.system.ErrnoException unused) {
                    return a2;
                }
            } catch (android.system.ErrnoException unused2) {
                exec.destroy();
                return a2;
            }
        } catch (java.io.IOException unused3) {
            return null;
        }
    }

    public static java.lang.String a(java.io.InputStream inputStream) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
        while (true) {
            try {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                    } else {
                        try {
                            break;
                        } catch (java.io.IOException e) {
                        }
                    }
                } catch (java.io.IOException e2) {
                    e2.getMessage();
                    try {
                        bufferedReader.close();
                    } catch (java.io.IOException e3) {
                        e3.getMessage();
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (java.io.IOException e4) {
                    e4.getMessage();
                }
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
