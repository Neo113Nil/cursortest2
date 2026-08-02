package com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentError;", "toDepositFulfillmentError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentError;", "Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Data;", "", "correlationId", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentResult;", "toDepositFulfillmentResult", "(Lcom/paypal/oslo/feature/wallet/graphql/CreateWalletDepositMutation$Data;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddDepositMapperKt {
    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError toDepositFulfillmentError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError.Business.Error error;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError.Network.NetworkFailure.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        if (arrow.core.NonEmptyList.m9588isEmptyimpl(graphQL.m11659getErrors1X0FAY())) {
            error = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError.Business.MissingData.INSTANCE;
        } else {
            java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = graphQL.m11659getErrors1X0FAY();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
            java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
            }
            error = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentError.Business.Error(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.ErrorMapperKt.m21255getIssueGZgkXh4(graphQL.m11659getErrors1X0FAY()));
        }
        return error;
    }

    public static final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentResult toDepositFulfillmentResult(com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Data data, java.lang.String str) {
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus depositStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.wallet.graphql.CreateWalletDepositMutation.Deposit deposit = data.getAddDeposit().getDeposit();
        java.lang.String id = deposit.getId();
        java.lang.Object createTime = deposit.getCreateTime();
        java.lang.String obj = createTime != null ? createTime.toString() : null;
        if (obj == null) {
            obj = "";
        }
        switch (com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.AddDepositMapperKt.WhenMappings.$EnumSwitchMapping$0[deposit.getStatus().ordinal()]) {
            case 1:
                depositStatus = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus.PENDING;
                break;
            case 2:
                depositStatus = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus.SUCCESS;
                break;
            case 3:
                depositStatus = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus.PARTIAL_SUCCESS;
                break;
            case 4:
                depositStatus = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus.DENIED;
                break;
            case 5:
                depositStatus = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus.REVERSED;
                break;
            case 6:
                depositStatus = com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositStatus.UNKNOWN;
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.api.graphql.schema.type.DepositType type = deposit.getType();
        java.lang.String rawValue = type != null ? type.getRawValue() : null;
        if (rawValue == null) {
            rawValue = "";
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentResult.Data data2 = new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentResult.Data(new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentResult.AddDeposit(new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentResult.Deposit(id, obj, depositStatus, rawValue)));
        if (str == null) {
            str = "";
        }
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentResult(data2, new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentResult.Extensions(str));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.DepositStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DepositStatus.PENDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DepositStatus.SUCCESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DepositStatus.PARTIAL_SUCCESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DepositStatus.DENIED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DepositStatus.REVERSED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.DepositStatus.UNKNOWN__.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
