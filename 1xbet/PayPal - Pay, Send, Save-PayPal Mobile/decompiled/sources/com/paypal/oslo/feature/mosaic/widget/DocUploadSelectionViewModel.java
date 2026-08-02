package com.paypal.oslo.feature.mosaic.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/widget/DocUploadSelectionViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "key", "", "selectDocType", "(Ljava/lang/String;)V", "initialKey", "initIfEmpty", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "selectedDocTypeKey", "Lkotlinx/coroutines/flow/StateFlow;", "getSelectedDocTypeKey", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocUploadSelectionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> selectedDocTypeKey;

    @javax.inject.Inject
    public DocUploadSelectionViewModel() {
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.selectedDocTypeKey = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSelectedDocTypeKey() {
        return this.selectedDocTypeKey;
    }

    public final void selectDocType(java.lang.String key) {
        this.getHighSpeedVideoFpsRangesFor.setValue(key);
    }

    public final void initIfEmpty(java.lang.String initialKey) {
        if (this.getHighSpeedVideoFpsRangesFor.getValue() != null || initialKey == null) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.setValue(initialKey);
    }
}
