package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 02\u00020\u0001:\u00010B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\r2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ)\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J/\u0010!\u001a\u00020\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001a2\b\b\u0002\u0010#\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u001a2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010,R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitCardBuilder;", "", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;", "stringProvider", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabWebBaseUrlProvider;", "webBaseUrlProvider", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabWebBaseUrlProvider;)V", "", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitType;", "benefits", "", "merchantName", "Lcom/paypal/pds/core/RichText;", "buildTitle", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/pds/core/RichText;", "buildTitleModal", "", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(ILjava/lang/String;Ljava/lang/String;)Lcom/paypal/pds/core/RichText;", "secureId", "", "showDisclosure", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitData;", "getPayIn4Card", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitData;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitTypeMetadata;", "metadata", "getZeroAprCard", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitTypeMetadata;Z)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitData;", "getPayMonthlyCard", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitTypeMetadata;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitData;", "monthsLimit", "getPayLaterGeneric", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitData;", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "offerDetails", "getCashbackCard", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BenefitData;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/StringResourceProvider;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabWebBaseUrlProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IabBenefitCardBuilder {
    public static final java.lang.String OFFER_PAY_LATER_LONG_TERM = "PAY_LATER_LONG_TERM";
    public static final java.lang.String OFFER_PAY_LATER_SHORT_TERM = "PAY_LATER_SHORT_TERM";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabWebBaseUrlProvider getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.Companion INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<java.util.Map<java.lang.String, com.paypal.pds.core.Icon>> getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.$r8$lambda$iA8dkOYrD_Pvzs55_FSfNLJxYp0();
        }
    });

    @javax.inject.Inject
    public IabBenefitCardBuilder(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabWebBaseUrlProvider iabWebBaseUrlProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringResourceProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iabWebBaseUrlProvider, "");
        this.getHighSpeedVideoFpsRangesFor = stringResourceProvider;
        this.getHighSpeedVideoSizes = iabWebBaseUrlProvider;
    }

    public final com.paypal.pds.core.RichText buildTitle(java.util.List<? extends com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> benefits, java.lang.String merchantName) {
        if (benefits != null && benefits.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_CASHBACK)) {
            java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_benefits_pay_with_pay_pal_title_prefix);
            if (merchantName == null) {
                merchantName = "";
            }
            return com.paypal.pds.core.RichText.INSTANCE.invoke(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder$$ExternalSyntheticLambda0(string, merchantName));
        }
        int i = com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_interstitial_pay_later_title;
        if (merchantName == null) {
            merchantName = "";
        }
        return getHighSpeedVideoSizes(i, merchantName, null);
    }

    public final com.paypal.pds.core.RichText buildTitleModal(java.util.List<? extends com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType> benefits, java.lang.String merchantName) {
        boolean z = false;
        boolean z2 = benefits != null && benefits.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PROMO_CASHBACK);
        if ((benefits != null && benefits.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_LATER_GENERIC)) || (benefits != null && benefits.size() == 1 && benefits.contains(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitType.PAY_MONTHLY))) {
            z = true;
        }
        if (z2) {
            java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_benefits_pay_with_pay_pal_title_prefix);
            if (merchantName == null) {
                merchantName = "";
            }
            return com.paypal.pds.core.RichText.INSTANCE.invoke(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder$$ExternalSyntheticLambda0(string, merchantName));
        }
        if (z) {
            int i = com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_interstitial_pay_later_title;
            if (merchantName == null) {
                merchantName = "";
            }
            return getHighSpeedVideoSizes(i, merchantName, " ".concat(java.lang.String.valueOf(kotlin.text.StringsKt.trimStart(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_benefits_pay_later_title_suffix)).toString())));
        }
        int i2 = com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_benefits_pay_in_title;
        if (merchantName == null) {
            merchantName = "";
        }
        return getHighSpeedVideoSizes(i2, merchantName, null);
    }

    private final com.paypal.pds.core.RichText getHighSpeedVideoSizes(int p0, final java.lang.String p1, final java.lang.String p2) {
        final java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) this.getHighSpeedVideoFpsRangesFor.getFormattedString(p0, "\u0000"), new java.lang.String[]{"\u0000"}, false, 0, 6, (java.lang.Object) null);
        return com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.$r8$lambda$LNZdUrVdYGjfRAC5Bm6NjrZ5cZ4(split$default, p1, p2, (com.paypal.pds.core.Builder) obj);
            }
        });
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData getPayIn4Card$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder iabBenefitCardBuilder, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return iabBenefitCardBuilder.getPayIn4Card(str, z);
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData getPayIn4Card(java.lang.String secureId, boolean showDisclosure) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_in_4_terms_link), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem[]{new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(com.paypal.pds.core.Icon.CheckCircle.INSTANCE, this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_in_4_info1_text)), new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(com.paypal.pds.core.Icon.CheckCircle.INSTANCE, this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_in_4_info2_text))}), com.paypal.pds.core.RichTextKt.toRichText(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_in_4_terms_label), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_in_4_terms_link), Camera2StreamConfigurationMap("PAY_LATER_SHORT_TERM", secureId)))), showDisclosure ? com.paypal.pds.core.RichTextKt.toRichText(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_in_4_terms), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_disclosures_link_text), "https://www.paypal.com/us/digital-wallet/new-mexico-disclosure?locale.x=en_US"))) : null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData getZeroAprCard$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder iabBenefitCardBuilder, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata benefitTypeMetadata, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            benefitTypeMetadata = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return iabBenefitCardBuilder.getZeroAprCard(benefitTypeMetadata, z);
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData getZeroAprCard(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata metadata, boolean showDisclosure) {
        java.lang.String formattedString;
        java.lang.String formattedString2;
        java.lang.String formattedString3 = this.getHighSpeedVideoFpsRangesFor.getFormattedString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_monthly_title, "0%");
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem[] benefitListItemArr = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem[2];
        com.paypal.pds.core.Icon.CheckCircle checkCircle = com.paypal.pds.core.Icon.CheckCircle.INSTANCE;
        if (metadata != null && !metadata.getTerms().isEmpty()) {
            formattedString = this.getHighSpeedVideoFpsRangesFor.getFormattedString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_monthly_info1_text, INSTANCE.formatTermsList$shopping_rewards_prodRelease(metadata.getTerms()));
        } else {
            formattedString = this.getHighSpeedVideoFpsRangesFor.getFormattedString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_monthly_info1_text, "6");
        }
        benefitListItemArr[0] = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(checkCircle, formattedString);
        com.paypal.pds.core.Icon.CheckCircle checkCircle2 = com.paypal.pds.core.Icon.CheckCircle.INSTANCE;
        if (metadata != null && metadata.getMinPurchaseAmount().length() > 0 && metadata.getMaxPurchaseAmount().length() > 0) {
            com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.Companion companion = INSTANCE;
            java.lang.String formatWithCommas$shopping_rewards_prodRelease = companion.formatWithCommas$shopping_rewards_prodRelease(metadata.getMinPurchaseAmount());
            java.lang.String formatWithCommas$shopping_rewards_prodRelease2 = companion.formatWithCommas$shopping_rewards_prodRelease(metadata.getMaxPurchaseAmount());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Available for purchases from $");
            sb.append(formatWithCommas$shopping_rewards_prodRelease);
            sb.append(" to $");
            sb.append(formatWithCommas$shopping_rewards_prodRelease2);
            formattedString2 = sb.toString();
        } else {
            formattedString2 = this.getHighSpeedVideoFpsRangesFor.getFormattedString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_monthly_info2_text, "December 25th", "$1", "$100");
        }
        benefitListItemArr[1] = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(checkCircle2, formattedString2);
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData(formattedString3, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) benefitListItemArr), com.paypal.pds.core.RichTextKt.toRichText(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_monthly_terms_label), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_monthly_terms_link), ""))), showDisclosure ? com.paypal.pds.core.RichTextKt.toRichText(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_monthly_terms), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_disclosures_link_text), "https://www.paypal.com/us/digital-wallet/ways-to-pay/buy-now-pay-later"))) : null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData getPayMonthlyCard$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder iabBenefitCardBuilder, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata benefitTypeMetadata, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            benefitTypeMetadata = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return iabBenefitCardBuilder.getPayMonthlyCard(benefitTypeMetadata, str, z);
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData getPayMonthlyCard(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitTypeMetadata metadata, java.lang.String secureId, boolean showDisclosure) {
        java.lang.String string;
        java.lang.String string2;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem[] benefitListItemArr = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem[2];
        com.paypal.pds.core.Icon.Calendar calendar = com.paypal.pds.core.Icon.Calendar.INSTANCE;
        if (metadata != null && !metadata.getTerms().isEmpty()) {
            java.lang.String formatTermsList$shopping_rewards_prodRelease = INSTANCE.formatTermsList$shopping_rewards_prodRelease(metadata.getTerms());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pay over ");
            sb.append(formatTermsList$shopping_rewards_prodRelease);
            sb.append(" months");
            string = sb.toString();
        } else {
            string = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_benefits_pay_monthly_item_1);
        }
        benefitListItemArr[0] = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(calendar, string);
        com.paypal.pds.core.Icon.Receipt receipt = com.paypal.pds.core.Icon.Receipt.INSTANCE;
        if (metadata != null && metadata.getMinPurchaseAmount().length() > 0 && metadata.getMaxPurchaseAmount().length() > 0) {
            com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.Companion companion = INSTANCE;
            java.lang.String formatWithCommas$shopping_rewards_prodRelease = companion.formatWithCommas$shopping_rewards_prodRelease(metadata.getMinPurchaseAmount());
            java.lang.String formatWithCommas$shopping_rewards_prodRelease2 = companion.formatWithCommas$shopping_rewards_prodRelease(metadata.getMaxPurchaseAmount());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Available for purchases from $");
            sb2.append(formatWithCommas$shopping_rewards_prodRelease);
            sb2.append(" to $");
            sb2.append(formatWithCommas$shopping_rewards_prodRelease2);
            string2 = sb2.toString();
        } else {
            string2 = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_benefits_pay_monthly_item_2);
        }
        benefitListItemArr[1] = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(receipt, string2);
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData("Pay Monthly", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) benefitListItemArr), com.paypal.pds.core.RichTextKt.toRichText(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_monthly_terms_label), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_monthly_terms_link), Camera2StreamConfigurationMap("PAY_LATER_LONG_TERM", secureId)))), showDisclosure ? com.paypal.pds.core.RichTextKt.toRichText(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_monthly_terms), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_disclosures_link_text), "https://www.paypal.com/us/digital-wallet/ways-to-pay/buy-now-pay-later"))) : null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData getPayLaterGeneric$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder iabBenefitCardBuilder, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return iabBenefitCardBuilder.getPayLaterGeneric(str);
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData getPayLaterGeneric(java.lang.String monthsLimit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthsLimit, "");
        java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_iab_pay_later_title);
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem[] benefitListItemArr = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem[2];
        benefitListItemArr[0] = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(com.paypal.pds.core.Icon.CheckCircle.INSTANCE, this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_promotions_pay_in_4_info1_text));
        benefitListItemArr[1] = monthsLimit.length() > 0 ? new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(com.paypal.pds.core.Icon.CheckCircle.INSTANCE, this.getHighSpeedVideoFpsRangesFor.getFormattedString(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_benefits_pay_later_generic_item_2, monthsLimit)) : null;
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData(string, kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) benefitListItemArr), null, null, 8, null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData getCashbackCard$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder iabBenefitCardBuilder, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iabOfferDetails = null;
        }
        return iabBenefitCardBuilder.getCashbackCard(iabOfferDetails);
    }

    private final java.lang.String Camera2StreamConfigurationMap(java.lang.String p0, java.lang.String p1) {
        okhttp3.HttpUrl.Builder addQueryParameter = okhttp3.HttpUrl.INSTANCE.get(this.getHighSpeedVideoSizes.getWebBaseUrl()).newBuilder().addEncodedPathSegments("credit-presentment/lander/modal").addQueryParameter("offer", p0);
        if (p1 != null) {
            addQueryParameter.addQueryParameter("payer_id", p1);
        }
        return addQueryParameter.build().toString();
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabBenefitCardBuilder$Companion;", "", "<init>", "()V", "", "", com.paypal.oslo.feature.debitcard.shared.analytics.TermsConditionsBottomSheetAnalytics.ACTION, "formatTermsList$shopping_rewards_prodRelease", "(Ljava/util/List;)Ljava/lang/String;", "amount", "formatWithCommas$shopping_rewards_prodRelease", "(Ljava/lang/String;)Ljava/lang/String;", "OFFER_PAY_LATER_SHORT_TERM", "Ljava/lang/String;", "OFFER_PAY_LATER_LONG_TERM", "", "Lcom/paypal/pds/core/Icon;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String formatTermsList$shopping_rewards_prodRelease(java.util.List<java.lang.String> terms) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terms, "");
            int size = terms.size();
            if (size == 0) {
                return "";
            }
            if (size == 1) {
                return terms.get(0);
            }
            java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.dropLast(terms, 1), ", ", null, null, 0, null, null, 62, null);
            java.lang.Object last = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) terms);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(joinToString$default);
            sb.append(", or ");
            sb.append(last);
            return sb.toString();
        }

        public final java.lang.String formatWithCommas$shopping_rewards_prodRelease(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(amount);
            if (longOrNull != null) {
                java.lang.String format = java.lang.String.format("%,d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(longOrNull.longValue())}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                if (format != null) {
                    return format;
                }
            }
            return amount;
        }

        public static final /* synthetic */ java.util.Map access$buildIconMap(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.Companion companion) {
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Check", com.paypal.pds.core.Icon.Check.INSTANCE), kotlin.TuplesKt.to("CheckCircle", com.paypal.pds.core.Icon.CheckCircle.INSTANCE), kotlin.TuplesKt.to("Star", com.paypal.pds.core.Icon.Star.INSTANCE), kotlin.TuplesKt.to("Clock", com.paypal.pds.core.Icon.Clock.INSTANCE), kotlin.TuplesKt.to("LockLocked", com.paypal.pds.core.Icon.LockLocked.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartIconNames.MONEY_BILL, com.paypal.pds.core.Icon.MoneyBill.INSTANCE), kotlin.TuplesKt.to("Cart", com.paypal.pds.core.Icon.Cart.INSTANCE), kotlin.TuplesKt.to("Trophy", com.paypal.pds.core.Icon.Trophy.INSTANCE), kotlin.TuplesKt.to("Heart", com.paypal.pds.core.Icon.Heart.INSTANCE), kotlin.TuplesKt.to("Cog", com.paypal.pds.core.Icon.Cog.INSTANCE), kotlin.TuplesKt.to("Info", com.paypal.pds.core.Icon.Info.INSTANCE), kotlin.TuplesKt.to("Gift", com.paypal.pds.core.Icon.Gift.INSTANCE), kotlin.TuplesKt.to("Tag", com.paypal.pds.core.Icon.Tag.INSTANCE), kotlin.TuplesKt.to("Shield", com.paypal.pds.core.Icon.Shield.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_CASHBACK, com.paypal.pds.core.Icon.CurrencyUsdCircle.INSTANCE), kotlin.TuplesKt.to("Lightning", com.paypal.pds.core.Icon.Lightning.INSTANCE), kotlin.TuplesKt.to("Wallet", com.paypal.pds.core.Icon.Wallet.INSTANCE), kotlin.TuplesKt.to("Store", com.paypal.pds.core.Icon.Store.INSTANCE), kotlin.TuplesKt.to("Truck", com.paypal.pds.core.Icon.Truck.INSTANCE), kotlin.TuplesKt.to("Envelope", com.paypal.pds.core.Icon.Envelope.INSTANCE), kotlin.TuplesKt.to("Bell", com.paypal.pds.core.Icon.Bell.INSTANCE), kotlin.TuplesKt.to(com.paypal.oslo.feature.userprofile.domain.model.constants.PhoneConstants.HOME, com.paypal.pds.core.Icon.Home.INSTANCE), kotlin.TuplesKt.to("Person", com.paypal.pds.core.Icon.Person.INSTANCE), kotlin.TuplesKt.to("Key", com.paypal.pds.core.Icon.Key.INSTANCE), kotlin.TuplesKt.to("MapPin", com.paypal.pds.core.Icon.MapPin.INSTANCE), kotlin.TuplesKt.to("Calendar", com.paypal.pds.core.Icon.Calendar.INSTANCE), kotlin.TuplesKt.to("Flag", com.paypal.pds.core.Icon.Flag.INSTANCE), kotlin.TuplesKt.to("Bag", com.paypal.pds.core.Icon.Bag.INSTANCE));
        }

        public static final /* synthetic */ com.paypal.pds.core.Icon access$toIcon(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.Companion companion, java.lang.String str) {
            java.util.Map map = (java.util.Map) com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.getHighSpeedVideoSizes.getValue();
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            com.paypal.pds.core.Icon icon = (com.paypal.pds.core.Icon) map.get(lowerCase);
            return icon == null ? com.paypal.pds.core.Icon.CheckCircle.INSTANCE : icon;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$63wjFo56hA5Bi9aFObRvzsQ5QEo(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.lang.String obj = kotlin.text.StringsKt.trimEnd(str).toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(obj);
        sb.append(" ");
        com.paypal.pds.core.Builder.append$default(builder, sb.toString(), com.paypal.pds.core.Color.ContentBase.INSTANCE, false, 4, null);
        com.paypal.pds.core.Builder.append$default(builder, str2, com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE, false, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LNZdUrVdYGjfRAC5Bm6NjrZ5cZ4(java.util.List list, java.lang.String str, java.lang.String str2, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        if (((java.lang.CharSequence) list.get(0)).length() > 0) {
            com.paypal.pds.core.Builder.append$default(builder, (java.lang.String) list.get(0), com.paypal.pds.core.Color.ContentBase.INSTANCE, false, 4, null);
        }
        com.paypal.pds.core.Builder.append$default(builder, str, com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE, false, 4, null);
        java.lang.String str3 = list.size() > 1 ? (java.lang.String) list.get(1) : "";
        if (str3.length() > 0) {
            com.paypal.pds.core.Builder.append$default(builder, str3, com.paypal.pds.core.Color.ContentBase.INSTANCE, false, 4, null);
        }
        if (str2 != null) {
            com.paypal.pds.core.Builder.append$default(builder, str2, com.paypal.pds.core.Color.ContentBase.INSTANCE, false, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.util.Map $r8$lambda$iA8dkOYrD_Pvzs55_FSfNLJxYp0() {
        java.util.Map access$buildIconMap = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.Companion.access$buildIconMap(INSTANCE);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(access$buildIconMap.size()));
        for (java.util.Map.Entry entry : access$buildIconMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        return linkedHashMap;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData getCashbackCard(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails offerDetails) {
        java.lang.String title;
        java.util.List<java.lang.String> detailsText;
        java.util.ArrayList arrayList;
        com.paypal.pds.core.Icon.CheckCircle checkCircle;
        java.lang.String replace$default;
        com.paypal.pds.core.RichText richText = null;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.PromotionOfferEducation promotionOfferEducation = offerDetails != null ? offerDetails.getPromotionOfferEducation() : null;
        if (promotionOfferEducation != null && (((title = promotionOfferEducation.getTitle()) != null && title.length() != 0) || ((detailsText = promotionOfferEducation.getDetailsText()) != null && !detailsText.isEmpty()))) {
            java.lang.String title2 = promotionOfferEducation.getTitle();
            java.util.List<java.lang.String> detailsText2 = promotionOfferEducation.getDetailsText();
            if (detailsText2 == null) {
                arrayList = null;
            } else {
                java.util.List<java.lang.String> detailsIcons = promotionOfferEducation.getDetailsIcons();
                if (detailsIcons == null) {
                    detailsIcons = kotlin.collections.CollectionsKt.emptyList();
                }
                java.util.List<java.lang.String> list = detailsText2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                int i = 0;
                for (java.lang.Object obj : list) {
                    if (i < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    java.lang.String str = (java.lang.String) obj;
                    java.lang.String str2 = i < detailsIcons.size() ? detailsIcons.get(i) : null;
                    java.lang.String str3 = str2;
                    if (str3 == null || kotlin.text.StringsKt.isBlank(str3)) {
                        checkCircle = com.paypal.pds.core.Icon.CheckCircle.INSTANCE;
                    } else {
                        checkCircle = com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabBenefitCardBuilder.Companion.access$toIcon(INSTANCE, str2);
                    }
                    arrayList2.add(new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitListItem(checkCircle, str));
                    i++;
                }
                arrayList = arrayList2;
            }
            java.lang.String termsText = promotionOfferEducation.getTermsText();
            if (termsText != null && (replace$default = kotlin.text.StringsKt.replace$default(termsText, "__", "", false, 4, (java.lang.Object) null)) != null) {
                java.util.List<java.lang.String> termsUrls = promotionOfferEducation.getTermsUrls();
                if (termsUrls == null) {
                    termsUrls = kotlin.collections.CollectionsKt.emptyList();
                }
                if (termsUrls.isEmpty()) {
                    richText = com.paypal.pds.core.RichTextKt.toRichText(replace$default, kotlin.collections.CollectionsKt.emptyList());
                } else if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) replace$default, (java.lang.CharSequence) "__", false, 2, (java.lang.Object) null)) {
                    richText = com.paypal.oslo.feature.shoppingrewards.shared.utils.RichTextExtensionsKt.parseRichTextWithIndexedMultiLinks(replace$default, termsUrls);
                } else {
                    int size = termsUrls.size();
                    java.util.List<java.lang.String> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.debitcard.shared.analytics.TermsConditionsBottomSheetAnalytics.ACTION, "exclusions", "conditions", com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy, "policy"});
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.String str4 : listOf) {
                        if (arrayList3.size() >= size) {
                            break;
                        }
                        java.util.Locale locale = java.util.Locale.ROOT;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                        java.lang.String lowerCase = replace$default.toLowerCase(locale);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) lowerCase, str4, 0, false, 6, (java.lang.Object) null);
                        if (indexOf$default != -1) {
                            java.lang.String substring = replace$default.substring(indexOf$default, str4.length() + indexOf$default);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                            arrayList3.add(substring);
                        }
                    }
                    richText = com.paypal.pds.core.RichTextKt.toRichText(replace$default, kotlin.collections.CollectionsKt.zip(arrayList3, termsUrls));
                }
            }
            return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData(title2, arrayList, richText, null, 8, null);
        }
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BenefitData(null, null, null, null, 8, null);
    }
}
