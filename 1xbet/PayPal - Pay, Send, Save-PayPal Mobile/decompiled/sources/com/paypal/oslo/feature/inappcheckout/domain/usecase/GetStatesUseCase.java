package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetStatesUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;", "getAddressLayoutUseCase", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;)V", "", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/GetAddressLayoutUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetStatesUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetStatesUseCase(com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAddressLayoutUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        this.Camera2StreamConfigurationMap = getAddressLayoutUseCase;
        this.getHighSpeedVideoFpsRanges = localeProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, java.lang.String>> continuation) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase$invoke$1 getStatesUseCase$invoke$1;
        int i;
        com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout;
        java.util.Map<java.lang.String, java.lang.String> map;
        java.lang.Object obj;
        java.util.List<com.paypal.oslo.core.i18n.domain.model.StateList> stateList;
        kotlin.sequences.Sequence asSequence;
        com.paypal.oslo.core.i18n.domain.model.StateList.MapValue mapValue;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase$invoke$1) {
            getStatesUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase$invoke$1) continuation;
            if ((getStatesUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                getStatesUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase$invoke$1 getStatesUseCase$invoke$12 = getStatesUseCase$invoke$1;
                java.lang.Object obj2 = getStatesUseCase$invoke$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getStatesUseCase$invoke$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration = new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, this.getHighSpeedVideoFpsRanges.getUserLocale(), null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null);
                    com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase = this.Camera2StreamConfigurationMap;
                    getStatesUseCase$invoke$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressConfiguration);
                    getStatesUseCase$invoke$12.Camera2StreamConfigurationMap = 1;
                    obj2 = com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase.invoke$default(getAddressLayoutUseCase, null, addressConfiguration, getStatesUseCase$invoke$12, 1, null);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                addressLayout = (com.paypal.oslo.core.i18n.domain.model.AddressLayout) ((arrow.core.Either) obj2).getOrNull();
                if (addressLayout != null) {
                    return kotlin.collections.MapsKt.emptyMap();
                }
                java.util.Iterator it = kotlin.sequences.SequencesKt.flatMap(kotlin.collections.CollectionsKt.asSequence(addressLayout.getRows()), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase.m15436$r8$lambda$yw8Q5zGHtwd8_l3FHpLKGOvvfo((com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row) obj3);
                    }
                }).iterator();
                while (true) {
                    map = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((com.paypal.oslo.core.i18n.domain.model.AddressComponent) obj).getField() instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea1) {
                        break;
                    }
                }
                com.paypal.oslo.core.i18n.domain.model.AddressComponent addressComponent = (com.paypal.oslo.core.i18n.domain.model.AddressComponent) obj;
                if (addressComponent != null && (stateList = addressComponent.getStateList()) != null && (asSequence = kotlin.collections.CollectionsKt.asSequence(stateList)) != null) {
                    kotlin.sequences.Sequence filter = kotlin.sequences.SequencesKt.filter(asSequence, new kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean>() { // from class: com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase$extractStates$$inlined$filterIsInstance$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Boolean invoke(java.lang.Object obj3) {
                            return java.lang.Boolean.valueOf(obj3 instanceof com.paypal.oslo.core.i18n.domain.model.StateList.MapValue);
                        }
                    });
                    kotlin.jvm.internal.Intrinsics.checkNotNull(filter, "");
                    if (filter != null && (mapValue = (com.paypal.oslo.core.i18n.domain.model.StateList.MapValue) kotlin.sequences.SequencesKt.firstOrNull(filter)) != null) {
                        map = mapValue.getValue();
                    }
                }
                return map == null ? kotlin.collections.MapsKt.emptyMap() : map;
            }
        }
        getStatesUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase$invoke$1(this, continuation);
        com.paypal.oslo.feature.inappcheckout.domain.usecase.GetStatesUseCase$invoke$1 getStatesUseCase$invoke$122 = getStatesUseCase$invoke$1;
        java.lang.Object obj22 = getStatesUseCase$invoke$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getStatesUseCase$invoke$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        addressLayout = (com.paypal.oslo.core.i18n.domain.model.AddressLayout) ((arrow.core.Either) obj22).getOrNull();
        if (addressLayout != null) {
        }
    }

    /* renamed from: $r8$lambda$yw8Q5zGHtwd8_l3FH-pLKGOvvfo, reason: not valid java name */
    public static /* synthetic */ kotlin.sequences.Sequence m15436$r8$lambda$yw8Q5zGHtwd8_l3FHpLKGOvvfo(com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row row) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(row, "");
        return kotlin.collections.CollectionsKt.asSequence(row.getComponents());
    }
}
