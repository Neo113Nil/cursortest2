package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/ui/DocUploadViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;)V", "", "getFirstName", "()Ljava/lang/String;", "getLastName", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "userState", "Lkotlinx/coroutines/flow/StateFlow;", "getUserState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocUploadViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState;

    @javax.inject.Inject
    public DocUploadViewModel(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.userState = userStore.getUserState();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> getUserState() {
        return this.userState;
    }

    public final java.lang.String getFirstName() {
        com.paypal.oslo.core.userstore.model.User user;
        com.paypal.oslo.core.userstore.model.ProfileName legalName;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
        com.paypal.oslo.core.userstore.model.UserState value = this.userState.getValue();
        java.lang.String str = null;
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
        if (profileLoaded != null && (user = profileLoaded.getUser()) != null && (legalName = user.getLegalName()) != null && (personName = legalName.getPersonName()) != null) {
            str = personName.getGivenName();
        }
        return str == null ? "" : str;
    }

    public final java.lang.String getLastName() {
        com.paypal.oslo.core.userstore.model.User user;
        com.paypal.oslo.core.userstore.model.ProfileName legalName;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
        com.paypal.oslo.core.userstore.model.UserState value = this.userState.getValue();
        java.lang.String str = null;
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
        if (profileLoaded != null && (user = profileLoaded.getUser()) != null && (legalName = user.getLegalName()) != null && (personName = legalName.getPersonName()) != null) {
            str = personName.getSurname();
        }
        return str == null ? "" : str;
    }
}
