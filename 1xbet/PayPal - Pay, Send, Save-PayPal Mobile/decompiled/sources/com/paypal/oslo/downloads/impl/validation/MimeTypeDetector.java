package com.paypal.oslo.downloads.impl.validation;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u001b\u0010\u0012\u001a\u00020\u0011*\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/downloads/impl/validation/MimeTypeDetector;", "", "<init>", "()V", "Ljava/io/File;", "file", "", "detect", "(Ljava/io/File;)Ljava/lang/String;", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "detectFromBytes", "([B)Ljava/lang/String;", "p0", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "(Ljava/io/File;)[B", "", "getHighSpeedVideoSizes", "([B[B)Z", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MimeTypeDetector {

    @java.lang.Deprecated
    public static final int HEADER_SIZE = 16;
    private static final com.paypal.oslo.downloads.impl.validation.MimeTypeDetector.Companion Companion = new com.paypal.oslo.downloads.impl.validation.MimeTypeDetector.Companion(null);
    private static final java.util.Map<byte[], java.lang.String> getHighSpeedVideoFpsRangesFor = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(new byte[]{37, 80, 68, 70}, "application/pdf"), kotlin.TuplesKt.to(new byte[]{80, 75, 3, 4}, "application/zip"), kotlin.TuplesKt.to(new byte[]{-119, 80, 78, 71}, androidx.media3.common.MimeTypes.IMAGE_PNG), kotlin.TuplesKt.to(new byte[]{-1, -40, -1}, "image/jpeg"), kotlin.TuplesKt.to(new byte[]{71, 73, 70, 56}, "image/gif"));

    @javax.inject.Inject
    public MimeTypeDetector() {
    }

    public final java.lang.String detectFromBytes(byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
        return Camera2StreamConfigurationMap(bytes);
    }

    private final java.lang.String Camera2StreamConfigurationMap(java.io.File p0) {
        try {
            return Camera2StreamConfigurationMap(getHighSpeedVideoFpsRanges(p0));
        } catch (java.io.IOException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Failed to read file header for MIME detection", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("file", p0.getName()), kotlin.TuplesKt.to("error", e.getMessage())), null, 4, null);
            return null;
        }
    }

    private static byte[] getHighSpeedVideoFpsRanges(java.io.File p0) {
        byte[] bArr = new byte[16];
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(p0);
        try {
            fileInputStream.read(bArr);
            kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
            return bArr;
        } finally {
        }
    }

    private static java.lang.String Camera2StreamConfigurationMap(byte[] p0) {
        java.lang.Object obj;
        java.util.Iterator<T> it = getHighSpeedVideoFpsRangesFor.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (getHighSpeedVideoSizes(p0, (byte[]) ((java.util.Map.Entry) obj).getKey())) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (entry != null) {
            return (java.lang.String) entry.getValue();
        }
        return null;
    }

    private static boolean getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            return false;
        }
        java.lang.Iterable indices = kotlin.collections.ArraysKt.getIndices(bArr2);
        if ((indices instanceof java.util.Collection) && ((java.util.Collection) indices).isEmpty()) {
            return true;
        }
        java.util.Iterator it = indices.iterator();
        while (it.hasNext()) {
            int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
            if (bArr[nextInt] != bArr2[nextInt]) {
                return false;
            }
        }
        return true;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/downloads/impl/validation/MimeTypeDetector$Companion;", "", "<init>", "()V", "", "HEADER_SIZE", com.visa.cbp.getEncExpo.warmup, "", "", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String detect(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.lang.String lowerCase = kotlin.io.FilesKt.getExtension(file).toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
        return mimeTypeFromExtension == null ? Camera2StreamConfigurationMap(file) : mimeTypeFromExtension;
    }
}
