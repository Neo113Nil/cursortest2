package com.paypal.oslo.feature.verificationcapture.data.service;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0012\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0096@¢\u0006\u0004\b\u001a\u0010\u0011J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\nH\u0096@¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/service/VerificationCaptureServiceImpl;", "Lcom/paypal/oslo/feature/verificationcapture/api/VerificationCaptureService;", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;)V", "", "imageBytes", "Lcom/paypal/oslo/feature/verificationcapture/api/models/DocumentMetadata;", "metadata", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationCaptureError;", "", "uploadDocument", "([BLcom/paypal/oslo/feature/verificationcapture/api/models/DocumentMetadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/verificationcapture/api/models/CaptureSessionInfo;", "getSessionInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "documentId", "Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationResult;", "getVerificationStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reason", "", "removeDocument", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeSession", "completeSession", "imagePath", "", "cleanupTempFile", "(Ljava/lang/String;)Z", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationCaptureServiceImpl implements com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public VerificationCaptureServiceImpl(com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureRepository, "");
        this.getHighSpeedVideoFpsRanges = verificationCaptureRepository;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b2, code lost:
    
        if (r3.equals("DRIVERS_LICENSE") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
    
        r3 = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.DRIVERS_LICENSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bb, code lost:
    
        if (r3.equals(org.bouncycastle.asn1.ASN1Encoding.DL) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c4, code lost:
    
        if (r3.equals("DRIVER_LICENSE") != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
    
        if (r3.equals("ID_CARD") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00da, code lost:
    
        r3 = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.NATIONAL_ID_CARD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d8, code lost:
    
        if (r3.equals("NATIONAL_ID") != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object uploadDocument(byte[] bArr, com.paypal.oslo.feature.verificationcapture.api.models.DocumentMetadata documentMetadata, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$uploadDocument$1 verificationCaptureServiceImpl$uploadDocument$1;
        int i;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType;
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult captureResult;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$uploadDocument$1) {
            verificationCaptureServiceImpl$uploadDocument$1 = (com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$uploadDocument$1) continuation;
            if ((verificationCaptureServiceImpl$uploadDocument$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                verificationCaptureServiceImpl$uploadDocument$1.getOutputMinFrameDuration -= 2147483648;
                com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$uploadDocument$1 verificationCaptureServiceImpl$uploadDocument$12 = verificationCaptureServiceImpl$uploadDocument$1;
                java.lang.Object obj = verificationCaptureServiceImpl$uploadDocument$12.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = verificationCaptureServiceImpl$uploadDocument$12.getOutputMinFrameDuration;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (bArr.length == 0) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_INVALID_INPUT, "Image bytes are empty", false, null, 8, null));
                    }
                    java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                    createMapBuilder.put("party_id", documentMetadata.getPartyId());
                    createMapBuilder.put("labels", documentMetadata.getFlowName());
                    createMapBuilder.putAll(documentMetadata.getAdditionalMetadata());
                    java.util.Map<java.lang.String, java.lang.String> build = kotlin.collections.MapsKt.build(createMapBuilder);
                    java.lang.String upperCase = documentMetadata.getDocumentType().toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    switch (upperCase.hashCode()) {
                        case -2049137976:
                            break;
                        case -1895130188:
                            break;
                        case -1302291702:
                            break;
                        case 2184:
                            break;
                        case 84104461:
                            break;
                        case 1999404050:
                            if (upperCase.equals(com.daon.dmds.utils.face.FaceFinderImpl.PASSPORT_DOCUMENT_CLASS)) {
                                documentType = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.PASSPORT;
                                break;
                            }
                            documentType = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.DRIVERS_LICENSE;
                            break;
                        default:
                            documentType = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.DRIVERS_LICENSE;
                            break;
                    }
                    com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType2 = documentType;
                    java.lang.String upperCase2 = documentMetadata.getDocumentSide().toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                    com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide = (kotlin.jvm.internal.Intrinsics.areEqual(upperCase2, com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT) || !kotlin.jvm.internal.Intrinsics.areEqual(upperCase2, com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK)) ? com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.FRONT : com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.BACK;
                    com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository = this.getHighSpeedVideoFpsRanges;
                    verificationCaptureServiceImpl$uploadDocument$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bArr);
                    verificationCaptureServiceImpl$uploadDocument$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentMetadata);
                    verificationCaptureServiceImpl$uploadDocument$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(build);
                    verificationCaptureServiceImpl$uploadDocument$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentType2);
                    verificationCaptureServiceImpl$uploadDocument$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentSide);
                    verificationCaptureServiceImpl$uploadDocument$12.getOutputMinFrameDuration = 1;
                    obj = verificationCaptureRepository.uploadDocument(bArr, documentType2, documentSide, build, verificationCaptureServiceImpl$uploadDocument$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                captureResult = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult) obj;
                if (!(captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess)) {
                    return arrow.core.EitherKt.right(((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess) captureResult).getDocumentId());
                }
                if (captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) {
                    com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure failure = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) captureResult;
                    java.lang.String errorCode = failure.getErrorCode();
                    java.lang.String errorMessage = failure.getErrorMessage();
                    java.lang.String errorCode2 = failure.getErrorCode();
                    int hashCode = errorCode2.hashCode();
                    if (hashCode == -2139298426 ? !errorCode2.equals(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_SERVICE_UNAVAILABLE) : !(hashCode == -879828873 ? errorCode2.equals("NETWORK_ERROR") : hashCode == -595928767 && errorCode2.equals("TIMEOUT"))) {
                        z = false;
                    }
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError(errorCode, errorMessage, z, failure.getThrowable()));
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError("UPLOAD_FAILED", "Upload did not complete successfully", false, null, 12, null));
            }
        }
        verificationCaptureServiceImpl$uploadDocument$1 = new com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$uploadDocument$1(this, continuation);
        com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$uploadDocument$1 verificationCaptureServiceImpl$uploadDocument$122 = verificationCaptureServiceImpl$uploadDocument$1;
        java.lang.Object obj2 = verificationCaptureServiceImpl$uploadDocument$122.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = verificationCaptureServiceImpl$uploadDocument$122.getOutputMinFrameDuration;
        boolean z2 = true;
        if (i != 0) {
        }
        captureResult = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult) obj2;
        if (!(captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSessionInfo(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError, com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo>> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$getSessionInfo$1 verificationCaptureServiceImpl$getSessionInfo$1;
        int i;
        java.lang.Object mo20601getSessionInfoIoAF18A;
        java.lang.Throwable m23439exceptionOrNullimpl;
        java.lang.Integer intOrNull;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$getSessionInfo$1) {
            verificationCaptureServiceImpl$getSessionInfo$1 = (com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$getSessionInfo$1) continuation;
            if ((verificationCaptureServiceImpl$getSessionInfo$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                verificationCaptureServiceImpl$getSessionInfo$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = verificationCaptureServiceImpl$getSessionInfo$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = verificationCaptureServiceImpl$getSessionInfo$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository = this.getHighSpeedVideoFpsRanges;
                    verificationCaptureServiceImpl$getSessionInfo$1.Camera2StreamConfigurationMap = 1;
                    mo20601getSessionInfoIoAF18A = verificationCaptureRepository.mo20601getSessionInfoIoAF18A(verificationCaptureServiceImpl$getSessionInfo$1);
                    if (mo20601getSessionInfoIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    mo20601getSessionInfoIoAF18A = ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
                }
                m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(mo20601getSessionInfoIoAF18A);
                if (m23439exceptionOrNullimpl != null) {
                    java.util.Map map = (java.util.Map) mo20601getSessionInfoIoAF18A;
                    java.lang.String str = (java.lang.String) map.get("session_id");
                    if (str == null) {
                        str = "unknown";
                    }
                    java.lang.String str2 = str;
                    com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus sessionStatus = com.paypal.oslo.feature.verificationcapture.api.models.SessionStatus.ACTIVE;
                    java.lang.String str3 = (java.lang.String) map.get("documents_uploaded");
                    int intValue = (str3 == null || (intOrNull = kotlin.text.StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull.intValue();
                    java.lang.String str4 = (java.lang.String) map.get("liveness_completed");
                    return arrow.core.EitherKt.right(new com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo(str2, sessionStatus, intValue, str4 != null ? java.lang.Boolean.parseBoolean(str4) : false, map));
                }
                java.lang.String message = m23439exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Failed to get session info";
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError("UNKNOWN", message, false, m23439exceptionOrNullimpl, 4, null));
            }
        }
        verificationCaptureServiceImpl$getSessionInfo$1 = new com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$getSessionInfo$1(this, continuation);
        java.lang.Object obj2 = verificationCaptureServiceImpl$getSessionInfo$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = verificationCaptureServiceImpl$getSessionInfo$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(mo20601getSessionInfoIoAF18A);
        if (m23439exceptionOrNullimpl != null) {
        }
    }

    @Override // com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService
    public final java.lang.Object getVerificationStatus(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError, com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult>> continuation) {
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult(str, com.paypal.oslo.feature.verificationcapture.api.models.VerificationStatus.PENDING, 0.0f, 0L, (java.util.Map) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object removeDocument(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$removeDocument$1 verificationCaptureServiceImpl$removeDocument$1;
        int i;
        java.lang.Object mo20603removeDocumentgIAlus;
        java.lang.Throwable m23439exceptionOrNullimpl;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$removeDocument$1) {
            verificationCaptureServiceImpl$removeDocument$1 = (com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$removeDocument$1) continuation;
            if ((verificationCaptureServiceImpl$removeDocument$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                verificationCaptureServiceImpl$removeDocument$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = verificationCaptureServiceImpl$removeDocument$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = verificationCaptureServiceImpl$removeDocument$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository = this.getHighSpeedVideoFpsRanges;
                    verificationCaptureServiceImpl$removeDocument$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    verificationCaptureServiceImpl$removeDocument$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    verificationCaptureServiceImpl$removeDocument$1.getHighSpeedVideoFpsRanges = 1;
                    mo20603removeDocumentgIAlus = verificationCaptureRepository.mo20603removeDocumentgIAlus(str, verificationCaptureServiceImpl$removeDocument$1);
                    if (mo20603removeDocumentgIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    mo20603removeDocumentgIAlus = ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
                }
                m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(mo20603removeDocumentgIAlus);
                if (m23439exceptionOrNullimpl != null) {
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                java.lang.String message = m23439exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Failed to remove document";
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError("UNKNOWN", message, false, m23439exceptionOrNullimpl, 4, null));
            }
        }
        verificationCaptureServiceImpl$removeDocument$1 = new com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$removeDocument$1(this, continuation);
        java.lang.Object obj2 = verificationCaptureServiceImpl$removeDocument$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = verificationCaptureServiceImpl$removeDocument$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(mo20603removeDocumentgIAlus);
        if (m23439exceptionOrNullimpl != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initializeSession(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$initializeSession$1 verificationCaptureServiceImpl$initializeSession$1;
        int i;
        java.lang.Object mo20602initializeSessionIoAF18A;
        java.lang.Throwable m23439exceptionOrNullimpl;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$initializeSession$1) {
            verificationCaptureServiceImpl$initializeSession$1 = (com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$initializeSession$1) continuation;
            if ((verificationCaptureServiceImpl$initializeSession$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                verificationCaptureServiceImpl$initializeSession$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = verificationCaptureServiceImpl$initializeSession$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = verificationCaptureServiceImpl$initializeSession$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository = this.getHighSpeedVideoFpsRanges;
                    verificationCaptureServiceImpl$initializeSession$1.getHighSpeedVideoSizes = 1;
                    mo20602initializeSessionIoAF18A = verificationCaptureRepository.mo20602initializeSessionIoAF18A(verificationCaptureServiceImpl$initializeSession$1);
                    if (mo20602initializeSessionIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    mo20602initializeSessionIoAF18A = ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
                }
                m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(mo20602initializeSessionIoAF18A);
                if (m23439exceptionOrNullimpl != null) {
                    return arrow.core.EitherKt.right((java.lang.String) mo20602initializeSessionIoAF18A);
                }
                java.lang.String message = m23439exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Failed to initialize session";
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError("UNKNOWN", message, false, m23439exceptionOrNullimpl, 4, null));
            }
        }
        verificationCaptureServiceImpl$initializeSession$1 = new com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$initializeSession$1(this, continuation);
        java.lang.Object obj2 = verificationCaptureServiceImpl$initializeSession$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = verificationCaptureServiceImpl$initializeSession$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(mo20602initializeSessionIoAF18A);
        if (m23439exceptionOrNullimpl != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object completeSession(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$completeSession$1 verificationCaptureServiceImpl$completeSession$1;
        int i;
        java.lang.Object mo20600completeSessionIoAF18A;
        java.lang.Throwable m23439exceptionOrNullimpl;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$completeSession$1) {
            verificationCaptureServiceImpl$completeSession$1 = (com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$completeSession$1) continuation;
            if ((verificationCaptureServiceImpl$completeSession$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                verificationCaptureServiceImpl$completeSession$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = verificationCaptureServiceImpl$completeSession$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = verificationCaptureServiceImpl$completeSession$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository = this.getHighSpeedVideoFpsRanges;
                    verificationCaptureServiceImpl$completeSession$1.getHighSpeedVideoSizes = 1;
                    mo20600completeSessionIoAF18A = verificationCaptureRepository.mo20600completeSessionIoAF18A(verificationCaptureServiceImpl$completeSession$1);
                    if (mo20600completeSessionIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    mo20600completeSessionIoAF18A = ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
                }
                m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(mo20600completeSessionIoAF18A);
                if (m23439exceptionOrNullimpl != null) {
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                java.lang.String message = m23439exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Failed to complete session";
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError("UNKNOWN", message, false, m23439exceptionOrNullimpl, 4, null));
            }
        }
        verificationCaptureServiceImpl$completeSession$1 = new com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$completeSession$1(this, continuation);
        java.lang.Object obj2 = verificationCaptureServiceImpl$completeSession$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = verificationCaptureServiceImpl$completeSession$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(mo20600completeSessionIoAF18A);
        if (m23439exceptionOrNullimpl != null) {
        }
    }

    @Override // com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService
    public final boolean cleanupTempFile(java.lang.String imagePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePath, "");
        if (imagePath.length() == 0) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCaptureService] cleanupTempFile: Empty path provided", null, null, 6, null);
            return false;
        }
        try {
            java.io.File file = new java.io.File(imagePath);
            java.lang.String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "");
            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) absolutePath, (java.lang.CharSequence) "verification_capture_temp", false, 2, (java.lang.Object) null)) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCaptureService] cleanupTempFile: File not in verification temp dir", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", imagePath)), null, 4, null);
                return false;
            }
            if (!file.exists()) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCaptureService] cleanupTempFile: File already deleted or doesn't exist", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", imagePath)), null, 4, null);
                return false;
            }
            boolean delete = file.delete();
            if (delete) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCaptureService] cleanupTempFile: Successfully deleted temp file", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("file_name", file.getName())), null, 4, null);
                return delete;
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[VerificationCaptureService] cleanupTempFile: Failed to delete file", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", imagePath)), null, 4, null);
            return delete;
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.verificationcapture.LoggerKt.log.e("[VerificationCaptureService] cleanupTempFile exception", e);
            return false;
        }
    }
}
