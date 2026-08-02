package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.ZettleSDkReporterImpl$reportConfiguredFeatures$1", f = "ZettleSDkReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class ZettleSDkReporterImpl$reportConfiguredFeatures$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.ZettleSDkReporterImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.zettle.sdk.Configuration getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Set<java.lang.String> keySet = this.getHighSpeedVideoSizes.getFeatures().keySet();
        android.content.SharedPreferences sharedPreferences = this.getHighSpeedVideoSizes.getContext().getSharedPreferences("zettle-sdk-reporter", 0);
        java.util.Set<java.lang.String> stringSet = sharedPreferences.getStringSet("zettle-sdk-features", null);
        if (stringSet == null) {
            this.getHighResolutionOutputSizeshNQ4ISI.report("InitFeatures", keySet);
            sharedPreferences.edit().putStringSet("zettle-sdk-features", keySet).apply();
        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(stringSet, keySet)) {
            this.getHighResolutionOutputSizeshNQ4ISI.trackFeaturesChanges(stringSet, keySet);
            sharedPreferences.edit().putStringSet("zettle-sdk-features", keySet).apply();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.ZettleSDkReporterImpl$reportConfiguredFeatures$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.ZettleSDkReporterImpl$reportConfiguredFeatures$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZettleSDkReporterImpl$reportConfiguredFeatures$1(com.zettle.sdk.Configuration configuration, com.zettle.sdk.ZettleSDkReporterImpl zettleSDkReporterImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.ZettleSDkReporterImpl$reportConfiguredFeatures$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = configuration;
        this.getHighResolutionOutputSizeshNQ4ISI = zettleSDkReporterImpl;
    }
}
