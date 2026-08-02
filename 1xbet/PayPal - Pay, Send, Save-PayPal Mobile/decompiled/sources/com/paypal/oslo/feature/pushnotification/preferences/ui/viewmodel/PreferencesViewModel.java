package com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e8G¢\u0006\u0006\u001a\u0004\b#\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/preferences/ui/viewmodel/PreferencesViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/usecase/GetPreferencesUseCase;", "getPreferencesUseCase", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/usecase/UpdatePreferencesUseCase;", "updatePreferencesUseCase", "<init>", "(Lcom/paypal/oslo/feature/pushnotification/preferences/domain/usecase/GetPreferencesUseCase;Lcom/paypal/oslo/feature/pushnotification/preferences/domain/usecase/UpdatePreferencesUseCase;)V", "", "getPreferences", "()V", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;", "preferences", "updatePreferences", "(Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;)V", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PushNotificationPreference;", "updatePreference", "", "newStatus", "togglePreference", "(Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PushNotificationPreference;Z)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/usecase/GetPreferencesUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/usecase/UpdatePreferencesUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/pushnotification/preferences/ui/viewmodel/PreferencesUiState;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "getPreferencesStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "preferencesStateFlow", "getHighSpeedVideoSizes", "isUpdating"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PreferencesViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.GetPreferencesUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PreferencesViewModel(com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.GetPreferencesUseCase getPreferencesUseCase, com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase updatePreferencesUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPreferencesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePreferencesUseCase, "");
        this.getHighSpeedVideoFpsRanges = getPreferencesUseCase;
        this.Camera2StreamConfigurationMap = updatePreferencesUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Loading.INSTANCE);
        this.getHighSpeedVideoSizes = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState> getPreferencesStateFlow() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isUpdating() {
        return this.getHighSpeedVideoSizes;
    }

    public final void getPreferences() {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Loading.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel$getPreferences$1(this, null), 3, null);
    }

    public final void updatePreferences(com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList preferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferences, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel$updatePreferences$1(this, preferences, null), 3, null);
    }

    public final void togglePreference(com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference updatePreference, boolean newStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePreference, "");
        com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState value = getPreferencesStateFlow().getValue();
        if (!(value instanceof com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Success)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Cannot toggle preference when state is not Success. Current state: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName())), null, null, 6, null);
            return;
        }
        java.util.List<com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference> preferences = ((com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Success) value).getDomainPreferencesList().getPreferences();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(preferences, 10));
        for (com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference pushNotificationPreference : preferences) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(pushNotificationPreference, updatePreference)) {
                pushNotificationPreference = com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference.copy$default(pushNotificationPreference, null, newStatus, null, null, 13, null);
            }
            arrayList.add(pushNotificationPreference);
        }
        updatePreferences(new com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList(arrayList));
    }
}
