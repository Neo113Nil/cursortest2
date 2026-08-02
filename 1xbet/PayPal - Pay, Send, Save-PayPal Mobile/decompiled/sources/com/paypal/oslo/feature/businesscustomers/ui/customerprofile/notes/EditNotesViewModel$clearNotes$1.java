package com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel", f = "EditNotesViewModel.kt", i = {0, 1, 1, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 126}, m = "clearNotes", n = {"updatedCustomer", "updatedCustomer", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-EditNotesViewModel$clearNotes$3"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 127}, s = {"L$0", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class EditNotesViewModel$clearNotes$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.access$clearNotes(this.getOutputSizeshNQ4ISI, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EditNotesViewModel$clearNotes$1(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel editNotesViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel$clearNotes$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = editNotesViewModel;
    }
}
