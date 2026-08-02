package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel$uploadPhoto$1", f = "PhotoUploadViewModel.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"compressedUri"}, nl = {106}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class PhotoUploadViewModel$uploadPhoto$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.net.Uri getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        android.content.Context context;
        android.net.Uri uri;
        java.lang.Throwable th;
        com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase uploadPhotoUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Uploading.INSTANCE));
            context = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            android.net.Uri compressIfRequired = com.paypal.oslo.feature.userprofile.ui.utils.PhotoUploadUtilsKt.compressIfRequired(context, this.getHighSpeedVideoSizes);
            try {
                uploadPhotoUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = compressIfRequired;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                java.lang.Object invoke = uploadPhotoUseCase.invoke(compressIfRequired, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uri = compressIfRequired;
                obj = invoke;
            } catch (java.lang.Throwable th2) {
                uri = compressIfRequired;
                th = th2;
                com.paypal.oslo.feature.userprofile.ui.utils.PhotoUploadUtilsKt.deleteCompressedPhoto(this.getHighSpeedVideoSizes, uri);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uri = (android.net.Uri) this.getHighSpeedVideoFpsRangesFor;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                com.paypal.oslo.feature.userprofile.ui.utils.PhotoUploadUtilsKt.deleteCompressedPhoto(this.getHighSpeedVideoSizes, uri);
                throw th;
            }
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel = this.getHighSpeedVideoFpsRanges;
        android.net.Uri uri2 = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Photo uploaded successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("downloadUrl", ((com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadResult) ((arrow.core.Either.Right) either).getValue()).getPhotoUrl())), null, 4, null);
            mutableStateFlow2 = photoUploadViewModel.Camera2StreamConfigurationMap;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState.Success.INSTANCE));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel.access$handleUploadError(photoUploadViewModel, (com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError) ((arrow.core.Either.Left) either).getValue(), uri2);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.userprofile.ui.utils.PhotoUploadUtilsKt.deleteCompressedPhoto(this.getHighSpeedVideoSizes, uri);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel$uploadPhoto$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel$uploadPhoto$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhotoUploadViewModel$uploadPhoto$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, android.net.Uri uri, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel$uploadPhoto$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = photoUploadViewModel;
        this.getHighSpeedVideoSizes = uri;
    }
}
