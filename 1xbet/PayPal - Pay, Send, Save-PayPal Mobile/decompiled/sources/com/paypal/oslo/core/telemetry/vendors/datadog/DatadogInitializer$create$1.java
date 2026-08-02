package com.paypal.oslo.core.telemetry.vendors.datadog;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer$create$1", f = "DatadogInitializer.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class DatadogInitializer$create$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoSizes.getUserState().collect(new com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer$create$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer$create$1$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 implements kotlinx.coroutines.flow.FlowCollector, kotlin.jvm.internal.FunctionAdapter {
        final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer Camera2StreamConfigurationMap;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            java.lang.Object Camera2StreamConfigurationMap = com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer$create$1.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, (com.paypal.oslo.core.userstore.model.UserState) obj);
            return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final kotlin.Function<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.AdaptedFunctionReference(2, this.Camera2StreamConfigurationMap, com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer.class, "setupDatadogUserInfo", "setupDatadogUserInfo(Lcom/paypal/oslo/core/userstore/model/UserState;)V", 4);
        }

        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof kotlinx.coroutines.flow.FlowCollector) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        AnonymousClass1(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer datadogInitializer) {
            this.Camera2StreamConfigurationMap = datadogInitializer;
        }
    }

    public static final /* synthetic */ java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer datadogInitializer, com.paypal.oslo.core.userstore.model.UserState userState) {
        com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer.access$setupDatadogUserInfo(datadogInitializer, userState);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer$create$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer$create$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatadogInitializer$create$1(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer datadogInitializer, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInitializer$create$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = userStore;
        this.getHighResolutionOutputSizeshNQ4ISI = datadogInitializer;
    }
}
