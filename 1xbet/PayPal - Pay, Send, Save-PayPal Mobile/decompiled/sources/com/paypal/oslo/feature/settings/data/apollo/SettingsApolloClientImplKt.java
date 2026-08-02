package com.paypal.oslo.feature.settings.data.apollo;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsApolloClientImplKt {
    public static final /* synthetic */ java.lang.Boolean access$mapToAutoSaveResult(com.apollographql.apollo.api.ApolloResponse apolloResponse) {
        boolean z;
        boolean z2;
        com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsNonGoal savingsNonGoal;
        java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1> items;
        com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.SavingsGoal savingsGoal;
        java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item> items2;
        java.lang.String valueOf;
        if (apolloResponse.data == 0) {
            if (apolloResponse.exception != null) {
                com.apollographql.apollo.exception.ApolloException apolloException = apolloResponse.exception;
                if (apolloException != null) {
                    valueOf = apolloException.getMessage();
                }
                valueOf = null;
            } else {
                if (apolloResponse.errors != null) {
                    valueOf = java.lang.String.valueOf(apolloResponse.errors);
                }
                valueOf = null;
            }
            if (valueOf != null) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
                java.util.Map<java.lang.String, ? extends java.lang.Object> emptyMap = kotlin.collections.MapsKt.emptyMap();
                java.util.Map<java.lang.String, ? extends java.lang.Object> emptyMap2 = kotlin.collections.MapsKt.emptyMap();
                com.apollographql.apollo.exception.ApolloException apolloException2 = apolloResponse.exception;
                logger.e("SettingsApolloClient Error fetching getAutoSaveStatus", emptyMap, emptyMap2, apolloException2 != null ? apolloException2 : new java.lang.Exception(valueOf));
                return null;
            }
            return java.lang.Boolean.FALSE;
        }
        com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data data = (com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data) apolloResponse.data;
        boolean z3 = true;
        if (data != null && (savingsGoal = data.getSavingsGoal()) != null && (items2 = savingsGoal.getItems()) != null) {
            java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item> list = items2;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings transferSettings = ((com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item) it.next()).getTransferSettings();
                    if ((transferSettings != null ? transferSettings.getStatus() : null) == com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus.RUNNING) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data data2 = (com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Data) apolloResponse.data;
        if (data2 != null && (savingsNonGoal = data2.getSavingsNonGoal()) != null && (items = savingsNonGoal.getItems()) != null) {
            java.util.List<com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1> list2 = items;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.TransferSettings1 transferSettings2 = ((com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery.Item1) it2.next()).getTransferSettings();
                    if ((transferSettings2 != null ? transferSettings2.getStatus() : null) == com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus.RUNNING) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        if (!z && !z2) {
            z3 = false;
        }
        return java.lang.Boolean.valueOf(z3);
    }

    public static final /* synthetic */ arrow.core.Ior access$mapToCloseAccountEligibilityResult(com.apollographql.apollo.api.ApolloResponse apolloResponse) {
        java.util.List list;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = new com.paypal.oslo.core.network.graphql.GraphQLData(apolloResponse.data, apolloResponse.extensions);
        java.util.List<com.apollographql.apollo.api.Error> list2 = apolloResponse.errors;
        if (list2 != null) {
            java.util.List<com.apollographql.apollo.api.Error> list3 = list2;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (com.apollographql.apollo.api.Error error : list3) {
                arrayList.add(new com.paypal.oslo.core.network.graphql.error.GraphQLError(error.getMessage(), error.getPath(), error.getExtensions()));
            }
            list = arrow.core.NonEmptyListKt.toNonEmptyListOrNull(arrayList);
        } else {
            list = null;
        }
        java.util.List list4 = list;
        boolean z = (apolloResponse.data == 0 && graphQLData.getExtensions().isEmpty()) ? false : true;
        if (list4 == null) {
            return new arrow.core.Ior.Right(graphQLData);
        }
        if (z) {
            return new arrow.core.Ior.Both(new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(list4, false, null, 6, null), graphQLData);
        }
        return new arrow.core.Ior.Left(new com.paypal.oslo.core.network.graphql.error.CallError.GraphQL(list4, false, null, 6, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Boolean access$mapToCreditOrCashBackCardAutoPay(com.apollographql.apollo.api.ApolloResponse apolloResponse) {
        java.lang.String valueOf;
        D d = apolloResponse.data;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (d == 0) {
            if (apolloResponse.exception != null) {
                com.apollographql.apollo.exception.ApolloException apolloException = apolloResponse.exception;
                if (apolloException != null) {
                    valueOf = apolloException.getMessage();
                    if (valueOf != null) {
                        return bool;
                    }
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
                    java.util.Map<java.lang.String, ? extends java.lang.Object> emptyMap = kotlin.collections.MapsKt.emptyMap();
                    java.util.Map<java.lang.String, ? extends java.lang.Object> emptyMap2 = kotlin.collections.MapsKt.emptyMap();
                    com.apollographql.apollo.exception.ApolloException apolloException2 = apolloResponse.exception;
                    logger.e("SettingsApolloClient Error fetching autopayStatus", emptyMap, emptyMap2, apolloException2 != null ? apolloException2 : new java.lang.Exception(valueOf));
                }
                valueOf = null;
                if (valueOf != null) {
                }
            } else {
                if (apolloResponse.errors != null) {
                    valueOf = java.lang.String.valueOf(apolloResponse.errors);
                    if (valueOf != null) {
                    }
                }
                valueOf = null;
                if (valueOf != null) {
                }
            }
        } else {
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Data data = (com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.Data) apolloResponse.data;
            com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery.RevolvingCreditAutopay revolvingCreditAutopay = data != null ? data.getRevolvingCreditAutopay() : null;
            java.lang.String str = revolvingCreditAutopay != null ? revolvingCreditAutopay.get__typename() : null;
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "RevolvingCreditAutopayEnrolled")) {
                return java.lang.Boolean.TRUE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "RevolvingCreditAutopayUnenrolled")) {
                return bool;
            }
        }
        return null;
    }
}
