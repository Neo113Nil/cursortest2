package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/serialization/json/internal/JavaStreamSerialReader;", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "Ljava/io/InputStream;", "stream", "<init>", "(Ljava/io/InputStream;)V", "", "buffer", "", "bufferOffset", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "read", "([CII)I", "", "release", "()V", "Lkotlinx/serialization/json/internal/CharsetReader;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/serialization/json/internal/CharsetReader;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class JavaStreamSerialReader implements kotlinx.serialization.json.internal.InternalJsonReader {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.serialization.json.internal.CharsetReader getHighSpeedVideoFpsRangesFor;

    public JavaStreamSerialReader(java.io.InputStream inputStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        this.getHighSpeedVideoFpsRangesFor = new kotlinx.serialization.json.internal.CharsetReader(inputStream, kotlin.text.Charsets.UTF_8);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonReader
    public final int read(char[] buffer, int bufferOffset, int count) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        return this.getHighSpeedVideoFpsRangesFor.read(buffer, bufferOffset, count);
    }

    public final void release() {
        this.getHighSpeedVideoFpsRangesFor.release();
    }
}
