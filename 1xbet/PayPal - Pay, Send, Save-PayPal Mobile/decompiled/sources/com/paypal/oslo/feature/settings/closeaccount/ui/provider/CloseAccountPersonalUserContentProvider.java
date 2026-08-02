package com.paypal.oslo.feature.settings.closeaccount.ui.provider;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountPersonalUserContentProvider;", "", "Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "strings", "<init>", "(Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;)V", "", "userEmail", "userCountry", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseYourAccountStepContent;", "getContent", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseYourAccountStepContent;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountPersonalUserContentProvider {

    @java.lang.Deprecated
    public static final java.lang.String COUNTRY_BR = "BR";

    @java.lang.Deprecated
    public static final java.lang.String COUNTRY_US = "US";

    @java.lang.Deprecated
    public static final java.lang.String URL_CONTACT_US = "https://www.paypal.com/us/cshelp/contact-us";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider.Companion Companion = new com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider.Companion(null);
    public static final int $stable = 8;

    public CloseAccountPersonalUserContentProvider(com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings closeAccountStrings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountStrings, "");
        this.getHighResolutionOutputSizeshNQ4ISI = closeAccountStrings;
    }

    public final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent getContent(java.lang.String userEmail, java.lang.String userCountry) {
        java.util.List listOf;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(userCountry, "US")) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(userCountry, COUNTRY_BR)) {
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem[]{new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Header(this.getHighResolutionOutputSizeshNQ4ISI.getL2IneligibleAreYouSureClose(), null, null, 6, null), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleWeCanHelpReOpened(), this.getHighResolutionOutputSizeshNQ4ISI.getLinkContactUs(), null, null, new com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination(null, URL_CONTACT_US, this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleWeCanHelpReOpened(), null, 9, null), 12, null))), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleYourFeedbackMatters(), null, null, null, null, 30, null))), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.TextInput(this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleYourShareFeedback(), null, 2, null), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleIfYouDeleteData(), this.getHighResolutionOutputSizeshNQ4ISI.getLinkDeleteYourData(), null, null, null, 28, null)))});
            } else {
                listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem[]{new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Header(this.getHighResolutionOutputSizeshNQ4ISI.getL2IneligibleAreYouSureClose(), null, null, 6, null), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleWeCanHelpReOpened(), this.getHighResolutionOutputSizeshNQ4ISI.getLinkContactUs(), null, null, new com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination(null, URL_CONTACT_US, this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleWeCanHelpReOpened(), null, 9, null), 12, null))), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24), new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleIfYouDeleteData(), this.getHighResolutionOutputSizeshNQ4ISI.getLinkDeleteYourData(), null, null, null, 28, null)))});
            }
        } else {
            java.lang.String str = userEmail;
            boolean z = str == null || str.length() == 0;
            com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem[] closeAccountUiItemArr = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem[8];
            closeAccountUiItemArr[0] = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Header(this.getHighResolutionOutputSizeshNQ4ISI.getL2IneligibleBeforeYouCloseYourAccount(), this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleSendEmail(), null, 4, null);
            closeAccountUiItemArr[1] = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24);
            closeAccountUiItemArr[2] = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Email(!z ? this.getHighResolutionOutputSizeshNQ4ISI.getL2EligiblePrimaryEmail() : null, userEmail, z ? this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleChangeEmail() : null, z);
            closeAccountUiItemArr[3] = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleWeCanHelp(), this.getHighResolutionOutputSizeshNQ4ISI.getLinkContactUs(), null, null, new com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination(null, URL_CONTACT_US, this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleWeCanHelpReOpened(), null, 9, null), 12, null)));
            closeAccountUiItemArr[4] = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(24);
            closeAccountUiItemArr[5] = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleOnceClosed(), null, null, null, null, 30, null)));
            closeAccountUiItemArr[6] = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.Spacer(8);
            closeAccountUiItemArr[7] = new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiItem.LabelWithHyperlinks(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.settings.closeaccount.ui.model.TextWithLinks(this.getHighResolutionOutputSizeshNQ4ISI.getL2EligibleIfYouDeleteData(), this.getHighResolutionOutputSizeshNQ4ISI.getLinkDeleteYourData(), null, null, null, 28, null)));
            listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) closeAccountUiItemArr);
        }
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent(listOf, new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter(true, false, this.getHighResolutionOutputSizeshNQ4ISI.getCloseAccount(), null, com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction.CloseAccount, 8, null));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountPersonalUserContentProvider$Companion;", "", "<init>", "()V", "", "COUNTRY_US", "Ljava/lang/String;", "COUNTRY_BR", "URL_CONTACT_US"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
