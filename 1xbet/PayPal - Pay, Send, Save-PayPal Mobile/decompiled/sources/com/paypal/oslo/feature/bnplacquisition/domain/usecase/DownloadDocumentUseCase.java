package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JH\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/DownloadDocumentUseCase;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/DocumentRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/DocumentRepository;)V", "", "staticUrl", "relativePath", "fileName", "creditAccountId", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/document/DocumentError;", "Landroid/net/Uri;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/DocumentRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DownloadDocumentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.repository.DocumentRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DownloadDocumentUseCase(com.paypal.oslo.feature.bnplacquisition.domain.repository.DocumentRepository documentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentRepository, "");
        this.getHighSpeedVideoFpsRanges = documentRepository;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v9, types: [arrow.core.raise.DefaultRaise] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError, ? extends android.net.Uri>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase$invoke$1 downloadDocumentUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.Raise raise2;
        android.net.Uri uri;
        try {
            if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase$invoke$1) {
                downloadDocumentUseCase$invoke$1 = (com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase$invoke$1) continuation;
                if ((downloadDocumentUseCase$invoke$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    downloadDocumentUseCase$invoke$1.getOutputStallDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = downloadDocumentUseCase$invoke$1.getOutputSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = downloadDocumentUseCase$invoke$1.getOutputStallDurationlomOqCM;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise;
                            java.lang.String str5 = str;
                            if (str5 != null && str5.length() != 0) {
                                com.paypal.oslo.feature.bnplacquisition.domain.repository.DocumentRepository documentRepository = this.getHighSpeedVideoFpsRanges;
                                com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest documentDownloadRequest = new com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest(str, str3, str4, creditProductIdentifier);
                                downloadDocumentUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                downloadDocumentUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                downloadDocumentUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                downloadDocumentUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                                downloadDocumentUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                                downloadDocumentUseCase$invoke$1.getOutputFormats = defaultRaise;
                                downloadDocumentUseCase$invoke$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise4);
                                downloadDocumentUseCase$invoke$1.getOutputStallDuration = defaultRaise4;
                                downloadDocumentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                                downloadDocumentUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                downloadDocumentUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                                downloadDocumentUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                                downloadDocumentUseCase$invoke$1.getOutputStallDurationlomOqCM = 1;
                                java.lang.Object staticDocument = documentRepository.getStaticDocument(documentDownloadRequest, downloadDocumentUseCase$invoke$1);
                                if (staticDocument != coroutine_suspended) {
                                    defaultRaise3 = defaultRaise;
                                    obj = staticDocument;
                                    raise2 = defaultRaise4;
                                    uri = (android.net.Uri) raise2.bind((arrow.core.Either) obj);
                                    str2 = defaultRaise3;
                                }
                                return coroutine_suspended;
                            }
                            java.lang.CharSequence charSequence = (java.lang.CharSequence) str2;
                            if (charSequence != null && charSequence.length() != 0) {
                                com.paypal.oslo.feature.bnplacquisition.domain.repository.DocumentRepository documentRepository2 = this.getHighSpeedVideoFpsRanges;
                                com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest documentDownloadRequest2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest(str2, str3, str4, creditProductIdentifier);
                                downloadDocumentUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                downloadDocumentUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                                downloadDocumentUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                                downloadDocumentUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                                downloadDocumentUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                                downloadDocumentUseCase$invoke$1.getOutputFormats = defaultRaise;
                                downloadDocumentUseCase$invoke$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise4);
                                downloadDocumentUseCase$invoke$1.getOutputStallDuration = defaultRaise4;
                                downloadDocumentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                                downloadDocumentUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                downloadDocumentUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                                downloadDocumentUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                                downloadDocumentUseCase$invoke$1.getOutputStallDurationlomOqCM = 2;
                                java.lang.Object dynamicDocument = documentRepository2.getDynamicDocument(documentDownloadRequest2, downloadDocumentUseCase$invoke$1);
                                if (dynamicDocument != coroutine_suspended) {
                                    defaultRaise2 = defaultRaise;
                                    obj = dynamicDocument;
                                    raise = defaultRaise4;
                                    uri = (android.net.Uri) raise.bind((arrow.core.Either) obj);
                                    str2 = defaultRaise2;
                                }
                                return coroutine_suspended;
                            }
                            defaultRaise4.raise(new com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError.ValidationFailed("No valid URL provided"));
                            throw new kotlin.KotlinNothingValueException();
                        } catch (arrow.core.raise.RaiseCancellationException e) {
                            e = e;
                            defaultRaise.complete();
                            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            defaultRaise.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                        }
                    }
                    if (i == 1) {
                        int i2 = downloadDocumentUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i3 = downloadDocumentUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i4 = downloadDocumentUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i5 = downloadDocumentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        raise2 = (arrow.core.raise.Raise) downloadDocumentUseCase$invoke$1.getOutputStallDuration;
                        arrow.core.raise.DefaultRaise defaultRaise5 = (arrow.core.raise.DefaultRaise) downloadDocumentUseCase$invoke$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise3 = defaultRaise5;
                        uri = (android.net.Uri) raise2.bind((arrow.core.Either) obj);
                        str2 = defaultRaise3;
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i6 = downloadDocumentUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i7 = downloadDocumentUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i8 = downloadDocumentUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i9 = downloadDocumentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        raise = (arrow.core.raise.Raise) downloadDocumentUseCase$invoke$1.getOutputStallDuration;
                        arrow.core.raise.DefaultRaise defaultRaise6 = (arrow.core.raise.DefaultRaise) downloadDocumentUseCase$invoke$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise2 = defaultRaise6;
                        uri = (android.net.Uri) raise.bind((arrow.core.Either) obj);
                        str2 = defaultRaise2;
                    }
                    str2.complete();
                    return new arrow.core.Either.Right(uri);
                }
            }
            if (i != 0) {
            }
            str2.complete();
            return new arrow.core.Either.Right(uri);
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
            defaultRaise = str2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            defaultRaise = str2;
        }
        downloadDocumentUseCase$invoke$1 = new com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = downloadDocumentUseCase$invoke$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadDocumentUseCase$invoke$1.getOutputStallDurationlomOqCM;
    }
}
