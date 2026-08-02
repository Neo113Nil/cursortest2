package com.paypal.oslo.feature.merchantbanking.data.repository;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\bH\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0005*\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\u0005*\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$VirtualBankAccounts;", "Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;", "toAccountRoutingInfoData", "(Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountsQuery$VirtualBankAccounts;)Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;", "Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$VirtualBankAccountEligibility;", "", "isEligible", "(Lcom/paypal/oslo/feature/merchantbanking/graphql/VirtualBankAccountEligibilityQuery$VirtualBankAccountEligibility;)Z", "Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;", "(Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;)Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;", "isIneligible", "(Lcom/paypal/oslo/feature/merchantbanking/graphql/ProvisionVirtualBankAccountMutation$ProvisionVirtualBankAccount;)Z", "isRiskDenied", "Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "isRiskDeniedError", "(Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VirtualBankAccountExtensionsKt {
    public static final com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData toAccountRoutingInfoData(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.VirtualBankAccounts virtualBankAccounts) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccounts, "");
        com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item item = (com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery.Item) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) virtualBankAccounts.getPage().getItems());
        if (item == null) {
            return null;
        }
        java.lang.String bankAccountNumber = item.getBankAccountNumber();
        java.lang.String routingNumber = item.getRoutingNumber();
        java.lang.String str2 = bankAccountNumber;
        if (str2 == null || str2.length() == 0 || (str = routingNumber) == null || str.length() == 0) {
            return null;
        }
        return new com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData(bankAccountNumber, routingNumber, "", false);
    }

    public static final boolean isEligible(com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery.VirtualBankAccountEligibility virtualBankAccountEligibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccountEligibility, "");
        return virtualBankAccountEligibility.getStatus() == com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityStatus.ELIGIBLE;
    }

    public static final com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData toAccountRoutingInfoData(com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount) {
        com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.VirtualBankAccount virtualBankAccount;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionVirtualBankAccount, "");
        if (provisionVirtualBankAccount.getStatus() != com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.PROVISIONED || (virtualBankAccount = provisionVirtualBankAccount.getVirtualBankAccount()) == null) {
            return null;
        }
        java.lang.String bankAccountNumber = virtualBankAccount.getBankAccountNumber();
        java.lang.String routingNumber = virtualBankAccount.getRoutingNumber();
        java.lang.String str2 = bankAccountNumber;
        if (str2 == null || str2.length() == 0 || (str = routingNumber) == null || str.length() == 0) {
            return null;
        }
        return new com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData(bankAccountNumber, routingNumber, "", true);
    }

    public static final boolean isIneligible(com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionVirtualBankAccount, "");
        return provisionVirtualBankAccount.getStatus() == com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.INELIGIBLE || (provisionVirtualBankAccount.getStatus() == com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.NOT_PROVISIONED && kotlin.collections.CollectionsKt.contains(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason[]{com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.UNSUPPORTED_ACCOUNT_TYPE, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.UNSUPPORTED_BUSINESS_TYPE, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.UNSUPPORTED_COUNTRY, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.SIMILAR_PRODUCT_EXISTS}), provisionVirtualBankAccount.getReason()));
    }

    public static final boolean isRiskDenied(com.paypal.oslo.feature.merchantbanking.graphql.ProvisionVirtualBankAccountMutation.ProvisionVirtualBankAccount provisionVirtualBankAccount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionVirtualBankAccount, "");
        return provisionVirtualBankAccount.getStatus() == com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningStatus.DENIED || provisionVirtualBankAccount.getReason() == com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountProvisioningOutcomeReason.DENIED;
    }

    public static final boolean isRiskDeniedError(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
        java.lang.Object obj;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
        java.util.Map<java.lang.String, java.lang.Object> extensions = graphQLError.getExtensions();
        if (extensions != null) {
            java.lang.Object obj2 = extensions.get("details");
            java.lang.Boolean bool = null;
            java.util.List list = obj2 instanceof java.util.List ? (java.util.List) obj2 : null;
            if (list != null) {
                java.util.List list2 = list;
                if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                    for (java.lang.Object obj3 : list2) {
                        java.util.Map map = obj3 instanceof java.util.Map ? (java.util.Map) obj3 : null;
                        if (map != null && (obj = map.get(com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE)) != null) {
                            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                            if (str != null) {
                                z = true;
                                if (kotlin.text.StringsKt.equals(str, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, true)) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                z = false;
                bool = java.lang.Boolean.valueOf(z);
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
