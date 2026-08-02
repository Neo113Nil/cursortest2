package okhttp3;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0002('B%\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0011\u0010&\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b&\u0010\n"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "", "", "encodedNames", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "-deprecated_size", "()I", "index", "encodedName", "(I)Ljava/lang/String;", "name", "encodedValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lokhttp3/MediaType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "p0", "", "p1", "getHighSpeedVideoFpsRanges", "(Lokio/BufferedSink;Z)J", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", io.ktor.http.ContentDisposition.Parameters.Size, "Companion", "Builder"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FormBody extends okhttp3.RequestBody {
    private static final okhttp3.MediaType getHighSpeedVideoFpsRangesFor = okhttp3.MediaType.INSTANCE.get("application/x-www-form-urlencoded");

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<java.lang.String> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;

    public FormBody(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.getHighSpeedVideoFpsRangesFor = okhttp3.internal._UtilJvmKt.toImmutableList(list);
        this.getHighSpeedVideoSizes = okhttp3.internal._UtilJvmKt.toImmutableList(list2);
    }

    public final int size() {
        return this.getHighSpeedVideoFpsRangesFor.size();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = io.ktor.http.ContentDisposition.Parameters.Size, imports = {}))
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m24315deprecated_size() {
        return size();
    }

    public final java.lang.String encodedName(int index) {
        return this.getHighSpeedVideoFpsRangesFor.get(index);
    }

    public final java.lang.String name(int index) {
        return okhttp3.internal.url._UrlKt.percentDecode$default(encodedName(index), 0, 0, true, 3, null);
    }

    public final java.lang.String encodedValue(int index) {
        return this.getHighSpeedVideoSizes.get(index);
    }

    public final java.lang.String value(int index) {
        return okhttp3.internal.url._UrlKt.percentDecode$default(encodedValue(index), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final okhttp3.MediaType getContentType() {
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentLength */
    public final long getContentLength() {
        return getHighSpeedVideoFpsRanges(null, true);
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(okio.BufferedSink sink) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
        getHighSpeedVideoFpsRanges(sink, false);
    }

    private final long getHighSpeedVideoFpsRanges(okio.BufferedSink p0, boolean p1) {
        okio.Buffer buffer;
        if (p1) {
            buffer = new okio.Buffer();
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(p0);
            buffer = p0.getBuffer();
        }
        int size = this.getHighSpeedVideoFpsRangesFor.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(this.getHighSpeedVideoFpsRangesFor.get(i));
            buffer.writeByte(61);
            buffer.writeUtf8(this.getHighSpeedVideoSizes.get(i));
        }
        if (!p1) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lokhttp3/FormBody$Builder;", "", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "<init>", "(Ljava/nio/charset/Charset;)V", "", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/FormBody$Builder;", "addEncoded", "Lokhttp3/FormBody;", "build", "()Lokhttp3/FormBody;", "Camera2StreamConfigurationMap", "Ljava/nio/charset/Charset;", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.nio.charset.Charset getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;
        private final java.util.List<java.lang.String> getHighSpeedVideoSizes;

        public Builder(java.nio.charset.Charset charset) {
            this.getHighSpeedVideoFpsRanges = charset;
            this.getHighSpeedVideoSizes = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        }

        public /* synthetic */ Builder(java.nio.charset.Charset charset, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charset);
        }

        public final okhttp3.FormBody.Builder add(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.getHighSpeedVideoSizes.add(okhttp3.internal.url._UrlKt.canonicalizeWithCharset$default(name2, 0, 0, okhttp3.internal.url._UrlKt.FORM_ENCODE_SET, false, false, false, false, this.getHighSpeedVideoFpsRanges, 91, null));
            this.getHighSpeedVideoFpsRangesFor.add(okhttp3.internal.url._UrlKt.canonicalizeWithCharset$default(value, 0, 0, okhttp3.internal.url._UrlKt.FORM_ENCODE_SET, false, false, false, false, this.getHighSpeedVideoFpsRanges, 91, null));
            return this;
        }

        public final okhttp3.FormBody.Builder addEncoded(java.lang.String name2, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.getHighSpeedVideoSizes.add(okhttp3.internal.url._UrlKt.canonicalizeWithCharset$default(name2, 0, 0, okhttp3.internal.url._UrlKt.FORM_ENCODE_SET, true, false, true, false, this.getHighSpeedVideoFpsRanges, 83, null));
            this.getHighSpeedVideoFpsRangesFor.add(okhttp3.internal.url._UrlKt.canonicalizeWithCharset$default(value, 0, 0, okhttp3.internal.url._UrlKt.FORM_ENCODE_SET, true, false, true, false, this.getHighSpeedVideoFpsRanges, 83, null));
            return this;
        }

        public final okhttp3.FormBody build() {
            return new okhttp3.FormBody(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
