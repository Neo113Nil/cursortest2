package io.ktor.websocket;

/* compiled from: FrameParser.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R$\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R$\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R$\u0010 \u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R$\u0010(\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R(\u0010,\u001a\u0004\u0018\u00010\"2\b\u0010\u0015\u001a\u0004\u0018\u00010\"8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b4\u0010\u0019¨\u00067"}, d2 = {"Lio/ktor/websocket/FrameParser;", "", "<init>", "()V", "", "bodyComplete", "Ljava/nio/ByteBuffer;", "bb", "frame", "(Ljava/nio/ByteBuffer;)V", "", "handleStep", "(Ljava/nio/ByteBuffer;)Z", "parseHeader1", "parseLength", "parseMaskKey", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/ktor/websocket/FrameParser$State;", "kotlin.jvm.PlatformType", "state", "Ljava/util/concurrent/atomic/AtomicReference;", "value", "fin", "Z", "getFin", "()Z", "rsv1", "getRsv1", "rsv2", "getRsv2", "rsv3", "getRsv3", "mask", "getMask", "", "opcode", "I", "lastOpcode", "lengthLength", "", "length", "J", "getLength", "()J", "maskKey", "Ljava/lang/Integer;", "getMaskKey", "()Ljava/lang/Integer;", "Lio/ktor/websocket/FrameType;", "getFrameType", "()Lio/ktor/websocket/FrameType;", "frameType", "getBodyReady", "bodyReady", "State", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FrameParser {
    private boolean fin;
    private int lastOpcode;
    private long length;
    private int lengthLength;
    private boolean mask;
    private java.lang.Integer maskKey;
    private int opcode;
    private boolean rsv1;
    private boolean rsv2;
    private boolean rsv3;
    private final java.util.concurrent.atomic.AtomicReference<io.ktor.websocket.FrameParser.State> state = new java.util.concurrent.atomic.AtomicReference<>(io.ktor.websocket.FrameParser.State.HEADER0);

    /* compiled from: FrameParser.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.ktor.websocket.FrameParser.State.values().length];
            try {
                iArr[io.ktor.websocket.FrameParser.State.HEADER0.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[io.ktor.websocket.FrameParser.State.LENGTH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[io.ktor.websocket.FrameParser.State.MASK_KEY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[io.ktor.websocket.FrameParser.State.BODY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean getFin() {
        return this.fin;
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

    public final boolean getMask() {
        return this.mask;
    }

    public final long getLength() {
        return this.length;
    }

    public final java.lang.Integer getMaskKey() {
        return this.maskKey;
    }

    public final io.ktor.websocket.FrameType getFrameType() {
        io.ktor.websocket.FrameType frameType = io.ktor.websocket.FrameType.INSTANCE.get(this.opcode);
        if (frameType != null) {
            return frameType;
        }
        throw new io.ktor.websocket.ProtocolViolationException("Unsupported opcode " + java.lang.Integer.toHexString(this.opcode));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FrameParser.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/ktor/websocket/FrameParser$State;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER0", "LENGTH", "MASK_KEY", "BODY", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ io.ktor.websocket.FrameParser.State[] $VALUES;
        public static final io.ktor.websocket.FrameParser.State HEADER0 = new io.ktor.websocket.FrameParser.State("HEADER0", 0);
        public static final io.ktor.websocket.FrameParser.State LENGTH = new io.ktor.websocket.FrameParser.State("LENGTH", 1);
        public static final io.ktor.websocket.FrameParser.State MASK_KEY = new io.ktor.websocket.FrameParser.State("MASK_KEY", 2);
        public static final io.ktor.websocket.FrameParser.State BODY = new io.ktor.websocket.FrameParser.State("BODY", 3);

        private static final /* synthetic */ io.ktor.websocket.FrameParser.State[] $values() {
            return new io.ktor.websocket.FrameParser.State[]{HEADER0, LENGTH, MASK_KEY, BODY};
        }

        public static kotlin.enums.EnumEntries<io.ktor.websocket.FrameParser.State> getEntries() {
            return $ENTRIES;
        }

        private State(java.lang.String str, int i) {
        }

        static {
            io.ktor.websocket.FrameParser.State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        public static io.ktor.websocket.FrameParser.State valueOf(java.lang.String str) {
            return (io.ktor.websocket.FrameParser.State) java.lang.Enum.valueOf(io.ktor.websocket.FrameParser.State.class, str);
        }

        public static io.ktor.websocket.FrameParser.State[] values() {
            return (io.ktor.websocket.FrameParser.State[]) $VALUES.clone();
        }
    }

    public final boolean getBodyReady() {
        return this.state.get() == io.ktor.websocket.FrameParser.State.BODY;
    }

    public final void bodyComplete() {
        if (!androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.state, io.ktor.websocket.FrameParser.State.BODY, io.ktor.websocket.FrameParser.State.HEADER0)) {
            throw new java.lang.IllegalStateException("It should be state BODY but it is " + this.state.get());
        }
        this.opcode = 0;
        this.length = 0L;
        this.lengthLength = 0;
        this.maskKey = null;
    }

    public final void frame(java.nio.ByteBuffer bb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bb, "bb");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(bb.order(), java.nio.ByteOrder.BIG_ENDIAN)) {
            throw new java.lang.IllegalArgumentException(("Buffer order should be BIG_ENDIAN but it is " + bb.order()).toString());
        }
        while (handleStep(bb)) {
        }
    }

    private final boolean handleStep(java.nio.ByteBuffer bb) {
        io.ktor.websocket.FrameParser.State state = this.state.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(state);
        int i = io.ktor.websocket.FrameParser.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            return parseHeader1(bb);
        }
        if (i == 2) {
            return parseLength(bb);
        }
        if (i == 3) {
            return parseMaskKey(bb);
        }
        if (i == 4) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private final boolean parseHeader1(java.nio.ByteBuffer bb) {
        int i = 0;
        if (bb.remaining() < 2) {
            return false;
        }
        byte b = bb.get();
        byte b2 = bb.get();
        this.fin = (b & 128) != 0;
        this.rsv1 = (b & com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO) != 0;
        this.rsv2 = (b & 32) != 0;
        this.rsv3 = (b & com.google.common.base.Ascii.DLE) != 0;
        int i2 = b & com.google.common.base.Ascii.SI;
        this.opcode = i2;
        if (i2 == 0 && this.lastOpcode == 0) {
            throw new io.ktor.websocket.ProtocolViolationException("Can't continue finished frames");
        }
        if (i2 == 0) {
            this.opcode = this.lastOpcode;
        } else if (this.lastOpcode != 0 && !getFrameType().getControlFrame()) {
            throw new io.ktor.websocket.ProtocolViolationException("Can't start new data frame before finishing previous one");
        }
        if (!getFrameType().getControlFrame()) {
            this.lastOpcode = this.fin ? 0 : this.opcode;
        } else if (!this.fin) {
            throw new io.ktor.websocket.ProtocolViolationException("control frames can't be fragmented");
        }
        this.mask = (b2 & 128) != 0;
        int i3 = b2 & Byte.MAX_VALUE;
        if (getFrameType().getControlFrame() && i3 > 125) {
            throw new io.ktor.websocket.ProtocolViolationException("control frames can't be larger than 125 bytes");
        }
        if (i3 == 126) {
            i = 2;
        } else if (i3 == 127) {
            i = 8;
        }
        this.lengthLength = i;
        this.length = i == 0 ? i3 : 0L;
        if (i > 0) {
            this.state.set(io.ktor.websocket.FrameParser.State.LENGTH);
        } else if (this.mask) {
            this.state.set(io.ktor.websocket.FrameParser.State.MASK_KEY);
        } else {
            this.state.set(io.ktor.websocket.FrameParser.State.BODY);
        }
        return true;
    }

    private final boolean parseLength(java.nio.ByteBuffer bb) {
        long j;
        int remaining = bb.remaining();
        int i = this.lengthLength;
        if (remaining < i) {
            return false;
        }
        if (i == 2) {
            j = bb.getShort() & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX;
        } else if (i == 8) {
            j = bb.getLong();
        } else {
            throw new java.lang.IllegalStateException();
        }
        this.length = j;
        this.state.set(this.mask ? io.ktor.websocket.FrameParser.State.MASK_KEY : io.ktor.websocket.FrameParser.State.BODY);
        return true;
    }

    private final boolean parseMaskKey(java.nio.ByteBuffer bb) {
        if (bb.remaining() < 4) {
            return false;
        }
        this.maskKey = java.lang.Integer.valueOf(bb.getInt());
        this.state.set(io.ktor.websocket.FrameParser.State.BODY);
        return true;
    }
}
