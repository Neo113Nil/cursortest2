package com.ingo.sdk.kotlin.common.features.check_images;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0015\u0010\r\u001a\u00020\f8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0015\u0010\u0011\u001a\u00020\u000f8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/check_images/CheckImagesRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/check_images/CheckImagesRepository;", "<init>", "()V", "", "frontImageAsBase64", "backImageAsBase64", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/check_images/model/OcrResponse;", "processCheckImages", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/features/check_images/CheckImagesApi;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "Lcom/ingo/sdk/kotlin/common/features/location/LocationProvider;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CheckImagesRepositoryImpl implements com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepository {
    private final kotlin.Lazy getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepositoryImpl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepositoryImpl.$r8$lambda$luyw9YMv3moYXCiWbwYnhEDzpxc();
        }
    });

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepositoryImpl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepositoryImpl.m10769$r8$lambda$Ru1qgkxtWhjX1taDCTSef93JbY();
        }
    });

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r10 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object processCheckImages(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepositoryImpl$processCheckImages$1 checkImagesRepositoryImpl$processCheckImages$1;
        int i;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepositoryImpl$processCheckImages$1) {
            checkImagesRepositoryImpl$processCheckImages$1 = (com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepositoryImpl$processCheckImages$1) continuation;
            if ((checkImagesRepositoryImpl$processCheckImages$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                checkImagesRepositoryImpl$processCheckImages$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = checkImagesRepositoryImpl$processCheckImages$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = checkImagesRepositoryImpl$processCheckImages$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Requesting GeoLocation in CheckImagesRepositoryImpl", null, 2, null);
                    com.ingo.sdk.kotlin.common.features.location.LocationProvider locationProvider = (com.ingo.sdk.kotlin.common.features.location.LocationProvider) this.getHighSpeedVideoFpsRangesFor.getValue();
                    checkImagesRepositoryImpl$processCheckImages$1.Camera2StreamConfigurationMap = str;
                    checkImagesRepositoryImpl$processCheckImages$1.getHighSpeedVideoFpsRanges = str2;
                    checkImagesRepositoryImpl$processCheckImages$1.getHighSpeedVideoSizes = 1;
                    obj = locationProvider.getLocationData(checkImagesRepositoryImpl$processCheckImages$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    str2 = (java.lang.String) checkImagesRepositoryImpl$processCheckImages$1.getHighSpeedVideoFpsRanges;
                    str = (java.lang.String) checkImagesRepositoryImpl$processCheckImages$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.ingo.sdk.kotlin.common.features.location.LocationData locationData = (com.ingo.sdk.kotlin.common.features.location.LocationData) obj;
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Received GeoLocation in CheckImagesRepositoryImpl ".concat(java.lang.String.valueOf(locationData)), null, 2, null);
                com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi checkImagesApi = (com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi) this.getHighSpeedVideoFpsRanges.getValue();
                checkImagesRepositoryImpl$processCheckImages$1.Camera2StreamConfigurationMap = null;
                checkImagesRepositoryImpl$processCheckImages$1.getHighSpeedVideoFpsRanges = null;
                checkImagesRepositoryImpl$processCheckImages$1.getHighSpeedVideoSizes = 2;
                java.lang.Object processCheckImages = checkImagesApi.processCheckImages(str, str2, locationData, checkImagesRepositoryImpl$processCheckImages$1);
                return processCheckImages != coroutine_suspended ? coroutine_suspended : processCheckImages;
            }
        }
        checkImagesRepositoryImpl$processCheckImages$1 = new com.ingo.sdk.kotlin.common.features.check_images.CheckImagesRepositoryImpl$processCheckImages$1(this, continuation);
        java.lang.Object obj2 = checkImagesRepositoryImpl$processCheckImages$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkImagesRepositoryImpl$processCheckImages$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        com.ingo.sdk.kotlin.common.features.location.LocationData locationData2 = (com.ingo.sdk.kotlin.common.features.location.LocationData) obj2;
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Received GeoLocation in CheckImagesRepositoryImpl ".concat(java.lang.String.valueOf(locationData2)), null, 2, null);
        com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi checkImagesApi2 = (com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi) this.getHighSpeedVideoFpsRanges.getValue();
        checkImagesRepositoryImpl$processCheckImages$1.Camera2StreamConfigurationMap = null;
        checkImagesRepositoryImpl$processCheckImages$1.getHighSpeedVideoFpsRanges = null;
        checkImagesRepositoryImpl$processCheckImages$1.getHighSpeedVideoSizes = 2;
        java.lang.Object processCheckImages2 = checkImagesApi2.processCheckImages(str, str2, locationData2, checkImagesRepositoryImpl$processCheckImages$1);
        if (processCheckImages2 != coroutine_suspended2) {
        }
    }

    /* renamed from: $r8$lambda$Ru1qgkxtWhjX1taDC-TSef93JbY, reason: not valid java name */
    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.location.LocationProvider m10769$r8$lambda$Ru1qgkxtWhjX1taDCTSef93JbY() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.location.LocationProvider.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.location.LocationProvider) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.location.LocationProvider");
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi $r8$lambda$luyw9YMv3moYXCiWbwYnhEDzpxc() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.check_images.CheckImagesApi");
    }
}
