package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u00060\u0004j\u0002`\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u0007\u001a\u00020\r*\u00060\tj\u0002`\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0007\u0010\u000e\u001a\u0017\u0010\u0007\u001a\u00020\u0011*\u00060\u000fj\u0002`\u0010H\u0000¢\u0006\u0004\b\u0007\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "toRepaymentActivity", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditPaymentsFragment;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentActivity;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentType;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/type/RevolvingCreditPaymentType;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentType;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentType;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentStatus;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/type/RevolvingCreditPaymentStatus;", "", "isCancelable", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentStatus;", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentStatus;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentChannel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/type/RevolvingCreditServicingPaymentChannel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentChannel;", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentChannel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/RepaymentChannel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity toRepaymentActivity(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment revolvingCreditPaymentsFragment) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentsFragment, "");
        java.lang.String valueOf = java.lang.String.valueOf(revolvingCreditPaymentsFragment.getId());
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType domain = toDomain(revolvingCreditPaymentsFragment.getType());
        java.lang.Boolean cancelable = revolvingCreditPaymentsFragment.getCancelable();
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus status = revolvingCreditPaymentsFragment.getStatus();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus domain2 = status != null ? toDomain(status, revolvingCreditPaymentsFragment.getCancelable()) : null;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentChannel channel = revolvingCreditPaymentsFragment.getChannel();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel domain3 = channel != null ? toDomain(channel) : null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.MoneyMapperKt.toCurrencyAmount(revolvingCreditPaymentsFragment.getAmount().getRevolvingCreditMoneyFragment());
        java.lang.Object createTime = revolvingCreditPaymentsFragment.getCreateTime();
        java.time.Instant anyToInstantOrNull = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(createTime != null ? createTime.toString() : null);
        java.lang.Object paymentTime = revolvingCreditPaymentsFragment.getPaymentTime();
        java.time.Instant anyToInstantOrNull2 = com.paypal.oslo.feature.revolvingcreditservicing.utils.DateUtilKt.anyToInstantOrNull(paymentTime != null ? paymentTime.toString() : null);
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment.FundingInstrument> fundingInstruments = revolvingCreditPaymentsFragment.getFundingInstruments();
        if (fundingInstruments != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = fundingInstruments.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.RepaymentFundingInstrument repaymentFundingInstrument = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.FundingInstrumentsMapperKt.toRepaymentFundingInstrument((com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditPaymentsFragment.FundingInstrument) it.next());
                if (repaymentFundingInstrument != null) {
                    arrayList2.add(repaymentFundingInstrument);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentActivity(valueOf, domain, cancelable, domain2, currencyAmount, anyToInstantOrNull, anyToInstantOrNull2, domain3, arrayList);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType toDomain(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType revolvingCreditPaymentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentType, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.PaymentMapperKt.WhenMappings.$EnumSwitchMapping$0[revolvingCreditPaymentType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.AUTOPAY;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.REAL_TIME;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.SCHEDULED;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentType.UNKNOWN;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus toDomain$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus revolvingCreditPaymentStatus, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return toDomain(revolvingCreditPaymentStatus, bool);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus toDomain(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus revolvingCreditPaymentStatus, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditPaymentStatus, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.PaymentMapperKt.WhenMappings.$EnumSwitchMapping$1[revolvingCreditPaymentStatus.ordinal()];
        if (i == 1) {
            return kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE) ? com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.UPCOMING : com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.PENDING;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.COMPLETED;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.CANCELED;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentStatus.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel toDomain(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentChannel revolvingCreditServicingPaymentChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditServicingPaymentChannel, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.payments.PaymentMapperKt.WhenMappings.$EnumSwitchMapping$2[revolvingCreditServicingPaymentChannel.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel.CUSTOMER_SERVICE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel.DIGITAL;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel.INTERACTIVE_VOICE_RESPONSE;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RepaymentChannel.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.AUTOPAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.REAL_TIME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType.SCHEDULED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus.PENDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus.PROCESSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus.CANCELED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentChannel.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentChannel.CUSTOMER_SERVICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentChannel.DIGITAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentChannel.INTERACTIVE_VOICE_RESPONSE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
