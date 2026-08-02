package com.paypal.oslo.feature.businesshome.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$MerchantInsights;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsights;", "toDomain", "(Lcom/paypal/oslo/feature/businesshome/graphql/GetMerchantInsightsQuery$MerchantInsights;)Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsights;", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantActivityType;", "Lcom/paypal/oslo/feature/businesshome/domain/model/Activity$ActivityType;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/api/graphql/schema/type/MerchantActivityType;)Lcom/paypal/oslo/feature/businesshome/domain/model/Activity$ActivityType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MerchantInsightsMapperKt {
    public static final com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights toDomain(com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights merchantInsights) {
        com.paypal.oslo.feature.businesshome.domain.model.Activity activity;
        java.util.List emptyList;
        com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics;
        java.lang.String fullName;
        com.paypal.oslo.feature.businesshome.domain.model.Activity activity2;
        com.paypal.oslo.feature.businesshome.domain.model.Activity activity3;
        java.util.List emptyList2;
        com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics2;
        java.lang.String fullName2;
        com.paypal.oslo.feature.businesshome.domain.model.Activity activity4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantInsights, "");
        com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TransactionMetrics transactionMetrics = merchantInsights.getTransactionMetrics();
        com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Pending pending = transactionMetrics.getPending();
        int totalCount = pending.getTotalCount();
        com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount totalAmount = pending.getTotalAmount();
        com.paypal.oslo.core.money.Money parseAsMoneyOrNull = com.paypal.oslo.core.money.MoneyKt.parseAsMoneyOrNull(totalAmount.getValue(), totalAmount.getCurrencyCode().toString());
        if (parseAsMoneyOrNull == null) {
            pendingPaymentMetrics = null;
        } else {
            int overdueCount = pending.getOverdueCount();
            boolean hasMultipleCurrencies = pending.getHasMultipleCurrencies();
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity singleActivity = pending.getSingleActivity();
            if (singleActivity != null) {
                if (kotlin.text.StringsKt.isBlank(singleActivity.getId())) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.businesshome.LoggerKt.log, "SingleActivity missing id", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", singleActivity.getType().getRawValue())), null, 4, null);
                    activity2 = null;
                } else {
                    activity2 = new com.paypal.oslo.feature.businesshome.domain.model.Activity(singleActivity.getId(), getHighSpeedVideoFpsRanges(singleActivity.getType()));
                }
                activity = activity2;
            } else {
                activity = null;
            }
            java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty> counterParties = pending.getCounterParties();
            if (counterParties == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            } else {
                java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty> list = counterParties;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty counterParty : list) {
                    com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName businessName = counterParty.getBusinessName();
                    if (businessName == null || (fullName = businessName.getBusinessName()) == null) {
                        com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name name2 = counterParty.getName();
                        fullName = name2 != null ? name2.getFullName() : null;
                        if (fullName == null) {
                            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name name3 = counterParty.getName();
                            fullName = name3 != null ? kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{name3.getGivenName(), name3.getSurname()}), " ", null, null, 0, null, null, 62, null) : null;
                            if (fullName == null) {
                                fullName = "";
                            }
                        }
                    }
                    java.lang.Object profilePictureUrl = counterParty.getProfilePictureUrl();
                    arrayList.add(new com.paypal.oslo.feature.businesshome.domain.model.CounterParty(fullName, profilePictureUrl != null ? profilePictureUrl.toString() : null));
                }
                emptyList = arrayList;
            }
            pendingPaymentMetrics = new com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics(totalCount, parseAsMoneyOrNull, overdueCount, hasMultipleCurrencies, activity, emptyList);
        }
        com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Payable payable = transactionMetrics.getPayable();
        int totalCount2 = payable.getTotalCount();
        com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.TotalAmount1 totalAmount2 = payable.getTotalAmount();
        com.paypal.oslo.core.money.Money parseAsMoneyOrNull2 = com.paypal.oslo.core.money.MoneyKt.parseAsMoneyOrNull(totalAmount2.getValue(), totalAmount2.getCurrencyCode().toString());
        if (parseAsMoneyOrNull2 == null) {
            pendingPaymentMetrics2 = null;
        } else {
            int overdueCount2 = payable.getOverdueCount();
            boolean hasMultipleCurrencies2 = payable.getHasMultipleCurrencies();
            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.SingleActivity1 singleActivity2 = payable.getSingleActivity();
            if (singleActivity2 != null) {
                if (kotlin.text.StringsKt.isBlank(singleActivity2.getId())) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.businesshome.LoggerKt.log, "SingleActivity1 missing id", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", singleActivity2.getType().getRawValue())), null, 4, null);
                    activity4 = null;
                } else {
                    activity4 = new com.paypal.oslo.feature.businesshome.domain.model.Activity(singleActivity2.getId(), getHighSpeedVideoFpsRanges(singleActivity2.getType()));
                }
                activity3 = activity4;
            } else {
                activity3 = null;
            }
            java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1> counterParties2 = payable.getCounterParties();
            if (counterParties2 == null) {
                emptyList2 = kotlin.collections.CollectionsKt.emptyList();
            } else {
                java.util.List<com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1> list2 = counterParties2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.CounterParty1 counterParty1 : list2) {
                    com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.BusinessName1 businessName2 = counterParty1.getBusinessName();
                    if (businessName2 == null || (fullName2 = businessName2.getBusinessName()) == null) {
                        com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 name4 = counterParty1.getName();
                        fullName2 = name4 != null ? name4.getFullName() : null;
                        if (fullName2 == null) {
                            com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Name1 name5 = counterParty1.getName();
                            fullName2 = name5 != null ? kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{name5.getGivenName(), name5.getSurname()}), " ", null, null, 0, null, null, 62, null) : null;
                            if (fullName2 == null) {
                                fullName2 = "";
                            }
                        }
                    }
                    java.lang.Object profilePictureUrl2 = counterParty1.getProfilePictureUrl();
                    arrayList2.add(new com.paypal.oslo.feature.businesshome.domain.model.CounterParty(fullName2, profilePictureUrl2 != null ? profilePictureUrl2.toString() : null));
                }
                emptyList2 = arrayList2;
            }
            pendingPaymentMetrics2 = new com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics(totalCount2, parseAsMoneyOrNull2, overdueCount2, hasMultipleCurrencies2, activity3, emptyList2);
        }
        com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics transactionMetrics2 = (pendingPaymentMetrics == null || pendingPaymentMetrics2 == null) ? null : new com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics(transactionMetrics.getTotal(), pendingPaymentMetrics, pendingPaymentMetrics2);
        if (transactionMetrics2 == null) {
            return null;
        }
        com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.DisputeMetrics disputeMetrics = merchantInsights.getDisputeMetrics();
        return new com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights(transactionMetrics2, new com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics(disputeMetrics.getTotal(), disputeMetrics.getPriorityTotal()));
    }

    private static final com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType getHighSpeedVideoFpsRanges(com.paypal.oslo.api.graphql.schema.type.MerchantActivityType merchantActivityType) {
        int i = com.paypal.oslo.feature.businesshome.data.mapper.MerchantInsightsMapperKt.WhenMappings.$EnumSwitchMapping$0[merchantActivityType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType.INVOICE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType.MONEY_REQUEST;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.businesshome.LoggerKt.log, "Unknown MerchantActivityType", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("rawValue", merchantActivityType.getRawValue())), null, 4, null);
        return com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.MerchantActivityType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantActivityType.INVOICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MerchantActivityType.MONEY_REQUEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
