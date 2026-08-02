package retrofit2;

/* loaded from: classes5.dex */
final class RequestBuilder {

    @javax.annotation.Nullable
    okhttp3.FormBody.Builder Camera2StreamConfigurationMap;

    @javax.annotation.Nullable
    okhttp3.RequestBody getHighResolutionOutputSizeshNQ4ISI;

    @javax.annotation.Nullable
    okhttp3.MediaType getHighSpeedVideoFpsRanges;
    final okhttp3.HttpUrl getHighSpeedVideoFpsRangesFor;
    final okhttp3.Headers.Builder getHighSpeedVideoSizesFor;
    final java.lang.String getInputFormats;

    @javax.annotation.Nullable
    java.lang.String getInputSizeshNQ4ISI;

    @javax.annotation.Nullable
    okhttp3.MultipartBody.Builder getOutputFormats;
    final boolean getOutputMinFrameDuration;
    final okhttp3.Request.Builder getOutputMinFrameDurationlomOqCM = new okhttp3.Request.Builder();

    @javax.annotation.Nullable
    okhttp3.HttpUrl.Builder getOutputStallDuration;
    private static final char[] getOutputStallDurationlomOqCM = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final java.util.regex.Pattern getHighSpeedVideoSizes = java.util.regex.Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    RequestBuilder(java.lang.String str, okhttp3.HttpUrl httpUrl, @javax.annotation.Nullable java.lang.String str2, @javax.annotation.Nullable okhttp3.Headers headers, @javax.annotation.Nullable okhttp3.MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.getInputFormats = str;
        this.getHighSpeedVideoFpsRangesFor = httpUrl;
        this.getInputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoFpsRanges = mediaType;
        this.getOutputMinFrameDuration = z;
        if (headers != null) {
            this.getHighSpeedVideoSizesFor = headers.newBuilder();
        } else {
            this.getHighSpeedVideoSizesFor = new okhttp3.Headers.Builder();
        }
        if (z2) {
            this.Camera2StreamConfigurationMap = new okhttp3.FormBody.Builder();
        } else if (z3) {
            okhttp3.MultipartBody.Builder builder = new okhttp3.MultipartBody.Builder();
            this.getOutputFormats = builder;
            builder.setType(okhttp3.MultipartBody.FORM);
        }
    }

    final void getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.getHighSpeedVideoFpsRanges = okhttp3.MediaType.get(str2);
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalArgumentException("Malformed content type: ".concat(java.lang.String.valueOf(str2)), e);
            }
        } else if (z) {
            this.getHighSpeedVideoSizesFor.addUnsafeNonAscii(str, str2);
        } else {
            this.getHighSpeedVideoSizesFor.add(str, str2);
        }
    }

    static java.lang.String getHighSpeedVideoSizes(java.lang.String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            int i2 = 47;
            int i3 = -1;
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += java.lang.Character.charCount(codePointAt);
            } else {
                okio.Buffer buffer = new okio.Buffer();
                buffer.writeUtf8(str, 0, i);
                okio.Buffer buffer2 = null;
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i3 || (!z && (codePointAt2 == i2 || codePointAt2 == 37))) {
                            if (buffer2 == null) {
                                buffer2 = new okio.Buffer();
                            }
                            buffer2.writeUtf8CodePoint(codePointAt2);
                            long size = buffer2.size();
                            for (long j = 0; j < size; j++) {
                                byte b = buffer2.getByte(j);
                                buffer.writeByte(37);
                                char[] cArr = getOutputStallDurationlomOqCM;
                                buffer.writeByte((int) cArr[((b & 255) >> 4) & 15]);
                                buffer.writeByte((int) cArr[b & com.google.common.base.Ascii.SI]);
                            }
                            buffer2.clear();
                        } else {
                            buffer.writeUtf8CodePoint(codePointAt2);
                        }
                    }
                    i += java.lang.Character.charCount(codePointAt2);
                    i2 = 47;
                    i3 = -1;
                }
                return buffer.readUtf8();
            }
        }
        return str;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, @javax.annotation.Nullable java.lang.String str2, boolean z) {
        java.lang.String str3 = this.getInputSizeshNQ4ISI;
        if (str3 != null) {
            okhttp3.HttpUrl.Builder newBuilder = this.getHighSpeedVideoFpsRangesFor.newBuilder(str3);
            this.getOutputStallDuration = newBuilder;
            if (newBuilder == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Malformed URL. Base: ");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                sb.append(", Relative: ");
                sb.append(this.getInputSizeshNQ4ISI);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getInputSizeshNQ4ISI = null;
        }
        if (z) {
            this.getOutputStallDuration.addEncodedQueryParameter(str, str2);
        } else {
            this.getOutputStallDuration.addQueryParameter(str, str2);
        }
    }

    static class ContentTypeOverridingRequestBody extends okhttp3.RequestBody {
        private final okhttp3.RequestBody getHighResolutionOutputSizeshNQ4ISI;
        private final okhttp3.MediaType getHighSpeedVideoSizes;

        ContentTypeOverridingRequestBody(okhttp3.RequestBody requestBody, okhttp3.MediaType mediaType) {
            this.getHighResolutionOutputSizeshNQ4ISI = requestBody;
            this.getHighSpeedVideoSizes = mediaType;
        }

        @Override // okhttp3.RequestBody
        /* renamed from: contentType */
        public okhttp3.MediaType getContentType() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // okhttp3.RequestBody
        /* renamed from: contentLength */
        public long getContentLength() throws java.io.IOException {
            return this.getHighResolutionOutputSizeshNQ4ISI.getContentLength();
        }

        @Override // okhttp3.RequestBody
        public void writeTo(okio.BufferedSink bufferedSink) throws java.io.IOException {
            this.getHighResolutionOutputSizeshNQ4ISI.writeTo(bufferedSink);
        }
    }
}
