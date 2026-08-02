package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\r\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00060\u000b0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/GetCallingCodeUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/repository/PhoneRepository;", "phoneRepository", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/repository/PhoneRepository;)V", "", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "regionCodes", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "", "", "invoke", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/repository/PhoneRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetCallingCodeUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.PhoneRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetCallingCodeUseCase(com.paypal.oslo.core.i18n.domain.repository.PhoneRepository phoneRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = phoneRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0123 -> B:10:0x0125). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryCode> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, ? extends java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase$invoke$1 getCallingCodeUseCase$invoke$1;
        int i;
        java.util.Collection arrayList;
        java.lang.Iterable iterable;
        java.lang.Iterable iterable2;
        java.lang.Iterable iterable3;
        java.util.Iterator it;
        int i2;
        int i3;
        int i4;
        java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryCode> list2;
        java.util.Map map;
        arrow.core.Either right;
        com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase$invoke$1 getCallingCodeUseCase$invoke$12;
        boolean z;
        com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase getCallingCodeUseCase = this;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase$invoke$1) {
            getCallingCodeUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase$invoke$1) continuation;
            if ((getCallingCodeUseCase$invoke$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getCallingCodeUseCase$invoke$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getCallingCodeUseCase$invoke$1.isOutputSupportedFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCallingCodeUseCase$invoke$1.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.core.i18n.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to("regionCodeCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()));
                    java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryCode> list3 = list;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                    java.util.Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((com.paypal.oslo.core.i18n.domain.model.CountryCode) it2.next()).m11369unboximpl());
                    }
                    pairArr[1] = kotlin.TuplesKt.to("regionCodes", arrayList2);
                    com.paypal.android.logger.Logger.i$default(logger, "GetCallingCode UseCase invoked", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    arrayList = new java.util.ArrayList();
                    iterable = list3;
                    iterable2 = iterable;
                    iterable3 = iterable2;
                    it = list3.iterator();
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    list2 = list;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = getCallingCodeUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i6 = getCallingCodeUseCase$invoke$1.getHighSpeedVideoSizes;
                    i2 = getCallingCodeUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    i3 = getCallingCodeUseCase$invoke$1.Camera2StreamConfigurationMap;
                    i4 = getCallingCodeUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String m11369unboximpl = (java.lang.String) getCallingCodeUseCase$invoke$1.getOutputStallDuration;
                    java.lang.Object obj2 = getCallingCodeUseCase$invoke$1.getOutputSizes;
                    java.lang.Object obj3 = getCallingCodeUseCase$invoke$1.getOutputStallDurationlomOqCM;
                    it = (java.util.Iterator) getCallingCodeUseCase$invoke$1.getOutputMinFrameDurationlomOqCM;
                    iterable = (java.lang.Iterable) getCallingCodeUseCase$invoke$1.getInputFormats;
                    arrayList = (java.util.Collection) getCallingCodeUseCase$invoke$1.getHighSpeedVideoSizesFor;
                    iterable2 = (java.lang.Iterable) getCallingCodeUseCase$invoke$1.getOutputFormats;
                    iterable3 = (java.lang.Iterable) getCallingCodeUseCase$invoke$1.getOutputMinFrameDuration;
                    java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryCode> list4 = (java.util.List) getCallingCodeUseCase$invoke$1.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either.Right right2 = (arrow.core.Either) obj;
                    if (right2.isLeft()) {
                        getCallingCodeUseCase$invoke$12 = getCallingCodeUseCase$invoke$1;
                        z = false;
                    } else {
                        getCallingCodeUseCase$invoke$12 = getCallingCodeUseCase$invoke$1;
                        z = false;
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Error fetching metadata for region code", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("regionCode", m11369unboximpl), kotlin.TuplesKt.to("errorDesc", ((com.paypal.oslo.core.i18n.domain.error.PhoneMetadataError) ((arrow.core.Either.Left) right2).getValue()).toString())), null, null, 12, null);
                    }
                    if (right2 instanceof arrow.core.Either.Right) {
                        java.util.List list5 = kotlin.collections.CollectionsKt.toList(((com.paypal.oslo.core.i18n.domain.model.PhoneNumberMetaData) ((arrow.core.Either.Right) right2).getValue()).getCountryCodeToRegionCodeMapping().keySet());
                        if (list5.isEmpty()) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.i18n.LoggerKt.log, "Metadata fetched successfully but countryCodeToRegionCodeMapping is empty", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("regionCode", m11369unboximpl)), null, 4, null);
                        }
                        right2 = new arrow.core.Either.Right(kotlin.TuplesKt.to(m11369unboximpl, list5));
                    } else if (!(right2 instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    kotlin.Pair pair = (kotlin.Pair) right2.getOrNull();
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    getCallingCodeUseCase = this;
                    getCallingCodeUseCase$invoke$1 = getCallingCodeUseCase$invoke$12;
                    list2 = list4;
                    if (it.hasNext()) {
                        java.lang.Object next = it.next();
                        m11369unboximpl = ((com.paypal.oslo.core.i18n.domain.model.CountryCode) next).m11369unboximpl();
                        com.paypal.oslo.core.i18n.domain.repository.PhoneRepository phoneRepository = getCallingCodeUseCase.getHighResolutionOutputSizeshNQ4ISI;
                        getCallingCodeUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                        getCallingCodeUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable3);
                        getCallingCodeUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable2);
                        getCallingCodeUseCase$invoke$1.getHighSpeedVideoSizesFor = arrayList;
                        getCallingCodeUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iterable);
                        getCallingCodeUseCase$invoke$1.getOutputMinFrameDurationlomOqCM = it;
                        getCallingCodeUseCase$invoke$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        getCallingCodeUseCase$invoke$1.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(next);
                        getCallingCodeUseCase$invoke$1.getOutputStallDuration = m11369unboximpl;
                        getCallingCodeUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = i4;
                        getCallingCodeUseCase$invoke$1.Camera2StreamConfigurationMap = i3;
                        getCallingCodeUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = i2;
                        getCallingCodeUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        getCallingCodeUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        getCallingCodeUseCase$invoke$1.getOutputSizeshNQ4ISI = 1;
                        java.lang.Object mo11235getPhoneMetadatan_l99Nk = phoneRepository.mo11235getPhoneMetadatan_l99Nk(m11369unboximpl, getCallingCodeUseCase$invoke$1);
                        if (mo11235getPhoneMetadatan_l99Nk == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list4 = list2;
                        obj = mo11235getPhoneMetadatan_l99Nk;
                        arrow.core.Either.Right right22 = (arrow.core.Either) obj;
                        if (right22.isLeft()) {
                        }
                        if (right22 instanceof arrow.core.Either.Right) {
                        }
                        kotlin.Pair pair2 = (kotlin.Pair) right22.getOrNull();
                        if (pair2 != null) {
                        }
                        getCallingCodeUseCase = this;
                        getCallingCodeUseCase$invoke$1 = getCallingCodeUseCase$invoke$12;
                        list2 = list4;
                        if (it.hasNext()) {
                            java.util.List list6 = (java.util.List) arrayList;
                            if (list6.isEmpty()) {
                                list6 = null;
                            }
                            return (list6 == null || (map = kotlin.collections.MapsKt.toMap(list6)) == null || (right = arrow.core.EitherKt.right(map)) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.METADATA_FETCH_FAILURE) : right;
                        }
                    }
                }
            }
        }
        getCallingCodeUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase$invoke$1(getCallingCodeUseCase, continuation);
        java.lang.Object obj4 = getCallingCodeUseCase$invoke$1.isOutputSupportedFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCallingCodeUseCase$invoke$1.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }
}
