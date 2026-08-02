package kotlinx.io.unsafe;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ay\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012K\u0010\f\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\r\u0010\u000e\" \u0010\u000f\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\" \u0010\u0016\u001a\u00020\u00158\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019\" \u0010\u001c\u001a\u00020\u001b8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0014\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlinx/io/unsafe/SegmentReadContext;", "Lkotlinx/io/Segment;", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "", "startIndexInclusive", "endIndexExclusive", "", "readAction", "withData", "(Lkotlinx/io/unsafe/SegmentReadContext;Lkotlinx/io/Segment;Lkotlin/jvm/functions/Function3;)V", "SegmentReadContextImpl", "Lkotlinx/io/unsafe/SegmentReadContext;", "getSegmentReadContextImpl", "()Lkotlinx/io/unsafe/SegmentReadContext;", "getSegmentReadContextImpl$annotations", "()V", "Lkotlinx/io/unsafe/SegmentWriteContext;", "SegmentWriteContextImpl", "Lkotlinx/io/unsafe/SegmentWriteContext;", "getSegmentWriteContextImpl", "()Lkotlinx/io/unsafe/SegmentWriteContext;", "getSegmentWriteContextImpl$annotations", "Lkotlinx/io/unsafe/BufferIterationContext;", "BufferIterationContextImpl", "Lkotlinx/io/unsafe/BufferIterationContext;", "getBufferIterationContextImpl", "()Lkotlinx/io/unsafe/BufferIterationContext;", "getBufferIterationContextImpl$annotations"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UnsafeBufferOperationsKt {
    private static final kotlinx.io.unsafe.SegmentReadContext SegmentReadContextImpl = new kotlinx.io.unsafe.SegmentReadContext() { // from class: kotlinx.io.unsafe.UnsafeBufferOperationsKt$SegmentReadContextImpl$1
        @Override // kotlinx.io.unsafe.SegmentReadContext
        public final byte getUnchecked(kotlinx.io.Segment segment, int offset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "");
            return segment.getUnchecked$kotlinx_io_core(offset);
        }
    };
    private static final kotlinx.io.unsafe.SegmentWriteContext SegmentWriteContextImpl = new kotlinx.io.unsafe.SegmentWriteContext() { // from class: kotlinx.io.unsafe.UnsafeBufferOperationsKt$SegmentWriteContextImpl$1
        @Override // kotlinx.io.unsafe.SegmentWriteContext
        public final void setUnchecked(kotlinx.io.Segment segment, int offset, byte value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "");
            segment.setUnchecked$kotlinx_io_core(offset, value);
        }

        @Override // kotlinx.io.unsafe.SegmentWriteContext
        public final void setUnchecked(kotlinx.io.Segment segment, int offset, byte b0, byte b1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "");
            segment.setUnchecked$kotlinx_io_core(offset, b0, b1);
        }

        @Override // kotlinx.io.unsafe.SegmentWriteContext
        public final void setUnchecked(kotlinx.io.Segment segment, int offset, byte b0, byte b1, byte b2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "");
            segment.setUnchecked$kotlinx_io_core(offset, b0, b1, b2);
        }

        @Override // kotlinx.io.unsafe.SegmentWriteContext
        public final void setUnchecked(kotlinx.io.Segment segment, int offset, byte b0, byte b1, byte b2, byte b3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "");
            segment.setUnchecked$kotlinx_io_core(offset, b0, b1, b2, b3);
        }
    };
    private static final kotlinx.io.unsafe.BufferIterationContext BufferIterationContextImpl = new kotlinx.io.unsafe.BufferIterationContext() { // from class: kotlinx.io.unsafe.UnsafeBufferOperationsKt$BufferIterationContextImpl$1
        @Override // kotlinx.io.unsafe.BufferIterationContext
        public final kotlinx.io.Segment next(kotlinx.io.Segment segment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "");
            return segment.getNext();
        }

        @Override // kotlinx.io.unsafe.SegmentReadContext
        public final byte getUnchecked(kotlinx.io.Segment segment, int offset) {
            kotlinx.io.unsafe.SegmentReadContext segmentReadContext;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "");
            segmentReadContext = kotlinx.io.unsafe.UnsafeBufferOperationsKt.SegmentReadContextImpl;
            return segmentReadContext.getUnchecked(segment, offset);
        }
    };

    public static /* synthetic */ void getBufferIterationContextImpl$annotations() {
    }

    public static /* synthetic */ void getSegmentReadContextImpl$annotations() {
    }

    public static /* synthetic */ void getSegmentWriteContextImpl$annotations() {
    }

    public static final /* synthetic */ void withData(kotlinx.io.unsafe.SegmentReadContext segmentReadContext, kotlinx.io.Segment segment, kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segmentReadContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        function3.invoke(segment.dataAsByteArray(true), java.lang.Integer.valueOf(segment.getPos()), java.lang.Integer.valueOf(segment.getLimit()));
    }
}
