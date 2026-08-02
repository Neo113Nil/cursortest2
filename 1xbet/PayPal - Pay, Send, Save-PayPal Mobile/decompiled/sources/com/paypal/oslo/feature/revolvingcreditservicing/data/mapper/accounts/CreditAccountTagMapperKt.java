package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingAccountTagName;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/type/RevolvingCreditServicingAccountTagName;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/CreditAccountTagName;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingAccountTagName;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/CreditAccountTagName;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreditAccountTagMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName toDomain(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName revolvingCreditServicingAccountTagName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingAccountTagName, "");
        switch (com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.CreditAccountTagMapperKt.WhenMappings.$EnumSwitchMapping$0[revolvingCreditServicingAccountTagName.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.AUTHORIZATION_PROHIBITED;
            case 2:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.BANKRUPT;
            case 3:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.CANCELLED;
            case 4:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.CHARGED_OFF;
            case 5:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.CREDIT_DISCLOSURES_PRESENTED;
            case 6:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.DECEASED;
            case 7:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.DELINQUENT;
            case 8:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.FRAUD;
            case 9:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.HARDSHIP;
            case 10:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.MATURED;
            case 11:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.ORDER;
            case 12:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.PAID_OFF;
            case 13:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.PAST_DUE;
            case 14:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.PENDING_BANKRUPTCY;
            case 15:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.PENDING_CLOSE;
            case 16:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.PENDING_DECEASED;
            case 17:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.PENDING_FRAUD;
            default:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.CreditAccountTagName.UNKNOWN;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.AUTHORIZATION_PROHIBITED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.BANKRUPT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.CANCELED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.CHARGED_OFF.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.CREDIT_DISCLOSURES_PRESENTED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.DECEASED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.DELINQUENT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.FRAUD.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.HARDSHIP.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.MATURED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.ORDER.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.PAID_OFF.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.PAST_DUE.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.PENDING_BANKRUPTCY.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.PENDING_CLOSE.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.PENDING_DECEASED.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingAccountTagName.PENDING_FRAUD.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
