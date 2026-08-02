package com.paypal.oslo.feature.verificationcapture.data.repository;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\u001f\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010!\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b$\u0010%J\"\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\"H\u0096@¢\u0006\u0004\b'\u0010(J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\"H\u0096@¢\u0006\u0004\b*\u0010(J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0096@¢\u0006\u0004\b,\u0010(R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00101"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/repository/VerificationCaptureRepositoryImpl;", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;", "Lcom/paypal/oslo/feature/verificationcapture/network/DocumentUploadApi;", "documentUploadApi", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/network/DocumentUploadApi;Lkotlinx/serialization/json/Json;)V", "", "imageBytes", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "", "", "metadata", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "uploadDocument", "([BLcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "p0", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Failure;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Failure;", "Ljava/io/File;", "Camera2StreamConfigurationMap", "(Ljava/io/File;)Ljava/lang/String;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentFileUpload;", "files", "uploadMultipleFiles", "(Ljava/util/List;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "documentId", "Lkotlin/Result;", "", "removeDocument-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeDocument", "getSessionInfo-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionInfo", "initializeSession-IoAF18A", "initializeSession", "completeSession-IoAF18A", "completeSession", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/verificationcapture/network/DocumentUploadApi;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/json/Json;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationCaptureRepositoryImpl implements com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository {
    private final kotlinx.serialization.json.Json Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public VerificationCaptureRepositoryImpl(com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi documentUploadApi, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentUploadApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.getHighSpeedVideoFpsRanges = documentUploadApi;
        this.Camera2StreamConfigurationMap = json;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/repository/VerificationCaptureRepositoryImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0230 A[Catch: IllegalStateException -> 0x0265, IOException -> 0x027e, TryCatch #2 {IOException -> 0x027e, IllegalStateException -> 0x0265, blocks: (B:11:0x0060, B:12:0x022a, B:14:0x0230, B:17:0x024c, B:19:0x0250, B:21:0x025f, B:22:0x0264, B:33:0x009c, B:36:0x00b7, B:38:0x00e6, B:40:0x0107, B:41:0x012a, B:43:0x0130, B:45:0x0144, B:47:0x014a, B:53:0x015a, B:56:0x0101), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x024c A[Catch: IllegalStateException -> 0x0265, IOException -> 0x027e, TryCatch #2 {IOException -> 0x027e, IllegalStateException -> 0x0265, blocks: (B:11:0x0060, B:12:0x022a, B:14:0x0230, B:17:0x024c, B:19:0x0250, B:21:0x025f, B:22:0x0264, B:33:0x009c, B:36:0x00b7, B:38:0x00e6, B:40:0x0107, B:41:0x012a, B:43:0x0130, B:45:0x0144, B:47:0x014a, B:53:0x015a, B:56:0x0101), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object uploadDocument(byte[] bArr, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl$uploadDocument$1 verificationCaptureRepositoryImpl$uploadDocument$1;
        int i;
        java.util.List listOf;
        arrow.core.Either either;
        try {
            if (continuation instanceof com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl$uploadDocument$1) {
                verificationCaptureRepositoryImpl$uploadDocument$1 = (com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl$uploadDocument$1) continuation;
                if ((verificationCaptureRepositoryImpl$uploadDocument$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    verificationCaptureRepositoryImpl$uploadDocument$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = verificationCaptureRepositoryImpl$uploadDocument$1.getOutputSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = verificationCaptureRepositoryImpl$uploadDocument$1.getOutputMinFrameDurationlomOqCM;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (bArr.length == 0) {
                            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("UPLOAD_FAILED", "Image bytes are empty", null, 4, null);
                        }
                        java.lang.String str = map.get("party_id");
                        if (str == null) {
                            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("UPLOAD_FAILED", "Missing required party_id in metadata", null, 4, null);
                        }
                        java.lang.String obj2 = java.util.UUID.randomUUID().toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                        java.lang.String str2 = map.get("entity_type");
                        if (str2 == null) {
                            str2 = "PAYER";
                        }
                        com.paypal.oslo.feature.verificationcapture.data.dto.OwnerDto ownerDto = new com.paypal.oslo.feature.verificationcapture.data.dto.OwnerDto(str2, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.verificationcapture.data.dto.EntityReferenceDto("PERSON_PARTY", str, "SINGLE")));
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("captured_");
                        sb.append(currentTimeMillis);
                        sb.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
                        java.lang.String obj3 = sb.toString();
                        java.lang.String str3 = map.get("labels");
                        if (str3 == null || (listOf = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str3, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null) {
                            listOf = kotlin.collections.CollectionsKt.listOf("IDENTITY_VERIFICATION");
                        }
                        java.lang.String apiString = com.paypal.oslo.feature.verificationcapture.data.mapper.DocumentTypeMapper.INSTANCE.toApiString(documentType);
                        java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.verificationcapture.data.mapper.DocumentTypeMapper.INSTANCE.toApiString(documentSide));
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                            java.lang.String key = entry.getKey();
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(key, "party_id") && !kotlin.jvm.internal.Intrinsics.areEqual(key, "labels")) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        com.paypal.oslo.feature.verificationcapture.data.dto.UploadDocumentRequest uploadDocumentRequest = new com.paypal.oslo.feature.verificationcapture.data.dto.UploadDocumentRequest(ownerDto, new com.paypal.oslo.feature.verificationcapture.data.dto.DocumentRequestDto(listOf, apiString, "image/jpeg", 1, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.verificationcapture.data.dto.FileMetadataDto(obj2, obj3, "image/jpeg", listOf2, linkedHashMap))));
                        kotlinx.serialization.json.Json json = this.Camera2StreamConfigurationMap;
                        json.getSerializersModule();
                        java.lang.String encodeToString = json.encodeToString(com.paypal.oslo.feature.verificationcapture.data.dto.UploadDocumentRequest.INSTANCE.serializer(), uploadDocumentRequest);
                        okhttp3.RequestBody create = okhttp3.RequestBody.INSTANCE.create(encodeToString, okhttp3.MediaType.INSTANCE.parse("application/json"));
                        okhttp3.MultipartBody.Part createFormData = okhttp3.MultipartBody.Part.INSTANCE.createFormData(obj2, obj3, okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, bArr, okhttp3.MediaType.INSTANCE.parse("image/jpeg"), 0, 0, 6, (java.lang.Object) null));
                        com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi documentUploadApi = this.getHighSpeedVideoFpsRanges;
                        java.util.List<okhttp3.MultipartBody.Part> listOf3 = kotlin.collections.CollectionsKt.listOf(createFormData);
                        verificationCaptureRepositoryImpl$uploadDocument$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bArr);
                        verificationCaptureRepositoryImpl$uploadDocument$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentType);
                        verificationCaptureRepositoryImpl$uploadDocument$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentSide);
                        verificationCaptureRepositoryImpl$uploadDocument$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
                        verificationCaptureRepositoryImpl$uploadDocument$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        verificationCaptureRepositoryImpl$uploadDocument$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                        verificationCaptureRepositoryImpl$uploadDocument$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ownerDto);
                        verificationCaptureRepositoryImpl$uploadDocument$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj3);
                        verificationCaptureRepositoryImpl$uploadDocument$1.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uploadDocumentRequest);
                        verificationCaptureRepositoryImpl$uploadDocument$1.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encodeToString);
                        verificationCaptureRepositoryImpl$uploadDocument$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(create);
                        verificationCaptureRepositoryImpl$uploadDocument$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createFormData);
                        verificationCaptureRepositoryImpl$uploadDocument$1.getOutputMinFrameDurationlomOqCM = 1;
                        obj = documentUploadApi.uploadDocument(create, listOf3, verificationCaptureRepositoryImpl$uploadDocument$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    either = (arrow.core.Either) obj;
                    if (!(either instanceof arrow.core.Either.Right)) {
                        com.paypal.oslo.feature.verificationcapture.data.dto.UploadDocumentResponse uploadDocumentResponse = (com.paypal.oslo.feature.verificationcapture.data.dto.UploadDocumentResponse) ((arrow.core.Either.Right) either).getValue();
                        return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess(uploadDocumentResponse.getDocumentId(), uploadDocumentResponse.getStatus(), null, 4, null);
                    }
                    if (either instanceof arrow.core.Either.Left) {
                        return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            if (i != 0) {
            }
            either = (arrow.core.Either) obj;
            if (!(either instanceof arrow.core.Either.Right)) {
            }
        } catch (java.io.IOException e) {
            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("NETWORK_ERROR", "Upload failed: ".concat(java.lang.String.valueOf(e.getMessage())), e);
        } catch (java.lang.IllegalStateException e2) {
            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("UNKNOWN", "Upload failed: ".concat(java.lang.String.valueOf(e2.getMessage())), e2);
        }
        verificationCaptureRepositoryImpl$uploadDocument$1 = new com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl$uploadDocument$1(this, continuation);
        java.lang.Object obj4 = verificationCaptureRepositoryImpl$uploadDocument$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = verificationCaptureRepositoryImpl$uploadDocument$1.getOutputMinFrameDurationlomOqCM;
    }

    private static com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.network.http.error.NetworkError p0) {
        if (p0 instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("NETWORK_ERROR", com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR, ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) p0).getCause());
        }
        if (p0 instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) p0;
            java.lang.String message = httpError.getMessage();
            if (message == null) {
                message = "HTTP ".concat(java.lang.String.valueOf(httpError.getCode()));
            }
            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("UPLOAD_FAILED", "Upload failed: ".concat(java.lang.String.valueOf(message)), null, 4, null);
        }
        if (!(p0 instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.http.error.NetworkError.UnknownError unknownError = (com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) p0;
        return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("UNKNOWN", "Unknown error: ".concat(java.lang.String.valueOf(unknownError.getCause().getMessage())), unknownError.getCause());
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.io.File p0) {
        java.lang.String lowerCase = kotlin.io.FilesKt.getExtension(p0).toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        int hashCode = lowerCase.hashCode();
        if (hashCode == 105441) {
            if (lowerCase.equals("jpg")) {
                return "image/jpeg";
            }
            return "image/*";
        }
        if (hashCode == 111145) {
            if (lowerCase.equals("png")) {
                return androidx.media3.common.MimeTypes.IMAGE_PNG;
            }
            return "image/*";
        }
        if (hashCode == 3268712 && lowerCase.equals("jpeg")) {
            return "image/jpeg";
        }
        return "image/*";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0256 A[Catch: IllegalStateException -> 0x028b, IOException -> 0x028d, TryCatch #5 {IOException -> 0x028d, IllegalStateException -> 0x028b, blocks: (B:13:0x0250, B:15:0x0256, B:18:0x0272, B:20:0x0276, B:22:0x0285, B:23:0x028a, B:59:0x01cc, B:68:0x01f6), top: B:58:0x01cc }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0272 A[Catch: IllegalStateException -> 0x028b, IOException -> 0x028d, TryCatch #5 {IOException -> 0x028d, IllegalStateException -> 0x028b, blocks: (B:13:0x0250, B:15:0x0256, B:18:0x0272, B:20:0x0276, B:22:0x0285, B:23:0x028a, B:59:0x01cc, B:68:0x01f6), top: B:58:0x01cc }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object uploadMultipleFiles(java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload> list, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl$uploadMultipleFiles$1 verificationCaptureRepositoryImpl$uploadMultipleFiles$1;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.util.List listOf;
        arrow.core.Either either;
        try {
            try {
                if (continuation instanceof com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl$uploadMultipleFiles$1) {
                    verificationCaptureRepositoryImpl$uploadMultipleFiles$1 = (com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl$uploadMultipleFiles$1) continuation;
                    if ((verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                        verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getOutputSizeshNQ4ISI -= 2147483648;
                        java.lang.Object obj = verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getOutputStallDuration;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getOutputSizeshNQ4ISI;
                        java.lang.String str3 = "Upload failed: ";
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (list.isEmpty()) {
                                return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("UPLOAD_FAILED", "No files to upload", null, 4, null);
                            }
                            java.lang.String str4 = map.get("party_id");
                            if (str4 == null) {
                                return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("UPLOAD_FAILED", "Missing required party_id in metadata", null, 4, null);
                            }
                            try {
                                java.lang.String str5 = map.get("entity_type");
                                if (str5 == null) {
                                    str5 = "PAYER";
                                }
                                com.paypal.oslo.feature.verificationcapture.data.dto.OwnerDto ownerDto = new com.paypal.oslo.feature.verificationcapture.data.dto.OwnerDto(str5, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.verificationcapture.data.dto.EntityReferenceDto("PERSON_PARTY", str4, "SINGLE")));
                                java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload> list2 = list;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                                for (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload documentFileUpload : list2) {
                                    java.lang.String obj2 = java.util.UUID.randomUUID().toString();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                                    java.lang.String name2 = documentFileUpload.getFile().getName();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                                    arrayList.add(new com.paypal.oslo.feature.verificationcapture.data.dto.FileMetadataDto(obj2, name2, Camera2StreamConfigurationMap(documentFileUpload.getFile()), kotlin.collections.CollectionsKt.listOf(documentFileUpload.getSide().name()), kotlin.collections.MapsKt.emptyMap()));
                                }
                                java.util.ArrayList arrayList2 = arrayList;
                                java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(((com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload) kotlin.collections.CollectionsKt.first((java.util.List) list)).getFile());
                                java.lang.String str6 = map.get("labels");
                                if (str6 == null || (listOf = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str6, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null) {
                                    listOf = kotlin.collections.CollectionsKt.listOf("IDENTITY_VERIFICATION");
                                }
                                com.paypal.oslo.feature.verificationcapture.data.dto.UploadDocumentRequest uploadDocumentRequest = new com.paypal.oslo.feature.verificationcapture.data.dto.UploadDocumentRequest(ownerDto, new com.paypal.oslo.feature.verificationcapture.data.dto.DocumentRequestDto(listOf, com.paypal.oslo.feature.verificationcapture.data.mapper.DocumentTypeMapper.INSTANCE.toApiString(documentType), Camera2StreamConfigurationMap, list.size(), arrayList2));
                                kotlinx.serialization.json.Json json = this.Camera2StreamConfigurationMap;
                                json.getSerializersModule();
                                java.lang.String encodeToString = json.encodeToString(com.paypal.oslo.feature.verificationcapture.data.dto.UploadDocumentRequest.INSTANCE.serializer(), uploadDocumentRequest);
                                okhttp3.RequestBody create = okhttp3.RequestBody.INSTANCE.create(encodeToString, okhttp3.MediaType.INSTANCE.parse("application/json"));
                                java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload> list3 = list;
                                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                                java.util.Iterator it = list3.iterator();
                                int i2 = 0;
                                while (it.hasNext()) {
                                    java.lang.Object next = it.next();
                                    int i3 = i2 + 1;
                                    if (i2 < 0) {
                                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                                    }
                                    com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload documentFileUpload2 = (com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload) next;
                                    java.util.Iterator it2 = it;
                                    str2 = str3;
                                    try {
                                        arrayList3.add(okhttp3.MultipartBody.Part.INSTANCE.createFormData(((com.paypal.oslo.feature.verificationcapture.data.dto.FileMetadataDto) arrayList2.get(i2)).getReferenceId(), documentFileUpload2.getFile().getName(), okhttp3.RequestBody.INSTANCE.create(documentFileUpload2.getFile(), okhttp3.MediaType.INSTANCE.parse("image/*"))));
                                        it = it2;
                                        coroutine_suspended = coroutine_suspended;
                                        i2 = i3;
                                        str3 = str2;
                                        create = create;
                                    } catch (java.io.IOException e) {
                                        e = e;
                                        str = str2;
                                        return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("NETWORK_ERROR", str.concat(java.lang.String.valueOf(e.getMessage())), e);
                                    } catch (java.lang.IllegalStateException e2) {
                                        e = e2;
                                        return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("UNKNOWN", str2.concat(java.lang.String.valueOf(e.getMessage())), e);
                                    }
                                }
                                java.lang.Object obj3 = coroutine_suspended;
                                okhttp3.RequestBody requestBody = create;
                                java.util.ArrayList arrayList4 = arrayList3;
                                com.paypal.oslo.feature.verificationcapture.network.DocumentUploadApi documentUploadApi = this.getHighSpeedVideoFpsRanges;
                                verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                                verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentType);
                                verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
                                verificationCaptureRepositoryImpl$uploadMultipleFiles$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                                verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ownerDto);
                                verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(arrayList2);
                                verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(Camera2StreamConfigurationMap);
                                verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uploadDocumentRequest);
                                verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encodeToString);
                                verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(requestBody);
                                verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(arrayList4);
                                verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getOutputSizeshNQ4ISI = 1;
                                obj = documentUploadApi.uploadDocument(requestBody, arrayList4, verificationCaptureRepositoryImpl$uploadMultipleFiles$1);
                                if (obj == obj3) {
                                    return obj3;
                                }
                            } catch (java.io.IOException e3) {
                                e = e3;
                                str2 = str3;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        either = (arrow.core.Either) obj;
                        if (!(either instanceof arrow.core.Either.Right)) {
                            com.paypal.oslo.feature.verificationcapture.data.dto.UploadDocumentResponse uploadDocumentResponse = (com.paypal.oslo.feature.verificationcapture.data.dto.UploadDocumentResponse) ((arrow.core.Either.Right) either).getValue();
                            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess(uploadDocumentResponse.getDocumentId(), uploadDocumentResponse.getStatus(), null, 4, null);
                        }
                        if (either instanceof arrow.core.Either.Left) {
                            return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue());
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (i != 0) {
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                }
            } catch (java.lang.IllegalStateException e4) {
                e = e4;
                str2 = "Upload failed: ";
            }
        } catch (java.io.IOException e5) {
            e = e5;
            str = "Upload failed: ";
        }
        verificationCaptureRepositoryImpl$uploadMultipleFiles$1 = new com.paypal.oslo.feature.verificationcapture.data.repository.VerificationCaptureRepositoryImpl$uploadMultipleFiles$1(this, continuation);
        java.lang.Object obj4 = verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = verificationCaptureRepositoryImpl$uploadMultipleFiles$1.getOutputSizeshNQ4ISI;
        java.lang.String str32 = "Upload failed: ";
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository
    /* renamed from: removeDocument-gIAlu-s, reason: not valid java name */
    public final java.lang.Object mo20603removeDocumentgIAlus(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new kotlin.NotImplementedError("Production removal not yet implemented")));
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository
    /* renamed from: getSessionInfo-IoAF18A, reason: not valid java name */
    public final java.lang.Object mo20601getSessionInfoIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.Map<java.lang.String, java.lang.String>>> continuation) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new kotlin.NotImplementedError("Production session info not yet implemented")));
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository
    /* renamed from: initializeSession-IoAF18A, reason: not valid java name */
    public final java.lang.Object mo20602initializeSessionIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> continuation) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new kotlin.NotImplementedError("Production session initialization not yet implemented")));
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository
    /* renamed from: completeSession-IoAF18A, reason: not valid java name */
    public final java.lang.Object mo20600completeSessionIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new kotlin.NotImplementedError("Production session completion not yet implemented")));
    }
}
