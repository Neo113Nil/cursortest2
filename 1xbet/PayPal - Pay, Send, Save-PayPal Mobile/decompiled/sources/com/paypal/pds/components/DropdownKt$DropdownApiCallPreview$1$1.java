package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.DropdownKt$DropdownApiCallPreview$1$1", f = "Dropdown.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST}, m = "invokeSuspend", n = {}, nl = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION}, s = {}, v = 2)
/* loaded from: classes3.dex */
final class DropdownKt$DropdownApiCallPreview$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.util.List<com.paypal.pds.components.MenuItem>> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<com.paypal.pds.components.MenuItem> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(true));
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.runtime.MutableState<java.util.List<com.paypal.pds.components.MenuItem>> mutableState = this.Camera2StreamConfigurationMap;
        if (kotlin.text.StringsKt.isBlank(com.paypal.pds.components.DropdownKt.access$DropdownApiCallPreview$lambda$4(this.getHighSpeedVideoSizes))) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.pds.components.MenuItem> list = this.getHighSpeedVideoFpsRanges;
            androidx.compose.runtime.MutableState<java.lang.String> mutableState2 = this.getHighSpeedVideoSizes;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (kotlin.text.StringsKt.contains((java.lang.CharSequence) ((com.paypal.pds.components.MenuItem) obj2).getLabel(), (java.lang.CharSequence) com.paypal.pds.components.DropdownKt.access$DropdownApiCallPreview$lambda$4(mutableState2), true)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        mutableState.setValue(arrayList);
        this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(false));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.DropdownKt$DropdownApiCallPreview$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.components.DropdownKt$DropdownApiCallPreview$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DropdownKt$DropdownApiCallPreview$1$1(java.util.List<com.paypal.pds.components.MenuItem> list, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<java.lang.String> mutableState2, androidx.compose.runtime.MutableState<java.util.List<com.paypal.pds.components.MenuItem>> mutableState3, kotlin.coroutines.Continuation<? super com.paypal.pds.components.DropdownKt$DropdownApiCallPreview$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighSpeedVideoSizes = mutableState2;
        this.Camera2StreamConfigurationMap = mutableState3;
    }
}
