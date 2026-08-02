package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatSavedAddressesUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "formatAddressUseCase", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;)V", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/SavedAddress;", "addresses", "invoke", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Lcom/paypal/oslo/core/i18n/domain/model/AddressConfiguration;", "p1", "", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/SavedAddress;Lcom/paypal/oslo/core/i18n/domain/model/AddressConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/SavedAddress;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormatSavedAddressesUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public FormatSavedAddressesUseCase(com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatAddressUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        this.getHighSpeedVideoSizes = formatAddressUseCase;
        this.getHighSpeedVideoFpsRangesFor = localeProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e2 -> B:10:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress> list, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress>> continuation) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase$invoke$1 formatSavedAddressesUseCase$invoke$1;
        int i;
        com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        int i2;
        java.util.Iterator it;
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress> list2;
        java.util.Collection collection;
        int i3;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase$invoke$1) {
            formatSavedAddressesUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase$invoke$1) continuation;
            if ((formatSavedAddressesUseCase$invoke$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                formatSavedAddressesUseCase$invoke$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                java.lang.Object obj = formatSavedAddressesUseCase$invoke$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = formatSavedAddressesUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration2 = new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, this.getHighSpeedVideoFpsRangesFor.getUserLocale(), null, com.paypal.oslo.core.i18n.domain.model.Address.Style.SINGLELINE, null, null, 107, null);
                    java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress> list3 = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                    java.util.Iterator it2 = list3.iterator();
                    addressConfiguration = addressConfiguration2;
                    iterable = list3;
                    iterable2 = iterable;
                    i2 = 0;
                    it = it2;
                    list2 = list;
                    collection = arrayList;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = formatSavedAddressesUseCase$invoke$1.getHighSpeedVideoSizes;
                    i2 = formatSavedAddressesUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    i3 = formatSavedAddressesUseCase$invoke$1.Camera2StreamConfigurationMap;
                    collection = (java.util.Collection) formatSavedAddressesUseCase$invoke$1.getOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress savedAddress = (com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress) formatSavedAddressesUseCase$invoke$1.getOutputStallDuration;
                    java.lang.Object obj2 = formatSavedAddressesUseCase$invoke$1.getOutputMinFrameDuration;
                    it = (java.util.Iterator) formatSavedAddressesUseCase$invoke$1.getOutputFormats;
                    java.util.Collection collection2 = (java.util.Collection) formatSavedAddressesUseCase$invoke$1.getInputFormats;
                    iterable = (java.lang.Iterable) formatSavedAddressesUseCase$invoke$1.getInputSizeshNQ4ISI;
                    iterable2 = (java.lang.Iterable) formatSavedAddressesUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    addressConfiguration = (com.paypal.oslo.core.i18n.domain.model.AddressConfiguration) formatSavedAddressesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress> list4 = (java.util.List) formatSavedAddressesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress savedAddress2 = savedAddress;
                    collection.add(com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress.copy$default(savedAddress2, null, (java.lang.String) obj, null, null, null, null, null, 125, null));
                    collection = collection2;
                    list2 = list4;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress savedAddress3 = (com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress) next;
                        formatSavedAddressesUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                        formatSavedAddressesUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = addressConfiguration;
                        formatSavedAddressesUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                        formatSavedAddressesUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                        formatSavedAddressesUseCase$invoke$1.getInputFormats = collection;
                        formatSavedAddressesUseCase$invoke$1.getOutputFormats = it;
                        formatSavedAddressesUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        formatSavedAddressesUseCase$invoke$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savedAddress3);
                        formatSavedAddressesUseCase$invoke$1.getOutputStallDuration = savedAddress3;
                        formatSavedAddressesUseCase$invoke$1.getOutputSizeshNQ4ISI = collection;
                        formatSavedAddressesUseCase$invoke$1.Camera2StreamConfigurationMap = i3;
                        formatSavedAddressesUseCase$invoke$1.getHighSpeedVideoFpsRanges = i2;
                        formatSavedAddressesUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        formatSavedAddressesUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = 1;
                        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(savedAddress3, addressConfiguration, formatSavedAddressesUseCase$invoke$1);
                        if (highSpeedVideoFpsRanges == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list4 = list2;
                        obj = highSpeedVideoFpsRanges;
                        savedAddress2 = savedAddress3;
                        collection2 = collection;
                        collection.add(com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress.copy$default(savedAddress2, null, (java.lang.String) obj, null, null, null, null, null, 125, null));
                        collection = collection2;
                        list2 = list4;
                        if (it.hasNext()) {
                            return (java.util.List) collection;
                        }
                    }
                }
            }
        }
        formatSavedAddressesUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase$invoke$1(this, continuation);
        java.lang.Object obj3 = formatSavedAddressesUseCase$invoke$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = formatSavedAddressesUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress savedAddress, com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase$formatAddress$1 formatSavedAddressesUseCase$formatAddress$1;
        int i;
        com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress savedAddress2;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase$formatAddress$1) {
            formatSavedAddressesUseCase$formatAddress$1 = (com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase$formatAddress$1) continuation;
            if ((formatSavedAddressesUseCase$formatAddress$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                formatSavedAddressesUseCase$formatAddress$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = formatSavedAddressesUseCase$formatAddress$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = formatSavedAddressesUseCase$formatAddress$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String m11273constructorimpl = com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(savedAddress.getAddressLine1());
                    java.lang.String addressLine2 = savedAddress.getAddressLine2();
                    if (addressLine2.length() <= 0) {
                        addressLine2 = null;
                    }
                    com.paypal.oslo.core.i18n.domain.model.Address address = new com.paypal.oslo.core.i18n.domain.model.Address(m11273constructorimpl, addressLine2 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(addressLine2) : null, null, null, null, com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(savedAddress.getAdminArea2()), com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(savedAddress.getAdminArea1()), com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(savedAddress.getPostalCode()), null, null, 796, null);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase = this.getHighSpeedVideoSizes;
                    formatSavedAddressesUseCase$formatAddress$1.Camera2StreamConfigurationMap = savedAddress;
                    formatSavedAddressesUseCase$formatAddress$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressConfiguration);
                    formatSavedAddressesUseCase$formatAddress$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
                    formatSavedAddressesUseCase$formatAddress$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = formatAddressUseCase.invoke(address, addressConfiguration, formatSavedAddressesUseCase$formatAddress$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    savedAddress2 = savedAddress;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    savedAddress2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress) formatSavedAddressesUseCase$formatAddress$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str = (java.lang.String) ((arrow.core.Either) obj).getOrNull();
                return str != null ? getHighResolutionOutputSizeshNQ4ISI(savedAddress2) : str;
            }
        }
        formatSavedAddressesUseCase$formatAddress$1 = new com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase$formatAddress$1(this, continuation);
        java.lang.Object obj2 = formatSavedAddressesUseCase$formatAddress$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = formatSavedAddressesUseCase$formatAddress$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        java.lang.String str2 = (java.lang.String) ((arrow.core.Either) obj2).getOrNull();
        if (str2 != null) {
        }
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress p0) {
        java.lang.String[] strArr = new java.lang.String[4];
        java.lang.String addressLine1 = p0.getAddressLine1();
        if (addressLine1.length() <= 0) {
            addressLine1 = null;
        }
        strArr[0] = addressLine1;
        java.lang.String addressLine2 = p0.getAddressLine2();
        if (addressLine2.length() <= 0) {
            addressLine2 = null;
        }
        strArr[1] = addressLine2;
        java.lang.String adminArea2 = p0.getAdminArea2();
        if (adminArea2.length() <= 0) {
            adminArea2 = null;
        }
        strArr[2] = adminArea2;
        java.lang.String adminArea1 = p0.getAdminArea1();
        strArr[3] = adminArea1.length() > 0 ? adminArea1 : null;
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) strArr), ", ", null, null, 0, null, null, 62, null);
        java.lang.String postalCode = p0.getPostalCode();
        java.lang.String str = joinToString$default;
        if (str.length() == 0 && postalCode.length() > 0) {
            return postalCode;
        }
        if (str.length() <= 0 || postalCode.length() <= 0) {
            return joinToString$default;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(joinToString$default);
        sb.append(" ");
        sb.append(postalCode);
        return sb.toString();
    }
}
