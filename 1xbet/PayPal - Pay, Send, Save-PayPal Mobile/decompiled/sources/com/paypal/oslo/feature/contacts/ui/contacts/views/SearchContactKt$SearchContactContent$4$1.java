package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactKt$SearchContactContent$4$1", f = "SearchContact.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class SearchContactKt$SearchContactContent$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactKt.access$SearchContactContent$lambda$7(this.Camera2StreamConfigurationMap).getText(), this.getHighSpeedVideoSizes)) {
            androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState = this.Camera2StreamConfigurationMap;
            androidx.compose.ui.text.input.TextFieldValue access$SearchContactContent$lambda$7 = com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactKt.access$SearchContactContent$lambda$7(mutableState);
            java.lang.String str = this.getHighSpeedVideoSizes;
            mutableState.setValue(androidx.compose.ui.text.input.TextFieldValue.m8276copy3r_uNRQ$default(access$SearchContactContent$lambda$7, str, androidx.compose.ui.text.TextRangeKt.TextRange(str.length()), (androidx.compose.ui.text.TextRange) null, 4, (java.lang.Object) null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactKt$SearchContactContent$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactKt$SearchContactContent$4$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchContactKt$SearchContactContent$4$1(java.lang.String str, androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactKt$SearchContactContent$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}
