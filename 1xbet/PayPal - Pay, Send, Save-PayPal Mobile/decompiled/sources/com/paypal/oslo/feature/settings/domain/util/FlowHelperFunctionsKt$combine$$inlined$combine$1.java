package com.paypal.oslo.feature.settings.domain.util;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¸\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$$inlined$unsafeFlow$2"}, k = 1, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes14.dex */
public final class FlowHelperFunctionsKt$combine$$inlined$combine$1<R> implements kotlinx.coroutines.flow.Flow<R> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow[] getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function7 getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2"}, k = 3, mv = {2, 3, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.domain.util.FlowHelperFunctionsKt$combine$$inlined$combine$1$3", f = "FlowHelperFunctions.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m = "invokeSuspend", n = {"$this$combineInternal", "it", "$completion", "args", "$i$a$-combine-FlowHelperFunctionsKt$combine$1", "$this$combineInternal", "it"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, -1}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "L$0", "L$1"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.settings.domain.util.FlowHelperFunctionsKt$combine$$inlined$combine$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, java.lang.Object[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function7 Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        java.lang.Object getInputFormats;
        private /* synthetic */ java.lang.Object getOutputFormats;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x00ad, code lost:
        
            if (r11.emit(r0, r16) == r9) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.FlowCollector flowCollector;
            java.lang.Object invoke;
            kotlinx.coroutines.flow.FlowCollector flowCollector2;
            java.lang.Object[] objArr;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputFormats;
                java.lang.Object[] objArr2 = (java.lang.Object[]) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.functions.Function7 function7 = this.Camera2StreamConfigurationMap;
                java.lang.Object obj2 = objArr2[0];
                java.lang.Object obj3 = objArr2[1];
                java.lang.Object obj4 = objArr2[2];
                java.lang.Object obj5 = objArr2[3];
                java.lang.Object obj6 = objArr2[4];
                java.lang.Object obj7 = objArr2[5];
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objArr2);
                this.getHighSpeedVideoFpsRangesFor = flowCollector;
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objArr2);
                this.getHighSpeedVideoFpsRanges = 0;
                this.getHighSpeedVideoSizesFor = 1;
                invoke = function7.invoke(obj2, obj3, obj4, obj5, obj6, obj7, this);
                if (invoke != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                    objArr = objArr2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
            objArr = (java.lang.Object[]) this.getHighResolutionOutputSizeshNQ4ISI;
            flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector3;
            invoke = obj;
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector2);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objArr);
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoSizes = null;
            this.getInputFormats = null;
            this.getHighSpeedVideoSizesFor = 2;
        }

        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputFormats;
            java.lang.Object[] objArr = (java.lang.Object[]) this.getHighResolutionOutputSizeshNQ4ISI;
            flowCollector.emit(this.Camera2StreamConfigurationMap.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], this), this);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.settings.domain.util.FlowHelperFunctionsKt$combine$$inlined$combine$1.AnonymousClass3 anonymousClass3 = new com.paypal.oslo.feature.settings.domain.util.FlowHelperFunctionsKt$combine$$inlined$combine$1.AnonymousClass3(continuation, this.Camera2StreamConfigurationMap);
            anonymousClass3.getOutputFormats = flowCollector;
            anonymousClass3.getHighResolutionOutputSizeshNQ4ISI = objArr;
            return anonymousClass3.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function7 function7) {
            super(3, continuation);
            this.Camera2StreamConfigurationMap = function7;
        }
    }

    public FlowHelperFunctionsKt$combine$$inlined$combine$1(kotlinx.coroutines.flow.Flow[] flowArr, kotlin.jvm.functions.Function7 function7) {
        this.getHighSpeedVideoFpsRanges = flowArr;
        this.getHighSpeedVideoFpsRangesFor = function7;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        java.lang.Object combineInternal = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.settings.domain.util.FlowHelperFunctionsKt$combine$$inlined$combine$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges), new com.paypal.oslo.feature.settings.domain.util.FlowHelperFunctionsKt$combine$$inlined$combine$1.AnonymousClass3(null, this.getHighSpeedVideoFpsRangesFor), continuation);
        return combineInternal == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object collect$$forInline(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
        new kotlin.coroutines.jvm.internal.ContinuationImpl(continuation) { // from class: com.paypal.oslo.feature.settings.domain.util.FlowHelperFunctionsKt$combine$$inlined$combine$1.1
            /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
            int getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                this.Camera2StreamConfigurationMap = obj;
                this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
                return com.paypal.oslo.feature.settings.domain.util.FlowHelperFunctionsKt$combine$$inlined$combine$1.this.collect(null, this);
            }
        };
        kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.settings.domain.util.FlowHelperFunctionsKt$combine$$inlined$combine$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges), new com.paypal.oslo.feature.settings.domain.util.FlowHelperFunctionsKt$combine$$inlined$combine$1.AnonymousClass3(null, this.getHighSpeedVideoFpsRangesFor), continuation);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
    /* renamed from: com.paypal.oslo.feature.settings.domain.util.FlowHelperFunctionsKt$combine$$inlined$combine$1$2, reason: invalid class name */
    public static final class AnonymousClass2 implements kotlin.jvm.functions.Function0<java.lang.Object[]> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow[] getHighSpeedVideoSizes;

        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object[] invoke() {
            return new java.lang.Object[this.getHighSpeedVideoSizes.length];
        }

        public AnonymousClass2(kotlinx.coroutines.flow.Flow[] flowArr) {
            this.getHighSpeedVideoSizes = flowArr;
        }
    }
}
