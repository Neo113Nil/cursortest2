package com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$4$1", f = "ViewInvoiceScreen.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, nl = {114}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ViewInvoiceScreenKt$ViewInvoiceScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$4$1$1", f = "ViewInvoiceScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect viewInvoiceUiEffect = (com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (viewInvoiceUiEffect instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect.NavigateBack) {
                this.Camera2StreamConfigurationMap.invoke();
            } else if (viewInvoiceUiEffect instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect.OpenExternalUri) {
                com.paypal.oslo.feature.invoicing.domain.extensions.InvoicingExtensionsKt.launchExternalUri(this.getHighSpeedVideoFpsRanges, android.net.Uri.parse(((com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect.OpenExternalUri) viewInvoiceUiEffect).getUrl()));
            } else {
                if (!(viewInvoiceUiEffect instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect.OpenPdfViewer)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.invoicing.domain.extensions.InvoicingExtensionsKt.openPdfInExternalViewer(this.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect.OpenPdfViewer) viewInvoiceUiEffect).getUrl());
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceUiEffect viewInvoiceUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$4$1.AnonymousClass1) create(viewInvoiceUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$4$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$4$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$4$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = function0;
            this.getHighSpeedVideoFpsRanges = context;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor.getUiEffect(), new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$4$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$4$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewInvoiceScreenKt$ViewInvoiceScreen$4$1(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel viewInvoiceViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = viewInvoiceViewModel;
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }
}
