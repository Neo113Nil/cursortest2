package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aa\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aC\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00002\b\u0010 \u001a\u0004\u0018\u00010\u00002\b\u0010!\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b$\u0010%\u001a=\u0010*\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010#2\b\u0010)\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b*\u0010+\u001aA\u00101\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u00002\b\u0010-\u001a\u0004\u0018\u00010\u00002\b\u0010.\u001a\u0004\u0018\u00010\u00002\b\u0010/\u001a\u0004\u0018\u00010\u00002\b\u00100\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b1\u00102"}, d2 = {"", "rawValue", "Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyStatus;", "mapClaimMoneyStatus", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyStatus;", "id", "statusRaw", "amountValue", "currencyCodeRaw", "Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;", "currencyCountryMapper", "Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyReceiver;", "receiver", "Lcom/paypal/oslo/feature/p2p/domain/model/NoteDetails;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "", "Lcom/paypal/oslo/feature/p2p/domain/model/Disclosure;", "disclosures", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;", "paymentLink", "Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyTransfer;", "buildClaimMoneyTransfer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/common/mapper/CurrencyCountryMapper;Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyReceiver;Lcom/paypal/oslo/feature/p2p/domain/model/NoteDetails;Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentLink;)Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyTransfer;", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "mapClaimReceiverType", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "Lcom/paypal/oslo/feature/p2p/domain/model/MdaProvider;", "mapMdaProvider", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/MdaProvider;", "", "hasPersonName", androidx.autofill.HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN, "personFullName", "businessName", "personInitials", "Lcom/paypal/oslo/feature/p2p/domain/model/ClaimReceiverName;", "mapClaimReceiverName", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/ClaimReceiverName;", "accountId", "typeRaw", "name", "profilePhotoUrl", "buildClaimMoneyReceiver", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ClaimReceiverName;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyReceiver;", "memo", "mediaId", "mediaProviderRaw", "mediaContentType", "mediaRefUrl", "mapClaimNote", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/NoteDetails;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClaimMoneyTransferCommonMappingKt {
    public static final com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus mapClaimMoneyStatus(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int hashCode = str.hashCode();
        if (hashCode != 35394935) {
            if (hashCode != 518126018) {
                if (hashCode == 1383663147 && str.equals("COMPLETED")) {
                    return com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus.COMPLETED;
                }
            } else if (str.equals("REVERSED")) {
                return com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus.REVERSED;
            }
        } else if (str.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS)) {
            return com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus.PENDING;
        }
        return com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyStatus.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer buildClaimMoneyTransfer(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.p2p.domain.common.mapper.CurrencyCountryMapper currencyCountryMapper, com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyReceiver claimMoneyReceiver, com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails, java.util.List<com.paypal.oslo.feature.p2p.domain.model.Disclosure> list, com.paypal.oslo.feature.p2p.domain.model.PaymentLink paymentLink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCountryMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimMoneyReceiver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer(str, mapClaimMoneyStatus(str2), new com.paypal.oslo.feature.p2p.domain.model.Amount(str3, str4, currencyCountryMapper.map(str4)), claimMoneyReceiver, noteDetails, paymentLink, list);
    }

    public static final com.paypal.oslo.feature.p2p.domain.model.ReceiverType mapClaimReceiverType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -2012879343:
                if (str.equals("EMAIL_ADDRESS")) {
                    return com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS;
                }
                break;
            case 27521304:
                if (str.equals("PEER_ID")) {
                    return com.paypal.oslo.feature.p2p.domain.model.ReceiverType.PEER_ID;
                }
                break;
            case 40276826:
                if (str.equals("PHONE_NUMBER")) {
                    return com.paypal.oslo.feature.p2p.domain.model.ReceiverType.PHONE_NUMBER;
                }
                break;
            case 516913366:
                if (str.equals("USERNAME")) {
                    return com.paypal.oslo.feature.p2p.domain.model.ReceiverType.USERNAME;
                }
                break;
            case 890848852:
                if (str.equals("UNIQUE_PAYMENT_CODE")) {
                    return com.paypal.oslo.feature.p2p.domain.model.ReceiverType.UNIQUE_PAYMENT_CODE;
                }
                break;
        }
        return com.paypal.oslo.feature.p2p.domain.model.ReceiverType.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.p2p.domain.model.MdaProvider mapMdaProvider(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(str, "PAYPAL") ? com.paypal.oslo.feature.p2p.domain.model.MdaProvider.PAYPAL : kotlin.jvm.internal.Intrinsics.areEqual(str, "GIPHY") ? com.paypal.oslo.feature.p2p.domain.model.MdaProvider.GIPHY : com.paypal.oslo.feature.p2p.domain.model.MdaProvider.UNKNOWN;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName mapClaimReceiverName$default(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str4 = null;
        }
        return mapClaimReceiverName(z, str, str2, str3, str4);
    }

    public static final com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName mapClaimReceiverName(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (z) {
            return new com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person(str, str2, str4);
        }
        if (str3 != null) {
            return new com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Business(str3);
        }
        return null;
    }

    public static final com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyReceiver buildClaimMoneyReceiver(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName claimReceiverName, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return new com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyReceiver(str, str2, mapClaimReceiverType(str3), claimReceiverName, str4);
    }

    public static final com.paypal.oslo.feature.p2p.domain.model.NoteDetails mapClaimNote(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem = null;
        if (str2 != null && str3 != null) {
            com.paypal.oslo.feature.p2p.domain.model.MdaProvider mapMdaProvider = mapMdaProvider(str3);
            if (str4 != null && str5 != null && mapMdaProvider != com.paypal.oslo.feature.p2p.domain.model.MdaProvider.UNKNOWN) {
                mediaItem = new com.paypal.oslo.feature.p2p.domain.model.MediaItem(mapMdaProvider, str4, str5, str2);
            }
        }
        return new com.paypal.oslo.feature.p2p.domain.model.NoteDetails(str, mediaItem);
    }
}
