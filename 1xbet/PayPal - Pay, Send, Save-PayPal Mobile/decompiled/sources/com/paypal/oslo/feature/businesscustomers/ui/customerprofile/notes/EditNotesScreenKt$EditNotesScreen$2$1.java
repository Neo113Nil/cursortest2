package com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class EditNotesScreenKt$EditNotesScreen$2$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent editNotesEvent) {
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesEvent editNotesEvent2 = editNotesEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editNotesEvent2, "");
        ((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel) this.receiver).handleEvent$business_customers_prodRelease(editNotesEvent2);
        return kotlin.Unit.INSTANCE;
    }

    EditNotesScreenKt$EditNotesScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.class, "handleEvent", "handleEvent$business_customers_prodRelease(Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/notes/EditNotesEvent;)Lkotlinx/coroutines/Job;", 8);
    }
}
