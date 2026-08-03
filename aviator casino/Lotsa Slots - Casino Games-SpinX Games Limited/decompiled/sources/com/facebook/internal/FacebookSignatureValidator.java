package com.facebook.internal;

/* compiled from: FacebookSignatureValidator.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/FacebookSignatureValidator;", "", "()V", "FBF_HASH", "", "FBI_HASH", "FBL_HASH", "FBR2_HASH", "FBR_HASH", "IGR_HASH", "MSR_HASH", "validAppSignatureHashes", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "validateSignature", "", "context", "Landroid/content/Context;", "packageName", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookSignatureValidator {
    public static final com.facebook.internal.FacebookSignatureValidator INSTANCE = new com.facebook.internal.FacebookSignatureValidator();
    private static final java.lang.String FBR_HASH = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9";
    private static final java.lang.String FBR2_HASH = "cc2751449a350f668590264ed76692694a80308a";
    private static final java.lang.String FBI_HASH = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc";
    private static final java.lang.String FBL_HASH = "df6b721c8b4d3b6eb44c861d4415007e5a35fc95";
    private static final java.lang.String MSR_HASH = "9b8f518b086098de3d77736f9458a3d2f6f95a37";
    private static final java.lang.String FBF_HASH = "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3";
    private static final java.lang.String IGR_HASH = "c56fb7d591ba6704df047fd98f535372fea00211";
    private static final java.util.HashSet<java.lang.String> validAppSignatureHashes = kotlin.collections.SetsKt.hashSetOf(FBR_HASH, FBR2_HASH, FBI_HASH, FBL_HASH, MSR_HASH, FBF_HASH, IGR_HASH);

    private FacebookSignatureValidator() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean validateSignature(android.content.Context context, java.lang.String packageName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        java.lang.String brand = android.os.Build.BRAND;
        int i = context.getApplicationInfo().flags;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(brand, "brand");
        if (kotlin.text.StringsKt.startsWith$default(brand, "generic", false, 2, (java.lang.Object) null) && (i & 2) != 0) {
            return true;
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 64);
            if (packageInfo.signatures == null) {
                return false;
            }
            android.content.pm.Signature[] signatureArr = packageInfo.signatures;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(signatureArr, "packageInfo.signatures");
            if (signatureArr.length == 0) {
                return false;
            }
            android.content.pm.Signature[] signatureArr2 = packageInfo.signatures;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(signatureArr2, "packageInfo.signatures");
            for (android.content.pm.Signature signature : signatureArr2) {
                java.util.HashSet<java.lang.String> hashSet = validAppSignatureHashes;
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                byte[] byteArray = signature.toByteArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "it.toByteArray()");
                if (!kotlin.collections.CollectionsKt.contains(hashSet, com.facebook.internal.Utility.sha1hash(byteArray))) {
                    return false;
                }
            }
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
