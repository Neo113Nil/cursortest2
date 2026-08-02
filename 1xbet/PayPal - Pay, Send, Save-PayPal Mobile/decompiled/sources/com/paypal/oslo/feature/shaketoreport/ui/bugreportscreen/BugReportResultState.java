package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR/\u0010\"\u001a\u0004\u0018\u00010\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\n8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\rR/\u0010'\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportResultState;", "", "Lcom/paypal/pds/components/BottomSheetController;", "successSheetController", "errorSheetController", "Lkotlin/Function0;", "", "onSuccessCallback", "<init>", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;)V", "Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportSuccess;", "success", "handleSuccess", "(Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportSuccess;)V", "Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportError;", "error", "handleError", "(Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportError;)V", "onSuccessDismiss", "()V", "onErrorDismiss", "Lcom/paypal/pds/components/BottomSheetController;", "getSuccessSheetController", "()Lcom/paypal/pds/components/BottomSheetController;", "getErrorSheetController", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "<set-?>", "successResult$delegate", "Landroidx/compose/runtime/MutableState;", "getSuccessResult", "()Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportSuccess;", "setSuccessResult", "successResult", "errorResult$delegate", "getErrorResult", "()Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportError;", "setErrorResult", "errorResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BugReportResultState {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: errorResult$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState errorResult;
    private final com.paypal.pds.components.BottomSheetController errorSheetController;

    /* renamed from: successResult$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState successResult;
    private final com.paypal.pds.components.BottomSheetController successSheetController;

    public BugReportResultState(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.successSheetController = bottomSheetController;
        this.errorSheetController = bottomSheetController2;
        this.getHighSpeedVideoFpsRanges = function0;
        this.successResult = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.errorResult = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final com.paypal.pds.components.BottomSheetController getSuccessSheetController() {
        return this.successSheetController;
    }

    public final com.paypal.pds.components.BottomSheetController getErrorSheetController() {
        return this.errorSheetController;
    }

    private final void setSuccessResult(com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess bugReportSuccess) {
        this.successResult.setValue(bugReportSuccess);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess getSuccessResult() {
        return (com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess) this.successResult.getValue();
    }

    private final void setErrorResult(com.paypal.oslo.feature.shaketoreport.domain.BugReportError bugReportError) {
        this.errorResult.setValue(bugReportError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.shaketoreport.domain.BugReportError getErrorResult() {
        return (com.paypal.oslo.feature.shaketoreport.domain.BugReportError) this.errorResult.getValue();
    }

    public final void handleSuccess(com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess success) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
        setSuccessResult(success);
        this.successSheetController.showSheet();
    }

    public final void handleError(com.paypal.oslo.feature.shaketoreport.domain.BugReportError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        setErrorResult(error);
        this.errorSheetController.showSheet();
    }

    public final void onSuccessDismiss() {
        setSuccessResult(null);
        this.getHighSpeedVideoFpsRanges.invoke();
    }

    public final void onErrorDismiss() {
        setErrorResult(null);
    }
}
