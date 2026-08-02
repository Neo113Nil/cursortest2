package com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsState;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsState;Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/fileupload/viewmodel/FileUploadOptionsEvent;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FileUploadOptionsReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public FileUploadOptionsReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "FileUploadOptionsReducer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect>> reduce(com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState state, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Ready)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Ready ready = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Ready) state;
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnTakePhotoClicked.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.RequestCameraPermission.INSTANCE);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnChoosePhotoClicked.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchPhotoPicker.INSTANCE);
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraPermissionResult) {
                com.paypal.oslo.core.permission.domain.model.PermissionStatus status = ((com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraPermissionResult) event).getStatus();
                if (kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.core.permission.domain.model.PermissionStatus.Granted.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchCamera.INSTANCE);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(status, com.paypal.oslo.core.permission.domain.model.PermissionStatus.PermanentlyDenied.INSTANCE)) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.NavigateToSettings.INSTANCE);
                }
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.ReturnResult(null));
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraResult) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.ReturnResult(((com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraResult) event).getSuccess() ? ready.getPendingCameraUri() : null));
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.UriResultEvent) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.ReturnResult(((com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.UriResultEvent) event).getUri()));
            }
            if (event instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraUriCreated) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(ready.copy(((com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnCameraUriCreated) event).getUri()), null, 2, null);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnChooseDocumentClicked.INSTANCE)) {
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output(ready, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsUiEffect.LaunchDocumentPicker.INSTANCE);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(ready, event);
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Initial initial = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Initial) state;
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsEvent.OnViewCreated.INSTANCE)) {
            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.viewmodel.FileUploadOptionsState.Ready(null, 1, null), null, 2, null);
        }
        return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
    }
}
