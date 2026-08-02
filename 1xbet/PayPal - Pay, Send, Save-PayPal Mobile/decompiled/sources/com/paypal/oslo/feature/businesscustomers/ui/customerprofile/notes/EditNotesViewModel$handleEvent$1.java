package com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$handleEvent$1", f = "EditNotesViewModel.kt", i = {}, l = {66, 70, 85}, m = "invokeSuspend", n = {}, nl = {69, 73, 60}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class EditNotesViewModel$handleEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.access$updateNotes(r17.Camera2StreamConfigurationMap, r17) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.access$clearNotes(r17.Camera2StreamConfigurationMap, r17) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e3, code lost:
    
        if (r2.emit(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiEffect.NavigateBack.INSTANCE, r17) == r1) goto L40;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent editNotesEvent = this.getHighResolutionOutputSizeshNQ4ISI;
            if (editNotesEvent instanceof com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.NotesChanged) {
                mutableStateFlow3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent editNotesEvent2 = this.getHighResolutionOutputSizeshNQ4ISI;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState) value3, null, null, ((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.NotesChanged) editNotesEvent2).getNotes(), false, false, null, 59, null)));
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(editNotesEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.UpdateClicked.INSTANCE)) {
                this.getHighSpeedVideoSizes = 1;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(editNotesEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ClearNotesClicked.INSTANCE)) {
                this.getHighSpeedVideoSizes = 2;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(editNotesEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ClearError.INSTANCE)) {
                mutableStateFlow2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState) value2, null, null, null, false, false, null, 31, null)));
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(editNotesEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent.ExitForm.INSTANCE)) {
                mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState.copy$default((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesUiState) value, null, null, null, false, false, null, 7, null)));
                mutableSharedFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = 3;
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$handleEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$handleEvent$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EditNotesViewModel$handleEvent$1(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent editNotesEvent, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel editNotesViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$handleEvent$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = editNotesEvent;
        this.Camera2StreamConfigurationMap = editNotesViewModel;
    }
}
