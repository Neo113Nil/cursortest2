package com.paypal.oslo.feature.wallet.fifo.common.data.repository;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityError;", "toGetEligibilityError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityError;", "Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$TransferCapabilitiesEvaluation;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/BalanceAddWithdrawEligibility;", "toBalanceAddWithdrawEligibility", "(Lcom/paypal/oslo/feature/wallet/graphql/GetTransferCapabilitiesEvaluationQuery$TransferCapabilitiesEvaluation;)Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/BalanceAddWithdrawEligibility;", "Lcom/paypal/oslo/api/graphql/schema/type/CIPStatus;", "Lcom/paypal/oslo/feature/wallet/graphql/type/CIPStatus;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/api/graphql/schema/type/CIPStatus;)Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CIPStatus;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityInput;", "input", "Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilitiesEvaluationInput;", "Lcom/paypal/oslo/feature/wallet/graphql/type/TransferCapabilitiesEvaluationInput;", "toTransferCapabilitiesEvaluationInput", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityInput;)Lcom/paypal/oslo/api/graphql/schema/type/TransferCapabilitiesEvaluationInput;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FlowIdentifier;", "identifier", "Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;", "Lcom/paypal/oslo/feature/wallet/graphql/type/ProductFlowIdentifier;", "toGraphProductIdentifier", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FlowIdentifier;)Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TransferCapabilitiesMapperKt {
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError toGetEligibilityError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError.Network.NetworkFailure.INSTANCE;
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
        return new com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError.Business.Error(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList)), com.paypal.oslo.feature.wallet.fifo.addmoney.data.mapper.ErrorMapperKt.m21255getIssueGZgkXh4(graphQL.m11659getErrors1X0FAY()));
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.BalanceAddWithdrawEligibility toBalanceAddWithdrawEligibility(com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.TransferCapabilitiesEvaluation transferCapabilitiesEvaluation) {
        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability depositCapability;
        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability depositCapability2;
        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability withdrawalCapability;
        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability withdrawalCapability2;
        boolean z;
        boolean z2;
        java.util.Iterator it;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction> suggestedActions;
        java.util.List emptyList;
        java.util.List emptyList2;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount> suggestedDepositAmounts;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw standardWithdraw;
        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.RecommendedAmount recommendedAmount;
        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney1 onMoney;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability> withdrawalCapabilities;
        java.lang.Object obj;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability> withdrawalCapabilities2;
        java.lang.Object obj2;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability> depositCapabilities;
        java.lang.Object obj3;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability> depositCapabilities2;
        java.lang.Object obj4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferCapabilitiesEvaluation, "");
        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability capability = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.Capability) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) transferCapabilitiesEvaluation.getCapabilities());
        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapabilities depositCapabilities3 = capability != null ? capability.getDepositCapabilities() : null;
        if (depositCapabilities3 == null || (depositCapabilities2 = depositCapabilities3.getDepositCapabilities()) == null) {
            depositCapability = null;
        } else {
            java.util.Iterator<T> it2 = depositCapabilities2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it2.next();
                if (((com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability) obj4).getType() == com.paypal.oslo.api.graphql.schema.type.DepositCapabilityType.DELAYED) {
                    break;
                }
            }
            depositCapability = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability) obj4;
        }
        if (depositCapabilities3 == null || (depositCapabilities = depositCapabilities3.getDepositCapabilities()) == null) {
            depositCapability2 = null;
        } else {
            java.util.Iterator<T> it3 = depositCapabilities.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (((com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability) obj3).getType() == com.paypal.oslo.api.graphql.schema.type.DepositCapabilityType.INSTANT) {
                    break;
                }
            }
            depositCapability2 = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability) obj3;
        }
        com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapabilities withdrawalCapabilities3 = capability != null ? capability.getWithdrawalCapabilities() : null;
        if (withdrawalCapabilities3 == null || (withdrawalCapabilities2 = withdrawalCapabilities3.getWithdrawalCapabilities()) == null) {
            withdrawalCapability = null;
        } else {
            java.util.Iterator<T> it4 = withdrawalCapabilities2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it4.next();
                if (((com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability) obj2).getType() == com.paypal.oslo.api.graphql.schema.type.WithdrawalCapabilityType.DELAYED) {
                    break;
                }
            }
            withdrawalCapability = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability) obj2;
        }
        if (withdrawalCapabilities3 == null || (withdrawalCapabilities = withdrawalCapabilities3.getWithdrawalCapabilities()) == null) {
            withdrawalCapability2 = null;
        } else {
            java.util.Iterator<T> it5 = withdrawalCapabilities.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it5.next();
                if (((com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability) obj).getType() == com.paypal.oslo.api.graphql.schema.type.WithdrawalCapabilityType.INSTANT) {
                    break;
                }
            }
            withdrawalCapability2 = (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.WithdrawalCapability) obj;
        }
        if ((depositCapability != null ? depositCapability.getStatus() : null) != com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus.ACTIVE) {
            if ((depositCapability2 != null ? depositCapability2.getStatus() : null) != com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus.ACTIVE) {
                z = false;
                if ((withdrawalCapability == null ? withdrawalCapability.getStatus() : null) != com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus.ACTIVE) {
                    if ((withdrawalCapability2 != null ? withdrawalCapability2.getStatus() : null) != com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus.ACTIVE) {
                        z2 = false;
                        java.util.List listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability[]{depositCapability, depositCapability2});
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj5 : listOfNotNull) {
                            if (((com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability) obj5).getStatus() == com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus.ACTIVE) {
                                arrayList.add(obj5);
                            }
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1> supportedInstruments = ((com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability) it.next()).getSupportedInstruments();
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportedInstruments, 10));
                            java.util.Iterator<T> it6 = supportedInstruments.iterator();
                            while (it6.hasNext()) {
                                arrayList3.add(((com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SupportedInstrument1) it6.next()).getInstrumentType());
                            }
                            kotlin.collections.CollectionsKt.addAll(arrayList2, arrayList3);
                        }
                        java.util.ArrayList arrayList4 = arrayList2;
                        com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType from = com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.INSTANCE.from(arrayList4.contains(com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType.BANK), arrayList4.contains(com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType.CARD));
                        com.paypal.oslo.feature.wallet.common.domain.model.Money money = (depositCapabilities3 != null || (recommendedAmount = depositCapabilities3.getRecommendedAmount()) == null || (onMoney = recommendedAmount.getOnMoney()) == null) ? null : new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney.getCurrencyCode().toString(), onMoney.getValue());
                        suggestedActions = transferCapabilitiesEvaluation.getSuggestedActions();
                        if (suggestedActions == null) {
                            emptyList = kotlin.collections.CollectionsKt.emptyList();
                        } else {
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            for (com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedAction suggestedAction : suggestedActions) {
                                com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardDeposit onTransferActionStandardDeposit = suggestedAction.getOnTransferActionStandardDeposit();
                                if (onTransferActionStandardDeposit != null) {
                                    com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(onTransferActionStandardDeposit.getCipStatus());
                                    com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep transferRemedialStep = (com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep) kotlin.collections.CollectionsKt.getOrNull(onTransferActionStandardDeposit.getRemedialSteps(), 0);
                                    standardWithdraw = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit(highResolutionOutputSizeshNQ4ISI, transferRemedialStep != null ? transferRemedialStep.toString() : null);
                                } else {
                                    com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnTransferActionStandardWithdrawal onTransferActionStandardWithdrawal = suggestedAction.getOnTransferActionStandardWithdrawal();
                                    if (onTransferActionStandardWithdrawal != null) {
                                        com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(onTransferActionStandardWithdrawal.getCipStatus());
                                        com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep transferRemedialStep2 = (com.paypal.oslo.api.graphql.schema.type.TransferRemedialStep) kotlin.collections.CollectionsKt.getOrNull(onTransferActionStandardWithdrawal.getRemedialSteps(), 0);
                                        standardWithdraw = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw(highResolutionOutputSizeshNQ4ISI2, transferRemedialStep2 != null ? transferRemedialStep2.toString() : null);
                                    } else {
                                        standardWithdraw = null;
                                    }
                                }
                                if (standardWithdraw != null) {
                                    arrayList5.add(standardWithdraw);
                                }
                            }
                            emptyList = arrayList5;
                        }
                        if (depositCapabilities3 != null || (suggestedDepositAmounts = depositCapabilities3.getSuggestedDepositAmounts()) == null) {
                            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                        } else {
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.Iterator<T> it7 = suggestedDepositAmounts.iterator();
                            while (it7.hasNext()) {
                                com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.OnMoney2 onMoney2 = ((com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.SuggestedDepositAmount) it7.next()).getOnMoney();
                                com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = onMoney2 != null ? new com.paypal.oslo.feature.wallet.common.domain.model.Money(onMoney2.getCurrencyCode().toString(), onMoney2.getValue()) : null;
                                if (money2 != null) {
                                    arrayList6.add(money2);
                                }
                            }
                            emptyList2 = arrayList6;
                        }
                        com.paypal.oslo.feature.wallet.common.domain.model.Money money3 = (money == null || emptyList2.isEmpty()) ? money : (com.paypal.oslo.feature.wallet.common.domain.model.Money) emptyList2.get(0);
                        java.util.List list = emptyList;
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        for (java.lang.Object obj6 : list) {
                            if (obj6 instanceof com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit) {
                                arrayList7.add(obj6);
                            }
                        }
                        com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit standardDeposit = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList7);
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        for (java.lang.Object obj7 : list) {
                            if (obj7 instanceof com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw) {
                                arrayList8.add(obj7);
                            }
                        }
                        return new com.paypal.oslo.feature.wallet.fifo.common.domain.model.BalanceAddWithdrawEligibility(z, z2, from, money3, emptyList2, null, emptyList, standardDeposit, (com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList8), 32, null);
                    }
                }
                z2 = true;
                java.util.List listOfNotNull2 = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability[]{depositCapability, depositCapability2});
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                while (r0.hasNext()) {
                }
                java.util.ArrayList arrayList22 = new java.util.ArrayList();
                it = arrayList9.iterator();
                while (it.hasNext()) {
                }
                java.util.ArrayList arrayList42 = arrayList22;
                com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType from2 = com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.INSTANCE.from(arrayList42.contains(com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType.BANK), arrayList42.contains(com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType.CARD));
                if (depositCapabilities3 != null) {
                }
                suggestedActions = transferCapabilitiesEvaluation.getSuggestedActions();
                if (suggestedActions == null) {
                }
                if (depositCapabilities3 != null) {
                }
                emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                if (money == null) {
                }
                java.util.List list2 = emptyList;
                java.util.ArrayList arrayList72 = new java.util.ArrayList();
                while (r3.hasNext()) {
                }
                com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit standardDeposit2 = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList72);
                java.util.ArrayList arrayList82 = new java.util.ArrayList();
                while (r1.hasNext()) {
                }
                return new com.paypal.oslo.feature.wallet.fifo.common.domain.model.BalanceAddWithdrawEligibility(z, z2, from2, money3, emptyList2, null, emptyList, standardDeposit2, (com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList82), 32, null);
            }
        }
        z = true;
        if ((withdrawalCapability == null ? withdrawalCapability.getStatus() : null) != com.paypal.oslo.api.graphql.schema.type.TransferCapabilityStatus.ACTIVE) {
        }
        z2 = true;
        java.util.List listOfNotNull22 = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.paypal.oslo.feature.wallet.graphql.GetTransferCapabilitiesEvaluationQuery.DepositCapability[]{depositCapability, depositCapability2});
        java.util.ArrayList arrayList92 = new java.util.ArrayList();
        while (r0.hasNext()) {
        }
        java.util.ArrayList arrayList222 = new java.util.ArrayList();
        it = arrayList92.iterator();
        while (it.hasNext()) {
        }
        java.util.ArrayList arrayList422 = arrayList222;
        com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType from22 = com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.INSTANCE.from(arrayList422.contains(com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType.BANK), arrayList422.contains(com.paypal.oslo.api.graphql.schema.type.DepositInstrumentType.CARD));
        if (depositCapabilities3 != null) {
        }
        suggestedActions = transferCapabilitiesEvaluation.getSuggestedActions();
        if (suggestedActions == null) {
        }
        if (depositCapabilities3 != null) {
        }
        emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        if (money == null) {
        }
        java.util.List list22 = emptyList;
        java.util.ArrayList arrayList722 = new java.util.ArrayList();
        while (r3.hasNext()) {
        }
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit standardDeposit22 = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList722);
        java.util.ArrayList arrayList822 = new java.util.ArrayList();
        while (r1.hasNext()) {
        }
        return new com.paypal.oslo.feature.wallet.fifo.common.domain.model.BalanceAddWithdrawEligibility(z, z2, from22, money3, emptyList2, null, emptyList, standardDeposit22, (com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardWithdraw) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList822), 32, null);
    }

    private static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.api.graphql.schema.type.CIPStatus cIPStatus) {
        int i = cIPStatus == null ? -1 : com.paypal.oslo.feature.wallet.fifo.common.data.repository.TransferCapabilitiesMapperKt.WhenMappings.$EnumSwitchMapping$0[cIPStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus.VERIFIED;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus.UNVERIFIED;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus.PENDING;
        }
        return com.paypal.oslo.feature.wallet.fifo.common.domain.model.CIPStatus.UNKNOWN;
    }

    public static final com.paypal.oslo.api.graphql.schema.type.TransferCapabilitiesEvaluationInput toTransferCapabilitiesEvaluationInput(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityInput getEligibilityInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getEligibilityInput, "");
        return new com.paypal.oslo.api.graphql.schema.type.TransferCapabilitiesEvaluationInput(new com.paypal.oslo.api.graphql.schema.type.ProductFlowInput(toGraphProductIdentifier(getEligibilityInput.getProductFlow()), null, new com.apollographql.apollo.api.Optional.Present(com.paypal.oslo.api.graphql.schema.type.TransferChannel.MOBILE), 2, null));
    }

    public static final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier toGraphProductIdentifier(com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier flowIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowIdentifier, "");
        if (com.paypal.oslo.feature.wallet.fifo.common.data.repository.TransferCapabilitiesMapperKt.WhenMappings.$EnumSwitchMapping$1[flowIdentifier.ordinal()] != 1) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier.CONSUMER_TRANSFERS;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.CIPStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CIPStatus.VERIFIED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CIPStatus.UNVERIFIED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.CIPStatus.PENDING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier.values().length];
            try {
                iArr2[com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier.CONSUMER_TRANSFERS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
