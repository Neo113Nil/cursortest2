package com.paypal.oslo.feature.settings.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemStatus$Badge;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$executeStatusRequest$1", f = "SettingsRepositoryImpl.kt", i = {0, 1, 2, 2, 2}, l = {155, 156, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "result", "badge"}, nl = {156, 157, 163}, s = {"L$0", "L$0", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class SettingsRepositoryImpl$executeStatusRequest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.BadgeType getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r0.emit(r4, r6) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r7 != r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r0.emit(new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge(com.paypal.oslo.feature.settings.domain.model.BadgeType.Loading), r6) != r1) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge badge;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = flowCollector;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Boolean bool = (java.lang.Boolean) obj;
            if (bool != null) {
                com.paypal.oslo.feature.settings.domain.model.BadgeType badgeType = this.getHighSpeedVideoSizes;
                if (bool.booleanValue()) {
                    badgeType = com.paypal.oslo.feature.settings.domain.model.BadgeType.Positive;
                }
                badge = new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge(badgeType);
            } else {
                badge = null;
            }
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bool);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(badge);
            this.getHighResolutionOutputSizeshNQ4ISI = 3;
        }
        kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function1 = this.getHighSpeedVideoFpsRangesFor;
        this.getOutputFormats = flowCollector;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        obj = function1.invoke(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$executeStatusRequest$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$executeStatusRequest$1 settingsRepositoryImpl$executeStatusRequest$1 = new com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$executeStatusRequest$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
        settingsRepositoryImpl$executeStatusRequest$1.getOutputFormats = obj;
        return settingsRepositoryImpl$executeStatusRequest$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SettingsRepositoryImpl$executeStatusRequest$1(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function1, com.paypal.oslo.feature.settings.domain.model.BadgeType badgeType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.data.repository.SettingsRepositoryImpl$executeStatusRequest$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoSizes = badgeType;
    }
}
