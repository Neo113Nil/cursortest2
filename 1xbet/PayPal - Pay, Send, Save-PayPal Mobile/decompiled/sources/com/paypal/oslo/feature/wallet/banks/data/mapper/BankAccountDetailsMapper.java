package com.paypal.oslo.feature.wallet.banks.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u000e\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u000e\u0010\u001aJ\u0013\u0010\u0016\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u0016\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\u000e\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b\u000e\u0010$J\u0013\u0010'\u001a\u00020&*\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010'\u001a\u00020**\u00020)H\u0002¢\u0006\u0004\b'\u0010+J\u0013\u0010 \u001a\u00020-*\u00020,H\u0002¢\u0006\u0004\b \u0010.J\u0013\u0010\u000e\u001a\u000200*\u00020/H\u0002¢\u0006\u0004\b\u000e\u00101"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/data/mapper/BankAccountDetailsMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$BankAccount;", "graphQLBankAccount", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "toDomain", "(Lcom/paypal/oslo/feature/wallet/graphql/GetBankAccountQuery$BankAccount;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "Lcom/paypal/oslo/feature/wallet/graphql/AddBankAccountMutation$BankAccount;", "toDomain$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/graphql/AddBankAccountMutation$BankAccount;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountType;)Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAvailableAction;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAvailableAction;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAvailableAction;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountAvailableAction;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationMethod;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationMethod;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationMethod;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationMethod;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountRealTimePaymentsDepositStatus;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/RealTimePaymentsDepositStatus;", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountRealTimePaymentsDepositStatus;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/RealTimePaymentsDepositStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationStatus;", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationStatus;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationState;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountConfirmationState;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/ConfirmationState;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/StatusValue;", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountStatus;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/StatusValue;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationMethod;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/AuthorizationMethod;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationMethod;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/AuthorizationMethod;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationStatus;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/AuthorizationStatus;", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountAuthorizationStatus;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/AuthorizationStatus;", "Lcom/paypal/oslo/api/graphql/schema/type/BankAccountOnboardingEntity;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;", "(Lcom/paypal/oslo/api/graphql/schema/type/BankAccountOnboardingEntity;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountOnboardingEntity;", "Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImageCategory;", "(Lcom/paypal/oslo/api/graphql/schema/type/InstitutionImageCategory;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstitutionImageCategory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankAccountDetailsMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public BankAccountDetailsMapper() {
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails toDomain(com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.BankAccount graphQLBankAccount) {
        java.util.ArrayList emptyList;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation bankAccountConfirmation;
        java.util.ArrayList emptyList2;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus bankAccountStatus;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization bankAccountAuthorization;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod authorizationMethod;
        com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus realTimePaymentsDepositStatus;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState confirmationState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLBankAccount, "");
        java.lang.String id = graphQLBankAccount.getId();
        java.lang.String lastNChars = graphQLBankAccount.getLastNChars();
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(graphQLBankAccount.getType());
        java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction> availableActions = graphQLBankAccount.getAvailableActions();
        if (availableActions == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = availableActions.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction) it.next());
                if (highSpeedVideoFpsRangesFor != null) {
                    arrayList.add(highSpeedVideoFpsRangesFor);
                }
            }
            emptyList = arrayList;
        }
        java.lang.String valueOf = java.lang.String.valueOf(graphQLBankAccount.getCurrencyCode());
        com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Confirmation confirmation = graphQLBankAccount.getConfirmation();
        if (confirmation != null) {
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod method = confirmation.getMethod();
            com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod highResolutionOutputSizeshNQ4ISI = method != null ? getHighResolutionOutputSizeshNQ4ISI(method) : null;
            com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus realTimePaymentsDepositStatus2 = confirmation.getRealTimePaymentsDepositStatus();
            if (realTimePaymentsDepositStatus2 == null || (realTimePaymentsDepositStatus = Camera2StreamConfigurationMap(realTimePaymentsDepositStatus2)) == null) {
                realTimePaymentsDepositStatus = com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.UNKNOWN;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus realTimePaymentsDepositStatus3 = realTimePaymentsDepositStatus;
            com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(confirmation.getStatus());
            java.lang.Object initiationTime = confirmation.getInitiationTime();
            java.lang.String obj = initiationTime != null ? initiationTime.toString() : null;
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState state = confirmation.getState();
            if (state == null || (confirmationState = getHighSpeedVideoFpsRanges(state)) == null) {
                confirmationState = com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.UNKNOWN;
            }
            bankAccountConfirmation = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation(highResolutionOutputSizeshNQ4ISI, realTimePaymentsDepositStatus3, highResolutionOutputSizeshNQ4ISI2, obj, confirmationState);
        } else {
            bankAccountConfirmation = null;
        }
        boolean isSepaCompliant = graphQLBankAccount.isSepaCompliant();
        com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Issuer issuer = graphQLBankAccount.getIssuer();
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer bankAccountIssuer = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer(issuer.getCountryCode().toString(), issuer.getName());
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage> institutionImages = graphQLBankAccount.getInstitutionImages();
        if (institutionImages == null) {
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage> list = institutionImages;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.InstitutionImage institutionImage : list) {
                arrayList2.add(new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage(java.lang.String.valueOf(institutionImage.getUrl()), institutionImage.getMimeType(), institutionImage.getWidth(), institutionImage.getHeight(), Camera2StreamConfigurationMap(institutionImage.getCategory())));
            }
            emptyList2 = arrayList2;
        }
        java.lang.String nickname = graphQLBankAccount.getNickname();
        com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity onboardingEntity = graphQLBankAccount.getOnboardingEntity();
        if (onboardingEntity == null || (bankAccountOnboardingEntity = getHighSpeedVideoFpsRanges(onboardingEntity)) == null) {
            bankAccountOnboardingEntity = com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.UNKNOWN;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity2 = bankAccountOnboardingEntity;
        com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Status status = graphQLBankAccount.getStatus();
        if (status == null) {
            bankAccountStatus = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus(null, com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.UNKNOWN);
        } else {
            bankAccountStatus = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus(status.getReason(), Camera2StreamConfigurationMap(status.getValue()));
        }
        com.paypal.oslo.feature.wallet.graphql.GetBankAccountQuery.Authorization authorization = graphQLBankAccount.getAuthorization();
        if (authorization == null) {
            bankAccountAuthorization = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization(com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.UNKNOWN, com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.UNKNOWN);
        } else {
            com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod method2 = authorization.getMethod();
            if (method2 == null || (authorizationMethod = getHighSpeedVideoSizes(method2)) == null) {
                authorizationMethod = com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.UNKNOWN;
            }
            bankAccountAuthorization = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization(authorizationMethod, getHighSpeedVideoSizes(authorization.getStatus()));
        }
        return new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails(id, lastNChars, Camera2StreamConfigurationMap, emptyList, valueOf, bankAccountConfirmation, isSepaCompliant, bankAccountIssuer, emptyList2, nickname, bankAccountOnboardingEntity2, bankAccountStatus, bankAccountAuthorization);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails toDomain$wallet_prodRelease(com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.BankAccount graphQLBankAccount) {
        java.util.ArrayList emptyList;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation bankAccountConfirmation;
        java.util.ArrayList emptyList2;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus bankAccountStatus;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization bankAccountAuthorization;
        com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod authorizationMethod;
        com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus realTimePaymentsDepositStatus;
        com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState confirmationState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLBankAccount, "");
        java.lang.String id = graphQLBankAccount.getId();
        java.lang.String lastNChars = graphQLBankAccount.getLastNChars();
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(graphQLBankAccount.getType());
        java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction> availableActions = graphQLBankAccount.getAvailableActions();
        if (availableActions == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = availableActions.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction) it.next());
                if (highSpeedVideoFpsRangesFor != null) {
                    arrayList.add(highSpeedVideoFpsRangesFor);
                }
            }
            emptyList = arrayList;
        }
        java.lang.String valueOf = java.lang.String.valueOf(graphQLBankAccount.getCurrencyCode());
        com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.Confirmation confirmation = graphQLBankAccount.getConfirmation();
        if (confirmation != null) {
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod method = confirmation.getMethod();
            com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod highResolutionOutputSizeshNQ4ISI = method != null ? getHighResolutionOutputSizeshNQ4ISI(method) : null;
            com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus realTimePaymentsDepositStatus2 = confirmation.getRealTimePaymentsDepositStatus();
            if (realTimePaymentsDepositStatus2 == null || (realTimePaymentsDepositStatus = Camera2StreamConfigurationMap(realTimePaymentsDepositStatus2)) == null) {
                realTimePaymentsDepositStatus = com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.UNKNOWN;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus realTimePaymentsDepositStatus3 = realTimePaymentsDepositStatus;
            com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(confirmation.getStatus());
            java.lang.Object initiationTime = confirmation.getInitiationTime();
            java.lang.String obj = initiationTime != null ? initiationTime.toString() : null;
            com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState state = confirmation.getState();
            if (state == null || (confirmationState = getHighSpeedVideoFpsRanges(state)) == null) {
                confirmationState = com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.UNKNOWN;
            }
            bankAccountConfirmation = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmation(highResolutionOutputSizeshNQ4ISI, realTimePaymentsDepositStatus3, highResolutionOutputSizeshNQ4ISI2, obj, confirmationState);
        } else {
            bankAccountConfirmation = null;
        }
        boolean isSepaCompliant = graphQLBankAccount.isSepaCompliant();
        com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.Issuer issuer = graphQLBankAccount.getIssuer();
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer bankAccountIssuer = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountIssuer(issuer.getCountryCode().toString(), issuer.getName());
        java.util.List<com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.InstitutionImage> institutionImages = graphQLBankAccount.getInstitutionImages();
        if (institutionImages == null) {
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.InstitutionImage> list = institutionImages;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.InstitutionImage institutionImage : list) {
                arrayList2.add(new com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImage(java.lang.String.valueOf(institutionImage.getUrl()), institutionImage.getMimeType(), institutionImage.getWidth(), institutionImage.getHeight(), Camera2StreamConfigurationMap(institutionImage.getCategory())));
            }
            emptyList2 = arrayList2;
        }
        java.lang.String nickname = graphQLBankAccount.getNickname();
        com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity onboardingEntity = graphQLBankAccount.getOnboardingEntity();
        if (onboardingEntity == null || (bankAccountOnboardingEntity = getHighSpeedVideoFpsRanges(onboardingEntity)) == null) {
            bankAccountOnboardingEntity = com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.UNKNOWN;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity bankAccountOnboardingEntity2 = bankAccountOnboardingEntity;
        com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.Status status = graphQLBankAccount.getStatus();
        if (status == null) {
            bankAccountStatus = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus(null, com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.UNKNOWN);
        } else {
            bankAccountStatus = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountStatus(status.getReason(), Camera2StreamConfigurationMap(status.getValue()));
        }
        com.paypal.oslo.feature.wallet.graphql.AddBankAccountMutation.Authorization authorization = graphQLBankAccount.getAuthorization();
        if (authorization == null) {
            bankAccountAuthorization = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization(com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.UNKNOWN, com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.UNKNOWN);
        } else {
            com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod method2 = authorization.getMethod();
            if (method2 == null || (authorizationMethod = getHighSpeedVideoSizes(method2)) == null) {
                authorizationMethod = com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.UNKNOWN;
            }
            bankAccountAuthorization = new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAuthorization(authorizationMethod, getHighSpeedVideoSizes(authorization.getStatus()));
        }
        return new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails(id, lastNChars, Camera2StreamConfigurationMap, emptyList, valueOf, bankAccountConfirmation, isSepaCompliant, bankAccountIssuer, emptyList2, nickname, bankAccountOnboardingEntity2, bankAccountStatus, bankAccountAuthorization);
    }

    private static com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType Camera2StreamConfigurationMap(com.paypal.oslo.api.graphql.schema.type.BankAccountType bankAccountType) {
        int i = com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper.WhenMappings.$EnumSwitchMapping$0[bankAccountType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.SAVINGS;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Unmapped BankAccountType encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("graphqlType", bankAccountType.toString())), null, 4, null);
        return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.UNKNOWN;
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction getHighSpeedVideoFpsRangesFor(com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction bankAccountAvailableAction) {
        switch (com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper.WhenMappings.$EnumSwitchMapping$1[bankAccountAvailableAction.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.INITIATE_PAYPAL_CODE_CONFIRMATION;
            case 2:
                return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION;
            case 3:
                return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.COMPLETE_PAYPAL_CODE_CONFIRMATION;
            case 4:
                return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION;
            case 5:
                return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA;
            case 6:
                return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION;
            case 7:
                return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA;
            case 8:
                return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION;
            case 9:
                return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION;
            case 10:
                return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountAvailableAction.COMPLETE_INSTANT_CONFIRMATION;
            case 11:
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Unknown BankAccountAvailableAction encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("graphqlAction", bankAccountAvailableAction.toString())), null, 4, null);
                return null;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod bankAccountConfirmationMethod) {
        int i = com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper.WhenMappings.$EnumSwitchMapping$2[bankAccountConfirmationMethod.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod.INSTANT_CONFIRMATION;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod.PAYPAL_CODE_CONFIRMATION;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod.TWO_DEPOSIT_CONFIRMATION;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Unmapped BankAccountConfirmationMethod encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("graphqlMethod", bankAccountConfirmationMethod.toString())), null, 4, null);
        return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationMethod.UNKNOWN;
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus Camera2StreamConfigurationMap(com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus bankAccountRealTimePaymentsDepositStatus) {
        int i = com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper.WhenMappings.$EnumSwitchMapping$3[bankAccountRealTimePaymentsDepositStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.SUCCESS;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.ACCEPTED;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.REQUESTED;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.ERROR;
        }
        if (i == 5) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.DECLINE;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Unmapped RealTimePaymentsDepositStatus encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("graphqlStatus", bankAccountRealTimePaymentsDepositStatus.toString())), null, 4, null);
        return com.paypal.oslo.feature.wallet.banks.domain.model.RealTimePaymentsDepositStatus.UNKNOWN;
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus bankAccountConfirmationStatus) {
        switch (com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper.WhenMappings.$EnumSwitchMapping$4[bankAccountConfirmationStatus.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.CONFIRMED;
            case 2:
                return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.UNCONFIRMED;
            case 3:
                return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.BLOCKED;
            case 4:
                return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.FAILED;
            case 5:
                return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.NOT_APPLICABLE;
            case 6:
                return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.NOT_SUPPORTED;
            default:
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Unmapped BankAccountConfirmationStatus encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("graphqlStatus", bankAccountConfirmationStatus.toString())), null, 4, null);
                return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationStatus.UNKNOWN;
        }
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState getHighSpeedVideoFpsRanges(com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState bankAccountConfirmationState) {
        int i = com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper.WhenMappings.$EnumSwitchMapping$5[bankAccountConfirmationState.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.INITIATED;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.INITIATION_PENDING;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.BYPASS_CONFIRMED;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.NEEDS_REINITIATION;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Unmapped BankAccountConfirmationState encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("graphqlState", bankAccountConfirmationState.toString())), null, 4, null);
        return com.paypal.oslo.feature.wallet.banks.domain.model.ConfirmationState.UNKNOWN;
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue Camera2StreamConfigurationMap(com.paypal.oslo.api.graphql.schema.type.BankAccountStatus bankAccountStatus) {
        switch (com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper.WhenMappings.$EnumSwitchMapping$6[bankAccountStatus.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.ACTIVE;
            case 2:
                return com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.BLOCKED;
            case 3:
                return com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.CLOSED;
            case 4:
                return com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.INACTIVE;
            case 5:
                return com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.ON_HOLD;
            case 6:
                return com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.NOT_CREATED;
            case 7:
                return com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.REMOVED;
            default:
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Unmapped BankAccountStatus encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("graphqlValue", bankAccountStatus.toString())), null, 4, null);
                return com.paypal.oslo.feature.wallet.banks.domain.model.StatusValue.UNKNOWN;
        }
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod getHighSpeedVideoSizes(com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod bankAccountAuthorizationMethod) {
        switch (com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper.WhenMappings.$EnumSwitchMapping$7[bankAccountAuthorizationMethod.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.ELECTRONIC_MANDATE;
            case 2:
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.MANUAL_MANDATE;
            case 3:
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.PAYPAL_AGREEMENT;
            case 4:
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.PAYPAL_HELD_ELV_MANDATE;
            case 5:
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.PAYPAL_HELD_SEPA_MANDATE;
            case 6:
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.ONLINE_MANDATE;
            default:
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Unmapped BankAccountAuthorizationMethod encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("graphqlMethod", bankAccountAuthorizationMethod.toString())), null, 4, null);
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationMethod.UNKNOWN;
        }
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus getHighSpeedVideoSizes(com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus bankAccountAuthorizationStatus) {
        switch (com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper.WhenMappings.$EnumSwitchMapping$8[bankAccountAuthorizationStatus.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.AUTHORIZED;
            case 2:
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.BLOCKED;
            case 3:
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.FAILED;
            case 4:
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.NOT_APPLICABLE;
            case 5:
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.NOT_SUPPORTED;
            case 6:
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.UNAUTHORIZED;
            default:
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Unmapped BankAccountAuthorizationStatus encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("graphqlStatus", bankAccountAuthorizationStatus.toString())), null, 4, null);
                return com.paypal.oslo.feature.wallet.banks.domain.model.AuthorizationStatus.UNKNOWN;
        }
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity getHighSpeedVideoFpsRanges(com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity bankAccountOnboardingEntity) {
        int i = com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper.WhenMappings.$EnumSwitchMapping$9[bankAccountOnboardingEntity.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.EBAY;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.PAYPAL;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.VENMO;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.BRAINTREE;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Unmapped BankAccountOnboardingEntity encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("graphqlEntity", bankAccountOnboardingEntity.toString())), null, 4, null);
        return com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountOnboardingEntity.UNKNOWN;
    }

    private static com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory Camera2StreamConfigurationMap(com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory institutionImageCategory) {
        switch (com.paypal.oslo.feature.wallet.banks.data.mapper.BankAccountDetailsMapper.WhenMappings.$EnumSwitchMapping$10[institutionImageCategory.ordinal()]) {
            case 1:
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.PRIMARY;
            case 2:
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.WALLET;
            case 3:
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.THUMBNAIL;
            case 4:
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.REWARD;
            case 5:
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.PAYMENT_TOKEN;
            case 6:
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.STACK_VIEW;
            case 7:
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.PARTNER;
            case 8:
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.BRAND;
            default:
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Unmapped InstitutionImageCategory encountered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("graphqlCategory", institutionImageCategory.toString())), null, 4, null);
                return com.paypal.oslo.feature.wallet.banks.domain.model.InstitutionImageCategory.UNKNOWN;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$10;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.CHECKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankAccountType.SAVINGS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.INITIATE_PAYPAL_CODE_CONFIRMATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.INITIATE_TWO_RANDOM_DEPOSITS_CONFIRMATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.COMPLETE_PAYPAL_CODE_CONFIRMATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.COMPLETE_TWO_RANDOM_DEPOSITS_CONFIRMATION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.INITIATE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.INITIATE_ELECTRONIC_MANDATE_AUTHORIZATION.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.COMPLETE_PAYPAL_HELD_AUTHORIZATION_FOR_SEPA.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.SUBMIT_ELECTRONIC_MANDATE_AUTHORIZATION.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.COMPLETE_PAYPAL_AGREEMENT_AUTHORIZATION.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.COMPLETE_INSTANT_CONFIRMATION.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.BankAccountAvailableAction.UNKNOWN__.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod.INSTANT_CONFIRMATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod.PAYPAL_CODE_CONFIRMATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationMethod.TWO_DEPOSIT_CONFIRMATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus.values().length];
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus.ACCEPTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus.REQUESTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.BankAccountRealTimePaymentsDepositStatus.DECLINE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.values().length];
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.CONFIRMED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.UNCONFIRMED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.BLOCKED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.NOT_APPLICABLE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr5[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationStatus.NOT_SUPPORTED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.values().length];
            try {
                iArr6[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.INITIATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr6[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.INITIATION_PENDING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr6[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.BYPASS_CONFIRMED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr6[com.paypal.oslo.api.graphql.schema.type.BankAccountConfirmationState.NEEDS_REINITIATION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.values().length];
            try {
                iArr7[com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr7[com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.BLOCKED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr7[com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.CLOSED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr7[com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.INACTIVE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                iArr7[com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.ON_HOLD.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                iArr7[com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.NOT_CREATED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                iArr7[com.paypal.oslo.api.graphql.schema.type.BankAccountStatus.REMOVED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.values().length];
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.ELECTRONIC_MANDATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.MANUAL_MANDATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.PAYPAL_AGREEMENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.PAYPAL_HELD_ELV_MANDATE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.PAYPAL_HELD_SEPA_MANDATE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                iArr8[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationMethod.ONLINE_MANDATE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus.values().length];
            try {
                iArr9[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus.AUTHORIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                iArr9[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus.BLOCKED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                iArr9[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus.FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                iArr9[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus.NOT_APPLICABLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                iArr9[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus.NOT_SUPPORTED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            try {
                iArr9[com.paypal.oslo.api.graphql.schema.type.BankAccountAuthorizationStatus.UNAUTHORIZED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused50) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity.values().length];
            try {
                iArr10[com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity.EBAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused51) {
            }
            try {
                iArr10[com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity.PAYPAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused52) {
            }
            try {
                iArr10[com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity.VENMO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused53) {
            }
            try {
                iArr10[com.paypal.oslo.api.graphql.schema.type.BankAccountOnboardingEntity.BRAINTREE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused54) {
            }
            $EnumSwitchMapping$9 = iArr10;
            int[] iArr11 = new int[com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.values().length];
            try {
                iArr11[com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.PRIMARY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused55) {
            }
            try {
                iArr11[com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.WALLET.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused56) {
            }
            try {
                iArr11[com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.THUMBNAIL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused57) {
            }
            try {
                iArr11[com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.REWARD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused58) {
            }
            try {
                iArr11[com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.PAYMENT_TOKEN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused59) {
            }
            try {
                iArr11[com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.STACK_VIEW.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused60) {
            }
            try {
                iArr11[com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.PARTNER.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused61) {
            }
            try {
                iArr11[com.paypal.oslo.api.graphql.schema.type.InstitutionImageCategory.BRAND.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused62) {
            }
            $EnumSwitchMapping$10 = iArr11;
        }
    }
}
