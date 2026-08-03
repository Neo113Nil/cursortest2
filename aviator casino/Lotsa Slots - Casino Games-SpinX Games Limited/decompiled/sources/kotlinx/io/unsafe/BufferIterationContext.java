package kotlinx.io.unsafe;

/* compiled from: UnsafeBufferOperations.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lkotlinx/io/unsafe/BufferIterationContext;", "Lkotlinx/io/unsafe/SegmentReadContext;", io.ktor.http.LinkHeader.Rel.Next, "Lkotlinx/io/Segment;", com.ironsource.D1.i, "kotlinx-io-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BufferIterationContext extends kotlinx.io.unsafe.SegmentReadContext {
    kotlinx.io.Segment next(kotlinx.io.Segment segment);
}
