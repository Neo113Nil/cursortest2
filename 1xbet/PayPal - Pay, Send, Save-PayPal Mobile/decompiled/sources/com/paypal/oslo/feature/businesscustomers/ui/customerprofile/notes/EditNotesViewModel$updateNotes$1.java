package com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel", f = "EditNotesViewModel.kt", i = {0, 1, 1, 1, 1, 1, 1, 1}, l = {102, 105}, m = "updateNotes", n = {"updatedCustomer", "updatedCustomer", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-EditNotesViewModel$updateNotes$4"}, nl = {103, 106}, s = {"L$0", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class EditNotesViewModel$updateNotes$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.access$updateNotes(this.getOutputSizes, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EditNotesViewModel$updateNotes$1(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel editNotesViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$updateNotes$1> continuation) {
        super(continuation);
        this.getOutputSizes = editNotesViewModel;
    }
}
