package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR&\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f0\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/GetPhonesUseCase;", "getPhonesUseCase", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/usecase/GetPhonesUseCase;)V", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction;", "action", "", "handleAction", "(Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/userprofile/domain/usecase/GetPhonesUseCase;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/ProfileDataListUiState;", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesEvent;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/SharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AllPhonesViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent> events;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.usecase.GetPhonesUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfilePhone>>> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfilePhone>>> uiState;

    @javax.inject.Inject
    public AllPhonesViewModel(com.paypal.oslo.feature.userprofile.domain.usecase.GetPhonesUseCase getPhonesUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPhonesUseCase, "");
        this.getHighSpeedVideoFpsRanges = getPhonesUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfilePhone>>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState.Loading.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.Camera2StreamConfigurationMap = MutableSharedFlow$default;
        this.events = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListUiState<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfilePhone>>> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent> getEvents() {
        return this.events;
    }

    public final void handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        if (action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.RetryLoading) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$loadPhones$1(this, null), 3, null);
            return;
        }
        if (action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.SelectPhone) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$selectPhone$1(this, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.SelectPhone) action).getPhoneId(), null), 3, null);
        } else {
            if (action instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.AddPhone) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$addPhone$1(this, null), 3, null);
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final /* synthetic */ java.util.List access$sortPhones(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel allPhonesViewModel, java.util.List list) {
        final java.util.Comparator comparator = new java.util.Comparator() { // from class: com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$sortPhones$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = (com.paypal.oslo.core.userstore.model.ProfilePhone) ((com.paypal.oslo.feature.userprofile.domain.ProfileDataItem) t2).getData();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                java.lang.Boolean valueOf = profilePhone != null ? java.lang.Boolean.valueOf(profilePhone.getPrimary()) : bool;
                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone2 = (com.paypal.oslo.core.userstore.model.ProfilePhone) ((com.paypal.oslo.feature.userprofile.domain.ProfileDataItem) t).getData();
                return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, profilePhone2 != null ? java.lang.Boolean.valueOf(profilePhone2.getPrimary()) : bool);
            }
        };
        final java.util.Comparator comparator2 = new java.util.Comparator() { // from class: com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$sortPhones$$inlined$thenByDescending$1
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
            
                if ((r6 != null ? r6.getType() : null) == com.paypal.oslo.core.userstore.model.PhoneType.HOME) goto L34;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final int compare(T t, T t2) {
                boolean z;
                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone;
                int compare = comparator.compare(t, t2);
                if (compare != 0) {
                    return compare;
                }
                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone2 = (com.paypal.oslo.core.userstore.model.ProfilePhone) ((com.paypal.oslo.feature.userprofile.domain.ProfileDataItem) t2).getData();
                boolean z2 = false;
                if (profilePhone2 == null || !profilePhone2.getConfirmed()) {
                    if ((profilePhone2 != null ? profilePhone2.getType() : null) != com.paypal.oslo.core.userstore.model.PhoneType.WORK) {
                        if ((profilePhone2 != null ? profilePhone2.getType() : null) != com.paypal.oslo.core.userstore.model.PhoneType.HOME) {
                            z = false;
                            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
                            profilePhone = (com.paypal.oslo.core.userstore.model.ProfilePhone) ((com.paypal.oslo.feature.userprofile.domain.ProfileDataItem) t).getData();
                            if (profilePhone != null || !profilePhone.getConfirmed()) {
                                if ((profilePhone == null ? profilePhone.getType() : null) != com.paypal.oslo.core.userstore.model.PhoneType.WORK) {
                                }
                            }
                            z2 = true;
                            return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, java.lang.Boolean.valueOf(z2));
                        }
                    }
                }
                z = true;
                java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z);
                profilePhone = (com.paypal.oslo.core.userstore.model.ProfilePhone) ((com.paypal.oslo.feature.userprofile.domain.ProfileDataItem) t).getData();
                if (profilePhone != null) {
                }
                if ((profilePhone == null ? profilePhone.getType() : null) != com.paypal.oslo.core.userstore.model.PhoneType.WORK) {
                }
                z2 = true;
                return kotlin.comparisons.ComparisonsKt.compareValues(valueOf2, java.lang.Boolean.valueOf(z2));
            }
        };
        return kotlin.collections.CollectionsKt.sortedWith(list, new java.util.Comparator() { // from class: com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesViewModel$sortPhones$$inlined$thenByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator2.compare(t, t2);
                if (compare != 0) {
                    return compare;
                }
                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = (com.paypal.oslo.core.userstore.model.ProfilePhone) ((com.paypal.oslo.feature.userprofile.domain.ProfileDataItem) t2).getData();
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf((profilePhone != null ? profilePhone.getType() : null) == com.paypal.oslo.core.userstore.model.PhoneType.MOBILE);
                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone2 = (com.paypal.oslo.core.userstore.model.ProfilePhone) ((com.paypal.oslo.feature.userprofile.domain.ProfileDataItem) t).getData();
                return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, java.lang.Boolean.valueOf((profilePhone2 != null ? profilePhone2.getType() : null) == com.paypal.oslo.core.userstore.model.PhoneType.MOBILE));
            }
        });
    }
}
