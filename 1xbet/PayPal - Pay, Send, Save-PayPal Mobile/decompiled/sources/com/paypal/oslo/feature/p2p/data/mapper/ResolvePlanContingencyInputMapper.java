package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/ResolvePlanContingencyInputMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/domain/model/ResolvePlanContingencyInput;", "Lcom/paypal/oslo/api/graphql/schema/type/ResolvePlanContingencyForTransferAttemptInput;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/domain/model/ResolvePlanContingencyInput;)Lcom/paypal/oslo/api/graphql/schema/type/ResolvePlanContingencyForTransferAttemptInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResolvePlanContingencyInputMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput, com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ResolvePlanContingencyInputMapper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f7  */
    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput map(com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput input) {
        com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus topUpProviderResponseStatus;
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction;
        com.apollographql.apollo.api.Optional.Absent absent;
        com.paypal.oslo.feature.p2p.domain.model.AddressInput senderAddress;
        com.apollographql.apollo.api.Optional.Absent absent2;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentInput> identityDocuments;
        com.apollographql.apollo.api.Optional.Absent absent3;
        com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType identityDocumentType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData resolution = input.getResolution();
        if (resolution instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureDataCollection) {
            com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction2 = com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.THREE_D_SECURE_DATA_COLLECTION_REQUIRED;
            com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureDataCollection threeDSecureDataCollection = (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureDataCollection) resolution;
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion safeValueOf = com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion.INSTANCE.safeValueOf(threeDSecureDataCollection.getVersion());
            java.lang.String referenceId = threeDSecureDataCollection.getReferenceId();
            com.apollographql.apollo.api.Optional present = referenceId != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(referenceId) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
            java.lang.String returnUrl = threeDSecureDataCollection.getReturnUrl();
            return getHighSpeedVideoFpsRangesFor(input, planContingencyAction2, companion.present(new com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput(safeValueOf, present, returnUrl != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(returnUrl) : com.apollographql.apollo.api.Optional.Absent.INSTANCE)), null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        }
        if (resolution instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureAuthentication) {
            com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction3 = com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.THREE_D_SECURE_AUTHENTICATION_REQUIRED;
            com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureAuthentication threeDSecureAuthentication = (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureAuthentication) resolution;
            com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion safeValueOf2 = com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion.INSTANCE.safeValueOf(threeDSecureAuthentication.getVersion());
            java.lang.String referenceId2 = threeDSecureAuthentication.getReferenceId();
            return getHighSpeedVideoFpsRangesFor(input, planContingencyAction3, null, companion2.present(new com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationResolutionInput(safeValueOf2, referenceId2 != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(referenceId2) : com.apollographql.apollo.api.Optional.Absent.INSTANCE)), null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
        }
        if (resolution instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.CardVerificationDataCollection) {
            com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction4 = com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.CARD_VERIFICATION_DATA_COLLECTION_REQUIRED;
            com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
            java.lang.String cvv = ((com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.CardVerificationDataCollection) resolution).getCvv();
            return getHighSpeedVideoFpsRangesFor(input, planContingencyAction4, null, null, companion3.present(new com.paypal.oslo.api.graphql.schema.type.CardVerificationDataCollectionResolutionInput(cvv != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(cvv) : com.apollographql.apollo.api.Optional.Absent.INSTANCE)), null, null, null, 236);
        }
        if (resolution instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.PlanUserDataCollection) {
            com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction5 = com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.USER_DATA_COLLECTION_REQUIRED;
            com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.PlanUserDataCollection planUserDataCollection = (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.PlanUserDataCollection) resolution;
            com.paypal.oslo.feature.p2p.domain.model.PersonName receiverName = planUserDataCollection.getReceiverName();
            if (receiverName != null) {
                com.apollographql.apollo.api.Optional.Companion companion5 = com.apollographql.apollo.api.Optional.INSTANCE;
                java.lang.String givenName = receiverName.getGivenName();
                com.apollographql.apollo.api.Optional present2 = givenName != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(givenName) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                java.lang.String surname = receiverName.getSurname();
                com.apollographql.apollo.api.Optional.Present present3 = companion5.present(new com.paypal.oslo.api.graphql.schema.type.PersonNameInput(null, present2, surname != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(surname) : com.apollographql.apollo.api.Optional.Absent.INSTANCE, null, null, null, null, 121, null));
                if (present3 != null) {
                    absent = present3;
                    com.apollographql.apollo.api.Optional optional = absent;
                    java.lang.String senderDateOfBirth = planUserDataCollection.getSenderDateOfBirth();
                    com.apollographql.apollo.api.Optional present4 = senderDateOfBirth == null ? com.apollographql.apollo.api.Optional.INSTANCE.present(senderDateOfBirth) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                    senderAddress = planUserDataCollection.getSenderAddress();
                    if (senderAddress != null) {
                        com.apollographql.apollo.api.Optional.Companion companion6 = com.apollographql.apollo.api.Optional.INSTANCE;
                        java.lang.String addressLine1 = senderAddress.getAddressLine1();
                        com.apollographql.apollo.api.Optional present5 = addressLine1 != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(addressLine1) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        java.lang.String addressLine2 = senderAddress.getAddressLine2();
                        com.apollographql.apollo.api.Optional present6 = addressLine2 != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(addressLine2) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        java.lang.String addressLine3 = senderAddress.getAddressLine3();
                        com.apollographql.apollo.api.Optional present7 = addressLine3 != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(addressLine3) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        java.lang.String adminArea1 = senderAddress.getAdminArea1();
                        com.apollographql.apollo.api.Optional present8 = adminArea1 != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(adminArea1) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        java.lang.String adminArea2 = senderAddress.getAdminArea2();
                        com.apollographql.apollo.api.Optional present9 = adminArea2 != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(adminArea2) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        java.lang.String adminArea3 = senderAddress.getAdminArea3();
                        com.apollographql.apollo.api.Optional present10 = adminArea3 != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(adminArea3) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        java.lang.String adminArea4 = senderAddress.getAdminArea4();
                        com.apollographql.apollo.api.Optional present11 = adminArea4 != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(adminArea4) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                        java.lang.String postalCode = senderAddress.getPostalCode();
                        com.apollographql.apollo.api.Optional.Present present12 = companion6.present(new com.paypal.oslo.api.graphql.schema.type.AddressInput(present5, present6, present7, present8, present9, present10, present11, postalCode != null ? com.apollographql.apollo.api.Optional.INSTANCE.present(postalCode) : com.apollographql.apollo.api.Optional.Absent.INSTANCE, senderAddress.getCountryCode()));
                        if (present12 != null) {
                            absent2 = present12;
                            com.apollographql.apollo.api.Optional optional2 = absent2;
                            identityDocuments = planUserDataCollection.getIdentityDocuments();
                            if (identityDocuments != null) {
                                com.apollographql.apollo.api.Optional.Companion companion7 = com.apollographql.apollo.api.Optional.INSTANCE;
                                java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentInput> list = identityDocuments;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                for (com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentInput identityDocumentInput : list) {
                                    int i = com.paypal.oslo.feature.p2p.data.mapper.ResolvePlanContingencyInputMapper.WhenMappings.$EnumSwitchMapping$0[identityDocumentInput.getDocumentType().ordinal()];
                                    if (i == 1) {
                                        identityDocumentType = com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.NATIONAL_ID;
                                    } else if (i == 2) {
                                        identityDocumentType = com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.PASSPORT_NUMBER;
                                    } else if (i == 3) {
                                        identityDocumentType = com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.DRIVERS_LICENSE;
                                    } else if (i == 4) {
                                        identityDocumentType = com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.TAX_IDENTIFICATION_NUMBER;
                                    } else {
                                        identityDocumentType = com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.UNKNOWN__;
                                    }
                                    arrayList.add(new com.paypal.oslo.api.graphql.schema.type.IdentityDocumentInput(identityDocumentType, identityDocumentInput.getDocumentValue()));
                                }
                                com.apollographql.apollo.api.Optional.Present present13 = companion7.present(arrayList);
                                if (present13 != null) {
                                    absent3 = present13;
                                    return getHighSpeedVideoFpsRangesFor(input, planContingencyAction5, null, null, null, companion4.present(new com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionResolutionInput(optional, present4, optional2, absent3, null, 16, null)), null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                                }
                            }
                            absent3 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                            return getHighSpeedVideoFpsRangesFor(input, planContingencyAction5, null, null, null, companion4.present(new com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionResolutionInput(optional, present4, optional2, absent3, null, 16, null)), null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                        }
                    }
                    absent2 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                    com.apollographql.apollo.api.Optional optional22 = absent2;
                    identityDocuments = planUserDataCollection.getIdentityDocuments();
                    if (identityDocuments != null) {
                    }
                    absent3 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
                    return getHighSpeedVideoFpsRangesFor(input, planContingencyAction5, null, null, null, companion4.present(new com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionResolutionInput(optional, present4, optional22, absent3, null, 16, null)), null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                }
            }
            absent = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
            com.apollographql.apollo.api.Optional optional3 = absent;
            java.lang.String senderDateOfBirth2 = planUserDataCollection.getSenderDateOfBirth();
            com.apollographql.apollo.api.Optional present42 = senderDateOfBirth2 == null ? com.apollographql.apollo.api.Optional.INSTANCE.present(senderDateOfBirth2) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
            senderAddress = planUserDataCollection.getSenderAddress();
            if (senderAddress != null) {
            }
            absent2 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
            com.apollographql.apollo.api.Optional optional222 = absent2;
            identityDocuments = planUserDataCollection.getIdentityDocuments();
            if (identityDocuments != null) {
            }
            absent3 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
            return getHighSpeedVideoFpsRangesFor(input, planContingencyAction5, null, null, null, companion4.present(new com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionResolutionInput(optional3, present42, optional222, absent3, null, 16, null)), null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
        }
        if (resolution instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.RealTimeBalance) {
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.RealTimeBalance realTimeBalance = (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.RealTimeBalance) resolution;
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction actionType = realTimeBalance.getActionType();
            int i2 = com.paypal.oslo.feature.p2p.data.mapper.ResolvePlanContingencyInputMapper.WhenMappings.$EnumSwitchMapping$2[actionType.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    planContingencyAction = com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.REFRESH_REAL_TIME_BALANCE;
                    com.apollographql.apollo.api.Optional.Companion companion8 = com.apollographql.apollo.api.Optional.INSTANCE;
                    java.lang.String processorResponse = realTimeBalance.getProcessorResponse();
                    return getHighSpeedVideoFpsRangesFor(input, planContingencyAction, null, null, null, null, companion8.present(new com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput(processorResponse == null ? com.apollographql.apollo.api.Optional.INSTANCE.present(processorResponse) : com.apollographql.apollo.api.Optional.Absent.INSTANCE)), null, 188);
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.INVALID_REAL_TIME_BALANCE_ACTION_TYPE, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, actionType.name())), null, 4, null);
            }
            planContingencyAction = com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.OBTAIN_REAL_TIME_BALANCE_CONSENT;
            com.apollographql.apollo.api.Optional.Companion companion82 = com.apollographql.apollo.api.Optional.INSTANCE;
            java.lang.String processorResponse2 = realTimeBalance.getProcessorResponse();
            return getHighSpeedVideoFpsRangesFor(input, planContingencyAction, null, null, null, null, companion82.present(new com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput(processorResponse2 == null ? com.apollographql.apollo.api.Optional.INSTANCE.present(processorResponse2) : com.apollographql.apollo.api.Optional.Absent.INSTANCE)), null, 188);
        }
        if (!(resolution instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.TopUpInstrument)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction6 = com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.TOPUP_INSTRUMENT;
        com.apollographql.apollo.api.Optional.Companion companion9 = com.apollographql.apollo.api.Optional.INSTANCE;
        int i3 = com.paypal.oslo.feature.p2p.data.mapper.ResolvePlanContingencyInputMapper.WhenMappings.$EnumSwitchMapping$1[((com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.TopUpInstrument) resolution).getProviderResponseStatus().ordinal()];
        if (i3 == 1) {
            topUpProviderResponseStatus = com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.SUCCESS;
        } else if (i3 == 2) {
            topUpProviderResponseStatus = com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.USER_CANCELLED;
        } else if (i3 == 3) {
            topUpProviderResponseStatus = com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.INSUFFICIENT_LOAD;
        } else if (i3 == 4) {
            topUpProviderResponseStatus = com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.BUSINESS_DECLINE;
        } else if (i3 == 5) {
            topUpProviderResponseStatus = com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.GENERIC_ERROR;
        } else {
            topUpProviderResponseStatus = com.paypal.oslo.api.graphql.schema.type.TopUpProviderResponseStatus.UNKNOWN__;
        }
        return getHighSpeedVideoFpsRangesFor(input, planContingencyAction6, null, null, null, null, null, companion9.present(new com.paypal.oslo.api.graphql.schema.type.TopUpInstrumentResolutionInput(topUpProviderResponseStatus)), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
    }

    private static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput resolvePlanContingencyInput, com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction planContingencyAction, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, com.apollographql.apollo.api.Optional optional5, com.apollographql.apollo.api.Optional optional6, int i) {
        com.apollographql.apollo.api.Optional optional7 = (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional;
        com.apollographql.apollo.api.Optional optional8 = (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional2;
        com.apollographql.apollo.api.Optional optional9 = (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional3;
        return new com.paypal.oslo.api.graphql.schema.type.ResolvePlanContingencyForTransferAttemptInput(resolvePlanContingencyInput.getId(), resolvePlanContingencyInput.getFundingOptionId(), planContingencyAction, optional7, optional8, (i & 32) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional4, (i & 128) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional6, optional9, (i & 64) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : optional5);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType.NATIONAL_ID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType.PASSPORT_NUMBER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType.DRIVERS_LICENSE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType.TAX_IDENTIFICATION_NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus.values().length];
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus.USER_CANCELLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus.INSUFFICIENT_LOAD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus.BUSINESS_DECLINE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus.GENERIC_ERROR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.values().length];
            try {
                iArr3[com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.OBTAIN_REAL_TIME_BALANCE_CONSENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.REFRESH_REAL_TIME_BALANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
