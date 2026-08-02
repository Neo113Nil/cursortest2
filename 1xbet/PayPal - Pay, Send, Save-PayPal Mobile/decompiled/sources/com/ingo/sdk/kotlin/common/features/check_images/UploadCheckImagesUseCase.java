package com.ingo.sdk.kotlin.common.features.check_images;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0015\u0010\u000f\u001a\u00020\f8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/check_images/UploadCheckImagesUseCase;", "Lcom/ingo/sdk/kotlin/common/core/interactor/SdkUseCase;", "Lcom/ingo/sdk/kotlin/common/features/check_images/model/OcrResponse;", "Lkotlin/Pair;", "", "<init>", "()V", "params", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "run", "(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/features/check_images/CheckImagesRepository;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UploadCheckImagesUseCase extends com.ingo.sdk.kotlin.common.core.interactor.SdkUseCase<com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    public UploadCheckImagesUseCase() {
        super(0L, 1, null);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase.m10770$r8$lambda$kqhR_8VPuTpaBdTxOpnTAzPw();
            }
        });
    }

    @Override // com.ingo.sdk.kotlin.common.core.interactor.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object run(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return run((kotlin.Pair<java.lang.String, java.lang.String>) obj, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object run(kotlin.Pair<java.lang.String, java.lang.String> pair, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase$run$1 uploadCheckImagesUseCase$run$1;
        int i;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase$run$1) {
            uploadCheckImagesUseCase$run$1 = (com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase$run$1) continuation;
            if ((uploadCheckImagesUseCase$run$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                uploadCheckImagesUseCase$run$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = uploadCheckImagesUseCase$run$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = uploadCheckImagesUseCase$run$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Running UploadCheckImagesUseCase", null, 2, null);
                    com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepository checkImagesRepository = (com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepository) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
                    java.lang.String first = pair.getFirst();
                    java.lang.String second = pair.getSecond();
                    uploadCheckImagesUseCase$run$1.Camera2StreamConfigurationMap = 1;
                    obj = checkImagesRepository.processCheckImages(first, second, uploadCheckImagesUseCase$run$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.ingo.sdk.kotlin.common.core.functional.Either either = (com.ingo.sdk.kotlin.common.core.functional.Either) obj;
                either.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase.$r8$lambda$PJVBDM3MbmXmT8TynM21rDvKCys((com.ingo.sdk.kotlin.common.core.exception.Failure) obj2);
                    }
                }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase.$r8$lambda$gCguto7tLWWraBZTWGtbUQJaIv0((com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse) obj2);
                    }
                });
                return either;
            }
        }
        uploadCheckImagesUseCase$run$1 = new com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase$run$1(this, continuation);
        java.lang.Object obj2 = uploadCheckImagesUseCase$run$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = uploadCheckImagesUseCase$run$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.ingo.sdk.kotlin.common.core.functional.Either either2 = (com.ingo.sdk.kotlin.common.core.functional.Either) obj2;
        either2.foldNothing(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase.$r8$lambda$PJVBDM3MbmXmT8TynM21rDvKCys((com.ingo.sdk.kotlin.common.core.exception.Failure) obj22);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.ingo.sdk.kotlin.common.features.check_images.UploadCheckImagesUseCase.$r8$lambda$gCguto7tLWWraBZTWGtbUQJaIv0((com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse) obj22);
            }
        });
        return either2;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PJVBDM3MbmXmT8TynM21rDvKCys(com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), failure.getGetHighSpeedVideoFpsRangesFor(), null, failure instanceof com.ingo.sdk.kotlin.common.core.exception.ThrowableFailure ? ((com.ingo.sdk.kotlin.common.core.exception.ThrowableFailure) failure).getThrowable() : null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gCguto7tLWWraBZTWGtbUQJaIv0(com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse ocrResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ocrResponse, "");
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
        }
        ((com.ingo.sdk.kotlin.ux.IngoUxState) obj).getSessionMap().put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse.class), ocrResponse);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kq-hR_-8VPuTpaBdTxOpn-TAzPw, reason: not valid java name */
    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepository m10770$r8$lambda$kqhR_8VPuTpaBdTxOpnTAzPw() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepository.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepository) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepository");
    }
}
