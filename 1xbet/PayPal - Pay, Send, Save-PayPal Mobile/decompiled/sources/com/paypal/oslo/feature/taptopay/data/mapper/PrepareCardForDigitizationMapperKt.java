package com.paypal.oslo.feature.taptopay.data.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletTokenizationPartner;", "toTokenizationPartner", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletTokenizationPartner;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/FlowEntryPoint;", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletProvisioningProductFlow;", "toProvisioningProductFlow", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/FlowEntryPoint;)Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletProvisioningProductFlow;", "Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$PrepareCardForDigitization;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardResult;", "toDomainResult", "(Lcom/paypal/oslo/feature/taptopay/graphql/PrepareCardForDigitizationMutation$PrepareCardForDigitization;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalPrepareAddCardResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PrepareCardForDigitizationMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.DeviceWalletTokenizationPartner toTokenizationPartner(java.lang.String str) {
        java.lang.String str2;
        if (str != null) {
            str2 = str.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        } else {
            str2 = null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "THALES")) {
            return com.paypal.oslo.api.graphql.schema.type.DeviceWalletTokenizationPartner.THALES;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "PAYPAL")) {
            return com.paypal.oslo.api.graphql.schema.type.DeviceWalletTokenizationPartner.PAYPAL;
        }
        return null;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningProductFlow toProvisioningProductFlow(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint flowEntryPoint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowEntryPoint, "");
        if (com.paypal.oslo.feature.taptopay.data.mapper.PrepareCardForDigitizationMapperKt.WhenMappings.$EnumSwitchMapping$0[flowEntryPoint.ordinal()] != 1) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningProductFlow.NFC_PROVISIONING_WITH_PRODUCT_ONBOARDING;
    }

    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult toDomainResult(com.paypal.oslo.feature.taptopay.graphql.PrepareCardForDigitizationMutation.PrepareCardForDigitization prepareCardForDigitization) {
        byte[] bArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prepareCardForDigitization, "");
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId(prepareCardForDigitization.getCardToken().getId());
        java.lang.String preDigitizationData = prepareCardForDigitization.getPreDigitizationData();
        if (preDigitizationData != null) {
            bArr = preDigitizationData.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArr, "");
        } else {
            bArr = null;
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalPrepareAddCardResult(deviceWalletServiceCardId, bArr, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint.values().length];
            try {
                iArr[com.paypal.oslo.feature.taptopay.domain.model.card.paypal.FlowEntryPoint.NFC_PROVISIONING_WITH_PRODUCT_ONBOARDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
