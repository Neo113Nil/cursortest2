package io.ktor.websocket;

/* compiled from: Frame.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 (2\u00020\u0001:\u0006)*+,-(BI\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b \u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b!\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0082\u0001\u0005./012¨\u00063"}, d2 = {"Lio/ktor/websocket/Frame;", "", "", "fin", "Lio/ktor/websocket/FrameType;", "frameType", "", "data", "Lkotlinx/coroutines/DisposableHandle;", "disposableHandle", "rsv1", "rsv2", "rsv3", "<init>", "(ZLio/ktor/websocket/FrameType;[BLkotlinx/coroutines/DisposableHandle;ZZZ)V", "", "toString", "()Ljava/lang/String;", "copy", "()Lio/ktor/websocket/Frame;", "Z", "getFin", "()Z", "Lio/ktor/websocket/FrameType;", "getFrameType", "()Lio/ktor/websocket/FrameType;", "[B", "getData", "()[B", "Lkotlinx/coroutines/DisposableHandle;", "getDisposableHandle", "()Lkotlinx/coroutines/DisposableHandle;", "getRsv1", "getRsv2", "getRsv3", "Ljava/nio/ByteBuffer;", "buffer", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Binary", "Text", "Close", "Ping", "Pong", "Lio/ktor/websocket/Frame$Binary;", "Lio/ktor/websocket/Frame$Close;", "Lio/ktor/websocket/Frame$Ping;", "Lio/ktor/websocket/Frame$Pong;", "Lio/ktor/websocket/Frame$Text;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Frame {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.websocket.Frame.Companion INSTANCE = new io.ktor.websocket.Frame.Companion(null);
    private static final byte[] Empty = new byte[0];
    private final java.nio.ByteBuffer buffer;
    private final byte[] data;
    private final kotlinx.coroutines.DisposableHandle disposableHandle;
    private final boolean fin;
    private final io.ktor.websocket.FrameType frameType;
    private final boolean rsv1;
    private final boolean rsv2;
    private final boolean rsv3;

    public /* synthetic */ Frame(boolean z, io.ktor.websocket.FrameType frameType, byte[] bArr, kotlinx.coroutines.DisposableHandle disposableHandle, boolean z2, boolean z3, boolean z4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, frameType, bArr, disposableHandle, z2, z3, z4);
    }

    private Frame(boolean z, io.ktor.websocket.FrameType frameType, byte[] bArr, kotlinx.coroutines.DisposableHandle disposableHandle, boolean z2, boolean z3, boolean z4) {
        this.fin = z;
        this.frameType = frameType;
        this.data = bArr;
        this.disposableHandle = disposableHandle;
        this.rsv1 = z2;
        this.rsv2 = z3;
        this.rsv3 = z4;
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wrap, "wrap(...)");
        this.buffer = wrap;
    }

    public final boolean getFin() {
        return this.fin;
    }

    public final io.ktor.websocket.FrameType getFrameType() {
        return this.frameType;
    }

    public /* synthetic */ Frame(boolean z, io.ktor.websocket.FrameType frameType, byte[] bArr, kotlinx.coroutines.DisposableHandle disposableHandle, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, frameType, bArr, (i & 8) != 0 ? io.ktor.websocket.NonDisposableHandle.INSTANCE : disposableHandle, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, null);
    }

    public final byte[] getData() {
        return this.data;
    }

    public final kotlinx.coroutines.DisposableHandle getDisposableHandle() {
        return this.disposableHandle;
    }

    public final boolean getRsv1() {
        return this.rsv1;
    }

    public final boolean getRsv2() {
        return this.rsv2;
    }

    public final boolean getRsv3() {
        return this.rsv3;
    }

    public final java.nio.ByteBuffer getBuffer() {
        return this.buffer;
    }

    /* compiled from: Frame.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/websocket/Frame$Binary;", "Lio/ktor/websocket/Frame;", "", "fin", "", "data", "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "Ljava/nio/ByteBuffer;", "buffer", "(ZLjava/nio/ByteBuffer;)V", "(Z[B)V", "Lkotlinx/io/Source;", "packet", "(ZLkotlinx/io/Source;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Binary extends io.ktor.websocket.Frame {
        public /* synthetic */ Binary(boolean z, byte[] bArr, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, bArr, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z, byte[] data, boolean z2, boolean z3, boolean z4) {
            super(z, io.ktor.websocket.FrameType.BINARY, data, io.ktor.websocket.NonDisposableHandle.INSTANCE, z2, z3, z4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z, java.nio.ByteBuffer buffer) {
            this(z, io.ktor.util.NIOKt.moveToByteArray(buffer));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z, byte[] data) {
            this(z, data, false, false, false);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Binary(boolean z, kotlinx.io.Source packet) {
            this(z, kotlinx.io.SourcesKt.readByteArray(packet));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packet, "packet");
        }
    }

    /* compiled from: Frame.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\t\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/websocket/Frame$Text;", "Lio/ktor/websocket/Frame;", "", "fin", "", "data", "rsv1", "rsv2", "rsv3", "<init>", "(Z[BZZZ)V", "(Z[B)V", "", "text", "(Ljava/lang/String;)V", "Lkotlinx/io/Source;", "packet", "(ZLkotlinx/io/Source;)V", "Ljava/nio/ByteBuffer;", "buffer", "(ZLjava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Text extends io.ktor.websocket.Frame {
        public /* synthetic */ Text(boolean z, byte[] bArr, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, bArr, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(boolean z, byte[] data, boolean z2, boolean z3, boolean z4) {
            super(z, io.ktor.websocket.FrameType.TEXT, data, io.ktor.websocket.NonDisposableHandle.INSTANCE, z2, z3, z4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z, byte[] data) {
            this(z, data, false, false, false);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(java.lang.String text) {
            this(true, io.ktor.utils.io.core.StringsKt.toByteArray$default(text, null, 1, null));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z, kotlinx.io.Source packet) {
            this(z, kotlinx.io.SourcesKt.readByteArray(packet));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packet, "packet");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Text(boolean z, java.nio.ByteBuffer buffer) {
            this(z, io.ktor.util.NIOKt.moveToByteArray(buffer));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        }
    }

    /* compiled from: Frame.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/websocket/Frame$Close;", "Lio/ktor/websocket/Frame;", "", "data", "<init>", "([B)V", "Lio/ktor/websocket/CloseReason;", "reason", "(Lio/ktor/websocket/CloseReason;)V", "Lkotlinx/io/Source;", "packet", "(Lkotlinx/io/Source;)V", "()V", "Ljava/nio/ByteBuffer;", "buffer", "(Ljava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Close extends io.ktor.websocket.Frame {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Close(byte[] data) {
            super(true, io.ktor.websocket.FrameType.CLOSE, data, io.ktor.websocket.NonDisposableHandle.INSTANCE, false, false, false, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Close(kotlinx.io.Source packet) {
            this(kotlinx.io.SourcesKt.readByteArray(packet));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packet, "packet");
        }

        public Close() {
            this(io.ktor.websocket.Frame.Empty);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Close(java.nio.ByteBuffer buffer) {
            this(io.ktor.util.NIOKt.moveToByteArray(buffer));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Close(io.ktor.websocket.CloseReason reason) {
            this(r0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            kotlinx.io.Buffer buffer = new kotlinx.io.Buffer();
            kotlinx.io.Buffer buffer2 = buffer;
            buffer2.writeShort(reason.getCode());
            io.ktor.utils.io.core.StringsKt.writeText$default(buffer2, reason.getMessage(), 0, 0, (java.nio.charset.Charset) null, 14, (java.lang.Object) null);
        }
    }

    /* compiled from: Frame.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/websocket/Frame$Pong;", "Lio/ktor/websocket/Frame;", "", "data", "Lkotlinx/coroutines/DisposableHandle;", "disposableHandle", "<init>", "([BLkotlinx/coroutines/DisposableHandle;)V", "Lkotlinx/io/Source;", "packet", "(Lkotlinx/io/Source;)V", "Ljava/nio/ByteBuffer;", "buffer", "(Ljava/nio/ByteBuffer;Lkotlinx/coroutines/DisposableHandle;)V", "(Ljava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Pong extends io.ktor.websocket.Frame {
        public /* synthetic */ Pong(byte[] bArr, io.ktor.websocket.NonDisposableHandle nonDisposableHandle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bArr, (i & 2) != 0 ? io.ktor.websocket.NonDisposableHandle.INSTANCE : nonDisposableHandle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pong(byte[] data, kotlinx.coroutines.DisposableHandle disposableHandle) {
            super(true, io.ktor.websocket.FrameType.PONG, data, disposableHandle, false, false, false, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableHandle, "disposableHandle");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(kotlinx.io.Source packet) {
            this(kotlinx.io.SourcesKt.readByteArray(packet), io.ktor.websocket.NonDisposableHandle.INSTANCE);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packet, "packet");
        }

        public /* synthetic */ Pong(java.nio.ByteBuffer byteBuffer, io.ktor.websocket.NonDisposableHandle nonDisposableHandle, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(byteBuffer, (i & 2) != 0 ? io.ktor.websocket.NonDisposableHandle.INSTANCE : nonDisposableHandle);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(java.nio.ByteBuffer buffer, kotlinx.coroutines.DisposableHandle disposableHandle) {
            this(io.ktor.util.NIOKt.moveToByteArray(buffer), disposableHandle);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableHandle, "disposableHandle");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Pong(java.nio.ByteBuffer buffer) {
            this(io.ktor.util.NIOKt.moveToByteArray(buffer), io.ktor.websocket.NonDisposableHandle.INSTANCE);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        }
    }

    /* compiled from: Frame.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/websocket/Frame$Ping;", "Lio/ktor/websocket/Frame;", "", "data", "<init>", "([B)V", "Lkotlinx/io/Source;", "packet", "(Lkotlinx/io/Source;)V", "Ljava/nio/ByteBuffer;", "buffer", "(Ljava/nio/ByteBuffer;)V", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Ping extends io.ktor.websocket.Frame {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ping(byte[] data) {
            super(true, io.ktor.websocket.FrameType.PING, data, io.ktor.websocket.NonDisposableHandle.INSTANCE, false, false, false, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ping(kotlinx.io.Source packet) {
            this(kotlinx.io.SourcesKt.readByteArray(packet));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packet, "packet");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Ping(java.nio.ByteBuffer buffer) {
            this(io.ktor.util.NIOKt.moveToByteArray(buffer));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        }
    }

    public java.lang.String toString() {
        return "Frame " + this.frameType + " (fin=" + this.fin + ", buffer len = " + this.data.length + ')';
    }

    public final io.ktor.websocket.Frame copy() {
        io.ktor.websocket.Frame.Companion companion = INSTANCE;
        boolean z = this.fin;
        io.ktor.websocket.FrameType frameType = this.frameType;
        byte[] bArr = this.data;
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return companion.byType(z, frameType, copyOf, this.rsv1, this.rsv2, this.rsv3);
    }

    /* compiled from: Frame.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/websocket/Frame$Companion;", "", "<init>", "()V", "", "fin", "Lio/ktor/websocket/FrameType;", "frameType", "", "data", "rsv1", "rsv2", "rsv3", "Lio/ktor/websocket/Frame;", "byType", "(ZLio/ktor/websocket/FrameType;[BZZZ)Lio/ktor/websocket/Frame;", "Empty", "[B", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: Frame.kt */
        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[io.ktor.websocket.FrameType.values().length];
                try {
                    iArr[io.ktor.websocket.FrameType.BINARY.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[io.ktor.websocket.FrameType.TEXT.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[io.ktor.websocket.FrameType.CLOSE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[io.ktor.websocket.FrameType.PING.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[io.ktor.websocket.FrameType.PONG.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final io.ktor.websocket.Frame byType(boolean fin, io.ktor.websocket.FrameType frameType, byte[] data, boolean rsv1, boolean rsv2, boolean rsv3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameType, "frameType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            int i = io.ktor.websocket.Frame.Companion.WhenMappings.$EnumSwitchMapping$0[frameType.ordinal()];
            if (i == 1) {
                return new io.ktor.websocket.Frame.Binary(fin, data, rsv1, rsv2, rsv3);
            }
            if (i == 2) {
                return new io.ktor.websocket.Frame.Text(fin, data, rsv1, rsv2, rsv3);
            }
            if (i == 3) {
                return new io.ktor.websocket.Frame.Close(data);
            }
            if (i == 4) {
                return new io.ktor.websocket.Frame.Ping(data);
            }
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new io.ktor.websocket.Frame.Pong(data, io.ktor.websocket.NonDisposableHandle.INSTANCE);
        }
    }
}
