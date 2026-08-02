package com.paypal.oslo.feature.debitcard.servicing.util;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "cardArtUrl", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;", "toRequestPhysicalCardInfo", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardPricingDetails;", "agreementUrl", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardPricingInfo;", "toRequestPhysicalCardPricingInfo", "(Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardPricingInfo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RequestPhysicalCardFlowExtensionsKt {
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo toRequestPhysicalCardInfo(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentForRequestPhysicalCardResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String id = debitInstrumentForRequestPhysicalCardResponse.getId();
        boolean z2 = !kotlin.jvm.internal.Intrinsics.areEqual(debitInstrumentForRequestPhysicalCardResponse.getPinStatus(), "SET") || kotlin.jvm.internal.Intrinsics.areEqual(debitInstrumentForRequestPhysicalCardResponse.getPinOrigin(), "SYSTEM");
        java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails> pricingDetails = debitInstrumentForRequestPhysicalCardResponse.getPricingDetails();
        if (!(pricingDetails instanceof java.util.Collection) || !pricingDetails.isEmpty()) {
            java.util.Iterator<T> it = pricingDetails.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails) it.next()).getType(), "CARD_ISSUANCE_FEE_PAYMENT")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return new com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo(id, debitCardProductName, str, (java.lang.String) null, z2, z, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo toRequestPhysicalCardPricingInfo$default(java.util.List list, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return toRequestPhysicalCardPricingInfo(list, debitCardProductName, str);
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo toRequestPhysicalCardPricingInfo(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails> list, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails> list2 = list;
        java.util.Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails) obj).getType(), "CARD_ISSUANCE_FEE_PAYMENT")) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails debitInstrumentForRequestPhysicalCardPricingDetails = (com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails) obj;
        java.lang.String formattedFee = debitInstrumentForRequestPhysicalCardPricingDetails != null ? debitInstrumentForRequestPhysicalCardPricingDetails.getFormattedFee() : null;
        if (formattedFee == null) {
            formattedFee = "";
        }
        java.util.Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails) obj2).getType(), "CARD_ATM_WITHDRAWAL_FEE")) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails debitInstrumentForRequestPhysicalCardPricingDetails2 = (com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardPricingDetails) obj2;
        java.lang.String formattedFee2 = debitInstrumentForRequestPhysicalCardPricingDetails2 != null ? debitInstrumentForRequestPhysicalCardPricingDetails2.getFormattedFee() : null;
        return new com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo(debitCardProductName, formattedFee, formattedFee2 != null ? formattedFee2 : "", str);
    }
}
