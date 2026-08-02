package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/ResumeHandler;", "", "<init>", "()V", "Lokhttp3/Response;", "response", "", "existingBytes", "Lcom/paypal/oslo/downloads/impl/engine/ResumeInfo;", "detectResumeSupport", "(Lokhttp3/Response;J)Lcom/paypal/oslo/downloads/impl/engine/ResumeInfo;", "resumeInfo", "calculateTotalBytes", "(Lokhttp3/Response;Lcom/paypal/oslo/downloads/impl/engine/ResumeInfo;)J", "Ljava/io/File;", "file", "", "isResuming", "Ljava/io/OutputStream;", "createOutputStream", "(Ljava/io/File;Z)Ljava/io/OutputStream;", "", "p0", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Ljava/lang/Long;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)J", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResumeHandler {

    @java.lang.Deprecated
    public static final java.lang.String ACCEPT_RANGES_BYTES = "bytes";
    private static final com.paypal.oslo.downloads.impl.engine.ResumeHandler.Companion Companion = new com.paypal.oslo.downloads.impl.engine.ResumeHandler.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String HEADER_ACCEPT_RANGES = "Accept-Ranges";

    @java.lang.Deprecated
    public static final java.lang.String HEADER_CONTENT_RANGE = "Content-Range";

    @java.lang.Deprecated
    public static final int HTTP_PARTIAL_CONTENT = 206;

    @javax.inject.Inject
    public ResumeHandler() {
    }

    public final com.paypal.oslo.downloads.impl.engine.ResumeInfo detectResumeSupport(okhttp3.Response response, long existingBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        int code = response.code();
        java.lang.String header$default = okhttp3.Response.header$default(response, "Accept-Ranges", null, 2, null);
        java.lang.String header$default2 = okhttp3.Response.header$default(response, "Content-Range", null, 2, null);
        if (code == 206 && existingBytes > 0) {
            return new com.paypal.oslo.downloads.impl.engine.ResumeInfo(true, true, getHighSpeedVideoFpsRanges(header$default2));
        }
        return new com.paypal.oslo.downloads.impl.engine.ResumeInfo(false, header$default != null && kotlin.text.StringsKt.equals(header$default, ACCEPT_RANGES_BYTES, true), null);
    }

    public final long calculateTotalBytes(okhttp3.Response response, com.paypal.oslo.downloads.impl.engine.ResumeInfo resumeInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resumeInfo, "");
        long contentLength = response.body().contentLength();
        java.lang.String header$default = okhttp3.Response.header$default(response, "Content-Range", null, 2, null);
        if (resumeInfo.isResuming() && header$default != null) {
            long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(header$default);
            if (highSpeedVideoFpsRangesFor > 0) {
                return highSpeedVideoFpsRangesFor;
            }
        }
        if (contentLength > 0) {
            return contentLength;
        }
        return -1L;
    }

    public final java.io.OutputStream createOutputStream(java.io.File file, boolean isResuming) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        if (isResuming && file.exists()) {
            return new java.io.FileOutputStream(file, true);
        }
        return new java.io.FileOutputStream(file);
    }

    private static java.lang.Long getHighSpeedVideoFpsRanges(java.lang.String p0) {
        java.util.List<java.lang.String> groupValues;
        java.lang.String str;
        if (p0 == null) {
            return null;
        }
        try {
            kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(new kotlin.text.Regex("bytes\\s+(\\d+)-"), p0, 0, 2, null);
            if (find$default != null && (groupValues = find$default.getGroupValues()) != null && (str = groupValues.get(1)) != null) {
                return kotlin.text.StringsKt.toLongOrNull(str);
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    private static long getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        java.util.List<java.lang.String> groupValues;
        java.lang.String str;
        java.lang.Long longOrNull;
        if (p0 == null) {
            return -1L;
        }
        try {
            kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(new kotlin.text.Regex("/(\\d+)$"), p0, 0, 2, null);
            if (find$default == null || (groupValues = find$default.getGroupValues()) == null || (str = groupValues.get(1)) == null || (longOrNull = kotlin.text.StringsKt.toLongOrNull(str)) == null) {
                return -1L;
            }
            return longOrNull.longValue();
        } catch (java.lang.Exception unused) {
            return -1L;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\t"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/ResumeHandler$Companion;", "", "<init>", "()V", "", "HTTP_PARTIAL_CONTENT", com.visa.cbp.getEncExpo.warmup, "", "HEADER_ACCEPT_RANGES", "Ljava/lang/String;", "HEADER_CONTENT_RANGE", "ACCEPT_RANGES_BYTES"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
