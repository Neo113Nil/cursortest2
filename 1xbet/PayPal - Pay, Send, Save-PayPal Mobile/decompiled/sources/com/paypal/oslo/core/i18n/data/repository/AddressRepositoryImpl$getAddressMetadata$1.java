package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/AddressMetadataError;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressMetadata;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1", f = "AddressRepositoryImpl.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"$this$flow"}, nl = {95}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class AddressRepositoryImpl$getAddressMetadata$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, ? extends com.paypal.oslo.core.i18n.domain.model.AddressMetadata>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Locale getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.Flow flow;
        kotlinx.coroutines.flow.Flow flow2;
        final kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flow = kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getCountryMetadata$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, null));
            flow2 = kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getLocaleMetadata$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, null));
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.combine(flow, flow2, new com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object emit = flowCollector.emit((arrow.core.Either) obj2, continuation);
                    return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0001H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/AddressMetadataError;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressMetadata;", "countryMetadata", "Lkotlinx/serialization/json/JsonObject;", "localeMetadata"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1$1", f = "AddressRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, ? extends kotlinx.serialization.json.JsonObject>, arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, ? extends kotlinx.serialization.json.JsonObject>, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, ? extends com.paypal.oslo.core.i18n.domain.model.AddressMetadata>>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.util.Locale getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl getHighSpeedVideoSizesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            arrow.core.Either either = (arrow.core.Either) this.getHighSpeedVideoSizes;
            arrow.core.Either either2 = (arrow.core.Either) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (either instanceof arrow.core.Either.Left) {
                return arrow.core.EitherKt.left(((arrow.core.Either.Left) either).getValue());
            }
            if (either2 instanceof arrow.core.Either.Left) {
                return arrow.core.EitherKt.left(((arrow.core.Either.Left) either2).getValue());
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(either, "");
            kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) ((arrow.core.Either.Right) either).getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(either2, "");
            try {
                return arrow.core.EitherKt.right(com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl.access$processMetadata(this.getHighSpeedVideoSizesFor, jsonObject, (kotlinx.serialization.json.JsonObject) ((arrow.core.Either.Right) either2).getValue(), this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap));
            } catch (java.lang.IllegalStateException e) {
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "Illegal state failure";
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.AddressMetadataError.ParsingFailure(message, e));
            } catch (kotlinx.serialization.SerializationException e2) {
                java.lang.String message2 = e2.getMessage();
                if (message2 == null) {
                    message2 = "Serialization failure";
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.error.AddressMetadataError.ParsingFailure(message2, e2));
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, ? extends kotlinx.serialization.json.JsonObject> either, arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, ? extends kotlinx.serialization.json.JsonObject> either2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, ? extends com.paypal.oslo.core.i18n.domain.model.AddressMetadata>> continuation) {
            com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1.AnonymousClass1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighSpeedVideoSizes = either;
            anonymousClass1.getHighSpeedVideoFpsRangesFor = either2;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl addressRepositoryImpl, java.util.Locale locale, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.getHighSpeedVideoSizesFor = addressRepositoryImpl;
            this.getHighSpeedVideoFpsRanges = locale;
            this.Camera2StreamConfigurationMap = str;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.AddressMetadataError, ? extends com.paypal.oslo.core.i18n.domain.model.AddressMetadata>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1 addressRepositoryImpl$getAddressMetadata$1 = new com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        addressRepositoryImpl$getAddressMetadata$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return addressRepositoryImpl$getAddressMetadata$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressRepositoryImpl$getAddressMetadata$1(com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl addressRepositoryImpl, java.lang.String str, java.util.Locale locale, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl$getAddressMetadata$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = addressRepositoryImpl;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = locale;
    }
}
