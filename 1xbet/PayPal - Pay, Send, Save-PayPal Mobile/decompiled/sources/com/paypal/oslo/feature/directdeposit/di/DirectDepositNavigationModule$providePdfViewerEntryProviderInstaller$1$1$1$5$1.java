package com.paypal.oslo.feature.directdeposit.di;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$providePdfViewerEntryProviderInstaller$1$1$1$5$1", f = "DirectDepositNavigationModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DirectDepositNavigationModule$providePdfViewerEntryProviderInstaller$1$1$1$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor.createDirectDepositPayrollPDF(this.getHighSpeedVideoFpsRanges);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$providePdfViewerEntryProviderInstaller$1$1$1$5$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$providePdfViewerEntryProviderInstaller$1$1$1$5$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositNavigationModule$providePdfViewerEntryProviderInstaller$1$1$1$5$1(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$providePdfViewerEntryProviderInstaller$1$1$1$5$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = directDepositPDFViewModel;
        this.getHighSpeedVideoFpsRanges = context;
    }
}
