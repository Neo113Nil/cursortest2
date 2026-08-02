package com.paypal.oslo.feature.bnplservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingVirtualCardArtFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard$CardArt;", "toVirtualCardArt", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingVirtualCardArtFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard$CardArt;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragment;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard;", "toVirtualCard", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragment;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "purchaseAmount", "toVirtualCardWithPurchaseAmount", "(Lcom/paypal/oslo/feature/bnplservicing/graphql/fragment/BnplServicingPlanOverviewVirtualCardFragment;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/VirtualCard;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VirtualCardMapperKt {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt toVirtualCardArt(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingVirtualCardArtFragment bnplServicingVirtualCardArtFragment) {
        if (bnplServicingVirtualCardArtFragment == null) {
            return null;
        }
        java.lang.Object url = bnplServicingVirtualCardArtFragment.getUrl();
        java.lang.String str = url instanceof java.lang.String ? (java.lang.String) url : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object thumbnailUrl = bnplServicingVirtualCardArtFragment.getThumbnailUrl();
        java.lang.String str2 = thumbnailUrl instanceof java.lang.String ? (java.lang.String) thumbnailUrl : null;
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt(str, str2 != null ? str2 : "");
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard toVirtualCard(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment bnplServicingPlanOverviewVirtualCardFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPlanOverviewVirtualCardFragment, "");
        java.lang.String valueOf = java.lang.String.valueOf(bnplServicingPlanOverviewVirtualCardFragment.getCardArt().getUrl());
        java.lang.Object thumbnailUrl = bnplServicingPlanOverviewVirtualCardFragment.getCardArt().getThumbnailUrl();
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt cardArt = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt(valueOf, thumbnailUrl != null ? thumbnailUrl.toString() : null);
        java.lang.String obj = bnplServicingPlanOverviewVirtualCardFragment.getLastNChars().toString();
        java.lang.Object primaryAccountNumber = bnplServicingPlanOverviewVirtualCardFragment.getPrimaryAccountNumber();
        java.lang.String obj2 = primaryAccountNumber != null ? primaryAccountNumber.toString() : null;
        java.lang.Object expirationDate = bnplServicingPlanOverviewVirtualCardFragment.getExpirationDate();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard(cardArt, bnplServicingPlanOverviewVirtualCardFragment.getCvv(), expirationDate != null ? expirationDate.toString() : null, null, obj, obj2, 8, null);
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard toVirtualCardWithPurchaseAmount(com.paypal.oslo.feature.bnplservicing.graphql.fragment.BnplServicingPlanOverviewVirtualCardFragment bnplServicingPlanOverviewVirtualCardFragment, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServicingPlanOverviewVirtualCardFragment, "");
        java.lang.String obj = bnplServicingPlanOverviewVirtualCardFragment.getLastNChars().toString();
        java.lang.String valueOf = java.lang.String.valueOf(bnplServicingPlanOverviewVirtualCardFragment.getCardArt().getUrl());
        java.lang.Object thumbnailUrl = bnplServicingPlanOverviewVirtualCardFragment.getCardArt().getThumbnailUrl();
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt cardArt = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard.CardArt(valueOf, thumbnailUrl != null ? thumbnailUrl.toString() : null);
        java.lang.Object primaryAccountNumber = bnplServicingPlanOverviewVirtualCardFragment.getPrimaryAccountNumber();
        java.lang.String obj2 = primaryAccountNumber != null ? primaryAccountNumber.toString() : null;
        java.lang.Object expirationDate = bnplServicingPlanOverviewVirtualCardFragment.getExpirationDate();
        return new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.VirtualCard(cardArt, bnplServicingPlanOverviewVirtualCardFragment.getCvv(), expirationDate != null ? expirationDate.toString() : null, money, obj, obj2);
    }
}
