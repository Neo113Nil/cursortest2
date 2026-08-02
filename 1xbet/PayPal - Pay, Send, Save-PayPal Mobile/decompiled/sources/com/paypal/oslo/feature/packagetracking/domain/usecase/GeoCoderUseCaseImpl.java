package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0004H\u0096B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GeoCoderUseCaseImpl;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GeoCoderUseCase;", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/GeoCoderApi;", "geoCoderApi", "", "googleMapsApiKey", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/repository/GeoCoderApi;Ljava/lang/String;)V", "address", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/models/GeocoderModel;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/GeoCoderApi;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GeoCoderUseCaseImpl implements com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GeoCoderUseCaseImpl(com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi geoCoderApi, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(geoCoderApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = geoCoderApi;
        this.getHighSpeedVideoSizes = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v23, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, com.paypal.oslo.feature.packagetracking.domain.repository.models.GeocoderModel>> continuation) {
        com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl$invoke$1 geoCoderUseCaseImpl$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        java.io.IOException e;
        arrow.core.raise.DefaultRaise defaultRaise3;
        ?? r12;
        java.lang.String message;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl$invoke$1) {
            geoCoderUseCaseImpl$invoke$1 = (com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl$invoke$1) continuation;
            if ((geoCoderUseCaseImpl$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                geoCoderUseCaseImpl$invoke$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = geoCoderUseCaseImpl$invoke$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = geoCoderUseCaseImpl$invoke$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        defaultRaise2 = defaultRaise;
                        try {
                            com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi geoCoderApi = this.Camera2StreamConfigurationMap;
                            java.lang.String str2 = this.getHighSpeedVideoSizes;
                            geoCoderUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            geoCoderUseCaseImpl$invoke$1.getInputSizeshNQ4ISI = defaultRaise;
                            geoCoderUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor = defaultRaise2;
                            geoCoderUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                            geoCoderUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            geoCoderUseCaseImpl$invoke$1.getHighSpeedVideoSizes = 0;
                            geoCoderUseCaseImpl$invoke$1.Camera2StreamConfigurationMap = 0;
                            geoCoderUseCaseImpl$invoke$1.getOutputFormats = 1;
                            java.lang.Object geocoderData = geoCoderApi.getGeocoderData(str, str2, geoCoderUseCaseImpl$invoke$1);
                            if (geocoderData == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultRaise3 = defaultRaise;
                            obj = geocoderData;
                            r12 = defaultRaise2;
                        } catch (java.io.IOException e2) {
                            e = e2;
                            message = e.getMessage();
                            if (message == null) {
                            }
                            defaultRaise2.raise(new com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError(message, null, null, 6, null));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e3) {
                        e = e3;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = geoCoderUseCaseImpl$invoke$1.Camera2StreamConfigurationMap;
                    int i3 = geoCoderUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
                    int i4 = geoCoderUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = geoCoderUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                    r12 = (arrow.core.raise.Raise) geoCoderUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) geoCoderUseCaseImpl$invoke$1.getInputSizeshNQ4ISI;
                    try {
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            r12 = r12;
                        } catch (java.io.IOException e4) {
                            e = e4;
                            defaultRaise2 = r12;
                            message = e.getMessage();
                            if (message == null) {
                                message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
                            }
                            defaultRaise2.raise(new com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError(message, null, null, 6, null));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e5) {
                        e = e5;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise3;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                com.paypal.oslo.feature.packagetracking.domain.repository.models.GeocoderModel geocoderModel = (com.paypal.oslo.feature.packagetracking.domain.repository.models.GeocoderModel) obj;
                defaultRaise3.complete();
                return new arrow.core.Either.Right(geocoderModel);
            }
        }
        geoCoderUseCaseImpl$invoke$1 = new com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl$invoke$1(this, continuation);
        java.lang.Object obj2 = geoCoderUseCaseImpl$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = geoCoderUseCaseImpl$invoke$1.getOutputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.feature.packagetracking.domain.repository.models.GeocoderModel geocoderModel2 = (com.paypal.oslo.feature.packagetracking.domain.repository.models.GeocoderModel) obj2;
        defaultRaise3.complete();
        return new arrow.core.Either.Right(geocoderModel2);
    }
}
