package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/ClaimMoneyTransferMapper;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/Mapper;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferQuery$OnPaymentTransfer;", "Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyTransfer;", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;", "currencyCountryMapper", "Lcom/paypal/oslo/feature/p2p/data/mapper/PostTransferDisclosureMapper;", "postTransferDisclosureMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;Lcom/paypal/oslo/feature/p2p/data/mapper/PostTransferDisclosureMapper;)V", "input", "map", "(Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferQuery$OnPaymentTransfer;)Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyTransfer;", "Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferQuery$OnPersonName;", androidx.autofill.HintConstants.AUTOFILL_HINT_PERSON_NAME, "", "extractPersonNameInitials$p2p_prodRelease", "(Lcom/paypal/oslo/feature/p2p/graphql/GetPaymentTransferQuery$OnPersonName;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/data/mapper/PostTransferDisclosureMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClaimMoneyTransferMapper implements com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.OnPaymentTransfer, com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer> {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ClaimMoneyTransferMapper(com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper currencyCountryMapper, com.paypal.oslo.feature.p2p.data.mapper.PostTransferDisclosureMapper postTransferDisclosureMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCountryMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postTransferDisclosureMapper, "");
        this.Camera2StreamConfigurationMap = currencyCountryMapper;
        this.getHighSpeedVideoFpsRanges = postTransferDisclosureMapper;
    }

    @Override // com.paypal.oslo.feature.p2p.domain.common.mapper.Mapper
    public final com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer map(com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.OnPaymentTransfer input) {
        com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName claimReceiverName;
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails;
        java.util.ArrayList arrayList;
        java.lang.Object referenceUrl;
        java.lang.Object contentType;
        com.paypal.oslo.api.graphql.schema.type.MediaProvider provider;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String obj = input.getTransactionID().toString();
        java.lang.String rawValue = input.getPaymentStatus().getRawValue();
        java.lang.String value = input.getTransferAmount().getValue();
        java.lang.String obj2 = input.getTransferAmount().getCurrencyCode().toString();
        com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper currencyCountryMapper = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Receiver receiver = input.getReceiver();
        java.lang.String accountId = receiver.getAccountId();
        java.lang.String obj3 = accountId != null ? accountId.toString() : null;
        java.lang.String obj4 = receiver.getId().toString();
        java.lang.String rawValue2 = receiver.getType().getRawValue();
        com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Name name2 = receiver.getName();
        if (name2 != null) {
            java.lang.String extractPersonNameInitials$p2p_prodRelease = extractPersonNameInitials$p2p_prodRelease(name2.getOnPersonName());
            boolean z = name2.getOnPersonName() != null;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.OnPersonName onPersonName = name2.getOnPersonName();
            java.lang.String givenName = onPersonName != null ? onPersonName.getGivenName() : null;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.OnPersonName onPersonName2 = name2.getOnPersonName();
            java.lang.String fullName = onPersonName2 != null ? onPersonName2.getFullName() : null;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.OnBusinessName onBusinessName = name2.getOnBusinessName();
            claimReceiverName = com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferCommonMappingKt.mapClaimReceiverName(z, givenName, fullName, onBusinessName != null ? onBusinessName.getBusinessName() : null, extractPersonNameInitials$p2p_prodRelease);
        } else {
            claimReceiverName = null;
        }
        java.lang.Object profilePhotoUrl = receiver.getProfilePhotoUrl();
        com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyReceiver buildClaimMoneyReceiver = com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferCommonMappingKt.buildClaimMoneyReceiver(obj3, obj4, rawValue2, claimReceiverName, profilePhotoUrl != null ? profilePhotoUrl.toString() : null);
        com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Note note = input.getNote();
        if (note != null) {
            java.lang.String memo = note.getMemo();
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Media media = note.getMedia();
            java.lang.String id = media != null ? media.getId() : null;
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Media media2 = note.getMedia();
            java.lang.String rawValue3 = (media2 == null || (provider = media2.getProvider()) == null) ? null : provider.getRawValue();
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Media media3 = note.getMedia();
            java.lang.String obj5 = (media3 == null || (contentType = media3.getContentType()) == null) ? null : contentType.toString();
            com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Media media4 = note.getMedia();
            noteDetails = com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferCommonMappingKt.mapClaimNote(memo, id, rawValue3, obj5, (media4 == null || (referenceUrl = media4.getReferenceUrl()) == null) ? null : referenceUrl.toString());
        } else {
            noteDetails = null;
        }
        java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Disclosure> disclosures = input.getDisclosures();
        if (disclosures != null) {
            java.util.List<com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Disclosure> list = disclosures;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.getHighSpeedVideoFpsRanges.map(((com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.Disclosure) it.next()).getPostTransferDisclosureFragment()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
        com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.PaymentLink paymentLink = input.getPaymentLink();
        return com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferCommonMappingKt.buildClaimMoneyTransfer(obj, rawValue, value, obj2, currencyCountryMapper, buildClaimMoneyReceiver, noteDetails, emptyList, paymentLink != null ? com.paypal.oslo.feature.p2p.data.mapper.PaymentLinkMappingKt.mapPaymentLink(paymentLink.getUrl(), paymentLink.getExpirationTime()) : null);
    }

    public final java.lang.String extractPersonNameInitials$p2p_prodRelease(com.paypal.oslo.feature.p2p.graphql.GetPaymentTransferQuery.OnPersonName personName) {
        java.lang.Character firstOrNull;
        java.lang.Character firstOrNull2;
        if (personName != null) {
            java.lang.String givenName = personName.getGivenName();
            java.lang.String valueOf = (givenName == null || (firstOrNull2 = kotlin.text.StringsKt.firstOrNull(givenName)) == null) ? null : java.lang.String.valueOf(firstOrNull2.charValue());
            if (valueOf == null) {
                valueOf = "";
            }
            java.lang.String surname = personName.getSurname();
            java.lang.String valueOf2 = (surname == null || (firstOrNull = kotlin.text.StringsKt.firstOrNull(surname)) == null) ? null : java.lang.String.valueOf(firstOrNull.charValue());
            java.lang.String str = valueOf2 != null ? valueOf2 : "";
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(valueOf);
            sb.append(str);
            java.lang.String obj = sb.toString();
            if (obj.length() > 0) {
                return obj;
            }
        }
        return null;
    }
}
