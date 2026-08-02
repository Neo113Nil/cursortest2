package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/StartPaymentTransferAttemptForSubflowMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$PaymentTransferAttempt;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/p2p/domain/error/PaymentTransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;", "Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowFundingOptionsMapper;", "fundingOptionsMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowIntentMapper;", "intentMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowTransferTypeMapper;", "transferTypeMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowRecommendedContactMapper;", "recommendedContactMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowFundingOptionsMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowIntentMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowTransferTypeMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowRecommendedContactMapper;)V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/StartPaymentTransferAttemptForSubflowMutation$PaymentTransferAttempt;)Larrow/core/Either;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowFundingOptionsMapper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowIntentMapper;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowTransferTypeMapper;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/data/mapper/SubflowRecommendedContactMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StartPaymentTransferAttemptForSubflowMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentTransferAttempt, arrow.core.Either<? extends com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt>> {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.data.mapper.SubflowFundingOptionsMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.SubflowTransferTypeMapper getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.p2p.data.mapper.SubflowRecommendedContactMapper getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public StartPaymentTransferAttemptForSubflowMapper(com.paypal.oslo.feature.p2p.data.mapper.SubflowFundingOptionsMapper subflowFundingOptionsMapper, com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper subflowIntentMapper, com.paypal.oslo.feature.p2p.data.mapper.SubflowTransferTypeMapper subflowTransferTypeMapper, com.paypal.oslo.feature.p2p.data.mapper.SubflowRecommendedContactMapper subflowRecommendedContactMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subflowFundingOptionsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subflowIntentMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subflowTransferTypeMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subflowRecommendedContactMapper, "");
        this.Camera2StreamConfigurationMap = subflowFundingOptionsMapper;
        this.getHighSpeedVideoSizes = subflowIntentMapper;
        this.getHighSpeedVideoFpsRangesFor = subflowTransferTypeMapper;
        this.getHighSpeedVideoFpsRanges = subflowRecommendedContactMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00da A[Catch: all -> 0x01ea, RaiseCancellationException -> 0x01f3, TryCatch #2 {RaiseCancellationException -> 0x01f3, all -> 0x01ea, blocks: (B:3:0x000f, B:5:0x001b, B:7:0x0022, B:9:0x0028, B:11:0x0030, B:13:0x0036, B:14:0x004d, B:16:0x0053, B:18:0x005b, B:19:0x0062, B:20:0x0076, B:22:0x00aa, B:23:0x00ac, B:25:0x00b3, B:27:0x00b9, B:31:0x00d4, B:33:0x00da, B:35:0x00e0, B:36:0x00e7, B:38:0x00ed, B:39:0x00f6, B:40:0x00fd, B:41:0x0114, B:43:0x011a, B:45:0x012a, B:47:0x0133, B:48:0x013c, B:50:0x0142, B:51:0x0153, B:53:0x0159, B:55:0x0169, B:57:0x016f, B:58:0x0176, B:59:0x018b, B:61:0x0191, B:63:0x01ae, B:65:0x01b7, B:66:0x01bd, B:74:0x00c2, B:76:0x00c8, B:78:0x00ce, B:80:0x007a, B:83:0x0083, B:84:0x0086, B:87:0x008f, B:88:0x0092, B:91:0x009b, B:92:0x009e, B:95:0x00a7, B:98:0x0041, B:99:0x004b, B:102:0x01df, B:103:0x01e9), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed A[Catch: all -> 0x01ea, RaiseCancellationException -> 0x01f3, TryCatch #2 {RaiseCancellationException -> 0x01f3, all -> 0x01ea, blocks: (B:3:0x000f, B:5:0x001b, B:7:0x0022, B:9:0x0028, B:11:0x0030, B:13:0x0036, B:14:0x004d, B:16:0x0053, B:18:0x005b, B:19:0x0062, B:20:0x0076, B:22:0x00aa, B:23:0x00ac, B:25:0x00b3, B:27:0x00b9, B:31:0x00d4, B:33:0x00da, B:35:0x00e0, B:36:0x00e7, B:38:0x00ed, B:39:0x00f6, B:40:0x00fd, B:41:0x0114, B:43:0x011a, B:45:0x012a, B:47:0x0133, B:48:0x013c, B:50:0x0142, B:51:0x0153, B:53:0x0159, B:55:0x0169, B:57:0x016f, B:58:0x0176, B:59:0x018b, B:61:0x0191, B:63:0x01ae, B:65:0x01b7, B:66:0x01bd, B:74:0x00c2, B:76:0x00c8, B:78:0x00ce, B:80:0x007a, B:83:0x0083, B:84:0x0086, B:87:0x008f, B:88:0x0092, B:91:0x009b, B:92:0x009e, B:95:0x00a7, B:98:0x0041, B:99:0x004b, B:102:0x01df, B:103:0x01e9), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f4  */
    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt> map(com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.PaymentTransferAttempt input) {
        com.paypal.oslo.feature.p2p.domain.model.Amount amount;
        com.paypal.oslo.feature.p2p.domain.model.AttemptReceiver attemptReceiver;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType;
        java.lang.String str;
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnBusinessName1 onBusinessName;
        java.lang.String businessName;
        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName1 onPersonName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.lang.Object id = input.getId();
            java.lang.String str2 = id instanceof java.lang.String ? (java.lang.String) id : null;
            if (str2 == null) {
                defaultRaise2.raise(com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.DataNotFound.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.TransferAmount transferAmount = input.getTransferAmount();
            if (transferAmount != null) {
                java.lang.Object currencyCode = transferAmount.getCurrencyCode();
                java.lang.String str3 = currencyCode instanceof java.lang.String ? (java.lang.String) currencyCode : null;
                if (str3 == null) {
                    defaultRaise2.raise(com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                amount = new com.paypal.oslo.feature.p2p.domain.model.Amount(transferAmount.getValue(), str3, str3);
            } else {
                amount = null;
            }
            com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Receiver receiver = input.getReceiver();
            if (receiver != null) {
                java.lang.String accountId = receiver.getAccountId();
                java.lang.String obj = accountId != null ? accountId.toString() : null;
                java.lang.String obj2 = receiver.getId().toString();
                java.lang.String rawValue = receiver.getType().getRawValue();
                switch (rawValue.hashCode()) {
                    case -2012879343:
                        if (rawValue.equals("EMAIL_ADDRESS")) {
                            receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS;
                            break;
                        } else {
                            receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS;
                            break;
                        }
                    case 40276826:
                        if (rawValue.equals("PHONE_NUMBER")) {
                            receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.PHONE_NUMBER;
                            break;
                        } else {
                            receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS;
                            break;
                        }
                    case 516913366:
                        if (rawValue.equals("USERNAME")) {
                            receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.USERNAME;
                            break;
                        } else {
                            receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS;
                            break;
                        }
                    case 890848852:
                        if (rawValue.equals("UNIQUE_PAYMENT_CODE")) {
                            receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.UNIQUE_PAYMENT_CODE;
                            break;
                        } else {
                            receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS;
                            break;
                        }
                    default:
                        receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS;
                        break;
                }
                com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType2 = receiverType;
                com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name1 name2 = receiver.getName();
                if (name2 != null) {
                    com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.OnPersonName1 onPersonName2 = name2.getOnPersonName();
                    if (onPersonName2 != null) {
                        businessName = onPersonName2.getGivenName();
                        if (businessName == null) {
                        }
                        str = businessName;
                        com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name1 name3 = receiver.getName();
                        java.lang.String surname = (name3 != null || (onPersonName = name3.getOnPersonName()) == null) ? null : onPersonName.getSurname();
                        java.lang.Object profilePhotoUrl = receiver.getProfilePhotoUrl();
                        attemptReceiver = new com.paypal.oslo.feature.p2p.domain.model.AttemptReceiver(obj, obj2, receiverType2, str, surname, profilePhotoUrl != null ? profilePhotoUrl.toString() : null);
                    }
                }
                com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name1 name4 = receiver.getName();
                if (name4 == null || (onBusinessName = name4.getOnBusinessName()) == null) {
                    str = null;
                    com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name1 name32 = receiver.getName();
                    if (name32 != null) {
                    }
                    java.lang.Object profilePhotoUrl2 = receiver.getProfilePhotoUrl();
                    attemptReceiver = new com.paypal.oslo.feature.p2p.domain.model.AttemptReceiver(obj, obj2, receiverType2, str, surname, profilePhotoUrl2 != null ? profilePhotoUrl2.toString() : null);
                } else {
                    businessName = onBusinessName.getBusinessName();
                    str = businessName;
                    com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.Name1 name322 = receiver.getName();
                    if (name322 != null) {
                    }
                    java.lang.Object profilePhotoUrl22 = receiver.getProfilePhotoUrl();
                    attemptReceiver = new com.paypal.oslo.feature.p2p.domain.model.AttemptReceiver(obj, obj2, receiverType2, str, surname, profilePhotoUrl22 != null ? profilePhotoUrl22.toString() : null);
                }
            } else {
                attemptReceiver = null;
            }
            java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent> supportedIntents = input.getSupportedIntents();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportedIntents, 10));
            java.util.Iterator<T> it = supportedIntents.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.getHighSpeedVideoSizes.map((com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent) it.next()));
            }
            java.util.ArrayList arrayList3 = arrayList2;
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferIntent selectedIntent = input.getSelectedIntent();
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent map = selectedIntent != null ? this.getHighSpeedVideoSizes.map(selectedIntent) : null;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.RecommendedContact> recommendedContacts = input.getRecommendedContacts();
            if (recommendedContacts != null) {
                java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.RecommendedContact> list = recommendedContacts;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(this.getHighSpeedVideoFpsRanges.map((com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.RecommendedContact) it2.next()));
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
            java.util.List<com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.SupportedTransferType> supportedTransferTypes = input.getSupportedTransferTypes();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportedTransferTypes, 10));
            for (com.paypal.oslo.feature.p2p.graphql.StartPaymentTransferAttemptForSubflowMutation.SupportedTransferType supportedTransferType : supportedTransferTypes) {
                arrayList5.add(new com.paypal.oslo.feature.p2p.domain.model.TransferType(this.getHighSpeedVideoFpsRangesFor.map(supportedTransferType.getType()), supportedTransferType.getDefault()));
            }
            java.util.ArrayList arrayList6 = arrayList5;
            com.paypal.oslo.api.graphql.schema.type.PaymentTransferType selectedTransferType = input.getSelectedTransferType();
            com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt paymentTransferAttempt = new com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt(str2, amount, arrayList3, map, emptyList, attemptReceiver, arrayList6, selectedTransferType != null ? this.getHighSpeedVideoFpsRangesFor.map(selectedTransferType) : null, this.Camera2StreamConfigurationMap.map(input.getFundingOptions()), null, 512, null);
            defaultRaise.complete();
            return new arrow.core.Either.Right(paymentTransferAttempt);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
