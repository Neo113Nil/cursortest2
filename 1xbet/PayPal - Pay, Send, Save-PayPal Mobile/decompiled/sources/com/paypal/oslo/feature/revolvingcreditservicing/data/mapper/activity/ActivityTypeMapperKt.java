package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingActivityType;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/type/RevolvingCreditServicingActivityType;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/ActivityType;", "toActivityType", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingActivityType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/ActivityType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityTypeMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType toActivityType(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType revolvingCreditServicingActivityType) {
        switch (revolvingCreditServicingActivityType == null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity.ActivityTypeMapperKt.WhenMappings.$EnumSwitchMapping$0[revolvingCreditServicingActivityType.ordinal()]) {
            case -1:
            case 8:
            case 9:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.UNKNOWN;
            case 0:
            default:
                throw new kotlin.NoWhenBranchMatchedException();
            case 1:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.ADJUSTMENT;
            case 2:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.CASH_ADVANCE;
            case 3:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.FEE;
            case 4:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.INTEREST;
            case 5:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PAYMENT;
            case 6:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.PURCHASE;
            case 7:
                return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.ActivityType.REFUND;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType.ADJUSTMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType.CASH_ADVANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType.FEE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType.INTEREST.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType.PAYMENT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType.PURCHASE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType.REFUND.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType.UNKNOWN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingActivityType.UNKNOWN__.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
