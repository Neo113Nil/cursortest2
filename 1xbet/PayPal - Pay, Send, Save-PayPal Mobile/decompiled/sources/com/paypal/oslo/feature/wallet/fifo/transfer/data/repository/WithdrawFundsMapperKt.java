package com.paypal.oslo.feature.wallet.fifo.transfer.data.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsError;", "toWithdrawFundsError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsError;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsInput;", "Lcom/paypal/oslo/api/graphql/schema/type/WithdrawFundsInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsInput;)Lcom/paypal/oslo/api/graphql/schema/type/WithdrawFundsInput;", "Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$WithdrawFunds;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsResult;", "toWithdrawFundsResult", "(Lcom/paypal/oslo/feature/wallet/graphql/WithdrawFundsMutation$WithdrawFunds;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WithdrawFundsMapperKt {
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError toWithdrawFundsError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError.Network.NetworkFailure.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = graphQL.m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsError.Business.Error(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.ErrorMapperKt.m21255getIssueGZgkXh4(graphQL.m11659getErrors1X0FAY()));
    }

    public static final com.paypal.oslo.api.graphql.schema.type.WithdrawFundsInput toGraphQLInput(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput withdrawFundsInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFundsInput, "");
        return new com.paypal.oslo.api.graphql.schema.type.WithdrawFundsInput(withdrawFundsInput.getDisbursementOptionId(), com.paypal.oslo.api.graphql.schema.type.WithdrawalTransferMethod.INSTANCE.safeValueOf(withdrawFundsInput.getTransferMethod()), new com.apollographql.apollo.api.Optional.Present(com.paypal.oslo.api.graphql.schema.type.PaymentPlanTransferSpeed.INSTANCE.safeValueOf(withdrawFundsInput.getTransferMode())), new com.paypal.oslo.api.graphql.schema.type.CurrencyInput(new com.apollographql.apollo.api.Optional.Present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(withdrawFundsInput.getAmount().getCurrencyCode(), withdrawFundsInput.getAmount().getValue())), null, null, 6, null), withdrawFundsInput.getPlanningId());
    }

    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult toWithdrawFundsResult(com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.WithdrawFunds withdrawFunds) {
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus withdrawalStatus;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String value;
        java.lang.Object currencyCode;
        java.lang.Object currencyCode2;
        java.lang.Object currencyCode3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFunds, "");
        java.lang.String id = withdrawFunds.getId();
        int i = com.paypal.oslo.feature.wallet.fifo.transfer.data.repository.WithdrawFundsMapperKt.WhenMappings.$EnumSwitchMapping$0[withdrawFunds.getStatus().ordinal()];
        if (i == 1) {
            withdrawalStatus = com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus.SUCCESS;
        } else if (i == 2) {
            withdrawalStatus = com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus.PENDING;
        } else if (i == 3) {
            withdrawalStatus = com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus.PROCESSING;
        } else if (i == 4) {
            withdrawalStatus = com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus.FAILED;
        } else {
            withdrawalStatus = com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus.UNKNOWN;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus withdrawalStatus2 = withdrawalStatus;
        java.lang.String rawValue = withdrawFunds.getTransferMethod().getRawValue();
        java.lang.String rawValue2 = withdrawFunds.getTransferMode().getRawValue();
        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Amount amount = withdrawFunds.getAmount();
        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney onMoney = amount.getOnMoney();
        java.lang.String str3 = null;
        java.lang.String obj = (onMoney == null || (currencyCode3 = onMoney.getCurrencyCode()) == null) ? null : currencyCode3.toString();
        if (obj == null) {
            obj = "";
        }
        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney onMoney2 = amount.getOnMoney();
        java.lang.String str4 = androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN;
        if (onMoney2 == null || (str = onMoney2.getValue()) == null) {
            str = androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney(obj, str);
        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.Fees fees = withdrawFunds.getFees();
        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 onMoney3 = fees.getOnMoney();
        java.lang.String obj2 = (onMoney3 == null || (currencyCode2 = onMoney3.getCurrencyCode()) == null) ? null : currencyCode2.toString();
        if (obj2 == null) {
            obj2 = "";
        }
        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney1 onMoney4 = fees.getOnMoney();
        if (onMoney4 == null || (str2 = onMoney4.getValue()) == null) {
            str2 = androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney2 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney(obj2, str2);
        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.NetAmount netAmount = withdrawFunds.getNetAmount();
        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 onMoney5 = netAmount.getOnMoney();
        if (onMoney5 != null && (currencyCode = onMoney5.getCurrencyCode()) != null) {
            str3 = currencyCode.toString();
        }
        java.lang.String str5 = str3 != null ? str3 : "";
        com.paypal.oslo.feature.wallet.graphql.WithdrawFundsMutation.OnMoney2 onMoney6 = netAmount.getOnMoney();
        if (onMoney6 != null && (value = onMoney6.getValue()) != null) {
            str4 = value;
        }
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult(id, withdrawalStatus2, rawValue, rawValue2, withdrawFundsMoney, withdrawFundsMoney2, new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney(str5, str4));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.WithdrawStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.WithdrawStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.WithdrawStatus.PENDING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.WithdrawStatus.PROCESSING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.WithdrawStatus.FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
