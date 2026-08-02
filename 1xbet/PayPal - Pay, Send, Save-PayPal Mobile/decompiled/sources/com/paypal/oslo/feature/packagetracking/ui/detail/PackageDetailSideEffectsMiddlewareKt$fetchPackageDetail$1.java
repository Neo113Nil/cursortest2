package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1", f = "PackageDetailSideEffectsMiddleware.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {241, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m = "invokeSuspend", n = {"$this$launch", "packageDeferred", "emailLinkDeferred", "userEmailDeferred", "$this$launch", "packageDeferred", "emailLinkDeferred", "userEmailDeferred", "packageResult", "$this$launch", "packageDeferred", "emailLinkDeferred", "userEmailDeferred", "packageResult", "emailLinkResult"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes13.dex */
final class PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputSizes;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0112, code lost:
    
        if (r1 != r8) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        kotlinx.coroutines.Deferred async$default3;
        java.lang.Object await;
        kotlinx.coroutines.Deferred deferred;
        kotlinx.coroutines.Deferred deferred2;
        java.lang.Object await2;
        kotlinx.coroutines.Deferred deferred3;
        arrow.core.Either either;
        arrow.core.Either either2;
        java.lang.Object await3;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$packageDeferred$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$emailLinkDeferred$1(this.getHighSpeedVideoFpsRanges, null), 3, null);
            async$default3 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1$userEmailDeferred$1(this.getHighSpeedVideoFpsRanges, null), 3, null);
            this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
            this.getInputSizeshNQ4ISI = async$default2;
            this.getOutputMinFrameDuration = async$default3;
            this.getInputFormats = 1;
            await = async$default.await(this);
            if (await != coroutine_suspended) {
                deferred = async$default;
                deferred2 = async$default2;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            async$default3 = (kotlinx.coroutines.Deferred) this.getOutputMinFrameDuration;
            kotlinx.coroutines.Deferred deferred4 = (kotlinx.coroutines.Deferred) this.getInputSizeshNQ4ISI;
            kotlinx.coroutines.Deferred deferred5 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            deferred = deferred5;
            deferred2 = deferred4;
            await = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrow.core.Either either3 = (arrow.core.Either) this.getOutputFormats;
                either = (arrow.core.Either) this.getHighSpeedVideoSizesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                either2 = either3;
                await3 = obj;
                arrow.core.Either either4 = (arrow.core.Either) await3;
                com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel = this.getHighSpeedVideoFpsRanges;
                if (either instanceof arrow.core.Either.Right) {
                    com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt.access$handlePackageDetailSuccess(packageDetailViewModel, (com.paypal.oslo.feature.packagetracking.domain.model.PackageData) ((arrow.core.Either.Right) either).getValue(), either2, either4);
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt.access$handlePackageDetailError(packageDetailViewModel, (com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError) ((arrow.core.Either.Left) either).getValue());
                }
                return kotlin.Unit.INSTANCE;
            }
            either = (arrow.core.Either) this.getHighSpeedVideoSizesFor;
            deferred3 = (kotlinx.coroutines.Deferred) this.getOutputMinFrameDuration;
            deferred2 = (kotlinx.coroutines.Deferred) this.getInputSizeshNQ4ISI;
            deferred = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            await2 = obj;
            either2 = (arrow.core.Either) await2;
            this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred3);
            this.getHighSpeedVideoSizesFor = either;
            this.getOutputFormats = either2;
            this.getInputFormats = 3;
            await3 = deferred3.await(this);
        }
        arrow.core.Either either5 = (arrow.core.Either) await;
        this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
        this.getOutputMinFrameDuration = async$default3;
        this.getHighSpeedVideoSizesFor = either5;
        this.getInputFormats = 2;
        await2 = deferred2.await(this);
        if (await2 != coroutine_suspended) {
            deferred3 = async$default3;
            either = either5;
            either2 = (arrow.core.Either) await2;
            this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred3);
            this.getHighSpeedVideoSizesFor = either;
            this.getOutputFormats = either2;
            this.getInputFormats = 3;
            await3 = deferred3.await(this);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1 packageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1 = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        packageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1.getOutputSizes = obj;
        return packageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = packageDetailViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
    }
}
