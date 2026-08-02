package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0014\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u0019\u001a\u00020\n2\n\u0010\u0013\u001a\u00060\u001bj\u0002`\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%R&\u0010)\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020 0+8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00101\u001a\b\u0012\u0004\u0012\u00020(008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/viewmodel/ManualUploadViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroid/app/Application;", "application", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/reducer/ManualUploadReducer;", "reducer", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/UploadMultipleFilesUseCase;", "uploadMultipleFilesUseCase", "<init>", "(Landroid/app/Application;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/reducer/ManualUploadReducer;Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/UploadMultipleFilesUseCase;)V", "", "onCleared", "()V", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "event", "handleEvent", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;)V", "", "Landroid/net/Uri;", "p0", "getHighSpeedVideoSizes", "(Ljava/util/List;)Ljava/lang/Object;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Z", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/DocumentPreview;", "p1", "(Ljava/lang/Exception;Ljava/util/List;)V", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState;", "getCurrentState", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/reducer/ManualUploadReducer;", "Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/UploadMultipleFilesUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiEffect;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffects", "Lkotlinx/coroutines/flow/Flow;", "getUiEffects", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ManualUploadViewModel extends androidx.view.AndroidViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.reducer.ManualUploadReducer getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> uiEffects;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState> uiState;
    private static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel.Companion Companion = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public ManualUploadViewModel(android.app.Application application, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.reducer.ManualUploadReducer manualUploadReducer, com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase uploadMultipleFilesUseCase) {
        super(application);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manualUploadReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadMultipleFilesUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = manualUploadReducer;
        this.getHighResolutionOutputSizeshNQ4ISI = uploadMultipleFilesUseCase;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ManualUploadStore", com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Idle.INSTANCE, manualUploadReducer, null, androidx.view.ViewModelKt.getViewModelScope(this), 8, null);
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadViewModel] ViewModel created", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hashcode", java.lang.Integer.valueOf(hashCode()))), null, 4, null);
        this.uiState = mviStateStore.getUiState();
        this.uiEffects = mviStateStore.getUiEffect();
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/viewmodel/ManualUploadViewModel$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadViewModel] ViewModel destroyed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hashcode", java.lang.Integer.valueOf(hashCode()))), null, 4, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> getUiEffects() {
        return this.uiEffects;
    }

    public final void handleEvent(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FilesSelected) {
            this.getHighSpeedVideoFpsRanges.onEvent(event);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel$handleEvent$1(this, event, null), 3, null);
            return;
        }
        if ((event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FileProcessed) || (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PhotoCaptured) || (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.SdkCaptureCompleted)) {
            this.getHighSpeedVideoFpsRanges.onEvent(event);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel$handleEvent$2(this, null), 3, null);
        } else if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteConfirmed) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] handleDeleteConfirmed", null, null, 6, null);
            this.getHighSpeedVideoFpsRanges.onEvent(event);
        } else if (event instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DismissError) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadReducer] handleDismissError", null, null, 6, null);
            this.getHighSpeedVideoFpsRanges.onEvent(event);
        } else {
            this.getHighSpeedVideoFpsRanges.onEvent(event);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.util.List<? extends android.net.Uri> p0) {
        java.lang.Throwable th;
        java.lang.String obj;
        java.lang.String type;
        java.lang.String obj2;
        android.content.ContentResolver contentResolver = getApplication().getContentResolver();
        for (android.net.Uri uri : p0) {
            try {
                java.io.InputStream openInputStream = contentResolver.openInputStream(uri);
                if (openInputStream != null) {
                    java.io.InputStream inputStream = openInputStream;
                    try {
                        byte[] readBytes = kotlin.io.ByteStreamsKt.readBytes(inputStream);
                        android.database.Cursor query = contentResolver.query(uri, null, null, null, null);
                        try {
                            try {
                                if (query != null) {
                                    android.database.Cursor cursor = query;
                                    try {
                                        android.database.Cursor cursor2 = cursor;
                                        int columnIndex = cursor2.getColumnIndex("_display_name");
                                        if (columnIndex != -1 && cursor2.moveToFirst()) {
                                            obj2 = cursor2.getString(columnIndex);
                                        } else {
                                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                            sb.append("document_");
                                            sb.append(currentTimeMillis);
                                            sb.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
                                            obj2 = sb.toString();
                                        }
                                        kotlin.io.CloseableKt.closeFinally(cursor, null);
                                        if (obj2 != null) {
                                            obj = obj2;
                                            type = contentResolver.getType(uri);
                                            if (type == null) {
                                                type = "image/jpeg";
                                            }
                                            java.lang.String str = type;
                                            java.lang.String obj3 = java.util.UUID.randomUUID().toString();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
                                            handleEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FileProcessed(obj3, obj, readBytes, str, readBytes.length / okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
                                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                            kotlin.io.CloseableKt.closeFinally(inputStream, null);
                                        }
                                    } finally {
                                    }
                                }
                                kotlin.io.CloseableKt.closeFinally(inputStream, null);
                            } catch (java.io.IOException e) {
                                e = e;
                                com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[ManualUploadViewModel] Error processing file", e);
                            } catch (java.lang.SecurityException e2) {
                                e = e2;
                                com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[ManualUploadViewModel] Permission denied accessing file", e);
                            }
                            handleEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FileProcessed(obj3, obj, readBytes, str, readBytes.length / okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE));
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            th = th;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th3) {
                                kotlin.io.CloseableKt.closeFinally(inputStream, th);
                                throw th3;
                            }
                        }
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("document_");
                        sb2.append(currentTimeMillis2);
                        sb2.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
                        obj = sb2.toString();
                        type = contentResolver.getType(uri);
                        if (type == null) {
                        }
                        java.lang.String str2 = type;
                        java.lang.String obj32 = java.util.UUID.randomUUID().toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj32, "");
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        th = th;
                        throw th;
                    }
                }
            } catch (java.io.IOException e3) {
                e = e3;
            } catch (java.lang.SecurityException e4) {
                e = e4;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02f4 A[Catch: SecurityException -> 0x0059, IOException -> 0x005c, CancellationException -> 0x03fb, LOOP:0: B:15:0x02ee->B:17:0x02f4, LOOP_END, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x03fb, blocks: (B:14:0x02e6, B:15:0x02ee, B:17:0x02f4, B:21:0x0306, B:22:0x0328, B:24:0x032e, B:31:0x036f, B:34:0x03a2, B:36:0x03ae, B:39:0x03b8, B:41:0x039c, B:48:0x03d0, B:49:0x03d5, B:50:0x03d6, B:53:0x03e8), top: B:13:0x02e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0306 A[Catch: SecurityException -> 0x0059, IOException -> 0x005c, CancellationException -> 0x03fb, TRY_ENTER, TryCatch #3 {CancellationException -> 0x03fb, blocks: (B:14:0x02e6, B:15:0x02ee, B:17:0x02f4, B:21:0x0306, B:22:0x0328, B:24:0x032e, B:31:0x036f, B:34:0x03a2, B:36:0x03ae, B:39:0x03b8, B:41:0x039c, B:48:0x03d0, B:49:0x03d5, B:50:0x03d6, B:53:0x03e8), top: B:13:0x02e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel$uploadAllDocuments$1 manualUploadViewModel$uploadAllDocuments$1;
        int i;
        java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents;
        int i2;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide;
        java.lang.String str;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType;
        java.util.List list;
        java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> list2;
        java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents2;
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult captureResult;
        java.util.Iterator it;
        try {
            if (continuation instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel$uploadAllDocuments$1) {
                manualUploadViewModel$uploadAllDocuments$1 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel$uploadAllDocuments$1) continuation;
                if ((manualUploadViewModel$uploadAllDocuments$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    manualUploadViewModel$uploadAllDocuments$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = manualUploadViewModel$uploadAllDocuments$1.getInputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = manualUploadViewModel$uploadAllDocuments$1.getOutputFormats;
                    java.lang.String str2 = "unknown";
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadViewModel] uploadAllDocuments() called", null, null, 6, null);
                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState currentState = this.getHighSpeedVideoFpsRanges.getCurrentState();
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(currentState.getClass()).getSimpleName();
                        if (simpleName == null) {
                            simpleName = "unknown";
                        }
                        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.core.mvi.MviStateStore.ATTR_KEY_REDUCER_STATE_NAME, simpleName);
                        boolean z = currentState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready;
                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready = z ? (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) currentState : null;
                        pairArr[1] = kotlin.TuplesKt.to("document_count", kotlin.coroutines.jvm.internal.Boxing.boxInt((ready == null || (documents2 = ready.getDocuments()) == null) ? 0 : documents2.size()));
                        com.paypal.android.logger.Logger.d$default(logger, "[ManualUploadViewModel] Current state", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        if (z) {
                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) currentState;
                            if (!ready2.getDocuments().isEmpty()) {
                                documents = ready2.getDocuments();
                                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                                pairArr2[0] = kotlin.TuplesKt.to("document_count", kotlin.coroutines.jvm.internal.Boxing.boxInt(documents.size()));
                                java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> list3 = documents;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                                java.util.Iterator<T> it2 = list3.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) it2.next()).getFileId());
                                }
                                pairArr2[1] = kotlin.TuplesKt.to("file_ids", arrayList);
                                com.paypal.android.logger.Logger.d$default(logger2, "[ManualUploadViewModel] Documents to check", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                                if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                                    java.util.Iterator<T> it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        if (((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) it3.next()).getFileId() == null) {
                                            i2 = 1;
                                            break;
                                        }
                                    }
                                }
                                i2 = 0;
                                if (i2 == 0) {
                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadViewModel] All documents already uploaded, skipping batch upload", null, null, 6, null);
                                    return kotlin.Unit.INSTANCE;
                                }
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadViewModel] Starting batch upload", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("file_count", kotlin.coroutines.jvm.internal.Boxing.boxInt(documents.size()))), null, 4, null);
                                com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> mviStateStore = this.getHighSpeedVideoFpsRanges;
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                                java.util.Iterator<T> it4 = list3.iterator();
                                while (it4.hasNext()) {
                                    arrayList2.add(((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) it4.next()).getId());
                                }
                                mviStateStore.onEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.StartUpload(arrayList2));
                                try {
                                    try {
                                        try {
                                            documentSide = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.valueOf(((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) currentState).getDocumentSide());
                                        } catch (java.util.concurrent.CancellationException e) {
                                            e = e;
                                            str = "";
                                            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[ManualUploadViewModel] Batch upload cancelled", e);
                                            com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> mviStateStore2 = this.getHighSpeedVideoFpsRanges;
                                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) documents);
                                            if (documentPreview == null) {
                                            }
                                            mviStateStore2.onEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError(r8 != null ? str : r8, "Please try again later.", true));
                                            throw e;
                                        }
                                    } catch (java.lang.IllegalArgumentException e2) {
                                        com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                                        kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
                                        pairArr3[0] = kotlin.TuplesKt.to("provided_side", ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) currentState).getDocumentSide());
                                        java.lang.String message = e2.getMessage();
                                        if (message == null) {
                                            message = "unknown";
                                        }
                                        pairArr3[1] = kotlin.TuplesKt.to("error", message);
                                        com.paypal.android.logger.Logger.w$default(logger3, "[ManualUploadViewModel] Invalid documentSide, using FRONT", kotlin.collections.MapsKt.mapOf(pairArr3), null, 4, null);
                                        documentSide = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.FRONT;
                                    }
                                    com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide2 = documentSide;
                                    java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> list4 = documents;
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                                    java.util.Iterator it5 = list4.iterator();
                                    while (it5.hasNext()) {
                                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) it5.next();
                                        java.util.Iterator it6 = it5;
                                        java.io.File createTempFile = java.io.File.createTempFile("upload_", com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX, getApplication().getCacheDir());
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(createTempFile);
                                        byte[] imageData = documentPreview2.getImageData();
                                        if (imageData == null) {
                                            imageData = new byte[0];
                                        }
                                        kotlin.io.FilesKt.writeBytes(createTempFile, imageData);
                                        arrayList3.add(new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload(createTempFile, documentSide2));
                                        it5 = it6;
                                    }
                                    java.util.ArrayList arrayList4 = arrayList3;
                                    java.util.Map<java.lang.String, java.lang.String> uploadMetadata = ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) currentState).getUploadMetadata();
                                    try {
                                        documentType = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.valueOf(((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) currentState).getDocumentType());
                                        str = "";
                                    } catch (java.lang.IllegalArgumentException e3) {
                                        com.paypal.android.logger.Logger logger4 = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                                        kotlin.Pair[] pairArr4 = new kotlin.Pair[2];
                                        str = "";
                                        try {
                                            pairArr4[0] = kotlin.TuplesKt.to("provided_type", ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) currentState).getDocumentType());
                                            java.lang.String message2 = e3.getMessage();
                                            if (message2 == null) {
                                                message2 = "unknown";
                                            }
                                            pairArr4[1] = kotlin.TuplesKt.to("error", message2);
                                            com.paypal.android.logger.Logger.w$default(logger4, "[ManualUploadViewModel] Invalid documentType, using UNKNOWN", kotlin.collections.MapsKt.mapOf(pairArr4), null, 4, null);
                                            documentType = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.UNKNOWN;
                                        } catch (java.util.concurrent.CancellationException e4) {
                                            e = e4;
                                            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[ManualUploadViewModel] Batch upload cancelled", e);
                                            com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> mviStateStore22 = this.getHighSpeedVideoFpsRanges;
                                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview3 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) documents);
                                            java.lang.String id = documentPreview3 == null ? documentPreview3.getId() : null;
                                            mviStateStore22.onEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError(id != null ? str : id, "Please try again later.", true));
                                            throw e;
                                        }
                                    }
                                    com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase uploadMultipleFilesUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                                    manualUploadViewModel$uploadAllDocuments$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currentState);
                                    manualUploadViewModel$uploadAllDocuments$1.getHighSpeedVideoFpsRangesFor = documents;
                                    manualUploadViewModel$uploadAllDocuments$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentSide2);
                                    manualUploadViewModel$uploadAllDocuments$1.getHighSpeedVideoFpsRanges = arrayList4;
                                    manualUploadViewModel$uploadAllDocuments$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uploadMetadata);
                                    manualUploadViewModel$uploadAllDocuments$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentType);
                                    manualUploadViewModel$uploadAllDocuments$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                    manualUploadViewModel$uploadAllDocuments$1.getOutputFormats = 1;
                                    obj = uploadMultipleFilesUseCase.invoke(arrayList4, documentType, uploadMetadata, manualUploadViewModel$uploadAllDocuments$1);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    list = arrayList4;
                                    list2 = documents;
                                } catch (java.io.IOException e5) {
                                    e = e5;
                                    com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[ManualUploadViewModel] Batch upload I/O exception", e);
                                    getHighSpeedVideoFpsRangesFor(e, documents);
                                    return kotlin.Unit.INSTANCE;
                                } catch (java.lang.SecurityException e6) {
                                    e = e6;
                                    com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[ManualUploadViewModel] Batch upload security exception", e);
                                    getHighSpeedVideoFpsRangesFor(e, documents);
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadViewModel] Early return: state not Ready or no documents", null, null, 6, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = manualUploadViewModel$uploadAllDocuments$1.getHighResolutionOutputSizeshNQ4ISI;
                    list = (java.util.List) manualUploadViewModel$uploadAllDocuments$1.getHighSpeedVideoFpsRanges;
                    list2 = (java.util.List) manualUploadViewModel$uploadAllDocuments$1.getHighSpeedVideoFpsRangesFor;
                    try {
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            str = "";
                        } catch (java.util.concurrent.CancellationException e7) {
                            e = e7;
                            str = "";
                            documents = list2;
                            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[ManualUploadViewModel] Batch upload cancelled", e);
                            com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> mviStateStore222 = this.getHighSpeedVideoFpsRanges;
                            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview32 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) documents);
                            if (documentPreview32 == null) {
                            }
                            mviStateStore222.onEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError(id != null ? str : id, "Please try again later.", true));
                            throw e;
                        }
                    } catch (java.io.IOException e8) {
                        e = e8;
                        documents = list2;
                        com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[ManualUploadViewModel] Batch upload I/O exception", e);
                        getHighSpeedVideoFpsRangesFor(e, documents);
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.SecurityException e9) {
                        e = e9;
                        documents = list2;
                        com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[ManualUploadViewModel] Batch upload security exception", e);
                        getHighSpeedVideoFpsRangesFor(e, documents);
                        return kotlin.Unit.INSTANCE;
                    }
                    captureResult = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult) obj;
                    it = list.iterator();
                    while (it.hasNext()) {
                        ((com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload) it.next()).getFile().delete();
                    }
                    if (!(captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess)) {
                        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadViewModel] Batch upload succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("doc_id", ((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess) captureResult).getDocumentId())), null, 4, null);
                        for (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview4 : list2) {
                            com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> mviStateStore3 = this.getHighSpeedVideoFpsRanges;
                            java.lang.String id2 = documentPreview4.getId();
                            java.lang.String documentId = ((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess) captureResult).getDocumentId();
                            java.lang.String id3 = documentPreview4.getId();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(documentId);
                            sb.append("_");
                            sb.append(id3);
                            mviStateStore3.onEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadSuccess(id2, sb.toString(), ((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess) captureResult).getDocumentId()));
                        }
                    } else if (captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualUploadViewModel] Batch upload failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", ((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) captureResult).getErrorMessage())), null, null, 12, null);
                        java.lang.String errorMessage = getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) captureResult).getErrorMessage()) ? "Please try again later." : ((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) captureResult).getErrorMessage();
                        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> mviStateStore4 = this.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview5 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list2);
                        java.lang.String id4 = documentPreview5 != null ? documentPreview5.getId() : null;
                        if (id4 == null) {
                            id4 = str;
                        }
                        mviStateStore4.onEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError(id4, errorMessage, true));
                    } else {
                        if (!(captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success) && !(captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Cancelled) && !(captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.android.logger.Logger logger5 = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                        java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(captureResult.getClass()).getSimpleName();
                        if (simpleName2 != null) {
                            str2 = simpleName2;
                        }
                        com.paypal.android.logger.Logger.w$default(logger5, "[ManualUploadViewModel] Unexpected result type", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result_type", str2)), null, 4, null);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            captureResult = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult) obj;
            it = list.iterator();
            while (it.hasNext()) {
            }
            if (!(captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess)) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.util.concurrent.CancellationException e10) {
            e = e10;
            documents = list2;
            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[ManualUploadViewModel] Batch upload cancelled", e);
            com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> mviStateStore2222 = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview322 = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) documents);
            if (documentPreview322 == null) {
            }
            mviStateStore2222.onEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError(id != null ? str : id, "Please try again later.", true));
            throw e;
        }
        manualUploadViewModel$uploadAllDocuments$1 = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel$uploadAllDocuments$1(this, continuation);
        java.lang.Object obj2 = manualUploadViewModel$uploadAllDocuments$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manualUploadViewModel$uploadAllDocuments$1.getOutputFormats;
        java.lang.String str22 = "unknown";
        if (i != 0) {
        }
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        if (p0 == null) {
            return false;
        }
        java.lang.String lowerCase = p0.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String str = lowerCase;
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "auth", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "login", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "session", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_UNAUTHORIZED, false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "401", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "403", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, false, 2, (java.lang.Object) null);
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.Exception p0, java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> p1) {
        java.lang.String concat;
        if (getHighSpeedVideoFpsRangesFor(p0.getMessage())) {
            concat = "Please try again later.";
        } else {
            concat = "Upload failed: ".concat(java.lang.String.valueOf(p0.getMessage()));
        }
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiEffect> mviStateStore = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview documentPreview = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) p1);
        java.lang.String id = documentPreview != null ? documentPreview.getId() : null;
        if (id == null) {
            id = "";
        }
        mviStateStore.onEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError(id, concat, true));
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState getCurrentState() {
        return this.getHighSpeedVideoFpsRanges.getCurrentState();
    }
}
