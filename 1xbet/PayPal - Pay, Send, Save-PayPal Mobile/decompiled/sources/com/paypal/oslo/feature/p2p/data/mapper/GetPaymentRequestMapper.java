package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/GetPaymentRequestMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentRequest;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequest;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;", "currencyCountryMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentRequestDisclosureMapper;", "disclosureMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentRequestDisclosureMapper;)V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentRequestQuery$PaymentRequest;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequest;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentRequestDisclosureMapper;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetPaymentRequestMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest, com.paypal.oslo.feature.p2p.domain.model.PaymentRequest> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.PaymentRequestDisclosureMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetPaymentRequestMapper(com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper currencyCountryMapper, com.paypal.oslo.feature.p2p.data.mapper.PaymentRequestDisclosureMapper paymentRequestDisclosureMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCountryMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequestDisclosureMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = currencyCountryMapper;
        this.getHighSpeedVideoFpsRangesFor = paymentRequestDisclosureMapper;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.PaymentRequest map(com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentRequest input) {
        com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName paymentRequestReceiverName;
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType;
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails;
        java.util.List emptyList;
        com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem;
        com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Business business;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String obj = input.getAmount().getCurrencyCode().toString();
        java.lang.String obj2 = input.getId().toString();
        com.paypal.oslo.feature.p2p.domain.model.Amount amount = new com.paypal.oslo.feature.p2p.domain.model.Amount(input.getAmount().getValue(), obj, this.getHighResolutionOutputSizeshNQ4ISI.map(obj));
        java.lang.String rawValue = input.getStatus().getRawValue();
        com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Receiver receiver = input.getReceiver();
        com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Name name2 = receiver.getName();
        if (name2 != null) {
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnPersonName onPersonName = name2.getOnPersonName();
            if (onPersonName != null) {
                business = new com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Person(onPersonName.getGivenName(), onPersonName.getFullName());
            } else {
                com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.OnBusinessName onBusinessName = name2.getOnBusinessName();
                business = onBusinessName != null ? new com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Business(onBusinessName.getBusinessName()) : null;
            }
            paymentRequestReceiverName = business;
        } else {
            paymentRequestReceiverName = null;
        }
        java.lang.String accountId = receiver.getAccountId();
        java.lang.String obj3 = accountId != null ? accountId.toString() : null;
        java.lang.String obj4 = receiver.getId().toString();
        java.lang.String rawValue2 = receiver.getType().getRawValue();
        switch (rawValue2.hashCode()) {
            case -2012879343:
                rawValue2.equals("EMAIL_ADDRESS");
                receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS;
                break;
            case 40276826:
                if (rawValue2.equals("PHONE_NUMBER")) {
                    receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.PHONE_NUMBER;
                    break;
                }
                receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS;
                break;
            case 516913366:
                if (rawValue2.equals("USERNAME")) {
                    receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.USERNAME;
                    break;
                }
                receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS;
                break;
            case 890848852:
                if (rawValue2.equals("UNIQUE_PAYMENT_CODE")) {
                    receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.UNIQUE_PAYMENT_CODE;
                    break;
                }
                receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS;
                break;
            default:
                receiverType = com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS;
                break;
        }
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType2 = receiverType;
        java.lang.Object profilePhotoUrl = receiver.getProfilePhotoUrl();
        com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiver paymentRequestReceiver = new com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiver(obj3, obj4, receiverType2, paymentRequestReceiverName, profilePhotoUrl != null ? profilePhotoUrl.toString() : null);
        com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Note note = input.getNote();
        if (note != null) {
            java.lang.String memo = note.getMemo();
            com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Media media = note.getMedia();
            if (media != null) {
                mediaItem = new com.paypal.oslo.feature.p2p.domain.model.MediaItem(kotlin.jvm.internal.Intrinsics.areEqual(media.getProvider().getRawValue(), "PAYPAL") ? com.paypal.oslo.feature.p2p.domain.model.MdaProvider.PAYPAL : com.paypal.oslo.feature.p2p.domain.model.MdaProvider.GIPHY, media.getContentType().toString(), media.getReferenceUrl().toString(), media.getId());
            } else {
                mediaItem = null;
            }
            noteDetails = new com.paypal.oslo.feature.p2p.domain.model.NoteDetails(memo, mediaItem);
        } else {
            noteDetails = null;
        }
        com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.PaymentLink paymentLink = input.getPaymentLink();
        com.paypal.oslo.feature.p2p.domain.model.PaymentLink mapPaymentLink = paymentLink != null ? com.paypal.oslo.feature.p2p.data.mapper.PaymentLinkMappingKt.mapPaymentLink(paymentLink.getUrl(), paymentLink.getExpirationTime()) : null;
        java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure> disclosures = input.getDisclosures();
        if (disclosures != null) {
            java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure> list = disclosures;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.getHighSpeedVideoFpsRangesFor.map(((com.paypal.oslo.feature.p2p.graphql.GetPaymentRequestQuery.Disclosure) it.next()).getPaymentRequestDisclosureFragment()));
            }
            emptyList = arrayList;
        } else {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        return new com.paypal.oslo.feature.p2p.domain.model.PaymentRequest(obj2, amount, rawValue, paymentRequestReceiver, noteDetails, mapPaymentLink, emptyList);
    }
}
