package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/AffiliateUrlGenerator;", "", "<init>", "()V", "", "storeId", "storeUrl", "sessionId", "payerId", "generateAffiliateUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "KEY_IAB_SESSION_ID", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AffiliateUrlGenerator {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.AffiliateUrlGenerator INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.AffiliateUrlGenerator();
    public static final java.lang.String KEY_IAB_SESSION_ID = "iab_sid";

    private AffiliateUrlGenerator() {
    }

    public final java.lang.String generateAffiliateUrl(java.lang.String storeId, java.lang.String storeUrl, java.lang.String sessionId, java.lang.String payerId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("https://o.honey.io/store/");
        sb.append(storeId);
        sb.append("/website");
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(sb.toString()).buildUpon();
        java.lang.String str = payerId;
        buildUpon.appendQueryParameter("param0", (str == null || str.length() == 0) ? "" : "pp".concat(java.lang.String.valueOf(payerId)));
        buildUpon.appendQueryParameter("af0", "p".concat(java.lang.String.valueOf(sessionId)));
        buildUpon.appendQueryParameter("afsrc", "1");
        buildUpon.appendQueryParameter("cat", "deeplink");
        buildUpon.appendQueryParameter("src", "paypal-shopping");
        buildUpon.appendQueryParameter("feat", "shd");
        buildUpon.appendQueryParameter(KEY_IAB_SESSION_ID, sessionId);
        if (storeUrl != null) {
            buildUpon.appendQueryParameter("turl", storeUrl);
        }
        java.lang.String obj = buildUpon.build().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
