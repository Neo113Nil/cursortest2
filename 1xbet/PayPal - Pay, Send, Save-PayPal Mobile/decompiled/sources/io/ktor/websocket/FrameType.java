package io.ktor.websocket;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lio/ktor/websocket/FrameType;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;IZI)V", "controlFrame", "Z", "getControlFrame", "()Z", "opcode", com.visa.cbp.getEncExpo.warmup, "getOpcode", "()I", "Companion", "TEXT", "BINARY", com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, "PING", "PONG"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FrameType {
    public static final io.ktor.websocket.FrameType BINARY;
    public static final io.ktor.websocket.FrameType CLOSE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.websocket.FrameType.Companion INSTANCE;
    public static final io.ktor.websocket.FrameType PING;
    public static final io.ktor.websocket.FrameType PONG;
    public static final io.ktor.websocket.FrameType TEXT;
    private static final int getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ io.ktor.websocket.FrameType[] getHighSpeedVideoFpsRanges;
    private static final io.ktor.websocket.FrameType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final boolean controlFrame;
    private final int opcode;

    private FrameType(java.lang.String str, int i, boolean z, int i2) {
        this.controlFrame = z;
        this.opcode = i2;
    }

    public final boolean getControlFrame() {
        return this.controlFrame;
    }

    public final int getOpcode() {
        return this.opcode;
    }

    static {
        java.lang.Object next;
        io.ktor.websocket.FrameType frameType = new io.ktor.websocket.FrameType("TEXT", 0, false, 1);
        TEXT = frameType;
        io.ktor.websocket.FrameType frameType2 = new io.ktor.websocket.FrameType("BINARY", 1, false, 2);
        BINARY = frameType2;
        io.ktor.websocket.FrameType frameType3 = new io.ktor.websocket.FrameType(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, 2, true, 8);
        CLOSE = frameType3;
        io.ktor.websocket.FrameType frameType4 = new io.ktor.websocket.FrameType("PING", 3, true, 9);
        PING = frameType4;
        io.ktor.websocket.FrameType frameType5 = new io.ktor.websocket.FrameType("PONG", 4, true, 10);
        PONG = frameType5;
        io.ktor.websocket.FrameType[] frameTypeArr = {frameType, frameType2, frameType3, frameType4, frameType5};
        getHighSpeedVideoFpsRanges = frameTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(frameTypeArr);
        INSTANCE = new io.ktor.websocket.FrameType.Companion(null);
        java.util.Iterator<E> it = getEntries().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i = ((io.ktor.websocket.FrameType) next).opcode;
                do {
                    java.lang.Object next2 = it.next();
                    int i2 = ((io.ktor.websocket.FrameType) next2).opcode;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(next);
        int i3 = ((io.ktor.websocket.FrameType) next).opcode;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        int i4 = i3 + 1;
        io.ktor.websocket.FrameType[] frameTypeArr2 = new io.ktor.websocket.FrameType[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            java.util.Iterator<E> it2 = getEntries().iterator();
            java.lang.Object obj = null;
            boolean z = false;
            while (true) {
                if (it2.hasNext()) {
                    java.lang.Object next3 = it2.next();
                    if (((io.ktor.websocket.FrameType) next3).opcode == i5) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj = next3;
                    }
                } else if (z) {
                }
            }
            obj = null;
            frameTypeArr2[i5] = obj;
        }
        getHighSpeedVideoFpsRangesFor = frameTypeArr2;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r"}, d2 = {"Lio/ktor/websocket/FrameType$Companion;", "", "<init>", "()V", "", "opcode", "Lio/ktor/websocket/FrameType;", "get", "(I)Lio/ktor/websocket/FrameType;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "", "[Lio/ktor/websocket/FrameType;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final io.ktor.websocket.FrameType get(int opcode) {
            if (opcode < 0 || opcode > io.ktor.websocket.FrameType.getHighResolutionOutputSizeshNQ4ISI) {
                return null;
            }
            return io.ktor.websocket.FrameType.getHighSpeedVideoFpsRangesFor[opcode];
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static io.ktor.websocket.FrameType valueOf(java.lang.String str) {
        return (io.ktor.websocket.FrameType) java.lang.Enum.valueOf(io.ktor.websocket.FrameType.class, str);
    }

    public static io.ktor.websocket.FrameType[] values() {
        return (io.ktor.websocket.FrameType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.enums.EnumEntries<io.ktor.websocket.FrameType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
