package com.paypal.oslo.feature.bnplacquisition.ui.common.util;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0014\u0010\nJ\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0015\u0010\nJ#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/util/AddressFormatter;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "formatAddressUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;)V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "", "preformatBillingAddress", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "formatMultiline", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "addresses", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FormattedAddressOverviewItem;", "preformatAddressList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "toAddressesI18n", "(Ljava/util/List;)Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressFormatter {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AddressFormatter(com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatAddressUseCase, "");
        this.getHighSpeedVideoSizes = formatAddressUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object preformatBillingAddress(com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatBillingAddress$1 addressFormatter$preformatBillingAddress$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.core.i18n.domain.model.Address address2 = address;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatBillingAddress$1) {
            addressFormatter$preformatBillingAddress$1 = (com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatBillingAddress$1) continuation;
            if ((addressFormatter$preformatBillingAddress$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                addressFormatter$preformatBillingAddress$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = addressFormatter$preformatBillingAddress$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addressFormatter$preformatBillingAddress$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration = new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, null, null, com.paypal.oslo.core.i18n.domain.model.Address.Style.MULTILINE, null, null, 111, null);
                    addressFormatter$preformatBillingAddress$1.getHighSpeedVideoFpsRanges = address2;
                    addressFormatter$preformatBillingAddress$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = formatAddressUseCase.invoke(address2, addressConfiguration, addressFormatter$preformatBillingAddress$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    address2 = (com.paypal.oslo.core.i18n.domain.model.Address) addressFormatter$preformatBillingAddress$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.i18n.domain.model.Field[] fieldArr = new com.paypal.oslo.core.i18n.domain.model.Field[5];
                    java.lang.String m11248getAddressLine1rVKqk9c = address2.m11248getAddressLine1rVKqk9c();
                    fieldArr[0] = m11248getAddressLine1rVKqk9c != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11272boximpl(m11248getAddressLine1rVKqk9c) : null;
                    java.lang.String m11249getAddressLine2c7KZG_s = address2.m11249getAddressLine2c7KZG_s();
                    fieldArr[1] = m11249getAddressLine2c7KZG_s != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11281boximpl(m11249getAddressLine2c7KZG_s) : null;
                    java.lang.String m11251getAdminArea1bsDj6rY = address2.m11251getAdminArea1bsDj6rY();
                    fieldArr[2] = m11251getAdminArea1bsDj6rY != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11299boximpl(m11251getAdminArea1bsDj6rY) : null;
                    java.lang.String m11252getAdminArea2DR8a_90 = address2.m11252getAdminArea2DR8a_90();
                    fieldArr[3] = m11252getAdminArea2DR8a_90 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11308boximpl(m11252getAdminArea2DR8a_90) : null;
                    java.lang.String m11256getPostalCodeyjZ2Xzc = address2.m11256getPostalCodeyjZ2Xzc();
                    fieldArr[4] = m11256getPostalCodeyjZ2Xzc != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11459boximpl(m11256getPostalCodeyjZ2Xzc) : null;
                    return kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) fieldArr), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter.$r8$lambda$7ISVqdOIcVUXJMSsR4rgnBorROE((com.paypal.oslo.core.i18n.domain.model.Field) obj2);
                        }
                    }, 30, null);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        addressFormatter$preformatBillingAddress$1 = new com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatBillingAddress$1(this, continuation);
        java.lang.Object obj2 = addressFormatter$preformatBillingAddress$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addressFormatter$preformatBillingAddress$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object formatMultiline(com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$formatMultiline$1 addressFormatter$formatMultiline$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$formatMultiline$1) {
            addressFormatter$formatMultiline$1 = (com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$formatMultiline$1) continuation;
            if ((addressFormatter$formatMultiline$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                addressFormatter$formatMultiline$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = addressFormatter$formatMultiline$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addressFormatter$formatMultiline$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (address == null) {
                        str = null;
                        return str == null ? "" : str;
                    }
                    com.paypal.oslo.core.i18n.domain.model.Address addressI18n = com.paypal.oslo.feature.bnplacquisition.domain.model.address.AddressKt.toAddressI18n(address);
                    addressFormatter$formatMultiline$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
                    addressFormatter$formatMultiline$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
                    addressFormatter$formatMultiline$1.getHighSpeedVideoFpsRangesFor = 0;
                    addressFormatter$formatMultiline$1.getHighSpeedVideoSizes = 1;
                    obj = preformatBillingAddress(addressI18n, addressFormatter$formatMultiline$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = addressFormatter$formatMultiline$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str == null) {
                }
            }
        }
        addressFormatter$formatMultiline$1 = new com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$formatMultiline$1(this, continuation);
        java.lang.Object obj2 = addressFormatter$formatMultiline$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addressFormatter$formatMultiline$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x015f -> B:11:0x0169). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object preformatAddressList(java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> list, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatAddressList$1 addressFormatter$preformatAddressList$1;
        int i;
        java.util.Collection arrayList;
        java.util.Iterator it;
        int i2;
        int i3;
        java.lang.Object obj;
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatAddressList$1 addressFormatter$preformatAddressList$12;
        java.lang.Object obj2;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> list2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.util.Collection collection;
        java.util.Iterator it2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address;
        com.paypal.oslo.core.i18n.domain.model.Address address2;
        java.util.Collection collection2;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> list3;
        java.lang.Object obj5;
        int i4;
        int i5;
        java.lang.Object Camera2StreamConfigurationMap;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatAddressList$1) {
            addressFormatter$preformatAddressList$1 = (com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatAddressList$1) continuation;
            if ((addressFormatter$preformatAddressList$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                addressFormatter$preformatAddressList$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj6 = addressFormatter$preformatAddressList$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addressFormatter$preformatAddressList$1.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj6);
                    java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> list4 = list;
                    arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                    it = list4.iterator();
                    i2 = 0;
                    i3 = 0;
                    obj = list4;
                    addressFormatter$preformatAddressList$12 = addressFormatter$preformatAddressList$1;
                    obj2 = obj;
                    list2 = list;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        int i6 = addressFormatter$preformatAddressList$1.getHighSpeedVideoFpsRangesFor;
                        int i7 = addressFormatter$preformatAddressList$1.getHighResolutionOutputSizeshNQ4ISI;
                        i2 = addressFormatter$preformatAddressList$1.getHighSpeedVideoSizes;
                        collection2 = (java.util.Collection) addressFormatter$preformatAddressList$1.getOutputStallDuration;
                        address2 = (com.paypal.oslo.core.i18n.domain.model.Address) addressFormatter$preformatAddressList$1.getOutputMinFrameDurationlomOqCM;
                        address = (com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address) addressFormatter$preformatAddressList$1.getHighSpeedVideoSizesFor;
                        java.lang.Object obj7 = addressFormatter$preformatAddressList$1.getOutputMinFrameDuration;
                        java.util.Iterator it3 = (java.util.Iterator) addressFormatter$preformatAddressList$1.getInputSizeshNQ4ISI;
                        java.util.Collection collection3 = (java.util.Collection) addressFormatter$preformatAddressList$1.getOutputFormats;
                        java.lang.Object obj8 = (java.lang.Iterable) addressFormatter$preformatAddressList$1.getInputFormats;
                        java.lang.Object obj9 = (java.lang.Iterable) addressFormatter$preformatAddressList$1.getHighSpeedVideoFpsRanges;
                        list3 = (java.util.List) addressFormatter$preformatAddressList$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj6);
                        obj3 = obj9;
                        obj5 = obj7;
                        it2 = it3;
                        obj4 = obj8;
                        collection = collection3;
                        i4 = i6;
                        i5 = i7;
                        java.lang.String str = (java.lang.String) obj6;
                        addressFormatter$preformatAddressList$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                        addressFormatter$preformatAddressList$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                        addressFormatter$preformatAddressList$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj4);
                        addressFormatter$preformatAddressList$1.getOutputFormats = collection;
                        addressFormatter$preformatAddressList$1.getInputSizeshNQ4ISI = it2;
                        addressFormatter$preformatAddressList$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj5);
                        addressFormatter$preformatAddressList$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
                        addressFormatter$preformatAddressList$1.getOutputMinFrameDurationlomOqCM = address2;
                        addressFormatter$preformatAddressList$1.getOutputStallDuration = str;
                        addressFormatter$preformatAddressList$1.getOutputStallDurationlomOqCM = collection2;
                        addressFormatter$preformatAddressList$1.getHighSpeedVideoSizes = i2;
                        addressFormatter$preformatAddressList$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                        addressFormatter$preformatAddressList$1.getHighSpeedVideoFpsRangesFor = i4;
                        addressFormatter$preformatAddressList$1.getOutputSizeshNQ4ISI = 2;
                        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(address2, addressFormatter$preformatAddressList$1);
                        if (Camera2StreamConfigurationMap != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = addressFormatter$preformatAddressList$1.getHighSpeedVideoFpsRangesFor;
                    int i9 = addressFormatter$preformatAddressList$1.getHighResolutionOutputSizeshNQ4ISI;
                    i2 = addressFormatter$preformatAddressList$1.getHighSpeedVideoSizes;
                    collection2 = (java.util.Collection) addressFormatter$preformatAddressList$1.getOutputStallDurationlomOqCM;
                    java.lang.String str2 = (java.lang.String) addressFormatter$preformatAddressList$1.getOutputStallDuration;
                    com.paypal.oslo.core.i18n.domain.model.Address address3 = (com.paypal.oslo.core.i18n.domain.model.Address) addressFormatter$preformatAddressList$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object obj10 = addressFormatter$preformatAddressList$1.getOutputMinFrameDuration;
                    it2 = (java.util.Iterator) addressFormatter$preformatAddressList$1.getInputSizeshNQ4ISI;
                    java.util.Collection collection4 = (java.util.Collection) addressFormatter$preformatAddressList$1.getOutputFormats;
                    java.lang.Object obj11 = (java.lang.Iterable) addressFormatter$preformatAddressList$1.getInputFormats;
                    java.lang.Object obj12 = (java.lang.Iterable) addressFormatter$preformatAddressList$1.getHighSpeedVideoFpsRanges;
                    java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> list5 = (java.util.List) addressFormatter$preformatAddressList$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj6);
                    list3 = list5;
                    com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatAddressList$1 addressFormatter$preformatAddressList$13 = addressFormatter$preformatAddressList$1;
                    obj2 = obj12;
                    com.paypal.oslo.core.i18n.domain.model.Address address4 = address3;
                    java.lang.String str3 = str2;
                    int i10 = i9;
                    obj = obj11;
                    java.util.Collection collection5 = collection4;
                    collection2.add(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem(str3, (java.lang.String) obj6, address4));
                    addressFormatter$preformatAddressList$12 = addressFormatter$preformatAddressList$13;
                    list2 = list3;
                    i3 = i10;
                    it = it2;
                    arrayList = collection5;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        address = (com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address) next;
                        address2 = com.paypal.oslo.feature.bnplacquisition.domain.model.address.AddressKt.toAddressI18n(address);
                        addressFormatter$preformatAddressList$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                        addressFormatter$preformatAddressList$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                        addressFormatter$preformatAddressList$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        addressFormatter$preformatAddressList$12.getOutputFormats = arrayList;
                        addressFormatter$preformatAddressList$12.getInputSizeshNQ4ISI = it;
                        addressFormatter$preformatAddressList$12.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        addressFormatter$preformatAddressList$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
                        addressFormatter$preformatAddressList$12.getOutputMinFrameDurationlomOqCM = address2;
                        addressFormatter$preformatAddressList$12.getOutputStallDuration = arrayList;
                        addressFormatter$preformatAddressList$12.getOutputStallDurationlomOqCM = null;
                        addressFormatter$preformatAddressList$12.getHighSpeedVideoSizes = i2;
                        addressFormatter$preformatAddressList$12.getHighResolutionOutputSizeshNQ4ISI = i3;
                        addressFormatter$preformatAddressList$12.getHighSpeedVideoFpsRangesFor = 0;
                        addressFormatter$preformatAddressList$12.getOutputSizeshNQ4ISI = 1;
                        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(address2, addressFormatter$preformatAddressList$12);
                        if (highSpeedVideoSizes != coroutine_suspended) {
                            obj3 = obj2;
                            obj4 = obj;
                            addressFormatter$preformatAddressList$1 = addressFormatter$preformatAddressList$12;
                            i5 = i3;
                            i4 = 0;
                            collection2 = arrayList;
                            obj5 = next;
                            it2 = it;
                            list3 = list2;
                            obj6 = highSpeedVideoSizes;
                            collection = collection2;
                            java.lang.String str4 = (java.lang.String) obj6;
                            addressFormatter$preformatAddressList$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                            addressFormatter$preformatAddressList$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                            addressFormatter$preformatAddressList$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj4);
                            addressFormatter$preformatAddressList$1.getOutputFormats = collection;
                            addressFormatter$preformatAddressList$1.getInputSizeshNQ4ISI = it2;
                            addressFormatter$preformatAddressList$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj5);
                            addressFormatter$preformatAddressList$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
                            addressFormatter$preformatAddressList$1.getOutputMinFrameDurationlomOqCM = address2;
                            addressFormatter$preformatAddressList$1.getOutputStallDuration = str4;
                            addressFormatter$preformatAddressList$1.getOutputStallDurationlomOqCM = collection2;
                            addressFormatter$preformatAddressList$1.getHighSpeedVideoSizes = i2;
                            addressFormatter$preformatAddressList$1.getHighResolutionOutputSizeshNQ4ISI = i5;
                            addressFormatter$preformatAddressList$1.getHighSpeedVideoFpsRangesFor = i4;
                            addressFormatter$preformatAddressList$1.getOutputSizeshNQ4ISI = 2;
                            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(address2, addressFormatter$preformatAddressList$1);
                            if (Camera2StreamConfigurationMap != coroutine_suspended) {
                                str3 = str4;
                                obj6 = Camera2StreamConfigurationMap;
                                collection5 = collection;
                                addressFormatter$preformatAddressList$13 = addressFormatter$preformatAddressList$1;
                                address4 = address2;
                                obj2 = obj3;
                                i10 = i5;
                                obj = obj4;
                                collection2.add(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem(str3, (java.lang.String) obj6, address4));
                                addressFormatter$preformatAddressList$12 = addressFormatter$preformatAddressList$13;
                                list2 = list3;
                                i3 = i10;
                                it = it2;
                                arrayList = collection5;
                                if (it.hasNext()) {
                                    return (java.util.List) arrayList;
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                }
            }
        }
        addressFormatter$preformatAddressList$1 = new com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatAddressList$1(this, continuation);
        java.lang.Object obj62 = addressFormatter$preformatAddressList$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addressFormatter$preformatAddressList$1.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatStreetAddress$1 addressFormatter$preformatStreetAddress$1;
        int i;
        com.paypal.oslo.core.i18n.domain.model.Address address2;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatStreetAddress$1) {
            addressFormatter$preformatStreetAddress$1 = (com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatStreetAddress$1) continuation;
            if ((addressFormatter$preformatStreetAddress$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                addressFormatter$preformatStreetAddress$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = addressFormatter$preformatStreetAddress$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addressFormatter$preformatStreetAddress$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.core.i18n.domain.model.Address address3 = new com.paypal.oslo.core.i18n.domain.model.Address(address.m11248getAddressLine1rVKqk9c(), address.m11249getAddressLine2c7KZG_s(), null, null, null, null, null, null, null, null, 1020, null);
                    com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration = new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, null, null, com.paypal.oslo.core.i18n.domain.model.Address.Style.SINGLELINE, null, null, 111, null);
                    addressFormatter$preformatStreetAddress$1.getHighSpeedVideoFpsRanges = address;
                    addressFormatter$preformatStreetAddress$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = formatAddressUseCase.invoke(address3, addressConfiguration, addressFormatter$preformatStreetAddress$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    address2 = address;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    address2 = (com.paypal.oslo.core.i18n.domain.model.Address) addressFormatter$preformatStreetAddress$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.i18n.domain.model.Field[] fieldArr = new com.paypal.oslo.core.i18n.domain.model.Field[2];
                    java.lang.String m11248getAddressLine1rVKqk9c = address2.m11248getAddressLine1rVKqk9c();
                    fieldArr[0] = m11248getAddressLine1rVKqk9c != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11272boximpl(m11248getAddressLine1rVKqk9c) : null;
                    java.lang.String m11249getAddressLine2c7KZG_s = address2.m11249getAddressLine2c7KZG_s();
                    fieldArr[1] = m11249getAddressLine2c7KZG_s != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11281boximpl(m11249getAddressLine2c7KZG_s) : null;
                    return kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) fieldArr), ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter.$r8$lambda$PAjlJZo2QMCppaQbg8BgshqTbYw((com.paypal.oslo.core.i18n.domain.model.Field) obj2);
                        }
                    }, 30, null);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        addressFormatter$preformatStreetAddress$1 = new com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatStreetAddress$1(this, continuation);
        java.lang.Object obj2 = addressFormatter$preformatStreetAddress$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addressFormatter$preformatStreetAddress$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatCityStateZip$1 addressFormatter$preformatCityStateZip$1;
        int i;
        com.paypal.oslo.core.i18n.domain.model.Address address2;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatCityStateZip$1) {
            addressFormatter$preformatCityStateZip$1 = (com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatCityStateZip$1) continuation;
            if ((addressFormatter$preformatCityStateZip$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                addressFormatter$preformatCityStateZip$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = addressFormatter$preformatCityStateZip$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addressFormatter$preformatCityStateZip$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.core.i18n.domain.model.Address address3 = new com.paypal.oslo.core.i18n.domain.model.Address(null, null, null, null, null, address.m11252getAdminArea2DR8a_90(), address.m11251getAdminArea1bsDj6rY(), address.m11256getPostalCodeyjZ2Xzc(), null, null, 799, null);
                    com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration = new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, null, null, com.paypal.oslo.core.i18n.domain.model.Address.Style.SINGLELINE, null, null, 111, null);
                    addressFormatter$preformatCityStateZip$1.getHighSpeedVideoFpsRanges = address;
                    addressFormatter$preformatCityStateZip$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = formatAddressUseCase.invoke(address3, addressConfiguration, addressFormatter$preformatCityStateZip$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    address2 = address;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    address2 = (com.paypal.oslo.core.i18n.domain.model.Address) addressFormatter$preformatCityStateZip$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.i18n.domain.model.Field[] fieldArr = new com.paypal.oslo.core.i18n.domain.model.Field[3];
                    java.lang.String m11252getAdminArea2DR8a_90 = address2.m11252getAdminArea2DR8a_90();
                    fieldArr[0] = m11252getAdminArea2DR8a_90 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11308boximpl(m11252getAdminArea2DR8a_90) : null;
                    java.lang.String m11251getAdminArea1bsDj6rY = address2.m11251getAdminArea1bsDj6rY();
                    fieldArr[1] = m11251getAdminArea1bsDj6rY != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11299boximpl(m11251getAdminArea1bsDj6rY) : null;
                    java.lang.String m11256getPostalCodeyjZ2Xzc = address2.m11256getPostalCodeyjZ2Xzc();
                    fieldArr[2] = m11256getPostalCodeyjZ2Xzc != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11459boximpl(m11256getPostalCodeyjZ2Xzc) : null;
                    return kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) fieldArr), ", ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter.$r8$lambda$b3oPLUhekmcC1XjYUgl8Io3h7H0((com.paypal.oslo.core.i18n.domain.model.Field) obj2);
                        }
                    }, 30, null);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        addressFormatter$preformatCityStateZip$1 = new com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatCityStateZip$1(this, continuation);
        java.lang.Object obj2 = addressFormatter$preformatCityStateZip$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addressFormatter$preformatCityStateZip$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public final java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> toAddressesI18n(java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> addresses) {
        java.util.ArrayList arrayList;
        if (addresses != null) {
            java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address> list = addresses;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.paypal.oslo.feature.bnplacquisition.domain.model.address.AddressKt.toAddressI18n((com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$7ISVqdOIcVUXJMSsR4rgnBorROE(com.paypal.oslo.core.i18n.domain.model.Field field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        return field.getValue();
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$PAjlJZo2QMCppaQbg8BgshqTbYw(com.paypal.oslo.core.i18n.domain.model.Field field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        return field.getValue();
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$b3oPLUhekmcC1XjYUgl8Io3h7H0(com.paypal.oslo.core.i18n.domain.model.Field field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        return field.getValue();
    }
}
