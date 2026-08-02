package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.SearchKt$Search$4$1", f = "Search.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class SearchKt$Search$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        androidx.compose.ui.text.input.TextFieldValue m8275copy3r_uNRQ$default;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState = this.getHighResolutionOutputSizeshNQ4ISI;
        booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.getValue()).booleanValue();
        if (!booleanValue) {
            m8275copy3r_uNRQ$default = androidx.compose.ui.text.input.TextFieldValue.m8275copy3r_uNRQ$default(com.paypal.pds.components.SearchKt.access$Search$lambda$5(this.getHighResolutionOutputSizeshNQ4ISI), (androidx.compose.ui.text.AnnotatedString) null, androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE(), (androidx.compose.ui.text.TextRange) null, 5, (java.lang.Object) null);
        } else {
            m8275copy3r_uNRQ$default = androidx.compose.ui.text.input.TextFieldValue.m8275copy3r_uNRQ$default(com.paypal.pds.components.SearchKt.access$Search$lambda$5(this.getHighResolutionOutputSizeshNQ4ISI), (androidx.compose.ui.text.AnnotatedString) null, androidx.compose.ui.text.TextRangeKt.TextRange(com.paypal.pds.components.SearchKt.access$Search$lambda$5(this.getHighResolutionOutputSizeshNQ4ISI).getText().length()), (androidx.compose.ui.text.TextRange) null, 5, (java.lang.Object) null);
        }
        mutableState.setValue(m8275copy3r_uNRQ$default);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.SearchKt$Search$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.components.SearchKt$Search$4$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchKt$Search$4$1(androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState, kotlin.coroutines.Continuation<? super com.paypal.pds.components.SearchKt$Search$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = state;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
    }
}
