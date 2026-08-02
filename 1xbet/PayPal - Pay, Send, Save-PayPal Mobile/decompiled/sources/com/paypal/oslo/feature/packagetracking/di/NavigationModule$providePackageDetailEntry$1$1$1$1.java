package com.paypal.oslo.feature.packagetracking.di;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/result/PackageSettingsNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.di.NavigationModule$providePackageDetailEntry$1$1$1$1", f = "NavigationModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class NavigationModule$providePackageDetailEntry$1$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.packagetracking.api.navigation.result.PackageSettingsNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int intValue;
        com.paypal.oslo.feature.packagetracking.api.navigation.result.PackageSettingsNavResult packageSettingsNavResult = (com.paypal.oslo.feature.packagetracking.api.navigation.result.PackageSettingsNavResult) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (packageSettingsNavResult.getLinkStateChanged()) {
            intValue = this.getHighSpeedVideoSizes.getIntValue();
            this.getHighSpeedVideoSizes.setIntValue(intValue + 1);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.packagetracking.api.navigation.result.PackageSettingsNavResult packageSettingsNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.di.NavigationModule$providePackageDetailEntry$1$1$1$1) create(packageSettingsNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.packagetracking.di.NavigationModule$providePackageDetailEntry$1$1$1$1 navigationModule$providePackageDetailEntry$1$1$1$1 = new com.paypal.oslo.feature.packagetracking.di.NavigationModule$providePackageDetailEntry$1$1$1$1(this.getHighSpeedVideoSizes, continuation);
        navigationModule$providePackageDetailEntry$1$1$1$1.getHighSpeedVideoFpsRanges = obj;
        return navigationModule$providePackageDetailEntry$1$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationModule$providePackageDetailEntry$1$1$1$1(androidx.compose.runtime.MutableIntState mutableIntState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.di.NavigationModule$providePackageDetailEntry$1$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = mutableIntState;
    }
}
