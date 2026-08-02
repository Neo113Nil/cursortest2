package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0002\u0010\n\u001a\u0017\u0010\u0007\u001a\u00060\fj\u0002`\r*\u00020\u000bH\u0000¢\u0006\u0004\b\u0007\u0010\u000e\u001a'\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0017j\u0002`\u00180\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$Data;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/InStoreVccDetails;", "toInStoreVccDetails", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/EvaluateBnplProvisionEligibilityAndReplaceCardMutation$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/InStoreVccDetails;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/InStoreVccDetailsRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProvisionEligibilityAndReplaceCardInput;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/EvaluateBNPLProvisionEligibilityAndReplaceCardInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/InStoreVccDetailsRequest;)Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProvisionEligibilityAndReplaceCardInput;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$Data;", "(Lcom/paypal/oslo/feature/bnplacquisition/graphql/GetBnplProvisionedCardOverviewQuery$Data;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/InStoreVccDetails;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/ProvisionedCardOverviewRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLProvisionedCardOverviewInput;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/BNPLProvisionedCardOverviewInput;", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/ProvisionedCardOverviewRequest;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLProvisionedCardOverviewInput;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/ExternalWalletToken;", "p0", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLExternalWalletTokenInput;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/BNPLExternalWalletTokenInput;", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLProvisionedTokenInput;", "Lcom/paypal/oslo/feature/bnplacquisition/graphql/type/BNPLProvisionedTokenInput;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InStoreVccDetailsMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetails toInStoreVccDetails(com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.EvaluateBnplProvisionEligibilityAndReplaceCard evaluateBnplProvisionEligibilityAndReplaceCard;
        com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsSuccess inStoreVccDetailsSuccess;
        com.paypal.oslo.api.graphql.schema.type.BNPLTokenProvisionEligibilityDeclineReason reason;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment bnplAcquisitionFpanTokenFragment;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline = null;
        if (data == null || (evaluateBnplProvisionEligibilityAndReplaceCard = data.getEvaluateBnplProvisionEligibilityAndReplaceCard()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess = evaluateBnplProvisionEligibilityAndReplaceCard.getOnEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess();
        if (onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess != null) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier from = com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.INSTANCE.from(onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.getCreditProductIdentifier().name());
            com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.FundingPrimaryAccountNumberToken fundingPrimaryAccountNumberToken = onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.getFundingPrimaryAccountNumberToken();
            inStoreVccDetailsSuccess = new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsEvaluateEligibilityAndReplaceCard(from, (fundingPrimaryAccountNumberToken == null || (bnplAcquisitionFpanTokenFragment = fundingPrimaryAccountNumberToken.getBnplAcquisitionFpanTokenFragment()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.data.mapper.TokenMapperKt.toToken(bnplAcquisitionFpanTokenFragment), com.paypal.oslo.feature.bnplacquisition.data.mapper.VirtualCardContentMapperKt.toVirtualCardContent(onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.getVirtualCard().getBnplAcquisitionVirtualCardFragment(), onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.getApprovedLoanAmount()), com.paypal.oslo.feature.bnplacquisition.data.mapper.InstallmentSummaryMapperKt.toInStoreVccDetailsInstallmentSummary(onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.getInstallmentSummary().getBnplAcquisitionInstallmentSummaryFragment()), com.paypal.oslo.feature.bnplacquisition.data.mapper.CardHolderDetailsMapperKt.toCardHolderDetails(onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.getCardHolder().getBnplAcquisitionCardHolderFragment()), onEvaluateBNPLProvisionEligibilityAndReplaceCardSuccess.getPrimaryDeviceTokenRelinked()));
        } else {
            inStoreVccDetailsSuccess = null;
        }
        com.paypal.oslo.feature.bnplacquisition.graphql.EvaluateBnplProvisionEligibilityAndReplaceCardMutation.OnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline = evaluateBnplProvisionEligibilityAndReplaceCard.getOnEvaluateBNPLProvisionEligibilityAndReplaceCardDecline();
        if (onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline != null && (reason = onEvaluateBNPLProvisionEligibilityAndReplaceCardDecline.getReason()) != null) {
            applicationDecline = com.paypal.oslo.feature.bnplacquisition.data.mapper.ApplicationDeclineMapperKt.toApplicationDecline(reason);
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetails(inStoreVccDetailsSuccess, applicationDecline);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProvisionEligibilityAndReplaceCardInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.InStoreVccDetailsRequest inStoreVccDetailsRequest) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inStoreVccDetailsRequest, "");
        com.apollographql.apollo.api.Optional.Present present = new com.apollographql.apollo.api.Optional.Present(inStoreVccDetailsRequest.getExperienceSessionId());
        java.lang.String creditAccountId = inStoreVccDetailsRequest.getCreditAccountId();
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet> deviceSupportedWallets = inStoreVccDetailsRequest.getDeviceSupportedWallets();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(deviceSupportedWallets, 10));
        java.util.Iterator<T> it = deviceSupportedWallets.iterator();
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet deviceSupportedWallet = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet) it.next();
            java.util.Iterator<E> it2 = com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next = it2.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType) next).name(), deviceSupportedWallet.name())) {
                    arrayList = next;
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType creditExternalWalletType = (com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType) arrayList;
            if (creditExternalWalletType == null) {
                creditExternalWalletType = com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType.UNKNOWN__;
            }
            arrayList2.add(creditExternalWalletType);
        }
        java.util.ArrayList arrayList3 = arrayList2;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLExternalWalletTokenInput> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(inStoreVccDetailsRequest.getExternalWalletTokens());
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier safeValueOf = com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier.INSTANCE.safeValueOf(inStoreVccDetailsRequest.getFlowContext().getFlowSpecifier().name());
        com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel safeValueOf2 = com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.INSTANCE.safeValueOf(inStoreVccDetailsRequest.getFlowContext().getChannel());
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<java.lang.String> attributes = inStoreVccDetailsRequest.getFlowContext().getAttributes();
        if (attributes != null) {
            java.util.List<java.lang.String> list = attributes;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList4.add(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowAttribute.INSTANCE.safeValueOf(com.paypal.oslo.feature.bnplacquisition.data.repository.ExperienceSessionRepositoryImpl.FLOW_ATTRIBUTE_PREFIX.concat(java.lang.String.valueOf((java.lang.String) it3.next()))));
            }
            arrayList = arrayList4;
        }
        return new com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProvisionEligibilityAndReplaceCardInput(present, creditAccountId, arrayList3, highSpeedVideoFpsRangesFor, new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput(companion.presentIfNotNull(arrayList), safeValueOf2, safeValueOf, null, 8, null));
    }

    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetails toInStoreVccDetails(com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Data data) {
        com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.BnplProvisionedCardOverview bnplProvisionedCardOverview;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionFpanTokenFragment bnplAcquisitionFpanTokenFragment;
        if (data == null || (bnplProvisionedCardOverview = data.getBnplProvisionedCardOverview()) == null) {
            return null;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier from = com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier.INSTANCE.from(bnplProvisionedCardOverview.getCreditProductIdentifier().name());
        com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplProvisionedCardOverviewQuery.Token token = bnplProvisionedCardOverview.getToken();
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation token2 = (token == null || (bnplAcquisitionFpanTokenFragment = token.getBnplAcquisitionFpanTokenFragment()) == null) ? null : com.paypal.oslo.feature.bnplacquisition.data.mapper.TokenMapperKt.toToken(bnplAcquisitionFpanTokenFragment);
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment bnplAcquisitionVirtualCardFragment = bnplProvisionedCardOverview.getVirtualCard().getBnplAcquisitionVirtualCardFragment();
        java.lang.Object lastNChars = bnplAcquisitionVirtualCardFragment.getLastNChars();
        java.lang.String str = lastNChars instanceof java.lang.String ? (java.lang.String) lastNChars : null;
        com.paypal.oslo.feature.bnplacquisition.graphql.fragment.BnplAcquisitionVirtualCardFragment.CardArt cardArt = bnplAcquisitionVirtualCardFragment.getCardArt();
        java.lang.Object url = cardArt != null ? cardArt.getUrl() : null;
        java.lang.String str2 = url instanceof java.lang.String ? (java.lang.String) url : null;
        java.lang.Object createTime = bnplAcquisitionVirtualCardFragment.getCreateTime();
        java.lang.String str3 = createTime instanceof java.lang.String ? (java.lang.String) createTime : null;
        java.lang.Object expirationDuration = bnplAcquisitionVirtualCardFragment.getExpirationDuration();
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetails(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsEvaluateEligibilityAndReplaceCard(from, token2, new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent(str, str2, str3, expirationDuration instanceof java.lang.String ? (java.lang.String) expirationDuration : null, com.paypal.oslo.feature.bnplacquisition.data.mapper.MoneyMapperKt.toMoney(bnplProvisionedCardOverview.getApprovedLoanAmount().getBnplAcquisitionMoneyFragment())), com.paypal.oslo.feature.bnplacquisition.data.mapper.InstallmentSummaryMapperKt.toInStoreVccDetailsInstallmentSummary(bnplProvisionedCardOverview.getInstallmentSummary().getBnplAcquisitionInstallmentSummaryFragment()), com.paypal.oslo.feature.bnplacquisition.data.mapper.CardHolderDetailsMapperKt.toCardHolderDetails(bnplProvisionedCardOverview.getCardHolder().getBnplAcquisitionCardHolderFragment()), bnplProvisionedCardOverview.getPrimaryDeviceTokenRelinked())), null, 2, null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BNPLProvisionedCardOverviewInput toGraphQLInput(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest provisionedCardOverviewRequest) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionedCardOverviewRequest, "");
        com.apollographql.apollo.api.Optional.Present present = new com.apollographql.apollo.api.Optional.Present(provisionedCardOverviewRequest.getExperienceSessionId());
        java.lang.String creditAccountId = provisionedCardOverviewRequest.getCreditAccountId();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLExternalWalletTokenInput> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(provisionedCardOverviewRequest.getExternalWalletTokens());
        java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLProvisionedTokenInput> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(provisionedCardOverviewRequest.getProvisionedTokens());
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType> pushProvisionCapableDevices = provisionedCardOverviewRequest.getPushProvisionCapableDevices();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(pushProvisionCapableDevices, 10));
        java.util.Iterator<T> it = pushProvisionCapableDevices.iterator();
        while (it.hasNext()) {
            arrayList2.add(com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType.INSTANCE.safeValueOf(((com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType) it.next()).name()));
        }
        java.util.ArrayList arrayList3 = arrayList2;
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier safeValueOf = com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier.INSTANCE.safeValueOf(provisionedCardOverviewRequest.getFlowContext().getFlowSpecifier().name());
        com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel safeValueOf2 = com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.INSTANCE.safeValueOf(provisionedCardOverviewRequest.getFlowContext().getChannel());
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<java.lang.String> attributes = provisionedCardOverviewRequest.getFlowContext().getAttributes();
        if (attributes != null) {
            java.util.List<java.lang.String> list = attributes;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList4.add(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowAttribute.INSTANCE.safeValueOf(com.paypal.oslo.feature.bnplacquisition.data.repository.ExperienceSessionRepositoryImpl.FLOW_ATTRIBUTE_PREFIX.concat(java.lang.String.valueOf((java.lang.String) it2.next()))));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.api.graphql.schema.type.BNPLProvisionedCardOverviewInput(creditAccountId, present, highSpeedVideoFpsRangesFor, new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput(companion.presentIfNotNull(arrayList), safeValueOf2, safeValueOf, null, 8, null), highSpeedVideoFpsRanges, arrayList3);
    }

    private static final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLExternalWalletTokenInput> getHighSpeedVideoFpsRangesFor(java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken> list) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken externalWalletToken : list2) {
            java.lang.String name2 = externalWalletToken.getWalletType().name();
            java.lang.Object obj4 = (java.lang.Enum) com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType.UNKNOWN__;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                obj = kotlin.Result.m23436constructorimpl(java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType.class, name2));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                obj = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (!kotlin.Result.m23441isFailureimpl(obj)) {
                obj4 = obj;
            }
            com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType creditExternalWalletType = (java.lang.Enum) obj4;
            java.lang.String name3 = externalWalletToken.getDeviceType().name();
            java.lang.Object obj5 = (java.lang.Enum) com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType.UNKNOWN__;
            try {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                obj2 = kotlin.Result.m23436constructorimpl(java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType.class, name3));
            } catch (java.lang.Throwable th2) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                obj2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
            }
            if (!kotlin.Result.m23441isFailureimpl(obj2)) {
                obj5 = obj2;
            }
            com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType creditExternalWalletDeviceType = (java.lang.Enum) obj5;
            com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(externalWalletToken.getReferenceId());
            com.apollographql.apollo.api.Optional presentIfNotNull2 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(externalWalletToken.getFundingPrimaryAccountNumberReferenceId());
            com.apollographql.apollo.api.Optional presentIfNotNull3 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(externalWalletToken.getFundingPrimaryAccountNumberLastDigits());
            com.apollographql.apollo.api.Optional presentIfNotNull4 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(externalWalletToken.getTokenPrimaryAccountNumberLastDigits());
            java.lang.String name4 = externalWalletToken.getState().name();
            java.lang.Object obj6 = (java.lang.Enum) com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.UNKNOWN__;
            try {
                kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                obj3 = kotlin.Result.m23436constructorimpl(java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletTokenState.class, name4));
            } catch (java.lang.Throwable th3) {
                kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                obj3 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th3));
            }
            if (!kotlin.Result.m23441isFailureimpl(obj3)) {
                obj6 = obj3;
            }
            arrayList.add(new com.paypal.oslo.api.graphql.schema.type.BNPLExternalWalletTokenInput(creditExternalWalletDeviceType, presentIfNotNull3, presentIfNotNull2, presentIfNotNull, (java.lang.Enum) obj6, presentIfNotNull4, creditExternalWalletType));
        }
        return arrayList;
    }

    private static final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLProvisionedTokenInput> getHighSpeedVideoFpsRanges(java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> list) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken provisionedToken : list2) {
            com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(provisionedToken.getReferenceId());
            java.lang.String name2 = provisionedToken.getWalletType().name();
            java.lang.Object obj3 = (java.lang.Enum) com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType.UNKNOWN__;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                obj = kotlin.Result.m23436constructorimpl(java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType.class, name2));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                obj = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (!kotlin.Result.m23441isFailureimpl(obj)) {
                obj3 = obj;
            }
            com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletType creditExternalWalletType = (java.lang.Enum) obj3;
            java.lang.String name3 = provisionedToken.getDeviceType().name();
            java.lang.Object obj4 = (java.lang.Enum) com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType.UNKNOWN__;
            try {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                obj2 = kotlin.Result.m23436constructorimpl(java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CreditExternalWalletDeviceType.class, name3));
            } catch (java.lang.Throwable th2) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                obj2 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
            }
            if (!kotlin.Result.m23441isFailureimpl(obj2)) {
                obj4 = obj2;
            }
            arrayList.add(new com.paypal.oslo.api.graphql.schema.type.BNPLProvisionedTokenInput((java.lang.Enum) obj4, presentIfNotNull, creditExternalWalletType));
        }
        return arrayList;
    }
}
