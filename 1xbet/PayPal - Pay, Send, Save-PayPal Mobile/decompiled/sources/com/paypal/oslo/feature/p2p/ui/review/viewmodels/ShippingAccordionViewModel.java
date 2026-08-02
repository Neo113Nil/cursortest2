package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0003J'\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0003J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0013J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR%\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040!8\u0007¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b&\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001fR \u0010,\u001a\b\u0012\u0004\u0012\u00020\u001a0!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001fR \u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b.\u0010$R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001fR \u00100\u001a\b\u0012\u0004\u0012\u00020\u001a0!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b0\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u0002010\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR \u00102\u001a\b\u0012\u0004\u0012\u0002010!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ShippingAccordionViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "addresses", "", "updateAddresses", "(Ljava/util/List;)V", "setLoading", "revertSelection", "clearLoading", "", "selectedAddressId", "syncFromBackend", "(Ljava/util/List;Ljava/lang/String;)V", "addressId", "updateSelectedAddressId", "(Ljava/lang/String;)V", "onExpanded", "onCollapsed", "onSelectAddress", "onSelectNoShipping", "getSelectedAddress", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "", "hasSelection", "()Z", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getAddresses", "()Lkotlinx/coroutines/flow/StateFlow;", "getOutputMinFrameDuration", "getSelectedAddressId", "getOutputFormats", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "noShippingSelected", "getNoShippingSelected", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "getInputFormats", "isLoading", "", "backendSyncCount", "getBackendSyncCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShippingAccordionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress>> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress>> addresses;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> backendSyncCount;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isExpanded;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> noShippingSelected;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> selectedAddressId;

    @javax.inject.Inject
    public ShippingAccordionViewModel() {
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.addresses = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.Camera2StreamConfigurationMap = MutableStateFlow2;
        this.selectedAddressId = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow3;
        this.noShippingSelected = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getHighSpeedVideoSizes = MutableStateFlow4;
        this.isExpanded = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow4);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow5 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getInputFormats = MutableStateFlow5;
        this.isLoading = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow5);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> MutableStateFlow6 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(0);
        this.getOutputMinFrameDuration = MutableStateFlow6;
        this.backendSyncCount = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow6);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress>> getAddresses() {
        return this.addresses;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSelectedAddressId() {
        return this.selectedAddressId;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getNoShippingSelected() {
        return this.noShippingSelected;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isExpanded() {
        return this.isExpanded;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return this.isLoading;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getBackendSyncCount() {
        return this.backendSyncCount;
    }

    public final void updateAddresses(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> addresses) {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(addresses);
    }

    public final void setLoading() {
        this.getInputFormats.setValue(java.lang.Boolean.TRUE);
    }

    public final void revertSelection() {
        this.Camera2StreamConfigurationMap.setValue(this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRanges == null));
        this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.TRUE);
    }

    public final void clearLoading() {
        this.getInputFormats.setValue(java.lang.Boolean.FALSE);
    }

    public final void syncFromBackend(java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> addresses, java.lang.String selectedAddressId) {
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this.getInputFormats;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        mutableStateFlow.setValue(bool);
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(addresses);
        java.lang.String value = this.Camera2StreamConfigurationMap.getValue();
        if (value != null && addresses != null) {
            java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> list = addresses;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress) it.next()).getId(), value)) {
                        this.getHighSpeedVideoFpsRanges = value;
                        break;
                    }
                }
            }
        }
        this.Camera2StreamConfigurationMap.setValue(selectedAddressId);
        this.getHighSpeedVideoFpsRangesFor.setValue(bool);
        this.getHighSpeedVideoFpsRanges = selectedAddressId;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> mutableStateFlow2 = this.getOutputMinFrameDuration;
        mutableStateFlow2.setValue(java.lang.Integer.valueOf(mutableStateFlow2.getValue().intValue() + 1));
    }

    public final void updateSelectedAddressId(java.lang.String addressId) {
        this.Camera2StreamConfigurationMap.setValue(addressId);
        if (addressId != null) {
            this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.FALSE);
        }
    }

    public final void onExpanded() {
        this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.TRUE);
    }

    public final void onCollapsed() {
        this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.FALSE);
    }

    public final void onSelectAddress(java.lang.String addressId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressId, "");
        this.Camera2StreamConfigurationMap.setValue(addressId);
        this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.FALSE);
    }

    public final void onSelectNoShipping() {
        this.Camera2StreamConfigurationMap.setValue(null);
        this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.TRUE);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress getSelectedAddress() {
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> value;
        java.lang.String value2 = this.Camera2StreamConfigurationMap.getValue();
        java.lang.Object obj = null;
        if (value2 == null || (value = this.getHighResolutionOutputSizeshNQ4ISI.getValue()) == null) {
            return null;
        }
        java.util.Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress) next).getId(), value2)) {
                obj = next;
                break;
            }
        }
        return (com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress) obj;
    }

    public final boolean hasSelection() {
        return this.Camera2StreamConfigurationMap.getValue() != null || this.getHighSpeedVideoFpsRangesFor.getValue().booleanValue();
    }
}
