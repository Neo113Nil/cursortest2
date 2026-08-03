package com.facebook.internal.security;

/* compiled from: CertificateUtil.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\t"}, d2 = {"Lcom/facebook/internal/security/CertificateUtil;", "", "()V", "DELIMITER", "", "getDELIMITER$facebook_core_release$annotations", "getCertificateHash", "ctx", "Landroid/content/Context;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CertificateUtil {
    public static final java.lang.String DELIMITER = ":";
    public static final com.facebook.internal.security.CertificateUtil INSTANCE = new com.facebook.internal.security.CertificateUtil();

    public static /* synthetic */ void getDELIMITER$facebook_core_release$annotations() {
    }

    private CertificateUtil() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getCertificateHash(android.content.Context ctx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            android.content.pm.Signature[] signatures = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 64).signatures;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA1");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
            int length = signatures.length;
            int i = 0;
            while (i < length) {
                android.content.pm.Signature signature = signatures[i];
                i++;
                messageDigest.update(signature.toByteArray());
                sb.append(android.util.Base64.encodeToString(messageDigest.digest(), 0));
                sb.append(":");
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            java.lang.String sb2 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
            return sb2;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.security.NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
