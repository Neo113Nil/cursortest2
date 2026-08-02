package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class SearchContactsScreenKt$SearchContactsScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent contactsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsEvent, "");
        ((com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel) this.receiver).processEvent(contactsEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.contacts.ui.contacts.event.ContactsEvent contactsEvent) {
        getHighSpeedVideoFpsRangesFor(contactsEvent);
        return kotlin.Unit.INSTANCE;
    }

    SearchContactsScreenKt$SearchContactsScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.contacts.ui.contacts.viewModel.ContactsViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/contacts/ui/contacts/event/ContactsEvent;)V", 0);
    }
}
