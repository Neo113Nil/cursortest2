package com.paypal.oslo.feature.debitcard.cardacquisition.domain.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;", "tokenProductName", "Lcom/paypal/oslo/api/graphql/schema/type/TokenProductName;", "mapDebitCardTokenProductNameToGraphQLTokenProductName", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;)Lcom/paypal/oslo/api/graphql/schema/type/TokenProductName;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse$Success;", "response", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;", "provisionDebitInstrumentResponseToDebitCardData", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse$Success;)Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProvisionDebitInstrumentMapperKt {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r2.equals("UNKNOWN") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.api.graphql.schema.type.TokenProductName mapDebitCardTokenProductNameToGraphQLTokenProductName(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName debitCardTokenProductName) {
        java.lang.String value = debitCardTokenProductName != null ? debitCardTokenProductName.getValue() : null;
        if (value != null) {
            int hashCode = value.hashCode();
            if (hashCode != -36726591) {
                if (hashCode != 433141802) {
                    if (hashCode == 1275039281 && value.equals("DIGITIZATION_TOKEN")) {
                        return com.paypal.oslo.api.graphql.schema.type.TokenProductName.UNKNOWN;
                    }
                }
            } else if (value.equals("DIGITIZATION_TOKEN_PAYPAL")) {
                return com.paypal.oslo.api.graphql.schema.type.TokenProductName.DIGITIZATION_TOKEN_PAYPAL;
            }
            return com.paypal.oslo.api.graphql.schema.type.TokenProductName.UNKNOWN__;
        }
        return com.paypal.oslo.api.graphql.schema.type.TokenProductName.UNKNOWN__;
    }

    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardData provisionDebitInstrumentResponseToDebitCardData(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Success success) {
        com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.SmallImage smallImage;
        com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front1 front;
        com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.LargeImage largeImage;
        com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Front front2;
        com.paypal.oslo.api.graphql.schema.type.CardBrand brand;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
        com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument = success.getDebitInstrument();
        java.lang.String id = debitInstrument.getId();
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.Companion companion = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName = debitInstrument.getProductName();
        java.lang.Object obj = null;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName fromValue = companion.fromValue(productName != null ? productName.name() : null);
        java.lang.String valueOf = java.lang.String.valueOf(debitInstrument.getLastNChars());
        com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product = debitInstrument.getProduct();
        java.lang.String name2 = (product == null || (brand = product.getBrand()) == null) ? null : brand.name();
        java.lang.String str = name2 == null ? "" : name2;
        com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product2 = debitInstrument.getProduct();
        java.lang.String shortName = product2 != null ? product2.getShortName() : null;
        java.lang.String str2 = shortName != null ? shortName : "";
        com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product3 = debitInstrument.getProduct();
        java.lang.String valueOf2 = java.lang.String.valueOf((product3 == null || (largeImage = product3.getLargeImage()) == null || (front2 = largeImage.getFront()) == null) ? null : front2.getReferenceUrl());
        com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.Product product4 = debitInstrument.getProduct();
        if (product4 != null && (smallImage = product4.getSmallImage()) != null && (front = smallImage.getFront()) != null) {
            obj = front.getReferenceUrl();
        }
        return new com.paypal.oslo.feature.debitcard.api.model.DebitCardData(id, fromValue, valueOf, str, str2, valueOf2, java.lang.String.valueOf(obj));
    }
}
