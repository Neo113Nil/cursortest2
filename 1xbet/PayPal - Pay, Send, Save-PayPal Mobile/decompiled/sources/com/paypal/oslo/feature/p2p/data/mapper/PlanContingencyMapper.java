package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/PlanContingencyMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingency;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/fragment/PlanContingencyFragment;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingency;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlanContingencyMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment, com.paypal.oslo.feature.p2p.domain.model.PlanContingency> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PlanContingencyMapper() {
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.PlanContingency map(com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment input) {
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction;
        com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus contingencyStatus;
        com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType identityDocumentType;
        com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute planUserDataCollectionAttribute;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.CardVerificationDataCollection cardVerificationDataCollection = null;
        java.util.ArrayList arrayList = null;
        java.util.ArrayList arrayList2 = null;
        cardVerificationDataCollection = null;
        switch (com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper.WhenMappings.$EnumSwitchMapping$0[input.getAction().ordinal()]) {
            case 1:
                planContingencyAction = com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.THREE_D_SECURE_DATA_COLLECTION_REQUIRED;
                break;
            case 2:
                planContingencyAction = com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.THREE_D_SECURE_AUTHENTICATION_REQUIRED;
                break;
            case 3:
                planContingencyAction = com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.CARD_VERIFICATION_DATA_COLLECTION_REQUIRED;
                break;
            case 4:
                planContingencyAction = com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.OBTAIN_REAL_TIME_BALANCE_CONSENT;
                break;
            case 5:
                planContingencyAction = com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.REFRESH_REAL_TIME_BALANCE;
                break;
            case 6:
                planContingencyAction = com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.TOPUP_INSTRUMENT;
                break;
            case 7:
                planContingencyAction = com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction.USER_DATA_COLLECTION_REQUIRED;
                break;
            default:
                planContingencyAction = null;
                break;
        }
        int i = com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper.WhenMappings.$EnumSwitchMapping$1[input.getStatus().ordinal()];
        if (i == 1) {
            contingencyStatus = com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus.UNRESOLVED;
        } else {
            contingencyStatus = i != 2 ? null : com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus.RESOLVED;
        }
        if (planContingencyAction == null || contingencyStatus == null) {
            return null;
        }
        com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.Details details = input.getDetails();
        if (details != null) {
            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureDataCollectionContingency onThreeDSecureDataCollectionContingency = details.getOnThreeDSecureDataCollectionContingency();
            if (onThreeDSecureDataCollectionContingency != null) {
                java.lang.String rawValue = onThreeDSecureDataCollectionContingency.getVersion().getRawValue();
                java.lang.String referenceId = onThreeDSecureDataCollectionContingency.getReferenceId();
                java.lang.String obj = onThreeDSecureDataCollectionContingency.getDeviceDataCollectionUrl().toString();
                java.lang.String jwt = onThreeDSecureDataCollectionContingency.getJwt();
                com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDeviceDataCollectionMode deviceDataCollectionMode = onThreeDSecureDataCollectionContingency.getDeviceDataCollectionMode();
                java.lang.String rawValue2 = deviceDataCollectionMode != null ? deviceDataCollectionMode.getRawValue() : null;
                com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider authenticationProvider = onThreeDSecureDataCollectionContingency.getAuthenticationProvider();
                java.lang.String rawValue3 = authenticationProvider != null ? authenticationProvider.getRawValue() : null;
                java.lang.Object returnUrl = onThreeDSecureDataCollectionContingency.getReturnUrl();
                java.lang.String obj2 = returnUrl != null ? returnUrl.toString() : null;
                com.paypal.oslo.api.graphql.schema.type.ThreeDSecureContingencySource source = onThreeDSecureDataCollectionContingency.getSource();
                cardVerificationDataCollection = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.ThreeDSecureDataCollection(rawValue, referenceId, obj, jwt, rawValue2, rawValue3, obj2, source != null ? source.getRawValue() : null, onThreeDSecureDataCollectionContingency.getReason());
            } else {
                com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnThreeDSecureAuthenticationContingency onThreeDSecureAuthenticationContingency = details.getOnThreeDSecureAuthenticationContingency();
                if (onThreeDSecureAuthenticationContingency != null) {
                    java.lang.String rawValue4 = onThreeDSecureAuthenticationContingency.getVersion().getRawValue();
                    java.lang.String referenceId2 = onThreeDSecureAuthenticationContingency.getReferenceId();
                    java.lang.String jwt2 = onThreeDSecureAuthenticationContingency.getJwt();
                    java.lang.String obj3 = onThreeDSecureAuthenticationContingency.getResolutionRedirectUrl().toString();
                    java.lang.String rawValue5 = onThreeDSecureAuthenticationContingency.getResolutionRedirectMethod().getRawValue();
                    java.lang.String transactionId = onThreeDSecureAuthenticationContingency.getTransactionId();
                    java.lang.String externalTransactionId = onThreeDSecureAuthenticationContingency.getExternalTransactionId();
                    com.paypal.oslo.api.graphql.schema.type.ThreeDSecureAuthenticationProvider authenticationProvider2 = onThreeDSecureAuthenticationContingency.getAuthenticationProvider();
                    java.lang.String rawValue6 = authenticationProvider2 != null ? authenticationProvider2.getRawValue() : null;
                    java.lang.String paymentAuthRequest = onThreeDSecureAuthenticationContingency.getPaymentAuthRequest();
                    java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter> redirectRequestParameters = onThreeDSecureAuthenticationContingency.getRedirectRequestParameters();
                    if (redirectRequestParameters != null) {
                        java.util.List<com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter> list = redirectRequestParameters;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        for (com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.RedirectRequestParameter redirectRequestParameter : list) {
                            arrayList3.add(new com.paypal.oslo.feature.p2p.domain.model.RedirectRequestParameter(redirectRequestParameter.getKey(), redirectRequestParameter.getValue()));
                        }
                        arrayList = arrayList3;
                    }
                    cardVerificationDataCollection = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.ThreeDSecureAuthentication(rawValue4, referenceId2, jwt2, obj3, rawValue5, transactionId, externalTransactionId, rawValue6, paymentAuthRequest, arrayList);
                } else {
                    com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnPlanUserDataCollection onPlanUserDataCollection = details.getOnPlanUserDataCollection();
                    if (onPlanUserDataCollection != null) {
                        java.util.List<com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute> requiredFields = onPlanUserDataCollection.getRequiredFields();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.util.Iterator<T> it = requiredFields.iterator();
                        while (it.hasNext()) {
                            int i2 = com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper.WhenMappings.$EnumSwitchMapping$2[((com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute) it.next()).ordinal()];
                            if (i2 == 1) {
                                planUserDataCollectionAttribute = com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute.SENDER_DATE_OF_BIRTH;
                            } else if (i2 == 2) {
                                planUserDataCollectionAttribute = com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute.SENDER_GOVERNMENT_ID;
                            } else if (i2 == 3) {
                                planUserDataCollectionAttribute = com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute.SENDER_ADDRESS;
                            } else {
                                planUserDataCollectionAttribute = i2 != 4 ? null : com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute.RECEIVER_NAME;
                            }
                            if (planUserDataCollectionAttribute != null) {
                                arrayList4.add(planUserDataCollectionAttribute);
                            }
                        }
                        java.util.ArrayList arrayList5 = arrayList4;
                        java.util.List<com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType> identityDocuments = onPlanUserDataCollection.getIdentityDocuments();
                        if (identityDocuments != null) {
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.Iterator<T> it2 = identityDocuments.iterator();
                            while (it2.hasNext()) {
                                int i3 = com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper.WhenMappings.$EnumSwitchMapping$3[((com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType) it2.next()).ordinal()];
                                if (i3 == 1) {
                                    identityDocumentType = com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType.NATIONAL_ID;
                                } else if (i3 == 2) {
                                    identityDocumentType = com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType.PASSPORT_NUMBER;
                                } else if (i3 == 3) {
                                    identityDocumentType = com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType.DRIVERS_LICENSE;
                                } else {
                                    identityDocumentType = i3 != 4 ? null : com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType.TAX_IDENTIFICATION_NUMBER;
                                }
                                if (identityDocumentType != null) {
                                    arrayList6.add(identityDocumentType);
                                }
                            }
                            arrayList2 = arrayList6;
                        }
                        cardVerificationDataCollection = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.PlanUserDataCollection(arrayList5, arrayList2);
                    } else {
                        com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnRealTimeBalanceContingency onRealTimeBalanceContingency = details.getOnRealTimeBalanceContingency();
                        if (onRealTimeBalanceContingency != null) {
                            java.lang.Object confirmationUrl = onRealTimeBalanceContingency.getConfirmationUrl();
                            cardVerificationDataCollection = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.RealTimeBalance(confirmationUrl != null ? confirmationUrl.toString() : null);
                        } else {
                            com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnTopUpInstrumentContingency onTopUpInstrumentContingency = details.getOnTopUpInstrumentContingency();
                            if (onTopUpInstrumentContingency != null) {
                                cardVerificationDataCollection = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.TopUpInstrument(onTopUpInstrumentContingency.getProvider().getRawValue(), new com.paypal.oslo.feature.p2p.domain.model.Amount(onTopUpInstrumentContingency.getMinimumAmount().getP2PMoneyFragment().getValue(), onTopUpInstrumentContingency.getMinimumAmount().getP2PMoneyFragment().getCurrencyCode().toString(), onTopUpInstrumentContingency.getMinimumAmount().getP2PMoneyFragment().getCurrencyCode().toString()));
                            } else {
                                com.paypal.oslo.feature.p2p.graphql.fragment.PlanContingencyFragment.OnCardVerificationDataCollectionContingency onCardVerificationDataCollectionContingency = details.getOnCardVerificationDataCollectionContingency();
                                if (onCardVerificationDataCollectionContingency != null) {
                                    cardVerificationDataCollection = new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.CardVerificationDataCollection(onCardVerificationDataCollectionContingency.getCvvLength());
                                }
                            }
                        }
                    }
                }
            }
        }
        return new com.paypal.oslo.feature.p2p.domain.model.PlanContingency(planContingencyAction, contingencyStatus, cardVerificationDataCollection);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.THREE_D_SECURE_DATA_COLLECTION_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.THREE_D_SECURE_AUTHENTICATION_REQUIRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.CARD_VERIFICATION_DATA_COLLECTION_REQUIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.OBTAIN_REAL_TIME_BALANCE_CONSENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.REFRESH_REAL_TIME_BALANCE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.TOPUP_INSTRUMENT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PlanContingencyAction.USER_DATA_COLLECTION_REQUIRED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.ContingencyStatus.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ContingencyStatus.UNRESOLVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.ContingencyStatus.RESOLVED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute.values().length];
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute.SENDER_DATE_OF_BIRTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute.SENDER_GOVERNMENT_ID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute.SENDER_ADDRESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.paypal.oslo.api.graphql.schema.type.PlanUserDataCollectionAttribute.RECEIVER_NAME.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.values().length];
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.NATIONAL_ID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.PASSPORT_NUMBER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.DRIVERS_LICENSE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr4[com.paypal.oslo.api.graphql.schema.type.IdentityDocumentType.TAX_IDENTIFICATION_NUMBER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }
}
