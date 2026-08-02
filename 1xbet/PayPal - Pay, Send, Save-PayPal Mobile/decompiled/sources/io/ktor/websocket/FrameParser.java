package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u000e\u001a\f\u0012\b\u0012\u0006*\u00020\u000b0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R$\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R$\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R$\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0016\u0010!\u001a\u00020\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR$\u0010#\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\"8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R(\u0010'\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0010\u001a\u0004\u0018\u00010\u001d8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0011\u0010.\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b/\u0010\u0014"}, d2 = {"Lio/ktor/websocket/FrameParser;", "", "<init>", "()V", "", "bodyComplete", "Ljava/nio/ByteBuffer;", "bb", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "(Ljava/nio/ByteBuffer;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/ktor/websocket/FrameParser$State;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRanges", "", "p0", "fin", "Z", "getFin", "()Z", "rsv1", "getRsv1", "rsv2", "getRsv2", "rsv3", "getRsv3", com.daon.sdk.face.license.License.FEATURE_MASK, "getMask", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "", "length", "J", "getLength", "()J", "maskKey", "Ljava/lang/Integer;", "getMaskKey", "()Ljava/lang/Integer;", "Lio/ktor/websocket/FrameType;", "getFrameType", "()Lio/ktor/websocket/FrameType;", "frameType", "getBodyReady", "bodyReady", "State"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FrameParser {
    private boolean fin;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<io.ktor.websocket.FrameParser.State> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(io.ktor.websocket.FrameParser.State.HEADER0);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;
    private int getHighSpeedVideoSizes;
    private long length;
    private boolean mask;
    private java.lang.Integer maskKey;
    private boolean rsv1;
    private boolean rsv2;
    private boolean rsv3;

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
        io.ktor.websocket.FrameType frameType = io.ktor.websocket.FrameType.INSTANCE.get(this.Camera2StreamConfigurationMap);
        if (frameType != null) {
            return frameType;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported opcode ");
        sb.append(java.lang.Integer.toHexString(this.Camera2StreamConfigurationMap));
        throw new io.ktor.websocket.ProtocolViolationException(sb.toString());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lio/ktor/websocket/FrameParser$State;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER0", "LENGTH", "MASK_KEY", "BODY"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        public static final io.ktor.websocket.FrameParser.State BODY;
        public static final io.ktor.websocket.FrameParser.State HEADER0;
        public static final io.ktor.websocket.FrameParser.State LENGTH;
        public static final io.ktor.websocket.FrameParser.State MASK_KEY;
        private static final /* synthetic */ io.ktor.websocket.FrameParser.State[] getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

        private State(java.lang.String str, int i) {
        }

        static {
            io.ktor.websocket.FrameParser.State state = new io.ktor.websocket.FrameParser.State("HEADER0", 0);
            HEADER0 = state;
            io.ktor.websocket.FrameParser.State state2 = new io.ktor.websocket.FrameParser.State("LENGTH", 1);
            LENGTH = state2;
            io.ktor.websocket.FrameParser.State state3 = new io.ktor.websocket.FrameParser.State("MASK_KEY", 2);
            MASK_KEY = state3;
            io.ktor.websocket.FrameParser.State state4 = new io.ktor.websocket.FrameParser.State("BODY", 3);
            BODY = state4;
            io.ktor.websocket.FrameParser.State[] stateArr = {state, state2, state3, state4};
            getHighSpeedVideoFpsRanges = stateArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(stateArr);
        }

        public static io.ktor.websocket.FrameParser.State valueOf(java.lang.String str) {
            return (io.ktor.websocket.FrameParser.State) java.lang.Enum.valueOf(io.ktor.websocket.FrameParser.State.class, str);
        }

        public static io.ktor.websocket.FrameParser.State[] values() {
            return (io.ktor.websocket.FrameParser.State[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static kotlin.enums.EnumEntries<io.ktor.websocket.FrameParser.State> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }

    public final boolean getBodyReady() {
        return this.getHighSpeedVideoFpsRanges.get() == io.ktor.websocket.FrameParser.State.BODY;
    }

    public final void bodyComplete() {
        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, io.ktor.websocket.FrameParser.State.BODY, io.ktor.websocket.FrameParser.State.HEADER0)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("It should be state BODY but it is ");
            sb.append(this.getHighSpeedVideoFpsRanges.get());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.Camera2StreamConfigurationMap = 0;
        this.length = 0L;
        this.getHighSpeedVideoSizes = 0;
        this.maskKey = null;
    }

    public final void frame(java.nio.ByteBuffer bb) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bb, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(bb.order(), java.nio.ByteOrder.BIG_ENDIAN)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Buffer order should be BIG_ENDIAN but it is ");
            sb.append(bb.order());
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        while (true) {
            io.ktor.websocket.FrameParser.State state = this.getHighSpeedVideoFpsRanges.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(state);
            int i = io.ktor.websocket.FrameParser.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    int remaining = bb.remaining();
                    int i3 = this.getHighSpeedVideoSizes;
                    if (remaining < i3) {
                        return;
                    }
                    if (i3 == 2) {
                        j = bb.getShort() & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX;
                    } else if (i3 == 8) {
                        j = bb.getLong();
                    } else {
                        throw new java.lang.IllegalStateException();
                    }
                    this.length = j;
                    this.getHighSpeedVideoFpsRanges.set(this.mask ? io.ktor.websocket.FrameParser.State.MASK_KEY : io.ktor.websocket.FrameParser.State.BODY);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    if (bb.remaining() < 4) {
                        return;
                    }
                    this.maskKey = java.lang.Integer.valueOf(bb.getInt());
                    this.getHighSpeedVideoFpsRanges.set(io.ktor.websocket.FrameParser.State.BODY);
                }
            } else {
                if (bb.remaining() < 2) {
                    return;
                }
                byte b = bb.get();
                byte b2 = bb.get();
                this.fin = (b & 128) != 0;
                this.rsv1 = (b & 64) != 0;
                this.rsv2 = (b & 32) != 0;
                this.rsv3 = (b & 16) != 0;
                int i4 = b & com.google.common.base.Ascii.SI;
                this.Camera2StreamConfigurationMap = i4;
                if (i4 == 0 && this.getHighSpeedVideoFpsRangesFor == 0) {
                    throw new io.ktor.websocket.ProtocolViolationException("Can't continue finished frames");
                }
                if (i4 == 0) {
                    this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor;
                } else if (this.getHighSpeedVideoFpsRangesFor != 0 && !getFrameType().getControlFrame()) {
                    throw new io.ktor.websocket.ProtocolViolationException("Can't start new data frame before finishing previous one");
                }
                if (!getFrameType().getControlFrame()) {
                    this.getHighSpeedVideoFpsRangesFor = this.fin ? 0 : this.Camera2StreamConfigurationMap;
                } else if (!this.fin) {
                    throw new io.ktor.websocket.ProtocolViolationException("control frames can't be fragmented");
                }
                this.mask = (b2 & 128) != 0;
                int i5 = b2 & Byte.MAX_VALUE;
                if (getFrameType().getControlFrame() && i5 > 125) {
                    throw new io.ktor.websocket.ProtocolViolationException("control frames can't be larger than 125 bytes");
                }
                if (i5 == 126) {
                    i2 = 2;
                } else if (i5 != 127) {
                    i2 = 0;
                }
                this.getHighSpeedVideoSizes = i2;
                this.length = i2 == 0 ? i5 : 0L;
                if (i2 > 0) {
                    this.getHighSpeedVideoFpsRanges.set(io.ktor.websocket.FrameParser.State.LENGTH);
                } else if (this.mask) {
                    this.getHighSpeedVideoFpsRanges.set(io.ktor.websocket.FrameParser.State.MASK_KEY);
                } else {
                    this.getHighSpeedVideoFpsRanges.set(io.ktor.websocket.FrameParser.State.BODY);
                }
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
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
}
