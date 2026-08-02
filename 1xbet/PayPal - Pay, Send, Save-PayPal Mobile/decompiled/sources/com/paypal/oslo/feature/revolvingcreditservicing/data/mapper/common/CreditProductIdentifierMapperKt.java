package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "toGraphql", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreditProductIdentifierMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier toGraphql(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        switch (com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.WhenMappings.$EnumSwitchMapping$0[creditProductIdentifier.ordinal()]) {
            case 1:
                return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US;
            case 2:
                return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.PAYPAL_CREDIT_CARD_US;
            case 3:
                return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.PPC_US_V2;
            case 4:
                return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.SYF_US_EBAYMC;
            case 5:
                return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.SYF_US_PPMC;
            case 6:
                return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.SYF_US_SMTCNCT;
            case 7:
                return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.PP_UK_PPC;
            case 8:
                return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.UNKNOWN__;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PPC_US_V2.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_EBAYMC.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_PPMC.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_SMTCNCT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
