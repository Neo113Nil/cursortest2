package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditImageFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreditImageMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditImageFragment revolvingCreditImageFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditImageFragment, "");
        java.lang.Object url = revolvingCreditImageFragment.getUrl();
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage(url instanceof java.lang.String ? (java.lang.String) url : null, revolvingCreditImageFragment.getAssetName());
    }
}
