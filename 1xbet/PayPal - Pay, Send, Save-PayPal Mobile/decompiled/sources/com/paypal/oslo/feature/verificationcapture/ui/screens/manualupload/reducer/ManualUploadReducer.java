package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.reducer;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001a\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u001c2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001a\u0010 J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0014\u001a\u00020$H\u0002¢\u0006\u0004\b\u0016\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/reducer/ManualUploadReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;)Larrow/core/Either;", "", "p0", "", "p1", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/UiError;", "getHighSpeedVideoFpsRanges", "(IZ)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/UiError;", "", "p2", "getHighSpeedVideoSizes", "(JII)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/UiError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Success;", "", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/DocumentPreview;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Ready;", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Success;Ljava/util/List;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/UiError;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Ready;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$Initialize;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$Initialize;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Ready;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadSuccess;", "(Ljava/util/List;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadSuccess;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ManualUploadReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ManualUploadReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "ManualUploadReducer";
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect>> reduce(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState state, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent event) {
        kotlin.Pair pair;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview copy;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy2;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview copy3;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy4;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading copy5;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy6;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy7;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener notifyListener;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener notifyListener2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy8;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy9;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy10;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy11;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy12;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy13;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy14;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy15;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenFilePicker openFilePicker;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy16;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy17;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy18;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy19;
        kotlin.Pair pair2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        int i = 0;
        if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.Initialize)) {
            if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ScanDocumentClicked)) {
                if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadDocumentClicked)) {
                    if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected)) {
                        if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FilesSelected)) {
                            if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FileProcessed)) {
                                if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PhotoCaptured)) {
                                    if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.SdkCaptureCompleted)) {
                                        if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteDocumentClicked)) {
                                            if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteConfirmed)) {
                                                if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DismissError)) {
                                                    if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ShowError)) {
                                                        if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.StartUpload)) {
                                                            if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadSuccess)) {
                                                                if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError)) {
                                                                    if (!(event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PermissionResult)) {
                                                                        throw new kotlin.NoWhenBranchMatchedException();
                                                                    }
                                                                    pair = kotlin.TuplesKt.to(state, null);
                                                                } else {
                                                                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError uploadError = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError) event;
                                                                    if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading) {
                                                                        if (uploadError.getClearDocuments()) {
                                                                            arrayList2 = kotlin.collections.CollectionsKt.emptyList();
                                                                        } else {
                                                                            java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents = ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading) state).getDocuments();
                                                                            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents, 10));
                                                                            java.util.Iterator<T> it = documents.iterator();
                                                                            while (it.hasNext()) {
                                                                                copy3 = r8.copy((r22 & 1) != 0 ? r8.id : null, (r22 & 2) != 0 ? r8.name : null, (r22 & 4) != 0 ? r8.sizeKB : 0L, (r22 & 8) != 0 ? r8.mimeType : null, (r22 & 16) != 0 ? r8.imageData : null, (r22 & 32) != 0 ? r8.fileId : null, (r22 & 64) != 0 ? r8.docId : null, (r22 & 128) != 0 ? r8.isUploading : false, (r22 & 256) != 0 ? ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) it.next()).uploadError : null);
                                                                                arrayList3.add(copy3);
                                                                            }
                                                                            arrayList2 = arrayList3;
                                                                        }
                                                                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading uploading = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading) state;
                                                                        pair = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready(uploading.getCaptureMode(), arrayList2, uploading.getMaxFiles(), uploading.getMaxFileSizeKB(), uploading.getMinFileSizeKB(), uploading.getAcceptedMimeTypes(), new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError(uploadError.getErrorMessage(), null, true, 2, null), uploading.getDocumentType(), uploading.getDocumentSide(), uploading.getUploadMetadata()), new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus.ERROR, null));
                                                                    } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
                                                                        if (uploadError.getClearDocuments()) {
                                                                            arrayList = kotlin.collections.CollectionsKt.emptyList();
                                                                        } else {
                                                                            java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents2 = ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state).getDocuments();
                                                                            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents2, 10));
                                                                            java.util.Iterator<T> it2 = documents2.iterator();
                                                                            while (it2.hasNext()) {
                                                                                copy = r8.copy((r22 & 1) != 0 ? r8.id : null, (r22 & 2) != 0 ? r8.name : null, (r22 & 4) != 0 ? r8.sizeKB : 0L, (r22 & 8) != 0 ? r8.mimeType : null, (r22 & 16) != 0 ? r8.imageData : null, (r22 & 32) != 0 ? r8.fileId : null, (r22 & 64) != 0 ? r8.docId : null, (r22 & 128) != 0 ? r8.isUploading : false, (r22 & 256) != 0 ? ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) it2.next()).uploadError : null);
                                                                                arrayList4.add(copy);
                                                                            }
                                                                            arrayList = arrayList4;
                                                                        }
                                                                        copy2 = r8.copy((r22 & 1) != 0 ? r8.captureMode : null, (r22 & 2) != 0 ? r8.documents : arrayList, (r22 & 4) != 0 ? r8.maxFiles : 0, (r22 & 8) != 0 ? r8.maxFileSizeKB : 0, (r22 & 16) != 0 ? r8.minFileSizeKB : 0, (r22 & 32) != 0 ? r8.acceptedMimeTypes : null, (r22 & 64) != 0 ? r8.error : new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError(uploadError.getErrorMessage(), null, true, 2, null), (r22 & 128) != 0 ? r8.documentType : null, (r22 & 256) != 0 ? r8.documentSide : null, (r22 & 512) != 0 ? ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state).uploadMetadata : null);
                                                                        pair = kotlin.TuplesKt.to(copy2, new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus.ERROR, null));
                                                                    } else {
                                                                        pair = kotlin.TuplesKt.to(state, null);
                                                                    }
                                                                }
                                                            } else {
                                                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadSuccess uploadSuccess = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadSuccess) event;
                                                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] handleUploadSuccess", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("document_id", uploadSuccess.getDocumentId()), kotlin.TuplesKt.to(androidx.core.provider.FontsContractCompat.Columns.FILE_ID, uploadSuccess.getFileId())), null, 4, null);
                                                                if (!(state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading)) {
                                                                    if (!(state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready)) {
                                                                        pair = kotlin.TuplesKt.to(state, null);
                                                                    } else {
                                                                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state;
                                                                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] Current documents count (Ready state)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Integer.valueOf(ready.getDocuments().size()))), null, 4, null);
                                                                        java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(ready.getDocuments(), uploadSuccess);
                                                                        copy4 = ready.copy((r22 & 1) != 0 ? ready.captureMode : null, (r22 & 2) != 0 ? ready.documents : highSpeedVideoFpsRanges, (r22 & 4) != 0 ? ready.maxFiles : 0, (r22 & 8) != 0 ? ready.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready.minFileSizeKB : 0, (r22 & 32) != 0 ? ready.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready.error : null, (r22 & 128) != 0 ? ready.documentType : null, (r22 & 256) != 0 ? ready.documentSide : null, (r22 & 512) != 0 ? ready.uploadMetadata : null);
                                                                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] Returning new state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("document_count", java.lang.Integer.valueOf(copy4.getDocuments().size()))), null, 4, null);
                                                                        pair = kotlin.TuplesKt.to(copy4, new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus.DOC_UPLOADED, highSpeedVideoFpsRanges));
                                                                    }
                                                                } else {
                                                                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading uploading2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading) state;
                                                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] Current documents count", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Integer.valueOf(uploading2.getDocuments().size()))), null, 4, null);
                                                                    java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(uploading2.getDocuments(), uploadSuccess);
                                                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] Updated documents count", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Integer.valueOf(highSpeedVideoFpsRanges2.size()))), null, 4, null);
                                                                    java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> list = highSpeedVideoFpsRanges2;
                                                                    for (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview : list) {
                                                                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer]   Updated doc", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("id", documentPreview.getId()), kotlin.TuplesKt.to(androidx.core.provider.FontsContractCompat.Columns.FILE_ID, documentPreview.getFileId()), kotlin.TuplesKt.to("is_uploaded", java.lang.Boolean.valueOf(documentPreview.isUploaded()))), null, 4, null);
                                                                    }
                                                                    if (!list.isEmpty()) {
                                                                        java.util.Iterator<T> it3 = list.iterator();
                                                                        while (it3.hasNext()) {
                                                                            if (!((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) it3.next()).isUploaded()) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    i = 1;
                                                                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener notifyListener3 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus.DOC_UPLOADED, highSpeedVideoFpsRanges2);
                                                                    if (i != 0) {
                                                                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] All documents uploaded, transitioning to Success", null, null, 6, null);
                                                                        pair = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success(highSpeedVideoFpsRanges2, uploadSuccess.getDocId(), uploading2.getCaptureMode(), uploading2.getMaxFiles(), uploading2.getMaxFileSizeKB(), uploading2.getMinFileSizeKB(), uploading2.getAcceptedMimeTypes(), uploading2.getDocumentType(), uploading2.getDocumentSide(), uploading2.getUploadMetadata()), notifyListener3);
                                                                    } else {
                                                                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] Some documents still uploading", null, null, 6, null);
                                                                        copy5 = uploading2.copy((r22 & 1) != 0 ? uploading2.captureMode : null, (r22 & 2) != 0 ? uploading2.documents : highSpeedVideoFpsRanges2, (r22 & 4) != 0 ? uploading2.uploadingIds : null, (r22 & 8) != 0 ? uploading2.maxFiles : 0, (r22 & 16) != 0 ? uploading2.maxFileSizeKB : 0, (r22 & 32) != 0 ? uploading2.minFileSizeKB : 0, (r22 & 64) != 0 ? uploading2.acceptedMimeTypes : null, (r22 & 128) != 0 ? uploading2.documentType : null, (r22 & 256) != 0 ? uploading2.documentSide : null, (r22 & 512) != 0 ? uploading2.uploadMetadata : null);
                                                                        pair = kotlin.TuplesKt.to(copy5, notifyListener3);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.StartUpload startUpload = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.StartUpload) event;
                                                            if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
                                                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state;
                                                                java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents3 = ready2.getDocuments();
                                                                java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(documents3, 10));
                                                                for (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview2 : documents3) {
                                                                    if (startUpload.getDocumentIds().contains(documentPreview2.getId())) {
                                                                        documentPreview2 = documentPreview2.copy((r22 & 1) != 0 ? documentPreview2.id : null, (r22 & 2) != 0 ? documentPreview2.name : null, (r22 & 4) != 0 ? documentPreview2.sizeKB : 0L, (r22 & 8) != 0 ? documentPreview2.mimeType : null, (r22 & 16) != 0 ? documentPreview2.imageData : null, (r22 & 32) != 0 ? documentPreview2.fileId : null, (r22 & 64) != 0 ? documentPreview2.docId : null, (r22 & 128) != 0 ? documentPreview2.isUploading : true, (r22 & 256) != 0 ? documentPreview2.uploadError : null);
                                                                    }
                                                                    arrayList5.add(documentPreview2);
                                                                }
                                                                java.util.ArrayList arrayList6 = arrayList5;
                                                                pair = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading(ready2.getCaptureMode(), arrayList6, startUpload.getDocumentIds(), ready2.getMaxFiles(), ready2.getMaxFileSizeKB(), ready2.getMinFileSizeKB(), ready2.getAcceptedMimeTypes(), ready2.getDocumentType(), ready2.getDocumentSide(), ready2.getUploadMetadata()), new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus.UPLOADING, arrayList6));
                                                            } else {
                                                                pair = kotlin.TuplesKt.to(state, null);
                                                            }
                                                        }
                                                    } else {
                                                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ShowError showError = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ShowError) event;
                                                        if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
                                                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready3 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state;
                                                            java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents4 = ready3.getDocuments();
                                                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                                            for (java.lang.Object obj3 : documents4) {
                                                                if (((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) obj3).isUploaded()) {
                                                                    arrayList7.add(obj3);
                                                                }
                                                            }
                                                            copy6 = ready3.copy((r22 & 1) != 0 ? ready3.captureMode : null, (r22 & 2) != 0 ? ready3.documents : arrayList7, (r22 & 4) != 0 ? ready3.maxFiles : 0, (r22 & 8) != 0 ? ready3.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready3.minFileSizeKB : 0, (r22 & 32) != 0 ? ready3.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready3.error : new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError(showError.getMessage(), null, showError.isPersistent(), 2, null), (r22 & 128) != 0 ? ready3.documentType : null, (r22 & 256) != 0 ? ready3.documentSide : null, (r22 & 512) != 0 ? ready3.uploadMetadata : null);
                                                            pair = kotlin.TuplesKt.to(copy6, null);
                                                        } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading) {
                                                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading uploading3 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading) state;
                                                            java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents5 = uploading3.getDocuments();
                                                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                                            for (java.lang.Object obj4 : documents5) {
                                                                if (((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) obj4).isUploaded()) {
                                                                    arrayList8.add(obj4);
                                                                }
                                                            }
                                                            pair = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready(uploading3.getCaptureMode(), arrayList8, uploading3.getMaxFiles(), uploading3.getMaxFileSizeKB(), uploading3.getMinFileSizeKB(), uploading3.getAcceptedMimeTypes(), new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError(showError.getMessage(), null, showError.isPersistent(), 2, null), uploading3.getDocumentType(), uploading3.getDocumentSide(), uploading3.getUploadMetadata()), null);
                                                        } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) {
                                                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success success = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) state;
                                                            java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents6 = success.getDocuments();
                                                            java.util.ArrayList arrayList9 = new java.util.ArrayList();
                                                            for (java.lang.Object obj5 : documents6) {
                                                                if (((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) obj5).isUploaded()) {
                                                                    arrayList9.add(obj5);
                                                                }
                                                            }
                                                            pair = kotlin.TuplesKt.to(getHighSpeedVideoSizes(success, arrayList9, new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError(showError.getMessage(), null, showError.isPersistent(), 2, null)), null);
                                                        } else {
                                                            pair = kotlin.TuplesKt.to(state, null);
                                                        }
                                                    }
                                                } else if (!(state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready)) {
                                                    pair = kotlin.TuplesKt.to(state, null);
                                                } else {
                                                    copy7 = r8.copy((r22 & 1) != 0 ? r8.captureMode : null, (r22 & 2) != 0 ? r8.documents : null, (r22 & 4) != 0 ? r8.maxFiles : 0, (r22 & 8) != 0 ? r8.maxFileSizeKB : 0, (r22 & 16) != 0 ? r8.minFileSizeKB : 0, (r22 & 32) != 0 ? r8.acceptedMimeTypes : null, (r22 & 64) != 0 ? r8.error : null, (r22 & 128) != 0 ? r8.documentType : null, (r22 & 256) != 0 ? r8.documentSide : null, (r22 & 512) != 0 ? ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state).uploadMetadata : null);
                                                    pair = kotlin.TuplesKt.to(copy7, null);
                                                }
                                            } else {
                                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteConfirmed deleteConfirmed = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteConfirmed) event;
                                                if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
                                                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready4 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state;
                                                    java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents7 = ready4.getDocuments();
                                                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                                                    for (java.lang.Object obj6 : documents7) {
                                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) obj6).getId(), deleteConfirmed.getDocumentId())) {
                                                            arrayList10.add(obj6);
                                                        }
                                                    }
                                                    java.util.ArrayList arrayList11 = arrayList10;
                                                    if (arrayList11.isEmpty()) {
                                                        notifyListener2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus.DOC_ALL_REMOVED, null);
                                                    } else {
                                                        notifyListener2 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus.DOC_REMOVED, arrayList11);
                                                    }
                                                    copy8 = ready4.copy((r22 & 1) != 0 ? ready4.captureMode : null, (r22 & 2) != 0 ? ready4.documents : arrayList11, (r22 & 4) != 0 ? ready4.maxFiles : 0, (r22 & 8) != 0 ? ready4.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready4.minFileSizeKB : 0, (r22 & 32) != 0 ? ready4.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready4.error : null, (r22 & 128) != 0 ? ready4.documentType : null, (r22 & 256) != 0 ? ready4.documentSide : null, (r22 & 512) != 0 ? ready4.uploadMetadata : null);
                                                    pair = kotlin.TuplesKt.to(copy8, notifyListener2);
                                                } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) {
                                                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success success2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) state;
                                                    java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents8 = success2.getDocuments();
                                                    java.util.ArrayList arrayList12 = new java.util.ArrayList();
                                                    for (java.lang.Object obj7 : documents8) {
                                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) obj7).getId(), deleteConfirmed.getDocumentId())) {
                                                            arrayList12.add(obj7);
                                                        }
                                                    }
                                                    java.util.ArrayList arrayList13 = arrayList12;
                                                    if (arrayList13.isEmpty()) {
                                                        notifyListener = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus.DOC_ALL_REMOVED, null);
                                                    } else {
                                                        notifyListener = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus.DOC_REMOVED, arrayList13);
                                                    }
                                                    pair = kotlin.TuplesKt.to(getHighSpeedVideoSizes(success2, arrayList13, (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError) null), notifyListener);
                                                } else {
                                                    pair = kotlin.TuplesKt.to(state, null);
                                                }
                                            }
                                        } else {
                                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteDocumentClicked deleteDocumentClicked = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteDocumentClicked) event;
                                            if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
                                                java.util.Iterator<T> it4 = ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state).getDocuments().iterator();
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                        obj2 = null;
                                                        break;
                                                    }
                                                    obj2 = it4.next();
                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) obj2).getId(), deleteDocumentClicked.getDocumentId())) {
                                                        break;
                                                    }
                                                }
                                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview3 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) obj2;
                                                if (documentPreview3 != null) {
                                                    pair = kotlin.TuplesKt.to(state, new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowDeleteConfirmDialog(documentPreview3.getId(), documentPreview3.getName()));
                                                } else {
                                                    pair = kotlin.TuplesKt.to(state, null);
                                                }
                                            } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) {
                                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] handleUploadSuccess", null, null, 6, null);
                                                java.util.Iterator<T> it5 = ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) state).getDocuments().iterator();
                                                while (true) {
                                                    if (!it5.hasNext()) {
                                                        obj = null;
                                                        break;
                                                    }
                                                    obj = it5.next();
                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) obj).getId(), deleteDocumentClicked.getDocumentId())) {
                                                        break;
                                                    }
                                                }
                                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview4 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) obj;
                                                if (documentPreview4 != null) {
                                                    pair = kotlin.TuplesKt.to(state, new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowDeleteConfirmDialog(documentPreview4.getId(), documentPreview4.getName()));
                                                } else {
                                                    pair = kotlin.TuplesKt.to(state, null);
                                                }
                                            } else {
                                                pair = kotlin.TuplesKt.to(state, null);
                                            }
                                        }
                                    } else {
                                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.SdkCaptureCompleted sdkCaptureCompleted = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.SdkCaptureCompleted) event;
                                        if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
                                            java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult> results = sdkCaptureCompleted.getResults();
                                            java.util.ArrayList arrayList14 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(results, 10));
                                            for (java.lang.Object obj8 : results) {
                                                if (i < 0) {
                                                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                                                }
                                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult sdkCaptureResult = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult) obj8;
                                                java.lang.String obj9 = java.util.UUID.randomUUID().toString();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj9, "");
                                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder("sdk_capture_");
                                                sb.append(currentTimeMillis);
                                                sb.append("_");
                                                sb.append(i);
                                                sb.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
                                                arrayList14.add(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview(obj9, sb.toString(), sdkCaptureResult.getImageData().length / okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, sdkCaptureResult.getMimeType(), sdkCaptureResult.getImageData(), null, null, false, null, 352, null));
                                                i++;
                                            }
                                            java.util.ArrayList arrayList15 = arrayList14;
                                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready5 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state;
                                            if (ready5.getDocuments().size() + arrayList15.size() > ready5.getMaxFiles()) {
                                                if (arrayList15.size() != ready5.getMaxFiles()) {
                                                    arrayList15 = kotlin.collections.CollectionsKt.plus((java.util.Collection) ready5.getDocuments(), (java.lang.Iterable) arrayList15);
                                                }
                                                copy10 = ready5.copy((r22 & 1) != 0 ? ready5.captureMode : null, (r22 & 2) != 0 ? ready5.documents : arrayList15, (r22 & 4) != 0 ? ready5.maxFiles : 0, (r22 & 8) != 0 ? ready5.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready5.minFileSizeKB : 0, (r22 & 32) != 0 ? ready5.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready5.error : null, (r22 & 128) != 0 ? ready5.documentType : null, (r22 & 256) != 0 ? ready5.documentSide : null, (r22 & 512) != 0 ? ready5.uploadMetadata : null);
                                                pair = kotlin.TuplesKt.to(copy10, null);
                                            } else {
                                                copy9 = ready5.copy((r22 & 1) != 0 ? ready5.captureMode : null, (r22 & 2) != 0 ? ready5.documents : kotlin.collections.CollectionsKt.plus((java.util.Collection) ready5.getDocuments(), (java.lang.Iterable) arrayList15), (r22 & 4) != 0 ? ready5.maxFiles : 0, (r22 & 8) != 0 ? ready5.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready5.minFileSizeKB : 0, (r22 & 32) != 0 ? ready5.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready5.error : null, (r22 & 128) != 0 ? ready5.documentType : null, (r22 & 256) != 0 ? ready5.documentSide : null, (r22 & 512) != 0 ? ready5.uploadMetadata : null);
                                                pair = kotlin.TuplesKt.to(copy9, null);
                                            }
                                        } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) {
                                            java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult> results2 = sdkCaptureCompleted.getResults();
                                            java.util.ArrayList arrayList16 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(results2, 10));
                                            for (java.lang.Object obj10 : results2) {
                                                if (i < 0) {
                                                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                                                }
                                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult sdkCaptureResult2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult) obj10;
                                                java.lang.String obj11 = java.util.UUID.randomUUID().toString();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj11, "");
                                                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("sdk_capture_");
                                                sb2.append(currentTimeMillis2);
                                                sb2.append("_");
                                                sb2.append(i);
                                                sb2.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
                                                arrayList16.add(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview(obj11, sb2.toString(), sdkCaptureResult2.getImageData().length / okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, sdkCaptureResult2.getMimeType(), sdkCaptureResult2.getImageData(), null, null, false, null, 352, null));
                                                i++;
                                            }
                                            java.util.ArrayList arrayList17 = arrayList16;
                                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success success3 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) state;
                                            if (success3.getDocuments().size() + arrayList17.size() > success3.getMaxFiles()) {
                                                if (arrayList17.size() != success3.getMaxFiles()) {
                                                    arrayList17 = kotlin.collections.CollectionsKt.plus((java.util.Collection) success3.getDocuments(), (java.lang.Iterable) arrayList17);
                                                }
                                            } else {
                                                arrayList17 = kotlin.collections.CollectionsKt.plus((java.util.Collection) success3.getDocuments(), (java.lang.Iterable) arrayList17);
                                            }
                                            pair = kotlin.TuplesKt.to(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready(success3.getCaptureMode(), arrayList17, success3.getMaxFiles(), success3.getMaxFileSizeKB(), success3.getMinFileSizeKB(), success3.getAcceptedMimeTypes(), null, success3.getDocumentType(), success3.getDocumentSide(), success3.getUploadMetadata()), null);
                                        } else {
                                            pair = kotlin.TuplesKt.to(state, null);
                                        }
                                    }
                                } else {
                                    java.lang.String obj12 = java.util.UUID.randomUUID().toString();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj12, "");
                                    long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("photo_");
                                    sb3.append(currentTimeMillis3);
                                    sb3.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
                                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview5 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview(obj12, sb3.toString(), r1.getImageData().length / okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, "image/jpeg", ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PhotoCaptured) event).getImageData(), null, null, false, null, 352, null);
                                    if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
                                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready6 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state;
                                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError highSpeedVideoSizes = getHighSpeedVideoSizes(documentPreview5.getSizeKB(), ready6.getMinFileSizeKB(), ready6.getMaxFileSizeKB());
                                        if (highSpeedVideoSizes != null) {
                                            copy12 = ready6.copy((r22 & 1) != 0 ? ready6.captureMode : null, (r22 & 2) != 0 ? ready6.documents : null, (r22 & 4) != 0 ? ready6.maxFiles : 0, (r22 & 8) != 0 ? ready6.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready6.minFileSizeKB : 0, (r22 & 32) != 0 ? ready6.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready6.error : com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError.copy$default(highSpeedVideoSizes, null, null, true, 3, null), (r22 & 128) != 0 ? ready6.documentType : null, (r22 & 256) != 0 ? ready6.documentSide : null, (r22 & 512) != 0 ? ready6.uploadMetadata : null);
                                            pair = kotlin.TuplesKt.to(copy12, null);
                                        } else {
                                            copy11 = ready6.copy((r22 & 1) != 0 ? ready6.captureMode : null, (r22 & 2) != 0 ? ready6.documents : kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview>) ready6.getDocuments(), documentPreview5), (r22 & 4) != 0 ? ready6.maxFiles : 0, (r22 & 8) != 0 ? ready6.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready6.minFileSizeKB : 0, (r22 & 32) != 0 ? ready6.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready6.error : null, (r22 & 128) != 0 ? ready6.documentType : null, (r22 & 256) != 0 ? ready6.documentSide : null, (r22 & 512) != 0 ? ready6.uploadMetadata : null);
                                            pair = kotlin.TuplesKt.to(copy11, null);
                                        }
                                    } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) {
                                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success success4 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) state;
                                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError highSpeedVideoSizes2 = getHighSpeedVideoSizes(documentPreview5.getSizeKB(), success4.getMinFileSizeKB(), success4.getMaxFileSizeKB());
                                        if (highSpeedVideoSizes2 != null) {
                                            pair = kotlin.TuplesKt.to(getHighSpeedVideoSizes(success4, success4.getDocuments(), com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError.copy$default(highSpeedVideoSizes2, null, null, true, 3, null)), null);
                                        } else {
                                            pair = kotlin.TuplesKt.to(getHighSpeedVideoSizes(success4, (java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview>) kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview>) success4.getDocuments(), documentPreview5), (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError) null), null);
                                        }
                                    } else {
                                        pair = kotlin.TuplesKt.to(state, null);
                                    }
                                }
                            } else {
                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FileProcessed fileProcessed = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FileProcessed) event;
                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview6 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview(fileProcessed.getDocumentId(), fileProcessed.getFileName(), fileProcessed.getSizeKB(), fileProcessed.getMimeType(), fileProcessed.getImageData(), null, null, false, null, 352, null);
                                if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
                                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready7 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state;
                                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError highSpeedVideoSizes3 = getHighSpeedVideoSizes(documentPreview6.getSizeKB(), ready7.getMinFileSizeKB(), ready7.getMaxFileSizeKB());
                                    if (highSpeedVideoSizes3 == null) {
                                        if (!ready7.getCanAddMore()) {
                                            copy14 = ready7.copy((r22 & 1) != 0 ? ready7.captureMode : null, (r22 & 2) != 0 ? ready7.documents : null, (r22 & 4) != 0 ? ready7.maxFiles : 0, (r22 & 8) != 0 ? ready7.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready7.minFileSizeKB : 0, (r22 & 32) != 0 ? ready7.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready7.error : getHighSpeedVideoFpsRanges(ready7.getMaxFiles(), false), (r22 & 128) != 0 ? ready7.documentType : null, (r22 & 256) != 0 ? ready7.documentSide : null, (r22 & 512) != 0 ? ready7.uploadMetadata : null);
                                            pair = kotlin.TuplesKt.to(copy14, null);
                                        } else {
                                            copy13 = ready7.copy((r22 & 1) != 0 ? ready7.captureMode : null, (r22 & 2) != 0 ? ready7.documents : kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview>) ready7.getDocuments(), documentPreview6), (r22 & 4) != 0 ? ready7.maxFiles : 0, (r22 & 8) != 0 ? ready7.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready7.minFileSizeKB : 0, (r22 & 32) != 0 ? ready7.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready7.error : null, (r22 & 128) != 0 ? ready7.documentType : null, (r22 & 256) != 0 ? ready7.documentSide : null, (r22 & 512) != 0 ? ready7.uploadMetadata : null);
                                            pair = kotlin.TuplesKt.to(copy13, null);
                                        }
                                    } else {
                                        copy15 = ready7.copy((r22 & 1) != 0 ? ready7.captureMode : null, (r22 & 2) != 0 ? ready7.documents : null, (r22 & 4) != 0 ? ready7.maxFiles : 0, (r22 & 8) != 0 ? ready7.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready7.minFileSizeKB : 0, (r22 & 32) != 0 ? ready7.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready7.error : highSpeedVideoSizes3, (r22 & 128) != 0 ? ready7.documentType : null, (r22 & 256) != 0 ? ready7.documentSide : null, (r22 & 512) != 0 ? ready7.uploadMetadata : null);
                                        pair = kotlin.TuplesKt.to(copy15, null);
                                    }
                                } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) {
                                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success success5 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) state;
                                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError highSpeedVideoSizes4 = getHighSpeedVideoSizes(documentPreview6.getSizeKB(), success5.getMinFileSizeKB(), success5.getMaxFileSizeKB());
                                    if (highSpeedVideoSizes4 != null) {
                                        pair = kotlin.TuplesKt.to(getHighSpeedVideoSizes(success5, success5.getDocuments(), highSpeedVideoSizes4), null);
                                    } else if (success5.getDocuments().size() >= success5.getMaxFiles()) {
                                        pair = kotlin.TuplesKt.to(getHighSpeedVideoSizes(success5, success5.getDocuments(), getHighSpeedVideoFpsRanges(success5.getMaxFiles(), false)), null);
                                    } else {
                                        pair = kotlin.TuplesKt.to(getHighSpeedVideoSizes(success5, (java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview>) kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview>) success5.getDocuments(), documentPreview6), (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError) null), null);
                                    }
                                } else {
                                    pair = kotlin.TuplesKt.to(state, null);
                                }
                            }
                        } else {
                            pair = kotlin.TuplesKt.to(state, null);
                        }
                    } else {
                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected uploadMethodSelected = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected) event;
                        if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
                            if (uploadMethodSelected instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected.Camera) {
                                openFilePicker = com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenCamera.INSTANCE;
                            } else if (uploadMethodSelected instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected.Gallery) {
                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready8 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state;
                                openFilePicker = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenGallery(ready8.getMaxFiles() - ready8.getDocuments().size());
                            } else {
                                if (!(uploadMethodSelected instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected.FilePicker)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready9 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state;
                                openFilePicker = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.OpenFilePicker(ready9.getAcceptedMimeTypes(), ready9.getMaxFiles() - ready9.getDocuments().size());
                            }
                            pair = kotlin.TuplesKt.to(state, openFilePicker);
                        } else {
                            pair = kotlin.TuplesKt.to(state, null);
                        }
                    }
                } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready10 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state;
                    if (ready10.getCanAddMore()) {
                        copy17 = ready10.copy((r22 & 1) != 0 ? ready10.captureMode : null, (r22 & 2) != 0 ? ready10.documents : null, (r22 & 4) != 0 ? ready10.maxFiles : 0, (r22 & 8) != 0 ? ready10.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready10.minFileSizeKB : 0, (r22 & 32) != 0 ? ready10.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready10.error : null, (r22 & 128) != 0 ? ready10.documentType : null, (r22 & 256) != 0 ? ready10.documentSide : null, (r22 & 512) != 0 ? ready10.uploadMetadata : null);
                        pair = kotlin.TuplesKt.to(copy17, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowUploadMethodDialog.INSTANCE);
                    } else {
                        copy16 = ready10.copy((r22 & 1) != 0 ? ready10.captureMode : null, (r22 & 2) != 0 ? ready10.documents : null, (r22 & 4) != 0 ? ready10.maxFiles : 0, (r22 & 8) != 0 ? ready10.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready10.minFileSizeKB : 0, (r22 & 32) != 0 ? ready10.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready10.error : getHighSpeedVideoFpsRanges(ready10.getMaxFiles(), true), (r22 & 128) != 0 ? ready10.documentType : null, (r22 & 256) != 0 ? ready10.documentSide : null, (r22 & 512) != 0 ? ready10.uploadMetadata : null);
                        pair = kotlin.TuplesKt.to(copy16, null);
                    }
                } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success success6 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) state;
                    if (success6.getDocuments().size() < success6.getMaxFiles()) {
                        pair = kotlin.TuplesKt.to(getHighSpeedVideoSizes(success6, success6.getDocuments(), (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError) null), com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.ShowUploadMethodDialog.INSTANCE);
                    } else {
                        pair = kotlin.TuplesKt.to(getHighSpeedVideoSizes(success6, success6.getDocuments(), getHighSpeedVideoFpsRanges(success6.getMaxFiles(), true)), null);
                    }
                } else {
                    pair = kotlin.TuplesKt.to(state, null);
                }
            } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready11 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state;
                if (ready11.getCanAddMore()) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.LaunchSdkCapture launchSdkCapture = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.LaunchSdkCapture(ready11.getMaxFiles() - ready11.getDocuments().size());
                    copy19 = ready11.copy((r22 & 1) != 0 ? ready11.captureMode : null, (r22 & 2) != 0 ? ready11.documents : null, (r22 & 4) != 0 ? ready11.maxFiles : 0, (r22 & 8) != 0 ? ready11.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready11.minFileSizeKB : 0, (r22 & 32) != 0 ? ready11.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready11.error : null, (r22 & 128) != 0 ? ready11.documentType : null, (r22 & 256) != 0 ? ready11.documentSide : null, (r22 & 512) != 0 ? ready11.uploadMetadata : null);
                    pair = kotlin.TuplesKt.to(copy19, launchSdkCapture);
                } else {
                    copy18 = ready11.copy((r22 & 1) != 0 ? ready11.captureMode : null, (r22 & 2) != 0 ? ready11.documents : null, (r22 & 4) != 0 ? ready11.maxFiles : 0, (r22 & 8) != 0 ? ready11.maxFileSizeKB : 0, (r22 & 16) != 0 ? ready11.minFileSizeKB : 0, (r22 & 32) != 0 ? ready11.acceptedMimeTypes : null, (r22 & 64) != 0 ? ready11.error : getHighSpeedVideoFpsRanges(ready11.getMaxFiles(), true), (r22 & 128) != 0 ? ready11.documentType : null, (r22 & 256) != 0 ? ready11.documentSide : null, (r22 & 512) != 0 ? ready11.uploadMetadata : null);
                    pair = kotlin.TuplesKt.to(copy18, null);
                }
            } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) {
                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success success7 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) state;
                if (success7.getDocuments().size() < success7.getMaxFiles()) {
                    pair = kotlin.TuplesKt.to(getHighSpeedVideoSizes(success7, success7.getDocuments(), (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError) null), new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.LaunchSdkCapture(success7.getMaxFiles() - success7.getDocuments().size()));
                } else {
                    pair = kotlin.TuplesKt.to(getHighSpeedVideoSizes(success7, success7.getDocuments(), getHighSpeedVideoFpsRanges(success7.getMaxFiles(), true)), null);
                }
            } else {
                pair = kotlin.TuplesKt.to(state, null);
            }
        } else {
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.Initialize initialize = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.Initialize) event;
            if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Idle) {
                pair2 = null;
            } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) {
                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready12 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) state;
                pair2 = kotlin.TuplesKt.to(ready12.getDocumentType(), ready12.getDocumentSide());
            } else if (state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading) {
                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading uploading4 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading) state;
                pair2 = kotlin.TuplesKt.to(uploading4.getDocumentType(), uploading4.getDocumentSide());
            } else {
                if (!(state instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success success8 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) state;
                pair2 = kotlin.TuplesKt.to(success8.getDocumentType(), success8.getDocumentSide());
            }
            if (pair2 != null) {
                java.lang.String str = (java.lang.String) pair2.component1();
                java.lang.String str2 = (java.lang.String) pair2.component2();
                if (kotlin.jvm.internal.Intrinsics.areEqual(str, initialize.getDocumentType()) && kotlin.jvm.internal.Intrinsics.areEqual(str2, initialize.getDocumentSide())) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] handleInitialize: Same config, preserving documents", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.DOCUMENT_TYPE, initialize.getDocumentType())), null, 4, null);
                    pair = kotlin.TuplesKt.to(state, null);
                } else {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] handleInitialize: Config changed, re-initializing", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("previous_type", str), kotlin.TuplesKt.to("new_type", initialize.getDocumentType())), null, 4, null);
                    pair = kotlin.TuplesKt.to(getHighSpeedVideoFpsRangesFor(initialize), null);
                }
            } else {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] handleInitialize: Initializing to Ready state", null, null, 6, null);
                pair = kotlin.TuplesKt.to(getHighSpeedVideoFpsRangesFor(initialize), new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect.NotifyListener(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ListenerStatus.WIDGET_SHOWN, null));
            }
        }
        return new arrow.core.Either.Right(new com.paypal.oslo.core.mvi.Reducer.Output((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState) pair.component1(), (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect) pair.component2()));
    }

    private static com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError getHighSpeedVideoFpsRanges(int p0, boolean p1) {
        if (p0 == 1) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError(null, java.lang.Integer.valueOf(com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_file_count_exceed_one_error), p1, 1, null);
        }
        if (p0 == 2) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError(null, java.lang.Integer.valueOf(com.paypal.oslo.feature.verificationcapture.R.string.feature_verification_capture_file_count_exceed_two_error), p1, 1, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Please ensure that you upload only ");
        sb.append(p0);
        sb.append(" files.");
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError(sb.toString(), null, p1, 2, null);
    }

    private static com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError getHighSpeedVideoSizes(long p0, int p1, int p2) {
        if (p0 < p1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("File too small. Minimum size is ");
            sb.append(p1);
            sb.append(" KB");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError(sb.toString(), null, false, 2, null);
        }
        if (p0 <= p2) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("File too large. Maximum size is ");
        sb2.append(p2);
        sb2.append(" KB");
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError(sb2.toString(), null, false, 2, null);
    }

    private static com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready getHighSpeedVideoSizes(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success p0, java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> p1, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError p2) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready(p0.getCaptureMode(), p1, p0.getMaxFiles(), p0.getMaxFileSizeKB(), p0.getMinFileSizeKB(), p0.getAcceptedMimeTypes(), p2, p0.getDocumentType(), p0.getDocumentSide(), p0.getUploadMetadata());
    }

    private static com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.Initialize p0) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready(p0.getCaptureMode(), kotlin.collections.CollectionsKt.emptyList(), p0.getMaxFiles(), p0.getMaxFileSizeKB(), p0.getMinFileSizeKB(), p0.getAcceptedMimeTypes(), null, p0.getDocumentType(), p0.getDocumentSide(), p0.getUploadMetadata(), 64, null);
    }

    private static java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> getHighSpeedVideoFpsRanges(java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> p0, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadSuccess p1) {
        java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> list = p0;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview : list) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(documentPreview.getId(), p1.getDocumentId())) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] FOUND document to update", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("doc_id", documentPreview.getId())), null, 4, null);
                documentPreview = documentPreview.copy((r22 & 1) != 0 ? documentPreview.id : null, (r22 & 2) != 0 ? documentPreview.name : null, (r22 & 4) != 0 ? documentPreview.sizeKB : 0L, (r22 & 8) != 0 ? documentPreview.mimeType : null, (r22 & 16) != 0 ? documentPreview.imageData : null, (r22 & 32) != 0 ? documentPreview.fileId : p1.getFileId(), (r22 & 64) != 0 ? documentPreview.docId : p1.getDocId(), (r22 & 128) != 0 ? documentPreview.isUploading : false, (r22 & 256) != 0 ? documentPreview.uploadError : null);
            }
            arrayList.add(documentPreview);
        }
        return arrayList;
    }
}
