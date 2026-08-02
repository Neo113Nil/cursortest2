package com.paypal.oslo.downloads.impl.util;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/downloads/impl/util/ResponseMetadataExtractor;", "", "Lcom/paypal/oslo/downloads/impl/validation/MimeTypeDetector;", "mimeTypeDetector", "<init>", "(Lcom/paypal/oslo/downloads/impl/validation/MimeTypeDetector;)V", "Lokhttp3/Response;", "response", "", "clientProvidedFilename", "defaultFilename", "extractFilename", "(Lokhttp3/Response;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/io/File;", "downloadedFile", "extractMimeType", "(Lokhttp3/Response;Ljava/io/File;)Ljava/lang/String;", "", "initialBytes", "(Lokhttp3/Response;[B)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/downloads/impl/validation/MimeTypeDetector;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResponseMetadataExtractor {
    private static final com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.Companion Companion = new com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String HEADER_CONTENT_DISPOSITION = "Content-Disposition";

    @java.lang.Deprecated
    public static final java.lang.String HEADER_CONTENT_TYPE = "Content-Type";

    @java.lang.Deprecated
    public static final java.lang.String MIME_TYPE_OCTET_STREAM = "application/octet-stream";
    private final com.paypal.oslo.downloads.impl.validation.MimeTypeDetector getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ResponseMetadataExtractor(com.paypal.oslo.downloads.impl.validation.MimeTypeDetector mimeTypeDetector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeTypeDetector, "");
        this.getHighSpeedVideoFpsRanges = mimeTypeDetector;
    }

    public final java.lang.String extractFilename(okhttp3.Response response, java.lang.String clientProvidedFilename, java.lang.String defaultFilename) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultFilename, "");
        java.lang.String str = clientProvidedFilename;
        if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
            return clientProvidedFilename;
        }
        java.lang.String extractFilename = com.paypal.oslo.downloads.impl.util.ContentDispositionParser.INSTANCE.extractFilename(okhttp3.Response.header$default(response, "Content-Disposition", null, 2, null));
        return extractFilename == null ? defaultFilename : extractFilename;
    }

    public final java.lang.String extractMimeType(okhttp3.Response response, java.io.File downloadedFile) {
        java.lang.String detect;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        java.lang.String extractBaseMimeType = com.paypal.oslo.downloads.impl.util.MimeTypeUtilsKt.extractBaseMimeType(okhttp3.Response.header$default(response, "Content-Type", null, 2, null));
        return ((extractBaseMimeType == null || kotlin.jvm.internal.Intrinsics.areEqual(extractBaseMimeType, MIME_TYPE_OCTET_STREAM)) && downloadedFile != null && downloadedFile.exists() && (detect = this.getHighSpeedVideoFpsRanges.detect(downloadedFile)) != null) ? detect : extractBaseMimeType;
    }

    public final java.lang.String extractMimeType(okhttp3.Response response, byte[] initialBytes) {
        java.lang.String detectFromBytes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        java.lang.String extractBaseMimeType = com.paypal.oslo.downloads.impl.util.MimeTypeUtilsKt.extractBaseMimeType(okhttp3.Response.header$default(response, "Content-Type", null, 2, null));
        return ((extractBaseMimeType != null && !kotlin.jvm.internal.Intrinsics.areEqual(extractBaseMimeType, MIME_TYPE_OCTET_STREAM)) || initialBytes == null || initialBytes.length == 0 || (detectFromBytes = this.getHighSpeedVideoFpsRanges.detectFromBytes(initialBytes)) == null) ? extractBaseMimeType : detectFromBytes;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/impl/util/ResponseMetadataExtractor$Companion;", "", "<init>", "()V", "", "HEADER_CONTENT_DISPOSITION", "Ljava/lang/String;", "HEADER_CONTENT_TYPE", "MIME_TYPE_OCTET_STREAM"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
