package com.paypal.oslo.feature.settings.data.apollo;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\n\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u000b\u0010\bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\bJ(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00172\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00102\n\u0010\u0016\u001a\u00060\u001dj\u0002`\u001eH\u0096@¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\"\u0010\bJ\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b#\u0010\bJ\u0012\u0010$\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b$\u0010\bR\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/settings/data/apollo/SettingsApolloClientImpl;", "Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/settings/data/model/SettingsMockResponse;", "getSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isAutoReloadEnabled", "isSmartRouteEnabled", "getAutoSaveStatus", "", "reason", "skipNotification", "Lcom/apollographql/apollo/api/ApolloResponse;", "Lcom/paypal/oslo/feature/settings/graphql/CloseAccountMutation$Data;", "closeAccount", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityInput;", "Lcom/paypal/oslo/feature/settings/graphql/type/CloseAccountEligibilityInput;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$Data;", "checkCloseAccountEligibility", "(Lcom/paypal/oslo/api/graphql/schema/type/CloseAccountEligibilityInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;", "Lcom/paypal/oslo/feature/settings/graphql/type/CreateAccountActivityLogInput;", "Lcom/paypal/oslo/feature/settings/graphql/CreateAccountActivityLogMutation$Data;", "createAccountActivityLog", "(Lcom/paypal/oslo/api/graphql/schema/type/CreateAccountActivityLogInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCreditAutoPayStatus", "getCashBackCardAutoPayStatus", "getPrepaidStatus", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsApolloClientImpl implements com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SettingsApolloClientImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|(1:(1:(18:10|11|12|13|(1:15)(1:69)|(3:19|(2:20|(2:22|(2:24|25)(1:46))(2:47|48))|26)|(1:68)(3:52|(2:53|(2:55|(2:57|58)(1:65))(2:66|67))|59)|(8:(1:64)|(1:45)|32|(1:44)|38|39|40|41)|28|(1:30)|45|32|(1:34)|44|38|39|40|41)(2:73|74))(1:75))(1:84)|76|77|78|(17:80|13|(0)(0)|(4:17|19|(3:20|(0)(0)|46)|26)|(1:50)|68|(0)|28|(0)|45|32|(0)|44|38|39|40|41)|81))|86|6|(0)(0)|76|77|78|(0)|81|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        if (r5 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0140, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x004f, code lost:
    
        if (r0 != r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085 A[Catch: ApolloException -> 0x0035, TryCatch #0 {ApolloException -> 0x0035, blocks: (B:12:0x0031, B:13:0x0078, B:15:0x0085, B:17:0x008d, B:19:0x0093, B:20:0x0099, B:22:0x009f, B:26:0x00ae, B:30:0x00ed, B:32:0x00f5, B:34:0x00fa, B:36:0x0100, B:38:0x010e, B:44:0x0106, B:50:0x00b4, B:52:0x00ba, B:53:0x00c0, B:55:0x00c6, B:59:0x00d5, B:62:0x00dd, B:64:0x00e3), top: B:11:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[Catch: ApolloException -> 0x0035, TryCatch #0 {ApolloException -> 0x0035, blocks: (B:12:0x0031, B:13:0x0078, B:15:0x0085, B:17:0x008d, B:19:0x0093, B:20:0x0099, B:22:0x009f, B:26:0x00ae, B:30:0x00ed, B:32:0x00f5, B:34:0x00fa, B:36:0x0100, B:38:0x010e, B:44:0x0106, B:50:0x00b4, B:52:0x00ba, B:53:0x00c0, B:55:0x00c6, B:59:0x00d5, B:62:0x00dd, B:64:0x00e3), top: B:11:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed A[Catch: ApolloException -> 0x0035, TryCatch #0 {ApolloException -> 0x0035, blocks: (B:12:0x0031, B:13:0x0078, B:15:0x0085, B:17:0x008d, B:19:0x0093, B:20:0x0099, B:22:0x009f, B:26:0x00ae, B:30:0x00ed, B:32:0x00f5, B:34:0x00fa, B:36:0x0100, B:38:0x010e, B:44:0x0106, B:50:0x00b4, B:52:0x00ba, B:53:0x00c0, B:55:0x00c6, B:59:0x00d5, B:62:0x00dd, B:64:0x00e3), top: B:11:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa A[Catch: ApolloException -> 0x0035, TryCatch #0 {ApolloException -> 0x0035, blocks: (B:12:0x0031, B:13:0x0078, B:15:0x0085, B:17:0x008d, B:19:0x0093, B:20:0x0099, B:22:0x009f, B:26:0x00ae, B:30:0x00ed, B:32:0x00f5, B:34:0x00fa, B:36:0x0100, B:38:0x010e, B:44:0x0106, B:50:0x00b4, B:52:0x00ba, B:53:0x00c0, B:55:0x00c6, B:59:0x00d5, B:62:0x00dd, B:64:0x00e3), top: B:11:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSettings(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.data.model.SettingsMockResponse> continuation) {
        com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getSettings$1 settingsApolloClientImpl$getSettings$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.feature.settings.data.model.SettingsMockResponse settingsMockResponse;
        com.paypal.oslo.feature.settings.data.model.SettingsMockResponse settingsMockResponse2;
        com.paypal.oslo.feature.settings.data.model.AccountSettingsMockResponse accountSettingsMockResponse;
        com.paypal.oslo.feature.settings.data.model.SettingsMockResponse settingsMockResponse3;
        com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email email;
        com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Profile profile;
        com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email email2;
        java.util.List<com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email> emails;
        java.util.List<com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email> emails2;
        java.lang.Object obj2;
        com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Name name2;
        java.util.List<com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email> emails3;
        java.util.Iterator<T> it;
        java.lang.Object obj3;
        if (continuation instanceof com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getSettings$1) {
            settingsApolloClientImpl$getSettings$1 = (com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getSettings$1) continuation;
            if ((settingsApolloClientImpl$getSettings$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                settingsApolloClientImpl$getSettings$1.getHighSpeedVideoFpsRanges -= 2147483648;
                obj = settingsApolloClientImpl$getSettings$1.Camera2StreamConfigurationMap;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsApolloClientImpl$getSettings$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.settings.data.apollo.MockDataApolloClient mockDataApolloClient = com.paypal.oslo.feature.settings.data.apollo.MockDataApolloClient.INSTANCE;
                    settingsApolloClientImpl$getSettings$1.getHighSpeedVideoFpsRanges = 1;
                    obj = mockDataApolloClient.getSettings(settingsApolloClientImpl$getSettings$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        settingsMockResponse2 = (com.paypal.oslo.feature.settings.data.model.SettingsMockResponse) settingsApolloClientImpl$getSettings$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.paypal.oslo.feature.settings.data.model.AccountSettingsMockResponse accountSettingsMockResponse2 = settingsMockResponse2.getAccountSettingsMockResponse();
                            com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Data data = (com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Data) ((com.apollographql.apollo.api.ApolloResponse) obj).data;
                            email = null;
                            profile = data == null ? data.getProfile() : null;
                            if (profile != null && (emails3 = profile.getEmails()) != null) {
                                it = emails3.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it.next();
                                    if (((com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email) obj3).getPrimary()) {
                                        break;
                                    }
                                }
                                email2 = (com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email) obj3;
                            }
                            if (profile != null || (emails2 = profile.getEmails()) == null) {
                                email2 = null;
                            } else {
                                java.util.Iterator<T> it2 = emails2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it2.next();
                                    if (((com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email) obj2).getConfirmed()) {
                                        break;
                                    }
                                }
                                email2 = (com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email) obj2;
                            }
                        } catch (com.apollographql.apollo.exception.ApolloException e) {
                            e = e;
                            settingsMockResponse = settingsMockResponse2;
                            com.paypal.oslo.feature.settings.LoggerKt.log.e("SettingsApolloClient Error fetching profile", kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), e);
                            accountSettingsMockResponse = settingsMockResponse.getAccountSettingsMockResponse();
                            settingsMockResponse3 = settingsMockResponse;
                            return com.paypal.oslo.feature.settings.data.model.SettingsMockResponse.copy$default(settingsMockResponse3, accountSettingsMockResponse, null, null, null, null, 30, null);
                        }
                        if (email2 == null) {
                            if (profile != null && (emails = profile.getEmails()) != null) {
                                email = (com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) emails);
                            }
                            if (email != null || (r3 = email.getEmailAddress()) == null) {
                                java.lang.Object obj4 = "";
                            }
                            java.lang.String str = (java.lang.String) obj4;
                            if (profile != null || (name2 = profile.getName()) == null || (r0 = name2.getFullName()) == null) {
                                java.lang.String value = accountSettingsMockResponse2.getProfileName().getValue();
                            }
                            accountSettingsMockResponse = com.paypal.oslo.feature.settings.data.model.AccountSettingsMockResponse.copy$default(accountSettingsMockResponse2, new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse(value, false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse(str, false, null, null, null, null, 62, null), null, null, null, null, 60, null);
                            settingsMockResponse3 = settingsMockResponse2;
                            return com.paypal.oslo.feature.settings.data.model.SettingsMockResponse.copy$default(settingsMockResponse3, accountSettingsMockResponse, null, null, null, null, 30, null);
                        }
                        email = email2;
                        if (email != null) {
                        }
                        java.lang.Object obj42 = "";
                        java.lang.String str2 = (java.lang.String) obj42;
                        if (profile != null) {
                        }
                        java.lang.String value2 = accountSettingsMockResponse2.getProfileName().getValue();
                        accountSettingsMockResponse = com.paypal.oslo.feature.settings.data.model.AccountSettingsMockResponse.copy$default(accountSettingsMockResponse2, new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse(value2, false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse(str2, false, null, null, null, null, 62, null), null, null, null, null, 60, null);
                        settingsMockResponse3 = settingsMockResponse2;
                        return com.paypal.oslo.feature.settings.data.model.SettingsMockResponse.copy$default(settingsMockResponse3, accountSettingsMockResponse, null, null, null, null, 30, null);
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                settingsMockResponse = (com.paypal.oslo.feature.settings.data.model.SettingsMockResponse) obj;
                com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.query(new com.paypal.oslo.feature.settings.graphql.GetProfileQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.CacheFirst);
                settingsApolloClientImpl$getSettings$1.getHighSpeedVideoSizes = settingsMockResponse;
                settingsApolloClientImpl$getSettings$1.getHighSpeedVideoFpsRanges = 2;
                obj = apolloCall.execute(settingsApolloClientImpl$getSettings$1);
                if (obj != coroutine_suspended) {
                    settingsMockResponse2 = settingsMockResponse;
                    com.paypal.oslo.feature.settings.data.model.AccountSettingsMockResponse accountSettingsMockResponse22 = settingsMockResponse2.getAccountSettingsMockResponse();
                    com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Data data2 = (com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Data) ((com.apollographql.apollo.api.ApolloResponse) obj).data;
                    email = null;
                    if (data2 == null) {
                    }
                    if (profile != null) {
                        it = emails3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        email2 = (com.paypal.oslo.feature.settings.graphql.GetProfileQuery.Email) obj3;
                    }
                    if (profile != null) {
                    }
                    email2 = null;
                    if (email2 == null) {
                    }
                    email = email2;
                    if (email != null) {
                    }
                    java.lang.Object obj422 = "";
                    java.lang.String str22 = (java.lang.String) obj422;
                    if (profile != null) {
                    }
                    java.lang.String value22 = accountSettingsMockResponse22.getProfileName().getValue();
                    accountSettingsMockResponse = com.paypal.oslo.feature.settings.data.model.AccountSettingsMockResponse.copy$default(accountSettingsMockResponse22, new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse(value22, false, null, null, null, null, 62, null), new com.paypal.oslo.feature.settings.data.model.SettingsItemMockResponse(str22, false, null, null, null, null, 62, null), null, null, null, null, 60, null);
                    settingsMockResponse3 = settingsMockResponse2;
                    return com.paypal.oslo.feature.settings.data.model.SettingsMockResponse.copy$default(settingsMockResponse3, accountSettingsMockResponse, null, null, null, null, 30, null);
                }
                return coroutine_suspended;
            }
        }
        settingsApolloClientImpl$getSettings$1 = new com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getSettings$1(this, continuation);
        obj = settingsApolloClientImpl$getSettings$1.Camera2StreamConfigurationMap;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsApolloClientImpl$getSettings$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        settingsMockResponse = (com.paypal.oslo.feature.settings.data.model.SettingsMockResponse) obj;
        com.apollographql.apollo.ApolloCall apolloCall2 = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.query(new com.paypal.oslo.feature.settings.graphql.GetProfileQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.CacheFirst);
        settingsApolloClientImpl$getSettings$1.getHighSpeedVideoSizes = settingsMockResponse;
        settingsApolloClientImpl$getSettings$1.getHighSpeedVideoFpsRanges = 2;
        obj = apolloCall2.execute(settingsApolloClientImpl$getSettings$1);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[Catch: ApolloException -> 0x00cf, TryCatch #0 {ApolloException -> 0x00cf, blocks: (B:11:0x002d, B:12:0x006c, B:14:0x0072, B:16:0x0076, B:18:0x007a, B:20:0x008d, B:22:0x009b, B:23:0x00a3, B:26:0x009e, B:27:0x00a9, B:30:0x007f, B:32:0x0083, B:33:0x00ac, B:35:0x00b2, B:37:0x00ba, B:39:0x00c0, B:44:0x00ca, B:50:0x003c), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[Catch: ApolloException -> 0x00cf, TryCatch #0 {ApolloException -> 0x00cf, blocks: (B:11:0x002d, B:12:0x006c, B:14:0x0072, B:16:0x0076, B:18:0x007a, B:20:0x008d, B:22:0x009b, B:23:0x00a3, B:26:0x009e, B:27:0x00a9, B:30:0x007f, B:32:0x0083, B:33:0x00ac, B:35:0x00b2, B:37:0x00ba, B:39:0x00c0, B:44:0x00ca, B:50:0x003c), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isAutoReloadEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$isAutoReloadEnabled$1 settingsApolloClientImpl$isAutoReloadEnabled$1;
        int i;
        com.apollographql.apollo.api.ApolloResponse apolloResponse;
        java.lang.String valueOf;
        try {
            if (continuation instanceof com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$isAutoReloadEnabled$1) {
                settingsApolloClientImpl$isAutoReloadEnabled$1 = (com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$isAutoReloadEnabled$1) continuation;
                if ((settingsApolloClientImpl$isAutoReloadEnabled$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    settingsApolloClientImpl$isAutoReloadEnabled$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = settingsApolloClientImpl$isAutoReloadEnabled$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = settingsApolloClientImpl$isAutoReloadEnabled$1.Camera2StreamConfigurationMap;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.query(new com.paypal.oslo.feature.settings.graphql.IsAutoReloadEnabledQuery(new com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType.AUTO_RELOAD_FREQUENCY), new com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType.AUTO_RELOAD_THRESHOLD))), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        settingsApolloClientImpl$isAutoReloadEnabled$1.getHighSpeedVideoSizes = this;
                        settingsApolloClientImpl$isAutoReloadEnabled$1.Camera2StreamConfigurationMap = 1;
                        obj = apolloCall.execute(settingsApolloClientImpl$isAutoReloadEnabled$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
                    if (apolloResponse.data != 0) {
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
                            logger.e("SettingsApolloClient Error fetching isAutoReloadEnabled", emptyMap, emptyMap2, apolloException2 != null ? apolloException2 : new java.lang.Exception(valueOf));
                            return null;
                        }
                        return java.lang.Boolean.FALSE;
                    }
                    com.paypal.oslo.feature.settings.graphql.IsAutoReloadEnabledQuery.Data data = (com.paypal.oslo.feature.settings.graphql.IsAutoReloadEnabledQuery.Data) apolloResponse.data;
                    if ((data != null ? data.getFrequency() : null) == null) {
                        com.paypal.oslo.feature.settings.graphql.IsAutoReloadEnabledQuery.Data data2 = (com.paypal.oslo.feature.settings.graphql.IsAutoReloadEnabledQuery.Data) apolloResponse.data;
                        if ((data2 != null ? data2.getThreshold() : null) == null) {
                            z = false;
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                }
            }
            if (i != 0) {
            }
            apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
            if (apolloResponse.data != 0) {
            }
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            com.paypal.oslo.feature.settings.LoggerKt.log.e("SettingsApolloClient Error fetching isAutoReloadEnabled", kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), e);
            return null;
        }
        settingsApolloClientImpl$isAutoReloadEnabled$1 = new com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$isAutoReloadEnabled$1(this, continuation);
        java.lang.Object obj2 = settingsApolloClientImpl$isAutoReloadEnabled$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsApolloClientImpl$isAutoReloadEnabled$1.Camera2StreamConfigurationMap;
        boolean z2 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: ApolloException -> 0x00c2, TryCatch #0 {ApolloException -> 0x00c2, blocks: (B:11:0x002d, B:12:0x0065, B:14:0x006b, B:16:0x006f, B:18:0x0073, B:20:0x0086, B:22:0x0094, B:23:0x009c, B:26:0x0097, B:27:0x00a2, B:30:0x0078, B:32:0x007c, B:33:0x00a5, B:35:0x00ab, B:37:0x00b1, B:38:0x00b7, B:41:0x00bd, B:48:0x003c), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5 A[Catch: ApolloException -> 0x00c2, TryCatch #0 {ApolloException -> 0x00c2, blocks: (B:11:0x002d, B:12:0x0065, B:14:0x006b, B:16:0x006f, B:18:0x0073, B:20:0x0086, B:22:0x0094, B:23:0x009c, B:26:0x0097, B:27:0x00a2, B:30:0x0078, B:32:0x007c, B:33:0x00a5, B:35:0x00ab, B:37:0x00b1, B:38:0x00b7, B:41:0x00bd, B:48:0x003c), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isSmartRouteEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$isSmartRouteEnabled$1 settingsApolloClientImpl$isSmartRouteEnabled$1;
        int i;
        com.apollographql.apollo.api.ApolloResponse apolloResponse;
        com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.SmartRoutePreferences smartRoutePreferences;
        java.lang.String valueOf;
        try {
            if (continuation instanceof com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$isSmartRouteEnabled$1) {
                settingsApolloClientImpl$isSmartRouteEnabled$1 = (com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$isSmartRouteEnabled$1) continuation;
                if ((settingsApolloClientImpl$isSmartRouteEnabled$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    settingsApolloClientImpl$isSmartRouteEnabled$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = settingsApolloClientImpl$isSmartRouteEnabled$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = settingsApolloClientImpl$isSmartRouteEnabled$1.Camera2StreamConfigurationMap;
                    boolean z = true;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.query(new com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery(new com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput(com.paypal.oslo.api.graphql.schema.type.SmartRouteType.ACH_DEPOSIT_ROUTE))), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        settingsApolloClientImpl$isSmartRouteEnabled$1.getHighSpeedVideoFpsRangesFor = this;
                        settingsApolloClientImpl$isSmartRouteEnabled$1.Camera2StreamConfigurationMap = 1;
                        obj = apolloCall.execute(settingsApolloClientImpl$isSmartRouteEnabled$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
                    if (apolloResponse.data != 0) {
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
                            logger.e("SettingsApolloClient Error fetching SmartRoutePreferences", emptyMap, emptyMap2, apolloException2 != null ? apolloException2 : new java.lang.Exception(valueOf));
                            return null;
                        }
                        return java.lang.Boolean.FALSE;
                    }
                    com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.Data data = (com.paypal.oslo.feature.settings.graphql.SmartRoutePreferencesQuery.Data) apolloResponse.data;
                    if (((data == null || (smartRoutePreferences = data.getSmartRoutePreferences()) == null) ? null : smartRoutePreferences.getStatus()) != com.paypal.oslo.api.graphql.schema.type.SmartRouteStatus.ACTIVE) {
                        z = false;
                    }
                    return java.lang.Boolean.valueOf(z);
                }
            }
            if (i != 0) {
            }
            apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
            if (apolloResponse.data != 0) {
            }
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            com.paypal.oslo.feature.settings.LoggerKt.log.e("SettingsApolloClient Error fetching SmartRoutePreferences", kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), e);
            return null;
        }
        settingsApolloClientImpl$isSmartRouteEnabled$1 = new com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$isSmartRouteEnabled$1(this, continuation);
        java.lang.Object obj2 = settingsApolloClientImpl$isSmartRouteEnabled$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsApolloClientImpl$isSmartRouteEnabled$1.Camera2StreamConfigurationMap;
        boolean z2 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAutoSaveStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getAutoSaveStatus$1 settingsApolloClientImpl$getAutoSaveStatus$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getAutoSaveStatus$1) {
                settingsApolloClientImpl$getAutoSaveStatus$1 = (com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getAutoSaveStatus$1) continuation;
                if ((settingsApolloClientImpl$getAutoSaveStatus$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    settingsApolloClientImpl$getAutoSaveStatus$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = settingsApolloClientImpl$getAutoSaveStatus$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = settingsApolloClientImpl$getAutoSaveStatus$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.query(new com.paypal.oslo.feature.settings.graphql.AutoSaveStatusesForPayPalSavingsQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        settingsApolloClientImpl$getAutoSaveStatus$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = apolloCall.execute(settingsApolloClientImpl$getAutoSaveStatus$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImplKt.access$mapToAutoSaveResult((com.apollographql.apollo.api.ApolloResponse) obj);
                }
            }
            if (i != 0) {
            }
            return com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImplKt.access$mapToAutoSaveResult((com.apollographql.apollo.api.ApolloResponse) obj);
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            com.paypal.oslo.feature.settings.LoggerKt.log.e("SettingsApolloClient Error fetching getAutoSaveStatus", kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), e);
            return null;
        }
        settingsApolloClientImpl$getAutoSaveStatus$1 = new com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getAutoSaveStatus$1(this, continuation);
        java.lang.Object obj2 = settingsApolloClientImpl$getAutoSaveStatus$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsApolloClientImpl$getAutoSaveStatus$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    public final java.lang.Object closeAccount(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.ApolloResponse<com.paypal.oslo.feature.settings.graphql.CloseAccountMutation.Data>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.mutation(new com.paypal.oslo.feature.settings.graphql.CloseAccountMutation(new com.paypal.oslo.api.graphql.schema.type.CloseAccountInput(null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z)), 1, null))).execute(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object checkCloseAccountEligibility(com.paypal.oslo.api.graphql.schema.type.CloseAccountEligibilityInput closeAccountEligibilityInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data>>> continuation) {
        com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$checkCloseAccountEligibility$1 settingsApolloClientImpl$checkCloseAccountEligibility$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$checkCloseAccountEligibility$1) {
                settingsApolloClientImpl$checkCloseAccountEligibility$1 = (com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$checkCloseAccountEligibility$1) continuation;
                if ((settingsApolloClientImpl$checkCloseAccountEligibility$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    settingsApolloClientImpl$checkCloseAccountEligibility$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = settingsApolloClientImpl$checkCloseAccountEligibility$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = settingsApolloClientImpl$checkCloseAccountEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.query(new com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery(closeAccountEligibilityInput)), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        settingsApolloClientImpl$checkCloseAccountEligibility$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(closeAccountEligibilityInput);
                        settingsApolloClientImpl$checkCloseAccountEligibility$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = apolloCall.execute(settingsApolloClientImpl$checkCloseAccountEligibility$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImplKt.access$mapToCloseAccountEligibilityResult((com.apollographql.apollo.api.ApolloResponse) obj);
                }
            }
            if (i != 0) {
            }
            return com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImplKt.access$mapToCloseAccountEligibilityResult((com.apollographql.apollo.api.ApolloResponse) obj);
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            com.apollographql.apollo.exception.ApolloException apolloException = e;
            com.paypal.oslo.feature.settings.LoggerKt.log.e("SettingsApolloClient Error checking close account eligibility", kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), apolloException);
            return new arrow.core.Ior.Left(new com.paypal.oslo.core.network.graphql.error.CallError.Network(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(apolloException)));
        }
        settingsApolloClientImpl$checkCloseAccountEligibility$1 = new com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$checkCloseAccountEligibility$1(this, continuation);
        java.lang.Object obj2 = settingsApolloClientImpl$checkCloseAccountEligibility$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsApolloClientImpl$checkCloseAccountEligibility$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    public final java.lang.Object createAccountActivityLog(com.paypal.oslo.api.graphql.schema.type.CreateAccountActivityLogInput createAccountActivityLogInput, kotlin.coroutines.Continuation<? super com.apollographql.apollo.api.ApolloResponse<com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation.Data>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.mutation(new com.paypal.oslo.feature.settings.graphql.CreateAccountActivityLogMutation(createAccountActivityLogInput)).execute(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCreditAutoPayStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getCreditAutoPayStatus$1 settingsApolloClientImpl$getCreditAutoPayStatus$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getCreditAutoPayStatus$1) {
                settingsApolloClientImpl$getCreditAutoPayStatus$1 = (com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getCreditAutoPayStatus$1) continuation;
                if ((settingsApolloClientImpl$getCreditAutoPayStatus$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    settingsApolloClientImpl$getCreditAutoPayStatus$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = settingsApolloClientImpl$getCreditAutoPayStatus$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = settingsApolloClientImpl$getCreditAutoPayStatus$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayInput revolvingCreditAutopayInput = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.PAYPAL_CREDIT_CARD_US, null, 2, null);
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.query(new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery(revolvingCreditAutopayInput)), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        settingsApolloClientImpl$getCreditAutoPayStatus$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(revolvingCreditAutopayInput);
                        settingsApolloClientImpl$getCreditAutoPayStatus$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = apolloCall.execute(settingsApolloClientImpl$getCreditAutoPayStatus$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImplKt.access$mapToCreditOrCashBackCardAutoPay((com.apollographql.apollo.api.ApolloResponse) obj);
                }
            }
            if (i != 0) {
            }
            return com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImplKt.access$mapToCreditOrCashBackCardAutoPay((com.apollographql.apollo.api.ApolloResponse) obj);
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            com.paypal.oslo.feature.settings.LoggerKt.log.e("SettingsApolloClient Error fetching getCreditAutoPayStatus", kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), e);
            return null;
        }
        settingsApolloClientImpl$getCreditAutoPayStatus$1 = new com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getCreditAutoPayStatus$1(this, continuation);
        java.lang.Object obj2 = settingsApolloClientImpl$getCreditAutoPayStatus$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsApolloClientImpl$getCreditAutoPayStatus$1.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCashBackCardAutoPayStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getCashBackCardAutoPayStatus$1 settingsApolloClientImpl$getCashBackCardAutoPayStatus$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getCashBackCardAutoPayStatus$1) {
                settingsApolloClientImpl$getCashBackCardAutoPayStatus$1 = (com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getCashBackCardAutoPayStatus$1) continuation;
                if ((settingsApolloClientImpl$getCashBackCardAutoPayStatus$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    settingsApolloClientImpl$getCashBackCardAutoPayStatus$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = settingsApolloClientImpl$getCashBackCardAutoPayStatus$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = settingsApolloClientImpl$getCashBackCardAutoPayStatus$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayInput revolvingCreditAutopayInput = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAutopayInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, null, 2, null);
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.query(new com.paypal.oslo.feature.settings.graphql.AutopayStatusQuery(revolvingCreditAutopayInput)), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        settingsApolloClientImpl$getCashBackCardAutoPayStatus$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(revolvingCreditAutopayInput);
                        settingsApolloClientImpl$getCashBackCardAutoPayStatus$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = apolloCall.execute(settingsApolloClientImpl$getCashBackCardAutoPayStatus$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImplKt.access$mapToCreditOrCashBackCardAutoPay((com.apollographql.apollo.api.ApolloResponse) obj);
                }
            }
            if (i != 0) {
            }
            return com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImplKt.access$mapToCreditOrCashBackCardAutoPay((com.apollographql.apollo.api.ApolloResponse) obj);
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            com.paypal.oslo.feature.settings.LoggerKt.log.e("SettingsApolloClient Error fetching getCashBackCardAutoPayStatus", kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), e);
            return null;
        }
        settingsApolloClientImpl$getCashBackCardAutoPayStatus$1 = new com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getCashBackCardAutoPayStatus$1(this, continuation);
        java.lang.Object obj2 = settingsApolloClientImpl$getCashBackCardAutoPayStatus$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsApolloClientImpl$getCashBackCardAutoPayStatus$1.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPrepaidStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getPrepaidStatus$1 settingsApolloClientImpl$getPrepaidStatus$1;
        int i;
        com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Data data;
        com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Balances balances;
        try {
            if (continuation instanceof com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getPrepaidStatus$1) {
                settingsApolloClientImpl$getPrepaidStatus$1 = (com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getPrepaidStatus$1) continuation;
                if ((settingsApolloClientImpl$getPrepaidStatus$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    settingsApolloClientImpl$getPrepaidStatus$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = settingsApolloClientImpl$getPrepaidStatus$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = settingsApolloClientImpl$getPrepaidStatus$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.query(new com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly);
                        settingsApolloClientImpl$getPrepaidStatus$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = apolloCall.execute(settingsApolloClientImpl$getPrepaidStatus$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    data = (com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Data) ((com.apollographql.apollo.api.ApolloResponse) obj).data;
                    if (data != null || (balances = data.getBalances()) == null) {
                        return null;
                    }
                    return balances.getPrepaidStatus();
                }
            }
            if (i != 0) {
            }
            data = (com.paypal.oslo.feature.settings.graphql.GetSettingsPrepaidStatusQuery.Data) ((com.apollographql.apollo.api.ApolloResponse) obj).data;
            if (data != null) {
            }
            return null;
        } catch (com.apollographql.apollo.exception.ApolloException e) {
            com.paypal.oslo.feature.settings.LoggerKt.log.e("SettingsApolloClient Error fetching getPrepaidStatus", kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), e);
            return null;
        }
        settingsApolloClientImpl$getPrepaidStatus$1 = new com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getPrepaidStatus$1(this, continuation);
        java.lang.Object obj2 = settingsApolloClientImpl$getPrepaidStatus$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsApolloClientImpl$getPrepaidStatus$1.getHighResolutionOutputSizeshNQ4ISI;
    }
}
