package com.paypal.oslo.feature.cashin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/usecase/GetMapLocationsUseCase;", "", "Lcom/paypal/oslo/feature/cashin/domain/repository/LocationRepository;", "locationRepository", "<init>", "(Lcom/paypal/oslo/feature/cashin/domain/repository/LocationRepository;)V", "Lcom/paypal/oslo/feature/cashin/domain/usecase/MapLocationsData;", "invoke", "()Lcom/paypal/oslo/feature/cashin/domain/usecase/MapLocationsData;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cashin/domain/repository/LocationRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetMapLocationsUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.domain.repository.LocationRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetMapLocationsUseCase(com.paypal.oslo.feature.cashin.domain.repository.LocationRepository locationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationRepository, "");
        this.getHighSpeedVideoFpsRanges = locationRepository;
    }

    public final com.paypal.oslo.feature.cashin.domain.usecase.MapLocationsData invoke() {
        final kotlinx.coroutines.flow.Flow[] flowArr = {this.getHighSpeedVideoFpsRanges.getLocations()};
        return new com.paypal.oslo.feature.cashin.domain.usecase.MapLocationsData(new kotlinx.coroutines.flow.Flow<java.util.List<? extends com.paypal.oslo.feature.cashin.domain.model.CashInStore>>() { // from class: com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase$invoke$$inlined$combine$1

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2"}, k = 3, mv = {2, 3, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase$invoke$$inlined$combine$1$3", f = "GetMapLocationsUseCase.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m = "invokeSuspend", n = {"$this$combineInternal", "it"}, nl = {-1}, s = {"L$0", "L$1"}, v = 2)
            /* renamed from: com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase$invoke$$inlined$combine$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.feature.cashin.domain.model.CashInStore>>, java.util.List<? extends com.paypal.oslo.feature.cashin.domain.model.CashInStore>[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int getHighResolutionOutputSizeshNQ4ISI;
                private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
                        java.lang.Object[] objArr = (java.lang.Object[]) this.getHighSpeedVideoSizes;
                        java.lang.Object first = kotlin.collections.ArraysKt.first((java.util.List[]) objArr);
                        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objArr);
                        this.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (flowCollector.emit(first, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.feature.cashin.domain.model.CashInStore>> flowCollector, java.util.List<? extends com.paypal.oslo.feature.cashin.domain.model.CashInStore>[] listArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase$invoke$$inlined$combine$1.AnonymousClass3 anonymousClass3 = new com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase$invoke$$inlined$combine$1.AnonymousClass3(continuation);
                    anonymousClass3.getHighSpeedVideoFpsRangesFor = flowCollector;
                    anonymousClass3.getHighSpeedVideoSizes = listArr;
                    return anonymousClass3.invokeSuspend(kotlin.Unit.INSTANCE);
                }

                public AnonymousClass3(kotlin.coroutines.Continuation continuation) {
                    super(3, continuation);
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.paypal.oslo.feature.cashin.domain.model.CashInStore>> flowCollector, kotlin.coroutines.Continuation continuation) {
                kotlinx.coroutines.flow.Flow[] flowArr2 = flowArr;
                final kotlinx.coroutines.flow.Flow[] flowArr3 = flowArr;
                java.lang.Object combineInternal = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr2, new kotlin.jvm.functions.Function0<java.util.List<? extends com.paypal.oslo.feature.cashin.domain.model.CashInStore>[]>() { // from class: com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase$invoke$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.util.List<? extends com.paypal.oslo.feature.cashin.domain.model.CashInStore>[] invoke() {
                        return new java.util.List[flowArr3.length];
                    }
                }, new com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase$invoke$$inlined$combine$1.AnonymousClass3(null), continuation);
                return combineInternal == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : kotlin.Unit.INSTANCE;
            }
        }, new com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase$invoke$1(this, null));
    }
}
