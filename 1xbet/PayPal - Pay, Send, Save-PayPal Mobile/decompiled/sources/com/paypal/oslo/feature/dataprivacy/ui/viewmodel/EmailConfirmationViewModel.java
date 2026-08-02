package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00170\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00170\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/EmailConfirmationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;)V", "", "email", "", "onEmailSelected", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "selectedEmail", "Lkotlinx/coroutines/flow/StateFlow;", "getSelectedEmail", "()Lkotlinx/coroutines/flow/StateFlow;", "", "getHighSpeedVideoFpsRangesFor", "availableEmails", "getAvailableEmails"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EmailConfirmationViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> availableEmails;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> selectedEmail;

    @javax.inject.Inject
    public EmailConfirmationViewModel(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoSizes = userStore;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.selectedEmail = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.String>> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        this.getHighSpeedVideoFpsRanges = MutableStateFlow2;
        this.availableEmails = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.EmailConfirmationViewModel$loadUserEmails$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSelectedEmail() {
        return this.selectedEmail;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.String>> getAvailableEmails() {
        return this.availableEmails;
    }

    public final void onEmailSelected(java.lang.String email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(email);
    }
}
