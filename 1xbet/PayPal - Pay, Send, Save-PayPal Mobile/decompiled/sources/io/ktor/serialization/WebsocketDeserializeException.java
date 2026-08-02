package io.ktor.serialization;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lio/ktor/serialization/WebsocketDeserializeException;", "Lio/ktor/serialization/WebsocketContentConvertException;", "", "message", "", "cause", "Lio/ktor/websocket/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lio/ktor/websocket/Frame;)V", "Lio/ktor/websocket/Frame;", "getFrame", "()Lio/ktor/websocket/Frame;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WebsocketDeserializeException extends io.ktor.serialization.WebsocketContentConvertException {
    private final io.ktor.websocket.Frame frame;

    public /* synthetic */ WebsocketDeserializeException(java.lang.String str, java.lang.Throwable th, io.ktor.websocket.Frame frame, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, frame);
    }

    public final io.ktor.websocket.Frame getFrame() {
        return this.frame;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketDeserializeException(java.lang.String str, java.lang.Throwable th, io.ktor.websocket.Frame frame) {
        super(str, th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
        this.frame = frame;
    }
}
