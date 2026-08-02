package com.paypal.oslo.feature.wallet.banks.data.repository;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0003\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0013\u0010\u0003\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\u0003\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u0011*\u00060\u000fj\u0002`\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorParams;", "Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingAggregatorInput;", "Lcom/paypal/oslo/feature/wallet/graphql/type/OpenBankingAggregatorInput;", "toGraphQL", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorParams;)Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingAggregatorInput;", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "Lcom/paypal/oslo/api/graphql/schema/type/BankProductFlow;", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;)Lcom/paypal/oslo/api/graphql/schema/type/BankProductFlow;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;)Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$OpenBankingAggregator;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorResult;", "toOpenBankingAggregatorResult", "(Lcom/paypal/oslo/feature/wallet/graphql/GetOpenBankingAggregatorQuery$OpenBankingAggregator;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorResult;", "Lcom/paypal/oslo/api/graphql/schema/type/BankOperationMode;", "Lcom/paypal/oslo/feature/wallet/graphql/type/BankOperationMode;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;", "toOpenBankingAggregatorOperationMode", "(Lcom/paypal/oslo/api/graphql/schema/type/BankOperationMode;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorError;", "toOpenBankingAggregatorError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OpenBankingAggregatorRepositoryImplKt {
    public static final com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput toGraphQL(com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorParams openBankingAggregatorParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openBankingAggregatorParams, "");
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow = openBankingAggregatorParams.getProductFlow();
        com.apollographql.apollo.api.Optional.Present present = companion.present(productFlow != null ? toGraphQL(productFlow) : null);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators = openBankingAggregatorParams.getExcludeAggregators();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(excludeAggregators, 10));
        java.util.Iterator<T> it = excludeAggregators.iterator();
        while (it.hasNext()) {
            arrayList.add(toGraphQL((com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) it.next()));
        }
        return new com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput(present, companion2.present(arrayList));
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BankProductFlow toGraphQL(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
        switch (com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.WhenMappings.$EnumSwitchMapping$0[addFIFlow.ordinal()]) {
            case 1:
                return com.paypal.oslo.api.graphql.schema.type.BankProductFlow.WALLET;
            case 2:
                return com.paypal.oslo.api.graphql.schema.type.BankProductFlow.WALLET;
            case 3:
                return com.paypal.oslo.api.graphql.schema.type.BankProductFlow.WALLET;
            case 4:
                return com.paypal.oslo.api.graphql.schema.type.BankProductFlow.WALLET;
            case 5:
                return com.paypal.oslo.api.graphql.schema.type.BankProductFlow.WALLET;
            case 6:
                return com.paypal.oslo.api.graphql.schema.type.BankProductFlow.WALLET;
            case 7:
                return com.paypal.oslo.api.graphql.schema.type.BankProductFlow.CRYPTO;
            case 8:
                return com.paypal.oslo.api.graphql.schema.type.BankProductFlow.P2P;
            case 9:
                return com.paypal.oslo.api.graphql.schema.type.BankProductFlow.WALLET;
            case 10:
                return com.paypal.oslo.api.graphql.schema.type.BankProductFlow.WALLET;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BankAggregatorName toGraphQL(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAggregator, "");
        int i = com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.WhenMappings.$EnumSwitchMapping$1[bankAggregator.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.PLAID;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.FINICITY;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.YODLEE_FASTLINK;
        }
        if (i == 4) {
            return com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.TINK;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.UNKNOWN__;
    }

    public static final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult toOpenBankingAggregatorResult(com.paypal.oslo.feature.wallet.graphql.GetOpenBankingAggregatorQuery.OpenBankingAggregator openBankingAggregator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openBankingAggregator, "");
        int i = com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.WhenMappings.$EnumSwitchMapping$2[openBankingAggregator.getAggregatorName().ordinal()];
        if (i == 1) {
            return new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.PLAID, toOpenBankingAggregatorOperationMode(openBankingAggregator.getOperationMode()));
        }
        if (i == 2) {
            return new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK, toOpenBankingAggregatorOperationMode(openBankingAggregator.getOperationMode()));
        }
        if (i == 3) {
            return new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.TINK, toOpenBankingAggregatorOperationMode(openBankingAggregator.getOperationMode()));
        }
        if (i == 4) {
            return new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.FINICITY, toOpenBankingAggregatorOperationMode(openBankingAggregator.getOperationMode()));
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.UNKNOWN, toOpenBankingAggregatorOperationMode(openBankingAggregator.getOperationMode()));
    }

    public static final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode toOpenBankingAggregatorOperationMode(com.paypal.oslo.api.graphql.schema.type.BankOperationMode bankOperationMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankOperationMode, "");
        int i = com.paypal.oslo.feature.wallet.banks.data.repository.OpenBankingAggregatorRepositoryImplKt.WhenMappings.$EnumSwitchMapping$3[bankOperationMode.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.LITE_MODE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.FULL_MODE;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError toOpenBankingAggregatorError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                return com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError.NetworkError.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = ((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        return new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorError.Business.Error(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.ONBOARDING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.AUTO_RELOAD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.SUBSCRIPTIONS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.BNPL_SERVICING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.BNPL_ACQUISITION.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.CRYPTO.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.P2P.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.QRC.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.DEBIT_CARD.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.values().length];
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.PLAID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.FINICITY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.YODLEE_FASTLINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.TINK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.PLAID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.YODLEE_FASTLINK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.TINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.FINICITY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BankAggregatorName.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.api.graphql.schema.type.BankOperationMode.values().length];
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.BankOperationMode.LITE_MODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.BankOperationMode.FULL_MODE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.BankOperationMode.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }
}
