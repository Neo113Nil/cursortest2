package kotlinx.io.unsafe;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lkotlinx/io/unsafe/BufferIterationContext;", "Lkotlinx/io/unsafe/SegmentReadContext;", "Lkotlinx/io/Segment;", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, io.ktor.http.LinkHeader.Rel.Next, "(Lkotlinx/io/Segment;)Lkotlinx/io/Segment;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface BufferIterationContext extends kotlinx.io.unsafe.SegmentReadContext {
    kotlinx.io.Segment next(kotlinx.io.Segment segment);
}
