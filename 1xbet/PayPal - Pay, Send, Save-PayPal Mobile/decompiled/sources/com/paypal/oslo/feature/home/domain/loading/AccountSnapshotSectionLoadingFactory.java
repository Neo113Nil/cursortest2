package com.paypal.oslo.feature.home.domain.loading;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/loading/AccountSnapshotSectionLoadingFactory;", "Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory;", "<init>", "()V", "", "sectionId", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "Lcom/paypal/oslo/feature/home/domain/model/SectionLoading;", "createLoadingSections", "(Ljava/lang/String;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountSnapshotSectionLoadingFactory implements com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AccountSnapshotSectionLoadingFactory() {
    }

    @Override // com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory
    public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.SectionLoading>> createLoadingSections(java.lang.String sectionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionId, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        for (int i = 0; i < 3; i++) {
            java.lang.String concat = "AccountSnapshotItem_loading_".concat(java.lang.String.valueOf(i));
            com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default r4 = com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default.INSTANCE;
            com.paypal.oslo.feature.home.api.AccountSnapshotType.Disabled disabled = com.paypal.oslo.feature.home.api.AccountSnapshotType.Disabled.INSTANCE;
            com.paypal.oslo.feature.home.domain.model.FooterColors.Neutral neutral = com.paypal.oslo.feature.home.domain.model.FooterColors.Neutral.INSTANCE;
            com.paypal.oslo.feature.home.api.AccountSnapshotType.Disabled disabled2 = disabled;
            com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default r9 = r4;
            com.paypal.oslo.feature.home.domain.model.FooterColors.Neutral neutral2 = neutral;
            java.lang.String str = "";
            com.paypal.oslo.feature.home.domain.model.TitleColors titleColors = null;
            java.lang.String str2 = "";
            com.paypal.oslo.feature.home.domain.model.AmountColors amountColors = null;
            java.lang.String str3 = "";
            java.lang.String str4 = null;
            com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon = null;
            com.paypal.oslo.feature.home.domain.model.FooterColors footerColors = null;
            arrayList.add(new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem(concat, disabled2, r9, str, titleColors, str2, amountColors, str3, str4, neutral2, homeIcon, footerColors, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), null, 16448, null));
        }
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.home.domain.model.Section(sectionId, com.paypal.oslo.feature.home.domain.model.SectionTypes.ACCOUNT_SNAPSHOT, (java.lang.String) null, (java.lang.String) null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.home.domain.model.SectionLoading(arrayList)), (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.home.domain.model.SectionInstrumentation) null, 224, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }
}
