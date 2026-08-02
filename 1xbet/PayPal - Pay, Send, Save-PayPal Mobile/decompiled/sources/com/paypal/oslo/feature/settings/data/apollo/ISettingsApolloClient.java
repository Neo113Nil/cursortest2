package com.paypal.oslo.feature.settings.data.apollo;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\b\u0010\u0004J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H¦@¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\n\u0010\u0012\u001a\u00060\u0019j\u0002`\u001aH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\u001e\u0010\u0004J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\u001f\u0010\u0004J\u0012\u0010 \u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b \u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;", "", "Lcom/paypal/oslo/feature/settings/data/model/SettingsMockResponse;", "getSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isAutoReloadEnabled", "isSmartRouteEnabled", "getAutoSaveStatus", "", "reason", "skipNotification", "Lcom/apollographql/apollo/api/ApolloResponse;", "Lcom/paypal/oslo/feature/settings/graphql/CloseAccountMutation$Data;", "closeAccount", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityInput;", "Lcom/paypal/oslo/feature/settings/graphql/type/CloseAccountEligibilityInput;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$Data;", "checkCloseAccountEligibility", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;", "Lcom/paypal/oslo/feature/settings/graphql/type/CreateAccountActivityLogInput;", "Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$Data;", "createAccountActivityLog", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCreditAutoPayStatus", "getCashBackCardAutoPayStatus", "getPrepaidStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ISettingsApolloClient {
    java.lang.Object checkCloseAccountEligibility(com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityInput closeAccountEligibilityInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data>>> continuation);

    java.lang.Object closeAccount(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.ApolloResponse<com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.Data>> continuation);

    java.lang.Object createAccountActivityLog(com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput createAccountActivityLogInput, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.ApolloResponse<com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data>> continuation);

    java.lang.Object getAutoSaveStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object getCashBackCardAutoPayStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object getCreditAutoPayStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object getPrepaidStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object getSettings(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.data.model.SettingsMockResponse> continuation);

    java.lang.Object isAutoReloadEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object isSmartRouteEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object closeAccount$default(com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeAccount");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return iSettingsApolloClient.closeAccount(str, z, continuation);
    }
}
