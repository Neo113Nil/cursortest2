package com.paypal.oslo.downloads.impl.validation;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/downloads/impl/validation/DefaultContentValidator;", "Lcom/paypal/oslo/downloads/api/validation/ContentValidator;", "Lcom/paypal/oslo/downloads/impl/validation/MimeTypeDetector;", "mimeTypeDetector", "Lcom/paypal/oslo/downloads/impl/validation/ChecksumCalculator;", "checksumCalculator", "<init>", "(Lcom/paypal/oslo/downloads/impl/validation/MimeTypeDetector;Lcom/paypal/oslo/downloads/impl/validation/ChecksumCalculator;)V", "Ljava/io/File;", "file", "", "expectedMimeType", "expectedChecksum", "Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;", "checksumAlgorithm", "Lcom/paypal/oslo/downloads/api/validation/ContentValidationResult;", "validate", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/downloads/impl/validation/MimeTypeDetector;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/downloads/impl/validation/ChecksumCalculator;", "Camera2StreamConfigurationMap", "ValidationContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultContentValidator implements com.paypal.oslo.downloads.api.validation.ContentValidator {
    private final com.paypal.oslo.downloads.impl.validation.MimeTypeDetector getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.impl.validation.ChecksumCalculator Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DefaultContentValidator(com.paypal.oslo.downloads.impl.validation.MimeTypeDetector mimeTypeDetector, com.paypal.oslo.downloads.impl.validation.ChecksumCalculator checksumCalculator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeTypeDetector, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checksumCalculator, "");
        this.getHighSpeedVideoFpsRanges = mimeTypeDetector;
        this.Camera2StreamConfigurationMap = checksumCalculator;
    }

    @Override // com.paypal.oslo.downloads.api.validation.ContentValidator
    public final java.lang.Object validate(java.io.File file, java.lang.String str, java.lang.String str2, com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.validation.ContentValidationResult> continuation) {
        com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm2;
        com.paypal.oslo.downloads.impl.validation.DefaultContentValidator.ValidationContext validationContext = new com.paypal.oslo.downloads.impl.validation.DefaultContentValidator.ValidationContext(file, str, str2, checksumAlgorithm, null, null, null, 112, null);
        if (validationContext.getHighSpeedVideoSizes == null && (!validationContext.getHighResolutionOutputSizeshNQ4ISI.exists() || !validationContext.getHighResolutionOutputSizeshNQ4ISI.canRead())) {
            validationContext = com.paypal.oslo.downloads.impl.validation.DefaultContentValidator.ValidationContext.getHighSpeedVideoFpsRanges(validationContext, new com.paypal.oslo.downloads.api.validation.ContentValidationResult(false, "File does not exist or cannot be read", com.paypal.oslo.downloads.api.validation.ContentValidationType.FILE_ACCESS, null, null, 24, null), null, null, 6);
        }
        com.paypal.oslo.downloads.impl.validation.MimeTypeDetector mimeTypeDetector = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeTypeDetector, "");
        if (validationContext.getHighSpeedVideoSizes == null) {
            java.lang.String detect = mimeTypeDetector.detect(validationContext.getHighResolutionOutputSizeshNQ4ISI);
            com.paypal.oslo.downloads.api.validation.ContentValidationResult highResolutionOutputSizeshNQ4ISI = com.paypal.oslo.downloads.impl.validation.DefaultContentValidator.ValidationContext.getHighResolutionOutputSizeshNQ4ISI(detect, validationContext.getHighSpeedVideoFpsRanges);
            validationContext = com.paypal.oslo.downloads.impl.validation.DefaultContentValidator.ValidationContext.getHighSpeedVideoFpsRanges(validationContext, highResolutionOutputSizeshNQ4ISI != null ? com.paypal.oslo.downloads.api.validation.ContentValidationResult.copy$default(highResolutionOutputSizeshNQ4ISI, false, null, null, detect, null, 23, null) : null, detect, null, 4);
        }
        com.paypal.oslo.downloads.impl.validation.ChecksumCalculator checksumCalculator = this.Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checksumCalculator, "");
        if (validationContext.getHighSpeedVideoSizes == null) {
            java.lang.String calculate = (validationContext.getHighSpeedVideoFpsRangesFor == null || (checksumAlgorithm2 = validationContext.Camera2StreamConfigurationMap) == null) ? null : checksumCalculator.calculate(validationContext.getHighResolutionOutputSizeshNQ4ISI, checksumAlgorithm2);
            com.paypal.oslo.downloads.api.validation.ContentValidationResult highSpeedVideoSizes = com.paypal.oslo.downloads.impl.validation.DefaultContentValidator.ValidationContext.getHighSpeedVideoSizes(calculate, validationContext.getHighSpeedVideoFpsRangesFor);
            validationContext = com.paypal.oslo.downloads.impl.validation.DefaultContentValidator.ValidationContext.getHighSpeedVideoFpsRanges(validationContext, highSpeedVideoSizes != null ? com.paypal.oslo.downloads.api.validation.ContentValidationResult.copy$default(highSpeedVideoSizes, false, null, null, null, calculate, 15, null) : null, null, calculate, 2);
        }
        com.paypal.oslo.downloads.api.validation.ContentValidationResult contentValidationResult = validationContext.getHighSpeedVideoSizes;
        return contentValidationResult == null ? new com.paypal.oslo.downloads.api.validation.ContentValidationResult(true, null, null, validationContext.getHighSpeedVideoSizesFor, validationContext.getOutputMinFrameDuration, 6, null) : contentValidationResult;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/downloads/impl/validation/DefaultContentValidator$ValidationContext;", "", "Ljava/io/File;", "p0", "", "p1", "p2", "Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;", "p3", "Lcom/paypal/oslo/downloads/api/validation/ContentValidationResult;", "p4", "p5", "p6", "<init>", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;Lcom/paypal/oslo/downloads/api/validation/ContentValidationResult;Ljava/lang/String;Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/downloads/api/validation/ContentValidationResult;", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "Ljava/io/File;", "getOutputFormats", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;", "Lcom/paypal/oslo/downloads/api/validation/ContentValidationResult;", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class ValidationContext {
        final com.paypal.oslo.downloads.api.model.ChecksumAlgorithm Camera2StreamConfigurationMap;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final java.lang.String getOutputMinFrameDuration;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoSizesFor;
        final java.lang.String getHighSpeedVideoFpsRangesFor;
        final com.paypal.oslo.downloads.api.validation.ContentValidationResult getHighSpeedVideoSizes;

        /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
        final java.io.File getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoFpsRanges;

        private ValidationContext(java.io.File file, java.lang.String str, java.lang.String str2, com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm, com.paypal.oslo.downloads.api.validation.ContentValidationResult contentValidationResult, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
            this.getHighResolutionOutputSizeshNQ4ISI = file;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.Camera2StreamConfigurationMap = checksumAlgorithm;
            this.getHighSpeedVideoSizes = contentValidationResult;
            this.getHighSpeedVideoSizesFor = str3;
            this.getOutputMinFrameDuration = str4;
        }

        public /* synthetic */ ValidationContext(java.io.File file, java.lang.String str, java.lang.String str2, com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm, com.paypal.oslo.downloads.api.validation.ContentValidationResult contentValidationResult, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(file, str, str2, checksumAlgorithm, (i & 16) != 0 ? null : contentValidationResult, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
        }

        static /* synthetic */ com.paypal.oslo.downloads.impl.validation.DefaultContentValidator.ValidationContext getHighSpeedVideoFpsRanges(com.paypal.oslo.downloads.impl.validation.DefaultContentValidator.ValidationContext validationContext, com.paypal.oslo.downloads.api.validation.ContentValidationResult contentValidationResult, java.lang.String str, java.lang.String str2, int i) {
            if ((i & 1) != 0) {
                contentValidationResult = validationContext.getHighSpeedVideoSizes;
            }
            com.paypal.oslo.downloads.api.validation.ContentValidationResult contentValidationResult2 = contentValidationResult;
            if ((i & 2) != 0) {
                str = validationContext.getHighSpeedVideoSizesFor;
            }
            java.lang.String str3 = str;
            if ((i & 4) != 0) {
                str2 = validationContext.getOutputMinFrameDuration;
            }
            return new com.paypal.oslo.downloads.impl.validation.DefaultContentValidator.ValidationContext(validationContext.getHighResolutionOutputSizeshNQ4ISI, validationContext.getHighSpeedVideoFpsRanges, validationContext.getHighSpeedVideoFpsRangesFor, validationContext.Camera2StreamConfigurationMap, contentValidationResult2, str3, str2);
        }

        static com.paypal.oslo.downloads.api.validation.ContentValidationResult getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, java.lang.String p1) {
            if (p1 == null || p0 == null || com.paypal.oslo.downloads.impl.util.MimeTypeUtilsKt.mimeTypesMatch(p0, p1)) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MIME type mismatch: expected ");
            sb.append(p1);
            sb.append(", got ");
            sb.append(p0);
            return new com.paypal.oslo.downloads.api.validation.ContentValidationResult(false, sb.toString(), com.paypal.oslo.downloads.api.validation.ContentValidationType.MIME_TYPE, null, null, 24, null);
        }

        static com.paypal.oslo.downloads.api.validation.ContentValidationResult getHighSpeedVideoSizes(java.lang.String p0, java.lang.String p1) {
            if (p1 == null || p0 == null || kotlin.text.StringsKt.equals(p0, p1, true)) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Checksum mismatch: expected ");
            sb.append(p1);
            sb.append(", got ");
            sb.append(p0);
            return new com.paypal.oslo.downloads.api.validation.ContentValidationResult(false, sb.toString(), com.paypal.oslo.downloads.api.validation.ContentValidationType.CHECKSUM, null, null, 24, null);
        }
    }
}
