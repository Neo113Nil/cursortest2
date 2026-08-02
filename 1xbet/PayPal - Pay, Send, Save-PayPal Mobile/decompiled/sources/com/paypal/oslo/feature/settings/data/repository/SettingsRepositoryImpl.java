package com.paypal.oslo.feature.settings.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0011H\u0016¢\u0006\u0004\b#\u0010\u0015J\u0017\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0011H\u0016¢\u0006\u0004\b$\u0010\u0015J\u0017\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0011H\u0016¢\u0006\u0004\b%\u0010\u0015J\u0017\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0011H\u0016¢\u0006\u0004\b&\u0010\u0015J\u0017\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0011H\u0016¢\u0006\u0004\b'\u0010\u0015J\u0017\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0011H\u0016¢\u0006\u0004\b(\u0010\u0015J\u0017\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0011H\u0016¢\u0006\u0004\b)\u0010\u0015J\u0012\u0010+\u001a\u0004\u0018\u00010*H\u0096@¢\u0006\u0004\b+\u0010\u0010J\u001b\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020*0\u0012H\u0016¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020*0\u0012H\u0016¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010*H\u0096@¢\u0006\u0004\b/\u0010\u0010J\u0010\u00100\u001a\u00020*H\u0096@¢\u0006\u0004\b0\u0010\u0010J\u0010\u00101\u001a\u00020*H\u0096@¢\u0006\u0004\b1\u0010\u0010R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u00104\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;"}, d2 = {"Lcom/paypal/oslo/feature/settings/data/repository/SettingsRepositoryImpl;", "Lcom/paypal/oslo/feature/settings/domain/repository/ISettingsRepository;", "Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;", "apolloClient", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/identity/api/IdentityManagement;", "identityManagement", "Lcom/paypal/oslo/feature/consumerprivacy/api/data/IAccountVisibilityLabelProvider;", "accountVisibilityLabelProvider", "<init>", "(Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/identity/api/IdentityManagement;Lcom/paypal/oslo/feature/consumerprivacy/api/data/IAccountVisibilityLabelProvider;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsResult;", "getSettingsResult", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/domain/model/AccountSettingsData;", "getAccountSettingsFromUserState", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/settings/domain/model/DataAndPrivacySettingsData;", "getDataAndPrivacySettings", "()Lcom/paypal/oslo/feature/settings/domain/model/DataAndPrivacySettingsData;", "Lcom/paypal/oslo/feature/settings/domain/model/HelpAndSupportSettingsData;", "getHelpAndSupportSettings", "()Lcom/paypal/oslo/feature/settings/domain/model/HelpAndSupportSettingsData;", "Lcom/paypal/oslo/feature/settings/domain/model/NotificationPreferencesSettingsData;", "getNotificationPreferencesSettings", "()Lcom/paypal/oslo/feature/settings/domain/model/NotificationPreferencesSettingsData;", "Lcom/paypal/oslo/feature/settings/domain/model/PaymentPreferencesSettingsData;", "getPaymentPreferencesSettingsData", "()Lcom/paypal/oslo/feature/settings/domain/model/PaymentPreferencesSettingsData;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus;", "getIsAutoReloadEnabledBadge", "getIsSmartRouteEnabledBadge", "getAutoSaveStatusBadge", "getCreditCardStatusBadge", "getCashBackCardStatusBadge", "getAccountVisibilityStatusFlow", "getPasskeyStatusFlow", "", "isPayPalBalanceEnabled", "isBiometricEnabled", "()Larrow/core/Either;", "isLLSEnabled", "getAccountDiscoverabilityStatus", "isPrimaryUser", "hasPasskeys", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/settings/data/apollo/ISettingsApolloClient;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/api/IdentityManagement;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/consumerprivacy/api/data/IAccountVisibilityLabelProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsRepositoryImpl implements com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.paypal.oslo.feature.settings.domain.model.SettingsResult getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.api.IdentityManagement Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SettingsRepositoryImpl(com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.identity.api.IdentityManagement identityManagement, com.paypal.oslo.feature.consumerprivacy.api.data.IAccountVisibilityLabelProvider iAccountVisibilityLabelProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iSettingsApolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityManagement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iAccountVisibilityLabelProvider, "");
        this.getHighSpeedVideoFpsRanges = iSettingsApolloClient;
        this.getHighSpeedVideoSizes = userStore;
        this.Camera2StreamConfigurationMap = identityManagement;
        this.getHighResolutionOutputSizeshNQ4ISI = iAccountVisibilityLabelProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSettingsResult(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsResult>> continuation) {
        com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getSettingsResult$1 settingsRepositoryImpl$getSettingsResult$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getSettingsResult$1) {
            settingsRepositoryImpl$getSettingsResult$1 = (com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getSettingsResult$1) continuation;
            if ((settingsRepositoryImpl$getSettingsResult$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                settingsRepositoryImpl$getSettingsResult$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = settingsRepositoryImpl$getSettingsResult$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = settingsRepositoryImpl$getSettingsResult$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient = this.getHighSpeedVideoFpsRanges;
                    settingsRepositoryImpl$getSettingsResult$1.getHighSpeedVideoFpsRanges = 1;
                    obj = iSettingsApolloClient.getSettings(settingsRepositoryImpl$getSettingsResult$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.settings.domain.model.SettingsResult mapToSettingsResult = com.paypal.oslo.feature.settings.data.util.ResponseMappersKt.mapToSettingsResult((com.paypal.oslo.feature.settings.data.model.SettingsMockResponse) obj);
                this.getHighSpeedVideoFpsRangesFor = mapToSettingsResult;
                return arrow.core.IorKt.rightIor(mapToSettingsResult);
            }
        }
        settingsRepositoryImpl$getSettingsResult$1 = new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getSettingsResult$1(this, continuation);
        java.lang.Object obj2 = settingsRepositoryImpl$getSettingsResult$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsRepositoryImpl$getSettingsResult$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.paypal.oslo.feature.settings.domain.model.SettingsResult mapToSettingsResult2 = com.paypal.oslo.feature.settings.data.util.ResponseMappersKt.mapToSettingsResult((com.paypal.oslo.feature.settings.data.model.SettingsMockResponse) obj2);
        this.getHighSpeedVideoFpsRangesFor = mapToSettingsResult2;
        return arrow.core.IorKt.rightIor(mapToSettingsResult2);
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.AccountSettingsData>> getAccountSettingsFromUserState() {
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = this.getHighSpeedVideoSizes.getUserState();
        return (kotlinx.coroutines.flow.Flow) new kotlinx.coroutines.flow.Flow<arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError.UserStoreError, ? extends com.paypal.oslo.feature.settings.domain.model.AccountSettingsData>>() { // from class: com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getAccountSettingsFromUserState$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getAccountSettingsFromUserState$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getAccountSettingsFromUserState$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
                    java.lang.String surname;
                    com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName2;
                    com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName3;
                    java.lang.String givenName;
                    com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName4;
                    com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName5;
                    java.lang.String fullName;
                    com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName6;
                    if (continuation instanceof com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getAccountSettingsFromUserState$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getAccountSettingsFromUserState$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputFormats -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) obj;
                                java.lang.Object obj3 = null;
                                if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                                    com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState;
                                    com.paypal.oslo.feature.settings.domain.model.AccountSettingsData accountSettingsData = com.paypal.oslo.feature.settings.domain.mapper.accountsettings.UserToAccountSettingsDataMapperKt.toAccountSettingsData(profileLoaded.getUser());
                                    if (kotlin.text.StringsKt.isBlank(accountSettingsData.getProfileName().getValue())) {
                                        java.lang.String fullName2 = profileLoaded.getUser().getFullName();
                                        com.paypal.oslo.core.userstore.model.ProfileName legalName = profileLoaded.getUser().getLegalName();
                                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
                                        com.paypal.oslo.feature.controlcenter.api.observability.UserJourney profileLoading = com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getProfileLoading();
                                        kotlin.Pair[] pairArr = new kotlin.Pair[11];
                                        pairArr[0] = kotlin.TuplesKt.to("legal_name_null", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(legalName == null));
                                        pairArr[1] = kotlin.TuplesKt.to("legal_name_full_name_null", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((legalName == null || (personName6 = legalName.getPersonName()) == null) ? null : personName6.getFullName()) == null));
                                        pairArr[2] = kotlin.TuplesKt.to("legal_name_full_name_blank", kotlin.coroutines.jvm.internal.Boxing.boxBoolean((legalName == null || (personName5 = legalName.getPersonName()) == null || (fullName = personName5.getFullName()) == null) ? false : kotlin.text.StringsKt.isBlank(fullName)));
                                        pairArr[3] = kotlin.TuplesKt.to("legal_name_given_name_null", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((legalName == null || (personName4 = legalName.getPersonName()) == null) ? null : personName4.getGivenName()) == null));
                                        pairArr[4] = kotlin.TuplesKt.to("legal_name_given_name_blank", kotlin.coroutines.jvm.internal.Boxing.boxBoolean((legalName == null || (personName3 = legalName.getPersonName()) == null || (givenName = personName3.getGivenName()) == null) ? false : kotlin.text.StringsKt.isBlank(givenName)));
                                        if (legalName != null && (personName2 = legalName.getPersonName()) != null) {
                                            obj3 = personName2.getSurname();
                                        }
                                        pairArr[5] = kotlin.TuplesKt.to("legal_name_surname_null", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(obj3 == null));
                                        pairArr[6] = kotlin.TuplesKt.to("legal_name_surname_blank", kotlin.coroutines.jvm.internal.Boxing.boxBoolean((legalName == null || (personName = legalName.getPersonName()) == null || (surname = personName.getSurname()) == null) ? false : kotlin.text.StringsKt.isBlank(surname)));
                                        pairArr[7] = kotlin.TuplesKt.to("full_name_null", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(fullName2 == null));
                                        pairArr[8] = kotlin.TuplesKt.to("full_name_blank", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(fullName2 != null ? kotlin.text.StringsKt.isBlank(fullName2) : false));
                                        pairArr[9] = kotlin.TuplesKt.to("raw_person_name_null", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(accountSettingsData.getRawPersonName() == null));
                                        pairArr[10] = kotlin.TuplesKt.to("profile_name_value_length", kotlin.coroutines.jvm.internal.Boxing.boxInt(accountSettingsData.getProfileName().getValue().length()));
                                        com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(logger, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(profileLoading, "UserStore profile name is blank after mapping", "userstore_name_blank", kotlin.collections.MapsKt.mapOf(pairArr), null, 8, null));
                                    }
                                    obj3 = arrow.core.EitherKt.right(accountSettingsData);
                                } else if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError) {
                                    com.paypal.oslo.core.userstore.model.UserState.ProfileError profileError = (com.paypal.oslo.core.userstore.model.UserState.ProfileError) userState;
                                    com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.android.logger.categories.Data.SyncError.INSTANCE, "Failed to load user profile for account settings", null, null, profileError.getCause(), 12, null);
                                    obj3 = arrow.core.EitherKt.left(new com.paypal.oslo.feature.settings.domain.error.SettingsError.UserStoreError(profileError.getCause()));
                                }
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.Camera2StreamConfigurationMap = 0;
                                anonymousClass1.getInputFormats = 1;
                                if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj5 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getAccountSettingsFromUserState$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getAccountSettingsFromUserState$$inlined$map$1$2", f = "SettingsRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getAccountSettingsFromUserState$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getInputFormats;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getInputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getAccountSettingsFromUserState$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError.UserStoreError, ? extends com.paypal.oslo.feature.settings.domain.model.AccountSettingsData>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getAccountSettingsFromUserState$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final com.paypal.oslo.feature.settings.domain.model.DataAndPrivacySettingsData getDataAndPrivacySettings() {
        com.paypal.oslo.feature.settings.domain.model.SettingsResult settingsResult = this.getHighSpeedVideoFpsRangesFor;
        if (settingsResult != null) {
            return settingsResult.getDataAndPrivacySettingsData();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final com.paypal.oslo.feature.settings.domain.model.HelpAndSupportSettingsData getHelpAndSupportSettings() {
        com.paypal.oslo.feature.settings.domain.model.SettingsResult settingsResult = this.getHighSpeedVideoFpsRangesFor;
        if (settingsResult != null) {
            return settingsResult.getHelpAndSupportSettingsData();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final com.paypal.oslo.feature.settings.domain.model.NotificationPreferencesSettingsData getNotificationPreferencesSettings() {
        com.paypal.oslo.feature.settings.domain.model.SettingsResult settingsResult = this.getHighSpeedVideoFpsRangesFor;
        if (settingsResult != null) {
            return settingsResult.getNotificationPreferencesSettingsData();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final com.paypal.oslo.feature.settings.domain.model.PaymentPreferencesSettingsData getPaymentPreferencesSettingsData() {
        com.paypal.oslo.feature.settings.domain.model.SettingsResult settingsResult = this.getHighSpeedVideoFpsRangesFor;
        if (settingsResult != null) {
            return settingsResult.getPaymentPreferencesSettingsData();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getIsAutoReloadEnabledBadge() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$executeStatusRequest$1(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getIsAutoReloadEnabledBadge$1(this, null), com.paypal.oslo.feature.settings.domain.model.BadgeType.Warning, null));
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getIsSmartRouteEnabledBadge() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$executeStatusRequest$1(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getIsSmartRouteEnabledBadge$1(this, null), com.paypal.oslo.feature.settings.domain.model.BadgeType.Warning, null));
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getAutoSaveStatusBadge() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$executeStatusRequest$1(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getAutoSaveStatusBadge$1(this, null), com.paypal.oslo.feature.settings.domain.model.BadgeType.Warning, null));
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getCreditCardStatusBadge() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$executeStatusRequest$1(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getCreditCardStatusBadge$1(this, null), com.paypal.oslo.feature.settings.domain.model.BadgeType.Warning, null));
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getCashBackCardStatusBadge() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$executeStatusRequest$1(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getCashBackCardStatusBadge$1(this, null), com.paypal.oslo.feature.settings.domain.model.BadgeType.Warning, null));
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getAccountVisibilityStatusFlow() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$executeStatusRequest$1(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getAccountVisibilityStatusFlow$1(this, null), com.paypal.oslo.feature.settings.domain.model.BadgeType.Negative, null));
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> getPasskeyStatusFlow() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$executeStatusRequest$1(new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$getPasskeyStatusFlow$1(this, null), com.paypal.oslo.feature.settings.domain.model.BadgeType.Negative, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isPayPalBalanceEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$isPayPalBalanceEnabled$1 settingsRepositoryImpl$isPayPalBalanceEnabled$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$isPayPalBalanceEnabled$1) {
                settingsRepositoryImpl$isPayPalBalanceEnabled$1 = (com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$isPayPalBalanceEnabled$1) continuation;
                if ((settingsRepositoryImpl$isPayPalBalanceEnabled$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    settingsRepositoryImpl$isPayPalBalanceEnabled$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = settingsRepositoryImpl$isPayPalBalanceEnabled$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = settingsRepositoryImpl$isPayPalBalanceEnabled$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient iSettingsApolloClient = this.getHighSpeedVideoFpsRanges;
                        settingsRepositoryImpl$isPayPalBalanceEnabled$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = iSettingsApolloClient.getPrepaidStatus(settingsRepositoryImpl$isPayPalBalanceEnabled$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (java.lang.Boolean) obj;
                }
            }
            if (i != 0) {
            }
            return (java.lang.Boolean) obj;
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.settings.LoggerKt.log.e("Failed to fetch prepaid status", e);
            return null;
        }
        settingsRepositoryImpl$isPayPalBalanceEnabled$1 = new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$isPayPalBalanceEnabled$1(this, continuation);
        java.lang.Object obj2 = settingsRepositoryImpl$isPayPalBalanceEnabled$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = settingsRepositoryImpl$isPayPalBalanceEnabled$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, java.lang.Boolean> isBiometricEnabled() {
        arrow.core.Either<com.paypal.oslo.feature.identity.api.model.IdentityManagementError, java.lang.Boolean> isEnabled = this.Camera2StreamConfigurationMap.isEnabled(com.paypal.oslo.feature.identity.api.AuthenticationMethod.BIOMETRIC, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("settings", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        if (isEnabled.isRight()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Biometric status check successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("enabled", java.lang.Boolean.valueOf(((java.lang.Boolean) ((arrow.core.Either.Right) isEnabled).getValue()).booleanValue()))), null, 4, null);
        }
        if (isEnabled instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.api.model.IdentityManagementError identityManagementError = (com.paypal.oslo.feature.identity.api.model.IdentityManagementError) ((arrow.core.Either.Left) isEnabled).getValue();
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Failed to check biometric status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(identityManagementError.getClass()).getSimpleName())), null, identityManagementError instanceof java.lang.Throwable ? (java.lang.Throwable) identityManagementError : null, 4, null);
            return new arrow.core.Either.Left(new com.paypal.oslo.feature.settings.domain.error.SettingsError.BiometricError(identityManagementError));
        }
        if (isEnabled instanceof arrow.core.Either.Right) {
            return new arrow.core.Either.Right(((arrow.core.Either.Right) isEnabled).getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, java.lang.Boolean> isLLSEnabled() {
        arrow.core.Either<com.paypal.oslo.feature.identity.api.model.IdentityManagementError, java.lang.Boolean> isEnabled = this.Camera2StreamConfigurationMap.isEnabled(com.paypal.oslo.feature.identity.api.AuthenticationMethod.LLS, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("settings", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        if (isEnabled.isRight()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "LLS status check successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("enabled", java.lang.Boolean.valueOf(((java.lang.Boolean) ((arrow.core.Either.Right) isEnabled).getValue()).booleanValue()))), null, 4, null);
        }
        if (isEnabled instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.api.model.IdentityManagementError identityManagementError = (com.paypal.oslo.feature.identity.api.model.IdentityManagementError) ((arrow.core.Either.Left) isEnabled).getValue();
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Failed to check LLS status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(identityManagementError.getClass()).getSimpleName())), null, identityManagementError instanceof java.lang.Throwable ? (java.lang.Throwable) identityManagementError : null, 4, null);
            return new arrow.core.Either.Left(new com.paypal.oslo.feature.settings.domain.error.SettingsError.LLSError(identityManagementError));
        }
        if (isEnabled instanceof arrow.core.Either.Right) {
            return new arrow.core.Either.Right(((arrow.core.Either.Right) isEnabled).getValue());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final java.lang.Object getAccountDiscoverabilityStatus(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.isAccountDiscoverable(continuation);
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final java.lang.Object isPrimaryUser(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.Camera2StreamConfigurationMap.isPrimaryUser(continuation);
    }

    @Override // com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository
    public final java.lang.Object hasPasskeys(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.Camera2StreamConfigurationMap.hasPasskeys(continuation);
    }
}
