package kotlinx.io.unsafe;

/* compiled from: UnsafeBufferOperations.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ar\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042K\u0010\u0005\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u0006H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\"\u001c\u0010\u000e\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001c\u0010\u0013\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017\"\u001c\u0010\u0018\u001a\u00020\u00198\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"withData", "", "Lkotlinx/io/unsafe/SegmentReadContext;", com.ironsource.D1.i, "Lkotlinx/io/Segment;", "readAction", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "bytes", "", "startIndexInclusive", "endIndexExclusive", "SegmentReadContextImpl", "getSegmentReadContextImpl$annotations", "()V", "getSegmentReadContextImpl", "()Lkotlinx/io/unsafe/SegmentReadContext;", "SegmentWriteContextImpl", "Lkotlinx/io/unsafe/SegmentWriteContext;", "getSegmentWriteContextImpl$annotations", "getSegmentWriteContextImpl", "()Lkotlinx/io/unsafe/SegmentWriteContext;", "BufferIterationContextImpl", "Lkotlinx/io/unsafe/BufferIterationContext;", "getBufferIterationContextImpl$annotations", "getBufferIterationContextImpl", "()Lkotlinx/io/unsafe/BufferIterationContext;", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnsafeBufferOperationsKt {
    private static final kotlinx.io.unsafe.SegmentReadContext SegmentReadContextImpl = new kotlinx.io.unsafe.SegmentReadContext() { // from class: kotlinx.io.unsafe.UnsafeBufferOperationsKt$SegmentReadContextImpl$1
        @Override // kotlinx.io.unsafe.SegmentReadContext
        public byte getUnchecked(kotlinx.io.Segment segment, int offset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
            return segment.getUnchecked$kotlinx_io_core(offset);
        }
    };
    private static final kotlinx.io.unsafe.SegmentWriteContext SegmentWriteContextImpl = new kotlinx.io.unsafe.SegmentWriteContext() { // from class: kotlinx.io.unsafe.UnsafeBufferOperationsKt$SegmentWriteContextImpl$1
        @Override // kotlinx.io.unsafe.SegmentWriteContext
        public void setUnchecked(kotlinx.io.Segment segment, int offset, byte value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
            segment.setUnchecked$kotlinx_io_core(offset, value);
        }

        @Override // kotlinx.io.unsafe.SegmentWriteContext
        public void setUnchecked(kotlinx.io.Segment segment, int offset, byte b0, byte b1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
            segment.setUnchecked$kotlinx_io_core(offset, b0, b1);
        }

        @Override // kotlinx.io.unsafe.SegmentWriteContext
        public void setUnchecked(kotlinx.io.Segment segment, int offset, byte b0, byte b1, byte b2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
            segment.setUnchecked$kotlinx_io_core(offset, b0, b1, b2);
        }

        @Override // kotlinx.io.unsafe.SegmentWriteContext
        public void setUnchecked(kotlinx.io.Segment segment, int offset, byte b0, byte b1, byte b2, byte b3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
            segment.setUnchecked$kotlinx_io_core(offset, b0, b1, b2, b3);
        }
    };
    private static final kotlinx.io.unsafe.BufferIterationContext BufferIterationContextImpl = new kotlinx.io.unsafe.BufferIterationContext() { // from class: kotlinx.io.unsafe.UnsafeBufferOperationsKt$BufferIterationContextImpl$1
        @Override // kotlinx.io.unsafe.BufferIterationContext
        public kotlinx.io.Segment next(kotlinx.io.Segment segment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
            return segment.getNext();
        }

        @Override // kotlinx.io.unsafe.SegmentReadContext
        public byte getUnchecked(kotlinx.io.Segment segment, int offset) {
            kotlinx.io.unsafe.SegmentReadContext segmentReadContext;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
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

    public static final /* synthetic */ void withData(kotlinx.io.unsafe.SegmentReadContext segmentReadContext, kotlinx.io.Segment segment, kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> readAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segmentReadContext, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readAction, "readAction");
        readAction.invoke(segment.dataAsByteArray(true), java.lang.Integer.valueOf(segment.getPos()), java.lang.Integer.valueOf(segment.getLimit()));
    }
}
