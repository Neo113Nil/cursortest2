package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0010\u001a\u0006*\u00020\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lio/ktor/websocket/SimpleFrameCollector;", "", "<init>", "()V", "", "length", "Ljava/nio/ByteBuffer;", "bb", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "(ILjava/nio/ByteBuffer;)V", "handle", "(Ljava/nio/ByteBuffer;)V", "maskKey", "take", "(Ljava/lang/Integer;)Ljava/nio/ByteBuffer;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Ljava/nio/ByteBuffer;", "getHighSpeedVideoSizes", "", "getHasRemaining", "()Z", "hasRemaining"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SimpleFrameCollector {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.nio.ByteBuffer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor = java.nio.ByteBuffer.allocate(4);

    public final boolean getHasRemaining() {
        return this.getHighResolutionOutputSizeshNQ4ISI > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r0.capacity() < r2) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void start(int length, java.nio.ByteBuffer bb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bb, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("remaining should be 0");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = length;
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoSizes;
        if (byteBuffer != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(byteBuffer);
        }
        this.getHighSpeedVideoSizes = java.nio.ByteBuffer.allocate(length);
        java.nio.ByteBuffer byteBuffer2 = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(byteBuffer2);
        byteBuffer2.clear();
        handle(bb);
    }

    public final void handle(java.nio.ByteBuffer bb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bb, "");
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(byteBuffer);
        this.getHighResolutionOutputSizeshNQ4ISI = i - io.ktor.util.NIOKt.moveTo(bb, byteBuffer, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.nio.ByteBuffer take(java.lang.Integer maskKey) {
        java.nio.ByteBuffer byteBuffer = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(byteBuffer);
        byteBuffer.flip();
        java.nio.ByteBuffer slice = byteBuffer.slice();
        if (maskKey != null) {
            this.getHighSpeedVideoFpsRangesFor.clear();
            this.getHighSpeedVideoFpsRangesFor.asIntBuffer().put(maskKey.intValue());
            this.getHighSpeedVideoFpsRangesFor.clear();
            kotlin.jvm.internal.Intrinsics.checkNotNull(slice);
            java.nio.ByteBuffer byteBuffer2 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteBuffer2, "");
            io.ktor.websocket.UtilsKt.xor(slice, byteBuffer2);
        }
        this.getHighSpeedVideoSizes = null;
        java.nio.ByteBuffer asReadOnlyBuffer = slice.asReadOnlyBuffer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asReadOnlyBuffer, "");
        return asReadOnlyBuffer;
    }
}
