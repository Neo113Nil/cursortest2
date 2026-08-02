package com.paypal.oslo.feature.debitcard.servicing.util;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\n\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00000\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\u0003*\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0003*\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0003*\u00020\u0014H\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0014H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\u0019*\u00020\u0014H\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u0019*\u00020\u0014H\u0000¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0019*\u00020\u0014H\u0000¢\u0006\u0004\b\u001e\u0010\u001b\u001a\u001b\u0010 \u001a\u00020\u001f*\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010#\u001a\u00020\"*\u00020\u0014H\u0000¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010&\u001a\u00020%*\u00020\u0014H\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010.\u001a\u00020\u0019*\u00020\u0019H\u0000¢\u0006\u0004\b.\u0010/\u001a\u0013\u00102\u001a\u000201*\u000200H\u0000¢\u0006\u0004\b2\u00103\u001a\u0015\u00104\u001a\u0004\u0018\u00010\u000e*\u000200H\u0000¢\u0006\u0004\b4\u00105"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentOperation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "", "hasOperation", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentOperation;)Z", "", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "isAdditionalCardholderManagementEnabled", "shouldShowSecondaryCardholderDropdown", "(Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Z)Z", "canAddSecondaryCardholder", "(Ljava/util/List;)Z", "", "getMaxAdditionalCardsAllowed", "(Ljava/util/List;)I", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "toCardReplacementInfo", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;", "isCardLocked", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;)Z", "isPinRequired", "isPhysicalCardFee", "", "getCardLastFourDigits", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;)Ljava/lang/String;", "getCardArtUrl", "getShortName", "getAgreementUrl", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "toCancelCardInfo", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/ViewPinInfo;", "toViewPinInfo", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/ViewPinInfo;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;", "toRequestPhysicalCardInfo", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementState;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentPinStatus;", "pinStatus", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentPinOrigin;", "pinOrigin", "isCreatePinFlow", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentPinStatus;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentPinOrigin;)Z", "toInitials", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;", "Lcom/paypal/pds/components/BadgeStyle;", "getBadgeStyle", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;)Lcom/paypal/pds/components/BadgeStyle;", "getStatusTextResId", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;)Ljava/lang/Integer;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitInstrumentExtensionsKt {
    public static final boolean hasOperation(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentOperation, "");
        return debitInstrument.getOperations().contains(debitInstrumentOperation);
    }

    public static final boolean shouldShowSecondaryCardholderDropdown(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, boolean z) {
        java.lang.Integer num;
        java.lang.Object obj;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails productDetails;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getPrimary()) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        if (debitInstrument != null && (productDetails = debitInstrument.getProductDetails()) != null) {
            num = productDetails.getMaxAdditionalCardsAllowed();
        }
        return (z || debitInstrument == null || num == null || debitCardProductName != com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD || num.intValue() <= 0) ? false : true;
    }

    public static final boolean canAddSecondaryCardholder(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list) {
        java.lang.Object obj;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails productDetails;
        java.lang.Integer maxAdditionalCardsAllowed;
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list2 = list;
        java.util.Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getPrimary()) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        if (debitInstrument == null || (productDetails = debitInstrument.getProductDetails()) == null || (maxAdditionalCardsAllowed = productDetails.getMaxAdditionalCardsAllowed()) == null) {
            return true;
        }
        int intValue = maxAdditionalCardsAllowed.intValue();
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator<T> it2 = list2.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (!((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) it2.next()).getPrimary() && (i = i + 1) < 0) {
                    kotlin.collections.CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i < intValue;
    }

    public static final int getMaxAdditionalCardsAllowed(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list) {
        java.lang.Object obj;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails productDetails;
        java.lang.Integer maxAdditionalCardsAllowed;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getPrimary()) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        if (debitInstrument == null || (productDetails = debitInstrument.getProductDetails()) == null || (maxAdditionalCardsAllowed = productDetails.getMaxAdditionalCardsAllowed()) == null) {
            return 0;
        }
        return maxAdditionalCardsAllowed.intValue();
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo toCardReplacementInfo(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        java.util.List<java.lang.String> displayAddress;
        java.lang.String joinToString$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        java.lang.String id = debitInstrument.getId();
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName fromValue = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.fromValue(debitInstrument.getProductName());
        java.lang.String lastNChars = debitInstrument.getLastNChars();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBillingAddress billingAddress = debitInstrument.getCardHolder().getBillingAddress();
        java.lang.String str = (billingAddress == null || (displayAddress = billingAddress.getDisplayAddress()) == null || (joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(displayAddress, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null)) == null) ? "" : joinToString$default;
        java.lang.String url = debitInstrument.getProductDetails().getLargeImage().getFront().getUrl();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentBillingAddress billingAddress2 = debitInstrument.getCardHolder().getBillingAddress();
        return new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo(id, fromValue, lastNChars, str, url, billingAddress2 != null ? billingAddress2.getId() : null, (java.lang.String) null, (com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementFlowType) null, debitInstrument.getPrimary(), 192, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final boolean isCardLocked(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState) {
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState;
        java.lang.Object obj;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentStatus status;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementState, "");
        java.util.Iterator<T> it = debitCardManagementState.getCachedInstruments().iterator();
        while (true) {
            debitInstrumentDisplayState = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getId(), debitCardManagementState.getCardId())) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        if (debitInstrument != null && (status = debitInstrument.getStatus()) != null) {
            debitInstrumentDisplayState = status.getDisplayState();
        }
        return debitInstrumentDisplayState == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.LOCKED;
    }

    public static final boolean isPinRequired(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementState, "");
        java.util.Iterator<T> it = debitCardManagementState.getCachedInstruments().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getId(), debitCardManagementState.getCardId())) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        return (debitInstrument != null ? debitInstrument.getPinStatus() : null) != com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus.SET;
    }

    public static final boolean isPhysicalCardFee(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState) {
        java.lang.Object obj;
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> operations;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementState, "");
        java.util.Iterator<T> it = debitCardManagementState.getCachedInstruments().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getId(), debitCardManagementState.getCardId())) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        if (debitInstrument == null || (operations = debitInstrument.getOperations()) == null) {
            return false;
        }
        return operations.contains(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation.REQUEST_PHYSICAL_CARD_WITH_FEE);
    }

    public static final java.lang.String getCardLastFourDigits(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementState, "");
        java.util.Iterator<T> it = debitCardManagementState.getCachedInstruments().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getId(), debitCardManagementState.getCardId())) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        java.lang.String lastNChars = debitInstrument != null ? debitInstrument.getLastNChars() : null;
        return kotlin.text.StringsKt.takeLast(lastNChars != null ? lastNChars : "", 4);
    }

    public static final java.lang.String getCardArtUrl(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState) {
        java.lang.String str;
        java.lang.Object obj;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails productDetails;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrls largeImage;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentImageUrl front;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementState, "");
        java.util.Iterator<T> it = debitCardManagementState.getCachedInstruments().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getId(), debitCardManagementState.getCardId())) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        if (debitInstrument != null && (productDetails = debitInstrument.getProductDetails()) != null && (largeImage = productDetails.getLargeImage()) != null && (front = largeImage.getFront()) != null) {
            str = front.getUrl();
        }
        return str == null ? "" : str;
    }

    public static final java.lang.String getShortName(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState) {
        java.lang.String str;
        java.lang.Object obj;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails productDetails;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementState, "");
        java.util.Iterator<T> it = debitCardManagementState.getCachedInstruments().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getId(), debitCardManagementState.getCardId())) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        if (debitInstrument != null && (productDetails = debitInstrument.getProductDetails()) != null) {
            str = productDetails.getShortName();
        }
        return str == null ? "" : str;
    }

    public static final java.lang.String getAgreementUrl(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState) {
        java.lang.Object obj;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentProductDetails productDetails;
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> links;
        java.lang.Object obj2;
        java.lang.String url;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementState, "");
        java.util.Iterator<T> it = debitCardManagementState.getCachedInstruments().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj).getId(), debitCardManagementState.getCardId())) {
                break;
            }
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument) obj;
        if (debitInstrument != null && (productDetails = debitInstrument.getProductDetails()) != null && (links = productDetails.getLinks()) != null) {
            java.util.Iterator<T> it2 = links.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails) obj2).getType() == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkType.LEARN_MORE) {
                    break;
                }
            }
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails debitInstrumentLinkDetails = (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails) obj2;
            if (debitInstrumentLinkDetails != null && (url = debitInstrumentLinkDetails.getUrl()) != null && !kotlin.text.StringsKt.isBlank(url)) {
                return url;
            }
        }
        return null;
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo toCancelCardInfo(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo(debitCardProductName, java.lang.String.valueOf(debitCardManagementState.getCardId()), getCardLastFourDigits(debitCardManagementState), getShortName(debitCardManagementState), false, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.ViewPinInfo toViewPinInfo(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementState, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.ViewPinInfo(java.lang.String.valueOf(debitCardManagementState.getCardId()), debitCardManagementState.getProductName(), getShortName(debitCardManagementState));
    }

    public static final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo toRequestPhysicalCardInfo(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState debitCardManagementState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardManagementState, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo(java.lang.String.valueOf(debitCardManagementState.getCardId()), debitCardManagementState.getProductName(), getCardArtUrl(debitCardManagementState), getAgreementUrl(debitCardManagementState), isPinRequired(debitCardManagementState), isPhysicalCardFee(debitCardManagementState));
    }

    public static final boolean isCreatePinFlow(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus debitInstrumentPinStatus, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin debitInstrumentPinOrigin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPinStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentPinOrigin, "");
        if (debitInstrumentPinStatus != com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus.UNSET) {
            return debitInstrumentPinStatus == com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinStatus.SET && debitInstrumentPinOrigin != com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentPinOrigin.USER;
        }
        return true;
    }

    public static final java.lang.String toInitials(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{" "}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : split$default) {
            if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION;
        }
        if (arrayList2.size() == 1) {
            return java.lang.String.valueOf(java.lang.Character.toUpperCase(kotlin.text.StringsKt.first((java.lang.CharSequence) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2))));
        }
        char upperCase = java.lang.Character.toUpperCase(kotlin.text.StringsKt.first((java.lang.CharSequence) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2)));
        char upperCase2 = java.lang.Character.toUpperCase(kotlin.text.StringsKt.first((java.lang.CharSequence) kotlin.collections.CollectionsKt.last((java.util.List) arrayList2)));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(upperCase);
        sb.append(upperCase2);
        return sb.toString();
    }

    public static final com.paypal.pds.components.BadgeStyle getBadgeStyle(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentDisplayState, "");
        switch (com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.WhenMappings.$EnumSwitchMapping$0[debitInstrumentDisplayState.ordinal()]) {
            case 1:
                return com.paypal.pds.components.BadgeStyle.Warning.INSTANCE;
            case 2:
            case 3:
            case 4:
                return com.paypal.pds.components.BadgeStyle.Info.INSTANCE;
            case 5:
                return com.paypal.pds.components.BadgeStyle.Positive.INSTANCE;
            case 6:
                return com.paypal.pds.components.BadgeStyle.Negative.INSTANCE;
            default:
                return com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE;
        }
    }

    public static final java.lang.Integer getStatusTextResId(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentDisplayState, "");
        switch (com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.WhenMappings.$EnumSwitchMapping$0[debitInstrumentDisplayState.ordinal()]) {
            case 1:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_locked);
            case 2:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_status_ordered);
            case 3:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_status_shipped);
            case 4:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate);
            case 5:
            case 7:
                return null;
            case 6:
                return java.lang.Integer.valueOf(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_status_deactivated);
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.LOCKED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ORDERED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.SHIPPED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ACTIVATE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.ACTIVE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.DEACTIVATED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
