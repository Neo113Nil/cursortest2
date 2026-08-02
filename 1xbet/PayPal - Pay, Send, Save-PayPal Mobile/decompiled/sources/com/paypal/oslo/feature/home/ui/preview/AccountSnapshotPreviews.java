package com.paypal.oslo.feature.home.ui.preview;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jµ\u0001\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/home/ui/preview/AccountSnapshotPreviews;", "", "<init>", "()V", "", "id", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "type", "Lcom/paypal/oslo/feature/home/domain/model/BackgroundColors;", "backgroundColors", "title", "Lcom/paypal/oslo/feature/home/domain/model/TitleColors;", "titleColor", "amount", "Lcom/paypal/oslo/feature/home/domain/model/AmountColors;", "amountColors", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "footer", "Lcom/paypal/oslo/feature/home/domain/model/FooterColors;", "footerColor", "Lcom/paypal/oslo/feature/home/domain/model/HomeIcon;", "footerIcon", "footerIconColor", "", "imageUrls", "icons", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "createSnapshotItem$home_prodRelease", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;Lcom/paypal/oslo/feature/home/domain/model/BackgroundColors;Ljava/lang/String;Lcom/paypal/oslo/feature/home/domain/model/TitleColors;Ljava/lang/String;Lcom/paypal/oslo/feature/home/domain/model/AmountColors;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/domain/model/FooterColors;Lcom/paypal/oslo/feature/home/domain/model/HomeIcon;Lcom/paypal/oslo/feature/home/domain/model/FooterColors;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "", io.ktor.http.ContentDisposition.Parameters.Size, "createSampleAccountSnapshot$home_prodRelease", "(I)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountSnapshotPreviews {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.preview.AccountSnapshotPreviews INSTANCE = new com.paypal.oslo.feature.home.ui.preview.AccountSnapshotPreviews();

    private AccountSnapshotPreviews() {
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem createSnapshotItem$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.AccountSnapshotPreviews accountSnapshotPreviews, java.lang.String str, com.paypal.oslo.feature.home.api.AccountSnapshotType accountSnapshotType, com.paypal.oslo.feature.home.domain.model.BackgroundColors backgroundColors, java.lang.String str2, com.paypal.oslo.feature.home.domain.model.TitleColors titleColors, java.lang.String str3, com.paypal.oslo.feature.home.domain.model.AmountColors amountColors, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.home.domain.model.FooterColors footerColors, com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon, com.paypal.oslo.feature.home.domain.model.FooterColors footerColors2, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        return accountSnapshotPreviews.createSnapshotItem$home_prodRelease((i & 1) != 0 ? "preview-balance-".concat(java.lang.String.valueOf(java.lang.System.currentTimeMillis())) : str, (i & 2) != 0 ? com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalBalance.INSTANCE : accountSnapshotType, (i & 4) != 0 ? com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default.INSTANCE : backgroundColors, (i & 8) != 0 ? "Preview Title" : str2, (i & 16) != 0 ? null : titleColors, (i & 32) != 0 ? com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PreviewConstants.SAMPLE_BALANCE : str3, (i & 64) != 0 ? com.paypal.oslo.feature.home.domain.model.AmountColors.Base.INSTANCE : amountColors, (i & 128) != 0 ? "Desc 1" : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? com.paypal.oslo.feature.home.domain.model.FooterColors.Neutral.INSTANCE : footerColors, (i & 1024) != 0 ? null : homeIcon, (i & 2048) == 0 ? footerColors2 : null, (i & 4096) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8192) != 0 ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.home.domain.model.HomeIcon.Trophy) : list2);
    }

    public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem createSnapshotItem$home_prodRelease(java.lang.String id, com.paypal.oslo.feature.home.api.AccountSnapshotType type, com.paypal.oslo.feature.home.domain.model.BackgroundColors backgroundColors, java.lang.String title, com.paypal.oslo.feature.home.domain.model.TitleColors titleColor, java.lang.String amount, com.paypal.oslo.feature.home.domain.model.AmountColors amountColors, java.lang.String description, java.lang.String footer, com.paypal.oslo.feature.home.domain.model.FooterColors footerColor, com.paypal.oslo.feature.home.domain.model.HomeIcon footerIcon, com.paypal.oslo.feature.home.domain.model.FooterColors footerIconColor, java.util.List<java.lang.String> imageUrls, java.util.List<? extends com.paypal.oslo.feature.home.domain.model.HomeIcon> icons) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundColors, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountColors, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icons, "");
        return new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem(id, type, backgroundColors, title, titleColor, amount, amountColors, description, footer, footerColor, footerIcon, footerIconColor, imageUrls, icons, null, 16384, null);
    }

    public static /* synthetic */ java.util.List createSampleAccountSnapshot$home_prodRelease$default(com.paypal.oslo.feature.home.ui.preview.AccountSnapshotPreviews accountSnapshotPreviews, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        return accountSnapshotPreviews.createSampleAccountSnapshot$home_prodRelease(i);
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem> createSampleAccountSnapshot$home_prodRelease(int size) {
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            com.paypal.oslo.feature.home.ui.preview.AccountSnapshotPreviews accountSnapshotPreviews = INSTANCE;
            java.lang.String concat = "balance-id-".concat(java.lang.String.valueOf(i));
            com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalBalance payPalBalance = com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalBalance.INSTANCE;
            java.lang.String concat2 = "Balance title ".concat(java.lang.String.valueOf(i));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("$ ");
            sb.append(i * 100);
            arrayList.add(createSnapshotItem$home_prodRelease$default(accountSnapshotPreviews, concat, payPalBalance, null, concat2, null, sb.toString(), null, null, null, null, null, null, null, null, 16340, null));
        }
        return arrayList;
    }
}
