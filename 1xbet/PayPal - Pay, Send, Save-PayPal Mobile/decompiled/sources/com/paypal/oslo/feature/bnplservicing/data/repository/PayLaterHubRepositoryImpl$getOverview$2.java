package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/PayLaterHubOverview;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2", f = "PayLaterHubRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3}, l = {100, 101, 102, 103}, m = "invokeSuspend", n = {"$this$coroutineScope", "plansDeferred", "readyToUsePlansDeferred", "prequalDeferred", "applicationEligibilityDeferred", "$this$coroutineScope", "plansDeferred", "readyToUsePlansDeferred", "prequalDeferred", "applicationEligibilityDeferred", "plansResult", "$this$coroutineScope", "plansDeferred", "readyToUsePlansDeferred", "prequalDeferred", "applicationEligibilityDeferred", "plansResult", "readyToUsePlansResult", "$this$coroutineScope", "plansDeferred", "readyToUsePlansDeferred", "prequalDeferred", "applicationEligibilityDeferred", "plansResult", "readyToUsePlansResult", "prequalResult"}, nl = {101, 102, 103, 106}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 2)
/* loaded from: classes11.dex */
final class PayLaterHubRepositoryImpl$getOverview$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, ? extends com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x01ce, code lost:
    
        if (r9 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0207, code lost:
    
        if (r1 == r8) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x018c, code lost:
    
        if (r7 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01ca, code lost:
    
        if (r9 != r8) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0188, code lost:
    
        if (r7 != r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x020c, code lost:
    
        if (r1 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0167  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred deferred;
        kotlinx.coroutines.Deferred deferred2;
        kotlinx.coroutines.Deferred deferred3;
        kotlinx.coroutines.Deferred deferred4;
        kotlinx.coroutines.Deferred deferred5;
        java.lang.Object await;
        kotlinx.coroutines.Deferred deferred6;
        kotlinx.coroutines.Deferred deferred7;
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        kotlinx.coroutines.Deferred async$default3;
        kotlinx.coroutines.Deferred deferred8;
        kotlinx.coroutines.Deferred deferred9;
        kotlinx.coroutines.Deferred deferred10;
        arrow.core.Ior.Right right;
        kotlinx.coroutines.Deferred deferred11;
        arrow.core.Ior ior;
        java.lang.Object await2;
        arrow.core.Ior.Right right2;
        arrow.core.Ior ior2;
        arrow.core.Ior ior3;
        kotlinx.coroutines.Deferred deferred12;
        kotlinx.coroutines.Deferred deferred13;
        kotlinx.coroutines.Deferred deferred14;
        kotlinx.coroutines.Deferred deferred15;
        java.lang.Object await3;
        arrow.core.Ior.Right right3;
        java.lang.Object await4;
        arrow.core.Ior.Right right4;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput plansInput = this.getHighResolutionOutputSizeshNQ4ISI.getPlansInput();
            if (plansInput != null) {
                async$default3 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2$plansDeferred$1$1(this.getHighSpeedVideoSizesFor, plansInput, null), 3, null);
                deferred = async$default3;
            } else {
                deferred = null;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput readyToUsePlansInput = this.getHighResolutionOutputSizeshNQ4ISI.getReadyToUsePlansInput();
            if (readyToUsePlansInput != null) {
                async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2$readyToUsePlansDeferred$1$1(this.getHighSpeedVideoSizesFor, readyToUsePlansInput, null), 3, null);
                deferred2 = async$default2;
            } else {
                deferred2 = null;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI.getPrequalProductIdentifiers().isEmpty()) {
                deferred3 = null;
            } else {
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2$prequalDeferred$1(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, null), 3, null);
                deferred3 = async$default;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.application.input.ApplicationEligibilityInput applicationEligibilityInput = this.getHighResolutionOutputSizeshNQ4ISI.getApplicationEligibilityInput();
            if (applicationEligibilityInput != null) {
                deferred4 = deferred3;
                deferred5 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2$applicationEligibilityDeferred$1$1(this.getHighSpeedVideoSizesFor, applicationEligibilityInput, null), 3, null);
            } else {
                deferred4 = deferred3;
                deferred5 = null;
            }
            if (deferred != null) {
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
                this.getHighSpeedVideoFpsRanges = deferred2;
                this.Camera2StreamConfigurationMap = deferred4;
                this.getHighSpeedVideoFpsRangesFor = deferred5;
                this.getInputSizeshNQ4ISI = 1;
                await = deferred.await(this);
                if (await != coroutine_suspended) {
                    deferred6 = deferred;
                    deferred7 = deferred2;
                }
                return coroutine_suspended;
            }
            kotlinx.coroutines.Deferred deferred16 = deferred4;
            right = new arrow.core.Ior.Right(null);
            deferred10 = deferred16;
            deferred8 = deferred;
            deferred9 = deferred2;
            arrow.core.Ior ior4 = right;
            deferred11 = deferred5;
            ior = ior4;
            if (deferred9 != null) {
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred8);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred9);
                this.Camera2StreamConfigurationMap = deferred10;
                this.getHighSpeedVideoFpsRangesFor = deferred11;
                this.getOutputFormats = ior;
                this.getInputSizeshNQ4ISI = 2;
                await2 = deferred9.await(this);
            }
            right2 = new arrow.core.Ior.Right(null);
            kotlinx.coroutines.Deferred deferred17 = deferred11;
            ior2 = ior;
            ior3 = right2;
            deferred12 = deferred8;
            deferred13 = deferred9;
            deferred14 = deferred10;
            deferred15 = deferred17;
            if (deferred14 != null) {
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred12);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred13);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred14);
                this.getHighSpeedVideoFpsRangesFor = deferred15;
                this.getOutputFormats = ior2;
                this.getOutputMinFrameDuration = ior3;
                this.getInputSizeshNQ4ISI = 3;
                await3 = deferred14.await(this);
            }
            right3 = new arrow.core.Ior.Right(null);
            if (deferred15 != null) {
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred12);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred13);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred14);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred15);
                this.getOutputFormats = ior2;
                this.getOutputMinFrameDuration = ior3;
                this.getInputFormats = right3;
                this.getInputSizeshNQ4ISI = 4;
                await4 = deferred15.await(this);
            }
            right4 = new arrow.core.Ior.Right(null);
            return com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl.access$combineResults(this.getHighSpeedVideoSizesFor, ior2, ior3, right3, right4);
        }
        if (i == 1) {
            deferred5 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.Deferred deferred18 = (kotlinx.coroutines.Deferred) this.Camera2StreamConfigurationMap;
            deferred7 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRanges;
            deferred6 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            deferred4 = deferred18;
            await = obj;
        } else if (i == 2) {
            ior = (arrow.core.Ior) this.getOutputFormats;
            deferred11 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRangesFor;
            deferred10 = (kotlinx.coroutines.Deferred) this.Camera2StreamConfigurationMap;
            deferred9 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRanges;
            deferred8 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            await2 = obj;
            right2 = (arrow.core.Ior) await2;
        } else if (i == 3) {
            ior3 = (arrow.core.Ior) this.getOutputMinFrameDuration;
            ior2 = (arrow.core.Ior) this.getOutputFormats;
            deferred15 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRangesFor;
            deferred14 = (kotlinx.coroutines.Deferred) this.Camera2StreamConfigurationMap;
            deferred13 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRanges;
            deferred12 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            await3 = obj;
            right3 = (arrow.core.Ior) await3;
        } else {
            if (i != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrow.core.Ior ior5 = (arrow.core.Ior) this.getInputFormats;
            ior3 = (arrow.core.Ior) this.getOutputMinFrameDuration;
            ior2 = (arrow.core.Ior) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            right3 = ior5;
            await4 = obj;
            right4 = (arrow.core.Ior) await4;
        }
        right = (arrow.core.Ior) await;
        if (right == null) {
            deferred2 = deferred7;
            deferred = deferred6;
            kotlinx.coroutines.Deferred deferred162 = deferred4;
            right = new arrow.core.Ior.Right(null);
            deferred10 = deferred162;
            deferred8 = deferred;
            deferred9 = deferred2;
            arrow.core.Ior ior42 = right;
            deferred11 = deferred5;
            ior = ior42;
            if (deferred9 != null) {
            }
            right2 = new arrow.core.Ior.Right(null);
            kotlinx.coroutines.Deferred deferred172 = deferred11;
            ior2 = ior;
            ior3 = right2;
            deferred12 = deferred8;
            deferred13 = deferred9;
            deferred14 = deferred10;
            deferred15 = deferred172;
            if (deferred14 != null) {
            }
            right3 = new arrow.core.Ior.Right(null);
            if (deferred15 != null) {
            }
            right4 = new arrow.core.Ior.Right(null);
            return com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl.access$combineResults(this.getHighSpeedVideoSizesFor, ior2, ior3, right3, right4);
        }
        deferred8 = deferred6;
        deferred9 = deferred7;
        deferred10 = deferred4;
        arrow.core.Ior ior422 = right;
        deferred11 = deferred5;
        ior = ior422;
        if (deferred9 != null) {
        }
        right2 = new arrow.core.Ior.Right(null);
        kotlinx.coroutines.Deferred deferred1722 = deferred11;
        ior2 = ior;
        ior3 = right2;
        deferred12 = deferred8;
        deferred13 = deferred9;
        deferred14 = deferred10;
        deferred15 = deferred1722;
        if (deferred14 != null) {
        }
        right3 = new arrow.core.Ior.Right(null);
        if (deferred15 != null) {
        }
        right4 = new arrow.core.Ior.Right(null);
        return com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl.access$combineResults(this.getHighSpeedVideoSizesFor, ior2, ior3, right3, right4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, ? extends com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.PayLaterHubOverview>> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2 payLaterHubRepositoryImpl$getOverview$2 = new com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, continuation);
        payLaterHubRepositoryImpl$getOverview$2.getOutputMinFrameDurationlomOqCM = obj;
        return payLaterHubRepositoryImpl$getOverview$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayLaterHubRepositoryImpl$getOverview$2(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.PayLaterHubInput payLaterHubInput, com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl payLaterHubRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl$getOverview$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = payLaterHubInput;
        this.getHighSpeedVideoSizesFor = payLaterHubRepositoryImpl;
    }
}
