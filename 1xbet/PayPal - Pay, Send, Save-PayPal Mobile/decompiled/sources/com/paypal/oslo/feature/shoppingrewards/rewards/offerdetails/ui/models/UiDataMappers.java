package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u001b\u001a\u00020\u0018*\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u001e\u001a\u00020\u0006*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010 \u001a\u00020\u0006*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010$\u001a\u0004\u0018\u00010!*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0015\u0010'\u001a\u00020\u0006*\u00020\t8G¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/UiDataMappers;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Success;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/usecase/GetOfferDetailsUseCase$Response;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "toUiData", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Success;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferDetails;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/HeaderType;", "getHeaderType", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferDetails;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/HeaderType;", "headerType", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/IconType;", "Lcom/paypal/pds/core/Icon;", "getPdsIcon", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/IconType;)Lcom/paypal/pds/core/Icon;", "pdsIcon", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsItemUiData;", "getOfferDetailsItemsUiData", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferDetails;)Ljava/util/List;", "offerDetailsItemsUiData", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonUiData;", "getCtaButtonUiData", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferDetails;)Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonUiData;", "ctaButtonUiData", "getAsActivating", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "asActivating", "getAsReady", "asReady", "Lcom/paypal/pds/core/RichText;", "getTermsRichText", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;)Lcom/paypal/pds/core/RichText;", "termsRichText", "getUiData", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferDetails;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/OfferDetailsUiData;", "uiData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UiDataMappers {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.UiDataMappers INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.UiDataMappers();

    private UiDataMappers() {
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType getHeaderType(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetails, "");
        if (offerDetails.getOfferMerchantLogo() != null) {
            return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.MerchantLogo(offerDetails.getOfferMerchantLogo());
        }
        return offerDetails.getOfferProgress() instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet ? new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.HeaderType.DiscreetOfferProgress(new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarUiData(0, ((com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet) offerDetails.getOfferProgress()).getMaxProgressValue(), ((com.paypal.oslo.feature.shoppingrewards.rewards.common.domain.OfferProgress.Discreet) offerDetails.getOfferProgress()).getProgressValue(), null, 0, 0, 56, null)) : null;
    }

    public final com.paypal.pds.core.Icon getPdsIcon(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType iconType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iconType, "");
        switch (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.UiDataMappers.WhenMappings.$EnumSwitchMapping$0[iconType.ordinal()]) {
            case 1:
                return null;
            case 2:
                return com.paypal.pds.core.Icon.Clock.INSTANCE;
            case 3:
                return com.paypal.pds.core.Icon.Cart.INSTANCE;
            case 4:
                return com.paypal.pds.core.Icon.ShoppingBag.INSTANCE;
            case 5:
                return com.paypal.pds.core.Icon.Trophy.INSTANCE;
            case 6:
                return null;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsItemUiData> getOfferDetailsItemsUiData(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetails, "");
        java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetailsItem> offerDetailsItems = offerDetails.getOfferDetailsItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(offerDetailsItems, 10));
        for (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetailsItem offerDetailsItem : offerDetailsItems) {
            arrayList.add(new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsItemUiData(INSTANCE.getPdsIcon(offerDetailsItem.getIconType()), offerDetailsItem.getText()));
        }
        return arrayList;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData getCtaButtonUiData(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetails, "");
        int i = com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.UiDataMappers.WhenMappings.$EnumSwitchMapping$1[offerDetails.getOfferState().ordinal()];
        if (i == 1) {
            java.lang.String activatedCtaText = offerDetails.getActivatedCtaText();
            if (activatedCtaText == null) {
                activatedCtaText = "Active";
            }
            return new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData(activatedCtaText, null, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.SharedDataModelsKt.getBUTTON_STATE_DISABLED(), 2, null);
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String eligibleCtaText = offerDetails.getEligibleCtaText();
        if (eligibleCtaText == null) {
            eligibleCtaText = "Activate";
        }
        return new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData(eligibleCtaText, null, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.SharedDataModelsKt.getBUTTON_STATE_ENABLED(), 2, null);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getAsActivating(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData) {
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsUiData, "");
        com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData buttonCta = offerDetailsUiData.getButtonCta();
        copy = offerDetailsUiData.copy((r24 & 1) != 0 ? offerDetailsUiData.offerId : null, (r24 & 2) != 0 ? offerDetailsUiData.title : null, (r24 & 4) != 0 ? offerDetailsUiData.subtitle : null, (r24 & 8) != 0 ? offerDetailsUiData.headerType : null, (r24 & 16) != 0 ? offerDetailsUiData.detailsItems : null, (r24 & 32) != 0 ? offerDetailsUiData.termsText : null, (r24 & 64) != 0 ? offerDetailsUiData.termsTextLink : null, (r24 & 128) != 0 ? offerDetailsUiData.termsUrls : null, (r24 & 256) != 0 ? offerDetailsUiData.buttonCta : buttonCta != null ? com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData.copy$default(buttonCta, null, null, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.SharedDataModelsKt.getAsLoading(offerDetailsUiData.getButtonCta().getState()), 3, null) : null, (r24 & 512) != 0 ? offerDetailsUiData.isActive : false, (r24 & 1024) != 0 ? offerDetailsUiData.wasActivatedThisSession : false);
        return copy;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getAsReady(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData) {
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsUiData, "");
        com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData buttonCta = offerDetailsUiData.getButtonCta();
        copy = offerDetailsUiData.copy((r24 & 1) != 0 ? offerDetailsUiData.offerId : null, (r24 & 2) != 0 ? offerDetailsUiData.title : null, (r24 & 4) != 0 ? offerDetailsUiData.subtitle : null, (r24 & 8) != 0 ? offerDetailsUiData.headerType : null, (r24 & 16) != 0 ? offerDetailsUiData.detailsItems : null, (r24 & 32) != 0 ? offerDetailsUiData.termsText : null, (r24 & 64) != 0 ? offerDetailsUiData.termsTextLink : null, (r24 & 128) != 0 ? offerDetailsUiData.termsUrls : null, (r24 & 256) != 0 ? offerDetailsUiData.buttonCta : buttonCta != null ? com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData.copy$default(buttonCta, null, null, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.SharedDataModelsKt.getAsNormal(offerDetailsUiData.getButtonCta().getState()), 3, null) : null, (r24 & 512) != 0 ? offerDetailsUiData.isActive : false, (r24 & 1024) != 0 ? offerDetailsUiData.wasActivatedThisSession : false);
        return copy;
    }

    public final com.paypal.pds.core.RichText getTermsRichText(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData offerDetailsUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetailsUiData, "");
        java.lang.String termsText = offerDetailsUiData.getTermsText();
        if (termsText != null) {
            if (termsText.length() <= 0) {
                termsText = null;
            }
            if (termsText != null) {
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) termsText, (java.lang.CharSequence) "__", false, 2, (java.lang.Object) null) && !offerDetailsUiData.getTermsUrls().isEmpty()) {
                    return com.paypal.oslo.feature.shoppingrewards.shared.utils.RichTextExtensionsKt.parseRichTextWithIndexedMultiLinks(termsText, offerDetailsUiData.getTermsUrls());
                }
                java.lang.String termsTextLink = offerDetailsUiData.getTermsTextLink();
                if (termsTextLink != null) {
                    if (termsTextLink.length() <= 0) {
                        termsTextLink = null;
                    }
                    if (termsTextLink != null) {
                        return com.paypal.pds.core.RichTextKt.toRichText(termsText, kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(termsText, termsTextLink)));
                    }
                }
            }
        }
        return null;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData getUiData(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerDetails, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData(offerDetails.getOfferId(), offerDetails.getTitle(), offerDetails.getSubtitle(), getHeaderType(offerDetails), getOfferDetailsItemsUiData(offerDetails), offerDetails.getTermsText(), offerDetails.getTermsTextLink(), offerDetails.getTermsUrls(), getCtaButtonUiData(offerDetails), offerDetails.getOfferState() == com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState.ACTIVE, false, 1024, null);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.OfferDetailsUiData toUiData(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.usecase.GetOfferDetailsUseCase.Response> success) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferDetails offerDetails = success.getData().getOfferDetails();
        if (offerDetails != null) {
            return getUiData(offerDetails);
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.CHECK_ICON.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.CLOCK_ICON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.CART_ICON.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.SHOPPING_BAG_ICON.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.TROPHY_ICON.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.IconType.NONE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState.values().length];
            try {
                iArr2[com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState.INACTIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
