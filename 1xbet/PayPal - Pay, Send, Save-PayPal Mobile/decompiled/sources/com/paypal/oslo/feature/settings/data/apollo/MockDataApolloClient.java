package com.paypal.oslo.feature.settings.data.apollo;

@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\b\u0010\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\t\u0010\u0006J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u0006J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00152\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\n\u0010\u0014\u001a\u00060\u001bj\u0002`\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b \u0010\u0006J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b!\u0010\u0006J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b0\u00101"}, d2 = {"Lcom/paypal/oslo/feature/settings/data/apollo/MockDataApolloClient;", "Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;", "<init>", "()V", "Lcom/paypal/oslo/feature/settings/data/model/SettingsMockResponse;", "getSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isAutoReloadEnabled", "isSmartRouteEnabled", "getAutoSaveStatus", "", "reason", "skipNotification", "Lcom/apollographql/apollo/api/ApolloResponse;", "Lcom/paypal/oslo/feature/settings/graphql/CloseAccountMutation$Data;", "closeAccount", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityInput;", "Lcom/paypal/oslo/feature/settings/graphql/type/CloseAccountEligibilityInput;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$Data;", "checkCloseAccountEligibility", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;", "Lcom/paypal/oslo/feature/settings/graphql/type/CreateAccountActivityLogInput;", "Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$Data;", "createAccountActivityLog", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCreditAutoPayStatus", "getCashBackCardAutoPayStatus", "getPrepaidStatus", "Lcom/paypal/oslo/feature/settings/data/model/AccountSettingsMockResponse;", "getAccountSettings$settings_prodRelease", "()Lcom/paypal/oslo/feature/settings/data/model/AccountSettingsMockResponse;", "Lcom/paypal/oslo/feature/settings/data/model/PaymentPreferencesMockResponse;", "getPaymentPreferences$settings_prodRelease", "()Lcom/paypal/oslo/feature/settings/data/model/PaymentPreferencesMockResponse;", "Lcom/paypal/oslo/feature/settings/data/model/DataAndPrivacyMockResponse;", "getDataAndPrivacy$settings_prodRelease", "()Lcom/paypal/oslo/feature/settings/data/model/DataAndPrivacyMockResponse;", "Lcom/paypal/oslo/feature/settings/data/model/NotificationPreferencesMockResponse;", "getNotificationPreferences$settings_prodRelease", "()Lcom/paypal/oslo/feature/settings/data/model/NotificationPreferencesMockResponse;", "Lcom/paypal/oslo/feature/settings/data/model/HelpAndSupportMockResponse;", "getHelpAndSupport$settings_prodRelease", "()Lcom/paypal/oslo/feature/settings/data/model/HelpAndSupportMockResponse;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockDataApolloClient implements com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.data.apollo.MockDataApolloClient INSTANCE = new com.paypal.oslo.feature.settings.data.apollo.MockDataApolloClient();

    private MockDataApolloClient() {
    }

    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    public final java.lang.Object getSettings(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.data.model.SettingsMockResponse> continuation) {
        return new com.paypal.oslo.feature.settings.data.model.SettingsMockResponse(getAccountSettings$settings_prodRelease(), getPaymentPreferences$settings_prodRelease(), getDataAndPrivacy$settings_prodRelease(), getNotificationPreferences$settings_prodRelease(), getHelpAndSupport$settings_prodRelease());
    }

    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    public final java.lang.Object isAutoReloadEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }

    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    public final java.lang.Object isSmartRouteEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }

    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    public final java.lang.Object getAutoSaveStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }

    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    public final java.lang.Object closeAccount(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.ApolloResponse<com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.Data>> continuation) {
        com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.Data data = new com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.Data(new com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.CloseAccount(true));
        com.paypal.oslo.feature.settings.graphql.CloseAccountMutation closeAccountMutation = new com.paypal.oslo.feature.settings.graphql.CloseAccountMutation(new com.paypal.oslo.api.graphql.schema.type.CloseAccountInput(null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z)), 1, null));
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "");
        return new com.apollographql.apollo.api.ApolloResponse.Builder(closeAccountMutation, randomUUID).data(data).build();
    }

    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    public final java.lang.Object checkCloseAccountEligibility(com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityInput closeAccountEligibilityInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data>>> continuation) {
        return new arrow.core.Ior.Right(new com.paypal.oslo.core.network.graphql.GraphQLData(new com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data(new com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility(com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityDecisionCode.ELIGIBLE, null)), null, 2, null));
    }

    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    public final java.lang.Object createAccountActivityLog(com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput createAccountActivityLogInput, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.ApolloResponse<com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data>> continuation) {
        com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data data = new com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data(new com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.CreateAccountActivityLog(kotlin.collections.CollectionsKt.emptyList()));
        com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation createAccountActivityLogMutation = new com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation(new com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput(null, null, new com.paypal.oslo.api.graphql.schema.type.ActivityTypeInput("MOCK_ACTIVITY_TYPE", null, 2, null), new com.paypal.oslo.api.graphql.schema.type.ActivityInitiatorInput("MOCK_INITIATOR", null, null, null, null, null, null, 126, null), null, null, null, 115, null));
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "");
        return new com.apollographql.apollo.api.ApolloResponse.Builder(createAccountActivityLogMutation, randomUUID).data(data).build();
    }

    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    public final java.lang.Object getCreditAutoPayStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }

    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    public final java.lang.Object getCashBackCardAutoPayStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }

    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    public final java.lang.Object getPrepaidStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
    }

    public final com.paypal.oslo.feature.settings.data.model.AccountSettingsMockResponse getAccountSettings$settings_prodRelease() {
        return new com.paypal.oslo.feature.settings.data.model.AccountSettingsMockResponse(new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("Adam Halstad", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("ahalstad@hotmail.com", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("(5••) •••-2416", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("1342 Richmond Dr Santa Clara, CA 95108", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse.Positive, null, null, 54, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null));
    }

    public final com.paypal.oslo.feature.settings.data.model.PaymentPreferencesMockResponse getPaymentPreferences$settings_prodRelease() {
        return new com.paypal.oslo.feature.settings.data.model.PaymentPreferencesMockResponse(new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("Chase Checking •3322", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("View and manage your subscriptions", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("Chase Sapphire •1998", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 60, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null));
    }

    public final com.paypal.oslo.feature.settings.data.model.DataAndPrivacyMockResponse getDataAndPrivacy$settings_prodRelease() {
        com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse settingsItemMockResponse = new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, com.paypal.oslo.feature.settings.data.model.BadgeStateMockResponse.Positive, null, null, 54, null);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        return new com.paypal.oslo.feature.settings.data.model.DataAndPrivacyMockResponse(settingsItemMockResponse, new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, bool, null, 46, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, bool, null, 46, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 60, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null));
    }

    public final com.paypal.oslo.feature.settings.data.model.NotificationPreferencesMockResponse getNotificationPreferences$settings_prodRelease() {
        return new com.paypal.oslo.feature.settings.data.model.NotificationPreferencesMockResponse(new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 60, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null));
    }

    public final com.paypal.oslo.feature.settings.data.model.HelpAndSupportMockResponse getHelpAndSupport$settings_prodRelease() {
        return new com.paypal.oslo.feature.settings.data.model.HelpAndSupportMockResponse(new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse("", false, null, null, null, null, 62, null));
    }
}
