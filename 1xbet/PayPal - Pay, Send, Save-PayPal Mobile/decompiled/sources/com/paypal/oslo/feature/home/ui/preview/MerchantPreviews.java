package com.paypal.oslo.feature.home.ui.preview;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/MerchantPreviews;", "", "<init>", "()V", "", "id", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "logoUrl", "label", "backgroundColor", "", "showFavoriteButton", "isFavorite", "Lcom/paypal/oslo/feature/home/domain/model/Merchant;", "createMerchant$home_prodRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/home/domain/model/Merchant;", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "", "createSampleMerchants$home_prodRelease", "(I)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MerchantPreviews {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.preview.MerchantPreviews INSTANCE = new com.paypal.oslo.feature.home.ui.preview.MerchantPreviews();

    private MerchantPreviews() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.Merchant createMerchant$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.MerchantPreviews merchantPreviews, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z, boolean z2, int i, java.lang.Object obj) {
        return merchantPreviews.createMerchant$home_prodRelease((i & 1) != 0 ? "preview-merchant-".concat(java.lang.String.valueOf(java.lang.System.currentTimeMillis())) : str, (i & 2) != 0 ? "Preview Merchant" : str2, (i & 4) != 0 ? "Preview Description" : str3, (i & 8) != 0 ? "https://preview.url/logo.png" : str4, (i & 16) != 0 ? "Preview Label" : str5, (i & 32) != 0 ? "#E8F5E9" : str6, (i & 64) != 0 ? false : z, (i & 128) == 0 ? z2 : false);
    }

    public final com.paypal.oslo.feature.home.domain.model.Merchant createMerchant$home_prodRelease(java.lang.String id, java.lang.String name2, java.lang.String description, java.lang.String logoUrl, java.lang.String label, java.lang.String backgroundColor, boolean showFavoriteButton, boolean isFavorite) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundColor, "");
        return new com.paypal.oslo.feature.home.domain.model.Merchant(id, name2, label, description, logoUrl, backgroundColor, showFavoriteButton, isFavorite, null, null, null, null, 3840, null);
    }

    public static /* synthetic */ java.util.List createSampleMerchants$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.MerchantPreviews merchantPreviews, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        return merchantPreviews.createSampleMerchants$home_prodRelease(i);
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.Merchant> createSampleMerchants$home_prodRelease(int count) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < count; i++) {
            com.paypal.oslo.feature.home.ui.preview.MerchantPreviews merchantPreviews = INSTANCE;
            java.lang.String concat = "merchant-".concat(java.lang.String.valueOf(i));
            java.lang.String concat2 = "Merchant ".concat(java.lang.String.valueOf(i));
            java.lang.String concat3 = "Description ".concat(java.lang.String.valueOf(i));
            java.lang.String concat4 = "https://preview.url/".concat(java.lang.String.valueOf(i));
            java.lang.String concat5 = "Label ".concat(java.lang.String.valueOf(i));
            int nextInt = kotlin.random.Random.INSTANCE.nextInt(16777216);
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(nextInt)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            arrayList.add(createMerchant$home_prodRelease$default(merchantPreviews, concat, concat2, concat3, concat4, concat5, format, false, false, 192, null));
        }
        return arrayList;
    }
}
