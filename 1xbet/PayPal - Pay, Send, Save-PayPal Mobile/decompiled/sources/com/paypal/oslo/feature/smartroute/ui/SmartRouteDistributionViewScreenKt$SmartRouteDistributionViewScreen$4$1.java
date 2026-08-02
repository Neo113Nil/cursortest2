package com.paypal.oslo.feature.smartroute.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1", f = "SmartRouteDistributionViewScreen.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD}, m = "invokeSuspend", n = {}, nl = {433}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel getOutputMinFrameDuration;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect distributionEffect = (com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEffect) obj;
            android.content.Context context = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.runtime.MutableState<java.lang.String> mutableState = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState.this, (java.lang.String) obj2);
                }
            };
            final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj2).booleanValue());
                }
            };
            final androidx.compose.runtime.MutableState<java.lang.String> mutableState3 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1.AnonymousClass1.getHighSpeedVideoSizes(androidx.compose.runtime.MutableState.this, (java.lang.String) obj2);
                }
            };
            final androidx.compose.runtime.MutableState<java.lang.String> mutableState4 = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt.handleToastEffect(distributionEffect, context, function1, function12, function13, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1.AnonymousClass1.getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState.this, (java.lang.String) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState mutableState, boolean z) {
            mutableState.setValue(java.lang.Boolean.valueOf(z));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
            mutableState.setValue(str);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            mutableState.setValue(str);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
            mutableState.setValue(str);
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(android.content.Context context, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, androidx.compose.runtime.MutableState<java.lang.String> mutableState3, androidx.compose.runtime.MutableState<java.lang.String> mutableState4) {
            this.getHighSpeedVideoFpsRangesFor = context;
            this.Camera2StreamConfigurationMap = mutableState;
            this.getHighSpeedVideoFpsRanges = mutableState2;
            this.getHighResolutionOutputSizeshNQ4ISI = mutableState3;
            this.getHighSpeedVideoSizes = mutableState4;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor = 1;
            if (this.getOutputMinFrameDuration.getEffect().collect(new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1(com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, android.content.Context context, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, androidx.compose.runtime.MutableState<java.lang.String> mutableState3, androidx.compose.runtime.MutableState<java.lang.String> mutableState4, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.ui.SmartRouteDistributionViewScreenKt$SmartRouteDistributionViewScreen$4$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = distributionViewModel;
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighSpeedVideoSizes = mutableState2;
        this.Camera2StreamConfigurationMap = mutableState3;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState4;
    }
}
