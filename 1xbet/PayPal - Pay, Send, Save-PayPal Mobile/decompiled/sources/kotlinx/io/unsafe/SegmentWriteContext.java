package kotlinx.io.unsafe;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\rJ7\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\u000fJ?\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lkotlinx/io/unsafe/SegmentWriteContext;", "", "Lkotlinx/io/Segment;", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, "", "offset", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "setUnchecked", "(Lkotlinx/io/Segment;IB)V", "b0", "b1", "(Lkotlinx/io/Segment;IBB)V", "b2", "(Lkotlinx/io/Segment;IBBB)V", "b3", "(Lkotlinx/io/Segment;IBBBB)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SegmentWriteContext {
    void setUnchecked(kotlinx.io.Segment segment, int offset, byte value);

    void setUnchecked(kotlinx.io.Segment segment, int offset, byte b0, byte b1);

    void setUnchecked(kotlinx.io.Segment segment, int offset, byte b0, byte b1, byte b2);

    void setUnchecked(kotlinx.io.Segment segment, int offset, byte b0, byte b1, byte b2, byte b3);
}
