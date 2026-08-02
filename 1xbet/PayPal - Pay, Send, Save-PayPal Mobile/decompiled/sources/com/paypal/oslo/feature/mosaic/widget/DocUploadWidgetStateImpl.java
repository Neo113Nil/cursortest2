package com.paypal.oslo.feature.mosaic.widget;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t8C@CX\u0083\u008c\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00178C@CX\u0083\u008c\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R+\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00068A@CX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\bR\u0014\u0010\"\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\bR\u0014\u0010#\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/widget/DocUploadWidgetStateImpl;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;", "Lcom/paypal/pds/components/DropdownState;", "dropdownState", "<init>", "(Lcom/paypal/pds/components/DropdownState;)V", "", "validate", "()Z", "", "docTypeKey", "", "onDocTypeSelected$mosaic_prodRelease", "(Ljava/lang/String;)V", "docRefId", "onUploadSuccess$mosaic_prodRelease", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/paypal/pds/components/DropdownState;", "getDropdownState$mosaic_prodRelease", "()Lcom/paypal/pds/components/DropdownState;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableState;", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoSizes", "<set-?>", "hasValidationBeenTriggered$delegate", "getHasValidationBeenTriggered$mosaic_prodRelease", "setHasValidationBeenTriggered", "(Z)V", "hasValidationBeenTriggered", "getShowDocTypeError$mosaic_prodRelease", "showDocTypeError", "getShowUploadError$mosaic_prodRelease", "showUploadError", "isValid"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocUploadWidgetStateImpl implements com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState {
    public static final int $stable = com.paypal.pds.components.DropdownState.$stable;
    private final com.paypal.pds.components.DropdownState dropdownState;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState Camera2StreamConfigurationMap;
    private final androidx.compose.runtime.MutableState getHighSpeedVideoSizes;

    /* renamed from: hasValidationBeenTriggered$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState hasValidationBeenTriggered;

    public DocUploadWidgetStateImpl(com.paypal.pds.components.DropdownState dropdownState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownState, "");
        this.dropdownState = dropdownState;
        this.Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.collections.MapsKt.emptyMap(), null, 2, null);
        this.hasValidationBeenTriggered = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
    }

    /* renamed from: getDropdownState$mosaic_prodRelease, reason: from getter */
    public final com.paypal.pds.components.DropdownState getDropdownState() {
        return this.dropdownState;
    }

    private final void setHasValidationBeenTriggered(boolean z) {
        this.hasValidationBeenTriggered.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasValidationBeenTriggered$mosaic_prodRelease() {
        return ((java.lang.Boolean) this.hasValidationBeenTriggered.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowDocTypeError$mosaic_prodRelease() {
        return getHasValidationBeenTriggered$mosaic_prodRelease() && ((java.lang.String) this.Camera2StreamConfigurationMap.getValue()) == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowUploadError$mosaic_prodRelease() {
        return getHasValidationBeenTriggered$mosaic_prodRelease() && ((java.lang.String) this.Camera2StreamConfigurationMap.getValue()) != null && ((java.util.Map) this.getHighSpeedVideoSizes.getValue()).get((java.lang.String) this.Camera2StreamConfigurationMap.getValue()) == null;
    }

    @Override // com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState
    public final boolean validate() {
        setHasValidationBeenTriggered(true);
        return isValid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState
    public final boolean isValid() {
        return (((java.lang.String) this.Camera2StreamConfigurationMap.getValue()) == null || ((java.util.Map) this.getHighSpeedVideoSizes.getValue()).get((java.lang.String) this.Camera2StreamConfigurationMap.getValue()) == null) ? false : true;
    }

    public final void onDocTypeSelected$mosaic_prodRelease(java.lang.String docTypeKey) {
        this.Camera2StreamConfigurationMap.setValue(docTypeKey);
    }

    public final void onUploadSuccess$mosaic_prodRelease(java.lang.String docTypeKey, java.lang.String docRefId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docTypeKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docRefId, "");
        this.getHighSpeedVideoSizes.setValue(kotlin.collections.MapsKt.plus((java.util.Map) this.getHighSpeedVideoSizes.getValue(), kotlin.TuplesKt.to(docTypeKey, docRefId)));
    }
}
