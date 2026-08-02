package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/client/engine/okhttp/UnsupportedFrameTypeException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/getHighSpeedVideoSizes;", "Lkotlinx/coroutines/CopyableThrowable;", "Lio/ktor/websocket/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "<init>", "(Lio/ktor/websocket/Frame;)V", "createCopy", "()Lio/ktor/client/engine/okhttp/UnsupportedFrameTypeException;", "getHighSpeedVideoSizes", "Lio/ktor/websocket/Frame;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UnsupportedFrameTypeException extends java.lang.IllegalArgumentException implements kotlinx.coroutines.CopyableThrowable<io.ktor.client.engine.okhttp.UnsupportedFrameTypeException> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final io.ktor.websocket.Frame Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedFrameTypeException(io.ktor.websocket.Frame frame) {
        super("Unsupported frame type: ".concat(java.lang.String.valueOf(frame)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
        this.Camera2StreamConfigurationMap = frame;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.CopyableThrowable
    public final io.ktor.client.engine.okhttp.UnsupportedFrameTypeException createCopy() {
        io.ktor.client.engine.okhttp.UnsupportedFrameTypeException unsupportedFrameTypeException = new io.ktor.client.engine.okhttp.UnsupportedFrameTypeException(this.Camera2StreamConfigurationMap);
        unsupportedFrameTypeException.initCause(this);
        return unsupportedFrameTypeException;
    }
}
