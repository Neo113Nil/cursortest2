package com.paypal.oslo.feature.wallet.common.util;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/util/ImageUrlBuilder;", "", "<init>", "()V", "", "baseUrl", "buildCardThumbnailUrl", "(Ljava/lang/String;)Ljava/lang/String;", "", "Camera2StreamConfigurationMap", "Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageUrlBuilder {
    public static final com.paypal.oslo.feature.wallet.common.util.ImageUrlBuilder INSTANCE = new com.paypal.oslo.feature.wallet.common.util.ImageUrlBuilder();
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{".png", com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX, ".jpeg", ".gif", ".webp"});
    public static final int $stable = 8;

    private ImageUrlBuilder() {
    }

    public final java.lang.String buildCardThumbnailUrl(java.lang.String baseUrl) {
        kotlin.Pair pair;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUrl, "");
        java.lang.String str = baseUrl;
        if (kotlin.text.StringsKt.isBlank(str)) {
            return baseUrl;
        }
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION, "#"}, false, 2, 2, (java.lang.Object) null);
        if (split$default.size() > 1) {
            java.lang.Object obj2 = split$default.get(0);
            java.lang.String substring = baseUrl.substring(((java.lang.String) split$default.get(0)).length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            pair = kotlin.TuplesKt.to(obj2, substring);
        } else {
            pair = kotlin.TuplesKt.to(baseUrl, "");
        }
        java.lang.String str2 = (java.lang.String) pair.component1();
        java.lang.String str3 = (java.lang.String) pair.component2();
        java.util.Iterator<T> it = Camera2StreamConfigurationMap.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.StringsKt.endsWith(str2, (java.lang.String) obj, true)) {
                break;
            }
        }
        java.lang.String str4 = (java.lang.String) obj;
        if (str4 != null) {
            java.lang.String substring2 = str2.substring(0, str2.length() - str4.length());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(substring2);
            sb.append("_33.png");
            sb.append(str3);
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str2);
        sb2.append("_33.png");
        sb2.append(str3);
        return sb2.toString();
    }
}
